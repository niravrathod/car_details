package com.google.android.gms.internal.ads;

final class zzbby extends zzbcd {
    private final int zzdti;
    private final int zzdtj;

    zzbby(byte[] bArr, int i, int i2) {
        super(bArr);
        zzbbu.m10263b(i, i + i2, bArr.length);
        this.zzdti = i;
        this.zzdtj = i2;
    }

    /* renamed from: a */
    public final byte mo4214a(int i) {
        int a = mo4215a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.zzdtl[this.zzdti + i];
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(a);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* renamed from: a */
    public final int mo4215a() {
        return this.zzdtj;
    }

    /* renamed from: g */
    protected final int mo4799g() {
        return this.zzdti;
    }

    /* renamed from: a */
    protected final void mo4220a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzdtl, mo4799g(), bArr, 0, i3);
    }
}
