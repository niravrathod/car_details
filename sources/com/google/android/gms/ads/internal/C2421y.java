package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzrt;

/* renamed from: com.google.android.gms.ads.internal.y */
final class C2421y implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzrg f7737a;
    /* renamed from: b */
    private final /* synthetic */ zzbb f7738b;

    C2421y(zzbb zzbb, zzrg zzrg) {
        this.f7738b = zzbb;
        this.f7737a = zzrg;
    }

    public final void run() {
        try {
            ((zzrt) this.f7738b.e.f7805n.get(this.f7737a.mo2666b())).mo2686a(this.f7737a);
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
