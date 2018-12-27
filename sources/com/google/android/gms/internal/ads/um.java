package com.google.android.gms.internal.ads;

final class um implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ un f8399a;
    /* renamed from: b */
    private final /* synthetic */ uo f8400b;

    um(to toVar, un unVar, uo uoVar) {
        this.f8399a = unVar;
        this.f8400b = uoVar;
    }

    public final void run() {
        try {
            this.f8399a.mo2175a(this.f8400b);
        } catch (Throwable e) {
            zzaok.m10004c("Could not propagate interstitial ad event.", e);
        }
    }
}
