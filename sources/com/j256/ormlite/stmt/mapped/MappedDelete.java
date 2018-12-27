package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

public class MappedDelete<T, ID> extends BaseMappedStatement<T, ID> {
    private MappedDelete(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr) {
        super(tableInfo, str, fieldTypeArr);
    }

    public static <T, ID> MappedDelete<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) {
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            BaseMappedStatement.appendTableName(databaseType, stringBuilder, "DELETE FROM ", tableInfo.getTableName());
            BaseMappedStatement.appendWhereFieldEq(databaseType, idField, stringBuilder, null);
            return new MappedDelete(tableInfo, stringBuilder.toString(), new FieldType[]{idField});
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Cannot delete from ");
        stringBuilder2.append(tableInfo.getDataClass());
        stringBuilder2.append(" because it doesn't have an id field");
        throw new SQLException(stringBuilder2.toString());
    }

    public int delete(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        try {
            Object fieldObjects = getFieldObjects(t);
            databaseConnection = databaseConnection.delete(this.statement, fieldObjects, this.argFieldTypes);
            logger.debug("delete data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(fieldObjects.length), Integer.valueOf(databaseConnection));
            if (fieldObjects.length > 0) {
                logger.trace("delete arguments: {}", fieldObjects);
            }
            if (databaseConnection > null && objectCache != null) {
                objectCache.remove(this.clazz, this.idField.extractJavaFieldToSqlArgValue(t));
            }
            return databaseConnection;
        } catch (DatabaseConnection databaseConnection2) {
            objectCache = new StringBuilder();
            objectCache.append("Unable to run delete stmt on object ");
            objectCache.append(t);
            objectCache.append(": ");
            objectCache.append(this.statement);
            throw SqlExceptionUtil.create(objectCache.toString(), databaseConnection2);
        }
    }

    public int deleteById(DatabaseConnection databaseConnection, ID id, ObjectCache objectCache) {
        try {
            Object obj = new Object[]{convertIdToFieldObject(id)};
            databaseConnection = databaseConnection.delete(this.statement, obj, this.argFieldTypes);
            logger.debug("delete data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(obj.length), Integer.valueOf(databaseConnection));
            if (obj.length > 0) {
                logger.trace("delete arguments: {}", obj);
            }
            if (databaseConnection > null && objectCache != null) {
                objectCache.remove(this.clazz, id);
            }
            return databaseConnection;
        } catch (DatabaseConnection databaseConnection2) {
            objectCache = new StringBuilder();
            objectCache.append("Unable to run deleteById stmt on id ");
            objectCache.append(id);
            objectCache.append(": ");
            objectCache.append(this.statement);
            throw SqlExceptionUtil.create(objectCache.toString(), databaseConnection2);
        }
    }
}
