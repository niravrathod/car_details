package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzawa<P> {
    /* renamed from: a */
    private final P f9043a;
    /* renamed from: b */
    private final byte[] f9044b;
    /* renamed from: c */
    private final zzayy f9045c;
    /* renamed from: d */
    private final zzazq f9046d;

    public zzawa(P p, byte[] bArr, zzayy zzayy, zzazq zzazq) {
        this.f9043a = p;
        this.f9044b = Arrays.copyOf(bArr, bArr.length);
        this.f9045c = zzayy;
        this.f9046d = zzazq;
    }

    /* renamed from: a */
    public final P m10204a() {
        return this.f9043a;
    }

    /* renamed from: b */
    public final byte[] m10205b() {
        if (this.f9044b == null) {
            return null;
        }
        return Arrays.copyOf(this.f9044b, this.f9044b.length);
    }
}
