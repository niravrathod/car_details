package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Random;

public class zzce {
    /* renamed from: a */
    protected static volatile zzia f9334a = null;
    /* renamed from: d */
    private static final ConditionVariable f9335d = new ConditionVariable();
    /* renamed from: e */
    private static volatile Random f9336e = null;
    /* renamed from: b */
    protected volatile Boolean f9337b;
    /* renamed from: c */
    private zzdb f9338c;

    public zzce(zzdb zzdb) {
        this.f9338c = zzdb;
        zzdb.m10510c().execute(new or(this));
    }

    /* renamed from: a */
    public final void m10474a(int r3, int r4, long r5) {
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
        r2 = this;
        r0 = f9335d;	 Catch:{ Exception -> 0x003a }
        r0.block();	 Catch:{ Exception -> 0x003a }
        r0 = r2.f9337b;	 Catch:{ Exception -> 0x003a }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x003a }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x003a }
    L_0x000d:
        r0 = f9334a;	 Catch:{ Exception -> 0x003a }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x003a }
    L_0x0011:
        r0 = new com.google.android.gms.internal.ads.zzax;	 Catch:{ Exception -> 0x003a }
        r0.<init>();	 Catch:{ Exception -> 0x003a }
        r1 = r2.f9338c;	 Catch:{ Exception -> 0x003a }
        r1 = r1.f9358a;	 Catch:{ Exception -> 0x003a }
        r1 = r1.getPackageName();	 Catch:{ Exception -> 0x003a }
        r0.f19943a = r1;	 Catch:{ Exception -> 0x003a }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x003a }
        r0.f19944b = r5;	 Catch:{ Exception -> 0x003a }
        r5 = f9334a;	 Catch:{ Exception -> 0x003a }
        r6 = com.google.android.gms.internal.ads.zzbgz.m10450a(r0);	 Catch:{ Exception -> 0x003a }
        r5 = r5.m10686a(r6);	 Catch:{ Exception -> 0x003a }
        r5.m10687a(r4);	 Catch:{ Exception -> 0x003a }
        r5.m10689b(r3);	 Catch:{ Exception -> 0x003a }
        r5.m10688a();	 Catch:{ Exception -> 0x003a }
    L_0x0039:
        return;
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzce.a(int, int, long):void");
    }

    /* renamed from: a */
    public static int m10470a() {
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
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0018 }
        r1 = 21;	 Catch:{ RuntimeException -> 0x0018 }
        if (r0 < r1) goto L_0x000f;	 Catch:{ RuntimeException -> 0x0018 }
    L_0x0006:
        r0 = java.util.concurrent.ThreadLocalRandom.current();	 Catch:{ RuntimeException -> 0x0018 }
        r0 = r0.nextInt();	 Catch:{ RuntimeException -> 0x0018 }
        return r0;	 Catch:{ RuntimeException -> 0x0018 }
    L_0x000f:
        r0 = m10473c();	 Catch:{ RuntimeException -> 0x0018 }
        r0 = r0.nextInt();	 Catch:{ RuntimeException -> 0x0018 }
        return r0;
    L_0x0018:
        r0 = m10473c();
        r0 = r0.nextInt();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzce.a():int");
    }

    /* renamed from: c */
    private static Random m10473c() {
        if (f9336e == null) {
            synchronized (zzce.class) {
                if (f9336e == null) {
                    f9336e = new Random();
                }
            }
        }
        return f9336e;
    }
}
