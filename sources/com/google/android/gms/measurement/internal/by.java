package com.google.android.gms.measurement.internal;

final class by implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzfa f10551a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f10552b;

    by(zzel zzel, zzfa zzfa, Runnable runnable) {
        this.f10551a = zzfa;
        this.f10552b = runnable;
    }

    public final void run() {
        this.f10551a.m22810k();
        this.f10551a.m22791a(this.f10552b);
        this.f10551a.m22809j();
    }
}
