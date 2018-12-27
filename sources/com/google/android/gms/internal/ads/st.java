package com.google.android.gms.internal.ads;

final class st implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzpd f8380a;

    st(zzpd zzpd) {
        this.f8380a = zzpd;
    }

    public final void run() {
        if (this.f8380a.f20304n != null) {
            this.f8380a.f20304n.mo2606l();
            this.f8380a.f20304n.mo2605k();
            this.f8380a.f20304n.mo2608n();
        }
        this.f8380a.f20304n = null;
    }
}
