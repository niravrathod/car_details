package com.j256.ormlite.db;

import com.j256.ormlite.android.DatabaseTableConfigUtil;
import com.j256.ormlite.field.DataPersister;
import com.j256.ormlite.field.FieldConverter;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.DateStringType;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;

public class SqliteAndroidDatabaseType extends BaseSqliteDatabaseType {

    /* renamed from: com.j256.ormlite.db.SqliteAndroidDatabaseType$1 */
    static /* synthetic */ class C26691 {
        static final /* synthetic */ int[] $SwitchMap$com$j256$ormlite$field$SqlType = new int[SqlType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.j256.ormlite.field.SqlType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$j256$ormlite$field$SqlType = r0;
            r0 = $SwitchMap$com$j256$ormlite$field$SqlType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.j256.ormlite.field.SqlType.DATE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.db.SqliteAndroidDatabaseType.1.<clinit>():void");
        }
    }

    public String getDatabaseName() {
        return "Android SQLite";
    }

    protected String getDriverClassName() {
        return null;
    }

    public boolean isBatchUseTransaction() {
        return true;
    }

    public boolean isDatabaseUrlThisType(String str, String str2) {
        return true;
    }

    public boolean isNestedSavePointsSupported() {
        return false;
    }

    public void loadDriver() {
    }

    protected void appendDateType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        appendStringType(stringBuilder, fieldType, i);
    }

    protected void appendBooleanType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        appendShortType(stringBuilder, fieldType, i);
    }

    public FieldConverter getFieldConverter(DataPersister dataPersister) {
        if (C26691.$SwitchMap$com$j256$ormlite$field$SqlType[dataPersister.getSqlType().ordinal()] != 1) {
            return super.getFieldConverter(dataPersister);
        }
        return DateStringType.getSingleton();
    }

    public <T> DatabaseTableConfig<T> extractDatabaseTableConfig(ConnectionSource connectionSource, Class<T> cls) {
        return DatabaseTableConfigUtil.fromClass(connectionSource, cls);
    }
}
