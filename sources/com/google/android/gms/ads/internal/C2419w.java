package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzpd;

/* renamed from: com.google.android.gms.ads.internal.w */
final class C2419w implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpd f7732a;
    /* renamed from: b */
    private final /* synthetic */ zzbb f7733b;

    C2419w(zzbb zzbb, zzpd zzpd) {
        this.f7733b = zzbb;
        this.f7732a = zzpd;
    }

    public final void run() {
        try {
            if (this.f7733b.e.f7801j != null) {
                this.f7733b.e.f7801j.mo2684a(this.f7732a);
                this.f7733b.m28929a(this.f7732a.mo2659n());
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
