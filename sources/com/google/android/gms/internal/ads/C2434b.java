package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b */
final class C2434b implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzzq f7919a;

    C2434b(zzzq zzzq) {
        this.f7919a = zzzq;
    }

    public final void run() {
        try {
            this.f7919a.f17398a.mo2794c();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
