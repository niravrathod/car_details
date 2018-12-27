package com.j256.ormlite.dao;

import com.j256.ormlite.dao.Dao.CreateOrUpdateStatus;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Log.Level;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.PreparedDelete;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.PreparedUpdate;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.ObjectFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class RuntimeExceptionDao<T, ID> implements CloseableIterable<T> {
    private static final Level LOG_LEVEL = Level.DEBUG;
    private static final Logger logger = LoggerFactory.getLogger(RuntimeExceptionDao.class);
    private Dao<T, ID> dao;

    public RuntimeExceptionDao(Dao<T, ID> dao) {
        this.dao = dao;
    }

    public static <T, ID> RuntimeExceptionDao<T, ID> createDao(ConnectionSource connectionSource, Class<T> cls) {
        return new RuntimeExceptionDao(DaoManager.createDao(connectionSource, (Class) cls));
    }

    public static <T, ID> RuntimeExceptionDao<T, ID> createDao(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) {
        return new RuntimeExceptionDao(DaoManager.createDao(connectionSource, (DatabaseTableConfig) databaseTableConfig));
    }

    public T queryForId(ID id) {
        try {
            return this.dao.queryForId(id);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryForId threw exception on: ");
            stringBuilder.append(id);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public T queryForFirst(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.queryForFirst(preparedQuery);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryForFirst threw exception on: ");
            stringBuilder.append(preparedQuery);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public List<T> queryForAll() {
        try {
            return this.dao.queryForAll();
        } catch (Throwable e) {
            logMessage(e, "queryForAll threw exception");
            throw new RuntimeException(e);
        }
    }

    public List<T> queryForEq(String str, Object obj) {
        try {
            return this.dao.queryForEq(str, obj);
        } catch (Object obj2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryForEq threw exception on: ");
            stringBuilder.append(str);
            logMessage(obj2, stringBuilder.toString());
            throw new RuntimeException(obj2);
        }
    }

    public List<T> queryForMatching(T t) {
        try {
            return this.dao.queryForMatching(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryForMatching threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public List<T> queryForMatchingArgs(T t) {
        try {
            return this.dao.queryForMatchingArgs(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryForMatchingArgs threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public List<T> queryForFieldValues(Map<String, Object> map) {
        try {
            return this.dao.queryForFieldValues(map);
        } catch (Map<String, Object> map2) {
            logMessage(map2, "queryForFieldValues threw exception");
            throw new RuntimeException(map2);
        }
    }

    public List<T> queryForFieldValuesArgs(Map<String, Object> map) {
        try {
            return this.dao.queryForFieldValuesArgs(map);
        } catch (Map<String, Object> map2) {
            logMessage(map2, "queryForFieldValuesArgs threw exception");
            throw new RuntimeException(map2);
        }
    }

    public T queryForSameId(T t) {
        try {
            return this.dao.queryForSameId(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryForSameId threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public QueryBuilder<T, ID> queryBuilder() {
        return this.dao.queryBuilder();
    }

    public UpdateBuilder<T, ID> updateBuilder() {
        return this.dao.updateBuilder();
    }

    public DeleteBuilder<T, ID> deleteBuilder() {
        return this.dao.deleteBuilder();
    }

    public List<T> query(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.query(preparedQuery);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("query threw exception on: ");
            stringBuilder.append(preparedQuery);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int create(T t) {
        try {
            return this.dao.create(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("create threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public T createIfNotExists(T t) {
        try {
            return this.dao.createIfNotExists(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("createIfNotExists threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public CreateOrUpdateStatus createOrUpdate(T t) {
        try {
            return this.dao.createOrUpdate(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("createOrUpdate threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int update(T t) {
        try {
            return this.dao.update((Object) t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("update threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int updateId(T t, ID id) {
        try {
            return this.dao.updateId(t, id);
        } catch (ID id2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("updateId threw exception on: ");
            stringBuilder.append(t);
            logMessage(id2, stringBuilder.toString());
            throw new RuntimeException(id2);
        }
    }

    public int update(PreparedUpdate<T> preparedUpdate) {
        try {
            return this.dao.update((PreparedUpdate) preparedUpdate);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("update threw exception on: ");
            stringBuilder.append(preparedUpdate);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int refresh(T t) {
        try {
            return this.dao.refresh(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("refresh threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int delete(T t) {
        try {
            return this.dao.delete((Object) t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("delete threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int deleteById(ID id) {
        try {
            return this.dao.deleteById(id);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("deleteById threw exception on: ");
            stringBuilder.append(id);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int delete(Collection<T> collection) {
        try {
            return this.dao.delete((Collection) collection);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("delete threw exception on: ");
            stringBuilder.append(collection);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int deleteIds(Collection<ID> collection) {
        try {
            return this.dao.deleteIds(collection);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("deleteIds threw exception on: ");
            stringBuilder.append(collection);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int delete(PreparedDelete<T> preparedDelete) {
        try {
            return this.dao.delete((PreparedDelete) preparedDelete);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("delete threw exception on: ");
            stringBuilder.append(preparedDelete);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public CloseableIterator<T> iterator() {
        return this.dao.iterator();
    }

    public CloseableIterator<T> closeableIterator() {
        return this.dao.closeableIterator();
    }

    public CloseableIterator<T> iterator(int i) {
        return this.dao.iterator(i);
    }

    public CloseableWrappedIterable<T> getWrappedIterable() {
        return this.dao.getWrappedIterable();
    }

    public CloseableWrappedIterable<T> getWrappedIterable(PreparedQuery<T> preparedQuery) {
        return this.dao.getWrappedIterable(preparedQuery);
    }

    public void closeLastIterator() {
        try {
            this.dao.closeLastIterator();
        } catch (Throwable e) {
            logMessage(e, "closeLastIterator threw exception");
            throw new RuntimeException(e);
        }
    }

    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.iterator((PreparedQuery) preparedQuery);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iterator threw exception on: ");
            stringBuilder.append(preparedQuery);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public CloseableIterator<T> iterator(PreparedQuery<T> preparedQuery, int i) {
        try {
            return this.dao.iterator(preparedQuery, i);
        } catch (int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("iterator threw exception on: ");
            stringBuilder.append(preparedQuery);
            logMessage(i2, stringBuilder.toString());
            throw new RuntimeException(i2);
        }
    }

    public GenericRawResults<String[]> queryRaw(String str, String... strArr) {
        try {
            return this.dao.queryRaw(str, strArr);
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryRaw threw exception on: ");
            stringBuilder.append(str);
            logMessage(strArr2, stringBuilder.toString());
            throw new RuntimeException(strArr2);
        }
    }

    public long queryRawValue(String str, String... strArr) {
        try {
            return this.dao.queryRawValue(str, strArr);
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("queryRawValue threw exception on: ");
            stringBuilder.append(str);
            logMessage(strArr2, stringBuilder.toString());
            throw new RuntimeException(strArr2);
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(String str, RawRowMapper<UO> rawRowMapper, String... strArr) {
        try {
            return this.dao.queryRaw(str, (RawRowMapper) rawRowMapper, strArr);
        } catch (RawRowMapper<UO> rawRowMapper2) {
            strArr = new StringBuilder();
            strArr.append("queryRaw threw exception on: ");
            strArr.append(str);
            logMessage(rawRowMapper2, strArr.toString());
            throw new RuntimeException(rawRowMapper2);
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(String str, DataType[] dataTypeArr, RawRowObjectMapper<UO> rawRowObjectMapper, String... strArr) {
        try {
            return this.dao.queryRaw(str, dataTypeArr, rawRowObjectMapper, strArr);
        } catch (DataType[] dataTypeArr2) {
            rawRowObjectMapper = new StringBuilder();
            rawRowObjectMapper.append("queryRaw threw exception on: ");
            rawRowObjectMapper.append(str);
            logMessage(dataTypeArr2, rawRowObjectMapper.toString());
            throw new RuntimeException(dataTypeArr2);
        }
    }

    public GenericRawResults<Object[]> queryRaw(String str, DataType[] dataTypeArr, String... strArr) {
        try {
            return this.dao.queryRaw(str, dataTypeArr, strArr);
        } catch (DataType[] dataTypeArr2) {
            strArr = new StringBuilder();
            strArr.append("queryRaw threw exception on: ");
            strArr.append(str);
            logMessage(dataTypeArr2, strArr.toString());
            throw new RuntimeException(dataTypeArr2);
        }
    }

    public int executeRaw(String str, String... strArr) {
        try {
            return this.dao.executeRaw(str, strArr);
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("executeRaw threw exception on: ");
            stringBuilder.append(str);
            logMessage(strArr2, stringBuilder.toString());
            throw new RuntimeException(strArr2);
        }
    }

    public int executeRawNoArgs(String str) {
        try {
            return this.dao.executeRawNoArgs(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("executeRawNoArgs threw exception on: ");
            stringBuilder.append(str);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public int updateRaw(String str, String... strArr) {
        try {
            return this.dao.updateRaw(str, strArr);
        } catch (String[] strArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("updateRaw threw exception on: ");
            stringBuilder.append(str);
            logMessage(strArr2, stringBuilder.toString());
            throw new RuntimeException(strArr2);
        }
    }

    public <CT> CT callBatchTasks(Callable<CT> callable) {
        try {
            return this.dao.callBatchTasks(callable);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("callBatchTasks threw exception on: ");
            stringBuilder.append(callable);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public String objectToString(T t) {
        return this.dao.objectToString(t);
    }

    public boolean objectsEqual(T t, T t2) {
        try {
            return this.dao.objectsEqual(t, t2);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("objectsEqual threw exception on: ");
            stringBuilder.append(t);
            stringBuilder.append(" and ");
            stringBuilder.append(t2);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public ID extractId(T t) {
        try {
            return this.dao.extractId(t);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("extractId threw exception on: ");
            stringBuilder.append(t);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public Class<T> getDataClass() {
        return this.dao.getDataClass();
    }

    public FieldType findForeignFieldType(Class<?> cls) {
        return this.dao.findForeignFieldType(cls);
    }

    public boolean isUpdatable() {
        return this.dao.isUpdatable();
    }

    public boolean isTableExists() {
        try {
            return this.dao.isTableExists();
        } catch (Throwable e) {
            logMessage(e, "isTableExists threw exception");
            throw new RuntimeException(e);
        }
    }

    public long countOf() {
        try {
            return this.dao.countOf();
        } catch (Throwable e) {
            logMessage(e, "countOf threw exception");
            throw new RuntimeException(e);
        }
    }

    public long countOf(PreparedQuery<T> preparedQuery) {
        try {
            return this.dao.countOf(preparedQuery);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("countOf threw exception on ");
            stringBuilder.append(preparedQuery);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void assignEmptyForeignCollection(T t, String str) {
        try {
            this.dao.assignEmptyForeignCollection(t, str);
        } catch (T t2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("assignEmptyForeignCollection threw exception on ");
            stringBuilder.append(str);
            logMessage(t2, stringBuilder.toString());
            throw new RuntimeException(t2);
        }
    }

    public <FT> ForeignCollection<FT> getEmptyForeignCollection(String str) {
        try {
            return this.dao.getEmptyForeignCollection(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getEmptyForeignCollection threw exception on ");
            stringBuilder.append(str);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void setObjectCache(boolean z) {
        try {
            this.dao.setObjectCache(z);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setObjectCache(");
            stringBuilder.append(z);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public ObjectCache getObjectCache() {
        return this.dao.getObjectCache();
    }

    public void setObjectCache(ObjectCache objectCache) {
        try {
            this.dao.setObjectCache(objectCache);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setObjectCache threw exception on ");
            stringBuilder.append(objectCache);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void clearObjectCache() {
        this.dao.clearObjectCache();
    }

    public T mapSelectStarRow(DatabaseResults databaseResults) {
        try {
            return this.dao.mapSelectStarRow(databaseResults);
        } catch (DatabaseResults databaseResults2) {
            logMessage(databaseResults2, "mapSelectStarRow threw exception on results");
            throw new RuntimeException(databaseResults2);
        }
    }

    public GenericRowMapper<T> getSelectStarRowMapper() {
        try {
            return this.dao.getSelectStarRowMapper();
        } catch (Throwable e) {
            logMessage(e, "getSelectStarRowMapper threw exception");
            throw new RuntimeException(e);
        }
    }

    public boolean idExists(ID id) {
        try {
            return this.dao.idExists(id);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("idExists threw exception on ");
            stringBuilder.append(id);
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public DatabaseConnection startThreadConnection() {
        try {
            return this.dao.startThreadConnection();
        } catch (Throwable e) {
            logMessage(e, "startThreadConnection() threw exception");
            throw new RuntimeException(e);
        }
    }

    public void endThreadConnection(DatabaseConnection databaseConnection) {
        try {
            this.dao.endThreadConnection(databaseConnection);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endThreadConnection(");
            stringBuilder.append(databaseConnection);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public void setAutoCommit(boolean z) {
        try {
            this.dao.setAutoCommit(z);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setAutoCommit(");
            stringBuilder.append(z);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void setAutoCommit(DatabaseConnection databaseConnection, boolean z) {
        try {
            this.dao.setAutoCommit(databaseConnection, z);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setAutoCommit(");
            stringBuilder.append(databaseConnection);
            stringBuilder.append(",");
            stringBuilder.append(z);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public boolean isAutoCommit() {
        try {
            return this.dao.isAutoCommit();
        } catch (Throwable e) {
            logMessage(e, "isAutoCommit() threw exception");
            throw new RuntimeException(e);
        }
    }

    public boolean isAutoCommit(DatabaseConnection databaseConnection) {
        try {
            return this.dao.isAutoCommit(databaseConnection);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isAutoCommit(");
            stringBuilder.append(databaseConnection);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void commit(DatabaseConnection databaseConnection) {
        try {
            this.dao.commit(databaseConnection);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("commit(");
            stringBuilder.append(databaseConnection);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void rollBack(DatabaseConnection databaseConnection) {
        try {
            this.dao.rollBack(databaseConnection);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("rollBack(");
            stringBuilder.append(databaseConnection);
            stringBuilder.append(") threw exception");
            logMessage(e, stringBuilder.toString());
            throw new RuntimeException(e);
        }
    }

    public void setObjectFactory(ObjectFactory<T> objectFactory) {
        this.dao.setObjectFactory(objectFactory);
    }

    public RawRowMapper<T> getRawRowMapper() {
        return this.dao.getRawRowMapper();
    }

    public ConnectionSource getConnectionSource() {
        return this.dao.getConnectionSource();
    }

    private void logMessage(Exception exception, String str) {
        logger.log(LOG_LEVEL, (Throwable) exception, str);
    }
}
