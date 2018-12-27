package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;

@VisibleForTesting
final class hn implements BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    @VisibleForTesting
    /* renamed from: a */
    private zzavf f16499a;
    /* renamed from: b */
    private final String f16500b;
    /* renamed from: c */
    private final String f16501c;
    /* renamed from: d */
    private final LinkedBlockingQueue<zzbb> f16502d;
    /* renamed from: e */
    private final HandlerThread f16503e = new HandlerThread("GassClient");

    public hn(Context context, String str, String str2) {
        this.f16500b = str;
        this.f16501c = str2;
        this.f16503e.start();
        this.f16499a = new zzavf(context, this.f16503e.getLooper(), this, this);
        this.f16502d = new LinkedBlockingQueue();
        this.f16499a.checkAvailabilityAndConnect();
    }

    /* renamed from: a */
    public final com.google.android.gms.internal.ads.zzbb m20489a(int r4) {
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
        r4 = r3.f16502d;	 Catch:{ InterruptedException -> 0x000d }
        r0 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ InterruptedException -> 0x000d }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x000d }
        r4 = r4.poll(r0, r2);	 Catch:{ InterruptedException -> 0x000d }
        r4 = (com.google.android.gms.internal.ads.zzbb) r4;	 Catch:{ InterruptedException -> 0x000d }
        goto L_0x000e;
    L_0x000d:
        r4 = 0;
    L_0x000e:
        if (r4 != 0) goto L_0x0014;
    L_0x0010:
        r4 = m20488c();
    L_0x0014:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hn.a(int):com.google.android.gms.internal.ads.zzbb");
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.ads.zzavk m20486a() {
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
        r0 = r1.f16499a;	 Catch:{ IllegalStateException -> 0x0007, IllegalStateException -> 0x0007 }
        r0 = r0.m26377a();	 Catch:{ IllegalStateException -> 0x0007, IllegalStateException -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hn.a():com.google.android.gms.internal.ads.zzavk");
    }

    public final void onConnectionSuspended(int r2) {
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
        r2 = r1.f16502d;	 Catch:{ InterruptedException -> 0x000a }
        r0 = m20488c();	 Catch:{ InterruptedException -> 0x000a }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x000a }
        return;
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hn.onConnectionSuspended(int):void");
    }

    public final void onConnected(android.os.Bundle r4) {
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
        r4 = r3.m20486a();
        if (r4 == 0) goto L_0x0043;
    L_0x0006:
        r0 = new com.google.android.gms.internal.ads.zzavg;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r1 = r3.f16500b;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r2 = r3.f16501c;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0.<init>(r1, r2);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r4 = r4.mo2418a(r0);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r4 = r4.m26379a();	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0 = r3.f16502d;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0.put(r4);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r3.m20487b();
        r4 = r3.f16503e;
        r4.quit();
        return;
    L_0x0025:
        r4 = move-exception;
        goto L_0x0031;
    L_0x0027:
        r4 = r3.f16502d;	 Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
        r0 = m20488c();	 Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
        r4.put(r0);	 Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
        goto L_0x003a;
    L_0x0031:
        r3.m20487b();
        r0 = r3.f16503e;
        r0.quit();
        throw r4;
    L_0x003a:
        r3.m20487b();
        r4 = r3.f16503e;
        r4.quit();
        return;
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hn.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
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
        r2 = r1.f16502d;	 Catch:{ InterruptedException -> 0x000a }
        r0 = m20488c();	 Catch:{ InterruptedException -> 0x000a }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x000a }
        return;
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hn.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: b */
    private final void m20487b() {
        if (this.f16499a == null) {
            return;
        }
        if (this.f16499a.isConnected() || this.f16499a.isConnecting()) {
            this.f16499a.disconnect();
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private static zzbb m20488c() {
        zzbb zzbb = new zzbb();
        zzbb.f19994k = Long.valueOf(32768);
        return zzbb;
    }
}
