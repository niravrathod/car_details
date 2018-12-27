package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class zzei {
    /* renamed from: a */
    private static final String f9392a = "zzei";
    /* renamed from: b */
    private final zzdb f9393b;
    /* renamed from: c */
    private final String f9394c;
    /* renamed from: d */
    private final String f9395d;
    /* renamed from: e */
    private final int f9396e = 2;
    /* renamed from: f */
    private volatile Method f9397f = null;
    /* renamed from: g */
    private final Class<?>[] f9398g;
    /* renamed from: h */
    private CountDownLatch f9399h = new CountDownLatch(1);

    public zzei(zzdb zzdb, String str, String str2, Class<?>... clsArr) {
        this.f9393b = zzdb;
        this.f9394c = str;
        this.f9395d = str2;
        this.f9398g = clsArr;
        this.f9393b.m10510c().submit(new pi(this));
    }

    /* renamed from: b */
    private final void m10540b() {
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
        r3 = this;
        r0 = r3.f9393b;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r0 = r0.m10511d();	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r1 = r3.f9393b;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r1 = r1.m10513f();	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r2 = r3.f9394c;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r1 = r3.m10538a(r1, r2);	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r0 = r0.loadClass(r1);	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        if (r0 != 0) goto L_0x001e;
    L_0x0018:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x001e:
        r1 = r3.f9393b;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r1 = r1.m10513f();	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r2 = r3.f9395d;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r1 = r3.m10538a(r1, r2);	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r2 = r3.f9398g;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r3.f9397f = r0;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        r0 = r3.f9397f;	 Catch:{ zzcn -> 0x0061, UnsupportedEncodingException -> 0x005b, ClassNotFoundException -> 0x0055, NoSuchMethodException -> 0x004f, NullPointerException -> 0x0049, all -> 0x0042 }
        if (r0 != 0) goto L_0x003c;
    L_0x0036:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x003c:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x0042:
        r0 = move-exception;
        r1 = r3.f9399h;
        r1.countDown();
        throw r0;
    L_0x0049:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x004f:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x0055:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x005b:
        r0 = r3.f9399h;
        r0.countDown();
        return;
    L_0x0061:
        r0 = r3.f9399h;
        r0.countDown();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzei.b():void");
    }

    /* renamed from: a */
    private final String m10538a(byte[] bArr, String str) {
        return new String(this.f9393b.m10512e().m10486a(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final java.lang.reflect.Method m10541a() {
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
        r5 = this;
        r0 = r5.f9397f;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r5.f9397f;
        return r0;
    L_0x0007:
        r0 = 0;
        r1 = r5.f9399h;	 Catch:{ InterruptedException -> 0x0018 }
        r2 = 2;	 Catch:{ InterruptedException -> 0x0018 }
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0018 }
        r1 = r1.await(r2, r4);	 Catch:{ InterruptedException -> 0x0018 }
        if (r1 != 0) goto L_0x0015;	 Catch:{ InterruptedException -> 0x0018 }
    L_0x0014:
        return r0;	 Catch:{ InterruptedException -> 0x0018 }
    L_0x0015:
        r1 = r5.f9397f;	 Catch:{ InterruptedException -> 0x0018 }
        return r1;
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzei.a():java.lang.reflect.Method");
    }
}
