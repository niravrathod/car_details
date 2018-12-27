package com.j256.ormlite.stmt;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;

public class NullArgHolder implements ArgumentHolder {
    public String getColumnName() {
        return "null-holder";
    }

    public FieldType getFieldType() {
        return null;
    }

    public Object getSqlArgValue() {
        return null;
    }

    public void setMetaInfo(FieldType fieldType) {
    }

    public void setMetaInfo(String str) {
    }

    public void setMetaInfo(String str, FieldType fieldType) {
    }

    public void setValue(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot set null on ");
        stringBuilder.append(getClass());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public SqlType getSqlType() {
        return SqlType.STRING;
    }
}
