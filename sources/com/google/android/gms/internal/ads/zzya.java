package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public final class zzya extends zzyu {
    /* renamed from: a */
    private final Object f20418a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private zzyf f20419b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private zzxz f20420c;

    /* renamed from: a */
    public final void mo2788a(zzajk zzajk) {
    }

    /* renamed from: a */
    public final void mo2791a(String str) {
    }

    /* renamed from: h */
    public final void mo2799h() {
    }

    /* renamed from: i */
    public final void mo2800i() {
    }

    /* renamed from: a */
    public final void m26895a(zzyf zzyf) {
        synchronized (this.f20418a) {
            this.f20419b = zzyf;
        }
    }

    /* renamed from: a */
    public final void mo2786a() {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzcd();
            }
        }
    }

    /* renamed from: b */
    public final void mo2793b() {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzce();
            }
        }
    }

    /* renamed from: a */
    public final void mo2787a(int i) {
        synchronized (this.f20418a) {
            if (this.f20419b != null) {
                this.f20419b.mo2751a(i == 3 ? 1 : 2);
                this.f20419b = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo2794c() {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzcf();
            }
        }
    }

    /* renamed from: d */
    public final void mo2795d() {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzcg();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public final void mo2796e() {
        /*
        r3 = this;
        r0 = r3.f20418a;
        monitor-enter(r0);
        r1 = r3.f20419b;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.f20419b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.mo2751a(r2);	 Catch:{ all -> 0x001d }
        r1 = 0;
        r3.f20419b = r1;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r1 = r3.f20420c;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r1 = r3.f20420c;	 Catch:{ all -> 0x001d }
        r1.zzch();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzya.e():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2790a(com.google.android.gms.internal.ads.zzyw r4) {
        /*
        r3 = this;
        r0 = r3.f20418a;
        monitor-enter(r0);
        r1 = r3.f20419b;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.f20419b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.mo2752a(r2, r4);	 Catch:{ all -> 0x001d }
        r4 = 0;
        r3.f20419b = r4;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r4 = r3.f20420c;	 Catch:{ all -> 0x001d }
        if (r4 == 0) goto L_0x001b;
    L_0x0016:
        r4 = r3.f20420c;	 Catch:{ all -> 0x001d }
        r4.zzch();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzya.a(com.google.android.gms.internal.ads.zzyw):void");
    }

    /* renamed from: f */
    public final void mo2797f() {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzci();
            }
        }
    }

    /* renamed from: a */
    public final void mo2792a(String str, String str2) {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzb(str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo2789a(zzrg zzrg, String str) {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zza(zzrg, str);
            }
        }
    }

    /* renamed from: g */
    public final void mo2798g() {
        synchronized (this.f20418a) {
            if (this.f20420c != null) {
                this.f20420c.zzcc();
            }
        }
    }

    /* renamed from: a */
    public final void m26894a(zzxz zzxz) {
        synchronized (this.f20418a) {
            this.f20420c = zzxz;
        }
    }
}
