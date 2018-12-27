package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class az implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10478a;
    /* renamed from: b */
    private final /* synthetic */ String f10479b;
    /* renamed from: c */
    private final /* synthetic */ String f10480c;
    /* renamed from: d */
    private final /* synthetic */ String f10481d;
    /* renamed from: e */
    private final /* synthetic */ boolean f10482e;
    /* renamed from: f */
    private final /* synthetic */ zzcs f10483f;

    az(zzcs zzcs, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f10483f = zzcs;
        this.f10478a = atomicReference;
        this.f10479b = str;
        this.f10480c = str2;
        this.f10481d = str3;
        this.f10482e = z;
    }

    public final void run() {
        this.f10483f.r.m22743x().m29682a(this.f10478a, this.f10479b, this.f10480c, this.f10481d, this.f10482e);
    }
}
