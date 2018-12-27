package com.google.android.gms.internal.ads;

final class wp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzye f8474a;

    wp(zzyk zzyk, zzye zzye) {
        this.f8474a = zzye;
    }

    public final void run() {
        try {
            this.f8474a.f9880c.mo2772c();
        } catch (Throwable e) {
            zzaok.m10004c("Could not destroy mediation adapter.", e);
        }
    }
}
