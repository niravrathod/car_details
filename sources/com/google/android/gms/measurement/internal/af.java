package com.google.android.gms.measurement.internal;

final class af implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzad f10423a;
    /* renamed from: b */
    private final /* synthetic */ zzh f10424b;
    /* renamed from: c */
    private final /* synthetic */ zzbv f10425c;

    af(zzbv zzbv, zzad zzad, zzh zzh) {
        this.f10425c = zzbv;
        this.f10423a = zzad;
        this.f10424b = zzh;
    }

    public final void run() {
        zzad b = this.f10425c.m27324b(this.f10423a, this.f10424b);
        this.f10425c.f20678a.m22810k();
        this.f10425c.f20678a.m22785a(b, this.f10424b);
    }
}
