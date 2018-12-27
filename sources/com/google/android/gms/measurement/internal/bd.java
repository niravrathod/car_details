package com.google.android.gms.measurement.internal;

final class bd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzdn f10492a;
    /* renamed from: b */
    private final /* synthetic */ zzdo f10493b;

    bd(zzdo zzdo, zzdn zzdn) {
        this.f10493b = zzdo;
        this.f10492a = zzdn;
    }

    public final void run() {
        this.f10493b.m29621a(this.f10492a);
        this.f10493b.f21649a = null;
        this.f10493b.mo4844h().m29677a(null);
    }
}
