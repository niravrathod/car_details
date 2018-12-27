package com.j256.ormlite.dao;

import com.j256.ormlite.dao.Dao.CreateOrUpdateStatus;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.BaseDaoEnabled;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.PreparedUpdate;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.stmt.StatementExecutor;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.stmt.Where;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.ObjectFactory;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public abstract class BaseDaoImpl<T, ID> implements Dao<T, ID> {
    private static final ThreadLocal<List<BaseDaoImpl<?, ?>>> daoConfigLevelLocal = new C26661();
    private static ReferenceObjectCache defaultObjectCache;
    protected ConnectionSource connectionSource;
    protected final Class<T> dataClass;
    protected DatabaseType databaseType;
    private boolean initialized;
    protected CloseableIterator<T> lastIterator;
    private ObjectCache objectCache;
    protected ObjectFactory<T> objectFactory;
    protected StatementExecutor<T, ID> statementExecutor;
    protected DatabaseTableConfig<T> tableConfig;
    protected TableInfo<T, ID> tableInfo;

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$1 */
    static class C26661 extends ThreadLocal<List<BaseDaoImpl<?, ?>>> {
        C26661() {
        }

        protected List<BaseDaoImpl<?, ?>> initialValue() {
            return new ArrayList(10);
        }
    }

    /* renamed from: com.j256.ormlite.dao.BaseDaoImpl$2 */
    class C42612 implements CloseableIterable<T> {
        C42612() {
        }

        public Iterator<T> iterator() {
            return closeableIterator();
        }

        public CloseableIterator<T> closeableIterator() {
            try {
                return BaseDaoImpl.this.createIterator(-1);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not build iterator for ");
                stringBuilder.append(BaseDaoImpl.this.dataClass);
                throw new IllegalStateException(stringBuilder.toString(), e);
            }
        }
    }

    protected BaseDaoImpl(Class<T> cls) {
        this(null, cls, null);
    }

    protected BaseDaoImpl(ConnectionSource connectionSource, Class<T> cls) {
        this(connectionSource, cls, null);
    }

    protected BaseDaoImpl(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        this(connectionSource, databaseTableConfig.getDataClass(), databaseTableConfig);
    }

    private BaseDaoImpl(ConnectionSource connectionSource, Class<T> cls, DatabaseTableConfig<T> databaseTableConfig) {
        this.dataClass = cls;
        this.tableConfig = databaseTableConfig;
        if (connectionSource != null) {
            this.connectionSource = connectionSource;
            initialize();
        }
    }

    public void initialize() {
        if (!this.initialized) {
            StringBuilder stringBuilder;
            if (this.connectionSource != null) {
                this.databaseType = this.connectionSource.getDatabaseType();
                if (this.databaseType != null) {
                    if (this.tableConfig == null) {
                        this.tableInfo = new TableInfo(this.connectionSource, this, this.dataClass);
                    } else {
                        this.tableConfig.extractFieldTypes(this.connectionSource);
                        this.tableInfo = new TableInfo(this.databaseType, this, this.tableConfig);
                    }
                    this.statementExecutor = new StatementExecutor(this.databaseType, this.tableInfo, this);
                    List list = (List) daoConfigLevelLocal.get();
                    list.add(this);
                    if (list.size() <= 1) {
                        int i = 0;
                        while (i < list.size()) {
                            BaseDaoImpl baseDaoImpl = (BaseDaoImpl) list.get(i);
                            DaoManager.registerDao(this.connectionSource, baseDaoImpl);
                            try {
                                for (FieldType configDaoInformation : baseDaoImpl.getTableInfo().getFieldTypes()) {
                                    configDaoInformation.configDaoInformation(this.connectionSource, baseDaoImpl.getDataClass());
                                }
                                baseDaoImpl.initialized = true;
                                i++;
                            } catch (SQLException e) {
                                DaoManager.unregisterDao(this.connectionSource, baseDaoImpl);
                                throw e;
                            } catch (Throwable th) {
                                list.clear();
                                daoConfigLevelLocal.remove();
                            }
                        }
                        list.clear();
                        daoConfigLevelLocal.remove();
                        return;
                    }
                    return;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("connectionSource is getting a null DatabaseType in ");
                stringBuilder.append(getClass().getSimpleName());
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("connectionSource was never set on ");
            stringBuilder.append(getClass().getSimpleName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public T queryForId(ID id) {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            id = this.statementExecutor.queryForId(readOnlyConnection, id, this.objectCache);
            return id;
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public T queryForFirst(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            preparedQuery = this.statementExecutor.queryForFirst(readOnlyConnection, preparedQuery, this.objectCache);
            return preparedQuery;
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public List<T> queryForAll() {
        checkForInitialized();
        return this.statementExecutor.queryForAll(this.connectionSource, this.objectCache);
    }

    public List<T> queryForEq(String str, Object obj) {
        return queryBuilder().where().eq(str, obj).query();
    }

    public QueryBuilder<T, ID> queryBuilder() {
        checkForInitialized();
        return new QueryBuilder(this.databaseType, this.tableInfo, this);
    }

    public UpdateBuilder<T, ID> updateBuilder() {
        checkForInitialized();
        return new UpdateBuilder(this.databaseType, this.tableInfo, this);
    }

    public DeleteBuilder<T, ID> deleteBuilder() {
        checkForInitialized();
        return new DeleteBuilder(this.databaseType, this.tableInfo, this);
    }

    public List<T> query(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        return this.statementExecutor.query(this.connectionSource, preparedQuery, this.objectCache);
    }

    public List<T> queryForMatching(T t) {
        return queryForMatching(t, false);
    }

    public List<T> queryForMatchingArgs(T t) {
        return queryForMatching(t, true);
    }

    public List<T> queryForFieldValues(Map<String, Object> map) {
        return queryForFieldValues(map, false);
    }

    public List<T> queryForFieldValuesArgs(Map<String, Object> map) {
        return queryForFieldValues(map, true);
    }

    public T queryForSameId(T t) {
        checkForInitialized();
        if (t == null) {
            return null;
        }
        t = extractId(t);
        if (t == null) {
            return null;
        }
        return queryForId(t);
    }

    public int create(T t) {
        checkForInitialized();
        if (t == null) {
            return null;
        }
        if (t instanceof BaseDaoEnabled) {
            ((BaseDaoEnabled) t).setDao(this);
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            t = this.statementExecutor.create(readWriteConnection, t, this.objectCache);
            return t;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public T createIfNotExists(T t) {
        if (t == null) {
            return null;
        }
        T queryForSameId = queryForSameId(t);
        if (queryForSameId != null) {
            return queryForSameId;
        }
        create(t);
        return t;
    }

    public CreateOrUpdateStatus createOrUpdate(T t) {
        if (t == null) {
            return new CreateOrUpdateStatus(false, false, 0);
        }
        Object extractId = extractId(t);
        if (extractId != null) {
            if (idExists(extractId)) {
                return new CreateOrUpdateStatus(false, true, update((Object) t));
            }
        }
        return new CreateOrUpdateStatus(true, false, create(t));
    }

    public int update(T t) {
        checkForInitialized();
        if (t == null) {
            return null;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            t = this.statementExecutor.update(readWriteConnection, t, this.objectCache);
            return t;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int updateId(T t, ID id) {
        checkForInitialized();
        if (t == null) {
            return null;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            t = this.statementExecutor.updateId(readWriteConnection, t, id, this.objectCache);
            return t;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int update(PreparedUpdate<T> preparedUpdate) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            preparedUpdate = this.statementExecutor.update(readWriteConnection, preparedUpdate);
            return preparedUpdate;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int refresh(T t) {
        checkForInitialized();
        if (t == null) {
            return null;
        }
        if (t instanceof BaseDaoEnabled) {
            ((BaseDaoEnabled) t).setDao(this);
        }
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            t = this.statementExecutor.refresh(readOnlyConnection, t, this.objectCache);
            return t;
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public int delete(T t) {
        checkForInitialized();
        if (t == null) {
            return null;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            t = this.statementExecutor.delete(readWriteConnection, t, this.objectCache);
            return t;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int deleteById(ID id) {
        checkForInitialized();
        if (id == null) {
            return null;
        }
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            id = this.statementExecutor.deleteById(readWriteConnection, id, this.objectCache);
            return id;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int delete(Collection<T> collection) {
        checkForInitialized();
        if (collection != null) {
            if (!collection.isEmpty()) {
                DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
                try {
                    collection = this.statementExecutor.deleteObjects(readWriteConnection, collection, this.objectCache);
                    return collection;
                } finally {
                    this.connectionSource.releaseConnection(readWriteConnection);
                }
            }
        }
        return null;
    }

    public int deleteIds(Collection<ID> collection) {
        checkForInitialized();
        if (collection != null) {
            if (!collection.isEmpty()) {
                DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
                try {
                    collection = this.statementExecutor.deleteIds(readWriteConnection, collection, this.objectCache);
                    return collection;
                } finally {
                    this.connectionSource.releaseConnection(readWriteConnection);
                }
            }
        }
        return null;
    }

    public int delete(PreparedDelete<T> preparedDelete) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            preparedDelete = this.statementExecutor.delete(readWriteConnection, preparedDelete);
            return preparedDelete;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public CloseableIterator<T> iterator() {
        return iterator(-1);
    }

    public CloseableIterator<T> closeableIterator() {
        return iterator(-1);
    }

    public CloseableIterator<T> iterator(int i) {
        checkForInitialized();
        this.lastIterator = createIterator(i);
        return this.lastIterator;
    }

    public CloseableWrappedIterable<T> getWrappedIterable() {
        checkForInitialized();
        return new CloseableWrappedIterableImpl(new C42612());
    }

    public CloseableWrappedIterable<T> getWrappedIterable(final PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        return new CloseableWrappedIterableImpl(new CloseableIterable<T>() {
            public Iterator<T> iterator() {
                return closeableIterator();
            }

            public CloseableIterator<T> closeableIterator() {
                try {
                    return BaseDaoImpl.this.createIterator(preparedQuery, -1);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not build prepared-query iterator for ");
                    stringBuilder.append(BaseDaoImpl.this.dataClass);
                    throw new IllegalStateException(stringBuilder.toString(), e);
                }
            }
        });
    }

    public void closeLastIterator() {
        if (this.lastIterator != null) {
            this.lastIterator.close();
            this.lastIterator = null;
        }
    }

    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery) {
        return iterator(preparedQuery, -1);
    }

    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery, int i) {
        checkForInitialized();
        this.lastIterator = createIterator(preparedQuery, i);
        return this.lastIterator;
    }

    public GenericRawResults<String[]> queryRaw(String str, String... strArr) {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, strArr, this.objectCache);
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not perform raw query for ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), strArr2);
        }
    }

    public <GR> GenericRawResults<GR> queryRaw(String str, RawRowMapper<GR> rawRowMapper, String... strArr) {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, (RawRowMapper) rawRowMapper, strArr, this.objectCache);
        } catch (RawRowMapper<GR> rawRowMapper2) {
            strArr = new StringBuilder();
            strArr.append("Could not perform raw query for ");
            strArr.append(str);
            throw SqlExceptionUtil.create(strArr.toString(), rawRowMapper2);
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(String str, DataType[] dataTypeArr, RawRowObjectMapper<UO> rawRowObjectMapper, String... strArr) {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, dataTypeArr, rawRowObjectMapper, strArr, this.objectCache);
        } catch (DataType[] dataTypeArr2) {
            rawRowObjectMapper = new StringBuilder();
            rawRowObjectMapper.append("Could not perform raw query for ");
            rawRowObjectMapper.append(str);
            throw SqlExceptionUtil.create(rawRowObjectMapper.toString(), dataTypeArr2);
        }
    }

    public GenericRawResults<Object[]> queryRaw(String str, DataType[] dataTypeArr, String... strArr) {
        checkForInitialized();
        try {
            return this.statementExecutor.queryRaw(this.connectionSource, str, dataTypeArr, strArr, this.objectCache);
        } catch (DataType[] dataTypeArr2) {
            strArr = new StringBuilder();
            strArr.append("Could not perform raw query for ");
            strArr.append(str);
            throw SqlExceptionUtil.create(strArr.toString(), dataTypeArr2);
        }
    }

    public long queryRawValue(String str, String... strArr) {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            long queryForLong = this.statementExecutor.queryForLong(readOnlyConnection, str, strArr);
            this.connectionSource.releaseConnection(readOnlyConnection);
            return queryForLong;
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not perform raw value query for ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), strArr2);
        } catch (Throwable th) {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public int executeRaw(String str, String... strArr) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            strArr = this.statementExecutor.executeRaw(readWriteConnection, str, strArr);
            this.connectionSource.releaseConnection(readWriteConnection);
            return strArr;
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not run raw execute statement ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), strArr2);
        } catch (Throwable th) {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int executeRawNoArgs(String str) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            int executeRawNoArgs = this.statementExecutor.executeRawNoArgs(readWriteConnection, str);
            this.connectionSource.releaseConnection(readWriteConnection);
            return executeRawNoArgs;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not run raw execute statement ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        } catch (Throwable th) {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public int updateRaw(String str, String... strArr) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            strArr = this.statementExecutor.updateRaw(readWriteConnection, str, strArr);
            this.connectionSource.releaseConnection(readWriteConnection);
            return strArr;
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not run raw update statement ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), strArr2);
        } catch (Throwable th) {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public <CT> CT callBatchTasks(Callable<CT> callable) {
        checkForInitialized();
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            callable = this.statementExecutor.callBatchTasks(readWriteConnection, this.connectionSource.saveSpecialConnection(readWriteConnection), callable);
            return callable;
        } finally {
            this.connectionSource.clearSpecialConnection(readWriteConnection);
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public String objectToString(T t) {
        checkForInitialized();
        return this.tableInfo.objectToString(t);
    }

    public boolean objectsEqual(T t, T t2) {
        checkForInitialized();
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            if (!fieldType.getDataPersister().dataIsEqual(fieldType.extractJavaFieldValue(t), fieldType.extractJavaFieldValue(t2))) {
                return false;
            }
        }
        return true;
    }

    public ID extractId(T t) {
        checkForInitialized();
        FieldType idField = this.tableInfo.getIdField();
        if (idField != null) {
            return idField.extractJavaFieldValue(t);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(this.dataClass);
        stringBuilder.append(" does not have an id field");
        throw new SQLException(stringBuilder.toString());
    }

    public Class<T> getDataClass() {
        return this.dataClass;
    }

    public FieldType findForeignFieldType(Class<?> cls) {
        checkForInitialized();
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            if (fieldType.getType() == cls) {
                return fieldType;
            }
        }
        return null;
    }

    public boolean isUpdatable() {
        return this.tableInfo.isUpdatable();
    }

    public boolean isTableExists() {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            boolean isTableExists = readOnlyConnection.isTableExists(this.tableInfo.getTableName());
            return isTableExists;
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public long countOf() {
        checkForInitialized();
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            long queryForCountStar = this.statementExecutor.queryForCountStar(readOnlyConnection);
            return queryForCountStar;
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public long countOf(PreparedQuery<T> preparedQuery) {
        checkForInitialized();
        if (preparedQuery.getType() == StatementType.SELECT_LONG) {
            DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
            long queryForLong;
            try {
                queryForLong = this.statementExecutor.queryForLong(readOnlyConnection, preparedQuery);
                return queryForLong;
            } finally {
                queryForLong = this.connectionSource;
                queryForLong.releaseConnection(readOnlyConnection);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Prepared query is not of type ");
            stringBuilder.append(StatementType.SELECT_LONG);
            stringBuilder.append(", did you call QueryBuilder.setCountOf(true)?");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void assignEmptyForeignCollection(T t, String str) {
        makeEmptyForeignCollection(t, str);
    }

    public <FT> ForeignCollection<FT> getEmptyForeignCollection(String str) {
        return makeEmptyForeignCollection(null, str);
    }

    public void setObjectCache(boolean z) {
        if (z) {
            if (!this.objectCache) {
                if (this.tableInfo.getIdField()) {
                    synchronized (BaseDaoImpl.class) {
                        if (defaultObjectCache == null) {
                            defaultObjectCache = ReferenceObjectCache.makeWeakCache();
                        }
                        this.objectCache = defaultObjectCache;
                    }
                    this.objectCache.registerClass(this.dataClass);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Class ");
                stringBuilder.append(this.dataClass);
                stringBuilder.append(" must have an id field to enable the object cache");
                throw new SQLException(stringBuilder.toString());
            }
        } else if (this.objectCache) {
            this.objectCache.clear(this.dataClass);
            this.objectCache = false;
        }
    }

    public void setObjectCache(ObjectCache objectCache) {
        if (objectCache != null) {
            if (!(this.objectCache == null || this.objectCache == objectCache)) {
                this.objectCache.clear(this.dataClass);
            }
            if (this.tableInfo.getIdField() != null) {
                this.objectCache = objectCache;
                this.objectCache.registerClass(this.dataClass);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(this.dataClass);
            stringBuilder.append(" must have an id field to enable the object cache");
            throw new SQLException(stringBuilder.toString());
        } else if (this.objectCache != null) {
            this.objectCache.clear(this.dataClass);
            this.objectCache = null;
        }
    }

    public ObjectCache getObjectCache() {
        return this.objectCache;
    }

    public void clearObjectCache() {
        if (this.objectCache != null) {
            this.objectCache.clear(this.dataClass);
        }
    }

    public static synchronized void clearAllInternalObjectCaches() {
        synchronized (BaseDaoImpl.class) {
            if (defaultObjectCache != null) {
                defaultObjectCache.clearAll();
                defaultObjectCache = null;
            }
        }
    }

    public T mapSelectStarRow(DatabaseResults databaseResults) {
        return this.statementExecutor.getSelectStarRowMapper().mapRow(databaseResults);
    }

    public GenericRowMapper<T> getSelectStarRowMapper() {
        return this.statementExecutor.getSelectStarRowMapper();
    }

    public RawRowMapper<T> getRawRowMapper() {
        return this.statementExecutor.getRawRowMapper();
    }

    public boolean idExists(ID id) {
        DatabaseConnection readOnlyConnection = this.connectionSource.getReadOnlyConnection();
        try {
            id = this.statementExecutor.ifExists(readOnlyConnection, id);
            return id;
        } finally {
            this.connectionSource.releaseConnection(readOnlyConnection);
        }
    }

    public DatabaseConnection startThreadConnection() {
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        this.connectionSource.saveSpecialConnection(readWriteConnection);
        return readWriteConnection;
    }

    public void endThreadConnection(DatabaseConnection databaseConnection) {
        this.connectionSource.clearSpecialConnection(databaseConnection);
        this.connectionSource.releaseConnection(databaseConnection);
    }

    public void setAutoCommit(boolean z) {
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            setAutoCommit(readWriteConnection, z);
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public void setAutoCommit(DatabaseConnection databaseConnection, boolean z) {
        databaseConnection.setAutoCommit(z);
    }

    public boolean isAutoCommit() {
        DatabaseConnection readWriteConnection = this.connectionSource.getReadWriteConnection();
        try {
            boolean isAutoCommit = isAutoCommit(readWriteConnection);
            return isAutoCommit;
        } finally {
            this.connectionSource.releaseConnection(readWriteConnection);
        }
    }

    public boolean isAutoCommit(DatabaseConnection databaseConnection) {
        return databaseConnection.isAutoCommit();
    }

    public void commit(DatabaseConnection databaseConnection) {
        databaseConnection.commit(null);
    }

    public void rollBack(DatabaseConnection databaseConnection) {
        databaseConnection.rollback(null);
    }

    public ObjectFactory<T> getObjectFactory() {
        return this.objectFactory;
    }

    public void setObjectFactory(ObjectFactory<T> objectFactory) {
        checkForInitialized();
        this.objectFactory = objectFactory;
    }

    public DatabaseTableConfig<T> getTableConfig() {
        return this.tableConfig;
    }

    public TableInfo<T, ID> getTableInfo() {
        return this.tableInfo;
    }

    public ConnectionSource getConnectionSource() {
        return this.connectionSource;
    }

    public void setConnectionSource(ConnectionSource connectionSource) {
        this.connectionSource = connectionSource;
    }

    public void setTableConfig(DatabaseTableConfig<T> databaseTableConfig) {
        this.tableConfig = databaseTableConfig;
    }

    static <T, ID> Dao<T, ID> createDao(ConnectionSource connectionSource, Class<T> cls) {
        return new BaseDaoImpl<T, ID>(connectionSource, cls) {
            public /* bridge */ /* synthetic */ Iterator iterator() {
                return super.iterator();
            }
        };
    }

    static <T, ID> Dao<T, ID> createDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return new BaseDaoImpl<T, ID>(connectionSource, databaseTableConfig) {
            public /* bridge */ /* synthetic */ Iterator iterator() {
                return super.iterator();
            }
        };
    }

    protected void checkForInitialized() {
        if (!this.initialized) {
            throw new IllegalStateException("you must call initialize() before you can use the dao");
        }
    }

    private <FT> ForeignCollection<FT> makeEmptyForeignCollection(T t, String str) {
        Object obj;
        checkForInitialized();
        if (t == null) {
            obj = null;
        } else {
            obj = extractId(t);
        }
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            if (fieldType.getColumnName().equals(str)) {
                str = fieldType.buildForeignCollection(t, obj);
                if (t != null) {
                    fieldType.assignField(t, str, true, null);
                }
                return str;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find a field named ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private CloseableIterator<T> createIterator(int i) {
        try {
            return this.statementExecutor.buildIterator(this, this.connectionSource, i, this.objectCache);
        } catch (int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not build iterator for ");
            stringBuilder.append(this.dataClass);
            throw new IllegalStateException(stringBuilder.toString(), i2);
        }
    }

    private CloseableIterator<T> createIterator(PreparedQuery<T> preparedQuery, int i) {
        try {
            return this.statementExecutor.buildIterator(this, this.connectionSource, preparedQuery, this.objectCache, i);
        } catch (PreparedQuery<T> preparedQuery2) {
            i = new StringBuilder();
            i.append("Could not build prepared-query iterator for ");
            i.append(this.dataClass);
            throw SqlExceptionUtil.create(i.toString(), preparedQuery2);
        }
    }

    private List<T> queryForMatching(T t, boolean z) {
        checkForInitialized();
        QueryBuilder queryBuilder = queryBuilder();
        Where where = queryBuilder.where();
        int i = 0;
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            Object fieldValueIfNotDefault = fieldType.getFieldValueIfNotDefault(t);
            if (fieldValueIfNotDefault != null) {
                if (z) {
                    fieldValueIfNotDefault = new SelectArg(fieldValueIfNotDefault);
                }
                where.eq(fieldType.getColumnName(), fieldValueIfNotDefault);
                i++;
            }
        }
        if (i == 0) {
            return Collections.emptyList();
        }
        where.and(i);
        return queryBuilder.query();
    }

    private List<T> queryForFieldValues(Map<String, Object> map, boolean z) {
        checkForInitialized();
        QueryBuilder queryBuilder = queryBuilder();
        Where where = queryBuilder.where();
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (z) {
                value = new SelectArg(value);
            }
            where.eq((String) entry.getKey(), value);
        }
        if (!map.size()) {
            return Collections.emptyList();
        }
        where.and(map.size());
        return queryBuilder.query();
    }
}
