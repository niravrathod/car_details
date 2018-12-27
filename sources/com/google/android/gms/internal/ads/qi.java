package com.google.android.gms.internal.ads;

final class qi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ qh f8346a;

    qi(qh qhVar) {
        this.f8346a = qhVar;
    }

    public final void run() {
        synchronized (this.f8346a.f8338c) {
            if (this.f8346a.f8339d && this.f8346a.f8340e) {
                this.f8346a.f8339d = false;
                zzaok.m10001b("App went background");
                for (zzgm a : this.f8346a.f8341f) {
                    try {
                        a.mo2165a(false);
                    } catch (Throwable e) {
                        zzaok.m10002b("", e);
                    }
                }
            } else {
                zzaok.m10001b("App is still foreground");
            }
        }
    }
}
