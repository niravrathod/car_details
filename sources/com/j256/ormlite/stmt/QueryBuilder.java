package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.CloseableIterator;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.GenericRawResults;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.StatementBuilder.StatementType;
import com.j256.ormlite.stmt.query.OrderBy;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueryBuilder<T, ID> extends StatementBuilder<T, ID> {
    private boolean distinct;
    private List<String> groupByList;
    private String groupByRaw;
    private String having;
    private final FieldType idField;
    private boolean isCountOfQuery;
    private boolean isInnerQuery;
    private List<JoinInfo> joinList;
    private Long limit;
    private Long offset;
    private ArgumentHolder[] orderByArgs;
    private List<OrderBy> orderByList;
    private String orderByRaw;
    private FieldType[] resultFieldTypes;
    private List<String> selectColumnList;
    private boolean selectIdColumn = true;
    private List<String> selectRawList;

    public static class InternalQueryBuilderWrapper {
        private final QueryBuilder<?, ?> queryBuilder;

        InternalQueryBuilderWrapper(QueryBuilder<?, ?> queryBuilder) {
            this.queryBuilder = queryBuilder;
        }

        public void appendStatementString(StringBuilder stringBuilder, List<ArgumentHolder> list) {
            this.queryBuilder.appendStatementString(stringBuilder, list);
        }

        public FieldType[] getResultFieldTypes() {
            return this.queryBuilder.getResultFieldTypes();
        }
    }

    private class JoinInfo {
        FieldType localField;
        WhereOperation operation;
        final QueryBuilder<?, ?> queryBuilder;
        FieldType remoteField;
        final String type;

        public JoinInfo(String str, QueryBuilder<?, ?> queryBuilder, WhereOperation whereOperation) {
            this.type = str;
            this.queryBuilder = queryBuilder;
            this.operation = whereOperation;
        }
    }

    public QueryBuilder(DatabaseType databaseType, TableInfo<T, ID> tableInfo, Dao<T, ID> dao) {
        super(databaseType, tableInfo, dao, StatementType.SELECT);
        this.idField = tableInfo.getIdField();
    }

    void enableInnerQuery() {
        this.isInnerQuery = true;
    }

    int getSelectColumnCount() {
        if (this.isCountOfQuery) {
            return 1;
        }
        if (this.selectRawList != null && !this.selectRawList.isEmpty()) {
            return this.selectRawList.size();
        }
        if (this.selectColumnList == null) {
            return 0;
        }
        return this.selectColumnList.size();
    }

    List<String> getSelectColumns() {
        if (this.isCountOfQuery) {
            return Collections.singletonList("COUNT(*)");
        }
        if (this.selectRawList != null && !this.selectRawList.isEmpty()) {
            return this.selectRawList;
        }
        if (this.selectColumnList == null) {
            return Collections.emptyList();
        }
        return this.selectColumnList;
    }

    public PreparedQuery<T> prepare() {
        return super.prepareStatement(this.limit);
    }

    public QueryBuilder<T, ID> selectColumns(String... strArr) {
        if (this.selectColumnList == null) {
            this.selectColumnList = new ArrayList();
        }
        for (String addSelectColumnToList : strArr) {
            addSelectColumnToList(addSelectColumnToList);
        }
        return this;
    }

    public QueryBuilder<T, ID> selectColumns(Iterable<String> iterable) {
        if (this.selectColumnList == null) {
            this.selectColumnList = new ArrayList();
        }
        for (String addSelectColumnToList : iterable) {
            addSelectColumnToList(addSelectColumnToList);
        }
        return this;
    }

    public QueryBuilder<T, ID> selectRaw(String... strArr) {
        if (this.selectRawList == null) {
            this.selectRawList = new ArrayList();
        }
        for (Object add : strArr) {
            this.selectRawList.add(add);
        }
        return this;
    }

    public QueryBuilder<T, ID> groupBy(String str) {
        if (verifyColumnName(str).isForeignCollection()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't groupBy foreign colletion field: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.groupByList == null) {
            this.groupByList = new ArrayList();
        }
        this.groupByList.add(str);
        this.selectIdColumn = null;
        return this;
    }

    public QueryBuilder<T, ID> groupByRaw(String str) {
        this.groupByRaw = str;
        return this;
    }

    public QueryBuilder<T, ID> orderBy(String str, boolean z) {
        if (verifyColumnName(str).isForeignCollection()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't orderBy foreign colletion field: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.orderByList == null) {
            this.orderByList = new ArrayList();
        }
        this.orderByList.add(new OrderBy(str, z));
        return this;
    }

    public QueryBuilder<T, ID> orderByRaw(String str) {
        return orderByRaw(str, (ArgumentHolder[]) null);
    }

    public QueryBuilder<T, ID> orderByRaw(String str, ArgumentHolder... argumentHolderArr) {
        this.orderByRaw = str;
        this.orderByArgs = argumentHolderArr;
        return this;
    }

    public QueryBuilder<T, ID> distinct() {
        this.distinct = true;
        this.selectIdColumn = false;
        return this;
    }

    @Deprecated
    public QueryBuilder<T, ID> limit(int i) {
        return limit(Long.valueOf((long) i));
    }

    public QueryBuilder<T, ID> limit(Long l) {
        this.limit = l;
        return this;
    }

    @Deprecated
    public QueryBuilder<T, ID> offset(int i) {
        return offset(Long.valueOf((long) i));
    }

    public QueryBuilder<T, ID> offset(Long l) {
        if (this.databaseType.isOffsetSqlSupported()) {
            this.offset = l;
            return this;
        }
        throw new SQLException("Offset is not supported by this database");
    }

    public QueryBuilder<T, ID> setCountOf(boolean z) {
        this.isCountOfQuery = z;
        return this;
    }

    public QueryBuilder<T, ID> having(String str) {
        this.having = str;
        return this;
    }

    public QueryBuilder<T, ID> join(QueryBuilder<?, ?> queryBuilder) {
        addJoinInfo("INNER", queryBuilder, WhereOperation.AND);
        return this;
    }

    public QueryBuilder<T, ID> joinOr(QueryBuilder<?, ?> queryBuilder) {
        addJoinInfo("INNER", queryBuilder, WhereOperation.OR);
        return this;
    }

    public QueryBuilder<T, ID> leftJoin(QueryBuilder<?, ?> queryBuilder) {
        addJoinInfo("LEFT", queryBuilder, WhereOperation.AND);
        return this;
    }

    public QueryBuilder<T, ID> leftJoinOr(QueryBuilder<?, ?> queryBuilder) {
        addJoinInfo("LEFT", queryBuilder, WhereOperation.OR);
        return this;
    }

    public List<T> query() {
        return this.dao.query(prepare());
    }

    public GenericRawResults<String[]> queryRaw() {
        return this.dao.queryRaw(prepareStatementString(), new String[0]);
    }

    public T queryForFirst() {
        return this.dao.queryForFirst(prepare());
    }

    public String[] queryRawFirst() {
        return (String[]) this.dao.queryRaw(prepareStatementString(), new String[0]).getFirstResult();
    }

    public CloseableIterator<T> iterator() {
        return this.dao.iterator(prepare());
    }

    public long countOf() {
        setCountOf(true);
        return this.dao.countOf(prepare());
    }

    @Deprecated
    public void clear() {
        reset();
    }

    public void reset() {
        super.reset();
        this.distinct = false;
        this.selectIdColumn = true;
        this.selectColumnList = null;
        this.selectRawList = null;
        this.orderByList = null;
        this.orderByRaw = null;
        this.groupByList = null;
        this.groupByRaw = null;
        this.isInnerQuery = false;
        this.isCountOfQuery = false;
        this.having = null;
        this.limit = null;
        this.offset = null;
        if (this.joinList != null) {
            this.joinList.clear();
            this.joinList = null;
        }
        this.addTableName = false;
    }

    protected void appendStatementStart(StringBuilder stringBuilder, List<ArgumentHolder> list) {
        if (this.joinList == null) {
            setAddTableName(null);
        } else {
            setAddTableName(true);
        }
        stringBuilder.append("SELECT ");
        if (this.databaseType.isLimitAfterSelect() != null) {
            appendLimit(stringBuilder);
        }
        if (this.distinct != null) {
            stringBuilder.append("DISTINCT ");
        }
        if (this.isCountOfQuery != null) {
            this.type = StatementType.SELECT_LONG;
            stringBuilder.append("COUNT(*) ");
        } else if (this.selectRawList == null || this.selectRawList.isEmpty() != null) {
            this.type = StatementType.SELECT;
            appendColumns(stringBuilder);
        } else {
            this.type = StatementType.SELECT_RAW;
            appendSelectRaw(stringBuilder);
        }
        stringBuilder.append("FROM ");
        this.databaseType.appendEscapedEntityName(stringBuilder, this.tableName);
        stringBuilder.append(' ');
        if (this.joinList != null) {
            appendJoinSql(stringBuilder);
        }
    }

    protected FieldType[] getResultFieldTypes() {
        return this.resultFieldTypes;
    }

    protected boolean appendWhereStatement(StringBuilder stringBuilder, List<ArgumentHolder> list, WhereOperation whereOperation) {
        boolean z = whereOperation == WhereOperation.FIRST;
        if (this.where != null) {
            z = super.appendWhereStatement(stringBuilder, list, whereOperation);
        }
        if (this.joinList != null) {
            for (JoinInfo joinInfo : this.joinList) {
                WhereOperation whereOperation2;
                if (z) {
                    whereOperation2 = WhereOperation.FIRST;
                } else {
                    whereOperation2 = joinInfo.operation;
                }
                z = joinInfo.queryBuilder.appendWhereStatement(stringBuilder, list, whereOperation2);
            }
        }
        return z;
    }

    protected void appendStatementEnd(StringBuilder stringBuilder, List<ArgumentHolder> list) {
        appendGroupBys(stringBuilder);
        appendHaving(stringBuilder);
        appendOrderBys(stringBuilder, list);
        if (this.databaseType.isLimitAfterSelect() == null) {
            appendLimit(stringBuilder);
        }
        appendOffset(stringBuilder);
        setAddTableName(null);
    }

    protected boolean shouldPrependTableNameToColumns() {
        return this.joinList != null;
    }

    private void setAddTableName(boolean z) {
        this.addTableName = z;
        if (this.joinList != null) {
            for (JoinInfo joinInfo : this.joinList) {
                joinInfo.queryBuilder.setAddTableName(z);
            }
        }
    }

    private void addJoinInfo(String str, QueryBuilder<?, ?> queryBuilder, WhereOperation whereOperation) {
        JoinInfo joinInfo = new JoinInfo(str, queryBuilder, whereOperation);
        matchJoinedFields(joinInfo, queryBuilder);
        if (this.joinList == null) {
            this.joinList = new ArrayList();
        }
        this.joinList.add(joinInfo);
    }

    private void matchJoinedFields(JoinInfo joinInfo, QueryBuilder<?, ?> queryBuilder) {
        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
            FieldType foreignIdField = fieldType.getForeignIdField();
            if (fieldType.isForeign() && foreignIdField.equals(queryBuilder.tableInfo.getIdField())) {
                joinInfo.localField = fieldType;
                joinInfo.remoteField = foreignIdField;
                return;
            }
        }
        for (FieldType fieldType2 : queryBuilder.tableInfo.getFieldTypes()) {
            if (fieldType2.isForeign() && fieldType2.getForeignIdField().equals(this.idField)) {
                joinInfo.localField = this.idField;
                joinInfo.remoteField = fieldType2;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find a foreign ");
        stringBuilder.append(this.tableInfo.getDataClass());
        stringBuilder.append(" field in ");
        stringBuilder.append(queryBuilder.tableInfo.getDataClass());
        stringBuilder.append(" or vice versa");
        throw new SQLException(stringBuilder.toString());
    }

    private void addSelectColumnToList(String str) {
        verifyColumnName(str);
        this.selectColumnList.add(str);
    }

    private void appendJoinSql(StringBuilder stringBuilder) {
        for (JoinInfo joinInfo : this.joinList) {
            stringBuilder.append(joinInfo.type);
            stringBuilder.append(" JOIN ");
            this.databaseType.appendEscapedEntityName(stringBuilder, joinInfo.queryBuilder.tableName);
            stringBuilder.append(" ON ");
            this.databaseType.appendEscapedEntityName(stringBuilder, this.tableName);
            stringBuilder.append('.');
            this.databaseType.appendEscapedEntityName(stringBuilder, joinInfo.localField.getColumnName());
            stringBuilder.append(" = ");
            this.databaseType.appendEscapedEntityName(stringBuilder, joinInfo.queryBuilder.tableName);
            stringBuilder.append('.');
            this.databaseType.appendEscapedEntityName(stringBuilder, joinInfo.remoteField.getColumnName());
            stringBuilder.append(' ');
            if (joinInfo.queryBuilder.joinList != null) {
                joinInfo.queryBuilder.appendJoinSql(stringBuilder);
            }
        }
    }

    private void appendSelectRaw(StringBuilder stringBuilder) {
        Object obj = 1;
        for (String str : this.selectRawList) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(' ');
    }

    private void appendColumns(StringBuilder stringBuilder) {
        if (this.selectColumnList == null) {
            if (this.addTableName) {
                this.databaseType.appendEscapedEntityName(stringBuilder, this.tableName);
                stringBuilder.append('.');
            }
            stringBuilder.append("* ");
            this.resultFieldTypes = this.tableInfo.getFieldTypes();
            return;
        }
        boolean z = this.isInnerQuery;
        List arrayList = new ArrayList(this.selectColumnList.size() + 1);
        Object obj = 1;
        for (String fieldTypeByColumnName : this.selectColumnList) {
            FieldType fieldTypeByColumnName2 = this.tableInfo.getFieldTypeByColumnName(fieldTypeByColumnName);
            if (fieldTypeByColumnName2.isForeignCollection()) {
                arrayList.add(fieldTypeByColumnName2);
            } else {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(',');
                }
                appendFieldColumnName(stringBuilder, fieldTypeByColumnName2, arrayList);
                if (fieldTypeByColumnName2 == this.idField) {
                    z = true;
                }
            }
        }
        if (!z && this.selectIdColumn) {
            if (obj == null) {
                stringBuilder.append(',');
            }
            appendFieldColumnName(stringBuilder, this.idField, arrayList);
        }
        stringBuilder.append(' ');
        this.resultFieldTypes = (FieldType[]) arrayList.toArray(new FieldType[arrayList.size()]);
    }

    private void appendFieldColumnName(StringBuilder stringBuilder, FieldType fieldType, List<FieldType> list) {
        appendColumnName(stringBuilder, fieldType.getColumnName());
        if (list != null) {
            list.add(fieldType);
        }
    }

    private void appendLimit(StringBuilder stringBuilder) {
        if (this.limit != null && this.databaseType.isLimitSqlSupported()) {
            this.databaseType.appendLimitValue(stringBuilder, this.limit.longValue(), this.offset);
        }
    }

    private void appendOffset(StringBuilder stringBuilder) {
        if (this.offset != null) {
            if (!this.databaseType.isOffsetLimitArgument()) {
                this.databaseType.appendOffsetValue(stringBuilder, this.offset.longValue());
            } else if (this.limit == null) {
                throw new SQLException("If the offset is specified, limit must also be specified with this database");
            }
        }
    }

    private void appendGroupBys(StringBuilder stringBuilder) {
        boolean z = true;
        if (hasGroupStuff()) {
            appendGroupBys(stringBuilder, true);
            z = false;
        }
        if (this.joinList != null) {
            for (JoinInfo joinInfo : this.joinList) {
                if (joinInfo.queryBuilder != null && joinInfo.queryBuilder.hasGroupStuff()) {
                    joinInfo.queryBuilder.appendGroupBys(stringBuilder, z);
                }
            }
        }
    }

    private boolean hasGroupStuff() {
        return ((this.groupByList == null || this.groupByList.isEmpty()) && this.groupByRaw == null) ? false : true;
    }

    private void appendGroupBys(StringBuilder stringBuilder, boolean z) {
        if (z) {
            stringBuilder.append("GROUP BY ");
        }
        if (this.groupByRaw != null) {
            if (!z) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.groupByRaw);
        } else {
            for (String str : this.groupByList) {
                if (z) {
                    z = false;
                } else {
                    stringBuilder.append(',');
                }
                appendColumnName(stringBuilder, str);
            }
        }
        stringBuilder.append(true);
    }

    private void appendOrderBys(StringBuilder stringBuilder, List<ArgumentHolder> list) {
        boolean z = true;
        if (hasOrderStuff()) {
            appendOrderBys(stringBuilder, true, list);
            z = false;
        }
        if (this.joinList != null) {
            for (JoinInfo joinInfo : this.joinList) {
                if (joinInfo.queryBuilder != null && joinInfo.queryBuilder.hasOrderStuff()) {
                    joinInfo.queryBuilder.appendOrderBys(stringBuilder, z, list);
                }
            }
        }
    }

    private boolean hasOrderStuff() {
        return ((this.orderByList == null || this.orderByList.isEmpty()) && this.orderByRaw == null) ? false : true;
    }

    private void appendOrderBys(StringBuilder stringBuilder, boolean z, List<ArgumentHolder> list) {
        if (z) {
            stringBuilder.append("ORDER BY ");
        }
        if (this.orderByRaw != null) {
            if (!z) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.orderByRaw);
            if (this.orderByArgs) {
                for (Object add : this.orderByArgs) {
                    list.add(add);
                }
            }
            z = false;
        }
        if (this.orderByList != null) {
            list = this.orderByList.iterator();
            while (list.hasNext()) {
                OrderBy orderBy = (OrderBy) list.next();
                if (z) {
                    z = false;
                } else {
                    stringBuilder.append(',');
                }
                appendColumnName(stringBuilder, orderBy.getColumnName());
                if (!orderBy.isAscending()) {
                    stringBuilder.append(" DESC");
                }
            }
        }
        stringBuilder.append(true);
    }

    private void appendColumnName(StringBuilder stringBuilder, String str) {
        if (this.addTableName) {
            this.databaseType.appendEscapedEntityName(stringBuilder, this.tableName);
            stringBuilder.append('.');
        }
        this.databaseType.appendEscapedEntityName(stringBuilder, str);
    }

    private void appendHaving(StringBuilder stringBuilder) {
        if (this.having != null) {
            stringBuilder.append("HAVING ");
            stringBuilder.append(this.having);
            stringBuilder.append(' ');
        }
    }
}
