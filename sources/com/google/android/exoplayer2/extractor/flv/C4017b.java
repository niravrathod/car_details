package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.flv.b */
public final class C4017b implements C2259f, C2266m {
    /* renamed from: a */
    public static final C2262i f16153a = new C40161();
    /* renamed from: e */
    private static final int f16154e = C2186s.m8062e("FLV");
    /* renamed from: b */
    public int f16155b;
    /* renamed from: c */
    public int f16156c;
    /* renamed from: d */
    public long f16157d;
    /* renamed from: f */
    private final C2175k f16158f = new C2175k(4);
    /* renamed from: g */
    private final C2175k f16159g = new C2175k(9);
    /* renamed from: h */
    private final C2175k f16160h = new C2175k(11);
    /* renamed from: i */
    private final C2175k f16161i = new C2175k();
    /* renamed from: j */
    private C2261h f16162j;
    /* renamed from: k */
    private int f16163k = 1;
    /* renamed from: l */
    private int f16164l;
    /* renamed from: m */
    private C4015a f16165m;
    /* renamed from: n */
    private C4019d f16166n;
    /* renamed from: o */
    private C4018c f16167o;

    /* renamed from: com.google.android.exoplayer2.extractor.flv.b$1 */
    static class C40161 implements C2262i {
        C40161() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C4017b()};
        }
    }

    /* renamed from: a */
    public boolean mo1578a() {
        return false;
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        return 0;
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        boolean z = false;
        c2260g.mo1591c(this.f16158f.f6735a, 0, 3);
        this.f16158f.m7979c(0);
        if (this.f16158f.m7990k() != f16154e) {
            return false;
        }
        c2260g.mo1591c(this.f16158f.f6735a, 0, 2);
        this.f16158f.m7979c(0);
        if ((this.f16158f.m7987h() & 250) != 0) {
            return false;
        }
        c2260g.mo1591c(this.f16158f.f6735a, 0, 4);
        this.f16158f.m7979c(0);
        int n = this.f16158f.m7993n();
        c2260g.mo1583a();
        c2260g.mo1590c(n);
        c2260g.mo1591c(this.f16158f.f6735a, 0, 4);
        this.f16158f.m7979c(0);
        if (this.f16158f.m7993n() == null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f16162j = c2261h;
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f16163k = 1;
        this.f16164l = 0;
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        while (true) {
            switch (this.f16163k) {
                case 1:
                    if (m20096b(c2260g) != null) {
                        break;
                    }
                    return -1;
                case 2:
                    m20097c(c2260g);
                    break;
                case 3:
                    if (m20098d(c2260g) != null) {
                        break;
                    }
                    return -1;
                case 4:
                    if (m20099e(c2260g) == null) {
                        break;
                    }
                    return null;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    private boolean m20096b(C2260g c2260g) {
        boolean z = false;
        if (c2260g.mo1584a(this.f16159g.f6735a, 0, 9, true) == null) {
            return false;
        }
        this.f16159g.m7979c(0);
        this.f16159g.m7981d(4);
        c2260g = this.f16159g.m7986g();
        Object obj = (c2260g & 4) != 0 ? 1 : null;
        if ((c2260g & 1) != null) {
            z = true;
        }
        if (obj != null && this.f16165m == null) {
            this.f16165m = new C4015a(this.f16162j.mo4053a(8, 1));
        }
        if (z && this.f16166n == null) {
            this.f16166n = new C4019d(this.f16162j.mo4053a(9, 2));
        }
        if (this.f16167o == null) {
            this.f16167o = new C4018c(null);
        }
        this.f16162j.mo4054a();
        this.f16162j.mo4057a(this);
        this.f16164l = (this.f16159g.m7993n() - 9) + 4;
        this.f16163k = 2;
        return true;
    }

    /* renamed from: c */
    private void m20097c(C2260g c2260g) {
        c2260g.mo1586b(this.f16164l);
        this.f16164l = null;
        this.f16163k = 3;
    }

    /* renamed from: d */
    private boolean m20098d(C2260g c2260g) {
        if (c2260g.mo1584a(this.f16160h.f6735a, 0, 11, true) == null) {
            return false;
        }
        this.f16160h.m7979c(0);
        this.f16155b = this.f16160h.m7986g();
        this.f16156c = this.f16160h.m7990k();
        this.f16157d = (long) this.f16160h.m7990k();
        this.f16157d = (((long) (this.f16160h.m7986g() << 24)) | this.f16157d) * 1000;
        this.f16160h.m7981d(3);
        this.f16163k = 4;
        return true;
    }

    /* renamed from: e */
    private boolean m20099e(C2260g c2260g) {
        if (this.f16155b == 8 && this.f16165m != null) {
            this.f16165m.m8309b(m20100f(c2260g), this.f16157d);
        } else if (this.f16155b == 9 && this.f16166n != null) {
            this.f16166n.m8309b(m20100f(c2260g), this.f16157d);
        } else if (this.f16155b != 18 || this.f16167o == null) {
            c2260g.mo1586b(this.f16156c);
            c2260g = null;
            this.f16164l = 4;
            this.f16163k = 2;
            return c2260g;
        } else {
            this.f16167o.m8309b(m20100f(c2260g), this.f16157d);
        }
        c2260g = true;
        this.f16164l = 4;
        this.f16163k = 2;
        return c2260g;
    }

    /* renamed from: f */
    private C2175k m20100f(C2260g c2260g) {
        if (this.f16156c > this.f16161i.m7982e()) {
            this.f16161i.m7974a(new byte[Math.max(this.f16161i.m7982e() * 2, this.f16156c)], 0);
        } else {
            this.f16161i.m7979c(0);
        }
        this.f16161i.m7977b(this.f16156c);
        c2260g.mo1587b(this.f16161i.f6735a, 0, this.f16156c);
        return this.f16161i;
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f16167o.m20118a();
    }
}
