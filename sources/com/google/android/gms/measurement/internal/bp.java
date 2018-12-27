package com.google.android.gms.measurement.internal;

final class bp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f10528a;
    /* renamed from: b */
    private final /* synthetic */ zzfh f10529b;
    /* renamed from: c */
    private final /* synthetic */ zzh f10530c;
    /* renamed from: d */
    private final /* synthetic */ zzdr f10531d;

    bp(zzdr zzdr, boolean z, zzfh zzfh, zzh zzh) {
        this.f10531d = zzdr;
        this.f10528a = z;
        this.f10529b = zzfh;
        this.f10530c = zzh;
    }

    public final void run() {
        zzag d = this.f10531d.f21656b;
        if (d == null) {
            this.f10531d.mo3172r().v_().m12354a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f10531d.m29676a(d, this.f10528a ? null : this.f10529b, this.f10530c);
        this.f10531d.m29657I();
    }
}
