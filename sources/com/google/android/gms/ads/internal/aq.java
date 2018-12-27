package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpi;

final class aq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpi f7662a;
    /* renamed from: b */
    private final /* synthetic */ zzp f7663b;

    aq(zzp zzp, zzpi zzpi) {
        this.f7663b = zzp;
        this.f7662a = zzpi;
    }

    public final void run() {
        try {
            if (this.f7663b.e.f7802k != null) {
                this.f7663b.e.f7802k.mo2688a(this.f7662a);
                this.f7663b.m28945a(this.f7662a.mo2709q());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
