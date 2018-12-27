package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;

public final class zzyx {
    /* renamed from: a */
    private final byte[] f10337a;
    /* renamed from: b */
    private final int f10338b;
    /* renamed from: c */
    private final int f10339c;
    /* renamed from: d */
    private int f10340d;
    /* renamed from: e */
    private int f10341e;
    /* renamed from: f */
    private int f10342f;
    /* renamed from: g */
    private int f10343g;
    /* renamed from: h */
    private int f10344h = BaseClientBuilder.API_PRIORITY_OTHER;
    /* renamed from: i */
    private int f10345i;
    /* renamed from: j */
    private int f10346j = 64;
    /* renamed from: k */
    private int f10347k = 67108864;
    /* renamed from: l */
    private zzuo f10348l;

    /* renamed from: a */
    public static zzyx m12124a(byte[] bArr) {
        return m12125a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static zzyx m12125a(byte[] bArr, int i, int i2) {
        return new zzyx(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int m12129a() {
        if (this.f10342f == this.f10340d) {
            this.f10343g = 0;
            return 0;
        }
        this.f10343g = m12140d();
        if (this.f10343g != 0) {
            return this.f10343g;
        }
        throw new zzzf("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void m12131a(int i) {
        if (this.f10343g != i) {
            throw new zzzf("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final boolean m12137b(int i) {
        switch (i & 7) {
            case 0:
                m12140d();
                return true;
            case 1:
                m12145g();
                return true;
            case 2:
                m12126f(m12140d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m12144f();
                return true;
            default:
                throw new zzzf("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m12129a();
            if (a != 0) {
            }
            m12131a(((i >>> 3) << 3) | 4);
            return true;
        } while (m12137b(a));
        m12131a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final boolean m12136b() {
        return m12140d() != 0;
    }

    /* renamed from: c */
    public final String m12139c() {
        int d = m12140d();
        if (d < 0) {
            throw zzzf.m12195b();
        } else if (d <= this.f10340d - this.f10342f) {
            String str = new String(this.f10337a, this.f10342f, d, zzze.f10361a);
            this.f10342f += d;
            return str;
        } else {
            throw zzzf.m12194a();
        }
    }

    /* renamed from: a */
    public final void m12133a(zzzg zzzg, int i) {
        if (this.f10345i < this.f10346j) {
            this.f10345i++;
            zzzg.mo4347a(this);
            m12131a((i << 3) | 4);
            this.f10345i--;
            return;
        }
        throw zzzf.m12197d();
    }

    /* renamed from: a */
    public final void m12132a(zzzg zzzg) {
        int d = m12140d();
        if (this.f10345i < this.f10346j) {
            d = m12138c(d);
            this.f10345i++;
            zzzg.mo4347a(this);
            m12131a((int) null);
            this.f10345i--;
            m12141d(d);
            return;
        }
        throw zzzf.m12197d();
    }

    /* renamed from: d */
    public final int m12140d() {
        byte k = m12128k();
        if (k >= (byte) 0) {
            return k;
        }
        int i = k & 127;
        byte k2 = m12128k();
        if (k2 >= (byte) 0) {
            i |= k2 << 7;
        } else {
            i |= (k2 & 127) << 7;
            k2 = m12128k();
            if (k2 >= (byte) 0) {
                i |= k2 << 14;
            } else {
                i |= (k2 & 127) << 14;
                k2 = m12128k();
                if (k2 >= (byte) 0) {
                    i |= k2 << 21;
                } else {
                    i |= (k2 & 127) << 21;
                    k2 = m12128k();
                    i |= k2 << 28;
                    if (k2 < (byte) 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (m12128k() >= (byte) 0) {
                                return i;
                            }
                        }
                        throw zzzf.m12196c();
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final long m12142e() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte k = m12128k();
            j |= ((long) (k & 127)) << i;
            if ((k & 128) == 0) {
                return j;
            }
        }
        throw zzzf.m12196c();
    }

    /* renamed from: f */
    public final int m12144f() {
        return (((m12128k() & 255) | ((m12128k() & 255) << 8)) | ((m12128k() & 255) << 16)) | ((m12128k() & 255) << 24);
    }

    /* renamed from: g */
    public final long m12145g() {
        byte k = m12128k();
        byte k2 = m12128k();
        return ((((((((((long) k2) & 255) << 8) | (((long) k) & 255)) | ((((long) m12128k()) & 255) << 16)) | ((((long) m12128k()) & 255) << 24)) | ((((long) m12128k()) & 255) << 32)) | ((((long) m12128k()) & 255) << 40)) | ((((long) m12128k()) & 255) << 48)) | ((((long) m12128k()) & 255) << 56);
    }

    private zzyx(byte[] bArr, int i, int i2) {
        this.f10337a = bArr;
        this.f10338b = i;
        i2 += i;
        this.f10340d = i2;
        this.f10339c = i2;
        this.f10342f = i;
    }

    /* renamed from: a */
    public final <T extends zzvm<T, ?>> T m12130a(zzxd<T> zzxd) {
        try {
            if (this.f10348l == null) {
                this.f10348l = zzuo.m12022a(this.f10337a, this.f10338b, this.f10339c);
            }
            int u = this.f10348l.mo2953u();
            int i = this.f10342f - this.f10338b;
            if (u <= i) {
                this.f10348l.mo2938f(i - u);
                this.f10348l.m12030c(this.f10346j - this.f10345i);
                zzvm zzvm = (zzvm) this.f10348l.mo2928a(zzxd, zzuz.m12053b());
                m12137b(this.f10343g);
                return zzvm;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
        } catch (zzxd<T> zzxd2) {
            throw new zzzf("", zzxd2);
        }
    }

    /* renamed from: c */
    public final int m12138c(int i) {
        if (i >= 0) {
            i += this.f10342f;
            int i2 = this.f10344h;
            if (i <= i2) {
                this.f10344h = i;
                m12127j();
                return i2;
            }
            throw zzzf.m12194a();
        }
        throw zzzf.m12195b();
    }

    /* renamed from: j */
    private final void m12127j() {
        this.f10340d += this.f10341e;
        int i = this.f10340d;
        if (i > this.f10344h) {
            this.f10341e = i - this.f10344h;
            this.f10340d -= this.f10341e;
            return;
        }
        this.f10341e = 0;
    }

    /* renamed from: d */
    public final void m12141d(int i) {
        this.f10344h = i;
        m12127j();
    }

    /* renamed from: h */
    public final int m12146h() {
        if (this.f10344h == BaseClientBuilder.API_PRIORITY_OTHER) {
            return -1;
        }
        return this.f10344h - this.f10342f;
    }

    /* renamed from: i */
    public final int m12147i() {
        return this.f10342f - this.f10338b;
    }

    /* renamed from: a */
    public final byte[] m12134a(int i, int i2) {
        if (i2 == 0) {
            return zzzj.f10368d;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f10337a, this.f10338b + i, obj, 0, i2);
        return obj;
    }

    /* renamed from: e */
    public final void m12143e(int i) {
        m12135b(i, this.f10343g);
    }

    /* renamed from: b */
    final void m12135b(int i, int i2) {
        if (i > this.f10342f - this.f10338b) {
            int i3 = this.f10342f - this.f10338b;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.f10342f = this.f10338b + i;
            this.f10343g = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: k */
    private final byte m12128k() {
        if (this.f10342f != this.f10340d) {
            byte[] bArr = this.f10337a;
            int i = this.f10342f;
            this.f10342f = i + 1;
            return bArr[i];
        }
        throw zzzf.m12194a();
    }

    /* renamed from: f */
    private final void m12126f(int i) {
        if (i < 0) {
            throw zzzf.m12195b();
        } else if (this.f10342f + i > this.f10344h) {
            m12126f(this.f10344h - this.f10342f);
            throw zzzf.m12194a();
        } else if (i <= this.f10340d - this.f10342f) {
            this.f10342f += i;
        } else {
            throw zzzf.m12194a();
        }
    }
}
