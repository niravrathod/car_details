package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.util.Date;

public class DateStringType extends BaseDateType {
    public static int DEFAULT_WIDTH = 50;
    private static final DateStringType singleTon = new DateStringType();

    public static DateStringType getSingleton() {
        return singleTon;
    }

    private DateStringType() {
        super(SqlType.STRING, new Class[0]);
    }

    protected DateStringType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        DateStringFormatConfig convertDateStringConfig = BaseDateType.convertDateStringConfig(fieldType, defaultDateFormatConfig);
        try {
            return BaseDateType.normalizeDateString(convertDateStringConfig, str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with field ");
            stringBuilder.append(fieldType);
            stringBuilder.append(" parsing default date-string '");
            stringBuilder.append(str);
            stringBuilder.append("' using '");
            stringBuilder.append(convertDateStringConfig);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getString(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        String str = (String) obj;
        fieldType = BaseDateType.convertDateStringConfig(fieldType, defaultDateFormatConfig);
        try {
            return BaseDateType.parseDateString(fieldType, str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with column ");
            stringBuilder.append(i);
            stringBuilder.append(" parsing date-string '");
            stringBuilder.append(str);
            stringBuilder.append("' using '");
            stringBuilder.append(fieldType);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return BaseDateType.convertDateStringConfig(fieldType, defaultDateFormatConfig).getDateFormat().format((Date) obj);
    }

    public Object makeConfigObject(FieldType fieldType) {
        fieldType = fieldType.getFormat();
        if (fieldType == null) {
            return defaultDateFormatConfig;
        }
        return new DateStringFormatConfig(fieldType);
    }

    public int getDefaultWidth() {
        return DEFAULT_WIDTH;
    }

    public Object resultStringToJava(FieldType fieldType, String str, int i) {
        return sqlArgToJava(fieldType, str, i);
    }

    public Class<?> getPrimaryClass() {
        return byte[].class;
    }
}
