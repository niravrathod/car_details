package com.j256.ormlite.db;

import com.j256.ormlite.field.DataPersister;
import com.j256.ormlite.field.FieldConverter;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.field.types.BigDecimalStringType;
import java.util.List;

public abstract class BaseSqliteDatabaseType extends BaseDatabaseType {
    private static final FieldConverter booleanConverter = new BooleanNumberFieldConverter();

    protected boolean generatedIdSqlAtEnd() {
        return false;
    }

    public boolean isCreateIfNotExistsSupported() {
        return true;
    }

    public boolean isCreateTableReturnsZero() {
        return false;
    }

    public boolean isVarcharFieldWidthSupported() {
        return false;
    }

    protected void appendLongType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        if (fieldType.getSqlType() != SqlType.LONG || fieldType.isGeneratedId() == null) {
            stringBuilder.append("BIGINT");
        } else {
            stringBuilder.append("INTEGER");
        }
    }

    protected void configureGeneratedId(String str, StringBuilder stringBuilder, FieldType fieldType, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        if (fieldType.getSqlType() != SqlType.INTEGER) {
            if (fieldType.getSqlType() != SqlType.LONG) {
                throw new IllegalArgumentException("Sqlite requires that auto-increment generated-id be integer or long type");
            }
        }
        stringBuilder.append("PRIMARY KEY AUTOINCREMENT ");
    }

    public FieldConverter getFieldConverter(DataPersister dataPersister) {
        switch (dataPersister.getSqlType()) {
            case BOOLEAN:
                return booleanConverter;
            case BIG_DECIMAL:
                return BigDecimalStringType.getSingleton();
            default:
                return super.getFieldConverter(dataPersister);
        }
    }

    public void appendInsertNoColumns(StringBuilder stringBuilder) {
        stringBuilder.append("DEFAULT VALUES");
    }
}
