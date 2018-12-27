package com.google.android.gms.internal.ads;

final class vs implements zzapx<zzvr> {
    /* renamed from: a */
    private final /* synthetic */ zzwt f16704a;
    /* renamed from: b */
    private final /* synthetic */ zzwc f16705b;

    vs(zzwc zzwc, zzwt zzwt) {
        this.f16705b = zzwc;
        this.f16704a = zzwt;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1939a(Object obj) {
        synchronized (this.f16705b.f9816a) {
            this.f16705b.f9823h = 0;
            if (!(this.f16705b.f9822g == null || this.f16704a == this.f16705b.f9822g)) {
                zzalg.m21225a("New JS engine is loaded, marking previous one as destroyable.");
                this.f16705b.f9822g.m26863e();
            }
            this.f16705b.f9822g = this.f16704a;
        }
    }
}
