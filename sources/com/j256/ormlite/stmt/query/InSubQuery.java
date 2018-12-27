package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.ArgumentHolder;
import com.j256.ormlite.stmt.QueryBuilder.InternalQueryBuilderWrapper;
import java.sql.SQLException;
import java.util.List;

public class InSubQuery extends BaseComparison {
    private final boolean in;
    private final InternalQueryBuilderWrapper subQueryBuilder;

    public /* bridge */ /* synthetic */ void appendSql(DatabaseType databaseType, String str, StringBuilder stringBuilder, List list) {
        super.appendSql(databaseType, str, stringBuilder, list);
    }

    public /* bridge */ /* synthetic */ String getColumnName() {
        return super.getColumnName();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public InSubQuery(String str, FieldType fieldType, InternalQueryBuilderWrapper internalQueryBuilderWrapper, boolean z) {
        super(str, fieldType, null, true);
        this.subQueryBuilder = internalQueryBuilderWrapper;
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
        this.subQueryBuilder.appendStatementString(stringBuilder, list);
        databaseType = this.subQueryBuilder.getResultFieldTypes();
        if (databaseType != null) {
            if (databaseType.length != 1) {
                list = new StringBuilder();
                list.append("There must be only 1 result column in sub-query but we found ");
                list.append(databaseType.length);
                throw new SQLException(list.toString());
            } else if (this.fieldType.getSqlType() != databaseType[0].getSqlType()) {
                list = new StringBuilder();
                list.append("Outer column ");
                list.append(this.fieldType);
                list.append(" is not the same type as inner column ");
                list.append(databaseType[0]);
                throw new SQLException(list.toString());
            }
        }
        stringBuilder.append(") ");
    }
}
