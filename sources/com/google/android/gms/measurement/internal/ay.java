package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class ay implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f10473a;
    /* renamed from: b */
    private final /* synthetic */ String f10474b;
    /* renamed from: c */
    private final /* synthetic */ String f10475c;
    /* renamed from: d */
    private final /* synthetic */ String f10476d;
    /* renamed from: e */
    private final /* synthetic */ zzcs f10477e;

    ay(zzcs zzcs, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f10477e = zzcs;
        this.f10473a = atomicReference;
        this.f10474b = str;
        this.f10475c = str2;
        this.f10476d = str3;
    }

    public final void run() {
        this.f10477e.r.m22743x().m29681a(this.f10473a, this.f10474b, this.f10475c, this.f10476d);
    }
}
