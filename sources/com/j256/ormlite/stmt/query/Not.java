package com.j256.ormlite.stmt.query;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.stmt.ArgumentHolder;
import java.util.List;

public class Not implements Clause, NeedsFutureClause {
    private Comparison comparison = null;
    private Exists exists = null;

    public Not(Clause clause) {
        setMissingClause(clause);
    }

    public void setMissingClause(Clause clause) {
        if (this.comparison != null) {
            throw new IllegalArgumentException("NOT operation already has a comparison set");
        } else if (clause instanceof Comparison) {
            this.comparison = (Comparison) clause;
        } else if (clause instanceof Exists) {
            this.exists = (Exists) clause;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NOT operation can only work with comparison SQL clauses, not ");
            stringBuilder.append(clause);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public void appendSql(DatabaseType databaseType, String str, StringBuilder stringBuilder, List<ArgumentHolder> list) {
        if (this.comparison == null) {
            if (this.exists == null) {
                throw new IllegalStateException("Clause has not been set in NOT operation");
            }
        }
        if (this.comparison == null) {
            stringBuilder.append("(NOT ");
            this.exists.appendSql(databaseType, str, stringBuilder, list);
        } else {
            stringBuilder.append("(NOT ");
            if (str != null) {
                databaseType.appendEscapedEntityName(stringBuilder, str);
                stringBuilder.append('.');
            }
            databaseType.appendEscapedEntityName(stringBuilder, this.comparison.getColumnName());
            stringBuilder.append(' ');
            this.comparison.appendOperation(stringBuilder);
            this.comparison.appendValue(databaseType, stringBuilder, list);
        }
        stringBuilder.append(") ");
    }

    public String toString() {
        if (this.comparison == null) {
            return "NOT without comparison";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NOT comparison ");
        stringBuilder.append(this.comparison);
        return stringBuilder.toString();
    }
}
