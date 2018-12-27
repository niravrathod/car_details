package com.google.android.gms.measurement.internal;

final class as implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f10458a;
    /* renamed from: b */
    private final /* synthetic */ String f10459b;
    /* renamed from: c */
    private final /* synthetic */ Object f10460c;
    /* renamed from: d */
    private final /* synthetic */ long f10461d;
    /* renamed from: e */
    private final /* synthetic */ zzcs f10462e;

    as(zzcs zzcs, String str, String str2, Object obj, long j) {
        this.f10462e = zzcs;
        this.f10458a = str;
        this.f10459b = str2;
        this.f10460c = obj;
        this.f10461d = j;
    }

    public final void run() {
        this.f10462e.m29586a(this.f10458a, this.f10459b, this.f10460c, this.f10461d);
    }
}
