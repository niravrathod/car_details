package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import com.j256.ormlite.stmt.ColumnArg;
import com.j256.ormlite.stmt.SelectArg;
import java.sql.SQLException;
import java.util.List;

abstract class BaseComparison implements Comparison {
    private static final String NUMBER_CHARACTERS = "0123456789.-+";
    protected final String columnName;
    protected final FieldType fieldType;
    private final Object value;

    public abstract void appendOperation(StringBuilder stringBuilder);

    protected BaseComparison(String str, FieldType fieldType, Object obj, boolean z) {
        if (z && fieldType != null) {
            if (!fieldType.isComparable()) {
                z = new StringBuilder();
                z.append("Field '");
                z.append(str);
                z.append("' is of data type ");
                z.append(fieldType.getDataPersister());
                z.append(" which can not be compared");
                throw new SQLException(z.toString());
            }
        }
        this.columnName = str;
        this.fieldType = fieldType;
        this.value = obj;
    }

    public void appendSql(DatabaseType databaseType, String str, StringBuilder stringBuilder, List<ArgumentHolder> list) {
        if (str != null) {
            databaseType.appendEscapedEntityName(stringBuilder, str);
            stringBuilder.append('.');
        }
        databaseType.appendEscapedEntityName(stringBuilder, this.columnName);
        stringBuilder.append(' ');
        appendOperation(stringBuilder);
        appendValue(databaseType, stringBuilder, list);
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void appendValue(DatabaseType databaseType, StringBuilder stringBuilder, List<ArgumentHolder> list) {
        appendArgOrValue(databaseType, this.fieldType, stringBuilder, list, this.value);
    }

    protected void appendArgOrValue(DatabaseType databaseType, FieldType fieldType, StringBuilder stringBuilder, List<ArgumentHolder> list, Object obj) {
        if (obj != null) {
            int i = 0;
            if (obj instanceof ArgumentHolder) {
                stringBuilder.append('?');
                ArgumentHolder argumentHolder = (ArgumentHolder) obj;
                argumentHolder.setMetaInfo(this.columnName, fieldType);
                list.add(argumentHolder);
            } else if (obj instanceof ColumnArg) {
                ColumnArg columnArg = (ColumnArg) obj;
                fieldType = columnArg.getTableName();
                if (fieldType != null) {
                    databaseType.appendEscapedEntityName(stringBuilder, fieldType);
                    stringBuilder.append('.');
                }
                databaseType.appendEscapedEntityName(stringBuilder, columnArg.getColumnName());
            } else if (fieldType.isArgumentHolderRequired()) {
                stringBuilder.append('?');
                databaseType = new SelectArg();
                databaseType.setMetaInfo(this.columnName, fieldType);
                databaseType.setValue(obj);
                list.add(databaseType);
            } else if (fieldType.isForeign() && fieldType.getType().isAssignableFrom(obj.getClass())) {
                FieldType foreignIdField = fieldType.getForeignIdField();
                appendArgOrValue(databaseType, foreignIdField, stringBuilder, list, foreignIdField.extractJavaFieldValue(obj));
                if (i != 0) {
                    stringBuilder.append(' ');
                    return;
                }
                return;
            } else if (fieldType.isEscapedValue() != null) {
                databaseType.appendEscapedWord(stringBuilder, fieldType.convertJavaFieldToSqlArgValue(obj).toString());
            } else if (fieldType.isForeign() != null) {
                databaseType = fieldType.convertJavaFieldToSqlArgValue(obj).toString();
                if (databaseType.length() > null) {
                    if (NUMBER_CHARACTERS.indexOf(databaseType.charAt(0)) < null) {
                        list = new StringBuilder();
                        list.append("Foreign field ");
                        list.append(fieldType);
                        list.append(" does not seem to be producing a numerical value '");
                        list.append(databaseType);
                        list.append("'. Maybe you are passing the wrong object to comparison: ");
                        list.append(this);
                        throw new SQLException(list.toString());
                    }
                }
                stringBuilder.append(databaseType);
            } else {
                stringBuilder.append(fieldType.convertJavaFieldToSqlArgValue(obj));
            }
            i = 1;
            if (i != 0) {
                stringBuilder.append(' ');
                return;
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("argument for '");
        stringBuilder.append(fieldType.getFieldName());
        stringBuilder.append("' is null");
        throw new SQLException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.columnName);
        stringBuilder.append(' ');
        appendOperation(stringBuilder);
        stringBuilder.append(' ');
        stringBuilder.append(this.value);
        return stringBuilder.toString();
    }
}
