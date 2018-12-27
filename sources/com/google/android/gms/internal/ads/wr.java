package com.google.android.gms.internal.ads;

final class wr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8476a;

    wr(zzzq zzzq) {
        this.f8476a = zzzq;
    }

    public final void run() {
        try {
            this.f8476a.f17398a.mo2795d();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
