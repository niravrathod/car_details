package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class ac implements Callable<List<zzl>> {
    /* renamed from: a */
    private final /* synthetic */ zzh f10413a;
    /* renamed from: b */
    private final /* synthetic */ String f10414b;
    /* renamed from: c */
    private final /* synthetic */ String f10415c;
    /* renamed from: d */
    private final /* synthetic */ zzbv f10416d;

    ac(zzbv zzbv, zzh zzh, String str, String str2) {
        this.f10416d = zzbv;
        this.f10413a = zzh;
        this.f10414b = str;
        this.f10415c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f10416d.f20678a.m22810k();
        return this.f10416d.f20678a.m22802d().m29426b(this.f10413a.f20689a, this.f10414b, this.f10415c);
    }
}
