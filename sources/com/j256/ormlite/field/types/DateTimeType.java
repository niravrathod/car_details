package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DateTimeType extends BaseDataType {
    private static final String[] associatedClassNames = new String[]{"org.joda.time.DateTime"};
    private static Class<?> dateTimeClass = null;
    private static Method getMillisMethod = null;
    private static Constructor<?> millisConstructor = null;
    private static final DateTimeType singleTon = new DateTimeType();

    public boolean isAppropriateId() {
        return false;
    }

    public boolean isEscapedValue() {
        return false;
    }

    private DateTimeType() {
        super(SqlType.LONG, new Class[0]);
    }

    protected DateTimeType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public static DateTimeType getSingleton() {
        return singleTon;
    }

    public String[] getAssociatedClassNames() {
        return associatedClassNames;
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        try {
            fieldType = getMillisMethod();
            if (obj == null) {
                return null;
            }
            return fieldType.invoke(obj, new Object[0]);
        } catch (FieldType fieldType2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not use reflection to get millis from Joda DateTime: ");
            stringBuilder.append(obj);
            throw SqlExceptionUtil.create(stringBuilder.toString(), fieldType2);
        }
    }

    public Object parseDefaultString(FieldType fieldType, String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) {
        return Long.valueOf(databaseResults.getLong(i));
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) {
        try {
            return getConstructor().newInstance(new Object[]{(Long) obj});
        } catch (FieldType fieldType2) {
            throw SqlExceptionUtil.create("Could not use reflection to construct a Joda DateTime", fieldType2);
        }
    }

    public java.lang.Class<?> getPrimaryClass() {
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
        r1 = this;
        r0 = r1.getDateTimeClass();	 Catch:{ ClassNotFoundException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.types.DateTimeType.getPrimaryClass():java.lang.Class<?>");
    }

    private Method getMillisMethod() {
        if (getMillisMethod == null) {
            getMillisMethod = getDateTimeClass().getMethod("getMillis", new Class[0]);
        }
        return getMillisMethod;
    }

    private Constructor<?> getConstructor() {
        if (millisConstructor == null) {
            millisConstructor = getDateTimeClass().getConstructor(new Class[]{Long.TYPE});
        }
        return millisConstructor;
    }

    private Class<?> getDateTimeClass() {
        if (dateTimeClass == null) {
            dateTimeClass = Class.forName("org.joda.time.DateTime");
        }
        return dateTimeClass;
    }
}
