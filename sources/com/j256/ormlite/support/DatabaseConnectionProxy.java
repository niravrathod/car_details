package com.j256.ormlite.support;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import java.sql.Savepoint;

public class DatabaseConnectionProxy implements DatabaseConnection {
    private final DatabaseConnection proxy;

    public DatabaseConnectionProxy(DatabaseConnection databaseConnection) {
        this.proxy = databaseConnection;
    }

    public boolean isAutoCommitSupported() {
        if (this.proxy == null) {
            return false;
        }
        return this.proxy.isAutoCommitSupported();
    }

    public boolean isAutoCommit() {
        if (this.proxy == null) {
            return false;
        }
        return this.proxy.isAutoCommit();
    }

    public void setAutoCommit(boolean z) {
        if (this.proxy != null) {
            this.proxy.setAutoCommit(z);
        }
    }

    public Savepoint setSavePoint(String str) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.setSavePoint(str);
    }

    public void commit(Savepoint savepoint) {
        if (this.proxy != null) {
            this.proxy.commit(savepoint);
        }
    }

    public void rollback(Savepoint savepoint) {
        if (this.proxy != null) {
            this.proxy.rollback(savepoint);
        }
    }

    public int executeStatement(String str, int i) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.executeStatement(str, i);
    }

    public CompiledStatement compileStatement(String str, StatementType statementType, FieldType[] fieldTypeArr, int i) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.compileStatement(str, statementType, fieldTypeArr, i);
    }

    public int insert(String str, Object[] objArr, FieldType[] fieldTypeArr, GeneratedKeyHolder generatedKeyHolder) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.insert(str, objArr, fieldTypeArr, generatedKeyHolder);
    }

    public int update(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.update(str, objArr, fieldTypeArr);
    }

    public int delete(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.delete(str, objArr, fieldTypeArr);
    }

    public <T> Object queryForOne(String str, Object[] objArr, FieldType[] fieldTypeArr, GenericRowMapper<T> genericRowMapper, ObjectCache objectCache) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.queryForOne(str, objArr, fieldTypeArr, genericRowMapper, objectCache);
    }

    public long queryForLong(String str) {
        if (this.proxy == null) {
            return 0;
        }
        return this.proxy.queryForLong(str);
    }

    public long queryForLong(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.queryForLong(str, objArr, fieldTypeArr);
    }

    public void close() {
        if (this.proxy != null) {
            this.proxy.close();
        }
    }

    public void closeQuietly() {
        if (this.proxy != null) {
            this.proxy.closeQuietly();
        }
    }

    public boolean isClosed() {
        if (this.proxy == null) {
            return true;
        }
        return this.proxy.isClosed();
    }

    public boolean isTableExists(String str) {
        if (this.proxy == null) {
            return null;
        }
        return this.proxy.isTableExists(str);
    }
}
