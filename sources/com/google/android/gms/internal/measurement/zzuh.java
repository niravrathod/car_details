package com.google.android.gms.internal.measurement;

final class zzuh extends zzum {
    private final int zzbud;
    private final int zzbue;

    zzuh(byte[] bArr, int i, int i2) {
        super(bArr);
        zzud.m12010b(i, i + i2, bArr.length);
        this.zzbud = i;
        this.zzbue = i2;
    }

    /* renamed from: a */
    public final byte mo4350a(int i) {
        int a = mo4351a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.zzbug[this.zzbud + i];
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
    public final int mo4351a() {
        return this.zzbue;
    }

    /* renamed from: e */
    protected final int mo4825e() {
        return this.zzbud;
    }
}
