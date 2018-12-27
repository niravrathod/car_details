package com.j256.ormlite.db;

import com.j256.ormlite.field.BaseFieldConverter;
import com.j256.ormlite.field.DataPersister;
import com.j256.ormlite.field.FieldConverter;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDatabaseType implements DatabaseType {
    protected static String DEFAULT_SEQUENCE_SUFFIX = "_id_seq";
    protected Driver driver;

    protected static class BooleanNumberFieldConverter extends BaseFieldConverter {
        protected BooleanNumberFieldConverter() {
        }

        public SqlType getSqlType() {
            return SqlType.BOOLEAN;
        }

        public Object parseDefaultString(FieldType fieldType, String str) {
            if (Boolean.parseBoolean(str) != null) {
                fieldType = true;
            } else {
                fieldType = null;
            }
            return Byte.valueOf(fieldType);
        }

        public Object javaToSqlArg(FieldType fieldType, Object obj) {
            return Byte.valueOf(((Boolean) obj).booleanValue() != null ? true : null);
        }

        public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
            return Byte.valueOf(databaseResults.getByte(i));
        }

        public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
            return ((Byte) obj).byteValue() == 1 ? Boolean.valueOf(true) : Boolean.valueOf(null);
        }

        public Object resultStringToJava(FieldType fieldType, String str, int i) {
            return sqlArgToJava(fieldType, Byte.valueOf(Byte.parseByte(str)), i);
        }
    }

    private void appendCanBeNull(StringBuilder stringBuilder, FieldType fieldType) {
    }

    public void appendCreateTableSuffix(StringBuilder stringBuilder) {
    }

    public void appendSelectNextValFromSequence(StringBuilder stringBuilder, String str) {
    }

    protected void configureId(StringBuilder stringBuilder, FieldType fieldType, List<String> list, List<String> list2, List<String> list3) {
    }

    public void dropColumnArg(FieldType fieldType, List<String> list, List<String> list2) {
    }

    public <T> DatabaseTableConfig<T> extractDatabaseTableConfig(ConnectionSource connectionSource, Class<T> cls) {
        return null;
    }

    protected boolean generatedIdSqlAtEnd() {
        return true;
    }

    public String getCommentLinePrefix() {
        return "-- ";
    }

    protected abstract String getDriverClassName();

    public FieldConverter getFieldConverter(DataPersister dataPersister) {
        return dataPersister;
    }

    public String getPingStatement() {
        return "SELECT 1";
    }

    public boolean isAllowGeneratedIdInsertSupported() {
        return true;
    }

    public boolean isBatchUseTransaction() {
        return false;
    }

    public boolean isCreateIfNotExistsSupported() {
        return false;
    }

    public boolean isCreateTableReturnsNegative() {
        return false;
    }

    public boolean isCreateTableReturnsZero() {
        return true;
    }

    public boolean isEntityNamesMustBeUpCase() {
        return false;
    }

    public boolean isIdSequenceNeeded() {
        return false;
    }

    public boolean isLimitAfterSelect() {
        return false;
    }

    public boolean isLimitSqlSupported() {
        return true;
    }

    public boolean isNestedSavePointsSupported() {
        return true;
    }

    public boolean isOffsetLimitArgument() {
        return false;
    }

    public boolean isOffsetSqlSupported() {
        return true;
    }

    public boolean isSelectSequenceBeforeInsert() {
        return false;
    }

    public boolean isTruncateSupported() {
        return false;
    }

    public boolean isVarcharFieldWidthSupported() {
        return true;
    }

    public void loadDriver() {
        String driverClassName = getDriverClassName();
        if (driverClassName != null) {
            try {
                Class.forName(driverClassName);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Driver class was not found for ");
                stringBuilder.append(getDatabaseName());
                stringBuilder.append(" database.  Missing jar with class ");
                stringBuilder.append(driverClassName);
                stringBuilder.append(".");
                throw SqlExceptionUtil.create(stringBuilder.toString(), e);
            }
        }
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void appendColumnArg(String str, StringBuilder stringBuilder, FieldType fieldType, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        BaseDatabaseType baseDatabaseType = this;
        StringBuilder stringBuilder2 = stringBuilder;
        FieldType fieldType2 = fieldType;
        appendEscapedEntityName(stringBuilder, fieldType.getColumnName());
        stringBuilder.append(' ');
        DataPersister dataPersister = fieldType.getDataPersister();
        int width = fieldType.getWidth();
        if (width == 0) {
            width = dataPersister.getDefaultWidth();
        }
        switch (dataPersister.getSqlType()) {
            case STRING:
                appendStringType(stringBuilder, fieldType, width);
                break;
            case LONG_STRING:
                appendLongStringType(stringBuilder, fieldType, width);
                break;
            case BOOLEAN:
                appendBooleanType(stringBuilder, fieldType, width);
                break;
            case DATE:
                appendDateType(stringBuilder, fieldType, width);
                break;
            case CHAR:
                appendCharType(stringBuilder, fieldType, width);
                break;
            case BYTE:
                appendByteType(stringBuilder, fieldType, width);
                break;
            case BYTE_ARRAY:
                appendByteArrayType(stringBuilder, fieldType, width);
                break;
            case SHORT:
                appendShortType(stringBuilder, fieldType, width);
                break;
            case INTEGER:
                appendIntegerType(stringBuilder, fieldType, width);
                break;
            case LONG:
                appendLongType(stringBuilder, fieldType, width);
                break;
            case FLOAT:
                appendFloatType(stringBuilder, fieldType, width);
                break;
            case DOUBLE:
                appendDoubleType(stringBuilder, fieldType, width);
                break;
            case SERIALIZABLE:
                appendSerializableType(stringBuilder, fieldType, width);
                break;
            case BIG_DECIMAL:
                appendBigDecimalNumericType(stringBuilder, fieldType, width);
                break;
            default:
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Unknown SQL-type ");
                stringBuilder3.append(dataPersister.getSqlType());
                throw new IllegalArgumentException(stringBuilder3.toString());
        }
        stringBuilder.append(' ');
        if (fieldType.isGeneratedIdSequence() && !fieldType.isSelfGeneratedId()) {
            configureGeneratedIdSequence(stringBuilder, fieldType, list2, list, list4);
        } else if (fieldType.isGeneratedId() && !fieldType.isSelfGeneratedId()) {
            configureGeneratedId(str, stringBuilder, fieldType, list2, list3, list, list4);
        } else if (fieldType.isId()) {
            configureId(stringBuilder, fieldType, list2, list, list4);
        }
        if (!fieldType.isGeneratedId()) {
            Object defaultValue = fieldType.getDefaultValue();
            if (defaultValue != null) {
                stringBuilder.append("DEFAULT ");
                appendDefaultValue(stringBuilder, fieldType, defaultValue);
                stringBuilder.append(' ');
            }
            if (fieldType.isCanBeNull()) {
                appendCanBeNull(stringBuilder, fieldType);
            } else {
                stringBuilder.append("NOT NULL ");
            }
            if (fieldType.isUnique()) {
                addSingleUnique(stringBuilder, fieldType, list, list3);
            }
        }
    }

    protected void appendStringType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        if (isVarcharFieldWidthSupported() != null) {
            stringBuilder.append("VARCHAR(");
            stringBuilder.append(i);
            stringBuilder.append(")");
            return;
        }
        stringBuilder.append("VARCHAR");
    }

    protected void appendLongStringType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("TEXT");
    }

    protected void appendDateType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("TIMESTAMP");
    }

    protected void appendBooleanType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("BOOLEAN");
    }

    protected void appendCharType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("CHAR");
    }

    protected void appendByteType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("TINYINT");
    }

    protected void appendShortType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("SMALLINT");
    }

    private void appendIntegerType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("INTEGER");
    }

    protected void appendLongType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("BIGINT");
    }

    private void appendFloatType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("FLOAT");
    }

    private void appendDoubleType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("DOUBLE PRECISION");
    }

    protected void appendByteArrayType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("BLOB");
    }

    protected void appendSerializableType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("BLOB");
    }

    protected void appendBigDecimalNumericType(StringBuilder stringBuilder, FieldType fieldType, int i) {
        stringBuilder.append("NUMERIC");
    }

    private void appendDefaultValue(StringBuilder stringBuilder, FieldType fieldType, Object obj) {
        if (fieldType.isEscapedDefaultValue() != null) {
            appendEscapedWord(stringBuilder, obj.toString());
        } else {
            stringBuilder.append(obj);
        }
    }

    protected void configureGeneratedIdSequence(StringBuilder stringBuilder, FieldType fieldType, List<String> list, List<String> list2, List<String> list3) {
        list = new StringBuilder();
        list.append("GeneratedIdSequence is not supported by database ");
        list.append(getDatabaseName());
        list.append(" for field ");
        list.append(fieldType);
        throw new SQLException(list.toString());
    }

    protected void configureGeneratedId(String str, StringBuilder stringBuilder, FieldType fieldType, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("GeneratedId is not supported by database ");
        stringBuilder.append(getDatabaseName());
        stringBuilder.append(" for field ");
        stringBuilder.append(fieldType);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void addPrimaryKeySql(FieldType[] fieldTypeArr, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        list3 = null;
        for (FieldType fieldType : fieldTypeArr) {
            if (!fieldType.isGeneratedId() || generatedIdSqlAtEnd() || fieldType.isSelfGeneratedId()) {
                if (fieldType.isId()) {
                    if (list3 == null) {
                        list3 = new StringBuilder(48);
                        list3.append("PRIMARY KEY (");
                    } else {
                        list3.append(',');
                    }
                    appendEscapedEntityName(list3, fieldType.getColumnName());
                }
            }
        }
        if (list3 != null) {
            list3.append(") ");
            list.add(list3.toString());
        }
    }

    public void addUniqueComboSql(FieldType[] fieldTypeArr, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        list3 = null;
        for (FieldType fieldType : fieldTypeArr) {
            if (fieldType.isUniqueCombo()) {
                if (list3 == null) {
                    list3 = new StringBuilder(48);
                    list3.append("UNIQUE (");
                } else {
                    list3.append(',');
                }
                appendEscapedEntityName(list3, fieldType.getColumnName());
            }
        }
        if (list3 != null) {
            list3.append(") ");
            list.add(list3.toString());
        }
    }

    public void appendEscapedWord(StringBuilder stringBuilder, String str) {
        stringBuilder.append('\'');
        stringBuilder.append(str);
        stringBuilder.append('\'');
    }

    public void appendEscapedEntityName(StringBuilder stringBuilder, String str) {
        stringBuilder.append('`');
        stringBuilder.append(str);
        stringBuilder.append('`');
    }

    public String generateIdSequenceName(String str, FieldType fieldType) {
        fieldType = new StringBuilder();
        fieldType.append(str);
        fieldType.append(DEFAULT_SEQUENCE_SUFFIX);
        str = fieldType.toString();
        return isEntityNamesMustBeUpCase() != null ? str.toUpperCase() : str;
    }

    public void appendLimitValue(StringBuilder stringBuilder, long j, Long l) {
        stringBuilder.append("LIMIT ");
        stringBuilder.append(j);
        stringBuilder.append(32);
    }

    public void appendOffsetValue(StringBuilder stringBuilder, long j) {
        stringBuilder.append("OFFSET ");
        stringBuilder.append(j);
        stringBuilder.append(32);
    }

    public boolean isCreateIndexIfNotExistsSupported() {
        return isCreateIfNotExistsSupported();
    }

    public void appendInsertNoColumns(StringBuilder stringBuilder) {
        stringBuilder.append("() VALUES ()");
    }

    private void addSingleUnique(StringBuilder stringBuilder, FieldType fieldType, List<String> list, List<String> list2) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(" UNIQUE (");
        appendEscapedEntityName(stringBuilder, fieldType.getColumnName());
        stringBuilder.append(")");
        list.add(stringBuilder.toString());
    }
}
