package com.google.android.gms.internal.measurement;

final class bk {
    /* renamed from: a */
    private static final bi<?> f10045a = new bj();
    /* renamed from: b */
    private static final bi<?> f10046b = m11516c();

    /* renamed from: c */
    private static com.google.android.gms.internal.measurement.bi<?> m11516c() {
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
        r0 = "com.google.protobuf.ExtensionSchemaFull";	 Catch:{ Exception -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0016 }
        r1 = 0;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ Exception -> 0x0016 }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0016 }
        r0 = r0.newInstance(r1);	 Catch:{ Exception -> 0x0016 }
        r0 = (com.google.android.gms.internal.measurement.bi) r0;	 Catch:{ Exception -> 0x0016 }
        return r0;
    L_0x0016:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bk.c():com.google.android.gms.internal.measurement.bi<?>");
    }

    /* renamed from: a */
    static bi<?> m11514a() {
        return f10045a;
    }

    /* renamed from: b */
    static bi<?> m11515b() {
        if (f10046b != null) {
            return f10046b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
