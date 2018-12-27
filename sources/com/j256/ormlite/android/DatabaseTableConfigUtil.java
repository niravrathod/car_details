package com.j256.ormlite.android;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTableConfigUtil {
    private static final int ALLOW_GENERATED_ID_INSERT = 24;
    private static final int CAN_BE_NULL = 5;
    private static final int COLUMN_DEFINITON = 25;
    private static final int COLUMN_NAME = 1;
    private static final int DATA_TYPE = 2;
    private static final int DEFAULT_VALUE = 3;
    private static final int FOREIGN = 9;
    private static final int FOREIGN_AUTO_CREATE = 26;
    private static final int FOREIGN_AUTO_REFRESH = 21;
    private static final int FOREIGN_COLUMN_NAME = 28;
    private static final int FORMAT = 14;
    private static final int GENERATED_ID = 7;
    private static final int GENERATED_ID_SEQUENCE = 8;
    private static final int ID = 6;
    private static final int INDEX = 17;
    private static final int INDEX_NAME = 19;
    private static final int MAX_FOREIGN_AUTO_REFRESH_LEVEL = 22;
    private static final int PERSISTED = 13;
    private static final int PERSISTER_CLASS = 23;
    private static final int READ_ONLY = 29;
    private static final int THROW_IF_NULL = 12;
    private static final int UNIQUE = 15;
    private static final int UNIQUE_COMBO = 16;
    private static final int UNIQUE_INDEX = 18;
    private static final int UNIQUE_INDEX_NAME = 20;
    private static final int UNKNOWN_ENUM_NAME = 11;
    private static final int USE_GET_SET = 10;
    private static final int VERSION = 27;
    private static final int WIDTH = 4;
    private static Class<?> annotationFactoryClazz;
    private static Class<?> annotationMemberClazz;
    private static final int[] configFieldNums = lookupClasses();
    private static Field elementsField;
    private static Field nameField;
    private static Field valueField;
    private static int workedC;

    private static class DatabaseFieldSample {
        @DatabaseField
        String field;

        private DatabaseFieldSample() {
        }
    }

    public static <T> DatabaseTableConfig<T> fromClass(ConnectionSource connectionSource, Class<T> cls) {
        connectionSource = connectionSource.getDatabaseType();
        String extractTableName = DatabaseTableConfig.extractTableName(cls);
        List arrayList = new ArrayList();
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field configFromField : cls2.getDeclaredFields()) {
                DatabaseFieldConfig configFromField2 = configFromField(connectionSource, extractTableName, configFromField);
                if (configFromField2 != null && configFromField2.isPersisted()) {
                    arrayList.add(configFromField2);
                }
            }
        }
        if (arrayList.size() == null) {
            return null;
        }
        return new DatabaseTableConfig((Class) cls, extractTableName, arrayList);
    }

    public static int getWorkedC() {
        return workedC;
    }

    private static int[] lookupClasses() {
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
        r0 = 0;
        r1 = "org.apache.harmony.lang.annotation.AnnotationFactory";	 Catch:{ ClassNotFoundException -> 0x0094 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0094 }
        annotationFactoryClazz = r1;	 Catch:{ ClassNotFoundException -> 0x0094 }
        r1 = "org.apache.harmony.lang.annotation.AnnotationMember";	 Catch:{ ClassNotFoundException -> 0x0094 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0094 }
        annotationMemberClazz = r1;	 Catch:{ ClassNotFoundException -> 0x0094 }
        r1 = "[Lorg.apache.harmony.lang.annotation.AnnotationMember;";	 Catch:{ ClassNotFoundException -> 0x0094 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0094 }
        r2 = annotationFactoryClazz;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r3 = "elements";	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = r2.getDeclaredField(r3);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        elementsField = r2;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = elementsField;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r3 = 1;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2.setAccessible(r3);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = annotationMemberClazz;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r4 = "name";	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = r2.getDeclaredField(r4);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        nameField = r2;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = nameField;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2.setAccessible(r3);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = annotationMemberClazz;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r4 = "value";	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = r2.getDeclaredField(r4);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        valueField = r2;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = valueField;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2.setAccessible(r3);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = com.j256.ormlite.android.DatabaseTableConfigUtil.DatabaseFieldSample.class;	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r3 = "field";	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r2 = r2.getDeclaredField(r3);	 Catch:{ SecurityException -> 0x0093, NoSuchFieldException -> 0x0092 }
        r3 = com.j256.ormlite.field.DatabaseField.class;
        r2 = r2.getAnnotation(r3);
        r2 = (com.j256.ormlite.field.DatabaseField) r2;
        r2 = java.lang.reflect.Proxy.getInvocationHandler(r2);
        r3 = r2.getClass();
        r4 = annotationFactoryClazz;
        if (r3 == r4) goto L_0x0062;
    L_0x0061:
        return r0;
    L_0x0062:
        r3 = elementsField;	 Catch:{ IllegalAccessException -> 0x0091 }
        r2 = r3.get(r2);	 Catch:{ IllegalAccessException -> 0x0091 }
        if (r2 == 0) goto L_0x0090;	 Catch:{ IllegalAccessException -> 0x0091 }
    L_0x006a:
        r3 = r2.getClass();	 Catch:{ IllegalAccessException -> 0x0091 }
        if (r3 == r1) goto L_0x0071;	 Catch:{ IllegalAccessException -> 0x0091 }
    L_0x0070:
        goto L_0x0090;	 Catch:{ IllegalAccessException -> 0x0091 }
    L_0x0071:
        r2 = (java.lang.Object[]) r2;	 Catch:{ IllegalAccessException -> 0x0091 }
        r2 = (java.lang.Object[]) r2;	 Catch:{ IllegalAccessException -> 0x0091 }
        r1 = r2.length;	 Catch:{ IllegalAccessException -> 0x0091 }
        r1 = new int[r1];	 Catch:{ IllegalAccessException -> 0x0091 }
        r3 = 0;	 Catch:{ IllegalAccessException -> 0x0091 }
    L_0x0079:
        r4 = r2.length;	 Catch:{ IllegalAccessException -> 0x0091 }
        if (r3 >= r4) goto L_0x008f;	 Catch:{ IllegalAccessException -> 0x0091 }
    L_0x007c:
        r4 = nameField;	 Catch:{ IllegalAccessException -> 0x0091 }
        r5 = r2[r3];	 Catch:{ IllegalAccessException -> 0x0091 }
        r4 = r4.get(r5);	 Catch:{ IllegalAccessException -> 0x0091 }
        r4 = (java.lang.String) r4;	 Catch:{ IllegalAccessException -> 0x0091 }
        r4 = configFieldNameToNum(r4);	 Catch:{ IllegalAccessException -> 0x0091 }
        r1[r3] = r4;	 Catch:{ IllegalAccessException -> 0x0091 }
        r3 = r3 + 1;
        goto L_0x0079;
    L_0x008f:
        return r1;
    L_0x0090:
        return r0;
    L_0x0091:
        return r0;
    L_0x0092:
        return r0;
    L_0x0093:
        return r0;
    L_0x0094:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.DatabaseTableConfigUtil.lookupClasses():int[]");
    }

    private static int configFieldNameToNum(String str) {
        if (str.equals("columnName")) {
            return 1;
        }
        if (str.equals("dataType")) {
            return 2;
        }
        if (str.equals("defaultValue")) {
            return 3;
        }
        if (str.equals("width")) {
            return 4;
        }
        if (str.equals("canBeNull")) {
            return 5;
        }
        if (str.equals(FacebookAdapter.KEY_ID)) {
            return 6;
        }
        if (str.equals("generatedId")) {
            return 7;
        }
        if (str.equals("generatedIdSequence")) {
            return 8;
        }
        if (str.equals("foreign")) {
            return 9;
        }
        if (str.equals("useGetSet")) {
            return 10;
        }
        if (str.equals("unknownEnumName")) {
            return 11;
        }
        if (str.equals("throwIfNull")) {
            return 12;
        }
        if (str.equals("persisted")) {
            return 13;
        }
        if (str.equals("format")) {
            return 14;
        }
        if (str.equals("unique")) {
            return 15;
        }
        if (str.equals("uniqueCombo")) {
            return 16;
        }
        if (str.equals("index")) {
            return 17;
        }
        if (str.equals("uniqueIndex")) {
            return 18;
        }
        if (str.equals("indexName")) {
            return 19;
        }
        if (str.equals("uniqueIndexName")) {
            return 20;
        }
        if (str.equals("foreignAutoRefresh")) {
            return 21;
        }
        if (str.equals("maxForeignAutoRefreshLevel")) {
            return 22;
        }
        if (str.equals("persisterClass")) {
            return 23;
        }
        if (str.equals("allowGeneratedIdInsert")) {
            return 24;
        }
        if (str.equals("columnDefinition")) {
            return 25;
        }
        if (str.equals("foreignAutoCreate")) {
            return 26;
        }
        if (str.equals("version")) {
            return 27;
        }
        if (str.equals("foreignColumnName")) {
            return 28;
        }
        if (str.equals("readOnly")) {
            return 29;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find support for DatabaseField ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private static com.j256.ormlite.field.DatabaseFieldConfig configFromField(com.j256.ormlite.db.DatabaseType r2, java.lang.String r3, java.lang.reflect.Field r4) {
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
        r0 = configFieldNums;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        r2 = com.j256.ormlite.field.DatabaseFieldConfig.fromField(r2, r3, r4);
        return r2;
    L_0x0009:
        r0 = com.j256.ormlite.field.DatabaseField.class;
        r0 = r4.getAnnotation(r0);
        r0 = (com.j256.ormlite.field.DatabaseField) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x0019;
    L_0x0014:
        r0 = buildConfig(r0, r3, r4);	 Catch:{ Exception -> 0x0019 }
        r1 = r0;
    L_0x0019:
        if (r1 != 0) goto L_0x0020;
    L_0x001b:
        r2 = com.j256.ormlite.field.DatabaseFieldConfig.fromField(r2, r3, r4);
        return r2;
    L_0x0020:
        r2 = workedC;
        r2 = r2 + 1;
        workedC = r2;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.DatabaseTableConfigUtil.configFromField(com.j256.ormlite.db.DatabaseType, java.lang.String, java.lang.reflect.Field):com.j256.ormlite.field.DatabaseFieldConfig");
    }

    private static DatabaseFieldConfig buildConfig(DatabaseField databaseField, String str, Field field) {
        databaseField = Proxy.getInvocationHandler(databaseField);
        if (databaseField.getClass() != annotationFactoryClazz) {
            return null;
        }
        databaseField = elementsField.get(databaseField);
        if (databaseField == null) {
            return null;
        }
        str = new DatabaseFieldConfig(field.getName());
        Object[] objArr = (Object[]) databaseField;
        for (int i = 0; i < configFieldNums.length; i++) {
            Object obj = valueField.get(objArr[i]);
            if (obj != null) {
                assignConfigField(configFieldNums[i], str, field, obj);
            }
        }
        return str;
    }

    private static void assignConfigField(int i, DatabaseFieldConfig databaseFieldConfig, Field field, Object obj) {
        switch (i) {
            case 1:
                databaseFieldConfig.setColumnName(valueIfNotBlank((String) obj));
                return;
            case 2:
                databaseFieldConfig.setDataType((DataType) obj);
                return;
            case 3:
                String str = (String) obj;
                if (str != null && str.equals(DatabaseField.DEFAULT_STRING) == 0) {
                    databaseFieldConfig.setDefaultValue(str);
                    return;
                }
                return;
            case 4:
                databaseFieldConfig.setWidth(((Integer) obj).intValue());
                return;
            case 5:
                databaseFieldConfig.setCanBeNull(((Boolean) obj).booleanValue());
                return;
            case 6:
                databaseFieldConfig.setId(((Boolean) obj).booleanValue());
                return;
            case 7:
                databaseFieldConfig.setGeneratedId(((Boolean) obj).booleanValue());
                return;
            case 8:
                databaseFieldConfig.setGeneratedIdSequence(valueIfNotBlank((String) obj));
                return;
            case 9:
                databaseFieldConfig.setForeign(((Boolean) obj).booleanValue());
                return;
            case 10:
                databaseFieldConfig.setUseGetSet(((Boolean) obj).booleanValue());
                return;
            case 11:
                databaseFieldConfig.setUnknownEnumValue(DatabaseFieldConfig.findMatchingEnumVal(field, (String) obj));
                return;
            case 12:
                databaseFieldConfig.setThrowIfNull(((Boolean) obj).booleanValue());
                return;
            case 13:
                databaseFieldConfig.setPersisted(((Boolean) obj).booleanValue());
                return;
            case 14:
                databaseFieldConfig.setFormat(valueIfNotBlank((String) obj));
                return;
            case 15:
                databaseFieldConfig.setUnique(((Boolean) obj).booleanValue());
                return;
            case 16:
                databaseFieldConfig.setUniqueCombo(((Boolean) obj).booleanValue());
                return;
            case 17:
                databaseFieldConfig.setIndex(((Boolean) obj).booleanValue());
                return;
            case 18:
                databaseFieldConfig.setUniqueIndex(((Boolean) obj).booleanValue());
                return;
            case 19:
                databaseFieldConfig.setIndexName(valueIfNotBlank((String) obj));
                return;
            case 20:
                databaseFieldConfig.setUniqueIndexName(valueIfNotBlank((String) obj));
                return;
            case 21:
                databaseFieldConfig.setForeignAutoRefresh(((Boolean) obj).booleanValue());
                return;
            case 22:
                databaseFieldConfig.setMaxForeignAutoRefreshLevel(((Integer) obj).intValue());
                return;
            case 23:
                databaseFieldConfig.setPersisterClass((Class) obj);
                return;
            case 24:
                databaseFieldConfig.setAllowGeneratedIdInsert(((Boolean) obj).booleanValue());
                return;
            case 25:
                databaseFieldConfig.setColumnDefinition(valueIfNotBlank((String) obj));
                return;
            case 26:
                databaseFieldConfig.setForeignAutoCreate(((Boolean) obj).booleanValue());
                return;
            case 27:
                databaseFieldConfig.setVersion(((Boolean) obj).booleanValue());
                return;
            case 28:
                databaseFieldConfig.setForeignColumnName(valueIfNotBlank((String) obj));
                return;
            case 29:
                databaseFieldConfig.setReadOnly(((Boolean) obj).booleanValue());
                return;
            default:
                field = new StringBuilder();
                field.append("Could not find support for DatabaseField number ");
                field.append(i);
                throw new IllegalStateException(field.toString());
        }
    }

    private static String valueIfNotBlank(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return str;
            }
        }
        return null;
    }
}
