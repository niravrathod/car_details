package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.util.List;

public class Between extends BaseComparison {
    private Object high;
    private Object low;

    public /* bridge */ /* synthetic */ void appendSql(DatabaseType databaseType, String str, StringBuilder stringBuilder, List list) {
        super.appendSql(databaseType, str, stringBuilder, list);
    }

    public /* bridge */ /* synthetic */ String getColumnName() {
        return super.getColumnName();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Between(String str, FieldType fieldType, Object obj, Object obj2) {
        super(str, fieldType, null, true);
        this.low = obj;
        this.high = obj2;
    }

    public void appendOperation(StringBuilder stringBuilder) {
        stringBuilder.append("BETWEEN ");
    }

    public void appendValue(DatabaseType databaseType, StringBuilder stringBuilder, List<ArgumentHolder> list) {
        if (this.low == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("BETWEEN low value for '");
            stringBuilder.append(this.columnName);
            stringBuilder.append("' is null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.high != null) {
            DatabaseType databaseType2 = databaseType;
            StringBuilder stringBuilder2 = stringBuilder;
            List<ArgumentHolder> list2 = list;
            appendArgOrValue(databaseType2, this.fieldType, stringBuilder2, list2, this.low);
            stringBuilder.append("AND ");
            appendArgOrValue(databaseType2, this.fieldType, stringBuilder2, list2, this.high);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("BETWEEN high value for '");
            stringBuilder.append(this.columnName);
            stringBuilder.append("' is null");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
