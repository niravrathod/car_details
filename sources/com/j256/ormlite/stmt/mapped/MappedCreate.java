package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Log.Level;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.GeneratedKeyHolder;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;

public class MappedCreate<T, ID> extends BaseMappedStatement<T, ID> {
    private String dataClassName;
    private final String queryNextSequenceStmt;
    private int versionFieldTypeIndex;

    private static class KeyHolder implements GeneratedKeyHolder {
        Number key;

        private KeyHolder() {
        }

        public Number getKey() {
            return this.key;
        }

        public void addKey(Number number) {
            if (this.key == null) {
                this.key = number;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("generated key has already been set to ");
            stringBuilder.append(this.key);
            stringBuilder.append(", now set to ");
            stringBuilder.append(number);
            throw new SQLException(stringBuilder.toString());
        }
    }

    private MappedCreate(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, String str2, int i) {
        super(tableInfo, str, fieldTypeArr);
        this.dataClassName = tableInfo.getDataClass().getSimpleName();
        this.queryNextSequenceStmt = str2;
        this.versionFieldTypeIndex = i;
    }

    public int insert(DatabaseType databaseType, DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        Object obj;
        int i;
        Object extractRawJavaFieldValue;
        Object obj2;
        if (this.idField != null) {
            obj = (!this.idField.isAllowGeneratedIdInsert() || this.idField.isObjectsFieldValueDefault(t)) ? 1 : null;
            if (this.idField.isSelfGeneratedId() && this.idField.isGeneratedId()) {
                if (obj != null) {
                    this.idField.assignField(t, this.idField.generateId(), false, objectCache);
                }
            } else if (!this.idField.isGeneratedIdSequence() || databaseType.isSelectSequenceBeforeInsert() == null) {
                if (!(this.idField.isGeneratedId() == null || obj == null)) {
                    databaseType = new KeyHolder();
                    if (this.tableInfo.isForeignAutoCreate()) {
                        for (FieldType fieldType : this.tableInfo.getFieldTypes()) {
                            if (!fieldType.isForeignAutoCreate()) {
                                extractRawJavaFieldValue = fieldType.extractRawJavaFieldValue(t);
                                if (extractRawJavaFieldValue != null && fieldType.getForeignIdField().isObjectsFieldValueDefault(extractRawJavaFieldValue)) {
                                    fieldType.createWithForeignDao(extractRawJavaFieldValue);
                                }
                            }
                        }
                    }
                    obj = getFieldObjects(t);
                    if (this.versionFieldTypeIndex >= 0 || obj[this.versionFieldTypeIndex] != null) {
                        obj2 = null;
                    } else {
                        FieldType fieldType2 = this.argFieldTypes[this.versionFieldTypeIndex];
                        obj2 = fieldType2.moveToNextValue(null);
                        obj[this.versionFieldTypeIndex] = fieldType2.convertJavaFieldToSqlArgValue(obj2);
                    }
                    databaseConnection = databaseConnection.insert(this.statement, obj, this.argFieldTypes, databaseType);
                    logger.debug("insert data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(obj.length), Integer.valueOf(databaseConnection));
                    if (obj.length > 0) {
                        logger.trace("insert arguments: {}", obj);
                    }
                    if (databaseConnection > null) {
                        if (obj2 != null) {
                            this.argFieldTypes[this.versionFieldTypeIndex].assignField(t, obj2, false, null);
                        }
                        if (databaseType != null) {
                            databaseType = databaseType.getKey();
                            if (databaseType != null) {
                                throw new SQLException("generated-id key was not set by the update call");
                            } else if (databaseType.longValue() == 0) {
                                assignIdValue(t, databaseType, "keyholder", objectCache);
                            } else {
                                throw new SQLException("generated-id key must not be 0 value");
                            }
                        }
                        if (!(objectCache == null || foreignCollectionsAreAssigned(this.tableInfo.getForeignCollections(), t) == null)) {
                            objectCache.put(this.clazz, this.idField.extractJavaFieldValue(t), t);
                        }
                    }
                    return databaseConnection;
                }
            } else if (obj != null) {
                assignSequenceId(databaseConnection, t, objectCache);
            }
        }
        databaseType = null;
        try {
            if (this.tableInfo.isForeignAutoCreate()) {
                for (i = 0; i < r3; i++) {
                    if (!fieldType.isForeignAutoCreate()) {
                        extractRawJavaFieldValue = fieldType.extractRawJavaFieldValue(t);
                        fieldType.createWithForeignDao(extractRawJavaFieldValue);
                    }
                }
            }
            obj = getFieldObjects(t);
            if (this.versionFieldTypeIndex >= 0) {
            }
            obj2 = null;
            databaseConnection = databaseConnection.insert(this.statement, obj, this.argFieldTypes, databaseType);
            logger.debug("insert data with statement '{}' and {} args, changed {} rows", this.statement, Integer.valueOf(obj.length), Integer.valueOf(databaseConnection));
            if (obj.length > 0) {
                logger.trace("insert arguments: {}", obj);
            }
            if (databaseConnection > null) {
                if (obj2 != null) {
                    this.argFieldTypes[this.versionFieldTypeIndex].assignField(t, obj2, false, null);
                }
                if (databaseType != null) {
                    databaseType = databaseType.getKey();
                    if (databaseType != null) {
                        throw new SQLException("generated-id key was not set by the update call");
                    } else if (databaseType.longValue() == 0) {
                        throw new SQLException("generated-id key must not be 0 value");
                    } else {
                        assignIdValue(t, databaseType, "keyholder", objectCache);
                    }
                }
                objectCache.put(this.clazz, this.idField.extractJavaFieldValue(t), t);
            }
            return databaseConnection;
        } catch (Object e) {
            logger.debug("insert data with statement '{}' and {} args, threw exception: {}", this.statement, Integer.valueOf(obj.length), e);
            if (obj.length > null) {
                logger.trace("insert arguments: {}", obj);
            }
            throw e;
        } catch (DatabaseType databaseType2) {
            databaseConnection = new StringBuilder();
            databaseConnection.append("Unable to run insert stmt on object ");
            databaseConnection.append(t);
            databaseConnection.append(": ");
            databaseConnection.append(this.statement);
            throw SqlExceptionUtil.create(databaseConnection.toString(), databaseType2);
        }
    }

    public static <T, ID> MappedCreate<T, ID> build(DatabaseType databaseType, TableInfo<T, ID> tableInfo) {
        StringBuilder stringBuilder = new StringBuilder(128);
        BaseMappedStatement.appendTableName(databaseType, stringBuilder, "INSERT INTO ", tableInfo.getTableName());
        int i = 0;
        int i2 = -1;
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            if (isFieldCreatable(databaseType, fieldType)) {
                if (fieldType.isVersion()) {
                    i2 = i;
                }
                i++;
            }
        }
        FieldType[] fieldTypeArr = new FieldType[i];
        if (i == 0) {
            databaseType.appendInsertNoColumns(stringBuilder);
        } else {
            stringBuilder.append('(');
            Object obj = 1;
            int i3 = 0;
            for (FieldType fieldType2 : tableInfo.getFieldTypes()) {
                if (isFieldCreatable(databaseType, fieldType2)) {
                    if (obj != null) {
                        obj = null;
                    } else {
                        stringBuilder.append(",");
                    }
                    BaseMappedStatement.appendFieldColumnName(databaseType, stringBuilder, fieldType2, null);
                    int i4 = i3 + 1;
                    fieldTypeArr[i3] = fieldType2;
                    i3 = i4;
                }
            }
            stringBuilder.append(") VALUES (");
            Object obj2 = 1;
            for (FieldType fieldType3 : tableInfo.getFieldTypes()) {
                if (isFieldCreatable(databaseType, fieldType3)) {
                    if (obj2 != null) {
                        obj2 = null;
                    } else {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("?");
                }
            }
            stringBuilder.append(")");
        }
        return new MappedCreate(tableInfo, stringBuilder.toString(), fieldTypeArr, buildQueryNextSequence(databaseType, tableInfo.getIdField()), i2);
    }

    private boolean foreignCollectionsAreAssigned(FieldType[] fieldTypeArr, Object obj) {
        for (FieldType extractJavaFieldValue : fieldTypeArr) {
            if (extractJavaFieldValue.extractJavaFieldValue(obj) == null) {
                return false;
            }
        }
        return 1;
    }

    private static boolean isFieldCreatable(DatabaseType databaseType, FieldType fieldType) {
        if (fieldType.isForeignCollection() || fieldType.isReadOnly()) {
            return false;
        }
        if ((!databaseType.isIdSequenceNeeded() || databaseType.isSelectSequenceBeforeInsert() == null) && fieldType.isGeneratedId() != null && fieldType.isSelfGeneratedId() == null && fieldType.isAllowGeneratedIdInsert() == null) {
            return false;
        }
        return true;
    }

    private static String buildQueryNextSequence(DatabaseType databaseType, FieldType fieldType) {
        if (fieldType == null) {
            return null;
        }
        fieldType = fieldType.getGeneratedIdSequence();
        if (fieldType == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(64);
        databaseType.appendSelectNextValFromSequence(stringBuilder, fieldType);
        return stringBuilder.toString();
    }

    private void assignSequenceId(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) {
        long queryForLong = databaseConnection.queryForLong(this.queryNextSequenceStmt);
        logger.debug("queried for sequence {} using stmt: {}", Long.valueOf(queryForLong), this.queryNextSequenceStmt);
        if (queryForLong != 0) {
            assignIdValue(t, Long.valueOf(queryForLong), "sequence", objectCache);
            return;
        }
        t = new StringBuilder();
        t.append("Should not have returned 0 for stmt: ");
        t.append(this.queryNextSequenceStmt);
        throw new SQLException(t.toString());
    }

    private void assignIdValue(T t, Number number, String str, ObjectCache objectCache) {
        this.idField.assignIdValue(t, number, objectCache);
        if (logger.isLevelEnabled(Level.DEBUG) != null) {
            logger.debug("assigned id '{}' from {} to '{}' in {} object", new Object[]{number, str, this.idField.getFieldName(), this.dataClassName});
        }
    }
}
