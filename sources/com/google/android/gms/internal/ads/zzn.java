package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class zzn extends Thread {
    /* renamed from: a */
    private final BlockingQueue<zzr<?>> f9657a;
    /* renamed from: b */
    private final zzm f9658b;
    /* renamed from: c */
    private final zzb f9659c;
    /* renamed from: d */
    private final zzaa f9660d;
    /* renamed from: e */
    private volatile boolean f9661e = false;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzm, zzb zzb, zzaa zzaa) {
        this.f9657a = blockingQueue;
        this.f9658b = zzm;
        this.f9659c = zzb;
        this.f9660d = zzaa;
    }

    /* renamed from: a */
    public final void m10869a() {
        this.f9661e = true;
        interrupt();
    }

    public final void run() {
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
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
    L_0x0005:
        r2.m10868b();	 Catch:{ InterruptedException -> 0x0009 }
        goto L_0x0005;
    L_0x0009:
        r0 = r2.f9661e;
        if (r0 == 0) goto L_0x0015;
    L_0x000d:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return;
    L_0x0015:
        r0 = "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it";
        r1 = 0;
        r1 = new java.lang.Object[r1];
        com.google.android.gms.internal.ads.zzaf.m9511c(r0, r1);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzn.run():void");
    }

    /* renamed from: b */
    private final void m10868b() {
        zzr zzr = (zzr) this.f9657a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzr.m11030b("network-queue-take");
            zzr.m11037h();
            TrafficStats.setThreadStatsTag(zzr.m11033d());
            zzp a = this.f9658b.mo2294a(zzr);
            zzr.m11030b("network-http-complete");
            if (a.f9768e && zzr.m11042m()) {
                zzr.m11032c("not-modified");
                zzr.m11043n();
                return;
            }
            zzx a2 = zzr.mo2369a(a);
            zzr.m11030b("network-parse-complete");
            if (zzr.m11038i() && a2.f9825b != null) {
                this.f9659c.mo2368a(zzr.m11035f(), a2.f9825b);
                zzr.m11030b("network-cache-written");
            }
            zzr.m11041l();
            this.f9660d.mo2459a(zzr, a2);
            zzr.m11026a(a2);
        } catch (zzae e) {
            e.m9503a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f9660d.mo2458a(zzr, e);
            zzr.m11043n();
        } catch (Throwable e2) {
            zzaf.m9509a(e2, "Unhandled exception %s", e2.toString());
            zzae zzae = new zzae(e2);
            zzae.m9503a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f9660d.mo2458a(zzr, zzae);
            zzr.m11043n();
        }
    }
}
