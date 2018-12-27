package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.util.UUID;

public class UuidType extends BaseDataType {
    public static int DEFAULT_WIDTH = 48;
    private static final UuidType singleTon = new UuidType();

    public boolean isSelfGeneratedId() {
        return true;
    }

    public boolean isValidGeneratedType() {
        return true;
    }

    public static UuidType getSingleton() {
        return singleTon;
    }

    private UuidType() {
        super(SqlType.STRING, new Class[]{UUID.class});
    }

    protected UuidType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        try {
            return UUID.fromString(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with field ");
            stringBuilder.append(fieldType);
            stringBuilder.append(" parsing default UUID-string '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getString(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        String str = (String) obj;
        try {
            return UUID.fromString(str);
        } catch (FieldType fieldType2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with column ");
            stringBuilder.append(i);
            stringBuilder.append(" parsing UUID-string '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), fieldType2);
        }
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return ((UUID) obj).toString();
    }

    public Object generateId() {
        return UUID.randomUUID();
    }

    public int getDefaultWidth() {
        return DEFAULT_WIDTH;
    }
}
