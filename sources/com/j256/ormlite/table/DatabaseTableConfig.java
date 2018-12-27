package com.j256.ormlite.table;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.misc.JavaxPersistence;
import com.j256.ormlite.support.ConnectionSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTableConfig<T> {
    private Constructor<T> constructor;
    private Class<T> dataClass;
    private List<DatabaseFieldConfig> fieldConfigs;
    private FieldType[] fieldTypes;
    private String tableName;

    public DatabaseTableConfig(Class<T> cls, List<DatabaseFieldConfig> list) {
        this((Class) cls, extractTableName(cls), (List) list);
    }

    public DatabaseTableConfig(Class<T> cls, String str, List<DatabaseFieldConfig> list) {
        this.dataClass = cls;
        this.tableName = str;
        this.fieldConfigs = list;
    }

    private DatabaseTableConfig(Class<T> cls, String str, FieldType[] fieldTypeArr) {
        this.dataClass = cls;
        this.tableName = str;
        this.fieldTypes = fieldTypeArr;
    }

    public void initialize() {
        if (this.dataClass == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dataClass was never set on ");
            stringBuilder.append(getClass().getSimpleName());
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.tableName == null) {
            this.tableName = extractTableName(this.dataClass);
        }
    }

    public Class<T> getDataClass() {
        return this.dataClass;
    }

    public void setDataClass(Class<T> cls) {
        this.dataClass = cls;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public void setFieldConfigs(List<DatabaseFieldConfig> list) {
        this.fieldConfigs = list;
    }

    public void extractFieldTypes(ConnectionSource connectionSource) {
        if (this.fieldTypes != null) {
            return;
        }
        if (this.fieldConfigs == null) {
            this.fieldTypes = extractFieldTypes(connectionSource, this.dataClass, this.tableName);
        } else {
            this.fieldTypes = convertFieldConfigs(connectionSource, this.tableName, this.fieldConfigs);
        }
    }

    public FieldType[] getFieldTypes(DatabaseType databaseType) {
        if (this.fieldTypes != null) {
            return this.fieldTypes;
        }
        throw new SQLException("Field types have not been extracted in table config");
    }

    public List<DatabaseFieldConfig> getFieldConfigs() {
        return this.fieldConfigs;
    }

    public Constructor<T> getConstructor() {
        if (this.constructor == null) {
            this.constructor = findNoArgConstructor(this.dataClass);
        }
        return this.constructor;
    }

    public void setConstructor(Constructor<T> constructor) {
        this.constructor = constructor;
    }

    public static <T> DatabaseTableConfig<T> fromClass(ConnectionSource connectionSource, Class<T> cls) {
        String extractTableName = extractTableName(cls);
        if (connectionSource.getDatabaseType().isEntityNamesMustBeUpCase()) {
            extractTableName = extractTableName.toUpperCase();
        }
        return new DatabaseTableConfig((Class) cls, extractTableName, extractFieldTypes(connectionSource, cls, extractTableName));
    }

    public static <T> String extractTableName(Class<T> cls) {
        DatabaseTable databaseTable = (DatabaseTable) cls.getAnnotation(DatabaseTable.class);
        if (databaseTable != null && databaseTable.tableName() != null && databaseTable.tableName().length() > 0) {
            return databaseTable.tableName();
        }
        String entityName = JavaxPersistence.getEntityName(cls);
        return entityName == null ? cls.getSimpleName().toLowerCase() : entityName;
    }

    public static <T> java.lang.reflect.Constructor<T> findNoArgConstructor(java.lang.Class<T> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = r5.getDeclaredConstructors();	 Catch:{ Exception -> 0x0072 }
        r0 = (java.lang.reflect.Constructor[]) r0;	 Catch:{ Exception -> 0x0072 }
        r1 = r0.length;
        r2 = 0;
    L_0x0008:
        if (r2 >= r1) goto L_0x0039;
    L_0x000a:
        r3 = r0[r2];
        r4 = r3.getParameterTypes();
        r4 = r4.length;
        if (r4 != 0) goto L_0x0036;
    L_0x0013:
        r0 = r3.isAccessible();
        if (r0 != 0) goto L_0x0035;
    L_0x0019:
        r0 = 1;
        r3.setAccessible(r0);	 Catch:{ SecurityException -> 0x001e }
        goto L_0x0035;
    L_0x001e:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Could not open access to constructor for ";
        r1.append(r2);
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
    L_0x0035:
        return r3;
    L_0x0036:
        r2 = r2 + 1;
        goto L_0x0008;
    L_0x0039:
        r0 = r5.getEnclosingClass();
        if (r0 != 0) goto L_0x0056;
    L_0x003f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Can't find a no-arg constructor for ";
        r1.append(r2);
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
    L_0x0056:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Can't find a no-arg constructor for ";
        r1.append(r2);
        r1.append(r5);
        r5 = ".  Missing static on inner class?";
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
    L_0x0072:
        r0 = move-exception;
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Can't lookup declared constructors for ";
        r2.append(r3);
        r2.append(r5);
        r5 = r2.toString();
        r1.<init>(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.DatabaseTableConfig.findNoArgConstructor(java.lang.Class):java.lang.reflect.Constructor<T>");
    }

    private static <T> FieldType[] extractFieldTypes(ConnectionSource connectionSource, Class<T> cls, String str) {
        List arrayList = new ArrayList();
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field createFieldType : cls2.getDeclaredFields()) {
                FieldType createFieldType2 = FieldType.createFieldType(connectionSource, str, createFieldType, cls);
                if (createFieldType2 != null) {
                    arrayList.add(createFieldType2);
                }
            }
        }
        if (arrayList.isEmpty() == null) {
            return (FieldType[]) arrayList.toArray(new FieldType[arrayList.size()]);
        }
        str = new StringBuilder();
        str.append("No fields have a ");
        str.append(DatabaseField.class.getSimpleName());
        str.append(" annotation in ");
        str.append(cls);
        throw new IllegalArgumentException(str.toString());
    }

    private com.j256.ormlite.field.FieldType[] convertFieldConfigs(com.j256.ormlite.support.ConnectionSource r10, java.lang.String r11, java.util.List<com.j256.ormlite.field.DatabaseFieldConfig> r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r12 = r12.iterator();
    L_0x0009:
        r1 = r12.hasNext();
        if (r1 == 0) goto L_0x0060;
    L_0x000f:
        r1 = r12.next();
        r1 = (com.j256.ormlite.field.DatabaseFieldConfig) r1;
        r2 = 0;
        r3 = r9.dataClass;
    L_0x0018:
        if (r3 == 0) goto L_0x0035;
    L_0x001a:
        r4 = r1.getFieldName();	 Catch:{ NoSuchFieldException -> 0x0030 }
        r5 = r3.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x0030 }
        if (r5 == 0) goto L_0x0030;
    L_0x0024:
        r8 = new com.j256.ormlite.field.FieldType;
        r7 = r9.dataClass;
        r2 = r8;
        r3 = r10;
        r4 = r11;
        r6 = r1;
        r2.<init>(r3, r4, r5, r6, r7);
        goto L_0x0035;
    L_0x0030:
        r3 = r3.getSuperclass();
        goto L_0x0018;
    L_0x0035:
        if (r2 == 0) goto L_0x003b;
    L_0x0037:
        r0.add(r2);
        goto L_0x0009;
    L_0x003b:
        r10 = new java.sql.SQLException;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "Could not find declared field with name '";
        r11.append(r12);
        r12 = r1.getFieldName();
        r11.append(r12);
        r12 = "' for ";
        r11.append(r12);
        r12 = r9.dataClass;
        r11.append(r12);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
    L_0x0060:
        r10 = r0.isEmpty();
        if (r10 != 0) goto L_0x0073;
    L_0x0066:
        r10 = r0.size();
        r10 = new com.j256.ormlite.field.FieldType[r10];
        r10 = r0.toArray(r10);
        r10 = (com.j256.ormlite.field.FieldType[]) r10;
        return r10;
    L_0x0073:
        r10 = new java.sql.SQLException;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "No fields were configured for class ";
        r11.append(r12);
        r12 = r9.dataClass;
        r11.append(r12);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.DatabaseTableConfig.convertFieldConfigs(com.j256.ormlite.support.ConnectionSource, java.lang.String, java.util.List):com.j256.ormlite.field.FieldType[]");
    }
}
