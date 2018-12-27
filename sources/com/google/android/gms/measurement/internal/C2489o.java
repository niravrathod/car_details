package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o */
final class C2489o implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzbt f10647a;
    /* renamed from: b */
    private final /* synthetic */ zzap f10648b;

    C2489o(zzbj zzbj, zzbt zzbt, zzap zzap) {
        this.f10647a = zzbt;
        this.f10648b = zzap;
    }

    public final void run() {
        if (this.f10647a.m22725f() == null) {
            this.f10648b.v_().m12354a("Install Referrer Reporter is null");
            return;
        }
        zzbg f = this.f10647a.m22725f();
        f.f10769a.m22712E();
        f.m12370a(f.f10769a.mo3170n().getPackageName());
    }
}
