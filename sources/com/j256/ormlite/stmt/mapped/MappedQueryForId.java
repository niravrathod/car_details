package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

public class MappedQueryForId<T, ID> extends BaseMappedQuery<T, ID> {
    private final String label;

    protected MappedQueryForId(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType[] fieldTypeArr2, String str2) {
        super(tableInfo, str, fieldTypeArr, fieldTypeArr2);
        this.label = str2;
    }

    public T execute(DatabaseConnection databaseConnection, ID id, ObjectCache objectCache) {
        if (objectCache != null) {
            T t = objectCache.get(this.clazz, id);
            if (t != null) {
                return t;
            }
        }
        Object[] objArr = new Object[]{convertIdToFieldObject(id)};
        ID queryForOne = databaseConnection.queryForOne(this.statement, objArr, this.argFieldTypes, this, objectCache);
        if (queryForOne == null) {
            logger.debug("{} using '{}' and {} args, got no results", this.label, this.statement, Integer.valueOf(objArr.length));
        } else if (queryForOne != DatabaseConnection.MORE_THAN_ONE) {
            logger.debug("{} using '{}' and {} args, got 1 result", this.label, this.statement, Integer.valueOf(objArr.length));
        } else {
            logger.error("{} using '{}' and {} args, got >1 results", this.label, this.statement, Integer.valueOf(objArr.length));
            logArgs(objArr);
            id = new StringBuilder();
            id.append(this.label);
            id.append(" got more than 1 result: ");
            id.append(this.statement);
            throw new SQLException(id.toString());
        }
        logArgs(objArr);
        return queryForOne;
    }

    public static <T, ID> MappedQueryForId<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo, FieldType fieldType) {
        if (fieldType == null) {
            fieldType = tableInfo.getIdField();
            if (fieldType == null) {
                fieldType = new StringBuilder();
                fieldType.append("Cannot query-for-id with ");
                fieldType.append(tableInfo.getDataClass());
                fieldType.append(" because it doesn't have an id field");
                throw new SQLException(fieldType.toString());
            }
        }
        return new MappedQueryForId(tableInfo, buildStatement(databaseType, tableInfo, fieldType), new FieldType[]{fieldType}, tableInfo.getFieldTypes(), "query-for-id");
    }

    protected static <T, ID> String buildStatement(DatabaseType databaseType, TableInfo<T, ID> tableInfo, FieldType fieldType) {
        StringBuilder stringBuilder = new StringBuilder(64);
        BaseMappedStatement.appendTableName(databaseType, stringBuilder, "SELECT * FROM ", tableInfo.getTableName());
        BaseMappedStatement.appendWhereFieldEq(databaseType, fieldType, stringBuilder, null);
        return stringBuilder.toString();
    }

    private void logArgs(Object[] objArr) {
        if (objArr.length > 0) {
            logger.trace("{} arguments: {}", this.label, (Object) objArr);
        }
    }
}
