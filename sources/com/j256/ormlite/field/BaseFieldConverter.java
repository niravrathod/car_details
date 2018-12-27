package com.j256.ormlite.field;

import com.j256.ormlite.support.DatabaseResults;

public abstract class BaseFieldConverter implements FieldConverter {
    public boolean isStreamType() {
        return false;
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return obj;
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        return obj;
    }

    public Object resultToJava(FieldType fieldType, DatabaseResults databaseResults, int i) {
        databaseResults = resultToSqlArg(fieldType, databaseResults, i);
        if (databaseResults == null) {
            return null;
        }
        return sqlArgToJava(fieldType, databaseResults, i);
    }
}
