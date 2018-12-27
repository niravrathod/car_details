package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.math.BigDecimal;

public class BigDecimalNumericType extends BaseDataType {
    private static final BigDecimalNumericType singleTon = new BigDecimalNumericType();

    public boolean isAppropriateId() {
        return false;
    }

    public boolean isEscapedValue() {
        return false;
    }

    public static BigDecimalNumericType getSingleton() {
        return singleTon;
    }

    private BigDecimalNumericType() {
        super(SqlType.BIG_DECIMAL, new Class[0]);
    }

    protected BigDecimalNumericType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        try {
            return new BigDecimal(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Problems with field ");
            stringBuilder.append(fieldType);
            stringBuilder.append(" parsing default BigDecimal string '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return databaseResults.getBigDecimal(i);
    }

    public Class<?> getPrimaryClass() {
        return BigDecimal.class;
    }
}
