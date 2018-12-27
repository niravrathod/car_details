package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzhg {
    /* renamed from: a */
    private final Runnable f9531a = new qp(this);
    /* renamed from: b */
    private final Object f9532b = new Object();
    @GuardedBy("mLock")
    /* renamed from: c */
    private zzhn f9533c;
    @GuardedBy("mLock")
    /* renamed from: d */
    private Context f9534d;
    @GuardedBy("mLock")
    /* renamed from: e */
    private zzhr f9535e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m10674a(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r2.f9532b;
        monitor-enter(r0);
        r1 = r2.f9534d;	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x000c:
        r3 = r3.getApplicationContext();	 Catch:{ all -> 0x0048 }
        r2.f9534d = r3;	 Catch:{ all -> 0x0048 }
        r3 = com.google.android.gms.internal.ads.zznw.bV;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x0048 }
        r3 = r1.m10897a(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0028;
    L_0x0024:
        r2.m10667b();	 Catch:{ all -> 0x0048 }
        goto L_0x0046;
    L_0x0028:
        r3 = com.google.android.gms.internal.ads.zznw.bU;	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x0048 }
        r3 = r1.m10897a(r3);	 Catch:{ all -> 0x0048 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0048 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0046;
    L_0x003a:
        r3 = new com.google.android.gms.internal.ads.qq;	 Catch:{ all -> 0x0048 }
        r3.<init>(r2);	 Catch:{ all -> 0x0048 }
        r1 = com.google.android.gms.ads.internal.zzbv.zzen();	 Catch:{ all -> 0x0048 }
        r1.m10632a(r3);	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0048:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0048 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhg.a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m10673a() {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bW)).booleanValue()) {
            synchronized (this.f9532b) {
                m10667b();
                zzbv.zzek();
                zzalo.f8872a.removeCallbacks(this.f9531a);
                zzbv.zzek();
                zzalo.f8872a.postDelayed(this.f9531a, ((Long) zzkd.m10713e().m10897a(zznw.bX)).longValue());
            }
        }
    }

    /* renamed from: a */
    public final zzhl m10672a(zzho zzho) {
        synchronized (this.f9532b) {
            if (this.f9535e == null) {
                zzho = new zzhl();
                return zzho;
            }
            try {
                zzho = this.f9535e.mo2456a(zzho);
                return zzho;
            } catch (zzho zzho2) {
                zzaok.m10002b("Unable to call into cache service.", zzho2);
                return new zzhl();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final void m10667b() {
        /*
        r6 = this;
        r0 = r6.f9532b;
        monitor-enter(r0);
        r1 = r6.f9534d;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x002e;
    L_0x0007:
        r1 = r6.f9533c;	 Catch:{ all -> 0x0030 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002e;
    L_0x000c:
        r1 = new com.google.android.gms.internal.ads.qr;	 Catch:{ all -> 0x0030 }
        r1.<init>(r6);	 Catch:{ all -> 0x0030 }
        r2 = new com.google.android.gms.internal.ads.qs;	 Catch:{ all -> 0x0030 }
        r2.<init>(r6);	 Catch:{ all -> 0x0030 }
        r3 = new com.google.android.gms.internal.ads.zzhn;	 Catch:{ all -> 0x0030 }
        r4 = r6.f9534d;	 Catch:{ all -> 0x0030 }
        r5 = com.google.android.gms.ads.internal.zzbv.zzfa();	 Catch:{ all -> 0x0030 }
        r5 = r5.m9925a();	 Catch:{ all -> 0x0030 }
        r3.<init>(r4, r5, r1, r2);	 Catch:{ all -> 0x0030 }
        r6.f9533c = r3;	 Catch:{ all -> 0x0030 }
        r1 = r6.f9533c;	 Catch:{ all -> 0x0030 }
        r1.checkAvailabilityAndConnect();	 Catch:{ all -> 0x0030 }
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x002e:
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        return;
    L_0x0030:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0030 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhg.b():void");
    }

    /* renamed from: c */
    private final void m10670c() {
        synchronized (this.f9532b) {
            if (this.f9533c == null) {
                return;
            }
            if (this.f9533c.isConnected() || this.f9533c.isConnecting()) {
                this.f9533c.disconnect();
            }
            this.f9533c = null;
            this.f9535e = null;
            Binder.flushPendingCommands();
        }
    }
}
