package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

class zzum extends zzul {
    protected final byte[] zzbug;

    zzum(byte[] bArr) {
        if (bArr != null) {
            this.zzbug = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: e */
    protected int mo4825e() {
        return 0;
    }

    /* renamed from: a */
    public byte mo4350a(int i) {
        return this.zzbug[i];
    }

    /* renamed from: a */
    public int mo4351a() {
        return this.zzbug.length;
    }

    /* renamed from: a */
    public final zzud mo4353a(int i, int i2) {
        i = zzud.m12010b(0, i2, mo4351a());
        if (i == 0) {
            return zzud.f10195a;
        }
        return new zzuh(this.zzbug, mo4825e(), i);
    }

    /* renamed from: a */
    final void mo4355a(zzuc zzuc) {
        zzuc.mo4374a(this.zzbug, mo4825e(), mo4351a());
    }

    /* renamed from: a */
    protected final String mo4354a(Charset charset) {
        return new String(this.zzbug, mo4825e(), mo4351a(), charset);
    }

    /* renamed from: c */
    public final boolean mo4357c() {
        int e = mo4825e();
        return dr.m11792a(this.zzbug, e, mo4351a() + e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzud) || mo4351a() != ((zzud) obj).mo4351a()) {
            return false;
        }
        if (mo4351a() == 0) {
            return true;
        }
        if (!(obj instanceof zzum)) {
            return obj.equals(this);
        }
        zzum zzum = (zzum) obj;
        int d = m12020d();
        int d2 = zzum.m12020d();
        if (d == 0 || d2 == 0 || d == d2) {
            return mo4356a(zzum, 0, mo4351a());
        }
        return false;
    }

    /* renamed from: a */
    final boolean mo4356a(zzud zzud, int i, int i2) {
        StringBuilder stringBuilder;
        if (i2 > zzud.mo4351a()) {
            i = mo4351a();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzud.mo4351a()) {
            zzud = zzud.mo4351a();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(zzud);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if ((zzud instanceof zzum) == 0) {
            return zzud.mo4353a(0, i2).equals(mo4353a(0, i2));
        } else {
            zzum zzum = (zzum) zzud;
            i = this.zzbug;
            byte[] bArr = zzum.zzbug;
            int e = mo4825e() + i2;
            i2 = mo4825e();
            zzud = zzum.mo4825e();
            while (i2 < e) {
                if (i[i2] != bArr[zzud]) {
                    return false;
                }
                i2++;
                zzud++;
            }
            return true;
        }
    }

    /* renamed from: a */
    protected final int mo4352a(int i, int i2, int i3) {
        return zzvo.m12066a(i, this.zzbug, mo4825e(), i3);
    }
}
