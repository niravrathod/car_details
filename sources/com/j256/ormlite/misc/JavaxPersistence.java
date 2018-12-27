package com.j256.ormlite.misc;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataPersisterManager;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseFieldConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;

public class JavaxPersistence {
    public static DatabaseFieldConfig createFieldConfig(DatabaseType databaseType, Field field) {
        Field field2 = field;
        Object obj = null;
        Object obj2 = null;
        Annotation annotation = null;
        Annotation annotation2 = null;
        Annotation annotation3 = null;
        Object obj3 = null;
        Annotation annotation4 = null;
        Annotation annotation5 = null;
        Object obj4 = null;
        for (Annotation annotation6 : field.getAnnotations()) {
            Class annotationType = annotation6.annotationType();
            if (annotationType.getName().equals("javax.persistence.Column")) {
                obj = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.Basic")) {
                obj2 = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.Id")) {
                annotation = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.GeneratedValue")) {
                annotation5 = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.OneToOne")) {
                annotation2 = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.ManyToOne")) {
                annotation3 = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.JoinColumn")) {
                obj4 = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.Enumerated")) {
                obj3 = annotation6;
            }
            if (annotationType.getName().equals("javax.persistence.Version")) {
                annotation4 = annotation6;
            }
        }
        if (obj == null && obj2 == null && annotation == null && annotation2 == null && r10 == null && obj3 == null && annotation4 == null) {
            return null;
        }
        Boolean bool;
        Object invoke;
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        String name = field.getName();
        if (databaseType.isEntityNamesMustBeUpCase()) {
            name = name.toUpperCase();
        }
        databaseFieldConfig.setFieldName(name);
        if (obj != null) {
            try {
                name = (String) obj.getClass().getMethod("name", new Class[0]).invoke(obj, new Object[0]);
                if (name != null && name.length() > 0) {
                    databaseFieldConfig.setColumnName(name);
                }
                name = (String) obj.getClass().getMethod("columnDefinition", new Class[0]).invoke(obj, new Object[0]);
                if (name != null && name.length() > 0) {
                    databaseFieldConfig.setColumnDefinition(name);
                }
                databaseFieldConfig.setWidth(((Integer) obj.getClass().getMethod("length", new Class[0]).invoke(obj, new Object[0])).intValue());
                bool = (Boolean) obj.getClass().getMethod("nullable", new Class[0]).invoke(obj, new Object[0]);
                if (bool != null) {
                    databaseFieldConfig.setCanBeNull(bool.booleanValue());
                }
                bool = (Boolean) obj.getClass().getMethod("unique", new Class[0]).invoke(obj, new Object[0]);
                if (bool != null) {
                    databaseFieldConfig.setUnique(bool.booleanValue());
                }
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Problem accessing fields from the @Column annotation for field ");
                stringBuilder.append(field2);
                throw SqlExceptionUtil.create(stringBuilder.toString(), e);
            }
        }
        if (obj2 != null) {
            try {
                bool = (Boolean) obj2.getClass().getMethod("optional", new Class[0]).invoke(obj2, new Object[0]);
                if (bool == null) {
                    databaseFieldConfig.setCanBeNull(true);
                } else {
                    databaseFieldConfig.setCanBeNull(bool.booleanValue());
                }
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Problem accessing fields from the @Basic annotation for field ");
                stringBuilder.append(field2);
                throw SqlExceptionUtil.create(stringBuilder.toString(), e2);
            }
        }
        if (annotation != null) {
            if (annotation5 == null) {
                databaseFieldConfig.setId(true);
            } else {
                databaseFieldConfig.setGeneratedId(true);
            }
        }
        if (!(annotation2 == null && r10 == null)) {
            if (!Collection.class.isAssignableFrom(field.getType())) {
                if (!ForeignCollection.class.isAssignableFrom(field.getType())) {
                    databaseFieldConfig.setForeign(true);
                    if (obj4 != null) {
                        try {
                            name = (String) obj4.getClass().getMethod("name", new Class[0]).invoke(obj4, new Object[0]);
                            if (name != null && name.length() > 0) {
                                databaseFieldConfig.setColumnName(name);
                            }
                            bool = (Boolean) obj4.getClass().getMethod("nullable", new Class[0]).invoke(obj4, new Object[0]);
                            if (bool != null) {
                                databaseFieldConfig.setCanBeNull(bool.booleanValue());
                            }
                            bool = (Boolean) obj4.getClass().getMethod("unique", new Class[0]).invoke(obj4, new Object[0]);
                            if (bool != null) {
                                databaseFieldConfig.setUnique(bool.booleanValue());
                            }
                        } catch (Throwable e22) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Problem accessing fields from the @JoinColumn annotation for field ");
                            stringBuilder.append(field2);
                            throw SqlExceptionUtil.create(stringBuilder.toString(), e22);
                        }
                    }
                }
            }
            databaseFieldConfig.setForeignCollection(true);
            if (obj4 != null) {
                try {
                    name = (String) obj4.getClass().getMethod("name", new Class[0]).invoke(obj4, new Object[0]);
                    if (name != null && name.length() > 0) {
                        databaseFieldConfig.setForeignCollectionColumnName(name);
                    }
                    invoke = obj4.getClass().getMethod("fetch", new Class[0]).invoke(obj4, new Object[0]);
                    if (invoke != null && invoke.toString().equals("EAGER")) {
                        databaseFieldConfig.setForeignCollectionEager(true);
                    }
                } catch (Throwable e222) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Problem accessing fields from the @JoinColumn annotation for field ");
                    stringBuilder.append(field2);
                    throw SqlExceptionUtil.create(stringBuilder.toString(), e222);
                }
            }
        }
        if (obj3 != null) {
            try {
                invoke = obj3.getClass().getMethod("value", new Class[0]).invoke(obj3, new Object[0]);
                if (invoke == null || !invoke.toString().equals("STRING")) {
                    databaseFieldConfig.setDataType(DataType.ENUM_INTEGER);
                } else {
                    databaseFieldConfig.setDataType(DataType.ENUM_STRING);
                }
            } catch (Throwable e2222) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Problem accessing fields from the @Enumerated annotation for field ");
                stringBuilder.append(field2);
                throw SqlExceptionUtil.create(stringBuilder.toString(), e2222);
            }
        }
        if (annotation4 != null) {
            databaseFieldConfig.setVersion(true);
        }
        if (databaseFieldConfig.getDataPersister() == null) {
            databaseFieldConfig.setDataPersister(DataPersisterManager.lookupForField(field));
        }
        boolean z = false;
        if (!(DatabaseFieldConfig.findGetMethod(field2, false) == null || DatabaseFieldConfig.findSetMethod(field2, false) == null)) {
            z = true;
        }
        databaseFieldConfig.setUseGetSet(z);
        return databaseFieldConfig;
    }

    public static String getEntityName(Class<?> cls) {
        Object obj = null;
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().getName().equals("javax.persistence.Entity")) {
                obj = annotation;
            }
        }
        if (obj == null) {
            return null;
        }
        try {
            String str = (String) obj.getClass().getMethod("name", new Class[0]).invoke(obj, new Object[0]);
            if (str == null || str.length() <= 0) {
                return null;
            }
            return str;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not get entity name from class ");
            stringBuilder.append(cls);
            throw new IllegalStateException(stringBuilder.toString(), e);
        }
    }
}
