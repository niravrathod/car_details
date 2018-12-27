package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

final class bv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzafp f7934a;
    /* renamed from: b */
    private final /* synthetic */ zzaga f7935b;
    /* renamed from: c */
    private final /* synthetic */ zzagx f7936c;

    bv(zzagx zzagx, zzafp zzafp, zzaga zzaga) {
        this.f7936c = zzagx;
        this.f7934a = zzafp;
        this.f7935b = zzaga;
    }

    public final void run() {
        zzaft a;
        try {
            a = this.f7936c.mo2232a(this.f7934a);
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "AdRequestServiceImpl.loadAdAsync");
            zzaok.m10004c("Could not fetch ad response due to an Exception.", e);
            a = null;
        }
        if (a == null) {
            a = new zzaft(0);
        }
        try {
            this.f7935b.mo2236a(a);
        } catch (Throwable e2) {
            zzaok.m10004c("Fail to forward ad response.", e2);
        }
    }
}
