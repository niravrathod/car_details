package com.google.android.gms.internal.ads;

final class wq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8475a;

    wq(zzzq zzzq) {
        this.f8475a = zzzq;
    }

    public final void run() {
        try {
            this.f8475a.f17398a.mo2786a();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
