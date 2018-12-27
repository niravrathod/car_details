package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r */
final class C2446r implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzacm f8362a;

    C2446r(zzacm zzacm) {
        this.f8362a = zzacm;
    }

    public final void run() {
        if (this.f8362a.f16775h.get()) {
            zzaok.m10003c("Timed out waiting for WebView to finish loading.");
            this.f8362a.mo2218b();
        }
    }
}
