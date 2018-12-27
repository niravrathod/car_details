package com.google.android.gms.internal.ads;

final class bp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzakn f7928a;
    /* renamed from: b */
    private final /* synthetic */ zzagk f7929b;

    bp(zzagk zzagk, zzakn zzakn) {
        this.f7929b = zzagk;
        this.f7928a = zzakn;
    }

    public final void run() {
        this.f7929b.f19833h.zza(this.f7928a);
        if (this.f7929b.f19837l != null) {
            this.f7929b.f19837l.m26858c();
            this.f7929b.f19837l = null;
        }
    }
}
