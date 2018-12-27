package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class ad implements Callable<List<zzl>> {
    /* renamed from: a */
    private final /* synthetic */ String f10417a;
    /* renamed from: b */
    private final /* synthetic */ String f10418b;
    /* renamed from: c */
    private final /* synthetic */ String f10419c;
    /* renamed from: d */
    private final /* synthetic */ zzbv f10420d;

    ad(zzbv zzbv, String str, String str2, String str3) {
        this.f10420d = zzbv;
        this.f10417a = str;
        this.f10418b = str2;
        this.f10419c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f10420d.f20678a.m22810k();
        return this.f10420d.f20678a.m22802d().m29426b(this.f10417a, this.f10418b, this.f10419c);
    }
}
