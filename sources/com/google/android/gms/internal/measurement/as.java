package com.google.android.gms.internal.measurement;

final class as {
    /* renamed from: a */
    private static final Class<?> f10039a = m11493a("libcore.io.Memory");
    /* renamed from: b */
    private static final boolean f10040b = (m11493a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m11494a() {
        return (f10039a == null || f10040b) ? false : true;
    }

    /* renamed from: b */
    static Class<?> m11495b() {
        return f10039a;
    }

    /* renamed from: a */
    private static <T> java.lang.Class<T> m11493a(java.lang.String r0) {
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
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.as.a(java.lang.String):java.lang.Class<T>");
    }
}
