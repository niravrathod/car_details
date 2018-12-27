package com.google.android.gms.internal.ads;

final class sd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzmz f8373a;

    sd(zzmz zzmz) {
        this.f8373a = zzmz;
    }

    public final void run() {
        if (this.f8373a.f20245a != null) {
            try {
                this.f8373a.f20245a.mo2267a(1);
            } catch (Throwable e) {
                zzaok.m10004c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
