package com.google.android.gms.measurement.internal;

final class cx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ap f10610a;
    /* renamed from: b */
    private final /* synthetic */ cw f10611b;

    cx(cw cwVar, ap apVar) {
        this.f10611b = cwVar;
        this.f10610a = apVar;
    }

    public final void run() {
        this.f10610a.mo3173u();
        if (zzk.m12390a()) {
            this.f10610a.mo3171q().m28568a((Runnable) this);
            return;
        }
        boolean b = this.f10611b.m12309b();
        this.f10611b.f10609d = 0;
        if (b) {
            this.f10611b.mo3174a();
        }
    }
}
