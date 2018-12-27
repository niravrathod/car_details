package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpi;

/* renamed from: com.google.android.gms.ads.internal.v */
final class C2418v implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpi f7730a;
    /* renamed from: b */
    private final /* synthetic */ zzbb f7731b;

    C2418v(zzbb zzbb, zzpi zzpi) {
        this.f7731b = zzbb;
        this.f7730a = zzpi;
    }

    public final void run() {
        try {
            if (this.f7731b.e.f7802k != null) {
                this.f7731b.e.f7802k.mo2688a(this.f7730a);
                this.f7731b.m28929a(this.f7730a.mo2709q());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
