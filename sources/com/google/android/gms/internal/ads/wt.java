package com.google.android.gms.internal.ads;

final class wt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8478a;

    wt(zzzq zzzq) {
        this.f8478a = zzzq;
    }

    public final void run() {
        try {
            this.f8478a.f17398a.mo2793b();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
