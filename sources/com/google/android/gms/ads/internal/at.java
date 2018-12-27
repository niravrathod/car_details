package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzrt;

final class at implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzrg f7668a;
    /* renamed from: b */
    private final /* synthetic */ zzp f7669b;

    at(zzp zzp, zzrg zzrg) {
        this.f7669b = zzp;
        this.f7668a = zzrg;
    }

    public final void run() {
        try {
            ((zzrt) this.f7669b.e.f7805n.get(this.f7668a.mo2666b())).mo2686a(this.f7668a);
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
