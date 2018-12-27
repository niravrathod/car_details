package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;

final class bb extends zzuo {
    /* renamed from: d */
    private final byte[] f17428d;
    /* renamed from: e */
    private final boolean f17429e;
    /* renamed from: f */
    private int f17430f;
    /* renamed from: g */
    private int f17431g;
    /* renamed from: h */
    private int f17432h;
    /* renamed from: i */
    private int f17433i;
    /* renamed from: j */
    private int f17434j;
    /* renamed from: k */
    private int f17435k;

    private bb(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f17435k = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f17428d = bArr;
        this.f17430f = i2 + i;
        this.f17432h = i;
        this.f17433i = this.f17432h;
        this.f17429e = z;
    }

    /* renamed from: a */
    public final int mo2927a() {
        if (mo2952t()) {
            this.f17434j = 0;
            return 0;
        }
        this.f17434j = m22180v();
        if ((this.f17434j >>> 3) != 0) {
            return this.f17434j;
        }
        throw new zzvt("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo2929a(int i) {
        if (this.f17434j != i) {
            throw zzvt.m12084d();
        }
    }

    /* renamed from: b */
    public final boolean mo2931b(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f17430f - this.f17432h >= 10) {
                    while (i2 < 10) {
                        i = this.f17428d;
                        int i3 = this.f17432h;
                        this.f17432h = i3 + 1;
                        if (i[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzvt.m12083c();
                }
                while (i2 < 10) {
                    if (m22179A() < 0) {
                        i2++;
                    }
                }
                throw zzvt.m12083c();
                return true;
            case 1:
                mo2938f(8);
                return true;
            case 2:
                mo2938f(m22180v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo2938f(4);
                return true;
            default:
                throw zzvt.m12085e();
        }
        int a;
        do {
            a = mo2927a();
            if (a != 0) {
            }
            mo2929a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo2931b(a));
        mo2929a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo2930b() {
        return Double.longBitsToDouble(m22183y());
    }

    /* renamed from: c */
    public final float mo2932c() {
        return Float.intBitsToFloat(m22182x());
    }

    /* renamed from: d */
    public final long mo2934d() {
        return m22181w();
    }

    /* renamed from: e */
    public final long mo2935e() {
        return m22181w();
    }

    /* renamed from: f */
    public final int mo2937f() {
        return m22180v();
    }

    /* renamed from: g */
    public final long mo2939g() {
        return m22183y();
    }

    /* renamed from: h */
    public final int mo2940h() {
        return m22182x();
    }

    /* renamed from: i */
    public final boolean mo2941i() {
        return m22181w() != 0;
    }

    /* renamed from: j */
    public final String mo2942j() {
        int v = m22180v();
        if (v > 0 && v <= this.f17430f - this.f17432h) {
            String str = new String(this.f17428d, this.f17432h, v, zzvo.f10281a);
            this.f17432h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzvt.m12082b();
            }
            throw zzvt.m12081a();
        }
    }

    /* renamed from: k */
    public final String mo2943k() {
        int v = m22180v();
        if (v > 0 && v <= this.f17430f - this.f17432h) {
            String b = dr.m11796b(this.f17428d, this.f17432h, v);
            this.f17432h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw zzvt.m12082b();
            }
            throw zzvt.m12081a();
        }
    }

    /* renamed from: a */
    public final <T extends zzwt> T mo2928a(zzxd<T> zzxd, zzuz zzuz) {
        int v = m22180v();
        if (this.a < this.b) {
            v = mo2933d(v);
            this.a++;
            zzwt zzwt = (zzwt) zzxd.mo4387a(this, zzuz);
            mo2929a(null);
            this.a--;
            mo2936e(v);
            return zzwt;
        }
        throw zzvt.m12086f();
    }

    /* renamed from: l */
    public final zzud mo2944l() {
        int v = m22180v();
        if (v > 0 && v <= this.f17430f - this.f17432h) {
            zzud a = zzud.m12008a(this.f17428d, this.f17432h, v);
            this.f17432h += v;
            return a;
        } else if (v == 0) {
            return zzud.f10195a;
        } else {
            byte[] copyOfRange;
            if (v > 0 && v <= this.f17430f - this.f17432h) {
                int i = this.f17432h;
                this.f17432h += v;
                copyOfRange = Arrays.copyOfRange(this.f17428d, i, this.f17432h);
            } else if (v > 0) {
                throw zzvt.m12081a();
            } else if (v == 0) {
                copyOfRange = zzvo.f10282b;
            } else {
                throw zzvt.m12082b();
            }
            return zzud.m12007a(copyOfRange);
        }
    }

    /* renamed from: m */
    public final int mo2945m() {
        return m22180v();
    }

    /* renamed from: n */
    public final int mo2946n() {
        return m22180v();
    }

    /* renamed from: o */
    public final int mo2947o() {
        return m22182x();
    }

    /* renamed from: p */
    public final long mo2948p() {
        return m22183y();
    }

    /* renamed from: q */
    public final int mo2949q() {
        int v = m22180v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* renamed from: r */
    public final long mo2950r() {
        long w = m22181w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: v */
    private final int m22180v() {
        /*
        r5 = this;
        r0 = r5.f17432h;
        r1 = r5.f17430f;
        if (r1 == r0) goto L_0x006d;
    L_0x0006:
        r1 = r5.f17428d;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f17432h = r2;
        return r0;
    L_0x0011:
        r3 = r5.f17430f;
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
        r5.f17432h = r3;
        return r0;
    L_0x006d:
        r0 = r5.mo2951s();
        r0 = (int) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bb.v():int");
    }

    /* renamed from: w */
    private final long m22181w() {
        int i = this.f17432h;
        if (this.f17430f != i) {
            byte[] bArr = this.f17428d;
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                this.f17432h = i2;
                return (long) b;
            } else if (this.f17430f - i2 >= 9) {
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
                        this.f17432h = i;
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
                        this.f17432h = i;
                        return j3;
                    }
                }
                j2 = j;
                i = i3;
                j3 = j2;
                this.f17432h = i;
                return j3;
            }
        }
        return mo2951s();
    }

    /* renamed from: s */
    final long mo2951s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m22179A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzvt.m12083c();
    }

    /* renamed from: x */
    private final int m22182x() {
        int i = this.f17432h;
        if (this.f17430f - i >= 4) {
            byte[] bArr = this.f17428d;
            this.f17432h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw zzvt.m12081a();
    }

    /* renamed from: y */
    private final long m22183y() {
        int i = this.f17432h;
        if (this.f17430f - i >= 8) {
            byte[] bArr = this.f17428d;
            this.f17432h = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
        }
        throw zzvt.m12081a();
    }

    /* renamed from: d */
    public final int mo2933d(int i) {
        if (i >= 0) {
            i += mo2953u();
            int i2 = this.f17435k;
            if (i <= i2) {
                this.f17435k = i;
                m22184z();
                return i2;
            }
            throw zzvt.m12081a();
        }
        throw zzvt.m12082b();
    }

    /* renamed from: z */
    private final void m22184z() {
        this.f17430f += this.f17431g;
        int i = this.f17430f - this.f17433i;
        if (i > this.f17435k) {
            this.f17431g = i - this.f17435k;
            this.f17430f -= this.f17431g;
            return;
        }
        this.f17431g = 0;
    }

    /* renamed from: e */
    public final void mo2936e(int i) {
        this.f17435k = i;
        m22184z();
    }

    /* renamed from: t */
    public final boolean mo2952t() {
        return this.f17432h == this.f17430f;
    }

    /* renamed from: u */
    public final int mo2953u() {
        return this.f17432h - this.f17433i;
    }

    /* renamed from: A */
    private final byte m22179A() {
        if (this.f17432h != this.f17430f) {
            byte[] bArr = this.f17428d;
            int i = this.f17432h;
            this.f17432h = i + 1;
            return bArr[i];
        }
        throw zzvt.m12081a();
    }

    /* renamed from: f */
    public final void mo2938f(int i) {
        if (i >= 0 && i <= this.f17430f - this.f17432h) {
            this.f17432h += i;
        } else if (i < 0) {
            throw zzvt.m12082b();
        } else {
            throw zzvt.m12081a();
        }
    }
}
