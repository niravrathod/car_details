package com.j256.ormlite.table;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.BaseDaoEnabled;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.j256.ormlite.support.ConnectionSource;
import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class TableInfo<T, ID> {
    private static final FieldType[] NO_FOREIGN_COLLECTIONS = new FieldType[0];
    private final BaseDaoImpl<T, ID> baseDaoImpl;
    private final Constructor<T> constructor;
    private final Class<T> dataClass;
    private Map<String, FieldType> fieldNameMap;
    private final FieldType[] fieldTypes;
    private final boolean foreignAutoCreate;
    private final FieldType[] foreignCollections;
    private final FieldType idField;
    private final String tableName;

    public TableInfo(ConnectionSource connectionSource, BaseDaoImpl<T, ID> baseDaoImpl, Class<T> cls) {
        this(connectionSource.getDatabaseType(), (BaseDaoImpl) baseDaoImpl, DatabaseTableConfig.fromClass(connectionSource, cls));
    }

    public TableInfo(DatabaseType databaseType, BaseDaoImpl<T, ID> baseDaoImpl, DatabaseTableConfig<T> databaseTableConfig) {
        this.baseDaoImpl = baseDaoImpl;
        this.dataClass = databaseTableConfig.getDataClass();
        this.tableName = databaseTableConfig.getTableName();
        this.fieldTypes = databaseTableConfig.getFieldTypes(databaseType);
        FieldType fieldType = null;
        boolean z = false;
        int i = 0;
        for (FieldType fieldType2 : this.fieldTypes) {
            if (fieldType2.isId() || fieldType2.isGeneratedId() || fieldType2.isGeneratedIdSequence()) {
                if (fieldType == null) {
                    fieldType = fieldType2;
                } else {
                    baseDaoImpl = new StringBuilder();
                    baseDaoImpl.append("More than 1 idField configured for class ");
                    baseDaoImpl.append(this.dataClass);
                    baseDaoImpl.append(" (");
                    baseDaoImpl.append(fieldType);
                    baseDaoImpl.append(",");
                    baseDaoImpl.append(fieldType2);
                    baseDaoImpl.append(")");
                    throw new SQLException(baseDaoImpl.toString());
                }
            }
            if (fieldType2.isForeignAutoCreate()) {
                z = true;
            }
            if (fieldType2.isForeignCollection()) {
                i++;
            }
        }
        this.idField = fieldType;
        this.constructor = databaseTableConfig.getConstructor();
        this.foreignAutoCreate = z;
        if (i == 0) {
            this.foreignCollections = NO_FOREIGN_COLLECTIONS;
            return;
        }
        this.foreignCollections = new FieldType[i];
        databaseTableConfig = null;
        for (FieldType fieldType3 : this.fieldTypes) {
            if (fieldType3.isForeignCollection()) {
                this.foreignCollections[databaseTableConfig] = fieldType3;
                databaseTableConfig++;
            }
        }
    }

    public Class<T> getDataClass() {
        return this.dataClass;
    }

    public String getTableName() {
        return this.tableName;
    }

    public FieldType[] getFieldTypes() {
        return this.fieldTypes;
    }

    public FieldType getFieldTypeByColumnName(String str) {
        if (this.fieldNameMap == null) {
            Map hashMap = new HashMap();
            for (FieldType fieldType : this.fieldTypes) {
                hashMap.put(fieldType.getColumnName().toLowerCase(), fieldType);
            }
            this.fieldNameMap = hashMap;
        }
        FieldType fieldType2 = (FieldType) this.fieldNameMap.get(str.toLowerCase());
        if (fieldType2 != null) {
            return fieldType2;
        }
        for (FieldType fieldType3 : this.fieldTypes) {
            if (fieldType3.getFieldName().equals(str)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("You should use columnName '");
                stringBuilder.append(fieldType3.getColumnName());
                stringBuilder.append("' for table ");
                stringBuilder.append(this.tableName);
                stringBuilder.append(" instead of fieldName '");
                stringBuilder.append(fieldType3.getFieldName());
                stringBuilder.append("'");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unknown column name '");
        stringBuilder2.append(str);
        stringBuilder2.append("' in table ");
        stringBuilder2.append(this.tableName);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    public FieldType getIdField() {
        return this.idField;
    }

    public Constructor<T> getConstructor() {
        return this.constructor;
    }

    public String objectToString(T t) {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(t.getClass().getSimpleName());
        FieldType[] fieldTypeArr = this.fieldTypes;
        int length = fieldTypeArr.length;
        int i = 0;
        while (i < length) {
            FieldType fieldType = fieldTypeArr[i];
            stringBuilder.append(' ');
            stringBuilder.append(fieldType.getColumnName());
            stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
            try {
                stringBuilder.append(fieldType.extractJavaFieldValue(t));
                i++;
            } catch (T t2) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Could not generate toString of field ");
                stringBuilder2.append(fieldType);
                throw new IllegalStateException(stringBuilder2.toString(), t2);
            }
        }
        return stringBuilder.toString();
    }

    public T createObject() {
        ObjectFactory objectFactory = null;
        try {
            T newInstance;
            if (this.baseDaoImpl != null) {
                objectFactory = this.baseDaoImpl.getObjectFactory();
            }
            if (objectFactory == null) {
                newInstance = this.constructor.newInstance(new Object[0]);
            } else {
                newInstance = objectFactory.createObject(this.constructor, this.baseDaoImpl.getDataClass());
            }
            wireNewInstance(this.baseDaoImpl, newInstance);
            return newInstance;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create object for ");
            stringBuilder.append(this.constructor.getDeclaringClass());
            throw SqlExceptionUtil.create(stringBuilder.toString(), e);
        }
    }

    public boolean isUpdatable() {
        return this.idField != null && this.fieldTypes.length > 1;
    }

    public boolean isForeignAutoCreate() {
        return this.foreignAutoCreate;
    }

    public FieldType[] getForeignCollections() {
        return this.foreignCollections;
    }

    public boolean hasColumnName(String str) {
        for (FieldType columnName : this.fieldTypes) {
            if (columnName.getColumnName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static <T, ID> void wireNewInstance(BaseDaoImpl<T, ID> baseDaoImpl, T t) {
        if (t instanceof BaseDaoEnabled) {
            ((BaseDaoEnabled) t).setDao(baseDaoImpl);
        }
    }
}
