package com.google.android.gms.internal.ads;

public final class zzbau {
    /* renamed from: a */
    private final byte[] f9085a;

    /* renamed from: a */
    public static zzbau m10245a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new zzbau(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] m10246a() {
        Object obj = new byte[this.f9085a.length];
        System.arraycopy(this.f9085a, 0, obj, 0, this.f9085a.length);
        return obj;
    }

    private zzbau(byte[] bArr, int i, int i2) {
        this.f9085a = new byte[i2];
        System.arraycopy(bArr, 0, this.f9085a, 0, i2);
    }
}
