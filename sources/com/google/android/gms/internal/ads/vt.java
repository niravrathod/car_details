package com.google.android.gms.internal.ads;

final class vt implements zzapv {
    /* renamed from: a */
    private final /* synthetic */ zzwt f16706a;
    /* renamed from: b */
    private final /* synthetic */ zzwc f16707b;

    vt(zzwc zzwc, zzwt zzwt) {
        this.f16707b = zzwc;
        this.f16706a = zzwt;
    }

    /* renamed from: a */
    public final void mo1940a() {
        synchronized (this.f16707b.f9816a) {
            this.f16707b.f9823h = 1;
            zzalg.m21225a("Failed loading new engine. Marking new engine destroyable.");
            this.f16706a.m26863e();
        }
    }
}
