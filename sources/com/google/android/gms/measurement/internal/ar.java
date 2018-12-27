package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class ar implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ String f10449a;
    /* renamed from: b */
    private final /* synthetic */ String f10450b;
    /* renamed from: c */
    private final /* synthetic */ long f10451c;
    /* renamed from: d */
    private final /* synthetic */ Bundle f10452d;
    /* renamed from: e */
    private final /* synthetic */ boolean f10453e;
    /* renamed from: f */
    private final /* synthetic */ boolean f10454f;
    /* renamed from: g */
    private final /* synthetic */ boolean f10455g;
    /* renamed from: h */
    private final /* synthetic */ String f10456h;
    /* renamed from: i */
    private final /* synthetic */ zzcs f10457i;

    ar(zzcs zzcs, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f10457i = zzcs;
        this.f10449a = str;
        this.f10450b = str2;
        this.f10451c = j;
        this.f10452d = bundle;
        this.f10453e = z;
        this.f10454f = z2;
        this.f10455g = z3;
        this.f10456h = str3;
    }

    public final void run() {
        this.f10457i.m29563a(this.f10449a, this.f10450b, this.f10451c, this.f10452d, this.f10453e, this.f10454f, this.f10455g, this.f10456h);
    }
}
