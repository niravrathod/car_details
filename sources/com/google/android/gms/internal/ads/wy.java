package com.google.android.gms.internal.ads;

final class wy implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8484a;

    wy(zzzq zzzq) {
        this.f8484a = zzzq;
    }

    public final void run() {
        try {
            this.f8484a.f17398a.mo2793b();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
