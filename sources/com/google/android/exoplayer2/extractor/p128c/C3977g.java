package com.google.android.exoplayer2.extractor.p128c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2263j;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p128c.C2203a.C3970a;
import com.google.android.exoplayer2.extractor.p128c.C2203a.C3971b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* renamed from: com.google.android.exoplayer2.extractor.c.g */
public final class C3977g implements C2259f, C2266m {
    /* renamed from: a */
    public static final C2262i f15900a = new C39761();
    /* renamed from: b */
    private static final int f15901b = C2186s.m8062e("qt  ");
    /* renamed from: c */
    private final C2175k f15902c = new C2175k(C2173i.f6727a);
    /* renamed from: d */
    private final C2175k f15903d = new C2175k(4);
    /* renamed from: e */
    private final C2175k f15904e = new C2175k(16);
    /* renamed from: f */
    private final Stack<C3970a> f15905f = new Stack();
    /* renamed from: g */
    private int f15906g;
    /* renamed from: h */
    private int f15907h;
    /* renamed from: i */
    private long f15908i;
    /* renamed from: j */
    private int f15909j;
    /* renamed from: k */
    private C2175k f15910k;
    /* renamed from: l */
    private int f15911l;
    /* renamed from: m */
    private int f15912m;
    /* renamed from: n */
    private C2261h f15913n;
    /* renamed from: o */
    private C2216a[] f15914o;
    /* renamed from: p */
    private long f15915p;
    /* renamed from: q */
    private boolean f15916q;

    /* renamed from: com.google.android.exoplayer2.extractor.c.g$a */
    private static final class C2216a {
        /* renamed from: a */
        public final C2219j f6955a;
        /* renamed from: b */
        public final C2222m f6956b;
        /* renamed from: c */
        public final C2267n f6957c;
        /* renamed from: d */
        public int f6958d;

        public C2216a(C2219j c2219j, C2222m c2222m, C2267n c2267n) {
            this.f6955a = c2219j;
            this.f6956b = c2222m;
            this.f6957c = c2267n;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.g$1 */
    static class C39761 implements C2262i {
        C39761() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3977g()};
        }
    }

    /* renamed from: a */
    public boolean mo1578a() {
        return true;
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        return C2218i.m8179b(c2260g);
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f15913n = c2261h;
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f15905f.clear();
        this.f15909j = 0;
        this.f15911l = 0;
        this.f15912m = 0;
        if (j == 0) {
            m19852d();
        } else if (this.f15914o != null) {
            m19851c(j2);
        }
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        while (true) {
            switch (this.f15906g) {
                case 0:
                    if (m19848b(c2260g)) {
                        break;
                    }
                    return -1;
                case 1:
                    if (!m19849b(c2260g, c2265l)) {
                        break;
                    }
                    return 1;
                case 2:
                    return m19850c(c2260g, c2265l);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f15915p;
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        long j2 = Long.MAX_VALUE;
        for (C2216a c2216a : this.f15914o) {
            C2222m c2222m = c2216a.f6956b;
            int a = c2222m.m8186a(j);
            if (a == -1) {
                a = c2222m.m8187b(j);
            }
            long j3 = c2222m.f6994b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: d */
    private void m19852d() {
        this.f15906g = 0;
        this.f15909j = 0;
    }

    /* renamed from: b */
    private boolean m19848b(C2260g c2260g) {
        if (this.f15909j == 0) {
            if (!c2260g.mo1584a(this.f15904e.f6735a, 0, 8, true)) {
                return false;
            }
            this.f15909j = 8;
            this.f15904e.m7979c(0);
            this.f15908i = this.f15904e.m7991l();
            this.f15907h = this.f15904e.m7993n();
        }
        if (this.f15908i == 1) {
            c2260g.mo1587b(this.f15904e.f6735a, 8, 8);
            this.f15909j += 8;
            this.f15908i = this.f15904e.m8001v();
        }
        if (C3977g.m19847b(this.f15907h)) {
            long c = (c2260g.mo1589c() + this.f15908i) - ((long) this.f15909j);
            this.f15905f.add(new C3970a(this.f15907h, c));
            if (this.f15908i == ((long) this.f15909j)) {
                m19843a(c);
            } else {
                m19852d();
            }
        } else if (C3977g.m19845a(this.f15907h) != null) {
            C2163a.m7918b(this.f15909j == 8 ? true : null);
            C2163a.m7918b(this.f15908i <= 2147483647L ? true : null);
            this.f15910k = new C2175k((int) this.f15908i);
            System.arraycopy(this.f15904e.f6735a, 0, this.f15910k.f6735a, 0, 8);
            this.f15906g = 1;
        } else {
            this.f15910k = null;
            this.f15906g = 1;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m19849b(C2260g c2260g, C2265l c2265l) {
        long j = this.f15908i - ((long) this.f15909j);
        long c = c2260g.mo1589c() + j;
        if (this.f15910k != null) {
            c2260g.mo1587b(this.f15910k.f6735a, this.f15909j, (int) j);
            if (this.f15907h == C2203a.f6857a) {
                this.f15916q = C3977g.m19846a(this.f15910k);
            } else if (this.f15905f.isEmpty() == null) {
                ((C3970a) this.f15905f.peek()).m19795a(new C3971b(this.f15907h, this.f15910k));
            }
        } else if (j < 262144) {
            c2260g.mo1586b((int) j);
        } else {
            c2265l.f7191a = c2260g.mo1589c() + j;
            c2260g = true;
            m19843a(c);
            if (c2260g != null || this.f15906g == 2) {
                return false;
            }
            return true;
        }
        c2260g = null;
        m19843a(c);
        if (c2260g != null) {
        }
        return false;
    }

    /* renamed from: a */
    private void m19843a(long j) {
        while (!this.f15905f.isEmpty() && ((C3970a) this.f15905f.peek()).aQ == j) {
            C3970a c3970a = (C3970a) this.f15905f.pop();
            if (c3970a.aP == C2203a.f6832B) {
                m19844a(c3970a);
                this.f15905f.clear();
                this.f15906g = 2;
            } else if (!this.f15905f.isEmpty()) {
                ((C3970a) this.f15905f.peek()).m19794a(c3970a);
            }
        }
        if (this.f15906g != 2) {
            m19852d();
        }
    }

    /* renamed from: a */
    private static boolean m19846a(C2175k c2175k) {
        c2175k.m7979c(8);
        if (c2175k.m7993n() == f15901b) {
            return true;
        }
        c2175k.m7981d(4);
        while (c2175k.m7976b() > 0) {
            if (c2175k.m7993n() == f15901b) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m19844a(C3970a c3970a) {
        Metadata a;
        C3977g c3977g = this;
        C3970a c3970a2 = c3970a;
        List arrayList = new ArrayList();
        C2263j c2263j = new C2263j();
        C3971b d = c3970a2.m19796d(C2203a.aA);
        if (d != null) {
            a = C2208b.m8147a(d, c3977g.f15916q);
            if (a != null) {
                c2263j.m8329a(a);
            }
        } else {
            a = null;
        }
        long j = Long.MAX_VALUE;
        long j2 = -9223372036854775807L;
        for (int i = 0; i < c3970a2.aS.size(); i++) {
            C3970a c3970a3 = (C3970a) c3970a2.aS.get(i);
            if (c3970a3.aP == C2203a.f6834D) {
                C2219j a2 = C2208b.m8144a(c3970a3, c3970a2.m19796d(C2203a.f6833C), -9223372036854775807L, null, c3977g.f15916q);
                if (a2 != null) {
                    C2222m a3 = C2208b.m8145a(a2, c3970a3.m19797e(C2203a.f6835E).m19797e(C2203a.f6836F).m19797e(C2203a.f6837G), c2263j);
                    if (a3.f6993a != 0) {
                        C2216a c2216a = new C2216a(a2, a3, c3977g.f15913n.mo4053a(i, a2.f6961b));
                        Format a4 = a2.f6965f.m7753a(a3.f6996d + 30);
                        if (a2.f6961b == 1) {
                            if (c2263j.m8327a()) {
                                a4 = a4.m7754a(c2263j.f7175b, c2263j.f7176c);
                            }
                            if (a != null) {
                                a4 = a4.m7757a(a);
                            }
                        }
                        c2216a.f6957c.mo1606a(a4);
                        j2 = Math.max(j2, a2.f6964e);
                        arrayList.add(c2216a);
                        long j3 = a3.f6994b[0];
                        if (j3 < j) {
                            j = j3;
                        }
                    }
                }
            }
        }
        c3977g.f15915p = j2;
        c3977g.f15914o = (C2216a[]) arrayList.toArray(new C2216a[arrayList.size()]);
        c3977g.f15913n.mo4054a();
        c3977g.f15913n.mo4057a(c3977g);
    }

    /* renamed from: c */
    private int m19850c(C2260g c2260g, C2265l c2265l) {
        int e = m19853e();
        if (e == -1) {
            return -1;
        }
        C2216a c2216a = this.f15914o[e];
        C2267n c2267n = c2216a.f6957c;
        int i = c2216a.f6958d;
        long j = c2216a.f6956b.f6994b[i];
        int i2 = c2216a.f6956b.f6995c[i];
        if (c2216a.f6955a.f6966g == 1) {
            j += 8;
            i2 -= 8;
        }
        long c = (j - c2260g.mo1589c()) + ((long) this.f15911l);
        if (c >= 0) {
            if (c < 262144) {
                c2260g.mo1586b((int) c);
                if (c2216a.f6955a.f6970k != null) {
                    c2265l = this.f15903d.f6735a;
                    c2265l[0] = null;
                    c2265l[1] = null;
                    c2265l[2] = null;
                    c2265l = c2216a.f6955a.f6970k;
                    int i3 = 4 - c2216a.f6955a.f6970k;
                    while (this.f15911l < i2) {
                        if (this.f15912m == 0) {
                            c2260g.mo1587b(this.f15903d.f6735a, i3, c2265l);
                            this.f15903d.m7979c(0);
                            this.f15912m = this.f15903d.m7999t();
                            this.f15902c.m7979c(0);
                            c2267n.mo1607a(this.f15902c, 4);
                            this.f15911l += 4;
                            i2 += i3;
                        } else {
                            int a = c2267n.mo1604a(c2260g, this.f15912m, false);
                            this.f15911l += a;
                            this.f15912m -= a;
                        }
                    }
                } else {
                    while (this.f15911l < i2) {
                        c2265l = c2267n.mo1604a(c2260g, i2 - this.f15911l, false);
                        this.f15911l += c2265l;
                        this.f15912m -= c2265l;
                    }
                }
                int i4 = i2;
                c2267n.mo1605a(c2216a.f6956b.f6997e[i], c2216a.f6956b.f6998f[i], i4, 0, null);
                c2216a.f6958d += 1;
                this.f15911l = 0;
                this.f15912m = 0;
                return 0;
            }
        }
        c2265l.f7191a = j;
        return 1;
    }

    /* renamed from: e */
    private int m19853e() {
        int i = -1;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.f15914o.length; i2++) {
            C2216a c2216a = this.f15914o[i2];
            int i3 = c2216a.f6958d;
            if (i3 != c2216a.f6956b.f6993a) {
                long j2 = c2216a.f6956b.f6994b[i3];
                if (j2 < j) {
                    i = i2;
                    j = j2;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    private void m19851c(long j) {
        for (C2216a c2216a : this.f15914o) {
            C2222m c2222m = c2216a.f6956b;
            int a = c2222m.m8186a(j);
            if (a == -1) {
                a = c2222m.m8187b(j);
            }
            c2216a.f6958d = a;
        }
    }

    /* renamed from: a */
    private static boolean m19845a(int i) {
        if (!(i == C2203a.f6848R || i == C2203a.f6833C || i == C2203a.f6849S || i == C2203a.f6850T || i == C2203a.am || i == C2203a.an || i == C2203a.ao || i == C2203a.f6847Q || i == C2203a.ap || i == C2203a.aq || i == C2203a.ar || i == C2203a.as || i == C2203a.at || i == C2203a.f6845O || i == C2203a.f6857a)) {
            if (i != C2203a.aA) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m19847b(int i) {
        if (!(i == C2203a.f6832B || i == C2203a.f6834D || i == C2203a.f6835E || i == C2203a.f6836F || i == C2203a.f6837G)) {
            if (i != C2203a.f6846P) {
                return false;
            }
        }
        return true;
    }
}
