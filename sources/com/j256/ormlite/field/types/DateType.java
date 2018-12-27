package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.Timestamp;
import java.util.Date;

public class DateType extends BaseDateType {
    private static final DateType singleTon = new DateType();

    public boolean isArgumentHolderRequired() {
        return true;
    }

    public static DateType getSingleton() {
        return singleTon;
    }

    private DateType() {
        super(SqlType.DATE, new Class[]{Date.class});
    }

    protected DateType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        fieldType = BaseDateType.convertDateStringConfig(fieldType, getDefaultDateFormatConfig());
        try {
            return new Timestamp(BaseDateType.parseDateString(fieldType, str).getTime());
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems parsing default date string '");
            stringBuilder.append(str);
            stringBuilder.append("' using '");
            stringBuilder.append(fieldType);
            stringBuilder.append('\'');
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getTimestamp(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        return new Date(((Timestamp) obj).getTime());
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return new Timestamp(((Date) obj).getTime());
    }

    protected DateStringFormatConfig getDefaultDateFormatConfig() {
        return defaultDateFormatConfig;
    }
}
