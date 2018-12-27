package com.google.android.gms.internal.ads;

final class cx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzalc f7980a;

    cx(zzalc zzalc) {
        this.f7980a = zzalc;
    }

    public final void run() {
        this.f7980a.f16848b = Thread.currentThread();
        this.f7980a.mo4075a();
    }
}
