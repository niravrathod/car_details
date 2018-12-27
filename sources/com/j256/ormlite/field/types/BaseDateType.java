package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseDateType extends BaseDataType {
    protected static final DateStringFormatConfig defaultDateFormatConfig = new DateStringFormatConfig("yyyy-MM-dd HH:mm:ss.SSSSSS");

    protected static class DateStringFormatConfig {
        final String dateFormatStr;
        private final ThreadLocal<DateFormat> threadLocal = new C26711();

        /* renamed from: com.j256.ormlite.field.types.BaseDateType$DateStringFormatConfig$1 */
        class C26711 extends ThreadLocal<DateFormat> {
            C26711() {
            }

            protected DateFormat initialValue() {
                return new SimpleDateFormat(DateStringFormatConfig.this.dateFormatStr);
            }
        }

        public DateStringFormatConfig(String str) {
            this.dateFormatStr = str;
        }

        public DateFormat getDateFormat() {
            return (DateFormat) this.threadLocal.get();
        }

        public String toString() {
            return this.dateFormatStr;
        }
    }

    public boolean isValidForVersion() {
        return true;
    }

    protected BaseDateType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    protected static DateStringFormatConfig convertDateStringConfig(FieldType fieldType, DateStringFormatConfig dateStringFormatConfig) {
        if (fieldType == null) {
            return dateStringFormatConfig;
        }
        DateStringFormatConfig dateStringFormatConfig2 = (DateStringFormatConfig) fieldType.getDataTypeConfigObj();
        return dateStringFormatConfig2 == null ? dateStringFormatConfig : dateStringFormatConfig2;
    }

    protected static Date parseDateString(DateStringFormatConfig dateStringFormatConfig, String str) {
        return dateStringFormatConfig.getDateFormat().parse(str);
    }

    protected static String normalizeDateString(DateStringFormatConfig dateStringFormatConfig, String str) {
        dateStringFormatConfig = dateStringFormatConfig.getDateFormat();
        return dateStringFormatConfig.format(dateStringFormatConfig.parse(str));
    }

    public Object moveToNextValue(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        if (obj == null) {
            return new Date(currentTimeMillis);
        }
        if (currentTimeMillis == ((Date) obj).getTime()) {
            return new Date(currentTimeMillis + 1);
        }
        return new Date(currentTimeMillis);
    }

    public boolean isValidForField(Field field) {
        return field.getType() == Date.class ? true : null;
    }
}
