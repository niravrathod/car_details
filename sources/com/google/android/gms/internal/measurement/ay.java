package com.google.android.gms.internal.measurement;

final class ay {
    /* renamed from: a */
    private final zzut f10041a;
    /* renamed from: b */
    private final byte[] f10042b;

    private ay(int i) {
        this.f10042b = new byte[i];
        this.f10041a = zzut.m22545a(this.f10042b);
    }

    /* renamed from: a */
    public final zzud m11497a() {
        if (this.f10041a.mo4375b() == 0) {
            return new zzum(this.f10042b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zzut m11498b() {
        return this.f10041a;
    }
}
