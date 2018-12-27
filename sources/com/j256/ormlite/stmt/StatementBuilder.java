package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.stmt.mapped.MappedPreparedStmt;
import com.j256.ormlite.table.TableInfo;
import java.util.ArrayList;
import java.util.List;

public abstract class StatementBuilder<T, ID> {
    private static Logger logger = LoggerFactory.getLogger(StatementBuilder.class);
    protected boolean addTableName;
    protected final Dao<T, ID> dao;
    protected final DatabaseType databaseType;
    protected final TableInfo<T, ID> tableInfo;
    protected final String tableName;
    protected StatementType type;
    protected Where<T, ID> where = null;

    public static class StatementInfo {
        private final List<ArgumentHolder> argList;
        private final String statement;

        private StatementInfo(String str, List<ArgumentHolder> list) {
            this.argList = list;
            this.statement = str;
        }

        public String getStatement() {
            return this.statement;
        }

        public List<ArgumentHolder> getArgList() {
            return this.argList;
        }
    }

    public enum StatementType {
        SELECT(true, true, false, false),
        SELECT_LONG(true, true, false, false),
        SELECT_RAW(true, true, false, false),
        UPDATE(true, false, true, false),
        DELETE(true, false, true, false),
        EXECUTE(false, false, false, true);
        
        private final boolean okForExecute;
        private final boolean okForQuery;
        private final boolean okForStatementBuilder;
        private final boolean okForUpdate;

        private StatementType(boolean z, boolean z2, boolean z3, boolean z4) {
            this.okForStatementBuilder = z;
            this.okForQuery = z2;
            this.okForUpdate = z3;
            this.okForExecute = z4;
        }

        public boolean isOkForStatementBuilder() {
            return this.okForStatementBuilder;
        }

        public boolean isOkForQuery() {
            return this.okForQuery;
        }

        public boolean isOkForUpdate() {
            return this.okForUpdate;
        }

        public boolean isOkForExecute() {
            return this.okForExecute;
        }
    }

    protected enum WhereOperation {
        FIRST("WHERE ", null),
        AND("AND (", ") "),
        OR("OR (", ") ");
        
        private final String after;
        private final String before;

        private WhereOperation(String str, String str2) {
            this.before = str;
            this.after = str2;
        }

        public void appendBefore(StringBuilder stringBuilder) {
            if (this.before != null) {
                stringBuilder.append(this.before);
            }
        }

        public void appendAfter(StringBuilder stringBuilder) {
            if (this.after != null) {
                stringBuilder.append(this.after);
            }
        }
    }

    protected abstract void appendStatementEnd(StringBuilder stringBuilder, List<ArgumentHolder> list);

    protected abstract void appendStatementStart(StringBuilder stringBuilder, List<ArgumentHolder> list);

    protected FieldType[] getResultFieldTypes() {
        return null;
    }

    protected boolean shouldPrependTableNameToColumns() {
        return false;
    }

    public StatementBuilder(DatabaseType databaseType, TableInfo<T, ID> tableInfo, Dao<T, ID> dao, StatementType statementType) {
        this.databaseType = databaseType;
        this.tableInfo = tableInfo;
        this.tableName = tableInfo.getTableName();
        this.dao = dao;
        this.type = statementType;
        if (statementType.isOkForStatementBuilder() == null) {
            tableInfo = new StringBuilder();
            tableInfo.append("Building a statement from a ");
            tableInfo.append(statementType);
            tableInfo.append(" statement is not allowed");
            throw new IllegalStateException(tableInfo.toString());
        }
    }

    public Where<T, ID> where() {
        this.where = new Where(this.tableInfo, this, this.databaseType);
        return this.where;
    }

    public void setWhere(Where<T, ID> where) {
        this.where = where;
    }

    protected MappedPreparedStmt<T, ID> prepareStatement(Long l) {
        List arrayList = new ArrayList();
        String buildStatementString = buildStatementString(arrayList);
        ArgumentHolder[] argumentHolderArr = (ArgumentHolder[]) arrayList.toArray(new ArgumentHolder[arrayList.size()]);
        FieldType[] resultFieldTypes = getResultFieldTypes();
        FieldType[] fieldTypeArr = new FieldType[arrayList.size()];
        for (int i = 0; i < argumentHolderArr.length; i++) {
            fieldTypeArr[i] = argumentHolderArr[i].getFieldType();
        }
        if (this.type.isOkForStatementBuilder()) {
            TableInfo tableInfo = this.tableInfo;
            if (this.databaseType.isLimitSqlSupported()) {
                l = null;
            }
            return new MappedPreparedStmt(tableInfo, buildStatementString, fieldTypeArr, resultFieldTypes, argumentHolderArr, l, this.type);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Building a statement from a ");
        stringBuilder.append(this.type);
        stringBuilder.append(" statement is not allowed");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String prepareStatementString() {
        return buildStatementString(new ArrayList());
    }

    public StatementInfo prepareStatementInfo() {
        List arrayList = new ArrayList();
        return new StatementInfo(buildStatementString(arrayList), arrayList);
    }

    @Deprecated
    public void clear() {
        reset();
    }

    public void reset() {
        this.where = null;
    }

    protected String buildStatementString(List<ArgumentHolder> list) {
        StringBuilder stringBuilder = new StringBuilder(128);
        appendStatementString(stringBuilder, list);
        Object stringBuilder2 = stringBuilder.toString();
        logger.debug("built statement {}", stringBuilder2);
        return stringBuilder2;
    }

    protected void appendStatementString(StringBuilder stringBuilder, List<ArgumentHolder> list) {
        appendStatementStart(stringBuilder, list);
        appendWhereStatement(stringBuilder, list, WhereOperation.FIRST);
        appendStatementEnd(stringBuilder, list);
    }

    protected boolean appendWhereStatement(StringBuilder stringBuilder, List<ArgumentHolder> list, WhereOperation whereOperation) {
        boolean z = false;
        if (this.where == null) {
            if (whereOperation == WhereOperation.FIRST) {
                z = true;
            }
            return z;
        }
        whereOperation.appendBefore(stringBuilder);
        this.where.appendSql(this.addTableName ? this.tableName : null, stringBuilder, list);
        whereOperation.appendAfter(stringBuilder);
        return false;
    }

    protected FieldType verifyColumnName(String str) {
        return this.tableInfo.getFieldTypeByColumnName(str);
    }

    StatementType getType() {
        return this.type;
    }
}
