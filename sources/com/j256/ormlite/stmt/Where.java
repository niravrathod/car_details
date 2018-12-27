package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.CloseableIterator;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.QueryBuilder.InternalQueryBuilderWrapper;
import com.j256.ormlite.stmt.query.Between;
import com.j256.ormlite.stmt.query.Clause;
import com.j256.ormlite.stmt.query.Exists;
import com.j256.ormlite.stmt.query.In;
import com.j256.ormlite.stmt.query.InSubQuery;
import com.j256.ormlite.stmt.query.IsNotNull;
import com.j256.ormlite.stmt.query.IsNull;
import com.j256.ormlite.stmt.query.ManyClause;
import com.j256.ormlite.stmt.query.NeedsFutureClause;
import com.j256.ormlite.stmt.query.Not;
import com.j256.ormlite.stmt.query.Raw;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Where<T, ID> {
    private static final int CLAUSE_STACK_START_SIZE = 4;
    private Clause[] clauseStack = new Clause[4];
    private int clauseStackLevel;
    private final DatabaseType databaseType;
    private final String idColumnName;
    private final FieldType idFieldType;
    private NeedsFutureClause needsFuture = null;
    private final StatementBuilder<T, ID> statementBuilder;
    private final TableInfo<T, ID> tableInfo;

    Where(TableInfo<T, ID> tableInfo, StatementBuilder<T, ID> statementBuilder, DatabaseType databaseType) {
        this.tableInfo = tableInfo;
        this.statementBuilder = statementBuilder;
        this.idFieldType = tableInfo.getIdField();
        if (this.idFieldType == null) {
            this.idColumnName = null;
        } else {
            this.idColumnName = this.idFieldType.getColumnName();
        }
        this.databaseType = databaseType;
    }

    public Where<T, ID> and() {
        Object manyClause = new ManyClause(pop(ManyClause.AND_OPERATION), ManyClause.AND_OPERATION);
        push(manyClause);
        addNeedsFuture(manyClause);
        return this;
    }

    public Where<T, ID> and(Where<T, ID> where, Where<T, ID> where2, Where<T, ID>... whereArr) {
        where = buildClauseArray(whereArr, ManyClause.AND_OPERATION);
        addClause(new ManyClause(pop(ManyClause.AND_OPERATION), pop(ManyClause.AND_OPERATION), where, ManyClause.AND_OPERATION));
        return this;
    }

    public Where<T, ID> and(int i) {
        if (i != 0) {
            Clause[] clauseArr = new Clause[i];
            for (i--; i >= 0; i--) {
                clauseArr[i] = pop(ManyClause.AND_OPERATION);
            }
            addClause(new ManyClause(clauseArr, ManyClause.AND_OPERATION));
            return this;
        }
        throw new IllegalArgumentException("Must have at least one clause in and(numClauses)");
    }

    public Where<T, ID> between(String str, Object obj, Object obj2) {
        addClause(new Between(str, findColumnFieldType(str), obj, obj2));
        return this;
    }

    public Where<T, ID> eq(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.EQUAL_TO_OPERATION));
        return this;
    }

    public Where<T, ID> ge(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.GREATER_THAN_EQUAL_TO_OPERATION));
        return this;
    }

    public Where<T, ID> gt(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.GREATER_THAN_OPERATION));
        return this;
    }

    public Where<T, ID> in(String str, Iterable<?> iterable) {
        addClause(new In(str, findColumnFieldType(str), (Iterable) iterable, true));
        return this;
    }

    public Where<T, ID> notIn(String str, Iterable<?> iterable) {
        addClause(new In(str, findColumnFieldType(str), (Iterable) iterable, false));
        return this;
    }

    public Where<T, ID> in(String str, Object... objArr) {
        return in(true, str, objArr);
    }

    public Where<T, ID> notIn(String str, Object... objArr) {
        return in(false, str, objArr);
    }

    public Where<T, ID> in(String str, QueryBuilder<?, ?> queryBuilder) {
        return in(true, str, (QueryBuilder) queryBuilder);
    }

    public Where<T, ID> notIn(String str, QueryBuilder<?, ?> queryBuilder) {
        return in(false, str, (QueryBuilder) queryBuilder);
    }

    public Where<T, ID> exists(QueryBuilder<?, ?> queryBuilder) {
        queryBuilder.enableInnerQuery();
        addClause(new Exists(new InternalQueryBuilderWrapper(queryBuilder)));
        return this;
    }

    public Where<T, ID> isNull(String str) {
        addClause(new IsNull(str, findColumnFieldType(str)));
        return this;
    }

    public Where<T, ID> isNotNull(String str) {
        addClause(new IsNotNull(str, findColumnFieldType(str)));
        return this;
    }

    public Where<T, ID> le(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.LESS_THAN_EQUAL_TO_OPERATION));
        return this;
    }

    public Where<T, ID> lt(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.LESS_THAN_OPERATION));
        return this;
    }

    public Where<T, ID> like(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.LIKE_OPERATION));
        return this;
    }

    public Where<T, ID> ne(String str, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, SimpleComparison.NOT_EQUAL_TO_OPERATION));
        return this;
    }

    public Where<T, ID> not() {
        Object not = new Not();
        addClause(not);
        addNeedsFuture(not);
        return this;
    }

    public Where<T, ID> not(Where<T, ID> where) {
        addClause(new Not(pop("NOT")));
        return this;
    }

    public Where<T, ID> or() {
        Object manyClause = new ManyClause(pop(ManyClause.OR_OPERATION), ManyClause.OR_OPERATION);
        push(manyClause);
        addNeedsFuture(manyClause);
        return this;
    }

    public Where<T, ID> or(Where<T, ID> where, Where<T, ID> where2, Where<T, ID>... whereArr) {
        where = buildClauseArray(whereArr, ManyClause.OR_OPERATION);
        addClause(new ManyClause(pop(ManyClause.OR_OPERATION), pop(ManyClause.OR_OPERATION), where, ManyClause.OR_OPERATION));
        return this;
    }

    public Where<T, ID> or(int i) {
        if (i != 0) {
            Clause[] clauseArr = new Clause[i];
            for (i--; i >= 0; i--) {
                clauseArr[i] = pop(ManyClause.OR_OPERATION);
            }
            addClause(new ManyClause(clauseArr, ManyClause.OR_OPERATION));
            return this;
        }
        throw new IllegalArgumentException("Must have at least one clause in or(numClauses)");
    }

    public Where<T, ID> idEq(ID id) {
        if (this.idColumnName != null) {
            addClause(new SimpleComparison(this.idColumnName, this.idFieldType, id, SimpleComparison.EQUAL_TO_OPERATION));
            return this;
        }
        throw new SQLException("Object has no id column specified");
    }

    public <OD> Where<T, ID> idEq(Dao<OD, ?> dao, OD od) {
        if (this.idColumnName != null) {
            addClause(new SimpleComparison(this.idColumnName, this.idFieldType, dao.extractId(od), SimpleComparison.EQUAL_TO_OPERATION));
            return this;
        }
        throw new SQLException("Object has no id column specified");
    }

    public Where<T, ID> raw(String str, ArgumentHolder... argumentHolderArr) {
        for (ArgumentHolder argumentHolder : argumentHolderArr) {
            String columnName = argumentHolder.getColumnName();
            if (columnName != null) {
                argumentHolder.setMetaInfo(findColumnFieldType(columnName));
            } else if (argumentHolder.getSqlType() == null) {
                throw new IllegalArgumentException("Either the column name or SqlType must be set on each argument");
            }
        }
        addClause(new Raw(str, argumentHolderArr));
        return this;
    }

    public Where<T, ID> rawComparison(String str, String str2, Object obj) {
        addClause(new SimpleComparison(str, findColumnFieldType(str), obj, str2));
        return this;
    }

    public PreparedQuery<T> prepare() {
        return this.statementBuilder.prepareStatement(null);
    }

    public List<T> query() {
        return checkQueryBuilderMethod("query()").query();
    }

    public GenericRawResults<String[]> queryRaw() {
        return checkQueryBuilderMethod("queryRaw()").queryRaw();
    }

    public T queryForFirst() {
        return checkQueryBuilderMethod("queryForFirst()").queryForFirst();
    }

    public String[] queryRawFirst() {
        return checkQueryBuilderMethod("queryRawFirst()").queryRawFirst();
    }

    public long countOf() {
        return checkQueryBuilderMethod("countOf()").countOf();
    }

    public CloseableIterator<T> iterator() {
        return checkQueryBuilderMethod("iterator()").iterator();
    }

    @Deprecated
    public Where<T, ID> clear() {
        return reset();
    }

    public Where<T, ID> reset() {
        for (int i = 0; i < this.clauseStackLevel; i++) {
            this.clauseStack[i] = null;
        }
        this.clauseStackLevel = 0;
        return this;
    }

    public String getStatement() {
        StringBuilder stringBuilder = new StringBuilder();
        appendSql(null, stringBuilder, new ArrayList());
        return stringBuilder.toString();
    }

    void appendSql(String str, StringBuilder stringBuilder, List<ArgumentHolder> list) {
        if (this.clauseStackLevel == 0) {
            throw new IllegalStateException("No where clauses defined.  Did you miss a where operation?");
        } else if (this.clauseStackLevel != 1) {
            throw new IllegalStateException("Both the \"left-hand\" and \"right-hand\" clauses have been defined.  Did you miss an AND or OR?");
        } else if (this.needsFuture == null) {
            peek().appendSql(this.databaseType, str, stringBuilder, list);
        } else {
            throw new IllegalStateException("The SQL statement has not been finished since there are previous operations still waiting for clauses.");
        }
    }

    public String toString() {
        if (this.clauseStackLevel == 0) {
            return "empty where clause";
        }
        Clause peek = peek();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("where clause: ");
        stringBuilder.append(peek);
        return stringBuilder.toString();
    }

    private QueryBuilder<T, ID> checkQueryBuilderMethod(String str) {
        if (this.statementBuilder instanceof QueryBuilder) {
            return (QueryBuilder) this.statementBuilder;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot call ");
        stringBuilder.append(str);
        stringBuilder.append(" on a statement of type ");
        stringBuilder.append(this.statementBuilder.getType());
        throw new SQLException(stringBuilder.toString());
    }

    private Where<T, ID> in(boolean z, String str, Object... objArr) {
        if (objArr.length == 1) {
            if (objArr[0].getClass().isArray()) {
                objArr = new StringBuilder();
                objArr.append("Object argument to ");
                objArr.append(z ? "IN" : "notId");
                objArr.append(" seems to be an array within an array");
                throw new IllegalArgumentException(objArr.toString());
            } else if (objArr[0] instanceof Where) {
                objArr = new StringBuilder();
                objArr.append("Object argument to ");
                objArr.append(z ? "IN" : "notId");
                objArr.append(" seems to be a Where object, did you mean the QueryBuilder?");
                throw new IllegalArgumentException(objArr.toString());
            } else if (objArr[0] instanceof PreparedStmt) {
                objArr = new StringBuilder();
                objArr.append("Object argument to ");
                objArr.append(z ? "IN" : "notId");
                objArr.append(" seems to be a prepared statement, did you mean the QueryBuilder?");
                throw new IllegalArgumentException(objArr.toString());
            }
        }
        addClause(new In(str, findColumnFieldType(str), objArr, z));
        return this;
    }

    private Where<T, ID> in(boolean z, String str, QueryBuilder<?, ?> queryBuilder) {
        if (queryBuilder.getSelectColumnCount() == 1) {
            queryBuilder.enableInnerQuery();
            addClause(new InSubQuery(str, findColumnFieldType(str), new InternalQueryBuilderWrapper(queryBuilder), z));
            return this;
        } else if (queryBuilder.getSelectColumnCount()) {
            str = new StringBuilder();
            str.append("Inner query must have only 1 select column specified instead of ");
            str.append(queryBuilder.getSelectColumnCount());
            str.append(": ");
            str.append(Arrays.toString(queryBuilder.getSelectColumns().toArray(new String[0])));
            throw new SQLException(str.toString());
        } else {
            throw new SQLException("Inner query must have only 1 select column specified instead of *");
        }
    }

    private Clause[] buildClauseArray(Where<T, ID>[] whereArr, String str) {
        if (whereArr.length == 0) {
            return null;
        }
        Clause[] clauseArr = new Clause[whereArr.length];
        for (whereArr = whereArr.length - 1; whereArr >= null; whereArr--) {
            clauseArr[whereArr] = pop(str);
        }
        return clauseArr;
    }

    private void addNeedsFuture(NeedsFutureClause needsFutureClause) {
        if (this.needsFuture == null) {
            this.needsFuture = needsFutureClause;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.needsFuture);
        stringBuilder.append(" is already waiting for a future clause, can't add: ");
        stringBuilder.append(needsFutureClause);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void addClause(Clause clause) {
        if (this.needsFuture == null) {
            push(clause);
            return;
        }
        this.needsFuture.setMissingClause(clause);
        this.needsFuture = null;
    }

    private FieldType findColumnFieldType(String str) {
        return this.tableInfo.getFieldTypeByColumnName(str);
    }

    private void push(Clause clause) {
        Clause[] clauseArr;
        int i;
        if (this.clauseStackLevel == this.clauseStack.length) {
            clauseArr = new Clause[(this.clauseStackLevel * 2)];
            for (i = 0; i < this.clauseStackLevel; i++) {
                clauseArr[i] = this.clauseStack[i];
                this.clauseStack[i] = null;
            }
            this.clauseStack = clauseArr;
        }
        clauseArr = this.clauseStack;
        i = this.clauseStackLevel;
        this.clauseStackLevel = i + 1;
        clauseArr[i] = clause;
    }

    private Clause pop(String str) {
        if (this.clauseStackLevel != 0) {
            str = this.clauseStack;
            int i = this.clauseStackLevel - 1;
            this.clauseStackLevel = i;
            str = str[i];
            this.clauseStack[this.clauseStackLevel] = null;
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expecting there to be a clause already defined for '");
        stringBuilder.append(str);
        stringBuilder.append("' operation");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private Clause peek() {
        return this.clauseStack[this.clauseStackLevel - 1];
    }
}
