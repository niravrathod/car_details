package com.j256.ormlite.stmt;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import java.sql.SQLException;

public abstract class BaseArgumentHolder implements ArgumentHolder {
    private String columnName = null;
    private FieldType fieldType = null;
    private SqlType sqlType = null;

    protected abstract Object getValue();

    protected abstract boolean isValueSet();

    public abstract void setValue(Object obj);

    public BaseArgumentHolder(String str) {
        this.columnName = str;
    }

    public BaseArgumentHolder(SqlType sqlType) {
        this.sqlType = sqlType;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void setMetaInfo(String str) {
        if (this.columnName != null) {
            if (!this.columnName.equals(str)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Column name cannot be set twice from ");
                stringBuilder.append(this.columnName);
                stringBuilder.append(" to ");
                stringBuilder.append(str);
                stringBuilder.append(".  Using a SelectArg twice in query with different columns?");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.columnName = str;
    }

    public void setMetaInfo(FieldType fieldType) {
        if (this.fieldType != null) {
            if (this.fieldType != fieldType) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FieldType name cannot be set twice from ");
                stringBuilder.append(this.fieldType);
                stringBuilder.append(" to ");
                stringBuilder.append(fieldType);
                stringBuilder.append(".  Using a SelectArg twice in query with different columns?");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.fieldType = fieldType;
    }

    public void setMetaInfo(String str, FieldType fieldType) {
        setMetaInfo(str);
        setMetaInfo(fieldType);
    }

    public Object getSqlArgValue() {
        if (isValueSet()) {
            Object value = getValue();
            if (value == null) {
                return null;
            }
            if (this.fieldType == null) {
                return value;
            }
            if (this.fieldType.isForeign() && this.fieldType.getType() == value.getClass()) {
                return this.fieldType.getForeignIdField().extractJavaFieldValue(value);
            }
            return this.fieldType.convertJavaFieldToSqlArgValue(value);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Column value has not been set for ");
        stringBuilder.append(this.columnName);
        throw new SQLException(stringBuilder.toString());
    }

    public FieldType getFieldType() {
        return this.fieldType;
    }

    public SqlType getSqlType() {
        return this.sqlType;
    }

    public String toString() {
        if (!isValueSet()) {
            return "[unset]";
        }
        try {
            Object sqlArgValue = getSqlArgValue();
            if (sqlArgValue == null) {
                return "[null]";
            }
            return sqlArgValue.toString();
        } catch (SQLException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[could not get value: ");
            stringBuilder.append(e);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}
