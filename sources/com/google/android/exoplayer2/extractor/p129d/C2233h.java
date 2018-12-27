package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.d.h */
abstract class C2233h {
    /* renamed from: a */
    private C2228d f7040a;
    /* renamed from: b */
    private C2267n f7041b;
    /* renamed from: c */
    private C2261h f7042c;
    /* renamed from: d */
    private C2230f f7043d;
    /* renamed from: e */
    private long f7044e;
    /* renamed from: f */
    private long f7045f;
    /* renamed from: g */
    private long f7046g;
    /* renamed from: h */
    private int f7047h;
    /* renamed from: i */
    private int f7048i;
    /* renamed from: j */
    private C2232a f7049j;
    /* renamed from: k */
    private long f7050k;
    /* renamed from: l */
    private boolean f7051l;
    /* renamed from: m */
    private boolean f7052m;

    /* renamed from: com.google.android.exoplayer2.extractor.d.h$a */
    static class C2232a {
        /* renamed from: a */
        Format f7038a;
        /* renamed from: b */
        C2230f f7039b;

        C2232a() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.h$b */
    private static final class C3986b implements C2230f {
        /* renamed from: a */
        public long mo1597a(long j) {
            return 0;
        }

        /* renamed from: a */
        public long mo1598a(C2260g c2260g) {
            return -1;
        }

        private C3986b() {
        }

        /* renamed from: c */
        public C2266m mo1599c() {
            return new C4021a(-9223372036854775807L);
        }
    }

    /* renamed from: a */
    protected abstract boolean mo1601a(C2175k c2175k, long j, C2232a c2232a);

    /* renamed from: b */
    protected abstract long mo1602b(C2175k c2175k);

    C2233h() {
    }

    /* renamed from: a */
    void m8219a(C2261h c2261h, C2267n c2267n) {
        this.f7042c = c2261h;
        this.f7041b = c2267n;
        this.f7040a = new C2228d();
        mo1600a(true);
    }

    /* renamed from: a */
    protected void mo1600a(boolean z) {
        if (z) {
            this.f7049j = new C2232a();
            this.f7045f = 0;
            this.f7047h = false;
        } else {
            this.f7047h = true;
        }
        this.f7044e = -1;
        this.f7046g = 0;
    }

    /* renamed from: a */
    final void m8218a(long j, long j2) {
        this.f7040a.m8204a();
        if (j == 0) {
            mo1600a(this.f7051l ^ 1);
        } else if (this.f7047h != null) {
            this.f7044e = this.f7043d.mo1597a(j2);
            this.f7047h = 2;
        }
    }

    /* renamed from: a */
    final int m8216a(C2260g c2260g, C2265l c2265l) {
        switch (this.f7047h) {
            case 0:
                return m8214a(c2260g);
            case 1:
                c2260g.mo1586b((int) this.f7045f);
                this.f7047h = 2;
                return null;
            case 2:
                return m8215b(c2260g, c2265l);
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private int m8214a(C2260g c2260g) {
        boolean z = true;
        while (z) {
            if (this.f7040a.m8205a(c2260g)) {
                this.f7050k = c2260g.mo1589c() - this.f7045f;
                z = mo1601a(this.f7040a.m8207c(), this.f7045f, this.f7049j);
                if (z) {
                    this.f7045f = c2260g.mo1589c();
                }
            } else {
                this.f7047h = 3;
                return -1;
            }
        }
        this.f7048i = this.f7049j.f7038a.f6502s;
        if (!this.f7052m) {
            this.f7041b.mo1606a(this.f7049j.f7038a);
            this.f7052m = true;
        }
        if (this.f7049j.f7039b != null) {
            this.f7043d = this.f7049j.f7039b;
        } else if (c2260g.mo1592d() == -1) {
            this.f7043d = new C3986b();
        } else {
            C2229e b = this.f7040a.m8206b();
            this.f7043d = new C3980a(this.f7045f, c2260g.mo1592d(), this, b.f7034h + b.f7035i, b.f7029c);
        }
        this.f7049j = null;
        this.f7047h = 2;
        this.f7040a.m8208d();
        return null;
    }

    /* renamed from: b */
    private int m8215b(C2260g c2260g, C2265l c2265l) {
        C2260g c2260g2 = c2260g;
        long a = this.f7043d.mo1598a(c2260g2);
        if (a >= 0) {
            c2265l.f7191a = a;
            return 1;
        }
        if (a < -1) {
            mo1603c(-(a + 2));
        }
        if (!r0.f7051l) {
            r0.f7042c.mo4057a(r0.f7043d.mo1599c());
            r0.f7051l = true;
        }
        if (r0.f7050k <= 0) {
            if (!r0.f7040a.m8205a(c2260g2)) {
                r0.f7047h = 3;
                return -1;
            }
        }
        r0.f7050k = 0;
        C2175k c = r0.f7040a.m8207c();
        a = mo1602b(c);
        if (a >= 0 && r0.f7046g + a >= r0.f7044e) {
            long a2 = m8217a(r0.f7046g);
            r0.f7041b.mo1607a(c, c.m7978c());
            r0.f7041b.mo1605a(a2, 1, c.m7978c(), 0, null);
            r0.f7044e = -1;
        }
        r0.f7046g += a;
        return 0;
    }

    /* renamed from: a */
    protected long m8217a(long j) {
        return (j * 1000000) / ((long) this.f7048i);
    }

    /* renamed from: b */
    protected long m8222b(long j) {
        return (((long) this.f7048i) * j) / 1000000;
    }

    /* renamed from: c */
    protected void mo1603c(long j) {
        this.f7046g = j;
    }
}
