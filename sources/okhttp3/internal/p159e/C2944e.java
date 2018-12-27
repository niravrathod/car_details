package okhttp3.internal.p159e;

import java.lang.reflect.Method;

/* renamed from: okhttp3.internal.e.e */
class C2944e<T> {
    /* renamed from: a */
    private final Class<?> f12409a;
    /* renamed from: b */
    private final String f12410b;
    /* renamed from: c */
    private final Class[] f12411c;

    C2944e(Class<?> cls, String str, Class... clsArr) {
        this.f12409a = cls;
        this.f12410b = str;
        this.f12411c = clsArr;
    }

    /* renamed from: a */
    public boolean m14263a(T t) {
        return m14260a(t.getClass()) != null ? true : null;
    }

    /* renamed from: a */
    public java.lang.Object m14262a(T r3, java.lang.Object... r4) {
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
        r2 = this;
        r0 = r3.getClass();
        r0 = r2.m14260a(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r3 = r0.invoke(r3, r4);	 Catch:{ IllegalAccessException -> 0x0011 }
        return r3;
    L_0x0011:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.e.a(java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: b */
    public Object m14264b(T t, Object... objArr) {
        try {
            return m14262a(t, objArr);
        } catch (T t2) {
            t2 = t2.getTargetException();
            if ((t2 instanceof RuntimeException) != null) {
                throw ((RuntimeException) t2);
            }
            objArr = new AssertionError("Unexpected exception");
            objArr.initCause(t2);
            throw objArr;
        }
    }

    /* renamed from: c */
    public Object m14265c(T t, Object... objArr) {
        Method a = m14260a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (T t2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpectedly could not call: ");
                stringBuilder.append(a);
                objArr = new AssertionError(stringBuilder.toString());
                objArr.initCause(t2);
                throw objArr;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Method ");
        stringBuilder2.append(this.f12410b);
        stringBuilder2.append(" not supported for object ");
        stringBuilder2.append(t2);
        throw new AssertionError(stringBuilder2.toString());
    }

    /* renamed from: d */
    public Object m14266d(T t, Object... objArr) {
        try {
            return m14265c(t, objArr);
        } catch (T t2) {
            t2 = t2.getTargetException();
            if ((t2 instanceof RuntimeException) != null) {
                throw ((RuntimeException) t2);
            }
            objArr = new AssertionError("Unexpected exception");
            objArr.initCause(t2);
            throw objArr;
        }
    }

    /* renamed from: a */
    private Method m14260a(Class<?> cls) {
        if (this.f12410b == null) {
            return null;
        }
        cls = C2944e.m14261a(cls, this.f12410b, this.f12411c);
        if (cls == null || this.f12409a == null || this.f12409a.isAssignableFrom(cls.getReturnType())) {
            return cls;
        }
        return null;
    }

    /* renamed from: a */
    private static java.lang.reflect.Method m14261a(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class[] r3) {
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
        r1 = r1.getMethod(r2, r3);	 Catch:{ NoSuchMethodException -> 0x000d }
        r2 = r1.getModifiers();	 Catch:{ NoSuchMethodException -> 0x000e }
        r2 = r2 & 1;
        if (r2 != 0) goto L_0x000e;
    L_0x000d:
        r1 = r0;
    L_0x000e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.e.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
