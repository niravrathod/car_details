package com.j256.ormlite.field;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.BaseForeignCollection;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.EagerForeignCollection;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.dao.LazyForeignCollection;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.mapped.MappedQueryForId;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.TableInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

public class FieldType {
    private static boolean DEFAULT_VALUE_BOOLEAN = false;
    private static byte DEFAULT_VALUE_BYTE = (byte) 0;
    private static char DEFAULT_VALUE_CHAR = '\u0000';
    private static double DEFAULT_VALUE_DOUBLE = 0.0d;
    private static float DEFAULT_VALUE_FLOAT = 0.0f;
    private static int DEFAULT_VALUE_INT = 0;
    private static long DEFAULT_VALUE_LONG = 0;
    private static short DEFAULT_VALUE_SHORT = (short) 0;
    public static final String FOREIGN_ID_FIELD_SUFFIX = "_id";
    private static final ThreadLocal<LevelCounters> threadLevelCounters = new C26701();
    private final String columnName;
    private final ConnectionSource connectionSource;
    private DataPersister dataPersister;
    private Object dataTypeConfigObj;
    private Object defaultValue;
    private final Field field;
    private final DatabaseFieldConfig fieldConfig;
    private FieldConverter fieldConverter;
    private final Method fieldGetMethod;
    private final Method fieldSetMethod;
    private BaseDaoImpl<?, ?> foreignDao;
    private FieldType foreignFieldType;
    private FieldType foreignIdField;
    private TableInfo<?, ?> foreignTableInfo;
    private final String generatedIdSequence;
    private final boolean isGeneratedId;
    private final boolean isId;
    private MappedQueryForId<Object, Object> mappedQueryForId;
    private final Class<?> parentClass;
    private final String tableName;

    /* renamed from: com.j256.ormlite.field.FieldType$1 */
    static class C26701 extends ThreadLocal<LevelCounters> {
        C26701() {
        }

        protected LevelCounters initialValue() {
            return new LevelCounters();
        }
    }

    private static class LevelCounters {
        int autoRefreshLevel;
        int autoRefreshLevelMax;
        int foreignCollectionLevel;
        int foreignCollectionLevelMax;

        private LevelCounters() {
        }
    }

    public FieldType(com.j256.ormlite.support.ConnectionSource r7, java.lang.String r8, java.lang.reflect.Field r9, com.j256.ormlite.field.DatabaseFieldConfig r10, java.lang.Class<?> r11) {
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
        r6 = this;
        r6.<init>();
        r6.connectionSource = r7;
        r6.tableName = r8;
        r7 = r7.getDatabaseType();
        r6.field = r9;
        r6.parentClass = r11;
        r10.postProcess();
        r11 = r9.getType();
        r0 = r10.getDataPersister();
        r1 = 0;
        r2 = 0;
        if (r0 != 0) goto L_0x00ba;
    L_0x001e:
        r0 = r10.getPersisterClass();
        if (r0 == 0) goto L_0x00b5;
    L_0x0024:
        r3 = com.j256.ormlite.field.types.VoidType.class;
        if (r0 != r3) goto L_0x002a;
    L_0x0028:
        goto L_0x00b5;
    L_0x002a:
        r3 = "getSingleton";	 Catch:{ Exception -> 0x009e }
        r4 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x009e }
        r3 = r0.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x009e }
        r4 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x0083, Exception -> 0x006c }
        r3 = r3.invoke(r2, r4);	 Catch:{ InvocationTargetException -> 0x0083, Exception -> 0x006c }
        if (r3 == 0) goto L_0x0055;
    L_0x003a:
        r3 = (com.j256.ormlite.field.DataPersister) r3;	 Catch:{ Exception -> 0x003e }
        goto L_0x0109;
    L_0x003e:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Could not cast result of static getSingleton method to DataPersister from class ";
        r8.append(r9);
        r8.append(r0);
        r8 = r8.toString();
        r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r8, r7);
        throw r7;
    L_0x0055:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Static getSingleton method should not return null on class ";
        r8.append(r9);
        r8.append(r0);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x006c:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Could not run getSingleton method on class ";
        r8.append(r9);
        r8.append(r0);
        r8 = r8.toString();
        r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r8, r7);
        throw r7;
    L_0x0083:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Could not run getSingleton method on class ";
        r8.append(r9);
        r8.append(r0);
        r8 = r8.toString();
        r7 = r7.getTargetException();
        r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r8, r7);
        throw r7;
    L_0x009e:
        r7 = move-exception;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Could not find getSingleton static method on class ";
        r8.append(r9);
        r8.append(r0);
        r8 = r8.toString();
        r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r8, r7);
        throw r7;
    L_0x00b5:
        r3 = com.j256.ormlite.field.DataPersisterManager.lookupForField(r9);
        goto L_0x0109;
    L_0x00ba:
        r3 = r10.getDataPersister();
        r0 = r3.isValidForField(r9);
        if (r0 != 0) goto L_0x0109;
    L_0x00c4:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "Field class ";
        r7.append(r8);
        r8 = r11.getName();
        r7.append(r8);
        r8 = " for field ";
        r7.append(r8);
        r7.append(r6);
        r8 = " is not valid for type ";
        r7.append(r8);
        r7.append(r3);
        r8 = r3.getPrimaryClass();
        if (r8 == 0) goto L_0x00ff;
    L_0x00eb:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = ", maybe should be ";
        r9.append(r10);
        r9.append(r8);
        r8 = r9.toString();
        r7.append(r8);
    L_0x00ff:
        r8 = new java.lang.IllegalArgumentException;
        r7 = r7.toString();
        r8.<init>(r7);
        throw r8;
    L_0x0109:
        r0 = r10.getForeignColumnName();
        r4 = r9.getName();
        r5 = r10.isForeign();
        if (r5 != 0) goto L_0x024a;
    L_0x0117:
        r5 = r10.isForeignAutoRefresh();
        if (r5 != 0) goto L_0x024a;
    L_0x011d:
        if (r0 == 0) goto L_0x0121;
    L_0x011f:
        goto L_0x024a;
    L_0x0121:
        r0 = r10.isForeignCollection();
        if (r0 == 0) goto L_0x01b5;
    L_0x0127:
        r0 = java.util.Collection.class;
        if (r11 == r0) goto L_0x0162;
    L_0x012b:
        r0 = com.j256.ormlite.dao.ForeignCollection.class;
        r11 = r0.isAssignableFrom(r11);
        if (r11 == 0) goto L_0x0134;
    L_0x0133:
        goto L_0x0162;
    L_0x0134:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field class for '";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = "' must be of class ";
        r8.append(r9);
        r9 = com.j256.ormlite.dao.ForeignCollection.class;
        r9 = r9.getSimpleName();
        r8.append(r9);
        r9 = " or Collection.";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0162:
        r11 = r9.getGenericType();
        r0 = r11 instanceof java.lang.reflect.ParameterizedType;
        if (r0 == 0) goto L_0x0195;
    L_0x016a:
        r11 = (java.lang.reflect.ParameterizedType) r11;
        r11 = r11.getActualTypeArguments();
        r11 = r11.length;
        if (r11 == 0) goto L_0x0175;
    L_0x0173:
        goto L_0x02a9;
    L_0x0175:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field class for '";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = "' must be a parameterized Collection with at least 1 type.";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0195:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field class for '";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = "' must be a parameterized Collection.";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x01b5:
        if (r3 != 0) goto L_0x02a9;
    L_0x01b7:
        r0 = r10.isForeignCollection();
        if (r0 != 0) goto L_0x02a9;
    L_0x01bd:
        r7 = byte[].class;
        r7 = r7.isAssignableFrom(r11);
        if (r7 != 0) goto L_0x0222;
    L_0x01c5:
        r7 = java.io.Serializable.class;
        r7 = r7.isAssignableFrom(r11);
        if (r7 == 0) goto L_0x01fa;
    L_0x01cd:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "ORMLite does not know how to store ";
        r8.append(r10);
        r8.append(r11);
        r10 = " for field '";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = "'.  Use another class, custom persister, or to serialize it use ";
        r8.append(r9);
        r9 = "dataType=DataType.SERIALIZABLE";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x01fa:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "ORMLite does not know how to store ";
        r8.append(r10);
        r8.append(r11);
        r10 = " for field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = ". Use another class or a custom persister.";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0222:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "ORMLite does not know how to store ";
        r8.append(r10);
        r8.append(r11);
        r10 = " for field '";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = "'. byte[] fields must specify dataType=DataType.BYTE_ARRAY or SERIALIZABLE";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x024a:
        if (r3 == 0) goto L_0x0277;
    L_0x024c:
        r5 = r3.isPrimitive();
        if (r5 != 0) goto L_0x0253;
    L_0x0252:
        goto L_0x0277;
    L_0x0253:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "Field ";
        r8.append(r9);
        r8.append(r6);
        r9 = " is a primitive class ";
        r8.append(r9);
        r8.append(r11);
        r9 = " but marked as foreign";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0277:
        if (r0 != 0) goto L_0x028c;
    L_0x0279:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r4);
        r4 = "_id";
        r0.append(r4);
        r0 = r0.toString();
    L_0x028a:
        r4 = r0;
        goto L_0x02a1;
    L_0x028c:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r4);
        r4 = "_";
        r5.append(r4);
        r5.append(r0);
        r0 = r5.toString();
        goto L_0x028a;
    L_0x02a1:
        r0 = com.j256.ormlite.dao.ForeignCollection.class;
        r0 = r0.isAssignableFrom(r11);
        if (r0 != 0) goto L_0x04d4;
    L_0x02a9:
        r11 = r10.getColumnName();
        if (r11 != 0) goto L_0x02b2;
    L_0x02af:
        r6.columnName = r4;
        goto L_0x02b8;
    L_0x02b2:
        r11 = r10.getColumnName();
        r6.columnName = r11;
    L_0x02b8:
        r6.fieldConfig = r10;
        r11 = r10.isId();
        r0 = 1;
        if (r11 == 0) goto L_0x02f0;
    L_0x02c1:
        r8 = r10.isGeneratedId();
        if (r8 != 0) goto L_0x02d5;
    L_0x02c7:
        r8 = r10.getGeneratedIdSequence();
        if (r8 != 0) goto L_0x02d5;
    L_0x02cd:
        r6.isId = r0;
        r6.isGeneratedId = r1;
        r6.generatedIdSequence = r2;
        goto L_0x034c;
    L_0x02d5:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Must specify one of id, generatedId, and generatedIdSequence with ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x02f0:
        r11 = r10.isGeneratedId();
        if (r11 == 0) goto L_0x032b;
    L_0x02f6:
        r11 = r10.getGeneratedIdSequence();
        if (r11 != 0) goto L_0x0310;
    L_0x02fc:
        r6.isId = r0;
        r6.isGeneratedId = r0;
        r11 = r7.isIdSequenceNeeded();
        if (r11 == 0) goto L_0x030d;
    L_0x0306:
        r8 = r7.generateIdSequenceName(r8, r6);
        r6.generatedIdSequence = r8;
        goto L_0x034c;
    L_0x030d:
        r6.generatedIdSequence = r2;
        goto L_0x034c;
    L_0x0310:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Must specify one of id, generatedId, and generatedIdSequence with ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x032b:
        r8 = r10.getGeneratedIdSequence();
        if (r8 == 0) goto L_0x0346;
    L_0x0331:
        r6.isId = r0;
        r6.isGeneratedId = r0;
        r8 = r10.getGeneratedIdSequence();
        r11 = r7.isEntityNamesMustBeUpCase();
        if (r11 == 0) goto L_0x0343;
    L_0x033f:
        r8 = r8.toUpperCase();
    L_0x0343:
        r6.generatedIdSequence = r8;
        goto L_0x034c;
    L_0x0346:
        r6.isId = r1;
        r6.isGeneratedId = r1;
        r6.generatedIdSequence = r2;
    L_0x034c:
        r8 = r6.isId;
        if (r8 == 0) goto L_0x037d;
    L_0x0350:
        r8 = r10.isForeign();
        if (r8 != 0) goto L_0x035d;
    L_0x0356:
        r8 = r10.isForeignAutoRefresh();
        if (r8 != 0) goto L_0x035d;
    L_0x035c:
        goto L_0x037d;
    L_0x035d:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Id field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " cannot also be a foreign object";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x037d:
        r8 = r10.isUseGetSet();
        if (r8 == 0) goto L_0x0390;
    L_0x0383:
        r8 = com.j256.ormlite.field.DatabaseFieldConfig.findGetMethod(r9, r0);
        r6.fieldGetMethod = r8;
        r8 = com.j256.ormlite.field.DatabaseFieldConfig.findSetMethod(r9, r0);
        r6.fieldSetMethod = r8;
        goto L_0x03c0;
    L_0x0390:
        r8 = r9.isAccessible();
        if (r8 != 0) goto L_0x03bc;
    L_0x0396:
        r8 = r6.field;	 Catch:{ SecurityException -> 0x039c }
        r8.setAccessible(r0);	 Catch:{ SecurityException -> 0x039c }
        goto L_0x03bc;
    L_0x039c:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Could not open access to field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = ".  You may have to set useGetSet=true to fix.";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x03bc:
        r6.fieldGetMethod = r2;
        r6.fieldSetMethod = r2;
    L_0x03c0:
        r8 = r10.isAllowGeneratedIdInsert();
        if (r8 == 0) goto L_0x03ed;
    L_0x03c6:
        r8 = r10.isGeneratedId();
        if (r8 == 0) goto L_0x03cd;
    L_0x03cc:
        goto L_0x03ed;
    L_0x03cd:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " must be a generated-id if allowGeneratedIdInsert = true";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x03ed:
        r8 = r10.isForeignAutoRefresh();
        if (r8 == 0) goto L_0x041a;
    L_0x03f3:
        r8 = r10.isForeign();
        if (r8 == 0) goto L_0x03fa;
    L_0x03f9:
        goto L_0x041a;
    L_0x03fa:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " must have foreign = true if foreignAutoRefresh = true";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x041a:
        r8 = r10.isForeignAutoCreate();
        if (r8 == 0) goto L_0x0447;
    L_0x0420:
        r8 = r10.isForeign();
        if (r8 == 0) goto L_0x0427;
    L_0x0426:
        goto L_0x0447;
    L_0x0427:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " must have foreign = true if foreignAutoCreate = true";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0447:
        r8 = r10.getForeignColumnName();
        if (r8 == 0) goto L_0x0474;
    L_0x044d:
        r8 = r10.isForeign();
        if (r8 == 0) goto L_0x0454;
    L_0x0453:
        goto L_0x0474;
    L_0x0454:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " must have foreign = true if foreignColumnName is set";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0474:
        r8 = r10.isVersion();
        if (r8 == 0) goto L_0x04a3;
    L_0x047a:
        if (r3 == 0) goto L_0x0483;
    L_0x047c:
        r8 = r3.isValidForVersion();
        if (r8 == 0) goto L_0x0483;
    L_0x0482:
        goto L_0x04a3;
    L_0x0483:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " is not a valid type to be a version field";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x04a3:
        r8 = r10.getMaxForeignAutoRefreshLevel();
        if (r8 <= 0) goto L_0x04d0;
    L_0x04a9:
        r8 = r10.isForeignAutoRefresh();
        if (r8 == 0) goto L_0x04b0;
    L_0x04af:
        goto L_0x04d0;
    L_0x04b0:
        r7 = new java.lang.IllegalArgumentException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field ";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = " has maxForeignAutoRefreshLevel set but not foreignAutoRefresh is false";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x04d0:
        r6.assignDataType(r7, r3);
        return;
    L_0x04d4:
        r7 = new java.sql.SQLException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r10 = "Field '";
        r8.append(r10);
        r9 = r9.getName();
        r8.append(r9);
        r9 = "' in class ";
        r8.append(r9);
        r8.append(r11);
        r9 = "' should use the @";
        r8.append(r9);
        r9 = com.j256.ormlite.field.ForeignCollectionField.class;
        r9 = r9.getSimpleName();
        r8.append(r9);
        r9 = " annotation not foreign=true";
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.FieldType.<init>(com.j256.ormlite.support.ConnectionSource, java.lang.String, java.lang.reflect.Field, com.j256.ormlite.field.DatabaseFieldConfig, java.lang.Class):void");
    }

    public void configDaoInformation(ConnectionSource connectionSource, Class<?> cls) {
        DatabaseTableConfig foreignTableConfig;
        FieldType idField;
        BaseDaoImpl baseDaoImpl;
        Class type = this.field.getType();
        DatabaseType databaseType = connectionSource.getDatabaseType();
        String foreignColumnName = this.fieldConfig.getForeignColumnName();
        MappedQueryForId mappedQueryForId = null;
        if (!this.fieldConfig.isForeignAutoRefresh()) {
            if (foreignColumnName == null) {
                if (this.fieldConfig.isForeign()) {
                    if (this.dataPersister != null) {
                        if (this.dataPersister.isPrimitive() != null) {
                            cls = new StringBuilder();
                            cls.append("Field ");
                            cls.append(this);
                            cls.append(" is a primitive class ");
                            cls.append(type);
                            cls.append(" but marked as foreign");
                            throw new IllegalArgumentException(cls.toString());
                        }
                    }
                    foreignTableConfig = this.fieldConfig.getForeignTableConfig();
                    if (foreignTableConfig != null) {
                        foreignTableConfig.extractFieldTypes(connectionSource);
                        connectionSource = (BaseDaoImpl) DaoManager.createDao(connectionSource, foreignTableConfig);
                    } else {
                        connectionSource = (BaseDaoImpl) DaoManager.createDao(connectionSource, type);
                    }
                    cls = connectionSource.getTableInfo();
                    idField = cls.getIdField();
                    if (idField != null) {
                        if (isForeignAutoCreate()) {
                            if (!idField.isGeneratedId()) {
                                cls = new StringBuilder();
                                cls.append("Field ");
                                cls.append(this.field.getName());
                                cls.append(", if foreignAutoCreate = true then class ");
                                cls.append(type.getSimpleName());
                                cls.append(" must have id field with generatedId = true");
                                throw new IllegalArgumentException(cls.toString());
                            }
                        }
                        baseDaoImpl = connectionSource;
                        connectionSource = null;
                    } else {
                        cls = new StringBuilder();
                        cls.append("Foreign field ");
                        cls.append(type);
                        cls.append(" does not have id field");
                        throw new IllegalArgumentException(cls.toString());
                    }
                } else if (this.fieldConfig.isForeignCollection()) {
                    if (type != Collection.class) {
                        if (!ForeignCollection.class.isAssignableFrom(type)) {
                            cls = new StringBuilder();
                            cls.append("Field class for '");
                            cls.append(this.field.getName());
                            cls.append("' must be of class ");
                            cls.append(ForeignCollection.class.getSimpleName());
                            cls.append(" or Collection.");
                            throw new SQLException(cls.toString());
                        }
                    }
                    Type genericType = this.field.getGenericType();
                    if (genericType instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                        if (actualTypeArguments.length == 0) {
                            cls = new StringBuilder();
                            cls.append("Field class for '");
                            cls.append(this.field.getName());
                            cls.append("' must be a parameterized Collection with at least 1 type.");
                            throw new SQLException(cls.toString());
                        } else if (actualTypeArguments[0] instanceof Class) {
                            type = (Class) actualTypeArguments[0];
                            DatabaseTableConfig foreignTableConfig2 = this.fieldConfig.getForeignTableConfig();
                            if (foreignTableConfig2 == null) {
                                connectionSource = (BaseDaoImpl) DaoManager.createDao(connectionSource, type);
                            } else {
                                connectionSource = (BaseDaoImpl) DaoManager.createDao(connectionSource, foreignTableConfig2);
                            }
                            cls = findForeignFieldType(type, cls, connectionSource);
                            baseDaoImpl = connectionSource;
                            connectionSource = cls;
                            cls = null;
                            idField = cls;
                        } else {
                            cls = new StringBuilder();
                            cls.append("Field class for '");
                            cls.append(this.field.getName());
                            cls.append("' must be a parameterized Collection whose generic argument is an entity class not: ");
                            cls.append(actualTypeArguments[0]);
                            throw new SQLException(cls.toString());
                        }
                    }
                    cls = new StringBuilder();
                    cls.append("Field class for '");
                    cls.append(this.field.getName());
                    cls.append("' must be a parameterized Collection.");
                    throw new SQLException(cls.toString());
                } else {
                    connectionSource = null;
                    cls = connectionSource;
                    baseDaoImpl = cls;
                    idField = baseDaoImpl;
                }
                this.mappedQueryForId = mappedQueryForId;
                this.foreignTableInfo = cls;
                this.foreignFieldType = connectionSource;
                this.foreignDao = baseDaoImpl;
                this.foreignIdField = idField;
                if (this.foreignIdField != null) {
                    assignDataType(databaseType, this.foreignIdField.getDataPersister());
                }
            }
        }
        foreignTableConfig = this.fieldConfig.getForeignTableConfig();
        if (foreignTableConfig == null) {
            connectionSource = (BaseDaoImpl) DaoManager.createDao(connectionSource, type);
            cls = connectionSource.getTableInfo();
        } else {
            foreignTableConfig.extractFieldTypes(connectionSource);
            connectionSource = (BaseDaoImpl) DaoManager.createDao(connectionSource, foreignTableConfig);
            cls = connectionSource.getTableInfo();
        }
        if (foreignColumnName == null) {
            idField = cls.getIdField();
            if (idField == null) {
                cls = new StringBuilder();
                cls.append("Foreign field ");
                cls.append(type);
                cls.append(" does not have id field");
                throw new IllegalArgumentException(cls.toString());
            }
        } else {
            FieldType fieldTypeByColumnName = cls.getFieldTypeByColumnName(foreignColumnName);
            if (fieldTypeByColumnName != null) {
                idField = fieldTypeByColumnName;
            } else {
                cls = new StringBuilder();
                cls.append("Foreign field ");
                cls.append(type);
                cls.append(" does not have field named '");
                cls.append(foreignColumnName);
                cls.append("'");
                throw new IllegalArgumentException(cls.toString());
            }
        }
        baseDaoImpl = connectionSource;
        connectionSource = null;
        mappedQueryForId = MappedQueryForId.build(databaseType, cls, idField);
        this.mappedQueryForId = mappedQueryForId;
        this.foreignTableInfo = cls;
        this.foreignFieldType = connectionSource;
        this.foreignDao = baseDaoImpl;
        this.foreignIdField = idField;
        if (this.foreignIdField != null) {
            assignDataType(databaseType, this.foreignIdField.getDataPersister());
        }
    }

    public Field getField() {
        return this.field;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getFieldName() {
        return this.field.getName();
    }

    public Class<?> getType() {
        return this.field.getType();
    }

    public String getColumnName() {
        return this.columnName;
    }

    public DataPersister getDataPersister() {
        return this.dataPersister;
    }

    public Object getDataTypeConfigObj() {
        return this.dataTypeConfigObj;
    }

    public SqlType getSqlType() {
        return this.fieldConverter.getSqlType();
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public int getWidth() {
        return this.fieldConfig.getWidth();
    }

    public boolean isCanBeNull() {
        return this.fieldConfig.isCanBeNull();
    }

    public boolean isId() {
        return this.isId;
    }

    public boolean isGeneratedId() {
        return this.isGeneratedId;
    }

    public boolean isGeneratedIdSequence() {
        return this.generatedIdSequence != null;
    }

    public String getGeneratedIdSequence() {
        return this.generatedIdSequence;
    }

    public boolean isForeign() {
        return this.fieldConfig.isForeign();
    }

    public void assignField(Object obj, Object obj2, boolean z, ObjectCache objectCache) {
        if (!(this.foreignIdField == null || obj2 == null)) {
            Object extractJavaFieldValue = extractJavaFieldValue(obj);
            if (extractJavaFieldValue == null || !extractJavaFieldValue.equals(obj2)) {
                ObjectCache objectCache2 = this.foreignDao.getObjectCache();
                if (objectCache2 == null) {
                    extractJavaFieldValue = null;
                } else {
                    extractJavaFieldValue = objectCache2.get(getType(), obj2);
                }
                if (extractJavaFieldValue != null) {
                    obj2 = extractJavaFieldValue;
                } else if (!z) {
                    LevelCounters levelCounters = (LevelCounters) threadLevelCounters.get();
                    if (levelCounters.autoRefreshLevel == 0) {
                        levelCounters.autoRefreshLevelMax = this.fieldConfig.getMaxForeignAutoRefreshLevel();
                    }
                    if (levelCounters.autoRefreshLevel >= levelCounters.autoRefreshLevelMax) {
                        z = this.foreignTableInfo.createObject();
                        this.foreignIdField.assignField(z, obj2, false, objectCache);
                        obj2 = z;
                    } else {
                        if (this.mappedQueryForId == null) {
                            this.mappedQueryForId = MappedQueryForId.build(this.connectionSource.getDatabaseType(), this.foreignDao.getTableInfo(), this.foreignIdField);
                        }
                        levelCounters.autoRefreshLevel++;
                        DatabaseConnection readOnlyConnection;
                        try {
                            readOnlyConnection = this.connectionSource.getReadOnlyConnection();
                            obj2 = this.mappedQueryForId.execute(readOnlyConnection, obj2, objectCache);
                            this.connectionSource.releaseConnection(readOnlyConnection);
                            levelCounters.autoRefreshLevel -= 1;
                            if (levelCounters.autoRefreshLevel > false) {
                                threadLevelCounters.remove();
                            }
                        } catch (Throwable th) {
                            levelCounters.autoRefreshLevel -= 1;
                            if (levelCounters.autoRefreshLevel <= null) {
                                threadLevelCounters.remove();
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (this.fieldSetMethod) {
            try {
                this.fieldSetMethod.invoke(obj, new Object[]{obj2});
            } catch (Object obj3) {
                z = new StringBuilder();
                z.append("Could not call ");
                z.append(this.fieldSetMethod);
                z.append(" on object with '");
                z.append(obj2);
                z.append("' for ");
                z.append(this);
                throw SqlExceptionUtil.create(z.toString(), obj3);
            }
        }
        try {
            this.field.set(obj3, obj2);
        } catch (Object obj32) {
            z = new StringBuilder();
            z.append("Could not assign object '");
            z.append(obj2);
            z.append("' to field ");
            z.append(this);
            throw SqlExceptionUtil.create(z.toString(), obj32);
        } catch (Object obj322) {
            z = new StringBuilder();
            z.append("Could not assign object '");
            z.append(obj2);
            z.append("' to field ");
            z.append(this);
            throw SqlExceptionUtil.create(z.toString(), obj322);
        }
    }

    public Object assignIdValue(Object obj, Number number, ObjectCache objectCache) {
        number = this.dataPersister.convertIdNumber(number);
        if (number != null) {
            assignField(obj, number, false, objectCache);
            return number;
        }
        number = new StringBuilder();
        number.append("Invalid class ");
        number.append(this.dataPersister);
        number.append(" for sequence-id ");
        number.append(this);
        throw new SQLException(number.toString());
    }

    public <FV> FV extractRawJavaFieldValue(Object obj) {
        if (this.fieldGetMethod == null) {
            try {
                return this.field.get(obj);
            } catch (Object obj2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not get field value for ");
                stringBuilder.append(this);
                throw SqlExceptionUtil.create(stringBuilder.toString(), obj2);
            }
        }
        try {
            return this.fieldGetMethod.invoke(obj2, new Object[0]);
        } catch (Object obj22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not call ");
            stringBuilder.append(this.fieldGetMethod);
            stringBuilder.append(" for ");
            stringBuilder.append(this);
            throw SqlExceptionUtil.create(stringBuilder.toString(), obj22);
        }
    }

    public Object extractJavaFieldValue(Object obj) {
        obj = extractRawJavaFieldValue(obj);
        return (this.foreignIdField == null || obj == null) ? obj : this.foreignIdField.extractRawJavaFieldValue(obj);
    }

    public Object extractJavaFieldToSqlArgValue(Object obj) {
        return convertJavaFieldToSqlArgValue(extractJavaFieldValue(obj));
    }

    public Object convertJavaFieldToSqlArgValue(Object obj) {
        return obj == null ? null : this.fieldConverter.javaToSqlArg(this, obj);
    }

    public Object convertStringToJavaField(String str, int i) {
        return str == null ? null : this.fieldConverter.resultStringToJava(this, str, i);
    }

    public Object moveToNextValue(Object obj) {
        if (this.dataPersister == null) {
            return null;
        }
        return this.dataPersister.moveToNextValue(obj);
    }

    public FieldType getForeignIdField() {
        return this.foreignIdField;
    }

    public boolean isEscapedValue() {
        return this.dataPersister.isEscapedValue();
    }

    public Enum<?> getUnknownEnumVal() {
        return this.fieldConfig.getUnknownEnumValue();
    }

    public String getFormat() {
        return this.fieldConfig.getFormat();
    }

    public boolean isUnique() {
        return this.fieldConfig.isUnique();
    }

    public boolean isUniqueCombo() {
        return this.fieldConfig.isUniqueCombo();
    }

    public String getIndexName() {
        return this.fieldConfig.getIndexName(this.tableName);
    }

    public String getUniqueIndexName() {
        return this.fieldConfig.getUniqueIndexName(this.tableName);
    }

    public boolean isEscapedDefaultValue() {
        return this.dataPersister.isEscapedDefaultValue();
    }

    public boolean isComparable() {
        if (this.fieldConfig.isForeignCollection()) {
            return false;
        }
        if (this.dataPersister != null) {
            return this.dataPersister.isComparable();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: ");
        stringBuilder.append(this);
        throw new SQLException(stringBuilder.toString());
    }

    public boolean isArgumentHolderRequired() {
        return this.dataPersister.isArgumentHolderRequired();
    }

    public boolean isForeignCollection() {
        return this.fieldConfig.isForeignCollection();
    }

    public <FT, FID> BaseForeignCollection<FT, FID> buildForeignCollection(Object obj, FID fid) {
        if (this.foreignFieldType == null) {
            return null;
        }
        Dao dao = this.foreignDao;
        if (this.fieldConfig.isForeignCollectionEager()) {
            LevelCounters levelCounters = (LevelCounters) threadLevelCounters.get();
            if (levelCounters.foreignCollectionLevel == 0) {
                levelCounters.foreignCollectionLevelMax = this.fieldConfig.getForeignCollectionMaxEagerLevel();
            }
            if (levelCounters.foreignCollectionLevel >= levelCounters.foreignCollectionLevelMax) {
                return new LazyForeignCollection(dao, obj, fid, this.foreignFieldType, this.fieldConfig.getForeignCollectionOrderColumnName(), this.fieldConfig.isForeignCollectionOrderAscending());
            }
            levelCounters.foreignCollectionLevel++;
            try {
                BaseForeignCollection<FT, FID> eagerForeignCollection = new EagerForeignCollection(dao, obj, fid, this.foreignFieldType, this.fieldConfig.getForeignCollectionOrderColumnName(), this.fieldConfig.isForeignCollectionOrderAscending());
                return eagerForeignCollection;
            } finally {
                levelCounters.foreignCollectionLevel--;
            }
        } else {
            return new LazyForeignCollection(dao, obj, fid, this.foreignFieldType, this.fieldConfig.getForeignCollectionOrderColumnName(), this.fieldConfig.isForeignCollectionOrderAscending());
        }
    }

    public <T> T resultToJava(DatabaseResults databaseResults, Map<String, Integer> map) {
        Integer num = (Integer) map.get(this.columnName);
        if (num == null) {
            num = Integer.valueOf(databaseResults.findColumn(this.columnName));
            map.put(this.columnName, num);
        }
        map = this.fieldConverter.resultToJava(this, databaseResults, num.intValue());
        if (this.fieldConfig.isForeign()) {
            if (databaseResults.wasNull(num.intValue()) != null) {
                return null;
            }
        } else if (this.dataPersister.isPrimitive()) {
            if (this.fieldConfig.isThrowIfNull()) {
                if (databaseResults.wasNull(num.intValue()) != null) {
                    map = new StringBuilder();
                    map.append("Results value for primitive field '");
                    map.append(this.field.getName());
                    map.append("' was an invalid null value");
                    throw new SQLException(map.toString());
                }
            }
        } else if (this.fieldConverter.isStreamType() || databaseResults.wasNull(num.intValue()) == null) {
            return map;
        } else {
            return null;
        }
        return map;
    }

    public boolean isSelfGeneratedId() {
        return this.dataPersister.isSelfGeneratedId();
    }

    public boolean isAllowGeneratedIdInsert() {
        return this.fieldConfig.isAllowGeneratedIdInsert();
    }

    public String getColumnDefinition() {
        return this.fieldConfig.getColumnDefinition();
    }

    public boolean isForeignAutoCreate() {
        return this.fieldConfig.isForeignAutoCreate();
    }

    public boolean isVersion() {
        return this.fieldConfig.isVersion();
    }

    public Object generateId() {
        return this.dataPersister.generateId();
    }

    public boolean isReadOnly() {
        return this.fieldConfig.isReadOnly();
    }

    public <FV> FV getFieldValueIfNotDefault(Object obj) {
        obj = extractJavaFieldValue(obj);
        return isFieldValueDefault(obj) ? null : obj;
    }

    public boolean isObjectsFieldValueDefault(Object obj) {
        return isFieldValueDefault(extractJavaFieldValue(obj));
    }

    public Object getJavaDefaultValueDefault() {
        if (this.field.getType() == Boolean.TYPE) {
            return Boolean.valueOf(DEFAULT_VALUE_BOOLEAN);
        }
        if (this.field.getType() != Byte.TYPE) {
            if (this.field.getType() != Byte.class) {
                if (this.field.getType() != Character.TYPE) {
                    if (this.field.getType() != Character.class) {
                        if (this.field.getType() != Short.TYPE) {
                            if (this.field.getType() != Short.class) {
                                if (this.field.getType() != Integer.TYPE) {
                                    if (this.field.getType() != Integer.class) {
                                        if (this.field.getType() != Long.TYPE) {
                                            if (this.field.getType() != Long.class) {
                                                if (this.field.getType() != Float.TYPE) {
                                                    if (this.field.getType() != Float.class) {
                                                        if (this.field.getType() != Double.TYPE) {
                                                            if (this.field.getType() != Double.class) {
                                                                return null;
                                                            }
                                                        }
                                                        return Double.valueOf(DEFAULT_VALUE_DOUBLE);
                                                    }
                                                }
                                                return Float.valueOf(DEFAULT_VALUE_FLOAT);
                                            }
                                        }
                                        return Long.valueOf(DEFAULT_VALUE_LONG);
                                    }
                                }
                                return Integer.valueOf(DEFAULT_VALUE_INT);
                            }
                        }
                        return Short.valueOf(DEFAULT_VALUE_SHORT);
                    }
                }
                return Character.valueOf(DEFAULT_VALUE_CHAR);
            }
        }
        return Byte.valueOf(DEFAULT_VALUE_BYTE);
    }

    public <T> int createWithForeignDao(T t) {
        return this.foreignDao.create(t);
    }

    public static FieldType createFieldType(ConnectionSource connectionSource, String str, Field field, Class<?> cls) {
        DatabaseFieldConfig fromField = DatabaseFieldConfig.fromField(connectionSource.getDatabaseType(), str, field);
        if (fromField == null) {
            return null;
        }
        return new FieldType(connectionSource, str, field, fromField, cls);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 == 0) goto L_0x002f;
    L_0x0003:
        r1 = r4.getClass();
        r2 = r3.getClass();
        if (r1 == r2) goto L_0x000e;
    L_0x000d:
        goto L_0x002f;
    L_0x000e:
        r4 = (com.j256.ormlite.field.FieldType) r4;
        r1 = r3.field;
        r2 = r4.field;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x002e;
    L_0x001a:
        r1 = r3.parentClass;
        if (r1 != 0) goto L_0x0023;
    L_0x001e:
        r4 = r4.parentClass;
        if (r4 != 0) goto L_0x002e;
    L_0x0022:
        goto L_0x002d;
    L_0x0023:
        r1 = r3.parentClass;
        r4 = r4.parentClass;
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x002e;
    L_0x002d:
        r0 = 1;
    L_0x002e:
        return r0;
    L_0x002f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.FieldType.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(":name=");
        stringBuilder.append(this.field.getName());
        stringBuilder.append(",class=");
        stringBuilder.append(this.field.getDeclaringClass().getSimpleName());
        return stringBuilder.toString();
    }

    private boolean isFieldValueDefault(Object obj) {
        return obj == null ? true : obj.equals(getJavaDefaultValueDefault());
    }

    private FieldType findForeignFieldType(Class<?> cls, Class<?> cls2, BaseDaoImpl<?, ?> baseDaoImpl) {
        String foreignCollectionForeignFieldName = this.fieldConfig.getForeignCollectionForeignFieldName();
        for (FieldType fieldType : baseDaoImpl.getTableInfo().getFieldTypes()) {
            if (fieldType.getType() == cls2 && (foreignCollectionForeignFieldName == null || fieldType.getField().getName().equals(foreignCollectionForeignFieldName))) {
                if (fieldType.fieldConfig.isForeign() == null) {
                    if (fieldType.fieldConfig.isForeignAutoRefresh() == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Foreign collection object ");
                        stringBuilder.append(cls);
                        stringBuilder.append(" for field '");
                        stringBuilder.append(this.field.getName());
                        stringBuilder.append("' contains a field of class ");
                        stringBuilder.append(cls2);
                        stringBuilder.append(" but it's not foreign");
                        throw new SQLException(stringBuilder.toString());
                    }
                }
                return fieldType;
            }
        }
        baseDaoImpl = new StringBuilder();
        baseDaoImpl.append("Foreign collection class ");
        baseDaoImpl.append(cls.getName());
        baseDaoImpl.append(" for field '");
        baseDaoImpl.append(this.field.getName());
        baseDaoImpl.append("' column-name does not contain a foreign field");
        if (foreignCollectionForeignFieldName != null) {
            baseDaoImpl.append(" named '");
            baseDaoImpl.append(foreignCollectionForeignFieldName);
            baseDaoImpl.append('\'');
        }
        baseDaoImpl.append(" of class ");
        baseDaoImpl.append(cls2.getName());
        throw new SQLException(baseDaoImpl.toString());
    }

    private void assignDataType(DatabaseType databaseType, DataPersister dataPersister) {
        this.dataPersister = dataPersister;
        if (dataPersister == null) {
            if (this.fieldConfig.isForeign() == null) {
                if (this.fieldConfig.isForeignCollection() == null) {
                    dataPersister = new StringBuilder();
                    dataPersister.append("Data persister for field ");
                    dataPersister.append(this);
                    dataPersister.append(" is null but the field is not a foreign or foreignCollection");
                    throw new SQLException(dataPersister.toString());
                }
            }
            return;
        }
        this.fieldConverter = databaseType.getFieldConverter(dataPersister);
        if (this.isGeneratedId == null || dataPersister.isValidGeneratedType() != null) {
            StringBuilder stringBuilder;
            if (this.fieldConfig.isThrowIfNull() != null) {
                if (dataPersister.isPrimitive() == null) {
                    dataPersister = new StringBuilder();
                    dataPersister.append("Field ");
                    dataPersister.append(this.field.getName());
                    dataPersister.append(" must be a primitive if set with throwIfNull");
                    throw new SQLException(dataPersister.toString());
                }
            }
            if (this.isId != null) {
                if (dataPersister.isAppropriateId() == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Field '");
                    stringBuilder.append(this.field.getName());
                    stringBuilder.append("' is of data type ");
                    stringBuilder.append(dataPersister);
                    stringBuilder.append(" which cannot be the ID field");
                    throw new SQLException(stringBuilder.toString());
                }
            }
            this.dataTypeConfigObj = dataPersister.makeConfigObject(this);
            databaseType = this.fieldConfig.getDefaultValue();
            if (databaseType == null) {
                this.defaultValue = null;
            } else if (this.isGeneratedId == null) {
                this.defaultValue = this.fieldConverter.parseDefaultString(this, databaseType);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Field '");
                stringBuilder.append(this.field.getName());
                stringBuilder.append("' cannot be a generatedId and have a default value '");
                stringBuilder.append(databaseType);
                stringBuilder.append("'");
                throw new SQLException(stringBuilder.toString());
            }
            return;
        }
        databaseType = new StringBuilder();
        databaseType.append("Generated-id field '");
        databaseType.append(this.field.getName());
        databaseType.append("' in ");
        databaseType.append(this.field.getDeclaringClass().getSimpleName());
        databaseType.append(" can't be type ");
        databaseType.append(this.dataPersister.getSqlType());
        databaseType.append(".  Must be one of: ");
        for (DataType dataType : DataType.values()) {
            DataPersister dataPersister2 = dataType.getDataPersister();
            if (dataPersister2 != null && dataPersister2.isValidGeneratedType()) {
                databaseType.append(dataType);
                databaseType.append(' ');
            }
        }
        throw new IllegalArgumentException(databaseType.toString());
    }
}
