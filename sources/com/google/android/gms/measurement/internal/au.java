package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class au implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10464a;
    /* renamed from: b */
    private final /* synthetic */ boolean f10465b;
    /* renamed from: c */
    private final /* synthetic */ zzcs f10466c;

    au(zzcs zzcs, AtomicReference atomicReference, boolean z) {
        this.f10466c = zzcs;
        this.f10464a = atomicReference;
        this.f10465b = z;
    }

    public final void run() {
        this.f10466c.mo4844h().m29683a(this.f10464a, this.f10465b);
    }
}
