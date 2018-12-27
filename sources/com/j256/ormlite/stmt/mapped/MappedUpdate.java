package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

public class MappedUpdate<T, ID> extends BaseMappedStatement<T, ID> {
    private final FieldType versionFieldType;
    private final int versionFieldTypeIndex;

    private MappedUpdate(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType fieldType, int i) {
        super(tableInfo, str, fieldTypeArr);
        this.versionFieldType = fieldType;
        this.versionFieldTypeIndex = i;
    }

    public static <T, ID> MappedUpdate<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) {
        FieldType idField = tableInfo.getIdField();
        if (idField != null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            BaseMappedStatement.appendTableName(databaseType, stringBuilder, "UPDATE ", tableInfo.getTableName());
            FieldType fieldType = null;
            int i = 0;
            int i2 = -1;
            for (FieldType fieldType2 : tableInfo.getFieldTypes()) {
                FieldType fieldType22;
                if (isFieldUpdatable(fieldType22, idField)) {
                    if (fieldType22.isVersion()) {
                        i2 = i;
                    } else {
                        fieldType22 = fieldType;
                    }
                    i++;
                    fieldType = fieldType22;
                }
            }
            i++;
            if (fieldType != null) {
                i++;
            }
            FieldType[] fieldTypeArr = new FieldType[i];
            i = 0;
            Object obj = 1;
            for (FieldType fieldType3 : tableInfo.getFieldTypes()) {
                if (isFieldUpdatable(fieldType3, idField)) {
                    if (obj != null) {
                        stringBuilder.append("SET ");
                        obj = null;
                    } else {
                        stringBuilder.append(", ");
                    }
                    BaseMappedStatement.appendFieldColumnName(databaseType, stringBuilder, fieldType3, null);
                    int i3 = i + 1;
                    fieldTypeArr[i] = fieldType3;
                    stringBuilder.append("= ?");
                    i = i3;
                }
            }
            stringBuilder.append(' ');
            BaseMappedStatement.appendWhereFieldEq(databaseType, idField, stringBuilder, null);
            int i4 = i + 1;
            fieldTypeArr[i] = idField;
            if (fieldType != null) {
                stringBuilder.append(" AND ");
                BaseMappedStatement.appendFieldColumnName(databaseType, stringBuilder, fieldType, null);
                stringBuilder.append("= ?");
                fieldTypeArr[i4] = fieldType;
            }
            return new MappedUpdate(tableInfo, stringBuilder.toString(), fieldTypeArr, fieldType, i2);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Cannot update ");
        stringBuilder2.append(tableInfo.getDataClass());
        stringBuilder2.append(" because it doesn't have an id field");
        throw new SQLException(stringBuilder2.toString());
    }

    public int update(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        try {
            if (this.argFieldTypes.length <= 1) {
                return 0;
            }
            Object moveToNextValue;
            Object fieldObjects = getFieldObjects(t);
            if (this.versionFieldType != null) {
                moveToNextValue = this.versionFieldType.moveToNextValue(this.versionFieldType.extractJavaFieldValue(t));
                fieldObjects[this.versionFieldTypeIndex] = this.versionFieldType.convertJavaFieldToSqlArgValue(moveToNextValue);
            } else {
                moveToNextValue = null;
            }
            databaseConnection = databaseConnection.update(this.statement, fieldObjects, this.argFieldTypes);
            if (databaseConnection > null) {
                if (moveToNextValue != null) {
                    this.versionFieldType.assignField(t, moveToNextValue, false, null);
                }
                if (objectCache != null) {
                    T t2 = objectCache.get(this.clazz, this.idField.extractJavaFieldValue(t));
                    if (!(t2 == null || t2 == t)) {
                        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
                            if (fieldType != this.idField) {
                                fieldType.assignField(t2, fieldType.extractJavaFieldValue(t), false, objectCache);
                            }
                        }
                    }
                }
            }
            logger.debug("update data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(fieldObjects.length), Integer.valueOf(databaseConnection));
            if (fieldObjects.length > null) {
                logger.trace("update arguments: {}", fieldObjects);
            }
            return databaseConnection;
        } catch (DatabaseConnection databaseConnection2) {
            objectCache = new StringBuilder();
            objectCache.append("Unable to run update stmt on object ");
            objectCache.append(t);
            objectCache.append(": ");
            objectCache.append(this.statement);
            throw SqlExceptionUtil.create(objectCache.toString(), databaseConnection2);
        }
    }

    private static boolean isFieldUpdatable(FieldType fieldType, FieldType fieldType2) {
        if (fieldType != fieldType2 && fieldType.isForeignCollection() == null) {
            if (fieldType.isReadOnly() == null) {
                return true;
            }
        }
        return null;
    }
}
