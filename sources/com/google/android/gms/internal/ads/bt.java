package com.google.android.gms.internal.ads;

final class bt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzagk f7933a;

    bt(zzagk zzagk) {
        this.f7933a = zzagk;
    }

    public final void run() {
        if (this.f7933a.f19837l != null) {
            this.f7933a.f19837l.m26858c();
            this.f7933a.f19837l = null;
        }
    }
}
