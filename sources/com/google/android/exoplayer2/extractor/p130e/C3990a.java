package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.audio.C2137a;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.e.a */
public final class C3990a implements C2259f {
    /* renamed from: a */
    public static final C2262i f15970a = new C39891();
    /* renamed from: b */
    private static final int f15971b = C2186s.m8062e("ID3");
    /* renamed from: c */
    private final long f15972c;
    /* renamed from: d */
    private final C2175k f15973d;
    /* renamed from: e */
    private C3991b f15974e;
    /* renamed from: f */
    private boolean f15975f;

    /* renamed from: com.google.android.exoplayer2.extractor.e.a$1 */
    static class C39891 implements C2262i {
        C39891() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3990a()};
        }
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C3990a() {
        this(0);
    }

    public C3990a(long j) {
        this.f15972c = j;
        this.f15973d = new C2175k(2786);
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        C2175k c2175k = new C2175k(10);
        int i = 0;
        while (true) {
            c2260g.mo1591c(c2175k.f6735a, 0, 10);
            c2175k.m7979c(0);
            if (c2175k.m7990k() != f15971b) {
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
            while (true) {
                c2260g.mo1591c(c2175k.f6735a, 0, 5);
                c2175k.m7979c(0);
                if (c2175k.m7987h() != 2935) {
                    break;
                }
                s++;
                if (s >= 4) {
                    return true;
                }
                int a = C2137a.m7849a(c2175k.f6735a);
                if (a == -1) {
                    return false;
                }
                c2260g.mo1590c(a - 5);
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
        this.f15974e = new C3991b();
        this.f15974e.mo1611a(c2261h, new C2254d(0, 1));
        c2261h.mo4054a();
        c2261h.mo4057a(new C4021a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f15975f = 0;
        this.f15974e.mo1608a();
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        c2260g = c2260g.mo1582a(this.f15973d.f6735a, 0, 2786);
        if (c2260g == -1) {
            return -1;
        }
        this.f15973d.m7979c(0);
        this.f15973d.m7977b(c2260g);
        if (this.f15975f == null) {
            this.f15974e.mo1609a(this.f15972c, true);
            this.f15975f = true;
        }
        this.f15974e.mo1610a(this.f15973d);
        return 0;
    }
}
