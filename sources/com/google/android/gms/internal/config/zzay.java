package com.google.android.gms.internal.config;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public final class zzay {
    /* renamed from: a */
    private final byte[] f9937a;
    /* renamed from: b */
    private final int f9938b;
    /* renamed from: c */
    private final int f9939c;
    /* renamed from: d */
    private int f9940d;
    /* renamed from: e */
    private int f9941e;
    /* renamed from: f */
    private int f9942f;
    /* renamed from: g */
    private int f9943g;
    /* renamed from: h */
    private int f9944h = BaseClientBuilder.API_PRIORITY_OTHER;
    /* renamed from: i */
    private int f9945i;
    /* renamed from: j */
    private int f9946j = 64;
    /* renamed from: k */
    private int f9947k = 67108864;

    private zzay(byte[] bArr, int i, int i2) {
        this.f9937a = bArr;
        this.f9938b = 0;
        i2 += 0;
        this.f9940d = i2;
        this.f9939c = i2;
        this.f9942f = 0;
    }

    /* renamed from: a */
    public static zzay m11363a(byte[] bArr, int i, int i2) {
        return new zzay(bArr, 0, i2);
    }

    /* renamed from: b */
    private final void m11364b(int i) {
        if (this.f9943g != i) {
            throw new zzbg("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: c */
    private final void m11365c(int i) {
        if (i < 0) {
            throw zzbg.m11414b();
        } else if (this.f9942f + i > this.f9944h) {
            m11365c(this.f9944h - this.f9942f);
            throw zzbg.m11413a();
        } else if (i <= this.f9940d - this.f9942f) {
            this.f9942f += i;
        } else {
            throw zzbg.m11413a();
        }
    }

    /* renamed from: g */
    private final void m11366g() {
        this.f9940d += this.f9941e;
        int i = this.f9940d;
        if (i > this.f9944h) {
            this.f9941e = i - this.f9944h;
            this.f9940d -= this.f9941e;
            return;
        }
        this.f9941e = 0;
    }

    /* renamed from: h */
    private final byte m11367h() {
        if (this.f9942f != this.f9940d) {
            byte[] bArr = this.f9937a;
            int i = this.f9942f;
            this.f9942f = i + 1;
            return bArr[i];
        }
        throw zzbg.m11413a();
    }

    /* renamed from: a */
    public final int m11368a() {
        if (this.f9942f == this.f9940d) {
            this.f9943g = 0;
            return 0;
        }
        this.f9943g = m11375d();
        if (this.f9943g != 0) {
            return this.f9943g;
        }
        throw new zzbg("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void m11369a(zzbh zzbh) {
        int d = m11375d();
        if (this.f9945i >= this.f9946j) {
            throw new zzbg("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (d >= 0) {
            d += this.f9942f;
            int i = this.f9944h;
            if (d <= i) {
                this.f9944h = d;
                m11366g();
                this.f9945i++;
                zzbh.mo4333a(this);
                m11364b(0);
                this.f9945i--;
                this.f9944h = i;
                m11366g();
                return;
            }
            throw zzbg.m11413a();
        } else {
            throw zzbg.m11414b();
        }
    }

    /* renamed from: a */
    public final boolean m11370a(int i) {
        switch (i & 7) {
            case 0:
                m11375d();
                return true;
            case 1:
                m11376e();
                return true;
            case 2:
                m11365c(m11375d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m11367h();
                m11367h();
                m11367h();
                m11367h();
                return true;
            default:
                throw new zzbg("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m11368a();
            if (a != 0) {
            }
            m11364b(((i >>> 3) << 3) | 4);
            return true;
        } while (m11370a(a));
        m11364b(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: a */
    public final byte[] m11371a(int i, int i2) {
        if (i2 == 0) {
            return zzbk.f9961b;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f9937a, this.f9938b + i, obj, 0, i2);
        return obj;
    }

    /* renamed from: b */
    public final String m11372b() {
        int d = m11375d();
        if (d < 0) {
            throw zzbg.m11414b();
        } else if (d <= this.f9940d - this.f9942f) {
            String str = new String(this.f9937a, this.f9942f, d, zzbf.f9956a);
            this.f9942f += d;
            return str;
        } else {
            throw zzbg.m11413a();
        }
    }

    /* renamed from: b */
    final void m11373b(int i, int i2) {
        if (i > this.f9942f - this.f9938b) {
            int i3 = this.f9942f - this.f9938b;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.f9942f = this.f9938b + i;
            this.f9943g = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: c */
    public final byte[] m11374c() {
        int d = m11375d();
        if (d < 0) {
            throw zzbg.m11414b();
        } else if (d == 0) {
            return zzbk.f9961b;
        } else {
            if (d <= this.f9940d - this.f9942f) {
                Object obj = new byte[d];
                System.arraycopy(this.f9937a, this.f9942f, obj, 0, d);
                this.f9942f += d;
                return obj;
            }
            throw zzbg.m11413a();
        }
    }

    /* renamed from: d */
    public final int m11375d() {
        byte h = m11367h();
        if (h >= (byte) 0) {
            return h;
        }
        int i;
        int i2 = h & 127;
        byte h2 = m11367h();
        if (h2 >= (byte) 0) {
            i = h2 << 7;
        } else {
            i2 |= (h2 & 127) << 7;
            h2 = m11367h();
            if (h2 >= (byte) 0) {
                i = h2 << 14;
            } else {
                i2 |= (h2 & 127) << 14;
                h2 = m11367h();
                if (h2 >= (byte) 0) {
                    i = h2 << 21;
                } else {
                    i2 |= (h2 & 127) << 21;
                    h2 = m11367h();
                    i2 |= h2 << 28;
                    if (h2 < (byte) 0) {
                        for (i = 0; i < 5; i++) {
                            if (m11367h() >= (byte) 0) {
                                return i2;
                            }
                        }
                        throw new zzbg("CodedInputStream encountered a malformed varint.");
                    }
                    return i2;
                }
            }
        }
        i2 |= i;
        return i2;
    }

    /* renamed from: e */
    public final long m11376e() {
        byte h = m11367h();
        byte h2 = m11367h();
        return ((((((((((long) h2) & 255) << 8) | (((long) h) & 255)) | ((((long) m11367h()) & 255) << 16)) | ((((long) m11367h()) & 255) << 24)) | ((((long) m11367h()) & 255) << 32)) | ((((long) m11367h()) & 255) << 40)) | ((((long) m11367h()) & 255) << 48)) | ((((long) m11367h()) & 255) << 56);
    }

    /* renamed from: f */
    public final int m11377f() {
        return this.f9942f - this.f9938b;
    }
}
