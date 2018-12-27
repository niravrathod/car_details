package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.dao.RawRowMapper;
import com.j256.ormlite.dao.RawRowObjectMapper;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.stmt.mapped.MappedCreate;
import com.j256.ormlite.stmt.mapped.MappedDelete;
import com.j256.ormlite.stmt.mapped.MappedDeleteCollection;
import com.j256.ormlite.stmt.mapped.MappedQueryForId;
import com.j256.ormlite.stmt.mapped.MappedRefresh;
import com.j256.ormlite.stmt.mapped.MappedUpdate;
import com.j256.ormlite.stmt.mapped.MappedUpdateId;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public class StatementExecutor<T, ID> implements GenericRowMapper<String[]> {
    private static Logger logger = LoggerFactory.getLogger(StatementExecutor.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];
    private String countStarQuery;
    private final Dao<T, ID> dao;
    private final DatabaseType databaseType;
    private FieldType[] ifExistsFieldTypes;
    private String ifExistsQuery;
    private MappedDelete<T, ID> mappedDelete;
    private MappedCreate<T, ID> mappedInsert;
    private MappedQueryForId<T, ID> mappedQueryForId;
    private MappedRefresh<T, ID> mappedRefresh;
    private MappedUpdate<T, ID> mappedUpdate;
    private MappedUpdateId<T, ID> mappedUpdateId;
    private PreparedQuery<T> preparedQueryForAll;
    private RawRowMapper<T> rawRowMapper;
    private final TableInfo<T, ID> tableInfo;

    private static class ObjectArrayRowMapper implements GenericRowMapper<Object[]> {
        private final DataType[] columnTypes;

        public ObjectArrayRowMapper(DataType[] dataTypeArr) {
            this.columnTypes = dataTypeArr;
        }

        public Object[] mapRow(DatabaseResults databaseResults) {
            int columnCount = databaseResults.getColumnCount();
            Object[] objArr = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                DataType dataType;
                if (i >= this.columnTypes.length) {
                    dataType = DataType.STRING;
                } else {
                    dataType = this.columnTypes[i];
                }
                objArr[i] = dataType.getDataPersister().resultToJava(null, databaseResults, i);
            }
            return objArr;
        }
    }

    private static class UserRawRowMapper<UO> implements GenericRowMapper<UO> {
        private String[] columnNames;
        private final RawRowMapper<UO> mapper;
        private final GenericRowMapper<String[]> stringRowMapper;

        public UserRawRowMapper(RawRowMapper<UO> rawRowMapper, GenericRowMapper<String[]> genericRowMapper) {
            this.mapper = rawRowMapper;
            this.stringRowMapper = genericRowMapper;
        }

        public UO mapRow(DatabaseResults databaseResults) {
            return this.mapper.mapRow(getColumnNames(databaseResults), (String[]) this.stringRowMapper.mapRow(databaseResults));
        }

        private String[] getColumnNames(DatabaseResults databaseResults) {
            if (this.columnNames != null) {
                return this.columnNames;
            }
            this.columnNames = databaseResults.getColumnNames();
            return this.columnNames;
        }
    }

    private static class UserRawRowObjectMapper<UO> implements GenericRowMapper<UO> {
        private String[] columnNames;
        private final DataType[] columnTypes;
        private final RawRowObjectMapper<UO> mapper;

        public UserRawRowObjectMapper(RawRowObjectMapper<UO> rawRowObjectMapper, DataType[] dataTypeArr) {
            this.mapper = rawRowObjectMapper;
            this.columnTypes = dataTypeArr;
        }

        public UO mapRow(DatabaseResults databaseResults) {
            int columnCount = databaseResults.getColumnCount();
            Object[] objArr = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                if (i >= this.columnTypes.length) {
                    objArr[i] = null;
                } else {
                    objArr[i] = this.columnTypes[i].getDataPersister().resultToJava(null, databaseResults, i);
                }
            }
            return this.mapper.mapRow(getColumnNames(databaseResults), this.columnTypes, objArr);
        }

        private String[] getColumnNames(DatabaseResults databaseResults) {
            if (this.columnNames != null) {
                return this.columnNames;
            }
            this.columnNames = databaseResults.getColumnNames();
            return this.columnNames;
        }
    }

    public StatementExecutor(DatabaseType databaseType, TableInfo<T, ID> tableInfo, Dao<T, ID> dao) {
        this.databaseType = databaseType;
        this.tableInfo = tableInfo;
        this.dao = dao;
    }

    public T queryForId(DatabaseConnection databaseConnection, ID id, ObjectCache objectCache) {
        if (this.mappedQueryForId == null) {
            this.mappedQueryForId = MappedQueryForId.build(this.databaseType, this.tableInfo, null);
        }
        return this.mappedQueryForId.execute(databaseConnection, id, objectCache);
    }

    public T queryForFirst(DatabaseConnection databaseConnection, PreparedStmt<T> preparedStmt, ObjectCache objectCache) {
        databaseConnection = preparedStmt.compile(databaseConnection, StatementType.SELECT);
        try {
            objectCache = databaseConnection.runQuery(objectCache);
            try {
                if (objectCache.first()) {
                    logger.debug("query-for-first of '{}' returned at least 1 result", preparedStmt.getStatement());
                    preparedStmt = preparedStmt.mapRow(objectCache);
                    if (objectCache != null) {
                        objectCache.close();
                    }
                    databaseConnection.close();
                    return preparedStmt;
                }
                logger.debug("query-for-first of '{}' returned at 0 results", preparedStmt.getStatement());
                if (objectCache != null) {
                    objectCache.close();
                }
                databaseConnection.close();
                return null;
            } catch (Throwable th) {
                preparedStmt = th;
                if (objectCache != null) {
                    objectCache.close();
                }
                databaseConnection.close();
                throw preparedStmt;
            }
        } catch (Throwable th2) {
            preparedStmt = th2;
            objectCache = null;
            if (objectCache != null) {
                objectCache.close();
            }
            databaseConnection.close();
            throw preparedStmt;
        }
    }

    public List<T> queryForAll(ConnectionSource connectionSource, ObjectCache objectCache) {
        prepareQueryForAll();
        return query(connectionSource, this.preparedQueryForAll, objectCache);
    }

    public long queryForCountStar(DatabaseConnection databaseConnection) {
        if (this.countStarQuery == null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("SELECT COUNT(*) FROM ");
            this.databaseType.appendEscapedEntityName(stringBuilder, this.tableInfo.getTableName());
            this.countStarQuery = stringBuilder.toString();
        }
        long queryForLong = databaseConnection.queryForLong(this.countStarQuery);
        logger.debug("query of '{}' returned {}", this.countStarQuery, Long.valueOf(queryForLong));
        return queryForLong;
    }

    public long queryForLong(DatabaseConnection databaseConnection, PreparedStmt<T> preparedStmt) {
        DatabaseResults runQuery;
        databaseConnection = preparedStmt.compile(databaseConnection, StatementType.SELECT_LONG);
        try {
            runQuery = databaseConnection.runQuery(null);
            try {
                if (runQuery.first()) {
                    long j = runQuery.getLong(null);
                    if (runQuery != null) {
                        runQuery.close();
                    }
                    databaseConnection.close();
                    return j;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No result found in queryForLong: ");
                stringBuilder.append(preparedStmt.getStatement());
                throw new SQLException(stringBuilder.toString());
            } catch (Throwable th) {
                preparedStmt = th;
                if (runQuery != null) {
                    runQuery.close();
                }
                databaseConnection.close();
                throw preparedStmt;
            }
        } catch (Throwable th2) {
            preparedStmt = th2;
            runQuery = null;
            if (runQuery != null) {
                runQuery.close();
            }
            databaseConnection.close();
            throw preparedStmt;
        }
    }

    public long queryForLong(DatabaseConnection databaseConnection, String str, String[] strArr) {
        logger.debug("executing raw query for long: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("query arguments: {}", (Object) strArr);
        }
        try {
            databaseConnection = databaseConnection.compileStatement(str, StatementType.SELECT, noFieldTypes, -1);
            try {
                assignStatementArguments(databaseConnection, strArr);
                strArr = databaseConnection.runQuery(null);
            } catch (Throwable th) {
                str = th;
                strArr = null;
                if (strArr != null) {
                    strArr.close();
                }
                if (databaseConnection != null) {
                    databaseConnection.close();
                }
                throw str;
            }
            try {
                if (strArr.first()) {
                    long j = strArr.getLong(null);
                    if (strArr != null) {
                        strArr.close();
                    }
                    if (databaseConnection != null) {
                        databaseConnection.close();
                    }
                    return j;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No result found in queryForLong: ");
                stringBuilder.append(str);
                throw new SQLException(stringBuilder.toString());
            } catch (Throwable th2) {
                str = th2;
                if (strArr != null) {
                    strArr.close();
                }
                if (databaseConnection != null) {
                    databaseConnection.close();
                }
                throw str;
            }
        } catch (Throwable th3) {
            str = th3;
            databaseConnection = null;
            strArr = databaseConnection;
            if (strArr != null) {
                strArr.close();
            }
            if (databaseConnection != null) {
                databaseConnection.close();
            }
            throw str;
        }
    }

    public List<T> query(ConnectionSource connectionSource, PreparedStmt<T> preparedStmt, ObjectCache objectCache) {
        connectionSource = buildIterator(null, connectionSource, preparedStmt, objectCache, -1);
        try {
            objectCache = new ArrayList();
            while (connectionSource.hasNextThrow()) {
                objectCache.add(connectionSource.nextThrow());
            }
            logger.debug("query of '{}' returned {} results", preparedStmt.getStatement(), Integer.valueOf(objectCache.size()));
            return objectCache;
        } finally {
            connectionSource.close();
        }
    }

    public SelectIterator<T, ID> buildIterator(BaseDaoImpl<T, ID> baseDaoImpl, ConnectionSource connectionSource, int i, ObjectCache objectCache) {
        prepareQueryForAll();
        return buildIterator(baseDaoImpl, connectionSource, this.preparedQueryForAll, objectCache, i);
    }

    public GenericRowMapper<T> getSelectStarRowMapper() {
        prepareQueryForAll();
        return this.preparedQueryForAll;
    }

    public RawRowMapper<T> getRawRowMapper() {
        if (this.rawRowMapper == null) {
            this.rawRowMapper = new RawRowMapperImpl(this.tableInfo);
        }
        return this.rawRowMapper;
    }

    public SelectIterator<T, ID> buildIterator(BaseDaoImpl<T, ID> baseDaoImpl, ConnectionSource connectionSource, PreparedStmt<T> preparedStmt, ObjectCache objectCache, int i) {
        CompiledStatement compile;
        Throwable th;
        StatementExecutor statementExecutor;
        ConnectionSource connectionSource2;
        DatabaseConnection readOnlyConnection = connectionSource.getReadOnlyConnection();
        try {
            compile = preparedStmt.compile(readOnlyConnection, StatementType.SELECT, i);
            try {
            } catch (Throwable th2) {
                th = th2;
                statementExecutor = this;
                if (compile != null) {
                    compile.close();
                }
                if (readOnlyConnection != null) {
                    connectionSource2 = connectionSource;
                    connectionSource.releaseConnection(readOnlyConnection);
                }
                throw th;
            }
            try {
                return new SelectIterator(this.tableInfo.getDataClass(), baseDaoImpl, preparedStmt, connectionSource, readOnlyConnection, compile, preparedStmt.getStatement(), objectCache);
            } catch (Throwable th3) {
                th = th3;
                if (compile != null) {
                    compile.close();
                }
                if (readOnlyConnection != null) {
                    connectionSource2 = connectionSource;
                    connectionSource.releaseConnection(readOnlyConnection);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            statementExecutor = this;
            compile = null;
            if (compile != null) {
                compile.close();
            }
            if (readOnlyConnection != null) {
                connectionSource2 = connectionSource;
                connectionSource.releaseConnection(readOnlyConnection);
            }
            throw th;
        }
    }

    public GenericRawResults<String[]> queryRaw(ConnectionSource connectionSource, String str, String[] strArr, ObjectCache objectCache) {
        CompiledStatement compileStatement;
        logger.debug("executing raw query for: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("query arguments: {}", (Object) strArr);
        }
        DatabaseConnection readOnlyConnection = connectionSource.getReadOnlyConnection();
        try {
            compileStatement = readOnlyConnection.compileStatement(str, StatementType.SELECT, noFieldTypes, -1);
            try {
                assignStatementArguments(compileStatement, strArr);
                return new RawResultsImpl(connectionSource, readOnlyConnection, str, String[].class, compileStatement, this, objectCache);
            } catch (Throwable th) {
                str = th;
                if (compileStatement != null) {
                    compileStatement.close();
                }
                if (readOnlyConnection != null) {
                    connectionSource.releaseConnection(readOnlyConnection);
                }
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            compileStatement = null;
            if (compileStatement != null) {
                compileStatement.close();
            }
            if (readOnlyConnection != null) {
                connectionSource.releaseConnection(readOnlyConnection);
            }
            throw str;
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(ConnectionSource connectionSource, String str, RawRowMapper<UO> rawRowMapper, String[] strArr, ObjectCache objectCache) {
        CompiledStatement compileStatement;
        Throwable th;
        ConnectionSource connectionSource2;
        StatementExecutor statementExecutor = this;
        String str2 = str;
        Object obj = strArr;
        logger.debug("executing raw query for: {}", (Object) str);
        if (obj.length > 0) {
            logger.trace("query arguments: {}", obj);
        }
        DatabaseConnection readOnlyConnection = connectionSource.getReadOnlyConnection();
        try {
            compileStatement = readOnlyConnection.compileStatement(str, StatementType.SELECT, noFieldTypes, -1);
            try {
                assignStatementArguments(compileStatement, obj);
                return new RawResultsImpl(connectionSource, readOnlyConnection, str, String[].class, compileStatement, new UserRawRowMapper(rawRowMapper, this), objectCache);
            } catch (Throwable th2) {
                th = th2;
                if (compileStatement != null) {
                    compileStatement.close();
                }
                if (readOnlyConnection != null) {
                    connectionSource2 = connectionSource;
                    connectionSource.releaseConnection(readOnlyConnection);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            compileStatement = null;
            if (compileStatement != null) {
                compileStatement.close();
            }
            if (readOnlyConnection != null) {
                connectionSource2 = connectionSource;
                connectionSource.releaseConnection(readOnlyConnection);
            }
            throw th;
        }
    }

    public <UO> GenericRawResults<UO> queryRaw(ConnectionSource connectionSource, String str, DataType[] dataTypeArr, RawRowObjectMapper<UO> rawRowObjectMapper, String[] strArr, ObjectCache objectCache) {
        CompiledStatement compileStatement;
        StatementExecutor statementExecutor;
        Throwable th;
        ConnectionSource connectionSource2;
        String str2 = str;
        Object obj = strArr;
        logger.debug("executing raw query for: {}", (Object) str);
        if (obj.length > 0) {
            logger.trace("query arguments: {}", obj);
        }
        DatabaseConnection readOnlyConnection = connectionSource.getReadOnlyConnection();
        try {
            compileStatement = readOnlyConnection.compileStatement(str, StatementType.SELECT, noFieldTypes, -1);
            statementExecutor = this;
            try {
                assignStatementArguments(compileStatement, obj);
                return new RawResultsImpl(connectionSource, readOnlyConnection, str, String[].class, compileStatement, new UserRawRowObjectMapper(rawRowObjectMapper, dataTypeArr), objectCache);
            } catch (Throwable th2) {
                th = th2;
                if (compileStatement != null) {
                    compileStatement.close();
                }
                if (readOnlyConnection != null) {
                    connectionSource2 = connectionSource;
                    connectionSource.releaseConnection(readOnlyConnection);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            statementExecutor = this;
            compileStatement = null;
            if (compileStatement != null) {
                compileStatement.close();
            }
            if (readOnlyConnection != null) {
                connectionSource2 = connectionSource;
                connectionSource.releaseConnection(readOnlyConnection);
            }
            throw th;
        }
    }

    public GenericRawResults<Object[]> queryRaw(ConnectionSource connectionSource, String str, DataType[] dataTypeArr, String[] strArr, ObjectCache objectCache) {
        Throwable th;
        ConnectionSource connectionSource2;
        String str2 = str;
        Object obj = strArr;
        logger.debug("executing raw query for: {}", (Object) str);
        if (obj.length > 0) {
            logger.trace("query arguments: {}", obj);
        }
        DatabaseConnection readOnlyConnection = connectionSource.getReadOnlyConnection();
        CompiledStatement compileStatement;
        StatementExecutor statementExecutor;
        try {
            compileStatement = readOnlyConnection.compileStatement(str, StatementType.SELECT, noFieldTypes, -1);
            statementExecutor = this;
            try {
                assignStatementArguments(compileStatement, obj);
                return new RawResultsImpl(connectionSource, readOnlyConnection, str, Object[].class, compileStatement, new ObjectArrayRowMapper(dataTypeArr), objectCache);
            } catch (Throwable th2) {
                th = th2;
                if (compileStatement != null) {
                    compileStatement.close();
                }
                if (readOnlyConnection != null) {
                    connectionSource2 = connectionSource;
                    connectionSource.releaseConnection(readOnlyConnection);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            statementExecutor = this;
            compileStatement = null;
            if (compileStatement != null) {
                compileStatement.close();
            }
            if (readOnlyConnection != null) {
                connectionSource2 = connectionSource;
                connectionSource.releaseConnection(readOnlyConnection);
            }
            throw th;
        }
    }

    public int updateRaw(DatabaseConnection databaseConnection, String str, String[] strArr) {
        logger.debug("running raw update statement: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("update arguments: {}", (Object) strArr);
        }
        databaseConnection = databaseConnection.compileStatement(str, StatementType.UPDATE, noFieldTypes, -1);
        try {
            assignStatementArguments(databaseConnection, strArr);
            str = databaseConnection.runUpdate();
            return str;
        } finally {
            databaseConnection.close();
        }
    }

    public int executeRawNoArgs(DatabaseConnection databaseConnection, String str) {
        logger.debug("running raw execute statement: {}", (Object) str);
        return databaseConnection.executeStatement(str, -1);
    }

    public int executeRaw(DatabaseConnection databaseConnection, String str, String[] strArr) {
        logger.debug("running raw execute statement: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("execute arguments: {}", (Object) strArr);
        }
        databaseConnection = databaseConnection.compileStatement(str, StatementType.EXECUTE, noFieldTypes, -1);
        try {
            assignStatementArguments(databaseConnection, strArr);
            str = databaseConnection.runExecute();
            return str;
        } finally {
            databaseConnection.close();
        }
    }

    public int create(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        if (this.mappedInsert == null) {
            this.mappedInsert = MappedCreate.build(this.databaseType, this.tableInfo);
        }
        return this.mappedInsert.insert(this.databaseType, databaseConnection, t, objectCache);
    }

    public int update(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        if (this.mappedUpdate == null) {
            this.mappedUpdate = MappedUpdate.build(this.databaseType, this.tableInfo);
        }
        return this.mappedUpdate.update(databaseConnection, t, objectCache);
    }

    public int updateId(DatabaseConnection databaseConnection, T t, ID id, ObjectCache objectCache) {
        if (this.mappedUpdateId == null) {
            this.mappedUpdateId = MappedUpdateId.build(this.databaseType, this.tableInfo);
        }
        return this.mappedUpdateId.execute(databaseConnection, t, id, objectCache);
    }

    public int update(DatabaseConnection databaseConnection, PreparedUpdate<T> preparedUpdate) {
        databaseConnection = preparedUpdate.compile(databaseConnection, StatementType.UPDATE);
        try {
            preparedUpdate = databaseConnection.runUpdate();
            return preparedUpdate;
        } finally {
            databaseConnection.close();
        }
    }

    public int refresh(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        if (this.mappedRefresh == null) {
            this.mappedRefresh = MappedRefresh.build(this.databaseType, this.tableInfo);
        }
        return this.mappedRefresh.executeRefresh(databaseConnection, t, objectCache);
    }

    public int delete(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        if (this.mappedDelete == null) {
            this.mappedDelete = MappedDelete.build(this.databaseType, this.tableInfo);
        }
        return this.mappedDelete.delete(databaseConnection, t, objectCache);
    }

    public int deleteById(DatabaseConnection databaseConnection, ID id, ObjectCache objectCache) {
        if (this.mappedDelete == null) {
            this.mappedDelete = MappedDelete.build(this.databaseType, this.tableInfo);
        }
        return this.mappedDelete.deleteById(databaseConnection, id, objectCache);
    }

    public int deleteObjects(DatabaseConnection databaseConnection, Collection<T> collection, ObjectCache objectCache) {
        return MappedDeleteCollection.deleteObjects(this.databaseType, this.tableInfo, databaseConnection, collection, objectCache);
    }

    public int deleteIds(DatabaseConnection databaseConnection, Collection<ID> collection, ObjectCache objectCache) {
        return MappedDeleteCollection.deleteIds(this.databaseType, this.tableInfo, databaseConnection, collection, objectCache);
    }

    public int delete(DatabaseConnection databaseConnection, PreparedDelete<T> preparedDelete) {
        databaseConnection = preparedDelete.compile(databaseConnection, StatementType.DELETE);
        try {
            preparedDelete = databaseConnection.runUpdate();
            return preparedDelete;
        } finally {
            databaseConnection.close();
        }
    }

    public <CT> CT callBatchTasks(DatabaseConnection databaseConnection, boolean z, Callable<CT> callable) {
        if (this.databaseType.isBatchUseTransaction()) {
            return TransactionManager.callInTransaction(databaseConnection, z, this.databaseType, callable);
        }
        boolean z2 = false;
        try {
            if (databaseConnection.isAutoCommitSupported()) {
                boolean isAutoCommit = databaseConnection.isAutoCommit();
                if (isAutoCommit) {
                    try {
                        databaseConnection.setAutoCommit(false);
                        logger.debug("disabled auto-commit on table {} before batch tasks", this.tableInfo.getTableName());
                    } catch (Throwable th) {
                        callable = th;
                        z2 = isAutoCommit;
                        if (z2) {
                            databaseConnection.setAutoCommit(true);
                            logger.debug("re-enabled auto-commit on table {} after batch tasks", this.tableInfo.getTableName());
                        }
                        throw callable;
                    }
                }
                z2 = isAutoCommit;
            }
            callable = callable.call();
            if (z2) {
                databaseConnection.setAutoCommit(true);
                logger.debug("re-enabled auto-commit on table {} after batch tasks", this.tableInfo.getTableName());
            }
            return callable;
        } catch (Callable<CT> callable2) {
            throw callable2;
        } catch (Callable<CT> callable22) {
            throw SqlExceptionUtil.create("Batch tasks callable threw non-SQL exception", callable22);
        } catch (Throwable th2) {
            callable22 = th2;
            if (z2) {
                databaseConnection.setAutoCommit(true);
                logger.debug("re-enabled auto-commit on table {} after batch tasks", this.tableInfo.getTableName());
            }
            throw callable22;
        }
    }

    public String[] mapRow(DatabaseResults databaseResults) {
        int columnCount = databaseResults.getColumnCount();
        String[] strArr = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            strArr[i] = databaseResults.getString(i);
        }
        return strArr;
    }

    public boolean ifExists(DatabaseConnection databaseConnection, ID id) {
        if (this.ifExistsQuery == null) {
            QueryBuilder queryBuilder = new QueryBuilder(this.databaseType, this.tableInfo, this.dao);
            queryBuilder.selectRaw("COUNT(*)");
            queryBuilder.where().eq(this.tableInfo.getIdField().getColumnName(), new SelectArg());
            this.ifExistsQuery = queryBuilder.prepareStatementString();
            this.ifExistsFieldTypes = new FieldType[]{this.tableInfo.getIdField()};
        }
        databaseConnection = databaseConnection.queryForLong(this.ifExistsQuery, new Object[]{id}, this.ifExistsFieldTypes);
        logger.debug("query of '{}' returned {}", this.ifExistsQuery, Long.valueOf(databaseConnection));
        if (databaseConnection != 0) {
            return true;
        }
        return false;
    }

    private void assignStatementArguments(CompiledStatement compiledStatement, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            compiledStatement.setObject(i, strArr[i], SqlType.STRING);
        }
    }

    private void prepareQueryForAll() {
        if (this.preparedQueryForAll == null) {
            this.preparedQueryForAll = new QueryBuilder(this.databaseType, this.tableInfo, this.dao).prepare();
        }
    }
}
