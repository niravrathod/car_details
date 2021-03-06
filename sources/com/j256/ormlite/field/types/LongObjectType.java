package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.support.DatabaseResults;

public class LongObjectType extends BaseDataType {
    private static final LongObjectType singleTon = new LongObjectType();

    public boolean isEscapedValue() {
        return false;
    }

    public boolean isValidForVersion() {
        return true;
    }

    public boolean isValidGeneratedType() {
        return true;
    }

    public static LongObjectType getSingleton() {
        return singleTon;
    }

    private LongObjectType() {
        super(SqlType.LONG, new Class[]{Long.class});
    }

    protected LongObjectType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return Long.valueOf(databaseResults.getLong(i));
    }

    public Object convertIdNumber(Number number) {
        return Long.valueOf(number.longValue());
    }

    public Object moveToNextValue(Object obj) {
        if (obj == null) {
            return Long.valueOf(1);
        }
        return Long.valueOf(((Long) obj).longValue() + 1);
    }
}
