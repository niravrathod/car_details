package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

class zzbcd extends zzbcc {
    protected final byte[] zzdtl;

    zzbcd(byte[] bArr) {
        if (bArr != null) {
            this.zzdtl = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: g */
    protected int mo4799g() {
        return 0;
    }

    /* renamed from: a */
    public byte mo4214a(int i) {
        return this.zzdtl[i];
    }

    /* renamed from: a */
    public int mo4215a() {
        return this.zzdtl.length;
    }

    /* renamed from: a */
    public final zzbbu mo4217a(int i, int i2) {
        i = zzbbu.m10263b(0, i2, mo4215a());
        if (i == 0) {
            return zzbbu.f9094a;
        }
        return new zzbby(this.zzdtl, mo4799g(), i);
    }

    /* renamed from: a */
    protected void mo4220a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzdtl, 0, bArr, 0, i3);
    }

    /* renamed from: a */
    final void mo4219a(zzbbt zzbbt) {
        zzbbt.mo4240a(this.zzdtl, mo4799g(), mo4215a());
    }

    /* renamed from: a */
    protected final String mo4218a(Charset charset) {
        return new String(this.zzdtl, mo4799g(), mo4215a(), charset);
    }

    /* renamed from: d */
    public final boolean mo4222d() {
        int g = mo4799g();
        return ni.m9271a(this.zzdtl, g, mo4215a() + g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbbu) || mo4215a() != ((zzbbu) obj).mo4215a()) {
            return false;
        }
        if (mo4215a() == 0) {
            return true;
        }
        if (!(obj instanceof zzbcd)) {
            return obj.equals(this);
        }
        zzbcd zzbcd = (zzbcd) obj;
        int f = m10277f();
        int f2 = zzbcd.m10277f();
        if (f == 0 || f2 == 0 || f == f2) {
            return mo4221a(zzbcd, 0, mo4215a());
        }
        return false;
    }

    /* renamed from: a */
    final boolean mo4221a(zzbbu zzbbu, int i, int i2) {
        StringBuilder stringBuilder;
        if (i2 > zzbbu.mo4215a()) {
            i = mo4215a();
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i2);
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 > zzbbu.mo4215a()) {
            zzbbu = zzbbu.mo4215a();
            stringBuilder = new StringBuilder(59);
            stringBuilder.append("Ran off end of other: 0, ");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(zzbbu);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if ((zzbbu instanceof zzbcd) == 0) {
            return zzbbu.mo4217a(0, i2).equals(mo4217a(0, i2));
        } else {
            zzbcd zzbcd = (zzbcd) zzbbu;
            i = this.zzdtl;
            byte[] bArr = zzbcd.zzdtl;
            int g = mo4799g() + i2;
            i2 = mo4799g();
            zzbbu = zzbcd.mo4799g();
            while (i2 < g) {
                if (i[i2] != bArr[zzbbu]) {
                    return false;
                }
                i2++;
                zzbbu++;
            }
            return true;
        }
    }

    /* renamed from: a */
    protected final int mo4216a(int i, int i2, int i3) {
        return zzbdf.m10325a(i, this.zzdtl, mo4799g(), i3);
    }

    /* renamed from: e */
    public final zzbcf mo4223e() {
        return zzbcf.m10281a(this.zzdtl, mo4799g(), mo4215a(), true);
    }
}
