package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.gmsg.zzb;
import java.util.concurrent.Future;

@zzaer
public final class zzair extends zzalc implements zzaix, zzaja, zzaje {
    /* renamed from: a */
    public final String f19854a;
    /* renamed from: b */
    private final zzakn f19855b;
    /* renamed from: c */
    private final Context f19856c;
    /* renamed from: d */
    private final zzajf f19857d;
    /* renamed from: e */
    private final zzaja f19858e;
    /* renamed from: f */
    private final Object f19859f;
    /* renamed from: g */
    private final String f19860g;
    /* renamed from: h */
    private final zzxx f19861h;
    /* renamed from: i */
    private final long f19862i;
    /* renamed from: j */
    private int f19863j = 0;
    /* renamed from: k */
    private int f19864k = 3;
    /* renamed from: l */
    private zzaiu f19865l;
    /* renamed from: m */
    private Future f19866m;
    /* renamed from: n */
    private volatile zzb f19867n;

    public zzair(Context context, String str, String str2, zzxx zzxx, zzakn zzakn, zzajf zzajf, zzaja zzaja, long j) {
        this.f19856c = context;
        this.f19854a = str;
        this.f19860g = str2;
        this.f19861h = zzxx;
        this.f19855b = zzakn;
        this.f19857d = zzajf;
        this.f19859f = new Object();
        this.f19858e = zzaja;
        this.f19862i = j;
    }

    public final void m_() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo4075a() {
        /*
        r10 = this;
        r0 = r10.f19857d;
        if (r0 == 0) goto L_0x00f5;
    L_0x0004:
        r0 = r10.f19857d;
        r0 = r0.m9627b();
        if (r0 == 0) goto L_0x00f5;
    L_0x000c:
        r0 = r10.f19857d;
        r0 = r0.m9626a();
        if (r0 != 0) goto L_0x0016;
    L_0x0014:
        goto L_0x00f5;
    L_0x0016:
        r0 = r10.f19857d;
        r0 = r0.m9627b();
        r1 = 0;
        r0.m26251a(r1);
        r0.m26250a(r10);
        r0.m26252a(r10);
        r2 = r10.f19855b;
        r2 = r2.f8806a;
        r2 = r2.f19735c;
        r3 = r10.f19857d;
        r3 = r3.m9626a();
        r4 = r3.mo2776g();	 Catch:{ RemoteException -> 0x004e }
        if (r4 == 0) goto L_0x0043;
    L_0x0038:
        r4 = com.google.android.gms.internal.ads.zzaoa.f8948a;	 Catch:{ RemoteException -> 0x004e }
        r5 = new com.google.android.gms.internal.ads.cd;	 Catch:{ RemoteException -> 0x004e }
        r5.<init>(r10, r2, r3);	 Catch:{ RemoteException -> 0x004e }
        r4.post(r5);	 Catch:{ RemoteException -> 0x004e }
        goto L_0x005a;
    L_0x0043:
        r4 = com.google.android.gms.internal.ads.zzaoa.f8948a;	 Catch:{ RemoteException -> 0x004e }
        r5 = new com.google.android.gms.internal.ads.ce;	 Catch:{ RemoteException -> 0x004e }
        r5.<init>(r10, r3, r2, r0);	 Catch:{ RemoteException -> 0x004e }
        r4.post(r5);	 Catch:{ RemoteException -> 0x004e }
        goto L_0x005a;
    L_0x004e:
        r2 = move-exception;
        r3 = "Fail to check if adapter is initialized.";
        com.google.android.gms.internal.ads.zzaok.m10004c(r3, r2);
        r2 = r10.f19854a;
        r3 = 0;
        r10.mo4174a(r2, r3);
    L_0x005a:
        r2 = com.google.android.gms.ads.internal.zzbv.zzer();
        r2 = r2.elapsedRealtime();
    L_0x0062:
        r4 = r10.f19859f;
        monitor-enter(r4);
        r5 = r10.f19863j;	 Catch:{ all -> 0x00f2 }
        r6 = 1;
        if (r5 == 0) goto L_0x009f;
    L_0x006a:
        r5 = new com.google.android.gms.internal.ads.zzaiw;	 Catch:{ all -> 0x00f2 }
        r5.<init>();	 Catch:{ all -> 0x00f2 }
        r7 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ all -> 0x00f2 }
        r7 = r7.elapsedRealtime();	 Catch:{ all -> 0x00f2 }
        r9 = 0;
        r7 = r7 - r2;
        r2 = r5.m9613a(r7);	 Catch:{ all -> 0x00f2 }
        r3 = r10.f19863j;	 Catch:{ all -> 0x00f2 }
        if (r6 != r3) goto L_0x0083;
    L_0x0081:
        r3 = 6;
        goto L_0x0085;
    L_0x0083:
        r3 = r10.f19864k;	 Catch:{ all -> 0x00f2 }
    L_0x0085:
        r2 = r2.m9612a(r3);	 Catch:{ all -> 0x00f2 }
        r3 = r10.f19854a;	 Catch:{ all -> 0x00f2 }
        r2 = r2.m9614a(r3);	 Catch:{ all -> 0x00f2 }
        r3 = r10.f19861h;	 Catch:{ all -> 0x00f2 }
        r3 = r3.f9839d;	 Catch:{ all -> 0x00f2 }
        r2 = r2.m9615b(r3);	 Catch:{ all -> 0x00f2 }
        r2 = r2.m9611a();	 Catch:{ all -> 0x00f2 }
        r10.f19865l = r2;	 Catch:{ all -> 0x00f2 }
        monitor-exit(r4);	 Catch:{ all -> 0x00f2 }
        goto L_0x00d3;
    L_0x009f:
        r5 = r10.m26234a(r2);	 Catch:{ all -> 0x00f2 }
        if (r5 != 0) goto L_0x00ef;
    L_0x00a5:
        r5 = new com.google.android.gms.internal.ads.zzaiw;	 Catch:{ all -> 0x00f2 }
        r5.<init>();	 Catch:{ all -> 0x00f2 }
        r7 = r10.f19864k;	 Catch:{ all -> 0x00f2 }
        r5 = r5.m9612a(r7);	 Catch:{ all -> 0x00f2 }
        r7 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ all -> 0x00f2 }
        r7 = r7.elapsedRealtime();	 Catch:{ all -> 0x00f2 }
        r9 = 0;
        r7 = r7 - r2;
        r2 = r5.m9613a(r7);	 Catch:{ all -> 0x00f2 }
        r3 = r10.f19854a;	 Catch:{ all -> 0x00f2 }
        r2 = r2.m9614a(r3);	 Catch:{ all -> 0x00f2 }
        r3 = r10.f19861h;	 Catch:{ all -> 0x00f2 }
        r3 = r3.f9839d;	 Catch:{ all -> 0x00f2 }
        r2 = r2.m9615b(r3);	 Catch:{ all -> 0x00f2 }
        r2 = r2.m9611a();	 Catch:{ all -> 0x00f2 }
        r10.f19865l = r2;	 Catch:{ all -> 0x00f2 }
        monitor-exit(r4);	 Catch:{ all -> 0x00f2 }
    L_0x00d3:
        r0.m26251a(r1);
        r0.m26250a(r1);
        r0 = r10.f19863j;
        if (r0 != r6) goto L_0x00e5;
    L_0x00dd:
        r0 = r10.f19858e;
        r1 = r10.f19854a;
        r0.mo4173a(r1);
        return;
    L_0x00e5:
        r0 = r10.f19858e;
        r1 = r10.f19854a;
        r2 = r10.f19864k;
        r0.mo4174a(r1, r2);
        return;
    L_0x00ef:
        monitor-exit(r4);	 Catch:{ all -> 0x00f2 }
        goto L_0x0062;
    L_0x00f2:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00f2 }
        throw r0;
    L_0x00f5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzair.a():void");
    }

    /* renamed from: d */
    public final Future m26242d() {
        if (this.f19866m != null) {
            return this.f19866m;
        }
        zzapi zzapi = (zzapi) mo2219c();
        this.f19866m = zzapi;
        return zzapi;
    }

    /* renamed from: e */
    public final zzaiu m26243e() {
        zzaiu zzaiu;
        synchronized (this.f19859f) {
            zzaiu = this.f19865l;
        }
        return zzaiu;
    }

    /* renamed from: f */
    public final zzxx m26244f() {
        return this.f19861h;
    }

    /* renamed from: a */
    private final boolean m26234a(long r5) {
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
        r4 = this;
        r0 = r4.f19862i;
        r2 = com.google.android.gms.ads.internal.zzbv.zzer();
        r2 = r2.elapsedRealtime();
        r2 = r2 - r5;
        r0 = r0 - r2;
        r5 = 0;
        r2 = 0;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 > 0) goto L_0x0017;
    L_0x0013:
        r6 = 4;
        r4.f19864k = r6;
        return r5;
    L_0x0017:
        r6 = r4.f19859f;	 Catch:{ InterruptedException -> 0x001e }
        r6.wait(r0);	 Catch:{ InterruptedException -> 0x001e }
        r5 = 1;
        return r5;
    L_0x001e:
        r6 = java.lang.Thread.currentThread();
        r6.interrupt();
        r6 = 5;
        r4.f19864k = r6;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzair.a(long):boolean");
    }

    /* renamed from: a */
    public final void mo4173a(String str) {
        synchronized (this.f19859f) {
            this.f19863j = 1;
            this.f19859f.notify();
        }
    }

    /* renamed from: a */
    public final void mo4174a(String str, int i) {
        synchronized (this.f19859f) {
            this.f19863j = 2;
            this.f19864k = i;
            this.f19859f.notify();
        }
    }

    /* renamed from: g */
    public final void mo4175g() {
        m26233a(this.f19855b.f8806a.f19735c, this.f19857d.m9626a());
    }

    /* renamed from: a */
    public final void mo4171a(int i) {
        mo4174a(this.f19854a, 0);
    }

    /* renamed from: a */
    public final void m26239a(zzb zzb) {
        this.f19867n = zzb;
    }

    /* renamed from: a */
    public final void mo4172a(Bundle bundle) {
        zzb zzb = this.f19867n;
        if (zzb != null) {
            zzb.zza("", bundle);
        }
    }

    /* renamed from: a */
    private final void m26233a(zzjk zzjk, zzyq zzyq) {
        this.f19857d.m9627b().m26251a((zzaja) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f19854a)) {
                zzyq.mo2769a(zzjk, this.f19860g, this.f19861h.f9836a);
            } else {
                zzyq.mo2768a(zzjk, this.f19860g);
            }
        } catch (zzjk zzjk2) {
            zzaok.m10004c("Fail to load ad from adapter.", zzjk2);
            mo4174a(this.f19854a, (int) null);
        }
    }
}
