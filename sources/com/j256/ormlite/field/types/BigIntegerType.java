package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.math.BigInteger;

public class BigIntegerType extends BaseDataType {
    public static int DEFAULT_WIDTH = 255;
    private static final BigIntegerType singleTon = new BigIntegerType();

    public boolean isAppropriateId() {
        return false;
    }

    public static BigIntegerType getSingleton() {
        return singleTon;
    }

    protected BigIntegerType() {
        super(SqlType.STRING, new Class[]{BigInteger.class});
    }

    protected BigIntegerType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        try {
            return new BigInteger(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with field ");
            stringBuilder.append(fieldType);
            stringBuilder.append(" parsing default BigInteger string '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getString(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        try {
            return new BigInteger((String) obj);
        } catch (FieldType fieldType2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with column ");
            stringBuilder.append(i);
            stringBuilder.append(" parsing BigInteger string '");
            stringBuilder.append(obj);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), fieldType2);
        }
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return ((BigInteger) obj).toString();
    }

    public int getDefaultWidth() {
        return DEFAULT_WIDTH;
    }
}
