package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

public class MappedRefresh<T, ID> extends MappedQueryForId<T, ID> {
    private MappedRefresh(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType[] fieldTypeArr2) {
        super(tableInfo, str, fieldTypeArr, fieldTypeArr2, "refresh");
    }

    public int executeRefresh(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        databaseConnection = super.execute(databaseConnection, this.idField.extractJavaFieldValue(t), null);
        if (databaseConnection == null) {
            return 0;
        }
        for (FieldType fieldType : this.resultsFieldTypes) {
            if (fieldType != this.idField) {
                fieldType.assignField(t, fieldType.extractJavaFieldValue(databaseConnection), false, objectCache);
            }
        }
        return 1;
    }

    public static <T, ID> MappedRefresh<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) {
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            return new MappedRefresh(tableInfo, MappedQueryForId.buildStatement(databaseType, tableInfo, idField), new FieldType[]{tableInfo.getIdField()}, tableInfo.getFieldTypes());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot refresh ");
        stringBuilder.append(tableInfo.getDataClass());
        stringBuilder.append(" because it doesn't have an id field");
        throw new SQLException(stringBuilder.toString());
    }
}
