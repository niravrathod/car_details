package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpd;

final class as implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpd f7666a;
    /* renamed from: b */
    private final /* synthetic */ zzp f7667b;

    as(zzp zzp, zzpd zzpd) {
        this.f7667b = zzp;
        this.f7666a = zzpd;
    }

    public final void run() {
        try {
            if (this.f7667b.e.f7801j != null) {
                this.f7667b.e.f7801j.mo2684a(this.f7666a);
                this.f7667b.m28945a(this.f7666a.mo2659n());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
