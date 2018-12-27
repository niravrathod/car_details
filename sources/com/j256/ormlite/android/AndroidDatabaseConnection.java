package com.j256.ormlite.android;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.misc.VersionUtils;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.GeneratedKeyHolder;
import java.sql.Savepoint;

public class AndroidDatabaseConnection implements DatabaseConnection {
    private static final String ANDROID_VERSION = "VERSION__4.48__";
    private static final String[] NO_STRING_ARGS = new String[0];
    private static Logger logger = LoggerFactory.getLogger(AndroidDatabaseConnection.class);
    private final boolean cancelQueriesEnabled;
    private final SQLiteDatabase db;
    private final boolean readWrite;

    private static class OurSavePoint implements Savepoint {
        private String name;

        public int getSavepointId() {
            return 0;
        }

        public OurSavePoint(String str) {
            this.name = str;
        }

        public String getSavepointName() {
            return this.name;
        }
    }

    public boolean isAutoCommitSupported() {
        return true;
    }

    static {
        VersionUtils.checkCoreVersusAndroidVersions(ANDROID_VERSION);
    }

    public AndroidDatabaseConnection(SQLiteDatabase sQLiteDatabase, boolean z) {
        this(sQLiteDatabase, z, false);
    }

    public AndroidDatabaseConnection(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        this.db = sQLiteDatabase;
        this.readWrite = z;
        this.cancelQueriesEnabled = z2;
        logger.trace("{}: db {} opened, read-write = {}", (Object) this, (Object) sQLiteDatabase, Boolean.valueOf(z));
    }

    public boolean isAutoCommit() {
        try {
            boolean inTransaction = this.db.inTransaction();
            logger.trace("{}: in transaction is {}", (Object) this, Boolean.valueOf(inTransaction));
            return inTransaction ^ 1;
        } catch (Throwable e) {
            throw SqlExceptionUtil.create("problems getting auto-commit from database", e);
        }
    }

    public void setAutoCommit(boolean z) {
        if (z) {
            if (this.db.inTransaction()) {
                this.db.setTransactionSuccessful();
                this.db.endTransaction();
            }
        } else if (!this.db.inTransaction()) {
            this.db.beginTransaction();
        }
    }

    public Savepoint setSavePoint(String str) {
        try {
            this.db.beginTransaction();
            logger.trace("{}: save-point set with name {}", (Object) this, (Object) str);
            return new OurSavePoint(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("problems beginning transaction ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public boolean isReadWrite() {
        return this.readWrite;
    }

    public void commit(Savepoint savepoint) {
        try {
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
            if (savepoint == null) {
                logger.trace("{}: transaction is successfuly ended", (Object) this);
            } else {
                logger.trace("{}: transaction {} is successfuly ended", (Object) this, savepoint.getSavepointName());
            }
        } catch (Throwable e) {
            if (savepoint == null) {
                throw SqlExceptionUtil.create("problems commiting transaction", e);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("problems commiting transaction ");
            stringBuilder.append(savepoint.getSavepointName());
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public void rollback(Savepoint savepoint) {
        try {
            this.db.endTransaction();
            if (savepoint == null) {
                logger.trace("{}: transaction is ended, unsuccessfuly", (Object) this);
            } else {
                logger.trace("{}: transaction {} is ended, unsuccessfuly", (Object) this, savepoint.getSavepointName());
            }
        } catch (Throwable e) {
            if (savepoint == null) {
                throw SqlExceptionUtil.create("problems rolling back transaction", e);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("problems rolling back transaction ");
            stringBuilder.append(savepoint.getSavepointName());
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public int executeStatement(String str, int i) {
        return AndroidCompiledStatement.execSql(this.db, str, str, NO_STRING_ARGS);
    }

    public CompiledStatement compileStatement(String str, StatementType statementType, FieldType[] fieldTypeArr, int i) {
        Object androidCompiledStatement = new AndroidCompiledStatement(str, this.db, statementType, this.cancelQueriesEnabled);
        logger.trace("{}: compiled statement got {}: {}", (Object) this, androidCompiledStatement, (Object) str);
        return androidCompiledStatement;
    }

    public int insert(String str, Object[] objArr, FieldType[] fieldTypeArr, GeneratedKeyHolder generatedKeyHolder) {
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteStatement compileStatement = this.db.compileStatement(str);
            try {
                bindArgs(compileStatement, objArr, fieldTypeArr);
                objArr = compileStatement.executeInsert();
                if (generatedKeyHolder != null) {
                    generatedKeyHolder.addKey(Long.valueOf(objArr));
                }
                logger.trace("{}: insert statement is compiled and executed, changed {}: {}", (Object) this, Integer.valueOf(1), (Object) str);
                if (compileStatement != null) {
                    compileStatement.close();
                }
                return 1;
            } catch (SQLException e) {
                objArr = e;
                sQLiteStatement = compileStatement;
                try {
                    fieldTypeArr = new StringBuilder();
                    fieldTypeArr.append("inserting to database failed: ");
                    fieldTypeArr.append(str);
                    throw SqlExceptionUtil.create(fieldTypeArr.toString(), objArr);
                } catch (Throwable th) {
                    str = th;
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                sQLiteStatement = compileStatement;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                throw str;
            }
        } catch (SQLException e2) {
            objArr = e2;
            fieldTypeArr = new StringBuilder();
            fieldTypeArr.append("inserting to database failed: ");
            fieldTypeArr.append(str);
            throw SqlExceptionUtil.create(fieldTypeArr.toString(), objArr);
        }
    }

    public int update(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        return update(str, objArr, fieldTypeArr, "updated");
    }

    public int delete(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        return update(str, objArr, fieldTypeArr, "deleted");
    }

    public <T> Object queryForOne(String str, Object[] objArr, FieldType[] fieldTypeArr, GenericRowMapper<T> genericRowMapper, ObjectCache objectCache) {
        try {
            objArr = this.db.rawQuery(str, toStrings(objArr));
            try {
                Object androidDatabaseResults = new AndroidDatabaseResults(objArr, objectCache);
                logger.trace("{}: queried for one result: {}", (Object) this, (Object) str);
                if (androidDatabaseResults.first() == null) {
                    if (objArr != null) {
                        objArr.close();
                    }
                    return null;
                }
                fieldTypeArr = genericRowMapper.mapRow(androidDatabaseResults);
                if (androidDatabaseResults.next() != null) {
                    fieldTypeArr = MORE_THAN_ONE;
                    if (objArr != null) {
                        objArr.close();
                    }
                    return fieldTypeArr;
                }
                if (objArr != null) {
                    objArr.close();
                }
                return fieldTypeArr;
            } catch (SQLException e) {
                fieldTypeArr = e;
                try {
                    genericRowMapper = new StringBuilder();
                    genericRowMapper.append("queryForOne from database failed: ");
                    genericRowMapper.append(str);
                    throw SqlExceptionUtil.create(genericRowMapper.toString(), fieldTypeArr);
                } catch (Throwable th) {
                    str = th;
                    if (objArr != null) {
                        objArr.close();
                    }
                    throw str;
                }
            }
        } catch (FieldType[] e2) {
            fieldTypeArr = e2;
            objArr = null;
            genericRowMapper = new StringBuilder();
            genericRowMapper.append("queryForOne from database failed: ");
            genericRowMapper.append(str);
            throw SqlExceptionUtil.create(genericRowMapper.toString(), fieldTypeArr);
        } catch (Throwable th2) {
            str = th2;
            objArr = null;
            if (objArr != null) {
                objArr.close();
            }
            throw str;
        }
    }

    public long queryForLong(String str) {
        SQLiteStatement compileStatement;
        Throwable e;
        StringBuilder stringBuilder;
        try {
            compileStatement = this.db.compileStatement(str);
            try {
                long simpleQueryForLong = compileStatement.simpleQueryForLong();
                logger.trace("{}: query for long simple query returned {}: {}", (Object) this, Long.valueOf(simpleQueryForLong), (Object) str);
                if (compileStatement != null) {
                    compileStatement.close();
                }
                return simpleQueryForLong;
            } catch (SQLException e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("queryForLong from database failed: ");
                    stringBuilder.append(str);
                    throw SqlExceptionUtil.create(stringBuilder.toString(), e);
                } catch (Throwable th) {
                    str = th;
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                    throw str;
                }
            }
        } catch (Throwable e3) {
            Throwable th2 = e3;
            compileStatement = null;
            e = th2;
            stringBuilder = new StringBuilder();
            stringBuilder.append("queryForLong from database failed: ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        } catch (Throwable th3) {
            str = th3;
            compileStatement = null;
            if (compileStatement != null) {
                compileStatement.close();
            }
            throw str;
        }
    }

    public long queryForLong(String str, Object[] objArr, FieldType[] fieldTypeArr) {
        StringBuilder stringBuilder;
        try {
            objArr = this.db.rawQuery(str, toStrings(objArr));
            try {
                AndroidDatabaseResults androidDatabaseResults = new AndroidDatabaseResults(objArr, null);
                long j = androidDatabaseResults.first() != null ? androidDatabaseResults.getLong(null) : 0;
                logger.trace("{}: query for long raw query returned {}: {}", (Object) this, Long.valueOf(j), (Object) str);
                if (objArr != null) {
                    objArr.close();
                }
                return j;
            } catch (SQLException e) {
                fieldTypeArr = e;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("queryForLong from database failed: ");
                    stringBuilder.append(str);
                    throw SqlExceptionUtil.create(stringBuilder.toString(), fieldTypeArr);
                } catch (Throwable th) {
                    str = th;
                    if (objArr != null) {
                        objArr.close();
                    }
                    throw str;
                }
            }
        } catch (FieldType[] e2) {
            fieldTypeArr = e2;
            objArr = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append("queryForLong from database failed: ");
            stringBuilder.append(str);
            throw SqlExceptionUtil.create(stringBuilder.toString(), fieldTypeArr);
        } catch (Throwable th2) {
            str = th2;
            objArr = null;
            if (objArr != null) {
                objArr.close();
            }
            throw str;
        }
    }

    public void close() {
        try {
            this.db.close();
            logger.trace("{}: db {} closed", (Object) this, this.db);
        } catch (Throwable e) {
            throw SqlExceptionUtil.create("problems closing the database connection", e);
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
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidDatabaseConnection.closeQuietly():void");
    }

    public boolean isClosed() {
        try {
            boolean isOpen = this.db.isOpen();
            logger.trace("{}: db {} isOpen returned {}", (Object) this, this.db, Boolean.valueOf(isOpen));
            return isOpen ^ 1;
        } catch (Throwable e) {
            throw SqlExceptionUtil.create("problems detecting if the database is closed", e);
        }
    }

    public boolean isTableExists(String str) {
        SQLiteDatabase sQLiteDatabase = this.db;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = '");
        stringBuilder.append(str);
        stringBuilder.append("'");
        boolean stringBuilder2 = stringBuilder.toString();
        Cursor rawQuery = sQLiteDatabase.rawQuery(stringBuilder2, null);
        try {
            stringBuilder2 = rawQuery.getCount() > 0;
            logger.trace("{}: isTableExists '{}' returned {}", (Object) this, (Object) str, Boolean.valueOf(stringBuilder2));
            return stringBuilder2;
        } finally {
            rawQuery.close();
        }
    }

    private int update(java.lang.String r3, java.lang.Object[] r4, com.j256.ormlite.field.FieldType[] r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r1 = r2.db;	 Catch:{ SQLException -> 0x004e }
        r1 = r1.compileStatement(r3);	 Catch:{ SQLException -> 0x004e }
        r2.bindArgs(r1, r4, r5);	 Catch:{ SQLException -> 0x0049, all -> 0x0046 }
        r1.execute();	 Catch:{ SQLException -> 0x0049, all -> 0x0046 }
        if (r1 == 0) goto L_0x0013;
    L_0x000f:
        r1.close();
        goto L_0x0014;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r4 = r2.db;	 Catch:{ SQLException -> 0x0033, all -> 0x002c }
        r5 = "SELECT CHANGES()";	 Catch:{ SQLException -> 0x0033, all -> 0x002c }
        r4 = r4.compileStatement(r5);	 Catch:{ SQLException -> 0x0033, all -> 0x002c }
        r0 = r4.simpleQueryForLong();	 Catch:{ SQLException -> 0x002a, all -> 0x0027 }
        r5 = (int) r0;
        if (r4 == 0) goto L_0x003a;
    L_0x0023:
        r4.close();
        goto L_0x003a;
    L_0x0027:
        r3 = move-exception;
        r0 = r4;
        goto L_0x002d;
    L_0x002a:
        r0 = r4;
        goto L_0x0034;
    L_0x002c:
        r3 = move-exception;
    L_0x002d:
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();
    L_0x0032:
        throw r3;
    L_0x0034:
        r5 = 1;
        if (r0 == 0) goto L_0x003a;
    L_0x0037:
        r0.close();
    L_0x003a:
        r4 = logger;
        r0 = "{} statement is compiled and executed, changed {}: {}";
        r1 = java.lang.Integer.valueOf(r5);
        r4.trace(r0, r6, r1, r3);
        return r5;
    L_0x0046:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0065;
    L_0x0049:
        r4 = move-exception;
        r0 = r1;
        goto L_0x004f;
    L_0x004c:
        r3 = move-exception;
        goto L_0x0065;
    L_0x004e:
        r4 = move-exception;
    L_0x004f:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r5.<init>();	 Catch:{ all -> 0x004c }
        r6 = "updating database failed: ";	 Catch:{ all -> 0x004c }
        r5.append(r6);	 Catch:{ all -> 0x004c }
        r5.append(r3);	 Catch:{ all -> 0x004c }
        r3 = r5.toString();	 Catch:{ all -> 0x004c }
        r3 = com.j256.ormlite.misc.SqlExceptionUtil.create(r3, r4);	 Catch:{ all -> 0x004c }
        throw r3;	 Catch:{ all -> 0x004c }
    L_0x0065:
        if (r0 == 0) goto L_0x006a;
    L_0x0067:
        r0.close();
    L_0x006a:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidDatabaseConnection.update(java.lang.String, java.lang.Object[], com.j256.ormlite.field.FieldType[], java.lang.String):int");
    }

    private void bindArgs(SQLiteStatement sQLiteStatement, Object[] objArr, FieldType[] fieldTypeArr) {
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    sQLiteStatement.bindNull(i + 1);
                } else {
                    SqlType sqlType = fieldTypeArr[i].getSqlType();
                    switch (sqlType) {
                        case STRING:
                        case LONG_STRING:
                        case CHAR:
                            sQLiteStatement.bindString(i + 1, obj.toString());
                            break;
                        case BOOLEAN:
                        case BYTE:
                        case SHORT:
                        case INTEGER:
                        case LONG:
                            sQLiteStatement.bindLong(i + 1, ((Number) obj).longValue());
                            break;
                        case FLOAT:
                        case DOUBLE:
                            sQLiteStatement.bindDouble(i + 1, ((Number) obj).doubleValue());
                            break;
                        case BYTE_ARRAY:
                        case SERIALIZABLE:
                            sQLiteStatement.bindBlob(i + 1, (byte[]) obj);
                            break;
                        case DATE:
                        case BLOB:
                        case BIG_DECIMAL:
                            objArr = new StringBuilder();
                            objArr.append("Invalid Android type: ");
                            objArr.append(sqlType);
                            throw new java.sql.SQLException(objArr.toString());
                        default:
                            objArr = new StringBuilder();
                            objArr.append("Unknown sql argument type: ");
                            objArr.append(sqlType);
                            throw new java.sql.SQLException(objArr.toString());
                    }
                }
            }
        }
    }

    private String[] toStrings(Object[] objArr) {
        if (objArr != null) {
            if (objArr.length != 0) {
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        strArr[i] = null;
                    } else {
                        strArr[i] = obj.toString();
                    }
                }
                return strArr;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(super.hashCode()));
        return stringBuilder.toString();
    }
}
