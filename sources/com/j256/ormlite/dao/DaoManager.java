package com.j256.ormlite.dao;

import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DaoManager {
    private static Map<ClassConnectionSource, Dao<?, ?>> classMap;
    private static Map<Class<?>, DatabaseTableConfig<?>> configMap;
    private static Logger logger = LoggerFactory.getLogger(DaoManager.class);
    private static Map<TableConfigConnectionSource, Dao<?, ?>> tableConfigMap;

    private static class ClassConnectionSource {
        Class<?> clazz;
        ConnectionSource connectionSource;

        public ClassConnectionSource(ConnectionSource connectionSource, Class<?> cls) {
            this.connectionSource = connectionSource;
            this.clazz = cls;
        }

        public int hashCode() {
            return ((this.clazz.hashCode() + 31) * 31) + this.connectionSource.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ClassConnectionSource classConnectionSource = (ClassConnectionSource) obj;
                    if (this.clazz.equals(classConnectionSource.clazz) && this.connectionSource.equals(classConnectionSource.connectionSource) != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    private static class TableConfigConnectionSource {
        ConnectionSource connectionSource;
        DatabaseTableConfig<?> tableConfig;

        public TableConfigConnectionSource(ConnectionSource connectionSource, DatabaseTableConfig<?> databaseTableConfig) {
            this.connectionSource = connectionSource;
            this.tableConfig = databaseTableConfig;
        }

        public int hashCode() {
            return ((this.tableConfig.hashCode() + 31) * 31) + this.connectionSource.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    TableConfigConnectionSource tableConfigConnectionSource = (TableConfigConnectionSource) obj;
                    if (this.tableConfig.equals(tableConfigConnectionSource.tableConfig) && this.connectionSource.equals(tableConfigConnectionSource.connectionSource) != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    public static synchronized <D extends Dao<T, ?>, T> D createDao(ConnectionSource connectionSource, Class<T> cls) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                D lookupDao = lookupDao(new ClassConnectionSource(connectionSource, cls));
                if (lookupDao != null) {
                    return lookupDao;
                }
                Dao dao = (Dao) createDaoFromConfig(connectionSource, cls);
                if (dao != null) {
                    return dao;
                }
                D d;
                DatabaseTable databaseTable = (DatabaseTable) cls.getAnnotation(DatabaseTable.class);
                if (!(databaseTable == null || databaseTable.daoClass() == Void.class)) {
                    if (databaseTable.daoClass() != BaseDaoImpl.class) {
                        Class daoClass = databaseTable.daoClass();
                        Object[] objArr = new Object[]{connectionSource, cls};
                        Constructor findConstructor = findConstructor(daoClass, objArr);
                        if (findConstructor == null) {
                            objArr = new Object[]{connectionSource};
                            findConstructor = findConstructor(daoClass, objArr);
                            if (findConstructor == null) {
                                cls = new StringBuilder();
                                cls.append("Could not find public constructor with ConnectionSource and optional Class parameters ");
                                cls.append(daoClass);
                                cls.append(".  Missing static on class?");
                                throw new SQLException(cls.toString());
                            }
                        }
                        try {
                            d = (Dao) findConstructor.newInstance(objArr);
                            logger.debug("created dao for class {} from constructor", (Object) cls);
                            registerDao(connectionSource, d);
                            return d;
                        } catch (ConnectionSource connectionSource2) {
                            cls = new StringBuilder();
                            cls.append("Could not call the constructor in class ");
                            cls.append(daoClass);
                            throw SqlExceptionUtil.create(cls.toString(), connectionSource2);
                        }
                    }
                }
                DatabaseTableConfig extractDatabaseTableConfig = connectionSource2.getDatabaseType().extractDatabaseTableConfig(connectionSource2, cls);
                if (extractDatabaseTableConfig == null) {
                    lookupDao = BaseDaoImpl.createDao(connectionSource2, (Class) cls);
                } else {
                    lookupDao = BaseDaoImpl.createDao(connectionSource2, extractDatabaseTableConfig);
                }
                d = lookupDao;
                logger.debug("created dao for class {} with reflection", (Object) cls);
                registerDao(connectionSource2, d);
                return d;
            }
            throw new IllegalArgumentException("connectionSource argument cannot be null");
        }
    }

    public static synchronized <D extends Dao<T, ?>, T> D lookupDao(ConnectionSource connectionSource, Class<T> cls) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                connectionSource = lookupDao(new ClassConnectionSource(connectionSource, cls));
            } else {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
        }
        return connectionSource;
    }

    public static synchronized <D extends Dao<T, ?>, T> D createDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                connectionSource = doCreateDao(connectionSource, databaseTableConfig);
            } else {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
        }
        return connectionSource;
    }

    public static synchronized <D extends Dao<T, ?>, T> D lookupDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                connectionSource = lookupDao(new TableConfigConnectionSource(connectionSource, databaseTableConfig));
                if (connectionSource == null) {
                    return null;
                }
                return connectionSource;
            }
            throw new IllegalArgumentException("connectionSource argument cannot be null");
        }
    }

    public static synchronized void registerDao(ConnectionSource connectionSource, Dao<?, ?> dao) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                addDaoToClassMap(new ClassConnectionSource(connectionSource, dao.getDataClass()), dao);
            } else {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
        }
    }

    public static synchronized void unregisterDao(ConnectionSource connectionSource, Dao<?, ?> dao) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                removeDaoToClassMap(new ClassConnectionSource(connectionSource, dao.getDataClass()), dao);
            } else {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
        }
    }

    public static synchronized void registerDaoWithTableConfig(ConnectionSource connectionSource, Dao<?, ?> dao) {
        synchronized (DaoManager.class) {
            if (connectionSource != null) {
                if (dao instanceof BaseDaoImpl) {
                    DatabaseTableConfig tableConfig = ((BaseDaoImpl) dao).getTableConfig();
                    if (tableConfig != null) {
                        addDaoToTableMap(new TableConfigConnectionSource(connectionSource, tableConfig), dao);
                        return;
                    }
                }
                addDaoToClassMap(new ClassConnectionSource(connectionSource, dao.getDataClass()), dao);
                return;
            }
            throw new IllegalArgumentException("connectionSource argument cannot be null");
        }
    }

    public static synchronized void clearCache() {
        synchronized (DaoManager.class) {
            if (configMap != null) {
                configMap.clear();
                configMap = null;
            }
            clearDaoCache();
        }
    }

    public static synchronized void clearDaoCache() {
        synchronized (DaoManager.class) {
            if (classMap != null) {
                classMap.clear();
                classMap = null;
            }
            if (tableConfigMap != null) {
                tableConfigMap.clear();
                tableConfigMap = null;
            }
        }
    }

    public static synchronized void addCachedDatabaseConfigs(Collection<DatabaseTableConfig<?>> collection) {
        synchronized (DaoManager.class) {
            Map hashMap;
            if (configMap == null) {
                hashMap = new HashMap();
            } else {
                hashMap = new HashMap(configMap);
            }
            for (DatabaseTableConfig databaseTableConfig : collection) {
                hashMap.put(databaseTableConfig.getDataClass(), databaseTableConfig);
                logger.info("Loaded configuration for {}", databaseTableConfig.getDataClass());
            }
            configMap = hashMap;
        }
    }

    private static void addDaoToClassMap(ClassConnectionSource classConnectionSource, Dao<?, ?> dao) {
        if (classMap == null) {
            classMap = new HashMap();
        }
        classMap.put(classConnectionSource, dao);
    }

    private static void removeDaoToClassMap(ClassConnectionSource classConnectionSource, Dao<?, ?> dao) {
        if (classMap != null) {
            classMap.remove(classConnectionSource);
        }
    }

    private static void addDaoToTableMap(TableConfigConnectionSource tableConfigConnectionSource, Dao<?, ?> dao) {
        if (tableConfigMap == null) {
            tableConfigMap = new HashMap();
        }
        tableConfigMap.put(tableConfigConnectionSource, dao);
    }

    private static <T> Dao<?, ?> lookupDao(ClassConnectionSource classConnectionSource) {
        if (classMap == null) {
            classMap = new HashMap();
        }
        Dao dao = (Dao) classMap.get(classConnectionSource);
        return dao == null ? null : dao;
    }

    private static <T> Dao<?, ?> lookupDao(TableConfigConnectionSource tableConfigConnectionSource) {
        if (tableConfigMap == null) {
            tableConfigMap = new HashMap();
        }
        Dao dao = (Dao) tableConfigMap.get(tableConfigConnectionSource);
        return dao == null ? null : dao;
    }

    private static Constructor<?> findConstructor(Class<?> cls, Object[] objArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == objArr.length) {
                Object obj;
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (!parameterTypes[i].isAssignableFrom(objArr[i].getClass())) {
                        obj = null;
                        break;
                    }
                }
                obj = 1;
                if (obj != null) {
                    return constructor;
                }
            }
        }
        return null;
    }

    private static <D, T> D createDaoFromConfig(ConnectionSource connectionSource, Class<T> cls) {
        if (configMap == null) {
            return null;
        }
        DatabaseTableConfig databaseTableConfig = (DatabaseTableConfig) configMap.get(cls);
        if (databaseTableConfig == null) {
            return null;
        }
        return doCreateDao(connectionSource, databaseTableConfig);
    }

    private static <D extends Dao<T, ?>, T> D doCreateDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        TableConfigConnectionSource tableConfigConnectionSource = new TableConfigConnectionSource(connectionSource, databaseTableConfig);
        D lookupDao = lookupDao(tableConfigConnectionSource);
        if (lookupDao != null) {
            return lookupDao;
        }
        Object dataClass = databaseTableConfig.getDataClass();
        ClassConnectionSource classConnectionSource = new ClassConnectionSource(connectionSource, dataClass);
        D lookupDao2 = lookupDao(classConnectionSource);
        if (lookupDao2 != null) {
            addDaoToTableMap(tableConfigConnectionSource, lookupDao2);
            return lookupDao2;
        }
        DatabaseTable databaseTable = (DatabaseTable) databaseTableConfig.getDataClass().getAnnotation(DatabaseTable.class);
        if (!(databaseTable == null || databaseTable.daoClass() == Void.class)) {
            if (databaseTable.daoClass() != BaseDaoImpl.class) {
                Class daoClass = databaseTable.daoClass();
                Object[] objArr = new Object[]{connectionSource, databaseTableConfig};
                connectionSource = findConstructor(daoClass, objArr);
                if (connectionSource != null) {
                    try {
                        connectionSource = (Dao) connectionSource.newInstance(objArr);
                        addDaoToTableMap(tableConfigConnectionSource, connectionSource);
                        logger.debug("created dao for class {} from table config", dataClass);
                        if (lookupDao(classConnectionSource) == null) {
                            addDaoToClassMap(classConnectionSource, connectionSource);
                        }
                        return connectionSource;
                    } catch (ConnectionSource connectionSource2) {
                        databaseTableConfig = new StringBuilder();
                        databaseTableConfig.append("Could not call the constructor in class ");
                        databaseTableConfig.append(daoClass);
                        throw SqlExceptionUtil.create(databaseTableConfig.toString(), connectionSource2);
                    }
                }
                databaseTableConfig = new StringBuilder();
                databaseTableConfig.append("Could not find public constructor with ConnectionSource, DatabaseTableConfig parameters in class ");
                databaseTableConfig.append(daoClass);
                throw new SQLException(databaseTableConfig.toString());
            }
        }
        connectionSource2 = BaseDaoImpl.createDao(connectionSource2, (DatabaseTableConfig) databaseTableConfig);
        addDaoToTableMap(tableConfigConnectionSource, connectionSource2);
        logger.debug("created dao for class {} from table config", dataClass);
        if (lookupDao(classConnectionSource) == null) {
            addDaoToClassMap(classConnectionSource, connectionSource2);
        }
        return connectionSource2;
    }
}
