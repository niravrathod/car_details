package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.CloseableIterator;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;

public class SelectIterator<T, ID> implements CloseableIterator<T> {
    private static final Logger logger = LoggerFactory.getLogger(SelectIterator.class);
    private boolean alreadyMoved;
    private final Dao<T, ID> classDao;
    private boolean closed;
    private final CompiledStatement compiledStmt;
    private final DatabaseConnection connection;
    private final ConnectionSource connectionSource;
    private final Class<?> dataClass;
    private boolean first = true;
    private T last;
    private final DatabaseResults results;
    private int rowC;
    private final GenericRowMapper<T> rowMapper;
    private final String statement;

    public SelectIterator(Class<?> cls, Dao<T, ID> dao, GenericRowMapper<T> genericRowMapper, ConnectionSource connectionSource, DatabaseConnection databaseConnection, CompiledStatement compiledStatement, String str, ObjectCache objectCache) {
        this.dataClass = cls;
        this.classDao = dao;
        this.rowMapper = genericRowMapper;
        this.connectionSource = connectionSource;
        this.connection = databaseConnection;
        this.compiledStmt = compiledStatement;
        this.results = compiledStatement.runQuery(objectCache);
        this.statement = str;
        if (str != null) {
            logger.debug("starting iterator @{} for '{}'", Integer.valueOf(hashCode()), (Object) str);
        }
    }

    public boolean hasNextThrow() {
        if (this.closed) {
            return false;
        }
        if (this.alreadyMoved) {
            return true;
        }
        boolean first;
        if (this.first) {
            this.first = false;
            first = this.results.first();
        } else {
            first = this.results.next();
        }
        if (!first) {
            close();
        }
        this.alreadyMoved = true;
        return first;
    }

    public boolean hasNext() {
        try {
            return hasNextThrow();
        } catch (Throwable e) {
            this.last = null;
            closeQuietly();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Errors getting more results of ");
            stringBuilder.append(this.dataClass);
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }

    public T first() {
        if (this.closed) {
            return null;
        }
        this.first = false;
        if (this.results.first()) {
            return getCurrent();
        }
        return null;
    }

    public T previous() {
        if (this.closed) {
            return null;
        }
        this.first = false;
        if (this.results.previous()) {
            return getCurrent();
        }
        return null;
    }

    public T current() {
        if (this.closed) {
            return null;
        }
        if (this.first) {
            return first();
        }
        return getCurrent();
    }

    public T nextThrow() {
        if (this.closed) {
            return null;
        }
        if (!this.alreadyMoved) {
            boolean first;
            if (this.first) {
                this.first = false;
                first = this.results.first();
            } else {
                first = this.results.next();
            }
            if (!first) {
                this.first = false;
                return null;
            }
        }
        this.first = false;
        return getCurrent();
    }

    public T next() {
        Throwable th;
        try {
            T nextThrow = nextThrow();
            if (nextThrow != null) {
                return nextThrow;
            }
            th = null;
            this.last = null;
            closeQuietly();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not get next result for ");
            stringBuilder.append(this.dataClass);
            throw new IllegalStateException(stringBuilder.toString(), th);
        } catch (SQLException e) {
            th = e;
        }
    }

    public T moveRelative(int i) {
        if (this.closed) {
            return null;
        }
        this.first = false;
        if (this.results.moveRelative(i) != 0) {
            return getCurrent();
        }
        return null;
    }

    public void removeThrow() {
        StringBuilder stringBuilder;
        if (this.last == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("No last ");
            stringBuilder.append(this.dataClass);
            stringBuilder.append(" object to remove. Must be called after a call to next.");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.classDao != null) {
            try {
                this.classDao.delete(this.last);
            } finally {
                this.last = null;
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot remove ");
            stringBuilder.append(this.dataClass);
            stringBuilder.append(" object because classDao not initialized");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void remove() {
        try {
            removeThrow();
        } catch (Throwable e) {
            closeQuietly();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not delete ");
            stringBuilder.append(this.dataClass);
            stringBuilder.append(" object ");
            stringBuilder.append(this.last);
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }

    public void close() {
        if (!this.closed) {
            this.compiledStmt.close();
            this.closed = true;
            this.last = null;
            if (this.statement != null) {
                logger.debug("closed iterator @{} after {} rows", Integer.valueOf(hashCode()), Integer.valueOf(this.rowC));
            }
            this.connectionSource.releaseConnection(this.connection);
        }
    }

    public void closeQuietly() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0.close();	 Catch:{ SQLException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.SelectIterator.closeQuietly():void");
    }

    public DatabaseResults getRawResults() {
        return this.results;
    }

    public void moveToNext() {
        this.last = null;
        this.first = false;
        this.alreadyMoved = false;
    }

    private T getCurrent() {
        this.last = this.rowMapper.mapRow(this.results);
        this.alreadyMoved = false;
        this.rowC++;
        return this.last;
    }
}
