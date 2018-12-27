package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.util.Arrays;
import java.util.List;

public class In extends BaseComparison {
    private final boolean in;
    private Iterable<?> objects;

    public /* bridge */ /* synthetic */ void appendSql(DatabaseType databaseType, String str, StringBuilder stringBuilder, List list) {
        super.appendSql(databaseType, str, stringBuilder, list);
    }

    public /* bridge */ /* synthetic */ String getColumnName() {
        return super.getColumnName();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public In(String str, FieldType fieldType, Iterable<?> iterable, boolean z) {
        super(str, fieldType, null, true);
        this.objects = iterable;
        this.in = z;
    }

    public In(String str, FieldType fieldType, Object[] objArr, boolean z) {
        super(str, fieldType, null, true);
        this.objects = Arrays.asList(objArr);
        this.in = z;
    }

    public void appendOperation(StringBuilder stringBuilder) {
        if (this.in) {
            stringBuilder.append("IN ");
        } else {
            stringBuilder.append("NOT IN ");
        }
    }

    public void appendValue(DatabaseType databaseType, StringBuilder stringBuilder, List<ArgumentHolder> list) {
        stringBuilder.append('(');
        Object obj = 1;
        for (Object next : this.objects) {
            if (next != null) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(',');
                }
                super.appendArgOrValue(databaseType, this.fieldType, stringBuilder, list, next);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("one of the IN values for '");
                stringBuilder.append(this.columnName);
                stringBuilder.append("' is null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        stringBuilder.append(") ");
    }
}
