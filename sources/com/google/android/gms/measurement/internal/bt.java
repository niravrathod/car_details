package com.google.android.gms.measurement.internal;

final class bt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzag f10540a;
    /* renamed from: b */
    private final /* synthetic */ zzef f10541b;

    bt(zzef zzef, zzag zzag) {
        this.f10541b = zzef;
        this.f10540a = zzag;
    }

    public final void run() {
        synchronized (this.f10541b) {
            this.f10541b.f17601b = false;
            if (!this.f10541b.f17600a.m29705x()) {
                this.f10541b.f17600a.mo3172r().m28554w().m12354a("Connected to remote service");
                this.f10541b.f17600a.m29675a(this.f10540a);
            }
        }
    }
}
