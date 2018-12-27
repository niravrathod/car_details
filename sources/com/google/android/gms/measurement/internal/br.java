package com.google.android.gms.measurement.internal;

final class br implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzag f10536a;
    /* renamed from: b */
    private final /* synthetic */ zzef f10537b;

    br(zzef zzef, zzag zzag) {
        this.f10537b = zzef;
        this.f10536a = zzag;
    }

    public final void run() {
        synchronized (this.f10537b) {
            this.f10537b.f17601b = false;
            if (!this.f10537b.f17600a.m29705x()) {
                this.f10537b.f17600a.mo3172r().m28555x().m12354a("Connected to service");
                this.f10537b.f17600a.m29675a(this.f10536a);
            }
        }
    }
}
