package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpb;

/* renamed from: com.google.android.gms.ads.internal.u */
final class C2417u implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpb f7728a;
    /* renamed from: b */
    private final /* synthetic */ zzbb f7729b;

    C2417u(zzbb zzbb, zzpb zzpb) {
        this.f7729b = zzbb;
        this.f7728a = zzpb;
    }

    public final void run() {
        try {
            if (this.f7729b.e.f7800i != null) {
                this.f7729b.e.f7800i.mo2683a(this.f7728a);
                this.f7729b.m28929a(this.f7728a.mo2641n());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
