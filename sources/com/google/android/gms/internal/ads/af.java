package com.google.android.gms.internal.ads;

final /* synthetic */ class af implements Runnable {
    /* renamed from: a */
    private final zzadm f7904a;
    /* renamed from: b */
    private final boolean f7905b = true;
    /* renamed from: c */
    private final zzaps f7906c;
    /* renamed from: d */
    private final String f7907d;
    /* renamed from: e */
    private final String f7908e;

    af(zzadm zzadm, boolean z, zzaps zzaps, String str, String str2) {
        this.f7904a = zzadm;
        this.f7906c = zzaps;
        this.f7907d = str;
        this.f7908e = str2;
    }

    public final void run() {
        this.f7904a.m9492a(this.f7905b, this.f7906c, this.f7907d, this.f7908e);
    }
}
