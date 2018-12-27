package com.j256.ormlite.stmt.mapped;

import com.j256.ormlite.dao.BaseForeignCollection;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.TableInfo;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseMappedQuery<T, ID> extends BaseMappedStatement<T, ID> implements GenericRowMapper<T> {
    private Map<String, Integer> columnPositions = null;
    private Object parent = null;
    private Object parentId = null;
    protected final FieldType[] resultsFieldTypes;

    protected BaseMappedQuery(TableInfo<T, ID> tableInfo, String str, FieldType[] fieldTypeArr, FieldType[] fieldTypeArr2) {
        super(tableInfo, str, fieldTypeArr);
        this.resultsFieldTypes = fieldTypeArr2;
    }

    public T mapRow(DatabaseResults databaseResults) {
        Map hashMap;
        T t;
        if (this.columnPositions == null) {
            hashMap = new HashMap();
        } else {
            hashMap = this.columnPositions;
        }
        ObjectCache objectCache = databaseResults.getObjectCache();
        if (objectCache != null) {
            t = objectCache.get(this.clazz, this.idField.resultToJava(databaseResults, hashMap));
            if (t != null) {
                return t;
            }
        }
        t = this.tableInfo.createObject();
        Object obj = null;
        Object obj2 = null;
        for (FieldType fieldType : this.resultsFieldTypes) {
            if (fieldType.isForeignCollection()) {
                obj2 = 1;
            } else {
                Object resultToJava = fieldType.resultToJava(databaseResults, hashMap);
                if (resultToJava == null || this.parent == null || fieldType.getField().getType() != this.parent.getClass() || !resultToJava.equals(this.parentId)) {
                    fieldType.assignField(t, resultToJava, false, objectCache);
                } else {
                    fieldType.assignField(t, this.parent, true, objectCache);
                }
                if (fieldType == this.idField) {
                    obj = resultToJava;
                }
            }
        }
        if (obj2 != null) {
            for (FieldType fieldType2 : this.resultsFieldTypes) {
                if (fieldType2.isForeignCollection()) {
                    BaseForeignCollection buildForeignCollection = fieldType2.buildForeignCollection(t, obj);
                    if (buildForeignCollection != null) {
                        fieldType2.assignField(t, buildForeignCollection, false, objectCache);
                    }
                }
            }
        }
        if (!(objectCache == null || obj == null)) {
            objectCache.put(this.clazz, obj, t);
        }
        if (this.columnPositions == null) {
            this.columnPositions = hashMap;
        }
        return t;
    }

    public void setParentInformation(Object obj, Object obj2) {
        this.parent = obj;
        this.parentId = obj2;
    }
}
