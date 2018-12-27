package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpb;

final class ar implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpb f7664a;
    /* renamed from: b */
    private final /* synthetic */ zzp f7665b;

    ar(zzp zzp, zzpb zzpb) {
        this.f7665b = zzp;
        this.f7664a = zzpb;
    }

    public final void run() {
        try {
            if (this.f7665b.e.f7800i != null) {
                this.f7665b.e.f7800i.mo2683a(this.f7664a);
                this.f7665b.m28945a(this.f7664a.mo2641n());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
