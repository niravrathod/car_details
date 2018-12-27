package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class ah implements Callable<byte[]> {
    /* renamed from: a */
    private final /* synthetic */ zzad f10429a;
    /* renamed from: b */
    private final /* synthetic */ String f10430b;
    /* renamed from: c */
    private final /* synthetic */ zzbv f10431c;

    ah(zzbv zzbv, zzad zzad, String str) {
        this.f10431c = zzbv;
        this.f10429a = zzad;
        this.f10430b = str;
    }

    public final /* synthetic */ Object call() {
        this.f10431c.f20678a.m22810k();
        return this.f10431c.f20678a.m22799b(this.f10429a, this.f10430b);
    }
}
