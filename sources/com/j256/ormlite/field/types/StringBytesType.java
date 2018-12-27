package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;

public class StringBytesType extends BaseDataType {
    private static final String DEFAULT_STRING_BYTES_CHARSET_NAME = "Unicode";
    private static final StringBytesType singleTon = new StringBytesType();

    public boolean isAppropriateId() {
        return false;
    }

    public boolean isArgumentHolderRequired() {
        return true;
    }

    public static StringBytesType getSingleton() {
        return singleTon;
    }

    private StringBytesType() {
        super(SqlType.BYTE_ARRAY, new Class[0]);
    }

    protected StringBytesType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        throw new SQLException("String-bytes type cannot have default values");
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getBytes(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        fieldType = getCharsetName(fieldType);
        try {
            return new String(bArr, fieldType);
        } catch (Object obj2) {
            i = new StringBuilder();
            i.append("Could not convert string with charset name: ");
            i.append(fieldType);
            throw SqlExceptionUtil.create(i.toString(), obj2);
        }
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        String str = (String) obj;
        fieldType = getCharsetName(fieldType);
        try {
            return str.getBytes(fieldType);
        } catch (Object obj2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not convert string with charset name: ");
            stringBuilder.append(fieldType);
            throw SqlExceptionUtil.create(stringBuilder.toString(), obj2);
        }
    }

    public Object resultStringToJava(FieldType fieldType, String str, int i) {
        throw new SQLException("String-bytes type cannot be converted from string to Java");
    }

    public Class<?> getPrimaryClass() {
        return String.class;
    }

    private String getCharsetName(FieldType fieldType) {
        if (fieldType != null) {
            if (fieldType.getFormat() != null) {
                return fieldType.getFormat();
            }
        }
        return DEFAULT_STRING_BYTES_CHARSET_NAME;
    }
}
