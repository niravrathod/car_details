package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.util.List;

public class IsNull extends BaseComparison {
    public void appendValue(DatabaseType databaseType, StringBuilder stringBuilder, List<ArgumentHolder> list) {
    }

    public /* bridge */ /* synthetic */ void appendSql(DatabaseType databaseType, String str, StringBuilder stringBuilder, List list) {
        super.appendSql(databaseType, str, stringBuilder, list);
    }

    public /* bridge */ /* synthetic */ String getColumnName() {
        return super.getColumnName();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public IsNull(String str, FieldType fieldType) {
        super(str, fieldType, null, true);
    }

    public void appendOperation(StringBuilder stringBuilder) {
        stringBuilder.append("IS NULL ");
    }
}
