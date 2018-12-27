package com.google.android.gms.measurement.internal;

final class am implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f10442a;
    /* renamed from: b */
    private final /* synthetic */ String f10443b;
    /* renamed from: c */
    private final /* synthetic */ String f10444c;
    /* renamed from: d */
    private final /* synthetic */ long f10445d;
    /* renamed from: e */
    private final /* synthetic */ zzbv f10446e;

    am(zzbv zzbv, String str, String str2, String str3, long j) {
        this.f10446e = zzbv;
        this.f10442a = str;
        this.f10443b = str2;
        this.f10444c = str3;
        this.f10445d = j;
    }

    public final void run() {
        if (this.f10442a == null) {
            this.f10446e.f20678a.m22814o().m22742w().m29629a(this.f10443b, null);
            return;
        }
        this.f10446e.f20678a.m22814o().m22742w().m29629a(this.f10443b, new zzdn(this.f10444c, this.f10442a, this.f10445d));
    }
}
