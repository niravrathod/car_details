package com.crashlytics.android.core;

import android.content.Context;

/* renamed from: com.crashlytics.android.core.w */
class C3585w implements an {
    /* renamed from: a */
    private final Context f14747a;
    /* renamed from: b */
    private final String f14748b;

    public C3585w(Context context, String str) {
        this.f14747a = context;
        this.f14748b = str;
    }

    /* renamed from: a */
    public java.lang.String mo1156a() {
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
        r4 = this;
        r0 = r4.f14747a;
        r0 = r0.getPackageManager();
        r1 = 0;
        r2 = r4.f14748b;	 Catch:{ Exception -> 0x001a }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x001a }
        r0 = r0.getApplicationInfo(r2, r3);	 Catch:{ Exception -> 0x001a }
        r0 = r0.metaData;	 Catch:{ Exception -> 0x001a }
        if (r0 == 0) goto L_0x001a;	 Catch:{ Exception -> 0x001a }
    L_0x0013:
        r2 = "io.fabric.unity.crashlytics.version";	 Catch:{ Exception -> 0x001a }
        r0 = r0.getString(r2);	 Catch:{ Exception -> 0x001a }
        r1 = r0;
    L_0x001a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.w.a():java.lang.String");
    }
}
