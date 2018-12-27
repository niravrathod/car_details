package com.j256.ormlite.field;

import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.SQLException;

public class DatabaseFieldConfigLoader {
    private static final String CONFIG_FILE_END_MARKER = "# --field-end--";
    private static final String CONFIG_FILE_START_MARKER = "# --field-start--";
    private static final DataPersister DEFAULT_DATA_PERSISTER = DatabaseFieldConfig.DEFAULT_DATA_TYPE.getDataPersister();
    private static final int DEFAULT_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = 1;
    private static final String FIELD_NAME_ALLOW_GENERATED_ID_INSERT = "allowGeneratedIdInsert";
    private static final String FIELD_NAME_CAN_BE_NULL = "canBeNull";
    private static final String FIELD_NAME_COLUMN_DEFINITION = "columnDefinition";
    private static final String FIELD_NAME_COLUMN_NAME = "columnName";
    private static final String FIELD_NAME_DATA_PERSISTER = "dataPersister";
    private static final String FIELD_NAME_DEFAULT_VALUE = "defaultValue";
    private static final String FIELD_NAME_FIELD_NAME = "fieldName";
    private static final String FIELD_NAME_FOREIGN = "foreign";
    private static final String FIELD_NAME_FOREIGN_AUTO_CREATE = "foreignAutoCreate";
    private static final String FIELD_NAME_FOREIGN_AUTO_REFRESH = "foreignAutoRefresh";
    private static final String FIELD_NAME_FOREIGN_COLLECTION = "foreignCollection";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_COLUMN_NAME = "foreignCollectionColumnName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_EAGER = "foreignCollectionEager";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME = "foreignCollectionForeignFieldName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME_OLD = "foreignCollectionForeignColumnName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_ORDER_ASCENDING = "foreignCollectionOrderAscending";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME = "foreignCollectionOrderColumnName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME_OLD = "foreignCollectionOrderColumn";
    private static final String FIELD_NAME_FOREIGN_COLUMN_NAME = "foreignColumnName";
    private static final String FIELD_NAME_FORMAT = "format";
    private static final String FIELD_NAME_GENERATED_ID = "generatedId";
    private static final String FIELD_NAME_GENERATED_ID_SEQUENCE = "generatedIdSequence";
    private static final String FIELD_NAME_ID = "id";
    private static final String FIELD_NAME_INDEX = "index";
    private static final String FIELD_NAME_INDEX_NAME = "indexName";
    private static final String FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = "foreignCollectionMaxEagerLevel";
    private static final String FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL_OLD = "maxEagerForeignCollectionLevel";
    private static final String FIELD_NAME_MAX_FOREIGN_AUTO_REFRESH_LEVEL = "maxForeignAutoRefreshLevel";
    private static final String FIELD_NAME_PERSISTER_CLASS = "persisterClass";
    private static final String FIELD_NAME_READ_ONLY = "readOnly";
    private static final String FIELD_NAME_THROW_IF_NULL = "throwIfNull";
    private static final String FIELD_NAME_UNIQUE = "unique";
    private static final String FIELD_NAME_UNIQUE_COMBO = "uniqueCombo";
    private static final String FIELD_NAME_UNIQUE_INDEX = "uniqueIndex";
    private static final String FIELD_NAME_UNIQUE_INDEX_NAME = "uniqueIndexName";
    private static final String FIELD_NAME_UNKNOWN_ENUM_VALUE = "unknownEnumValue";
    private static final String FIELD_NAME_USE_GET_SET = "useGetSet";
    private static final String FIELD_NAME_VERSION = "version";
    private static final String FIELD_NAME_WIDTH = "width";

    public static DatabaseFieldConfig fromReader(BufferedReader bufferedReader) {
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        Object obj = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.equals(CONFIG_FILE_END_MARKER)) {
                    break;
                } else if (!(readLine.length() == 0 || readLine.startsWith("#"))) {
                    if (!readLine.equals(CONFIG_FILE_START_MARKER)) {
                        String[] split = readLine.split(SimpleComparison.EQUAL_TO_OPERATION, -2);
                        if (split.length == 2) {
                            readField(databaseFieldConfig, split[0], split[1]);
                            obj = 1;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("DatabaseFieldConfig reading from stream cannot parse line: ");
                            stringBuilder.append(readLine);
                            throw new SQLException(stringBuilder.toString());
                        }
                    }
                }
            } catch (BufferedReader bufferedReader2) {
                throw SqlExceptionUtil.create("Could not read DatabaseFieldConfig from stream", bufferedReader2);
            }
        }
        return obj != null ? databaseFieldConfig : null;
    }

    public static void write(BufferedWriter bufferedWriter, DatabaseFieldConfig databaseFieldConfig, String str) {
        try {
            writeConfig(bufferedWriter, databaseFieldConfig, str);
        } catch (BufferedWriter bufferedWriter2) {
            throw SqlExceptionUtil.create("Could not write config to writer", bufferedWriter2);
        }
    }

    public static void writeConfig(BufferedWriter bufferedWriter, DatabaseFieldConfig databaseFieldConfig, String str) {
        bufferedWriter.append(CONFIG_FILE_START_MARKER);
        bufferedWriter.newLine();
        if (databaseFieldConfig.getFieldName() != null) {
            bufferedWriter.append(FIELD_NAME_FIELD_NAME).append('=').append(databaseFieldConfig.getFieldName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getColumnName() != null) {
            bufferedWriter.append(FIELD_NAME_COLUMN_NAME).append('=').append(databaseFieldConfig.getColumnName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getDataPersister() != DEFAULT_DATA_PERSISTER) {
            Object obj = null;
            for (DataType dataType : DataType.values()) {
                if (dataType.getDataPersister() == databaseFieldConfig.getDataPersister()) {
                    bufferedWriter.append(FIELD_NAME_DATA_PERSISTER).append('=').append(dataType.name());
                    bufferedWriter.newLine();
                    obj = 1;
                    break;
                }
            }
            if (obj == null) {
                str = new StringBuilder();
                str.append("Unknown data persister field: ");
                str.append(databaseFieldConfig.getDataPersister());
                throw new IllegalArgumentException(str.toString());
            }
        }
        if (databaseFieldConfig.getDefaultValue() != null) {
            bufferedWriter.append(FIELD_NAME_DEFAULT_VALUE).append('=').append(databaseFieldConfig.getDefaultValue());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getWidth() != 0) {
            bufferedWriter.append(FIELD_NAME_WIDTH).append('=').append(Integer.toString(databaseFieldConfig.getWidth()));
            bufferedWriter.newLine();
        }
        if (!databaseFieldConfig.isCanBeNull()) {
            bufferedWriter.append(FIELD_NAME_CAN_BE_NULL).append('=').append(Boolean.toString(databaseFieldConfig.isCanBeNull()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isId()) {
            bufferedWriter.append("id").append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isGeneratedId()) {
            bufferedWriter.append(FIELD_NAME_GENERATED_ID).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getGeneratedIdSequence() != null) {
            bufferedWriter.append(FIELD_NAME_GENERATED_ID_SEQUENCE).append('=').append(databaseFieldConfig.getGeneratedIdSequence());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeign()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isUseGetSet()) {
            bufferedWriter.append(FIELD_NAME_USE_GET_SET).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getUnknownEnumValue() != null) {
            bufferedWriter.append(FIELD_NAME_UNKNOWN_ENUM_VALUE).append('=').append(databaseFieldConfig.getUnknownEnumValue().getClass().getName()).append("#").append(databaseFieldConfig.getUnknownEnumValue().name());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isThrowIfNull()) {
            bufferedWriter.append(FIELD_NAME_THROW_IF_NULL).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getFormat() != null) {
            bufferedWriter.append(FIELD_NAME_FORMAT).append('=').append(databaseFieldConfig.getFormat());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isUnique()) {
            bufferedWriter.append(FIELD_NAME_UNIQUE).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isUniqueCombo()) {
            bufferedWriter.append(FIELD_NAME_UNIQUE_COMBO).append('=').append("true");
            bufferedWriter.newLine();
        }
        CharSequence indexName = databaseFieldConfig.getIndexName(str);
        if (indexName != null) {
            bufferedWriter.append(FIELD_NAME_INDEX_NAME).append('=').append(indexName);
            bufferedWriter.newLine();
        }
        str = databaseFieldConfig.getUniqueIndexName(str);
        if (str != null) {
            bufferedWriter.append(FIELD_NAME_UNIQUE_INDEX_NAME).append('=').append(str);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignAutoRefresh() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_AUTO_REFRESH).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getMaxForeignAutoRefreshLevel() != -1) {
            bufferedWriter.append(FIELD_NAME_MAX_FOREIGN_AUTO_REFRESH_LEVEL).append('=').append(Integer.toString(databaseFieldConfig.getMaxForeignAutoRefreshLevel()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getPersisterClass() != DatabaseFieldConfig.DEFAULT_PERSISTER_CLASS) {
            bufferedWriter.append(FIELD_NAME_PERSISTER_CLASS).append('=').append(databaseFieldConfig.getPersisterClass().getName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isAllowGeneratedIdInsert() != null) {
            bufferedWriter.append(FIELD_NAME_ALLOW_GENERATED_ID_INSERT).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getColumnDefinition() != null) {
            bufferedWriter.append(FIELD_NAME_COLUMN_DEFINITION).append('=').append(databaseFieldConfig.getColumnDefinition());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignAutoCreate() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_AUTO_CREATE).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isVersion() != null) {
            bufferedWriter.append(FIELD_NAME_VERSION).append('=').append("true");
            bufferedWriter.newLine();
        }
        str = databaseFieldConfig.getForeignColumnName();
        if (str != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLUMN_NAME).append('=').append(str);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isReadOnly() != null) {
            bufferedWriter.append(FIELD_NAME_READ_ONLY).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignCollection() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignCollectionEager() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_EAGER).append('=').append("true");
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionMaxEagerLevel() != 1) {
            bufferedWriter.append(FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL).append('=').append(Integer.toString(databaseFieldConfig.getForeignCollectionMaxEagerLevel()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionColumnName() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_COLUMN_NAME).append('=').append(databaseFieldConfig.getForeignCollectionColumnName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionOrderColumnName() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME).append('=').append(databaseFieldConfig.getForeignCollectionOrderColumnName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignCollectionOrderAscending() != 1) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_ORDER_ASCENDING).append('=').append(Boolean.toString(databaseFieldConfig.isForeignCollectionOrderAscending()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionForeignFieldName() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME).append('=').append(databaseFieldConfig.getForeignCollectionForeignFieldName());
            bufferedWriter.newLine();
        }
        bufferedWriter.append(CONFIG_FILE_END_MARKER);
        bufferedWriter.newLine();
    }

    private static void readField(com.j256.ormlite.field.DatabaseFieldConfig r8, java.lang.String r9, java.lang.String r10) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = "fieldName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r8.setFieldName(r10);
        goto L_0x0302;
    L_0x000d:
        r0 = "columnName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x001a;
    L_0x0015:
        r8.setColumnName(r10);
        goto L_0x0302;
    L_0x001a:
        r0 = "dataPersister";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x002f;
    L_0x0022:
        r9 = com.j256.ormlite.field.DataType.valueOf(r10);
        r9 = r9.getDataPersister();
        r8.setDataPersister(r9);
        goto L_0x0302;
    L_0x002f:
        r0 = "defaultValue";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r8.setDefaultValue(r10);
        goto L_0x0302;
    L_0x003c:
        r0 = "width";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x004d;
    L_0x0044:
        r9 = java.lang.Integer.parseInt(r10);
        r8.setWidth(r9);
        goto L_0x0302;
    L_0x004d:
        r0 = "canBeNull";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x0055:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setCanBeNull(r9);
        goto L_0x0302;
    L_0x005e:
        r0 = "id";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x006f;
    L_0x0066:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setId(r9);
        goto L_0x0302;
    L_0x006f:
        r0 = "generatedId";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0080;
    L_0x0077:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setGeneratedId(r9);
        goto L_0x0302;
    L_0x0080:
        r0 = "generatedIdSequence";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x008d;
    L_0x0088:
        r8.setGeneratedIdSequence(r10);
        goto L_0x0302;
    L_0x008d:
        r0 = "foreign";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x009e;
    L_0x0095:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setForeign(r9);
        goto L_0x0302;
    L_0x009e:
        r0 = "useGetSet";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x00af;
    L_0x00a6:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setUseGetSet(r9);
        goto L_0x0302;
    L_0x00af:
        r0 = "unknownEnumValue";
        r0 = r9.equals(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x014b;
    L_0x00b8:
        r9 = "#";
        r0 = -2;
        r9 = r10.split(r9, r0);
        r0 = r9.length;
        r2 = 2;
        if (r0 != r2) goto L_0x0134;
    L_0x00c3:
        r0 = 0;
        r2 = r9[r0];	 Catch:{ ClassNotFoundException -> 0x011d }
        r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x011d }
        r2 = r2.getEnumConstants();
        if (r2 == 0) goto L_0x0106;
    L_0x00d0:
        r2 = (java.lang.Enum[]) r2;
        r3 = r2.length;
        r4 = 0;
    L_0x00d4:
        if (r0 >= r3) goto L_0x00eb;
    L_0x00d6:
        r5 = r2[r0];
        r6 = r5.name();
        r7 = r9[r1];
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x00e8;
    L_0x00e4:
        r8.setUnknownEnumValue(r5);
        r4 = 1;
    L_0x00e8:
        r0 = r0 + 1;
        goto L_0x00d4;
    L_0x00eb:
        if (r4 == 0) goto L_0x00ef;
    L_0x00ed:
        goto L_0x0302;
    L_0x00ef:
        r8 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Invalid enum value name for unknownEnumvalue: ";
        r9.append(r0);
        r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0106:
        r8 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Invalid class is not an Enum for unknownEnumValue: ";
        r9.append(r0);
        r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x011d:
        r8 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Unknown class specified for unknownEnumValue: ";
        r9.append(r0);
        r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0134:
        r8 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Invalid value for unknownEnumValue which should be in class#name format: ";
        r9.append(r0);
        r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x014b:
        r0 = "throwIfNull";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x015c;
    L_0x0153:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setThrowIfNull(r9);
        goto L_0x0302;
    L_0x015c:
        r0 = "format";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0169;
    L_0x0164:
        r8.setFormat(r10);
        goto L_0x0302;
    L_0x0169:
        r0 = "unique";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x017a;
    L_0x0171:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setUnique(r9);
        goto L_0x0302;
    L_0x017a:
        r0 = "uniqueCombo";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x018b;
    L_0x0182:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setUniqueCombo(r9);
        goto L_0x0302;
    L_0x018b:
        r0 = "index";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x019c;
    L_0x0193:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setIndex(r9);
        goto L_0x0302;
    L_0x019c:
        r0 = "indexName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x01ac;
    L_0x01a4:
        r8.setIndex(r1);
        r8.setIndexName(r10);
        goto L_0x0302;
    L_0x01ac:
        r0 = "uniqueIndex";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x01bd;
    L_0x01b4:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setUniqueIndex(r9);
        goto L_0x0302;
    L_0x01bd:
        r0 = "uniqueIndexName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x01cd;
    L_0x01c5:
        r8.setUniqueIndex(r1);
        r8.setUniqueIndexName(r10);
        goto L_0x0302;
    L_0x01cd:
        r0 = "foreignAutoRefresh";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x01de;
    L_0x01d5:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setForeignAutoRefresh(r9);
        goto L_0x0302;
    L_0x01de:
        r0 = "maxForeignAutoRefreshLevel";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x01ef;
    L_0x01e6:
        r9 = java.lang.Integer.parseInt(r10);
        r8.setMaxForeignAutoRefreshLevel(r9);
        goto L_0x0302;
    L_0x01ef:
        r0 = "persisterClass";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0217;
    L_0x01f7:
        r9 = java.lang.Class.forName(r10);	 Catch:{ ClassNotFoundException -> 0x0200 }
        r8.setPersisterClass(r9);	 Catch:{ ClassNotFoundException -> 0x0200 }
        goto L_0x0302;
    L_0x0200:
        r8 = new java.lang.IllegalArgumentException;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = "Could not find persisterClass: ";
        r9.append(r0);
        r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0217:
        r0 = "allowGeneratedIdInsert";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0228;
    L_0x021f:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setAllowGeneratedIdInsert(r9);
        goto L_0x0302;
    L_0x0228:
        r0 = "columnDefinition";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0235;
    L_0x0230:
        r8.setColumnDefinition(r10);
        goto L_0x0302;
    L_0x0235:
        r0 = "foreignAutoCreate";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0246;
    L_0x023d:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setForeignAutoCreate(r9);
        goto L_0x0302;
    L_0x0246:
        r0 = "version";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0257;
    L_0x024e:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setVersion(r9);
        goto L_0x0302;
    L_0x0257:
        r0 = "foreignColumnName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0264;
    L_0x025f:
        r8.setForeignColumnName(r10);
        goto L_0x0302;
    L_0x0264:
        r0 = "readOnly";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0275;
    L_0x026c:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setReadOnly(r9);
        goto L_0x0302;
    L_0x0275:
        r0 = "foreignCollection";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0286;
    L_0x027d:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setForeignCollection(r9);
        goto L_0x0302;
    L_0x0286:
        r0 = "foreignCollectionEager";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x0297;
    L_0x028e:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setForeignCollectionEager(r9);
        goto L_0x0302;
    L_0x0297:
        r0 = "maxEagerForeignCollectionLevel";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02a7;
    L_0x029f:
        r9 = java.lang.Integer.parseInt(r10);
        r8.setForeignCollectionMaxEagerLevel(r9);
        goto L_0x0302;
    L_0x02a7:
        r0 = "foreignCollectionMaxEagerLevel";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02b7;
    L_0x02af:
        r9 = java.lang.Integer.parseInt(r10);
        r8.setForeignCollectionMaxEagerLevel(r9);
        goto L_0x0302;
    L_0x02b7:
        r0 = "foreignCollectionColumnName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02c3;
    L_0x02bf:
        r8.setForeignCollectionColumnName(r10);
        goto L_0x0302;
    L_0x02c3:
        r0 = "foreignCollectionOrderColumn";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02cf;
    L_0x02cb:
        r8.setForeignCollectionOrderColumnName(r10);
        goto L_0x0302;
    L_0x02cf:
        r0 = "foreignCollectionOrderColumnName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02db;
    L_0x02d7:
        r8.setForeignCollectionOrderColumnName(r10);
        goto L_0x0302;
    L_0x02db:
        r0 = "foreignCollectionOrderAscending";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02eb;
    L_0x02e3:
        r9 = java.lang.Boolean.parseBoolean(r10);
        r8.setForeignCollectionOrderAscending(r9);
        goto L_0x0302;
    L_0x02eb:
        r0 = "foreignCollectionForeignColumnName";
        r0 = r9.equals(r0);
        if (r0 == 0) goto L_0x02f7;
    L_0x02f3:
        r8.setForeignCollectionForeignFieldName(r10);
        goto L_0x0302;
    L_0x02f7:
        r0 = "foreignCollectionForeignFieldName";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x0302;
    L_0x02ff:
        r8.setForeignCollectionForeignFieldName(r10);
    L_0x0302:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.DatabaseFieldConfigLoader.readField(com.j256.ormlite.field.DatabaseFieldConfig, java.lang.String, java.lang.String):void");
    }
}
