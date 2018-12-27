package com.google.android.gms.measurement.internal;

final class ag implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzad f10426a;
    /* renamed from: b */
    private final /* synthetic */ String f10427b;
    /* renamed from: c */
    private final /* synthetic */ zzbv f10428c;

    ag(zzbv zzbv, zzad zzad, String str) {
        this.f10428c = zzbv;
        this.f10426a = zzad;
        this.f10427b = str;
    }

    public final void run() {
        this.f10428c.f20678a.m22810k();
        this.f10428c.f20678a.m22786a(this.f10426a, this.f10427b);
    }
}
