package com.google.android.gms.internal.ads;

final class ws implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8477a;

    ws(zzzq zzzq) {
        this.f8477a = zzzq;
    }

    public final void run() {
        try {
            this.f8477a.f17398a.mo2796e();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
