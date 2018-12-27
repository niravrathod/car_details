package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

public class MappedUpdateId<T, ID> extends BaseMappedStatement<T, ID> {
    private MappedUpdateId(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr) {
        super(tableInfo, str, fieldTypeArr);
    }

    public int execute(DatabaseConnection databaseConnection, T t, ID id, ObjectCache objectCache) {
        try {
            Object obj = new Object[]{convertIdToFieldObject(id), extractIdToFieldObject(t)};
            databaseConnection = databaseConnection.update(this.statement, obj, this.argFieldTypes);
            if (databaseConnection > null) {
                if (objectCache != null) {
                    T updateId = objectCache.updateId(this.clazz, this.idField.extractJavaFieldValue(t), id);
                    if (!(updateId == null || updateId == t)) {
                        this.idField.assignField(updateId, id, false, objectCache);
                    }
                }
                this.idField.assignField(t, id, false, objectCache);
            }
            logger.debug("updating-id with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(obj.length), Integer.valueOf(databaseConnection));
            if (obj.length > null) {
                logger.trace("updating-id arguments: {}", obj);
            }
            return databaseConnection;
        } catch (DatabaseConnection databaseConnection2) {
            id = new StringBuilder();
            id.append("Unable to run update-id stmt on object ");
            id.append(t);
            id.append(": ");
            id.append(this.statement);
            throw SqlExceptionUtil.create(id.toString(), databaseConnection2);
        }
    }

    public static <T, ID> MappedUpdateId<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) {
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            BaseMappedStatement.appendTableName(databaseType, stringBuilder, "UPDATE ", tableInfo.getTableName());
            stringBuilder.append("SET ");
            BaseMappedStatement.appendFieldColumnName(databaseType, stringBuilder, idField, null);
            stringBuilder.append("= ? ");
            BaseMappedStatement.appendWhereFieldEq(databaseType, idField, stringBuilder, null);
            return new MappedUpdateId(tableInfo, stringBuilder.toString(), new FieldType[]{idField, idField});
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Cannot update-id in ");
        stringBuilder2.append(tableInfo.getDataClass());
        stringBuilder2.append(" because it doesn't have an id field");
        throw new SQLException(stringBuilder2.toString());
    }

    private Object extractIdToFieldObject(T t) {
        return this.idField.extractJavaFieldToSqlArgValue(t);
    }
}
