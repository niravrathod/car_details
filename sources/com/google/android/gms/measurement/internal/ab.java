package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class ab implements Callable<List<cm>> {
    /* renamed from: a */
    private final /* synthetic */ String f10409a;
    /* renamed from: b */
    private final /* synthetic */ String f10410b;
    /* renamed from: c */
    private final /* synthetic */ String f10411c;
    /* renamed from: d */
    private final /* synthetic */ zzbv f10412d;

    ab(zzbv zzbv, String str, String str2, String str3) {
        this.f10412d = zzbv;
        this.f10409a = str;
        this.f10410b = str2;
        this.f10411c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f10412d.f20678a.m22810k();
        return this.f10412d.f20678a.m22802d().m29414a(this.f10409a, this.f10410b, this.f10411c);
    }
}
