package com.google.android.gms.internal.ads;

public final class zzbbk {
    /* renamed from: a */
    private final byte[] f9091a = new byte[256];
    /* renamed from: b */
    private int f9092b;
    /* renamed from: c */
    private int f9093c;

    public zzbbk(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.f9091a[i] = (byte) i;
        }
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            i2 = ((i2 + this.f9091a[i]) + bArr[i % bArr.length]) & 255;
            byte b = this.f9091a[i];
            this.f9091a[i] = this.f9091a[i2];
            this.f9091a[i2] = b;
        }
        this.f9092b = 0;
        this.f9093c = 0;
    }

    /* renamed from: a */
    public final void m10256a(byte[] bArr) {
        int i = this.f9092b;
        int i2 = this.f9093c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f9091a[i]) & 255;
            byte b = this.f9091a[i];
            this.f9091a[i] = this.f9091a[i2];
            this.f9091a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f9091a[(this.f9091a[i] + this.f9091a[i2]) & 255]);
        }
        this.f9092b = i;
        this.f9093c = i2;
    }
}
