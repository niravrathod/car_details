package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

public final class zzd extends Thread {
    /* renamed from: a */
    private static final boolean f9349a = zzaf.f8537a;
    /* renamed from: b */
    private final BlockingQueue<zzr<?>> f9350b;
    /* renamed from: c */
    private final BlockingQueue<zzr<?>> f9351c;
    /* renamed from: d */
    private final zzb f9352d;
    /* renamed from: e */
    private final zzaa f9353e;
    /* renamed from: f */
    private volatile boolean f9354f = false;
    /* renamed from: g */
    private final pl f9355g;

    public zzd(BlockingQueue<zzr<?>> blockingQueue, BlockingQueue<zzr<?>> blockingQueue2, zzb zzb, zzaa zzaa) {
        this.f9350b = blockingQueue;
        this.f9351c = blockingQueue2;
        this.f9352d = zzb;
        this.f9353e = zzaa;
        this.f9355g = new pl(this);
    }

    /* renamed from: a */
    public final void m10491a() {
        this.f9354f = true;
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = f9349a;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.google.android.gms.internal.ads.zzaf.m9508a(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r3.f9352d;
        r0.mo2367a();
    L_0x0016:
        r3.m10490b();	 Catch:{ InterruptedException -> 0x001a }
        goto L_0x0016;
    L_0x001a:
        r0 = r3.f9354f;
        if (r0 == 0) goto L_0x0026;
    L_0x001e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return;
    L_0x0026:
        r0 = "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it";
        r2 = new java.lang.Object[r1];
        com.google.android.gms.internal.ads.zzaf.m9511c(r0, r2);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzd.run():void");
    }

    /* renamed from: b */
    private final void m10490b() {
        zzr zzr = (zzr) this.f9350b.take();
        zzr.m11030b("cache-queue-take");
        zzr.m11037h();
        zzc a = this.f9352d.mo2366a(zzr.m11035f());
        if (a == null) {
            zzr.m11030b("cache-miss");
            if (!this.f9355g.m20922b(zzr)) {
                this.f9351c.put(zzr);
            }
        } else if (a.m10469a()) {
            zzr.m11030b("cache-hit-expired");
            zzr.m11021a(a);
            if (!this.f9355g.m20922b(zzr)) {
                this.f9351c.put(zzr);
            }
        } else {
            zzr.m11030b("cache-hit");
            zzx a2 = zzr.mo2369a(new zzp(a.f9326a, a.f9332g));
            zzr.m11030b("cache-hit-parsed");
            if ((a.f9331f < System.currentTimeMillis() ? 1 : null) != null) {
                zzr.m11030b("cache-hit-refresh-needed");
                zzr.m11021a(a);
                a2.f9827d = true;
                if (!this.f9355g.m20922b(zzr)) {
                    this.f9353e.mo2460a(zzr, a2, new ph(this, zzr));
                    return;
                }
            }
            this.f9353e.mo2459a(zzr, a2);
        }
    }
}
