package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.e.c */
public final class C3993c implements C2259f {
    /* renamed from: a */
    public static final C2262i f15988a = new C39921();
    /* renamed from: b */
    private static final int f15989b = C2186s.m8062e("ID3");
    /* renamed from: c */
    private final long f15990c;
    /* renamed from: d */
    private final C2175k f15991d;
    /* renamed from: e */
    private C3994d f15992e;
    /* renamed from: f */
    private boolean f15993f;

    /* renamed from: com.google.android.exoplayer2.extractor.e.c$1 */
    static class C39921 implements C2262i {
        C39921() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3993c()};
        }
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C3993c() {
        this(0);
    }

    public C3993c(long j) {
        this.f15990c = j;
        this.f15991d = new C2175k(200);
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        C2175k c2175k = new C2175k(10);
        C2174j c2174j = new C2174j(c2175k.f6735a);
        int i = 0;
        while (true) {
            c2260g.mo1591c(c2175k.f6735a, 0, 10);
            c2175k.m7979c(0);
            if (c2175k.m7990k() != f15989b) {
                break;
            }
            c2175k.m7981d(3);
            int s = c2175k.m7998s();
            i += s + 10;
            c2260g.mo1590c(s);
        }
        c2260g.mo1583a();
        c2260g.mo1590c(i);
        int i2 = i;
        while (true) {
            s = 0;
            int i3 = 0;
            while (true) {
                c2260g.mo1591c(c2175k.f6735a, 0, 2);
                c2175k.m7979c(0);
                if ((c2175k.m7987h() & 65526) != 65520) {
                    break;
                }
                s++;
                if (s >= 4 && i3 > 188) {
                    return true;
                }
                c2260g.mo1591c(c2175k.f6735a, 0, 4);
                c2174j.m7960a(14);
                int c = c2174j.m7966c(13);
                if (c <= 6) {
                    return false;
                }
                c2260g.mo1590c(c - 6);
                i3 += c;
            }
            c2260g.mo1583a();
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            c2260g.mo1590c(i2);
        }
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f15992e = new C3994d(true);
        this.f15992e.mo1611a(c2261h, new C2254d(0, 1));
        c2261h.mo4054a();
        c2261h.mo4057a(new C4021a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f15993f = 0;
        this.f15992e.mo1608a();
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        c2260g = c2260g.mo1582a(this.f15991d.f6735a, 0, 200);
        if (c2260g == -1) {
            return -1;
        }
        this.f15991d.m7979c(0);
        this.f15991d.m7977b(c2260g);
        if (this.f15993f == null) {
            this.f15992e.mo1609a(this.f15990c, true);
            this.f15993f = true;
        }
        this.f15992e.mo1610a(this.f15991d);
        return 0;
    }
}
