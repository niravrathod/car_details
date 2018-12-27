package com.j256.ormlite.field;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.types.VoidType;
import com.j256.ormlite.misc.JavaxPersistence;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.lang.reflect.Field;

public class DatabaseFieldConfig {
    public static final boolean DEFAULT_CAN_BE_NULL = true;
    public static final DataType DEFAULT_DATA_TYPE = DataType.UNKNOWN;
    public static final boolean DEFAULT_FOREIGN_COLLECTION_ORDER_ASCENDING = true;
    private static final int DEFAULT_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = 1;
    public static final Class<? extends DataPersister> DEFAULT_PERSISTER_CLASS = VoidType.class;
    private boolean allowGeneratedIdInsert;
    private boolean canBeNull = true;
    private String columnDefinition;
    private String columnName;
    private DataPersister dataPersister;
    private DataType dataType = DEFAULT_DATA_TYPE;
    private String defaultValue;
    private String fieldName;
    private boolean foreign;
    private boolean foreignAutoCreate;
    private boolean foreignAutoRefresh;
    private boolean foreignCollection;
    private String foreignCollectionColumnName;
    private boolean foreignCollectionEager;
    private String foreignCollectionForeignFieldName;
    private int foreignCollectionMaxEagerLevel = 1;
    private boolean foreignCollectionOrderAscending = true;
    private String foreignCollectionOrderColumnName;
    private String foreignColumnName;
    private DatabaseTableConfig<?> foreignTableConfig;
    private String format;
    private boolean generatedId;
    private String generatedIdSequence;
    private boolean id;
    private boolean index;
    private String indexName;
    private int maxForeignAutoRefreshLevel = -1;
    private boolean persisted = true;
    private Class<? extends DataPersister> persisterClass = DEFAULT_PERSISTER_CLASS;
    private boolean readOnly;
    private boolean throwIfNull;
    private boolean unique;
    private boolean uniqueCombo;
    private boolean uniqueIndex;
    private String uniqueIndexName;
    private Enum<?> unknownEnumValue;
    private boolean useGetSet;
    private boolean version;
    private int width;

    public DatabaseFieldConfig(String str) {
        this.fieldName = str;
    }

    public DatabaseFieldConfig(String str, String str2, DataType dataType, String str3, int i, boolean z, boolean z2, boolean z3, String str4, boolean z4, DatabaseTableConfig<?> databaseTableConfig, boolean z5, Enum<?> enumR, boolean z6, String str5, boolean z7, String str6, String str7, boolean z8, int i2, int i3) {
        this.fieldName = str;
        this.columnName = str2;
        this.dataType = DataType.UNKNOWN;
        this.defaultValue = str3;
        this.width = i;
        this.canBeNull = z;
        this.id = z2;
        this.generatedId = z3;
        this.generatedIdSequence = str4;
        this.foreign = z4;
        this.foreignTableConfig = databaseTableConfig;
        this.useGetSet = z5;
        this.unknownEnumValue = enumR;
        this.throwIfNull = z6;
        this.format = str5;
        this.unique = z7;
        this.indexName = str6;
        this.uniqueIndexName = str7;
        this.foreignAutoRefresh = z8;
        this.maxForeignAutoRefreshLevel = i2;
        this.foreignCollectionMaxEagerLevel = i3;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String str) {
        this.fieldName = str;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void setColumnName(String str) {
        this.columnName = str;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public DataPersister getDataPersister() {
        if (this.dataPersister == null) {
            return this.dataType.getDataPersister();
        }
        return this.dataPersister;
    }

    public void setDataPersister(DataPersister dataPersister) {
        this.dataPersister = dataPersister;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean isCanBeNull() {
        return this.canBeNull;
    }

    public void setCanBeNull(boolean z) {
        this.canBeNull = z;
    }

    public boolean isId() {
        return this.id;
    }

    public void setId(boolean z) {
        this.id = z;
    }

    public boolean isGeneratedId() {
        return this.generatedId;
    }

    public void setGeneratedId(boolean z) {
        this.generatedId = z;
    }

    public String getGeneratedIdSequence() {
        return this.generatedIdSequence;
    }

    public void setGeneratedIdSequence(String str) {
        this.generatedIdSequence = str;
    }

    public boolean isForeign() {
        return this.foreign;
    }

    public void setForeign(boolean z) {
        this.foreign = z;
    }

    public DatabaseTableConfig<?> getForeignTableConfig() {
        return this.foreignTableConfig;
    }

    public void setForeignTableConfig(DatabaseTableConfig<?> databaseTableConfig) {
        this.foreignTableConfig = databaseTableConfig;
    }

    public boolean isUseGetSet() {
        return this.useGetSet;
    }

    public void setUseGetSet(boolean z) {
        this.useGetSet = z;
    }

    public Enum<?> getUnknownEnumValue() {
        return this.unknownEnumValue;
    }

    public void setUnknownEnumValue(Enum<?> enumR) {
        this.unknownEnumValue = enumR;
    }

    public boolean isThrowIfNull() {
        return this.throwIfNull;
    }

    public void setThrowIfNull(boolean z) {
        this.throwIfNull = z;
    }

    public boolean isPersisted() {
        return this.persisted;
    }

    public void setPersisted(boolean z) {
        this.persisted = z;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public boolean isUnique() {
        return this.unique;
    }

    public void setUnique(boolean z) {
        this.unique = z;
    }

    public boolean isUniqueCombo() {
        return this.uniqueCombo;
    }

    public void setUniqueCombo(boolean z) {
        this.uniqueCombo = z;
    }

    public boolean isIndex() {
        return this.index;
    }

    public void setIndex(boolean z) {
        this.index = z;
    }

    public String getIndexName(String str) {
        if (this.index && this.indexName == null) {
            this.indexName = findIndexName(str);
        }
        return this.indexName;
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public boolean isUniqueIndex() {
        return this.uniqueIndex;
    }

    public void setUniqueIndex(boolean z) {
        this.uniqueIndex = z;
    }

    public String getUniqueIndexName(String str) {
        if (this.uniqueIndex && this.uniqueIndexName == null) {
            this.uniqueIndexName = findIndexName(str);
        }
        return this.uniqueIndexName;
    }

    public void setUniqueIndexName(String str) {
        this.uniqueIndexName = str;
    }

    public void setForeignAutoRefresh(boolean z) {
        this.foreignAutoRefresh = z;
    }

    public boolean isForeignAutoRefresh() {
        return this.foreignAutoRefresh;
    }

    public int getMaxForeignAutoRefreshLevel() {
        return this.maxForeignAutoRefreshLevel;
    }

    public void setMaxForeignAutoRefreshLevel(int i) {
        this.maxForeignAutoRefreshLevel = i;
    }

    public boolean isForeignCollection() {
        return this.foreignCollection;
    }

    public void setForeignCollection(boolean z) {
        this.foreignCollection = z;
    }

    public boolean isForeignCollectionEager() {
        return this.foreignCollectionEager;
    }

    public void setForeignCollectionEager(boolean z) {
        this.foreignCollectionEager = z;
    }

    public int getForeignCollectionMaxEagerLevel() {
        return this.foreignCollectionMaxEagerLevel;
    }

    public void setForeignCollectionMaxEagerLevel(int i) {
        this.foreignCollectionMaxEagerLevel = i;
    }

    @Deprecated
    public void setMaxEagerForeignCollectionLevel(int i) {
        this.foreignCollectionMaxEagerLevel = i;
    }

    @Deprecated
    public void setForeignCollectionMaxEagerForeignCollectionLevel(int i) {
        this.foreignCollectionMaxEagerLevel = i;
    }

    public String getForeignCollectionColumnName() {
        return this.foreignCollectionColumnName;
    }

    public void setForeignCollectionColumnName(String str) {
        this.foreignCollectionColumnName = str;
    }

    public String getForeignCollectionOrderColumnName() {
        return this.foreignCollectionOrderColumnName;
    }

    @Deprecated
    public void setForeignCollectionOrderColumn(String str) {
        this.foreignCollectionOrderColumnName = str;
    }

    public void setForeignCollectionOrderColumnName(String str) {
        this.foreignCollectionOrderColumnName = str;
    }

    public boolean isForeignCollectionOrderAscending() {
        return this.foreignCollectionOrderAscending;
    }

    public void setForeignCollectionOrderAscending(boolean z) {
        this.foreignCollectionOrderAscending = z;
    }

    public String getForeignCollectionForeignFieldName() {
        return this.foreignCollectionForeignFieldName;
    }

    @Deprecated
    public void setForeignCollectionForeignColumnName(String str) {
        this.foreignCollectionForeignFieldName = str;
    }

    public void setForeignCollectionForeignFieldName(String str) {
        this.foreignCollectionForeignFieldName = str;
    }

    public Class<? extends DataPersister> getPersisterClass() {
        return this.persisterClass;
    }

    public void setPersisterClass(Class<? extends DataPersister> cls) {
        this.persisterClass = cls;
    }

    public boolean isAllowGeneratedIdInsert() {
        return this.allowGeneratedIdInsert;
    }

    public void setAllowGeneratedIdInsert(boolean z) {
        this.allowGeneratedIdInsert = z;
    }

    public String getColumnDefinition() {
        return this.columnDefinition;
    }

    public void setColumnDefinition(String str) {
        this.columnDefinition = str;
    }

    public boolean isForeignAutoCreate() {
        return this.foreignAutoCreate;
    }

    public void setForeignAutoCreate(boolean z) {
        this.foreignAutoCreate = z;
    }

    public boolean isVersion() {
        return this.version;
    }

    public void setVersion(boolean z) {
        this.version = z;
    }

    public String getForeignColumnName() {
        return this.foreignColumnName;
    }

    public void setForeignColumnName(String str) {
        this.foreignColumnName = str;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public static DatabaseFieldConfig fromField(DatabaseType databaseType, String str, Field field) {
        DatabaseField databaseField = (DatabaseField) field.getAnnotation(DatabaseField.class);
        if (databaseField != null) {
            return databaseField.persisted() ? fromDatabaseField(databaseType, str, field, databaseField) : null;
        } else {
            ForeignCollectionField foreignCollectionField = (ForeignCollectionField) field.getAnnotation(ForeignCollectionField.class);
            if (foreignCollectionField != null) {
                return fromForeignCollection(databaseType, field, foreignCollectionField);
            }
            return JavaxPersistence.createFieldConfig(databaseType, field);
        }
    }

    public static java.lang.reflect.Method findGetMethod(java.lang.reflect.Field r5, boolean r6) {
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
        r0 = "get";
        r0 = methodFromField(r5, r0);
        r1 = 0;
        r2 = r5.getDeclaringClass();	 Catch:{ Exception -> 0x0043 }
        r3 = 0;	 Catch:{ Exception -> 0x0043 }
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0043 }
        r2 = r2.getMethod(r0, r3);	 Catch:{ Exception -> 0x0043 }
        r3 = r2.getReturnType();
        r4 = r5.getType();
        if (r3 == r4) goto L_0x0042;
    L_0x001c:
        if (r6 != 0) goto L_0x001f;
    L_0x001e:
        return r1;
    L_0x001f:
        r6 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Return type of get method ";
        r1.append(r2);
        r1.append(r0);
        r0 = " does not return ";
        r1.append(r0);
        r5 = r5.getType();
        r1.append(r5);
        r5 = r1.toString();
        r6.<init>(r5);
        throw r6;
    L_0x0042:
        return r2;
        if (r6 != 0) goto L_0x0047;
    L_0x0046:
        return r1;
    L_0x0047:
        r6 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Could not find appropriate get method for ";
        r0.append(r1);
        r0.append(r5);
        r5 = r0.toString();
        r6.<init>(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.DatabaseFieldConfig.findGetMethod(java.lang.reflect.Field, boolean):java.lang.reflect.Method");
    }

    public static java.lang.reflect.Method findSetMethod(java.lang.reflect.Field r6, boolean r7) {
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
        r0 = "set";
        r0 = methodFromField(r6, r0);
        r1 = 0;
        r2 = r6.getDeclaringClass();	 Catch:{ Exception -> 0x004d }
        r3 = 1;	 Catch:{ Exception -> 0x004d }
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x004d }
        r4 = 0;	 Catch:{ Exception -> 0x004d }
        r5 = r6.getType();	 Catch:{ Exception -> 0x004d }
        r3[r4] = r5;	 Catch:{ Exception -> 0x004d }
        r2 = r2.getMethod(r0, r3);	 Catch:{ Exception -> 0x004d }
        r6 = r2.getReturnType();
        r3 = java.lang.Void.TYPE;
        if (r6 == r3) goto L_0x004c;
    L_0x0021:
        if (r7 != 0) goto L_0x0024;
    L_0x0023:
        return r1;
    L_0x0024:
        r6 = new java.lang.IllegalArgumentException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r1 = "Return type of set method ";
        r7.append(r1);
        r7.append(r0);
        r0 = " returns ";
        r7.append(r0);
        r0 = r2.getReturnType();
        r7.append(r0);
        r0 = " instead of void";
        r7.append(r0);
        r7 = r7.toString();
        r6.<init>(r7);
        throw r6;
    L_0x004c:
        return r2;
        if (r7 != 0) goto L_0x0051;
    L_0x0050:
        return r1;
    L_0x0051:
        r7 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Could not find appropriate set method for ";
        r0.append(r1);
        r0.append(r6);
        r6 = r0.toString();
        r7.<init>(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.DatabaseFieldConfig.findSetMethod(java.lang.reflect.Field, boolean):java.lang.reflect.Method");
    }

    public static DatabaseFieldConfig fromDatabaseField(DatabaseType databaseType, String str, Field field, DatabaseField databaseField) {
        str = new DatabaseFieldConfig();
        str.fieldName = field.getName();
        if (databaseType.isEntityNamesMustBeUpCase() != null) {
            str.fieldName = str.fieldName.toUpperCase();
        }
        str.columnName = valueIfNotBlank(databaseField.columnName());
        str.dataType = databaseField.dataType();
        databaseType = databaseField.defaultValue();
        if (!databaseType.equals(DatabaseField.DEFAULT_STRING)) {
            str.defaultValue = databaseType;
        }
        str.width = databaseField.width();
        str.canBeNull = databaseField.canBeNull();
        str.id = databaseField.id();
        str.generatedId = databaseField.generatedId();
        str.generatedIdSequence = valueIfNotBlank(databaseField.generatedIdSequence());
        str.foreign = databaseField.foreign();
        str.useGetSet = databaseField.useGetSet();
        str.unknownEnumValue = findMatchingEnumVal(field, databaseField.unknownEnumName());
        str.throwIfNull = databaseField.throwIfNull();
        str.format = valueIfNotBlank(databaseField.format());
        str.unique = databaseField.unique();
        str.uniqueCombo = databaseField.uniqueCombo();
        str.index = databaseField.index();
        str.indexName = valueIfNotBlank(databaseField.indexName());
        str.uniqueIndex = databaseField.uniqueIndex();
        str.uniqueIndexName = valueIfNotBlank(databaseField.uniqueIndexName());
        str.foreignAutoRefresh = databaseField.foreignAutoRefresh();
        str.maxForeignAutoRefreshLevel = databaseField.maxForeignAutoRefreshLevel();
        str.persisterClass = databaseField.persisterClass();
        str.allowGeneratedIdInsert = databaseField.allowGeneratedIdInsert();
        str.columnDefinition = valueIfNotBlank(databaseField.columnDefinition());
        str.foreignAutoCreate = databaseField.foreignAutoCreate();
        str.version = databaseField.version();
        str.foreignColumnName = valueIfNotBlank(databaseField.foreignColumnName());
        str.readOnly = databaseField.readOnly();
        return str;
    }

    public void postProcess() {
        if (this.foreignColumnName != null) {
            this.foreignAutoRefresh = true;
        }
        if (this.foreignAutoRefresh && this.maxForeignAutoRefreshLevel == -1) {
            this.maxForeignAutoRefreshLevel = 2;
        }
    }

    public static Enum<?> findMatchingEnumVal(Field field, String str) {
        if (str != null) {
            if (str.length() != 0) {
                for (Enum<?> enumR : (Enum[]) field.getType().getEnumConstants()) {
                    if (enumR.name().equals(str)) {
                        return enumR;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknwown enum unknown name ");
                stringBuilder.append(str);
                stringBuilder.append(" for field ");
                stringBuilder.append(field);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return null;
    }

    private static DatabaseFieldConfig fromForeignCollection(DatabaseType databaseType, Field field, ForeignCollectionField foreignCollectionField) {
        databaseType = new DatabaseFieldConfig();
        databaseType.fieldName = field.getName();
        if (foreignCollectionField.columnName().length() > null) {
            databaseType.columnName = foreignCollectionField.columnName();
        }
        databaseType.foreignCollection = true;
        databaseType.foreignCollectionEager = foreignCollectionField.eager();
        int maxEagerForeignCollectionLevel = foreignCollectionField.maxEagerForeignCollectionLevel();
        if (maxEagerForeignCollectionLevel != 1) {
            databaseType.foreignCollectionMaxEagerLevel = maxEagerForeignCollectionLevel;
        } else {
            databaseType.foreignCollectionMaxEagerLevel = foreignCollectionField.maxEagerLevel();
        }
        databaseType.foreignCollectionOrderColumnName = valueIfNotBlank(foreignCollectionField.orderColumnName());
        databaseType.foreignCollectionOrderAscending = foreignCollectionField.orderAscending();
        databaseType.foreignCollectionColumnName = valueIfNotBlank(foreignCollectionField.columnName());
        field = valueIfNotBlank(foreignCollectionField.foreignFieldName());
        if (field == null) {
            databaseType.foreignCollectionForeignFieldName = valueIfNotBlank(valueIfNotBlank(foreignCollectionField.foreignColumnName()));
        } else {
            databaseType.foreignCollectionForeignFieldName = field;
        }
        return databaseType;
    }

    private String findIndexName(String str) {
        if (this.columnName == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("_");
            stringBuilder.append(this.fieldName);
            stringBuilder.append("_idx");
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(this.columnName);
        stringBuilder.append("_idx");
        return stringBuilder.toString();
    }

    private static String valueIfNotBlank(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return str;
            }
        }
        return null;
    }

    private static String methodFromField(Field field, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(field.getName().substring(0, 1).toUpperCase());
        stringBuilder.append(field.getName().substring(1));
        return stringBuilder.toString();
    }
}
