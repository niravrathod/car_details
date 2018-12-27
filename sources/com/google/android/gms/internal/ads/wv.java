package com.google.android.gms.internal.ads;

final class wv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8481a;

    wv(zzzq zzzq) {
        this.f8481a = zzzq;
    }

    public final void run() {
        try {
            this.f8481a.f17398a.mo2794c();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
