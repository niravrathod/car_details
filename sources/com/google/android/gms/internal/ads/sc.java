package com.google.android.gms.internal.ads;

final class sc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzmu f8372a;

    sc(zzmu zzmu) {
        this.f8372a = zzmu;
    }

    public final void run() {
        if (this.f8372a.f20244a != null) {
            try {
                this.f8372a.f20244a.mo2463a(1);
            } catch (Throwable e) {
                zzaok.m10004c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
