package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import java.util.Arrays;

public class ByteArrayType extends BaseDataType {
    private static final ByteArrayType singleTon = new ByteArrayType();

    public boolean isAppropriateId() {
        return false;
    }

    public boolean isArgumentHolderRequired() {
        return true;
    }

    public static ByteArrayType getSingleton() {
        return singleTon;
    }

    private ByteArrayType() {
        super(SqlType.BYTE_ARRAY, new Class[0]);
    }

    protected ByteArrayType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        throw new SQLException("byte[] type cannot have default values");
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getBytes(i);
    }

    public boolean dataIsEqual(Object obj, Object obj2) {
        boolean z = false;
        if (obj != null) {
            return obj2 == null ? false : Arrays.equals((byte[]) obj, (byte[]) obj2);
        } else {
            if (obj2 == null) {
                z = true;
            }
            return z;
        }
    }

    public Object resultStringToJava(FieldType fieldType, String str, int i) {
        throw new SQLException("byte[] type cannot be converted from string to Java");
    }

    public Class<?> getPrimaryClass() {
        return byte[].class;
    }
}
