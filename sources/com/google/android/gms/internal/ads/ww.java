package com.google.android.gms.internal.ads;

final class ww implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8482a;

    ww(zzzq zzzq) {
        this.f8482a = zzzq;
    }

    public final void run() {
        try {
            this.f8482a.f17398a.mo2795d();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
