package com.google.android.gms.internal.ads;

final class sb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ sa f8371a;

    sb(sa saVar) {
        this.f8371a = saVar;
    }

    public final void run() {
        if (this.f8371a.f19655a.f20243a != null) {
            try {
                this.f8371a.f19655a.f20243a.mo2463a(1);
            } catch (Throwable e) {
                zzaok.m10004c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
