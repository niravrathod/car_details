package com.google.android.gms.internal.firebase_abt;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public final class zza {
    /* renamed from: a */
    private final byte[] f9994a;
    /* renamed from: b */
    private final int f9995b;
    /* renamed from: c */
    private final int f9996c;
    /* renamed from: d */
    private int f9997d;
    /* renamed from: e */
    private int f9998e;
    /* renamed from: f */
    private int f9999f;
    /* renamed from: g */
    private int f10000g;
    /* renamed from: h */
    private int f10001h = BaseClientBuilder.API_PRIORITY_OTHER;
    /* renamed from: i */
    private int f10002i;
    /* renamed from: j */
    private int f10003j = 64;
    /* renamed from: k */
    private int f10004k = 67108864;

    private zza(byte[] bArr, int i, int i2) {
        this.f9994a = bArr;
        this.f9995b = i;
        i2 += i;
        this.f9997d = i2;
        this.f9996c = i2;
        this.f9999f = i;
    }

    /* renamed from: a */
    public static zza m11453a(byte[] bArr, int i, int i2) {
        return new zza(bArr, 0, i2);
    }

    /* renamed from: c */
    private final void m11454c(int i) {
        if (i < 0) {
            throw zzi.m11479b();
        } else if (this.f9999f + i > this.f10001h) {
            m11454c(this.f10001h - this.f9999f);
            throw zzi.m11478a();
        } else if (i <= this.f9997d - this.f9999f) {
            this.f9999f += i;
        } else {
            throw zzi.m11478a();
        }
    }

    /* renamed from: g */
    private final void m11455g() {
        this.f9997d += this.f9998e;
        int i = this.f9997d;
        if (i > this.f10001h) {
            this.f9998e = i - this.f10001h;
            this.f9997d -= this.f9998e;
            return;
        }
        this.f9998e = 0;
    }

    /* renamed from: h */
    private final byte m11456h() {
        if (this.f9999f != this.f9997d) {
            byte[] bArr = this.f9994a;
            int i = this.f9999f;
            this.f9999f = i + 1;
            return bArr[i];
        }
        throw zzi.m11478a();
    }

    /* renamed from: a */
    public final int m11457a() {
        if (this.f9999f == this.f9997d) {
            this.f10000g = 0;
            return 0;
        }
        this.f10000g = m11466e();
        if (this.f10000g != 0) {
            return this.f10000g;
        }
        throw new zzi("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void m11458a(int i) {
        if (this.f10000g != i) {
            throw new zzi("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final void m11459a(zzj zzj) {
        int e = m11466e();
        if (this.f10002i >= this.f10003j) {
            throw new zzi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (e >= 0) {
            e += this.f9999f;
            int i = this.f10001h;
            if (e <= i) {
                this.f10001h = e;
                m11455g();
                this.f10002i++;
                zzj.mo4338a(this);
                m11458a(0);
                this.f10002i--;
                this.f10001h = i;
                m11455g();
                return;
            }
            throw zzi.m11478a();
        } else {
            throw zzi.m11479b();
        }
    }

    /* renamed from: a */
    public final byte[] m11460a(int i, int i2) {
        if (i2 == 0) {
            return zzm.f10016a;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f9994a, this.f9995b + i, obj, 0, i2);
        return obj;
    }

    /* renamed from: b */
    public final long m11461b() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte h = m11456h();
            j |= ((long) (h & 127)) << i;
            if ((h & 128) == 0) {
                return j;
            }
        }
        throw zzi.m11480c();
    }

    /* renamed from: b */
    final void m11462b(int i, int i2) {
        if (i > this.f9999f - this.f9995b) {
            int i3 = this.f9999f - this.f9995b;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.f9999f = this.f9995b + i;
            this.f10000g = 106;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: b */
    public final boolean m11463b(int i) {
        switch (i & 7) {
            case 0:
                m11466e();
                return true;
            case 1:
                m11456h();
                m11456h();
                m11456h();
                m11456h();
                m11456h();
                m11456h();
                m11456h();
                m11456h();
                return true;
            case 2:
                m11454c(m11466e());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m11456h();
                m11456h();
                m11456h();
                m11456h();
                return true;
            default:
                throw new zzi("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m11457a();
            if (a != 0) {
            }
            m11458a(((i >>> 3) << 3) | 4);
            return true;
        } while (m11463b(a));
        m11458a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final int m11464c() {
        return m11466e();
    }

    /* renamed from: d */
    public final String m11465d() {
        int e = m11466e();
        if (e < 0) {
            throw zzi.m11479b();
        } else if (e <= this.f9997d - this.f9999f) {
            String str = new String(this.f9994a, this.f9999f, e, zzh.f10012a);
            this.f9999f += e;
            return str;
        } else {
            throw zzi.m11478a();
        }
    }

    /* renamed from: e */
    public final int m11466e() {
        byte h = m11456h();
        if (h >= (byte) 0) {
            return h;
        }
        int i;
        int i2 = h & 127;
        byte h2 = m11456h();
        if (h2 >= (byte) 0) {
            i = h2 << 7;
        } else {
            i2 |= (h2 & 127) << 7;
            h2 = m11456h();
            if (h2 >= (byte) 0) {
                i = h2 << 14;
            } else {
                i2 |= (h2 & 127) << 14;
                h2 = m11456h();
                if (h2 >= (byte) 0) {
                    i = h2 << 21;
                } else {
                    i2 |= (h2 & 127) << 21;
                    h2 = m11456h();
                    i2 |= h2 << 28;
                    if (h2 < (byte) 0) {
                        for (i = 0; i < 5; i++) {
                            if (m11456h() >= (byte) 0) {
                                return i2;
                            }
                        }
                        throw zzi.m11480c();
                    }
                    return i2;
                }
            }
        }
        i2 |= i;
        return i2;
    }

    /* renamed from: f */
    public final int m11467f() {
        return this.f9999f - this.f9995b;
    }
}
