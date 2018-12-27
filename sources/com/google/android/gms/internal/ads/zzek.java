package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzek implements Callable {
    /* renamed from: a */
    protected final zzdb f9400a;
    /* renamed from: b */
    protected final zzbb f9401b;
    /* renamed from: c */
    protected Method f9402c;
    /* renamed from: d */
    private final String f9403d = getClass().getSimpleName();
    /* renamed from: e */
    private final String f9404e;
    /* renamed from: f */
    private final String f9405f;
    /* renamed from: g */
    private final int f9406g;
    /* renamed from: h */
    private final int f9407h;

    public zzek(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        this.f9400a = zzdb;
        this.f9404e = str;
        this.f9405f = str2;
        this.f9401b = zzbb;
        this.f9406g = i;
        this.f9407h = i2;
    }

    /* renamed from: a */
    protected abstract void mo2435a();

    /* renamed from: b */
    public java.lang.Void mo2436b() {
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
        r9 = this;
        r0 = 0;
        r1 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r3 = r9.f9400a;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r4 = r9.f9404e;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r5 = r9.f9405f;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r3 = r3.m10505a(r4, r5);	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r9.f9402c = r3;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r3 = r9.f9402c;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        if (r3 != 0) goto L_0x0016;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
    L_0x0015:
        return r0;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
    L_0x0016:
        r9.mo2435a();	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r3 = r9.f9400a;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r3 = r3.m10515h();	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
    L_0x0021:
        r4 = r9.f9406g;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        if (r4 == r5) goto L_0x0037;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
    L_0x0027:
        r4 = r9.f9407h;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r5 = r9.f9406g;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r6 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r8 = 0;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r6 = r6 - r1;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r6 = r6 / r1;	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
        r3.m10474a(r4, r5, r6);	 Catch:{ IllegalAccessException -> 0x0037, IllegalAccessException -> 0x0037 }
    L_0x0037:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzek.b():java.lang.Void");
    }

    public /* synthetic */ Object call() {
        return mo2436b();
    }
}
