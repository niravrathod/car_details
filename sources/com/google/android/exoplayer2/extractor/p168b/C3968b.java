package com.google.android.exoplayer2.extractor.p168b;

import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2263j;
import com.google.android.exoplayer2.extractor.C2264k;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.C4029a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.b.b */
public final class C3968b implements C2259f {
    /* renamed from: a */
    public static final C2262i f15835a = new C39661();
    /* renamed from: b */
    private static final int f15836b = C2186s.m8062e("Xing");
    /* renamed from: c */
    private static final int f15837c = C2186s.m8062e("Info");
    /* renamed from: d */
    private static final int f15838d = C2186s.m8062e("VBRI");
    /* renamed from: e */
    private final int f15839e;
    /* renamed from: f */
    private final long f15840f;
    /* renamed from: g */
    private final C2175k f15841g;
    /* renamed from: h */
    private final C2264k f15842h;
    /* renamed from: i */
    private final C2263j f15843i;
    /* renamed from: j */
    private C2261h f15844j;
    /* renamed from: k */
    private C2267n f15845k;
    /* renamed from: l */
    private int f15846l;
    /* renamed from: m */
    private Metadata f15847m;
    /* renamed from: n */
    private C3967a f15848n;
    /* renamed from: o */
    private long f15849o;
    /* renamed from: p */
    private long f15850p;
    /* renamed from: q */
    private int f15851q;

    /* renamed from: com.google.android.exoplayer2.extractor.b.b$1 */
    static class C39661 implements C2262i {
        C39661() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3968b()};
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.b.b$a */
    interface C3967a extends C2266m {
        /* renamed from: a */
        long mo4047a(long j);
    }

    /* renamed from: a */
    private static boolean m19763a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C3968b() {
        this(0);
    }

    public C3968b(int i) {
        this(i, -9223372036854775807L);
    }

    public C3968b(int i, long j) {
        this.f15839e = i;
        this.f15840f = j;
        this.f15841g = new C2175k((int) 10);
        this.f15842h = new C2264k();
        this.f15843i = new C2263j();
        this.f15849o = 1;
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        return m19764a(c2260g, true);
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f15844j = c2261h;
        this.f15845k = this.f15844j.mo4053a(0, 1);
        this.f15844j.mo4054a();
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f15846l = 0;
        this.f15849o = -9223372036854775807L;
        this.f15850p = 0;
        this.f15851q = 0;
    }

    /* renamed from: a */
    public int mo1573a(com.google.android.exoplayer2.extractor.C2260g r19, com.google.android.exoplayer2.extractor.C2265l r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r18 = this;
        r0 = r18;
        r1 = r0.f15846l;
        if (r1 != 0) goto L_0x000f;
    L_0x0006:
        r1 = 0;
        r2 = r19;
        r0.m19764a(r2, r1);	 Catch:{ EOFException -> 0x000d }
        goto L_0x0011;
    L_0x000d:
        r1 = -1;
        return r1;
    L_0x000f:
        r2 = r19;
    L_0x0011:
        r1 = r0.f15848n;
        if (r1 != 0) goto L_0x006f;
    L_0x0015:
        r1 = r18.m19767d(r19);
        r0.f15848n = r1;
        r1 = r0.f15848n;
        if (r1 == 0) goto L_0x002d;
    L_0x001f:
        r1 = r0.f15848n;
        r1 = r1.mo1578a();
        if (r1 != 0) goto L_0x0033;
    L_0x0027:
        r1 = r0.f15839e;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0033;
    L_0x002d:
        r1 = r18.m19768e(r19);
        r0.f15848n = r1;
    L_0x0033:
        r1 = r0.f15844j;
        r3 = r0.f15848n;
        r1.mo4057a(r3);
        r1 = r0.f15845k;
        r3 = 0;
        r4 = r0.f15842h;
        r4 = r4.f7185b;
        r5 = 0;
        r6 = -1;
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r8 = r0.f15842h;
        r8 = r8.f7188e;
        r9 = r0.f15842h;
        r9 = r9.f7187d;
        r10 = -1;
        r11 = r0.f15843i;
        r11 = r11.f7175b;
        r12 = r0.f15843i;
        r12 = r12.f7176c;
        r13 = 0;
        r14 = 0;
        r16 = 0;
        r15 = r0.f15839e;
        r15 = r15 & 2;
        if (r15 == 0) goto L_0x0064;
    L_0x0060:
        r15 = 0;
    L_0x0061:
        r17 = r15;
        goto L_0x0067;
    L_0x0064:
        r15 = r0.f15847m;
        goto L_0x0061;
    L_0x0067:
        r15 = 0;
        r3 = com.google.android.exoplayer2.Format.m7739a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r1.mo1606a(r3);
    L_0x006f:
        r1 = r18.m19765b(r19);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.b.b.a(com.google.android.exoplayer2.extractor.g, com.google.android.exoplayer2.extractor.l):int");
    }

    /* renamed from: b */
    private int m19765b(C2260g c2260g) {
        if (this.f15851q == 0) {
            c2260g.mo1583a();
            if (!c2260g.mo1588b(this.f15841g.f6735a, 0, 4, true)) {
                return -1;
            }
            this.f15841g.m7979c(0);
            int n = this.f15841g.m7993n();
            if (C3968b.m19763a(n, (long) this.f15846l)) {
                if (C2264k.m8330a(n) != -1) {
                    C2264k.m8332a(n, this.f15842h);
                    if (this.f15849o == -9223372036854775807L) {
                        this.f15849o = this.f15848n.mo4047a(c2260g.mo1589c());
                        if (this.f15840f != -9223372036854775807L) {
                            this.f15849o += this.f15840f - this.f15848n.mo4047a(0);
                        }
                    }
                    this.f15851q = this.f15842h.f7186c;
                }
            }
            c2260g.mo1586b(1);
            this.f15846l = 0;
            return 0;
        }
        c2260g = this.f15845k.mo1604a(c2260g, this.f15851q, true);
        if (c2260g == -1) {
            return -1;
        }
        this.f15851q -= c2260g;
        if (this.f15851q > null) {
            return 0;
        }
        this.f15845k.mo1605a(this.f15849o + ((this.f15850p * 1000000) / ((long) this.f15842h.f7187d)), 1, this.f15842h.f7186c, 0, null);
        this.f15850p += (long) this.f15842h.f7190g;
        this.f15851q = 0;
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m19764a(com.google.android.exoplayer2.extractor.C2260g r13, boolean r14) {
        /*
        r12 = this;
        if (r14 == 0) goto L_0x0005;
    L_0x0002:
        r0 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        goto L_0x0007;
    L_0x0005:
        r0 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
    L_0x0007:
        r13.mo1583a();
        r1 = r13.mo1589c();
        r3 = 0;
        r5 = 0;
        r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r6 != 0) goto L_0x0027;
    L_0x0015:
        r12.m19766c(r13);
        r1 = r13.mo1585b();
        r1 = (int) r1;
        if (r14 != 0) goto L_0x0022;
    L_0x001f:
        r13.mo1586b(r1);
    L_0x0022:
        r4 = r1;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        goto L_0x002b;
    L_0x0027:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x002b:
        r6 = r12.f15841g;
        r6 = r6.f6735a;
        r7 = 1;
        if (r1 <= 0) goto L_0x0034;
    L_0x0032:
        r8 = 1;
        goto L_0x0035;
    L_0x0034:
        r8 = 0;
    L_0x0035:
        r9 = 4;
        r6 = r13.mo1588b(r6, r5, r9, r8);
        if (r6 != 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0086;
    L_0x003d:
        r6 = r12.f15841g;
        r6.m7979c(r5);
        r6 = r12.f15841g;
        r6 = r6.m7993n();
        if (r2 == 0) goto L_0x0051;
    L_0x004a:
        r10 = (long) r2;
        r8 = com.google.android.exoplayer2.extractor.p168b.C3968b.m19763a(r6, r10);
        if (r8 == 0) goto L_0x0058;
    L_0x0051:
        r8 = com.google.android.exoplayer2.extractor.C2264k.m8330a(r6);
        r10 = -1;
        if (r8 != r10) goto L_0x0079;
    L_0x0058:
        r1 = r3 + 1;
        if (r3 != r0) goto L_0x0067;
    L_0x005c:
        if (r14 == 0) goto L_0x005f;
    L_0x005e:
        return r5;
    L_0x005f:
        r13 = new com.google.android.exoplayer2.ParserException;
        r14 = "Searched too many bytes.";
        r13.<init>(r14);
        throw r13;
    L_0x0067:
        if (r14 == 0) goto L_0x0072;
    L_0x0069:
        r13.mo1583a();
        r2 = r4 + r1;
        r13.mo1590c(r2);
        goto L_0x0075;
    L_0x0072:
        r13.mo1586b(r7);
    L_0x0075:
        r3 = r1;
        r1 = 0;
        r2 = 0;
        goto L_0x002b;
    L_0x0079:
        r1 = r1 + 1;
        if (r1 != r7) goto L_0x0084;
    L_0x007d:
        r2 = r12.f15842h;
        com.google.android.exoplayer2.extractor.C2264k.m8332a(r6, r2);
        r2 = r6;
        goto L_0x0093;
    L_0x0084:
        if (r1 != r9) goto L_0x0093;
    L_0x0086:
        if (r14 == 0) goto L_0x008d;
    L_0x0088:
        r4 = r4 + r3;
        r13.mo1586b(r4);
        goto L_0x0090;
    L_0x008d:
        r13.mo1583a();
    L_0x0090:
        r12.f15846l = r2;
        return r7;
    L_0x0093:
        r8 = r8 + -4;
        r13.mo1590c(r8);
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.b.b.a(com.google.android.exoplayer2.extractor.g, boolean):boolean");
    }

    /* renamed from: c */
    private void m19766c(C2260g c2260g) {
        int i = 0;
        while (true) {
            c2260g.mo1591c(this.f15841g.f6735a, 0, 10);
            this.f15841g.m7979c(0);
            if (this.f15841g.m7990k() != C4029a.f16207a) {
                c2260g.mo1583a();
                c2260g.mo1590c(i);
                return;
            }
            this.f15841g.m7981d(3);
            int s = this.f15841g.m7998s();
            int i2 = s + 10;
            if (this.f15847m == null) {
                byte[] bArr = new byte[i2];
                System.arraycopy(this.f15841g.f6735a, 0, bArr, 0, 10);
                c2260g.mo1591c(bArr, 10, s);
                this.f15847m = new C4029a((this.f15839e & 2) != 0 ? C2263j.f7173a : null).m20200a(bArr, i2);
                if (this.f15847m != null) {
                    this.f15843i.m8329a(this.f15847m);
                }
            } else {
                c2260g.mo1590c(s);
            }
            i += i2;
        }
    }

    /* renamed from: d */
    private C3967a m19767d(C2260g c2260g) {
        int i;
        int a;
        C3967a a2;
        C2175k c2175k = new C2175k(this.f15842h.f7186c);
        c2260g.mo1591c(c2175k.f6735a, 0, this.f15842h.f7186c);
        if ((this.f15842h.f7184a & 1) != 0) {
            if (this.f15842h.f7188e != 1) {
                i = 36;
                a = C3968b.m19762a(c2175k, i);
                if (a != f15836b) {
                    if (a == f15837c) {
                        if (a == f15838d) {
                            a2 = C4687c.m25772a(this.f15842h, c2175k, c2260g.mo1589c(), c2260g.mo1592d());
                            c2260g.mo1586b(this.f15842h.f7186c);
                        } else {
                            a2 = null;
                            c2260g.mo1583a();
                        }
                        return a2;
                    }
                }
                a2 = C4688d.m25778a(this.f15842h, c2175k, c2260g.mo1589c(), c2260g.mo1592d());
                if (!(a2 == null || this.f15843i.m8327a())) {
                    c2260g.mo1583a();
                    c2260g.mo1590c(i + 141);
                    c2260g.mo1591c(this.f15841g.f6735a, 0, 3);
                    this.f15841g.m7979c(0);
                    this.f15843i.m8328a(this.f15841g.m7990k());
                }
                c2260g.mo1586b(this.f15842h.f7186c);
                if (!(a2 == null || a2.mo1578a() || a != f15837c)) {
                    return m19768e(c2260g);
                }
                return a2;
            }
        } else if (this.f15842h.f7188e == 1) {
            i = 13;
            a = C3968b.m19762a(c2175k, i);
            if (a != f15836b) {
                if (a == f15837c) {
                    if (a == f15838d) {
                        a2 = null;
                        c2260g.mo1583a();
                    } else {
                        a2 = C4687c.m25772a(this.f15842h, c2175k, c2260g.mo1589c(), c2260g.mo1592d());
                        c2260g.mo1586b(this.f15842h.f7186c);
                    }
                    return a2;
                }
            }
            a2 = C4688d.m25778a(this.f15842h, c2175k, c2260g.mo1589c(), c2260g.mo1592d());
            c2260g.mo1583a();
            c2260g.mo1590c(i + 141);
            c2260g.mo1591c(this.f15841g.f6735a, 0, 3);
            this.f15841g.m7979c(0);
            this.f15843i.m8328a(this.f15841g.m7990k());
            c2260g.mo1586b(this.f15842h.f7186c);
            return m19768e(c2260g);
        }
        i = 21;
        a = C3968b.m19762a(c2175k, i);
        if (a != f15836b) {
            if (a == f15837c) {
                if (a == f15838d) {
                    a2 = C4687c.m25772a(this.f15842h, c2175k, c2260g.mo1589c(), c2260g.mo1592d());
                    c2260g.mo1586b(this.f15842h.f7186c);
                } else {
                    a2 = null;
                    c2260g.mo1583a();
                }
                return a2;
            }
        }
        a2 = C4688d.m25778a(this.f15842h, c2175k, c2260g.mo1589c(), c2260g.mo1592d());
        c2260g.mo1583a();
        c2260g.mo1590c(i + 141);
        c2260g.mo1591c(this.f15841g.f6735a, 0, 3);
        this.f15841g.m7979c(0);
        this.f15843i.m8328a(this.f15841g.m7990k());
        c2260g.mo1586b(this.f15842h.f7186c);
        return m19768e(c2260g);
    }

    /* renamed from: e */
    private C3967a m19768e(C2260g c2260g) {
        c2260g.mo1591c(this.f15841g.f6735a, 0, 4);
        this.f15841g.m7979c(0);
        C2264k.m8332a(this.f15841g.m7993n(), this.f15842h);
        return new C4686a(c2260g.mo1589c(), this.f15842h.f7189f, c2260g.mo1592d());
    }

    /* renamed from: a */
    private static int m19762a(C2175k c2175k, int i) {
        if (c2175k.m7978c() >= i + 4) {
            c2175k.m7979c(i);
            i = c2175k.m7993n();
            if (i == f15836b || i == f15837c) {
                return i;
            }
        }
        if (c2175k.m7978c() >= 40) {
            c2175k.m7979c(36);
            if (c2175k.m7993n() == f15838d) {
                return f15838d;
            }
        }
        return null;
    }
}
