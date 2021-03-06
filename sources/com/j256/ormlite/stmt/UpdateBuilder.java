package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.stmt.query.Clause;
import com.j256.ormlite.stmt.query.SetExpression;
import com.j256.ormlite.stmt.query.SetValue;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UpdateBuilder<T, ID> extends StatementBuilder<T, ID> {
    private List<Clause> updateClauseList = null;

    protected void appendStatementEnd(StringBuilder stringBuilder, List<ArgumentHolder> list) {
    }

    public UpdateBuilder(DatabaseType databaseType, TableInfo<T, ID> tableInfo, Dao<T, ID> dao) {
        super(databaseType, tableInfo, dao, StatementType.UPDATE);
    }

    public PreparedUpdate<T> prepare() {
        return super.prepareStatement(null);
    }

    public StatementBuilder<T, ID> updateColumnValue(String str, Object obj) {
        FieldType verifyColumnName = verifyColumnName(str);
        if (verifyColumnName.isForeignCollection()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't update foreign colletion field: ");
            stringBuilder.append(str);
            throw new SQLException(stringBuilder.toString());
        }
        addUpdateColumnToList(str, new SetValue(str, verifyColumnName, obj));
        return this;
    }

    public StatementBuilder<T, ID> updateColumnExpression(String str, String str2) {
        FieldType verifyColumnName = verifyColumnName(str);
        if (verifyColumnName.isForeignCollection()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't update foreign colletion field: ");
            stringBuilder.append(str);
            throw new SQLException(stringBuilder.toString());
        }
        addUpdateColumnToList(str, new SetExpression(str, verifyColumnName, str2));
        return this;
    }

    public void escapeColumnName(StringBuilder stringBuilder, String str) {
        this.databaseType.appendEscapedEntityName(stringBuilder, str);
    }

    public String escapeColumnName(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length() + 4);
        this.databaseType.appendEscapedEntityName(stringBuilder, str);
        return stringBuilder.toString();
    }

    public void escapeValue(StringBuilder stringBuilder, String str) {
        this.databaseType.appendEscapedWord(stringBuilder, str);
    }

    public String escapeValue(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length() + 4);
        this.databaseType.appendEscapedWord(stringBuilder, str);
        return stringBuilder.toString();
    }

    public int update() {
        return this.dao.update(prepare());
    }

    @Deprecated
    public void clear() {
        reset();
    }

    public void reset() {
        super.reset();
        this.updateClauseList = null;
    }

    protected void appendStatementStart(StringBuilder stringBuilder, List<ArgumentHolder> list) {
        if (this.updateClauseList == null || this.updateClauseList.isEmpty()) {
            throw new IllegalArgumentException("UPDATE statements must have at least one SET column");
        }
        stringBuilder.append("UPDATE ");
        this.databaseType.appendEscapedEntityName(stringBuilder, this.tableInfo.getTableName());
        stringBuilder.append(" SET ");
        Object obj = 1;
        for (Clause clause : this.updateClauseList) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(',');
            }
            clause.appendSql(this.databaseType, null, stringBuilder, list);
        }
    }

    private void addUpdateColumnToList(String str, Clause clause) {
        if (this.updateClauseList == null) {
            this.updateClauseList = new ArrayList();
        }
        this.updateClauseList.add(clause);
    }
}
