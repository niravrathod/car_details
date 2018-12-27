package com.j256.ormlite.table;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TableUtils {
    private static Logger logger = LoggerFactory.getLogger(TableUtils.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];

    private TableUtils() {
    }

    public static <T> int createTable(ConnectionSource connectionSource, Class<T> cls) {
        return createTable(connectionSource, (Class) cls, false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, Class<T> cls) {
        return createTable(connectionSource, (Class) cls, true);
    }

    public static <T> int createTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return createTable(connectionSource, (DatabaseTableConfig) databaseTableConfig, false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return createTable(connectionSource, (DatabaseTableConfig) databaseTableConfig, true);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, Class<T> cls) {
        Dao createDao = DaoManager.createDao(connectionSource, (Class) cls);
        if (createDao instanceof BaseDaoImpl) {
            return addCreateTableStatements(connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), false);
        }
        return addCreateTableStatements(connectionSource, new TableInfo(connectionSource, null, (Class) cls), false);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        Dao createDao = DaoManager.createDao(connectionSource, (DatabaseTableConfig) databaseTableConfig);
        if (createDao instanceof BaseDaoImpl) {
            return addCreateTableStatements(connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), false);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return addCreateTableStatements(connectionSource, new TableInfo(connectionSource.getDatabaseType(), null, (DatabaseTableConfig) databaseTableConfig), false);
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, Class<T> cls, boolean z) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        Dao createDao = DaoManager.createDao(connectionSource, (Class) cls);
        if (createDao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), z);
        }
        return doDropTable(databaseType, connectionSource, new TableInfo(connectionSource, null, (Class) cls), z);
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig, boolean z) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        Dao createDao = DaoManager.createDao(connectionSource, (DatabaseTableConfig) databaseTableConfig);
        if (createDao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), z);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return doDropTable(databaseType, connectionSource, new TableInfo(databaseType, null, (DatabaseTableConfig) databaseTableConfig), z);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, Class<T> cls) {
        String extractTableName = DatabaseTableConfig.extractTableName(cls);
        if (connectionSource.getDatabaseType().isEntityNamesMustBeUpCase()) {
            extractTableName = extractTableName.toUpperCase();
        }
        return clearTable(connectionSource, extractTableName);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return clearTable(connectionSource, databaseTableConfig.getTableName());
    }

    private static <T, ID> int createTable(ConnectionSource connectionSource, Class<T> cls, boolean z) {
        Dao createDao = DaoManager.createDao(connectionSource, (Class) cls);
        if (createDao instanceof BaseDaoImpl) {
            return doCreateTable(connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), z);
        }
        return doCreateTable(connectionSource, new TableInfo(connectionSource, null, (Class) cls), z);
    }

    private static <T, ID> int createTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig, boolean z) {
        Dao createDao = DaoManager.createDao(connectionSource, (DatabaseTableConfig) databaseTableConfig);
        if (createDao instanceof BaseDaoImpl) {
            return doCreateTable(connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), z);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return doCreateTable(connectionSource, new TableInfo(connectionSource.getDatabaseType(), null, (DatabaseTableConfig) databaseTableConfig), z);
    }

    private static <T> int clearTable(ConnectionSource connectionSource, String str) {
        Throwable th;
        DatabaseType databaseType = connectionSource.getDatabaseType();
        StringBuilder stringBuilder = new StringBuilder(48);
        if (databaseType.isTruncateSupported()) {
            stringBuilder.append("TRUNCATE TABLE ");
        } else {
            stringBuilder.append("DELETE FROM ");
        }
        databaseType.appendEscapedEntityName(stringBuilder, str);
        Object stringBuilder2 = stringBuilder.toString();
        logger.info("clearing table '{}' with '{}", (Object) str, stringBuilder2);
        str = null;
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection();
        try {
            CompiledStatement compileStatement = readWriteConnection.compileStatement(stringBuilder2, StatementType.EXECUTE, noFieldTypes, -1);
            try {
                str = compileStatement.runExecute();
                if (compileStatement != null) {
                    compileStatement.close();
                }
                connectionSource.releaseConnection(readWriteConnection);
                return str;
            } catch (String str2) {
                CompiledStatement compiledStatement = compileStatement;
                th = str2;
                str2 = compiledStatement;
                if (str2 != null) {
                    str2.close();
                }
                connectionSource.releaseConnection(readWriteConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (str2 != null) {
                str2.close();
            }
            connectionSource.releaseConnection(readWriteConnection);
            throw th;
        }
    }

    private static <T, ID> int doDropTable(DatabaseType databaseType, ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) {
        logger.info("dropping table '{}'", tableInfo.getTableName());
        Collection arrayList = new ArrayList();
        addDropIndexStatements(databaseType, tableInfo, arrayList);
        addDropTableStatements(databaseType, tableInfo, arrayList);
        tableInfo = connectionSource.getReadWriteConnection();
        try {
            databaseType = doStatements(tableInfo, "drop", arrayList, z, databaseType.isCreateTableReturnsNegative(), false);
            return databaseType;
        } finally {
            connectionSource.releaseConnection(tableInfo);
        }
    }

    private static <T, ID> void addDropIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list) {
        Set<Object> hashSet = new HashSet();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            String indexName = fieldType.getIndexName();
            if (indexName != null) {
                hashSet.add(indexName);
            }
            String uniqueIndexName = fieldType.getUniqueIndexName();
            if (uniqueIndexName != null) {
                hashSet.add(uniqueIndexName);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(48);
        for (Object obj : hashSet) {
            logger.info("dropping index '{}' for table '{}", obj, tableInfo.getTableName());
            stringBuilder.append("DROP INDEX ");
            databaseType.appendEscapedEntityName(stringBuilder, obj);
            list.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
    }

    private static <T, ID> void addCreateTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, List<String> list2, boolean z) {
        DatabaseType databaseType2 = databaseType;
        TableInfo<T, ID> tableInfo2 = tableInfo;
        List<String> list3 = list;
        boolean z2 = z;
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("CREATE TABLE ");
        if (z2 && databaseType.isCreateIfNotExistsSupported()) {
            stringBuilder.append("IF NOT EXISTS ");
        }
        databaseType2.appendEscapedEntityName(stringBuilder, tableInfo.getTableName());
        stringBuilder.append(" (");
        List<String> arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();
        FieldType[] fieldTypes = tableInfo.getFieldTypes();
        int length = fieldTypes.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            int i2;
            int i3;
            FieldType[] fieldTypeArr;
            FieldType fieldType = fieldTypes[i];
            if (fieldType.isForeignCollection()) {
                i2 = i;
                i3 = length;
                fieldTypeArr = fieldTypes;
            } else {
                Object obj2;
                if (obj != null) {
                    obj2 = null;
                } else {
                    stringBuilder.append(", ");
                    obj2 = obj;
                }
                String columnDefinition = fieldType.getColumnDefinition();
                if (columnDefinition == null) {
                    i2 = i;
                    i3 = length;
                    fieldTypeArr = fieldTypes;
                    databaseType.appendColumnArg(tableInfo.getTableName(), stringBuilder, fieldType, arrayList, arrayList2, arrayList3, list2);
                } else {
                    i2 = i;
                    i3 = length;
                    fieldTypeArr = fieldTypes;
                    databaseType2.appendEscapedEntityName(stringBuilder, fieldType.getColumnName());
                    stringBuilder.append(' ');
                    stringBuilder.append(columnDefinition);
                    stringBuilder.append(' ');
                }
                obj = obj2;
            }
            i = i2 + 1;
            length = i3;
            fieldTypes = fieldTypeArr;
            tableInfo2 = tableInfo;
        }
        DatabaseType databaseType3 = databaseType;
        List list4 = arrayList;
        Collection collection = arrayList2;
        Collection collection2 = arrayList3;
        List<String> list5 = list2;
        databaseType3.addPrimaryKeySql(tableInfo.getFieldTypes(), list4, collection, collection2, list5);
        databaseType3.addUniqueComboSql(tableInfo.getFieldTypes(), list4, collection, collection2, list5);
        for (String str : arrayList) {
            stringBuilder.append(", ");
            stringBuilder.append(str);
        }
        stringBuilder.append(") ");
        databaseType2.appendCreateTableSuffix(stringBuilder);
        list3.addAll(arrayList2);
        list3.add(stringBuilder.toString());
        list3.addAll(arrayList3);
        TableInfo<T, ID> tableInfo3 = tableInfo;
        addCreateIndexStatements(databaseType2, tableInfo3, list3, z2, false);
        addCreateIndexStatements(databaseType2, tableInfo3, list3, z2, true);
    }

    private static <T, ID> void addCreateIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, boolean z, boolean z2) {
        Map hashMap = new HashMap();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            Object uniqueIndexName;
            if (z2) {
                uniqueIndexName = fieldType.getUniqueIndexName();
            } else {
                uniqueIndexName = fieldType.getIndexName();
            }
            if (uniqueIndexName != null) {
                List list2 = (List) hashMap.get(uniqueIndexName);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(uniqueIndexName, list2);
                }
                list2.add(fieldType.getColumnName());
            }
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        for (Entry entry : hashMap.entrySet()) {
            logger.info("creating index '{}' for table '{}", entry.getKey(), tableInfo.getTableName());
            stringBuilder.append("CREATE ");
            if (z2) {
                stringBuilder.append("UNIQUE ");
            }
            stringBuilder.append("INDEX ");
            if (z && databaseType.isCreateIndexIfNotExistsSupported()) {
                stringBuilder.append("IF NOT EXISTS ");
            }
            databaseType.appendEscapedEntityName(stringBuilder, (String) entry.getKey());
            stringBuilder.append(" ON ");
            databaseType.appendEscapedEntityName(stringBuilder, tableInfo.getTableName());
            stringBuilder.append(" ( ");
            Object obj = 1;
            for (String str : (List) entry.getValue()) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(", ");
                }
                databaseType.appendEscapedEntityName(stringBuilder, str);
            }
            stringBuilder.append(" )");
            list.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
    }

    private static <T, ID> void addDropTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list) {
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        for (FieldType dropColumnArg : tableInfo.getFieldTypes()) {
            databaseType.dropColumnArg(dropColumnArg, arrayList, arrayList2);
        }
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("DROP TABLE ");
        databaseType.appendEscapedEntityName(stringBuilder, tableInfo.getTableName());
        stringBuilder.append(' ');
        list.addAll(arrayList);
        list.add(stringBuilder.toString());
        list.addAll(arrayList2);
    }

    private static <T, ID> int doCreateTable(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        logger.info("creating table '{}'", tableInfo.getTableName());
        Collection arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        addCreateTableStatements(databaseType, tableInfo, arrayList, arrayList2, z);
        tableInfo = connectionSource.getReadWriteConnection();
        try {
            z = doStatements(tableInfo, "create", arrayList, false, databaseType.isCreateTableReturnsNegative(), databaseType.isCreateTableReturnsZero()) + doCreateTestQueries(tableInfo, databaseType, arrayList2);
            return z;
        } finally {
            connectionSource.releaseConnection(tableInfo);
        }
    }

    private static int doStatements(DatabaseConnection databaseConnection, String str, Collection<String> collection, boolean z, boolean z2, boolean z3) {
        Object e;
        int i;
        int i2 = 0;
        for (Object obj : collection) {
            int runExecute;
            CompiledStatement compiledStatement = null;
            try {
                CompiledStatement compileStatement = databaseConnection.compileStatement(obj, StatementType.EXECUTE, noFieldTypes, -1);
                try {
                    runExecute = compileStatement.runExecute();
                } catch (SQLException e2) {
                    e = e2;
                    compiledStatement = compileStatement;
                    i = 0;
                    if (z) {
                        try {
                            logger.info("ignoring {} error '{}' for statement: {}", (Object) str, e, obj);
                            if (compiledStatement != null) {
                                compiledStatement.close();
                            }
                            runExecute = i;
                            if (runExecute >= 0) {
                                if (runExecute <= 0) {
                                    continue;
                                } else if (z3) {
                                    str = new StringBuilder();
                                    str.append("SQL statement updated ");
                                    str.append(runExecute);
                                    str.append(" rows, we were expecting == 0: ");
                                    str.append(obj);
                                    throw new SQLException(str.toString());
                                }
                            } else if (!z2) {
                                str = new StringBuilder();
                                str.append("SQL statement ");
                                str.append(obj);
                                str.append(" updated ");
                                str.append(runExecute);
                                str.append(" rows, we were expecting >= 0");
                                throw new SQLException(str.toString());
                            }
                            i2++;
                        } catch (Throwable th) {
                            databaseConnection = th;
                        }
                    } else {
                        databaseConnection = new StringBuilder();
                        databaseConnection.append("SQL statement failed: ");
                        databaseConnection.append(obj);
                        throw SqlExceptionUtil.create(databaseConnection.toString(), e);
                    }
                } catch (Throwable th2) {
                    databaseConnection = th2;
                    compiledStatement = compileStatement;
                }
                try {
                    logger.info("executed {} table statement changed {} rows: {}", (Object) str, Integer.valueOf(runExecute), obj);
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                } catch (SQLException e3) {
                    e = e3;
                    CompiledStatement compiledStatement2 = compileStatement;
                    i = runExecute;
                    compiledStatement = compiledStatement2;
                    if (z) {
                        logger.info("ignoring {} error '{}' for statement: {}", (Object) str, e, obj);
                        if (compiledStatement != null) {
                            compiledStatement.close();
                        }
                        runExecute = i;
                        if (runExecute >= 0) {
                            if (runExecute <= 0) {
                                continue;
                            } else if (z3) {
                                str = new StringBuilder();
                                str.append("SQL statement updated ");
                                str.append(runExecute);
                                str.append(" rows, we were expecting == 0: ");
                                str.append(obj);
                                throw new SQLException(str.toString());
                            }
                        } else if (!z2) {
                            str = new StringBuilder();
                            str.append("SQL statement ");
                            str.append(obj);
                            str.append(" updated ");
                            str.append(runExecute);
                            str.append(" rows, we were expecting >= 0");
                            throw new SQLException(str.toString());
                        }
                        i2++;
                    } else {
                        databaseConnection = new StringBuilder();
                        databaseConnection.append("SQL statement failed: ");
                        databaseConnection.append(obj);
                        throw SqlExceptionUtil.create(databaseConnection.toString(), e);
                    }
                } catch (Throwable th22) {
                    databaseConnection = th22;
                    compiledStatement = compileStatement;
                }
            } catch (SQLException e4) {
                e = e4;
                i = 0;
                if (z) {
                    databaseConnection = new StringBuilder();
                    databaseConnection.append("SQL statement failed: ");
                    databaseConnection.append(obj);
                    throw SqlExceptionUtil.create(databaseConnection.toString(), e);
                }
                logger.info("ignoring {} error '{}' for statement: {}", (Object) str, e, obj);
                if (compiledStatement != null) {
                    compiledStatement.close();
                }
                runExecute = i;
                if (runExecute >= 0) {
                    if (!z2) {
                        str = new StringBuilder();
                        str.append("SQL statement ");
                        str.append(obj);
                        str.append(" updated ");
                        str.append(runExecute);
                        str.append(" rows, we were expecting >= 0");
                        throw new SQLException(str.toString());
                    }
                } else if (runExecute <= 0) {
                    continue;
                } else if (z3) {
                    str = new StringBuilder();
                    str.append("SQL statement updated ");
                    str.append(runExecute);
                    str.append(" rows, we were expecting == 0: ");
                    str.append(obj);
                    throw new SQLException(str.toString());
                }
                i2++;
            }
            if (runExecute >= 0) {
                if (!z2) {
                    str = new StringBuilder();
                    str.append("SQL statement ");
                    str.append(obj);
                    str.append(" updated ");
                    str.append(runExecute);
                    str.append(" rows, we were expecting >= 0");
                    throw new SQLException(str.toString());
                }
            } else if (runExecute <= 0) {
                continue;
            } else if (z3) {
                str = new StringBuilder();
                str.append("SQL statement updated ");
                str.append(runExecute);
                str.append(" rows, we were expecting == 0: ");
                str.append(obj);
                throw new SQLException(str.toString());
            }
            i2++;
        }
        return i2;
        if (compiledStatement != null) {
            compiledStatement.close();
        }
        throw databaseConnection;
    }

    private static int doCreateTestQueries(DatabaseConnection databaseConnection, DatabaseType databaseType, List<String> list) {
        int i = 0;
        for (Object obj : list) {
            CompiledStatement compiledStatement = null;
            try {
                CompiledStatement compileStatement = databaseConnection.compileStatement(obj, StatementType.SELECT, noFieldTypes, -1);
                try {
                    DatabaseResults runQuery = compileStatement.runQuery(null);
                    int i2 = 0;
                    for (boolean first = runQuery.first(); first; first = runQuery.next()) {
                        i2++;
                    }
                    logger.info("executing create table after-query got {} results: {}", Integer.valueOf(i2), obj);
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                    i++;
                } catch (SQLException e) {
                    databaseConnection = e;
                    compiledStatement = compileStatement;
                } catch (Throwable th) {
                    databaseConnection = th;
                    compiledStatement = compileStatement;
                }
            } catch (SQLException e2) {
                databaseConnection = e2;
            }
        }
        return i;
        try {
            databaseType = new StringBuilder();
            databaseType.append("executing create table after-query failed: ");
            databaseType.append(obj);
            throw SqlExceptionUtil.create(databaseType.toString(), databaseConnection);
        } catch (Throwable th2) {
            databaseConnection = th2;
            if (compiledStatement != null) {
                compiledStatement.close();
            }
            throw databaseConnection;
        }
    }

    private static <T, ID> List<String> addCreateTableStatements(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) {
        List<String> arrayList = new ArrayList();
        addCreateTableStatements(connectionSource.getDatabaseType(), tableInfo, arrayList, new ArrayList(), z);
        return arrayList;
    }
}
