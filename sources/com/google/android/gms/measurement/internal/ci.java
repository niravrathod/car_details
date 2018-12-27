package com.google.android.gms.measurement.internal;

final class ci implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzff f10565a;
    /* renamed from: b */
    private final /* synthetic */ zzfa f10566b;

    ci(zzfa zzfa, zzff zzff) {
        this.f10566b = zzfa;
        this.f10565a = zzff;
    }

    public final void run() {
        this.f10566b.m22762a(this.f10565a);
        this.f10566b.m22782a();
    }
}
