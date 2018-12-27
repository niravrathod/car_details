package com.google.android.gms.internal.ads;

final class wx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f8483a;

    wx(zzzq zzzq) {
        this.f8483a = zzzq;
    }

    public final void run() {
        try {
            this.f8483a.f17398a.mo2796e();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
