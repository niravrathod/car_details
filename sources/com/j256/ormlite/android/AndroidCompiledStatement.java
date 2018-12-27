package com.j256.ormlite.android;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.compat.ApiCompatibility;
import com.j256.ormlite.android.compat.ApiCompatibility.CancellationHook;
import com.j256.ormlite.android.compat.ApiCompatibilityUtils;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AndroidCompiledStatement implements CompiledStatement {
    private static final String[] NO_STRING_ARGS = new String[0];
    private static final ApiCompatibility apiCompatibility = ApiCompatibilityUtils.getCompatibility();
    private static Logger logger = LoggerFactory.getLogger(AndroidCompiledStatement.class);
    private List<Object> args;
    private final boolean cancelQueriesEnabled;
    private CancellationHook cancellationHook;
    private Cursor cursor;
    private final SQLiteDatabase db;
    private Integer max;
    private final String sql;
    private final StatementType type;

    public void setQueryTimeout(long j) {
    }

    public AndroidCompiledStatement(String str, SQLiteDatabase sQLiteDatabase, StatementType statementType, boolean z) {
        this.sql = str;
        this.db = sQLiteDatabase;
        this.type = statementType;
        this.cancelQueriesEnabled = z;
    }

    public int getColumnCount() {
        return getCursor().getColumnCount();
    }

    public String getColumnName(int i) {
        return getCursor().getColumnName(i);
    }

    public DatabaseResults runQuery(ObjectCache objectCache) {
        if (this.type.isOkForQuery()) {
            return new AndroidDatabaseResults(getCursor(), objectCache);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call query on a ");
        stringBuilder.append(this.type);
        stringBuilder.append(" statement");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int runUpdate() {
        if (this.type.isOkForUpdate()) {
            String str;
            if (this.max == null) {
                str = this.sql;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.sql);
                stringBuilder.append(" ");
                stringBuilder.append(this.max);
                str = stringBuilder.toString();
            }
            return execSql(this.db, "runUpdate", str, getArgArray());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Cannot call update on a ");
        stringBuilder2.append(this.type);
        stringBuilder2.append(" statement");
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    public int runExecute() {
        if (this.type.isOkForExecute()) {
            return execSql(this.db, "runExecute", this.sql, getArgArray());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call execute on a ");
        stringBuilder.append(this.type);
        stringBuilder.append(" statement");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void close() {
        if (this.cursor != null) {
            try {
                this.cursor.close();
            } catch (Throwable e) {
                throw SqlExceptionUtil.create("Problems closing Android cursor", e);
            }
        }
        this.cancellationHook = null;
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
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidCompiledStatement.closeQuietly():void");
    }

    public void cancel() {
        if (this.cancellationHook != null) {
            this.cancellationHook.cancel();
        }
    }

    public void setObject(int i, Object obj, SqlType sqlType) {
        isInPrep();
        if (this.args == null) {
            this.args = new ArrayList();
        }
        if (obj == null) {
            this.args.add(i, null);
            return;
        }
        switch (sqlType) {
            case STRING:
            case LONG_STRING:
            case DATE:
            case BOOLEAN:
            case CHAR:
            case BYTE:
            case SHORT:
            case INTEGER:
            case LONG:
            case FLOAT:
            case DOUBLE:
                this.args.add(i, obj.toString());
                break;
            case BYTE_ARRAY:
            case SERIALIZABLE:
                this.args.add(i, obj);
                break;
            case BLOB:
            case BIG_DECIMAL:
                obj = new StringBuilder();
                obj.append("Invalid Android type: ");
                obj.append(sqlType);
                throw new SQLException(obj.toString());
            default:
                obj = new StringBuilder();
                obj.append("Unknown sql argument type: ");
                obj.append(sqlType);
                throw new SQLException(obj.toString());
        }
    }

    public void setMaxRows(int i) {
        isInPrep();
        this.max = Integer.valueOf(i);
    }

    public Cursor getCursor() {
        if (this.cursor == null) {
            try {
                String str;
                if (this.max == null) {
                    str = this.sql;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.sql);
                    stringBuilder.append(" ");
                    stringBuilder.append(this.max);
                    str = stringBuilder.toString();
                }
                Object obj = str;
                if (this.cancelQueriesEnabled) {
                    this.cancellationHook = apiCompatibility.createCancellationHook();
                }
                this.cursor = apiCompatibility.rawQuery(this.db, obj, getStringArray(), this.cancellationHook);
                this.cursor.moveToFirst();
                logger.trace("{}: started rawQuery cursor for: {}", (Object) this, obj);
            } catch (Throwable e) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Problems executing Android query: ");
                stringBuilder2.append(null);
                throw SqlExceptionUtil.create(stringBuilder2.toString(), e);
            }
        }
        return this.cursor;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(super.hashCode()));
        return stringBuilder.toString();
    }

    static int execSql(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3, java.lang.String r4, java.lang.Object[] r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2.execSQL(r4, r5);	 Catch:{ SQLException -> 0x0035 }
        r5 = 0;
        r0 = "SELECT CHANGES()";	 Catch:{ SQLException -> 0x0022, all -> 0x001b }
        r2 = r2.compileStatement(r0);	 Catch:{ SQLException -> 0x0022, all -> 0x001b }
        r0 = r2.simpleQueryForLong();	 Catch:{ SQLException -> 0x0019, all -> 0x0016 }
        r5 = (int) r0;
        if (r2 == 0) goto L_0x0014;
    L_0x0011:
        r2.close();
    L_0x0014:
        r2 = r5;
        goto L_0x0029;
    L_0x0016:
        r3 = move-exception;
        r5 = r2;
        goto L_0x001c;
    L_0x0019:
        r5 = r2;
        goto L_0x0023;
    L_0x001b:
        r3 = move-exception;
    L_0x001c:
        if (r5 == 0) goto L_0x0021;
    L_0x001e:
        r5.close();
    L_0x0021:
        throw r3;
    L_0x0023:
        r2 = 1;
        if (r5 == 0) goto L_0x0029;
    L_0x0026:
        r5.close();
    L_0x0029:
        r5 = logger;
        r0 = "executing statement {} changed {} rows: {}";
        r1 = java.lang.Integer.valueOf(r2);
        r5.trace(r0, r3, r1, r4);
        return r2;
    L_0x0035:
        r2 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = "Problems executing ";
        r5.append(r0);
        r5.append(r3);
        r3 = " Android statement: ";
        r5.append(r3);
        r5.append(r4);
        r3 = r5.toString();
        r2 = com.j256.ormlite.misc.SqlExceptionUtil.create(r3, r2);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidCompiledStatement.execSql(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.Object[]):int");
    }

    private void isInPrep() {
        if (this.cursor != null) {
            throw new SQLException("Query already run. Cannot add argument values.");
        }
    }

    private Object[] getArgArray() {
        if (this.args == null) {
            return NO_STRING_ARGS;
        }
        return this.args.toArray(new Object[this.args.size()]);
    }

    private String[] getStringArray() {
        if (this.args == null) {
            return NO_STRING_ARGS;
        }
        return (String[]) this.args.toArray(new String[this.args.size()]);
    }
}
