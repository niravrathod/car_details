package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;

public final class zzbgq {
    /* renamed from: a */
    private final byte[] f9236a;
    /* renamed from: b */
    private final int f9237b;
    /* renamed from: c */
    private final int f9238c;
    /* renamed from: d */
    private int f9239d;
    /* renamed from: e */
    private int f9240e;
    /* renamed from: f */
    private int f9241f;
    /* renamed from: g */
    private int f9242g;
    /* renamed from: h */
    private int f9243h = BaseClientBuilder.API_PRIORITY_OTHER;
    /* renamed from: i */
    private int f9244i;
    /* renamed from: j */
    private int f9245j = 64;
    /* renamed from: k */
    private int f9246k = 67108864;
    /* renamed from: l */
    private zzbcf f9247l;

    /* renamed from: a */
    public static zzbgq m10385a(byte[] bArr, int i, int i2) {
        return new zzbgq(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int m10389a() {
        if (this.f9241f == this.f9239d) {
            this.f9242g = 0;
            return 0;
        }
        this.f9242g = m10404g();
        if (this.f9242g != 0) {
            return this.f9242g;
        }
        throw new zzbgy("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void m10391a(int i) {
        if (this.f9242g != i) {
            throw new zzbgy("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final boolean m10396b(int i) {
        switch (i & 7) {
            case 0:
                m10404g();
                return true;
            case 1:
                m10388l();
                m10388l();
                m10388l();
                m10388l();
                m10388l();
                m10388l();
                m10388l();
                m10388l();
                return true;
            case 2:
                m10386f(m10404g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m10388l();
                m10388l();
                m10388l();
                m10388l();
                return true;
            default:
                throw new zzbgy("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m10389a();
            if (a != 0) {
            }
            m10391a(((i >>> 3) << 3) | 4);
            return true;
        } while (m10396b(a));
        m10391a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final long m10394b() {
        return m10405h();
    }

    /* renamed from: c */
    public final int m10397c() {
        return m10404g();
    }

    /* renamed from: d */
    public final boolean m10400d() {
        return m10404g() != 0;
    }

    /* renamed from: e */
    public final String m10401e() {
        int g = m10404g();
        if (g < 0) {
            throw zzbgy.m10446b();
        } else if (g <= this.f9239d - this.f9241f) {
            String str = new String(this.f9236a, this.f9241f, g, zzbgx.f9257a);
            this.f9241f += g;
            return str;
        } else {
            throw zzbgy.m10445a();
        }
    }

    /* renamed from: a */
    public final void m10392a(zzbgz zzbgz) {
        int g = m10404g();
        if (this.f9244i < this.f9245j) {
            g = m10398c(g);
            this.f9244i++;
            zzbgz.mo4209a(this);
            m10391a((int) null);
            this.f9244i--;
            m10399d(g);
            return;
        }
        throw new zzbgy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: f */
    public final byte[] m10403f() {
        int g = m10404g();
        if (g < 0) {
            throw zzbgy.m10446b();
        } else if (g == 0) {
            return zzbhc.f9264e;
        } else {
            if (g <= this.f9239d - this.f9241f) {
                Object obj = new byte[g];
                System.arraycopy(this.f9236a, this.f9241f, obj, 0, g);
                this.f9241f += g;
                return obj;
            }
            throw zzbgy.m10445a();
        }
    }

    /* renamed from: g */
    public final int m10404g() {
        byte l = m10388l();
        if (l >= (byte) 0) {
            return l;
        }
        int i = l & 127;
        byte l2 = m10388l();
        if (l2 >= (byte) 0) {
            i |= l2 << 7;
        } else {
            i |= (l2 & 127) << 7;
            l2 = m10388l();
            if (l2 >= (byte) 0) {
                i |= l2 << 14;
            } else {
                i |= (l2 & 127) << 14;
                l2 = m10388l();
                if (l2 >= (byte) 0) {
                    i |= l2 << 21;
                } else {
                    i |= (l2 & 127) << 21;
                    l2 = m10388l();
                    i |= l2 << 28;
                    if (l2 < (byte) 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (m10388l() >= (byte) 0) {
                                return i;
                            }
                        }
                        throw zzbgy.m10447c();
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: h */
    public final long m10405h() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = m10388l();
            j |= ((long) (l & 127)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw zzbgy.m10447c();
    }

    private zzbgq(byte[] bArr, int i, int i2) {
        this.f9236a = bArr;
        this.f9237b = i;
        i2 += i;
        this.f9239d = i2;
        this.f9238c = i2;
        this.f9241f = i;
    }

    /* renamed from: a */
    public final <T extends zzbdd<T, ?>> T m10390a(zzbew<T> zzbew) {
        try {
            if (this.f9247l == null) {
                this.f9247l = zzbcf.m10280a(this.f9236a, this.f9237b, this.f9238c);
            }
            int u = this.f9247l.mo1999u();
            int i = this.f9241f - this.f9237b;
            if (u <= i) {
                this.f9247l.mo1984f(i - u);
                this.f9247l.m10289c(this.f9245j - this.f9244i);
                zzbdd zzbdd = (zzbdd) this.f9247l.mo1974a(zzbew, zzbcq.m10312b());
                m10396b(this.f9242g);
                return zzbdd;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
        } catch (zzbew<T> zzbew2) {
            throw new zzbgy("", zzbew2);
        }
    }

    /* renamed from: c */
    public final int m10398c(int i) {
        if (i >= 0) {
            i += this.f9241f;
            int i2 = this.f9243h;
            if (i <= i2) {
                this.f9243h = i;
                m10387k();
                return i2;
            }
            throw zzbgy.m10445a();
        }
        throw zzbgy.m10446b();
    }

    /* renamed from: k */
    private final void m10387k() {
        this.f9239d += this.f9240e;
        int i = this.f9239d;
        if (i > this.f9243h) {
            this.f9240e = i - this.f9243h;
            this.f9239d -= this.f9240e;
            return;
        }
        this.f9240e = 0;
    }

    /* renamed from: d */
    public final void m10399d(int i) {
        this.f9243h = i;
        m10387k();
    }

    /* renamed from: i */
    public final int m10406i() {
        if (this.f9243h == BaseClientBuilder.API_PRIORITY_OTHER) {
            return -1;
        }
        return this.f9243h - this.f9241f;
    }

    /* renamed from: j */
    public final int m10407j() {
        return this.f9241f - this.f9237b;
    }

    /* renamed from: a */
    public final byte[] m10393a(int i, int i2) {
        if (i2 == 0) {
            return zzbhc.f9264e;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f9236a, this.f9237b + i, obj, 0, i2);
        return obj;
    }

    /* renamed from: e */
    public final void m10402e(int i) {
        m10395b(i, this.f9242g);
    }

    /* renamed from: b */
    final void m10395b(int i, int i2) {
        if (i > this.f9241f - this.f9237b) {
            int i3 = this.f9241f - this.f9237b;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.f9241f = this.f9237b + i;
            this.f9242g = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: l */
    private final byte m10388l() {
        if (this.f9241f != this.f9239d) {
            byte[] bArr = this.f9236a;
            int i = this.f9241f;
            this.f9241f = i + 1;
            return bArr[i];
        }
        throw zzbgy.m10445a();
    }

    /* renamed from: f */
    private final void m10386f(int i) {
        if (i < 0) {
            throw zzbgy.m10446b();
        } else if (this.f9241f + i > this.f9243h) {
            m10386f(this.f9243h - this.f9241f);
            throw zzbgy.m10445a();
        } else if (i <= this.f9239d - this.f9241f) {
            this.f9241f += i;
        } else {
            throw zzbgy.m10445a();
        }
    }
}
