package com.google.android.gms.measurement.internal;

final class ba implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f10485a;
    /* renamed from: b */
    private final /* synthetic */ zzcs f10486b;

    ba(zzcs zzcs, boolean z) {
        this.f10486b = zzcs;
        this.f10485a = z;
    }

    public final void run() {
        boolean C = this.f10486b.r.m22710C();
        boolean B = this.f10486b.r.m22709B();
        this.f10486b.r.m22721b(this.f10485a);
        if (B == this.f10485a) {
            this.f10486b.r.mo3172r().m28555x().m12355a("Default data collection state already set to", Boolean.valueOf(this.f10485a));
        }
        if (this.f10486b.r.m22710C() == C || this.f10486b.r.m22710C() != this.f10486b.r.m22709B()) {
            this.f10486b.r.mo3172r().m28542k().m12356a("Default data collection is different than actual status", Boolean.valueOf(this.f10485a), Boolean.valueOf(C));
        }
        this.f10486b.m29559C();
    }
}
