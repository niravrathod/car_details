package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import java.lang.reflect.Field;
import java.sql.SQLException;

public abstract class BaseEnumType extends BaseDataType {
    protected BaseEnumType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    protected static Enum<?> enumVal(FieldType fieldType, Object obj, Enum<?> enumR, Enum<?> enumR2) {
        if (enumR != null) {
            return enumR;
        }
        if (enumR2 != null) {
            return enumR2;
        }
        enumR2 = new StringBuilder();
        enumR2.append("Cannot get enum value of '");
        enumR2.append(obj);
        enumR2.append("' for field ");
        enumR2.append(fieldType);
        throw new SQLException(enumR2.toString());
    }

    public boolean isValidForField(Field field) {
        return field.getType().isEnum();
    }
}
