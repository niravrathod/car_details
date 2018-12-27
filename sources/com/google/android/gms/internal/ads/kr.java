package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;

final class kr extends zzbcf {
    /* renamed from: d */
    private final byte[] f16523d;
    /* renamed from: e */
    private final boolean f16524e;
    /* renamed from: f */
    private int f16525f;
    /* renamed from: g */
    private int f16526g;
    /* renamed from: h */
    private int f16527h;
    /* renamed from: i */
    private int f16528i;
    /* renamed from: j */
    private int f16529j;
    /* renamed from: k */
    private int f16530k;

    private kr(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f16530k = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f16523d = bArr;
        this.f16525f = i2 + i;
        this.f16527h = i;
        this.f16528i = this.f16527h;
        this.f16524e = z;
    }

    /* renamed from: a */
    public final int mo1973a() {
        if (mo1998t()) {
            this.f16529j = 0;
            return 0;
        }
        this.f16529j = m20600v();
        if ((this.f16529j >>> 3) != 0) {
            return this.f16529j;
        }
        throw zzbdl.m10343d();
    }

    /* renamed from: a */
    public final void mo1975a(int i) {
        if (this.f16529j != i) {
            throw zzbdl.m10344e();
        }
    }

    /* renamed from: b */
    public final boolean mo1977b(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f16525f - this.f16527h >= 10) {
                    while (i2 < 10) {
                        i = this.f16523d;
                        int i3 = this.f16527h;
                        this.f16527h = i3 + 1;
                        if (i[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzbdl.m10342c();
                }
                while (i2 < 10) {
                    if (m20599A() < 0) {
                        i2++;
                    }
                }
                throw zzbdl.m10342c();
                return true;
            case 1:
                mo1984f(8);
                return true;
            case 2:
                mo1984f(m20600v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo1984f(4);
                return true;
            default:
                throw zzbdl.m10345f();
        }
        int a;
        do {
            a = mo1973a();
            if (a != 0) {
            }
            mo1975a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo1977b(a));
        mo1975a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo1976b() {
        return Double.longBitsToDouble(m20603y());
    }

    /* renamed from: c */
    public final float mo1978c() {
        return Float.intBitsToFloat(m20602x());
    }

    /* renamed from: d */
    public final long mo1980d() {
        return m20601w();
    }

    /* renamed from: e */
    public final long mo1981e() {
        return m20601w();
    }

    /* renamed from: f */
    public final int mo1983f() {
        return m20600v();
    }

    /* renamed from: g */
    public final long mo1985g() {
        return m20603y();
    }

    /* renamed from: h */
    public final int mo1986h() {
        return m20602x();
    }

    /* renamed from: i */
    public final boolean mo1987i() {
        return m20601w() != 0;
    }

    /* renamed from: j */
    public final String mo1988j() {
        int v = m20600v();
        if (v > 0 && v <= this.f16525f - this.f16527h) {
            String str = new String(this.f16523d, this.f16527h, v, zzbdf.f9180a);
            this.f16527h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzbdl.m10341b();
            }
            throw zzbdl.m10340a();
        }
    }

    /* renamed from: k */
    public final String mo1989k() {
        int v = m20600v();
        if (v > 0 && v <= this.f16525f - this.f16527h) {
            String b = ni.m9275b(this.f16523d, this.f16527h, v);
            this.f16527h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw zzbdl.m10341b();
            }
            throw zzbdl.m10340a();
        }
    }

    /* renamed from: a */
    public final <T extends zzbel> T mo1974a(zzbew<T> zzbew, zzbcq zzbcq) {
        int v = m20600v();
        if (this.a < this.b) {
            v = mo1979d(v);
            this.a++;
            zzbel zzbel = (zzbel) zzbew.mo4253a(this, zzbcq);
            mo1975a((int) null);
            this.a--;
            mo1982e(v);
            return zzbel;
        }
        throw zzbdl.m10346g();
    }

    /* renamed from: l */
    public final zzbbu mo1990l() {
        int v = m20600v();
        if (v > 0 && v <= this.f16525f - this.f16527h) {
            zzbbu a = zzbbu.m10261a(this.f16523d, this.f16527h, v);
            this.f16527h += v;
            return a;
        } else if (v == 0) {
            return zzbbu.f9094a;
        } else {
            byte[] copyOfRange;
            if (v > 0 && v <= this.f16525f - this.f16527h) {
                int i = this.f16527h;
                this.f16527h += v;
                copyOfRange = Arrays.copyOfRange(this.f16523d, i, this.f16527h);
            } else if (v > 0) {
                throw zzbdl.m10340a();
            } else if (v == 0) {
                copyOfRange = zzbdf.f9181b;
            } else {
                throw zzbdl.m10341b();
            }
            return zzbbu.m10265b(copyOfRange);
        }
    }

    /* renamed from: m */
    public final int mo1991m() {
        return m20600v();
    }

    /* renamed from: n */
    public final int mo1992n() {
        return m20600v();
    }

    /* renamed from: o */
    public final int mo1993o() {
        return m20602x();
    }

    /* renamed from: p */
    public final long mo1994p() {
        return m20603y();
    }

    /* renamed from: q */
    public final int mo1995q() {
        return zzbcf.m10282g(m20600v());
    }

    /* renamed from: r */
    public final long mo1996r() {
        return zzbcf.m10279a(m20601w());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: v */
    private final int m20600v() {
        /*
        r5 = this;
        r0 = r5.f16527h;
        r1 = r5.f16525f;
        if (r1 == r0) goto L_0x006d;
    L_0x0006:
        r1 = r5.f16523d;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f16527h = r2;
        return r0;
    L_0x0011:
        r3 = r5.f16525f;
        r3 = r3 - r2;
        r4 = 9;
        if (r3 < r4) goto L_0x006d;
    L_0x0018:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0024;
    L_0x0021:
        r0 = r0 ^ -128;
        goto L_0x006a;
    L_0x0024:
        r2 = r3 + 1;
        r3 = r1[r3];
        r3 = r3 << 14;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x0031;
    L_0x002d:
        r0 = r0 ^ 16256;
    L_0x002f:
        r3 = r2;
        goto L_0x006a;
    L_0x0031:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x003f;
    L_0x003a:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        goto L_0x006a;
    L_0x003f:
        r2 = r3 + 1;
        r3 = r1[r3];
        r4 = r3 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r3 >= 0) goto L_0x002f;
    L_0x004c:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x0052:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0058:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x006a;
    L_0x005e:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x002f;
    L_0x0064:
        r3 = r2 + 1;
        r1 = r1[r2];
        if (r1 < 0) goto L_0x006d;
    L_0x006a:
        r5.f16527h = r3;
        return r0;
    L_0x006d:
        r0 = r5.mo1997s();
        r0 = (int) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kr.v():int");
    }

    /* renamed from: w */
    private final long m20601w() {
        int i = this.f16527h;
        if (this.f16525f != i) {
            byte[] bArr = this.f16523d;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.f16527h = i2;
                return (long) b;
            } else if (this.f16525f - i2 >= 9) {
                long j;
                long j2;
                long j3;
                int i3 = i2 + 1;
                i = b ^ (bArr[i2] << 7);
                if (i < 0) {
                    j = (long) (i ^ -128);
                } else {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 14;
                    if (i >= 0) {
                        j2 = (long) (i ^ 16256);
                        i = i2;
                        j3 = j2;
                        this.f16527h = i;
                        return j3;
                    }
                    i3 = i2 + 1;
                    i ^= bArr[i2] << 21;
                    if (i < 0) {
                        j = (long) (i ^ -2080896);
                    } else {
                        long j4 = (long) i;
                        i = i3 + 1;
                        j3 = (((long) bArr[i3]) << 28) ^ j4;
                        if (j3 >= 0) {
                            j3 ^= 266354560;
                        } else {
                            int i4 = i + 1;
                            j3 ^= ((long) bArr[i]) << 35;
                            if (j3 < 0) {
                                j = -34093383808L ^ j3;
                            } else {
                                i = i4 + 1;
                                j3 ^= ((long) bArr[i4]) << 42;
                                if (j3 >= 0) {
                                    j3 ^= 4363953127296L;
                                } else {
                                    i4 = i + 1;
                                    j3 ^= ((long) bArr[i]) << 49;
                                    if (j3 < 0) {
                                        j = -558586000294016L ^ j3;
                                    } else {
                                        i = i4 + 1;
                                        j3 = (j3 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                        if (j3 < 0) {
                                            i4 = i + 1;
                                            if (((long) bArr[i]) >= 0) {
                                                i = i4;
                                            }
                                        }
                                    }
                                }
                            }
                            j3 = j;
                            i = i4;
                        }
                        this.f16527h = i;
                        return j3;
                    }
                }
                j2 = j;
                i = i3;
                j3 = j2;
                this.f16527h = i;
                return j3;
            }
        }
        return mo1997s();
    }

    /* renamed from: s */
    final long mo1997s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m20599A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzbdl.m10342c();
    }

    /* renamed from: x */
    private final int m20602x() {
        int i = this.f16527h;
        if (this.f16525f - i >= 4) {
            byte[] bArr = this.f16523d;
            this.f16527h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw zzbdl.m10340a();
    }

    /* renamed from: y */
    private final long m20603y() {
        int i = this.f16527h;
        if (this.f16525f - i >= 8) {
            byte[] bArr = this.f16523d;
            this.f16527h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
        }
        throw zzbdl.m10340a();
    }

    /* renamed from: d */
    public final int mo1979d(int i) {
        if (i >= 0) {
            i += mo1999u();
            int i2 = this.f16530k;
            if (i <= i2) {
                this.f16530k = i;
                m20604z();
                return i2;
            }
            throw zzbdl.m10340a();
        }
        throw zzbdl.m10341b();
    }

    /* renamed from: z */
    private final void m20604z() {
        this.f16525f += this.f16526g;
        int i = this.f16525f - this.f16528i;
        if (i > this.f16530k) {
            this.f16526g = i - this.f16530k;
            this.f16525f -= this.f16526g;
            return;
        }
        this.f16526g = 0;
    }

    /* renamed from: e */
    public final void mo1982e(int i) {
        this.f16530k = i;
        m20604z();
    }

    /* renamed from: t */
    public final boolean mo1998t() {
        return this.f16527h == this.f16525f;
    }

    /* renamed from: u */
    public final int mo1999u() {
        return this.f16527h - this.f16528i;
    }

    /* renamed from: A */
    private final byte m20599A() {
        if (this.f16527h != this.f16525f) {
            byte[] bArr = this.f16523d;
            int i = this.f16527h;
            this.f16527h = i + 1;
            return bArr[i];
        }
        throw zzbdl.m10340a();
    }

    /* renamed from: f */
    public final void mo1984f(int i) {
        if (i >= 0 && i <= this.f16525f - this.f16527h) {
            this.f16527h += i;
        } else if (i < 0) {
            throw zzbdl.m10341b();
        } else {
            throw zzbdl.m10340a();
        }
    }
}
