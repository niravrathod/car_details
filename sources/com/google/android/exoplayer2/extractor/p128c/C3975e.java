package com.google.android.exoplayer2.extractor.p128c;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.C3965a;
import com.google.android.exoplayer2.extractor.p128c.C2203a.C3970a;
import com.google.android.exoplayer2.extractor.p128c.C2203a.C3971b;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.p132a.C2332g;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.c.e */
public final class C3975e implements C2259f {
    /* renamed from: a */
    public static final C2262i f15867a = new C39741();
    /* renamed from: b */
    private static final int f15868b = C2186s.m8062e("seig");
    /* renamed from: c */
    private static final byte[] f15869c = new byte[]{(byte) -94, (byte) 57, (byte) 79, (byte) 82, (byte) 90, (byte) -101, (byte) 79, (byte) 20, (byte) -94, (byte) 68, (byte) 108, (byte) 66, (byte) 124, (byte) 100, (byte) -115, (byte) -12};
    /* renamed from: A */
    private int f15870A;
    /* renamed from: B */
    private int f15871B;
    /* renamed from: C */
    private boolean f15872C;
    /* renamed from: D */
    private C2261h f15873D;
    /* renamed from: E */
    private C2267n f15874E;
    /* renamed from: F */
    private C2267n[] f15875F;
    /* renamed from: G */
    private boolean f15876G;
    /* renamed from: d */
    private final int f15877d;
    /* renamed from: e */
    private final C2219j f15878e;
    /* renamed from: f */
    private final SparseArray<C2214b> f15879f;
    /* renamed from: g */
    private final C2175k f15880g;
    /* renamed from: h */
    private final C2175k f15881h;
    /* renamed from: i */
    private final C2175k f15882i;
    /* renamed from: j */
    private final C2175k f15883j;
    /* renamed from: k */
    private final C2183q f15884k;
    /* renamed from: l */
    private final C2175k f15885l;
    /* renamed from: m */
    private final byte[] f15886m;
    /* renamed from: n */
    private final Stack<C3970a> f15887n;
    /* renamed from: o */
    private final LinkedList<C2213a> f15888o;
    /* renamed from: p */
    private int f15889p;
    /* renamed from: q */
    private int f15890q;
    /* renamed from: r */
    private long f15891r;
    /* renamed from: s */
    private int f15892s;
    /* renamed from: t */
    private C2175k f15893t;
    /* renamed from: u */
    private long f15894u;
    /* renamed from: v */
    private int f15895v;
    /* renamed from: w */
    private long f15896w;
    /* renamed from: x */
    private long f15897x;
    /* renamed from: y */
    private C2214b f15898y;
    /* renamed from: z */
    private int f15899z;

    /* renamed from: com.google.android.exoplayer2.extractor.c.e$a */
    private static final class C2213a {
        /* renamed from: a */
        public final long f6916a;
        /* renamed from: b */
        public final int f6917b;

        public C2213a(long j, int i) {
            this.f6916a = j;
            this.f6917b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.e$b */
    private static final class C2214b {
        /* renamed from: a */
        public final C2221l f6918a = new C2221l();
        /* renamed from: b */
        public final C2267n f6919b;
        /* renamed from: c */
        public C2219j f6920c;
        /* renamed from: d */
        public C2209c f6921d;
        /* renamed from: e */
        public int f6922e;
        /* renamed from: f */
        public int f6923f;
        /* renamed from: g */
        public int f6924g;

        public C2214b(C2267n c2267n) {
            this.f6919b = c2267n;
        }

        /* renamed from: a */
        public void m8164a(C2219j c2219j, C2209c c2209c) {
            this.f6920c = (C2219j) C2163a.m7914a((Object) c2219j);
            this.f6921d = (C2209c) C2163a.m7914a((Object) c2209c);
            this.f6919b.mo1606a(c2219j.f6965f);
            m8162a();
        }

        /* renamed from: a */
        public void m8162a() {
            this.f6918a.m8180a();
            this.f6922e = 0;
            this.f6924g = 0;
            this.f6923f = 0;
        }

        /* renamed from: a */
        public void m8163a(DrmInitData drmInitData) {
            this.f6919b.mo1606a(this.f6920c.f6965f.m7756a(drmInitData));
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.e$1 */
    static class C39741 implements C2262i {
        C39741() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C3975e()};
        }
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C3975e() {
        this(0);
    }

    public C3975e(int i) {
        this(i, null);
    }

    public C3975e(int i, C2183q c2183q) {
        this(i, c2183q, null);
    }

    public C3975e(int i, C2183q c2183q, C2219j c2219j) {
        this.f15877d = i | (c2219j != null ? 16 : 0);
        this.f15884k = c2183q;
        this.f15878e = c2219j;
        this.f15885l = new C2175k(16);
        this.f15880g = new C2175k(C2173i.f6727a);
        this.f15881h = new C2175k(5);
        this.f15882i = new C2175k();
        this.f15883j = new C2175k(1);
        this.f15886m = new byte[16];
        this.f15887n = new Stack();
        this.f15888o = new LinkedList();
        this.f15879f = new SparseArray();
        this.f15896w = -9223372036854775807L;
        this.f15897x = -9223372036854775807L;
        m19811a();
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        return C2218i.m8177a(c2260g);
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f15873D = c2261h;
        if (this.f15878e != null) {
            C2214b c2214b = new C2214b(c2261h.mo4053a(0, this.f15878e.f6961b));
            c2214b.m8164a(this.f15878e, new C2209c(0, 0, 0, 0));
            this.f15879f.put(0, c2214b);
            m19825b();
            this.f15873D.mo4054a();
        }
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        j = this.f15879f.size();
        for (j2 = null; j2 < j; j2++) {
            ((C2214b) this.f15879f.valueAt(j2)).m8162a();
        }
        this.f15888o.clear();
        this.f15895v = 0;
        this.f15887n.clear();
        m19811a();
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        while (true) {
            switch (this.f15889p) {
                case null:
                    if (m19830b(c2260g) != null) {
                        break;
                    }
                    return -1;
                case 1:
                    m19833c(c2260g);
                    break;
                case 2:
                    m19835d(c2260g);
                    break;
                default:
                    if (m19836e(c2260g) == null) {
                        break;
                    }
                    return null;
            }
        }
    }

    /* renamed from: a */
    private void m19811a() {
        this.f15889p = 0;
        this.f15892s = 0;
    }

    /* renamed from: b */
    private boolean m19830b(C2260g c2260g) {
        if (this.f15892s == 0) {
            if (!c2260g.mo1584a(this.f15885l.f6735a, 0, 8, true)) {
                return false;
            }
            this.f15892s = 8;
            this.f15885l.m7979c(0);
            this.f15891r = this.f15885l.m7991l();
            this.f15890q = this.f15885l.m7993n();
        }
        if (this.f15891r == 1) {
            c2260g.mo1587b(this.f15885l.f6735a, 8, 8);
            this.f15892s += 8;
            this.f15891r = this.f15885l.m8001v();
        }
        if (this.f15891r >= ((long) this.f15892s)) {
            long c = c2260g.mo1589c() - ((long) this.f15892s);
            if (this.f15890q == C2203a.f6841K) {
                int size = this.f15879f.size();
                for (int i = 0; i < size; i++) {
                    C2221l c2221l = ((C2214b) this.f15879f.valueAt(i)).f6918a;
                    c2221l.f6975b = c;
                    c2221l.f6977d = c;
                    c2221l.f6976c = c;
                }
            }
            if (this.f15890q == C2203a.f6864h) {
                this.f15898y = null;
                this.f15894u = c + this.f15891r;
                if (this.f15876G == null) {
                    this.f15873D.mo4057a(new C4021a(this.f15896w));
                    this.f15876G = true;
                }
                this.f15889p = 2;
                return true;
            }
            if (C3975e.m19829b(this.f15890q)) {
                long c2 = (c2260g.mo1589c() + this.f15891r) - 8;
                this.f15887n.add(new C3970a(this.f15890q, c2));
                if (this.f15891r == ((long) this.f15892s)) {
                    m19812a(c2);
                } else {
                    m19811a();
                }
            } else if (C3975e.m19823a(this.f15890q) != null) {
                if (this.f15892s != 8) {
                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                } else if (this.f15891r <= 2147483647L) {
                    this.f15893t = new C2175k((int) this.f15891r);
                    System.arraycopy(this.f15885l.f6735a, 0, this.f15893t.f6735a, 0, 8);
                    this.f15889p = 1;
                } else {
                    throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                }
            } else if (this.f15891r <= 2147483647L) {
                this.f15893t = null;
                this.f15889p = 1;
            } else {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    /* renamed from: c */
    private void m19833c(C2260g c2260g) {
        int i = ((int) this.f15891r) - this.f15892s;
        if (this.f15893t != null) {
            c2260g.mo1587b(this.f15893t.f6735a, 8, i);
            m19821a(new C3971b(this.f15890q, this.f15893t), c2260g.mo1589c());
        } else {
            c2260g.mo1586b(i);
        }
        m19812a(c2260g.mo1589c());
    }

    /* renamed from: a */
    private void m19812a(long j) {
        while (!this.f15887n.isEmpty() && ((C3970a) this.f15887n.peek()).aQ == j) {
            m19818a((C3970a) this.f15887n.pop());
        }
        m19811a();
    }

    /* renamed from: a */
    private void m19821a(C3971b c3971b, long j) {
        if (!this.f15887n.isEmpty()) {
            ((C3970a) this.f15887n.peek()).m19795a(c3971b);
        } else if (c3971b.aP == C2203a.f6831A) {
            c3971b = C3975e.m19807a(c3971b.aQ, j);
            this.f15897x = ((Long) c3971b.first).longValue();
            this.f15873D.mo4057a((C2266m) c3971b.second);
            this.f15876G = true;
        } else if (c3971b.aP == C2203a.aG) {
            m19813a(c3971b.aQ);
        }
    }

    /* renamed from: a */
    private void m19818a(C3970a c3970a) {
        if (c3970a.aP == C2203a.f6832B) {
            m19827b(c3970a);
        } else if (c3970a.aP == C2203a.f6841K) {
            m19832c(c3970a);
        } else if (!this.f15887n.isEmpty()) {
            ((C3970a) this.f15887n.peek()).m19794a(c3970a);
        }
    }

    /* renamed from: b */
    private void m19827b(C3970a c3970a) {
        C3970a c3970a2 = c3970a;
        int i = 0;
        boolean z = true;
        C2163a.m7919b(this.f15878e == null, "Unexpected moov box.");
        DrmInitData a = C3975e.m19808a(c3970a2.aR);
        C3970a e = c3970a2.m19797e(C2203a.f6843M);
        SparseArray sparseArray = new SparseArray();
        int size = e.aR.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            C3971b c3971b = (C3971b) e.aR.get(i2);
            if (c3971b.aP == C2203a.f6881y) {
                Pair b = C3975e.m19824b(c3971b.aQ);
                sparseArray.put(((Integer) b.first).intValue(), b.second);
            } else if (c3971b.aP == C2203a.f6844N) {
                j = C3975e.m19831c(c3971b.aQ);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c3970a2.aS.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4;
            e = (C3970a) c3970a2.aS.get(i3);
            if (e.aP == C2203a.f6834D) {
                i4 = i3;
                C2219j a2 = C2208b.m8144a(e, c3970a2.m19796d(C2203a.f6833C), j, a, false);
                if (a2 != null) {
                    sparseArray2.put(a2.f6960a, a2);
                }
            } else {
                i4 = i3;
            }
            i3 = i4 + 1;
        }
        int size3 = sparseArray2.size();
        if (r0.f15879f.size() == 0) {
            while (i < size3) {
                C2219j c2219j = (C2219j) sparseArray2.valueAt(i);
                C2214b c2214b = new C2214b(r0.f15873D.mo4053a(i, c2219j.f6961b));
                c2214b.m8164a(c2219j, (C2209c) sparseArray.get(c2219j.f6960a));
                r0.f15879f.put(c2219j.f6960a, c2214b);
                r0.f15896w = Math.max(r0.f15896w, c2219j.f6964e);
                i++;
            }
            m19825b();
            r0.f15873D.mo4054a();
            return;
        }
        if (r0.f15879f.size() != size3) {
            z = false;
        }
        C2163a.m7918b(z);
        while (i < size3) {
            c2219j = (C2219j) sparseArray2.valueAt(i);
            ((C2214b) r0.f15879f.get(c2219j.f6960a)).m8164a(c2219j, (C2209c) sparseArray.get(c2219j.f6960a));
            i++;
        }
    }

    /* renamed from: c */
    private void m19832c(C3970a c3970a) {
        C3975e.m19819a(c3970a, this.f15879f, this.f15877d, this.f15886m);
        c3970a = C3975e.m19808a(c3970a.aR);
        if (c3970a != null) {
            int size = this.f15879f.size();
            for (int i = 0; i < size; i++) {
                ((C2214b) this.f15879f.valueAt(i)).m8163a(c3970a);
            }
        }
    }

    /* renamed from: b */
    private void m19825b() {
        if ((this.f15877d & 4) != 0 && this.f15874E == null) {
            this.f15874E = this.f15873D.mo4053a(this.f15879f.size(), 4);
            this.f15874E.mo1606a(Format.m7736a(null, "application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f15877d & 8) != 0 && this.f15875F == null) {
            this.f15873D.mo4053a(this.f15879f.size() + 1, 3).mo1606a(Format.m7744a(null, "application/cea-608", null, -1, 0, null, null));
            this.f15875F = new C2267n[]{r0};
        }
    }

    /* renamed from: a */
    private void m19813a(C2175k c2175k) {
        if (this.f15874E != null) {
            c2175k.m7979c(12);
            c2175k.m8003x();
            c2175k.m8003x();
            long b = C2186s.m8057b(c2175k.m7991l(), 1000000, c2175k.m7991l());
            c2175k.m7979c(12);
            int b2 = c2175k.m7976b();
            this.f15874E.mo1607a(c2175k, b2);
            if (this.f15897x != -9223372036854775807L) {
                this.f15874E.mo1605a(this.f15897x + b, 1, b2, 0, null);
            } else {
                this.f15888o.addLast(new C2213a(b, b2));
                this.f15895v += b2;
            }
        }
    }

    /* renamed from: b */
    private static Pair<Integer, C2209c> m19824b(C2175k c2175k) {
        c2175k.m7979c(12);
        return Pair.create(Integer.valueOf(c2175k.m7993n()), new C2209c(c2175k.m7999t() - 1, c2175k.m7999t(), c2175k.m7999t(), c2175k.m7993n()));
    }

    /* renamed from: c */
    private static long m19831c(C2175k c2175k) {
        c2175k.m7979c(8);
        return C2203a.m8129a(c2175k.m7993n()) == 0 ? c2175k.m7991l() : c2175k.m8001v();
    }

    /* renamed from: a */
    private static void m19819a(C3970a c3970a, SparseArray<C2214b> sparseArray, int i, byte[] bArr) {
        int size = c3970a.aS.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3970a c3970a2 = (C3970a) c3970a.aS.get(i2);
            if (c3970a2.aP == C2203a.f6842L) {
                C3975e.m19828b(c3970a2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: b */
    private static void m19828b(C3970a c3970a, SparseArray<C2214b> sparseArray, int i, byte[] bArr) {
        C2214b a = C3975e.m19810a(c3970a.m19796d(C2203a.f6880x).aQ, (SparseArray) sparseArray, i);
        if (a != null) {
            C2221l c2221l = a.f6918a;
            long j = c2221l.f6992s;
            a.m8162a();
            if (c3970a.m19796d(C2203a.f6879w) != null && (i & 2) == 0) {
                j = C3975e.m19834d(c3970a.m19796d(C2203a.f6879w).aQ);
            }
            C3975e.m19820a(c3970a, a, j, i);
            i = c3970a.m19796d(C2203a.ac);
            if (i != 0) {
                C3975e.m19822a(a.f6920c.f6967h[c2221l.f6974a.f6907a], i.aQ, c2221l);
            }
            sparseArray = c3970a.m19796d(C2203a.ad);
            if (sparseArray != null) {
                C3975e.m19816a(sparseArray.aQ, c2221l);
            }
            sparseArray = c3970a.m19796d(C2203a.ah);
            if (sparseArray != null) {
                C3975e.m19826b(sparseArray.aQ, c2221l);
            }
            sparseArray = c3970a.m19796d(C2203a.ae);
            i = c3970a.m19796d(C2203a.af);
            if (!(sparseArray == null || i == 0)) {
                C3975e.m19815a(sparseArray.aQ, i.aQ, c2221l);
            }
            sparseArray = c3970a.aR.size();
            for (i = 0; i < sparseArray; i++) {
                C3971b c3971b = (C3971b) c3970a.aR.get(i);
                if (c3971b.aP == C2203a.ag) {
                    C3975e.m19817a(c3971b.aQ, c2221l, bArr);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m19820a(C3970a c3970a, C2214b c2214b, long j, int i) {
        c3970a = c3970a.aR;
        int size = c3970a.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C3971b c3971b = (C3971b) c3970a.get(i5);
            if (c3971b.aP == C2203a.f6882z) {
                C2175k c2175k = c3971b.aQ;
                c2175k.m7979c(12);
                int t = c2175k.m7999t();
                if (t > 0) {
                    i4 += t;
                    i3++;
                }
            }
        }
        c2214b.f6924g = 0;
        c2214b.f6923f = 0;
        c2214b.f6922e = 0;
        c2214b.f6918a.m8182a(i3, i4);
        i3 = 0;
        int i6 = 0;
        while (i2 < size) {
            C3971b c3971b2 = (C3971b) c3970a.get(i2);
            if (c3971b2.aP == C2203a.f6882z) {
                int i7 = i3 + 1;
                i6 = C3975e.m19806a(c2214b, i3, j, i, c3971b2.aQ, i6);
                i3 = i7;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static void m19822a(C2220k c2220k, C2175k c2175k, C2221l c2221l) {
        c2220k = c2220k.f6972b;
        c2175k.m7979c(8);
        boolean z = true;
        if ((C2203a.m8130b(c2175k.m7993n()) & 1) == 1) {
            c2175k.m7981d(8);
        }
        int g = c2175k.m7986g();
        int t = c2175k.m7999t();
        if (t == c2221l.f6979f) {
            int i;
            if (g == 0) {
                boolean[] zArr = c2221l.f6987n;
                i = 0;
                for (int i2 = 0; i2 < t; i2++) {
                    int g2 = c2175k.m7986g();
                    i += g2;
                    zArr[i2] = g2 > c2220k;
                }
            } else {
                if (g <= c2220k) {
                    z = false;
                }
                i = (g * t) + 0;
                Arrays.fill(c2221l.f6987n, 0, t, z);
            }
            c2221l.m8181a(i);
            return;
        }
        c2175k = new StringBuilder();
        c2175k.append("Length mismatch: ");
        c2175k.append(t);
        c2175k.append(", ");
        c2175k.append(c2221l.f6979f);
        throw new ParserException(c2175k.toString());
    }

    /* renamed from: a */
    private static void m19816a(C2175k c2175k, C2221l c2221l) {
        c2175k.m7979c(8);
        int n = c2175k.m7993n();
        if ((C2203a.m8130b(n) & 1) == 1) {
            c2175k.m7981d(8);
        }
        int t = c2175k.m7999t();
        if (t == 1) {
            long l;
            t = C2203a.m8129a(n);
            long j = c2221l.f6977d;
            if (t == 0) {
                l = c2175k.m7991l();
            } else {
                l = c2175k.m8001v();
            }
            c2221l.f6977d = j + l;
            return;
        }
        c2221l = new StringBuilder();
        c2221l.append("Unexpected saio entry count: ");
        c2221l.append(t);
        throw new ParserException(c2221l.toString());
    }

    /* renamed from: a */
    private static C2214b m19810a(C2175k c2175k, SparseArray<C2214b> sparseArray, int i) {
        c2175k.m7979c(8);
        int b = C2203a.m8130b(c2175k.m7993n());
        int n = c2175k.m7993n();
        if ((i & 16) != 0) {
            n = 0;
        }
        C2214b c2214b = (C2214b) sparseArray.get(n);
        if (c2214b == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long v = c2175k.m8001v();
            c2214b.f6918a.f6976c = v;
            c2214b.f6918a.f6977d = v;
        }
        i = c2214b.f6921d;
        c2214b.f6918a.f6974a = new C2209c((b & 2) != 0 ? c2175k.m7999t() - 1 : i.f6907a, (b & 8) != 0 ? c2175k.m7999t() : i.f6908b, (b & 16) != 0 ? c2175k.m7999t() : i.f6909c, (b & 32) != 0 ? c2175k.m7999t() : i.f6910d);
        return c2214b;
    }

    /* renamed from: d */
    private static long m19834d(C2175k c2175k) {
        c2175k.m7979c(8);
        return C2203a.m8129a(c2175k.m7993n()) == 1 ? c2175k.m8001v() : c2175k.m7991l();
    }

    /* renamed from: a */
    private static int m19806a(C2214b c2214b, int i, long j, int i2, C2175k c2175k, int i3) {
        long[] jArr;
        long j2;
        long j3;
        C2214b c2214b2 = c2214b;
        c2175k.m7979c(8);
        int b = C2203a.m8130b(c2175k.m7993n());
        C2219j c2219j = c2214b2.f6920c;
        C2221l c2221l = c2214b2.f6918a;
        C2209c c2209c = c2221l.f6974a;
        c2221l.f6981h[i] = c2175k.m7999t();
        c2221l.f6980g[i] = c2221l.f6976c;
        if ((b & 1) != 0) {
            long[] jArr2 = c2221l.f6980g;
            jArr2[i] = jArr2[i] + ((long) c2175k.m7993n());
        }
        Object obj = (b & 4) != 0 ? 1 : null;
        int i4 = c2209c.f6910d;
        if (obj != null) {
            i4 = c2175k.m7999t();
        }
        Object obj2 = (b & 256) != 0 ? 1 : null;
        Object obj3 = (b & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 1 : null;
        Object obj4 = (b & 1024) != 0 ? 1 : null;
        Object obj5 = (b & 2048) != 0 ? 1 : null;
        long j4 = 0;
        if (c2219j.f6968i != null && c2219j.f6968i.length == 1 && c2219j.f6968i[0] == 0) {
            j4 = C2186s.m8057b(c2219j.f6969j[0], 1000, c2219j.f6962c);
        }
        int[] iArr = c2221l.f6982i;
        int[] iArr2 = c2221l.f6983j;
        long[] jArr3 = c2221l.f6984k;
        int i5 = i4;
        boolean[] zArr = c2221l.f6985l;
        Object obj6 = (c2219j.f6961b != 2 || (i2 & 1) == 0) ? null : 1;
        i4 = i3 + c2221l.f6981h[i];
        Object obj7 = obj6;
        long j5 = c2219j.f6962c;
        if (i > 0) {
            jArr = jArr3;
            j2 = j4;
            j3 = c2221l.f6992s;
        } else {
            jArr = jArr3;
            j2 = j4;
            j3 = j;
        }
        int i6 = i3;
        while (i6 < i4) {
            Object obj8;
            int t;
            Object obj9;
            int i7;
            C2209c c2209c2;
            int t2 = obj2 != null ? c2175k.m7999t() : c2209c.f6908b;
            if (obj3 != null) {
                obj8 = obj2;
                t = c2175k.m7999t();
            } else {
                obj8 = obj2;
                t = c2209c.f6909c;
            }
            if (i6 == 0 && obj != null) {
                obj9 = obj;
                i7 = i5;
            } else if (obj4 != null) {
                i7 = c2175k.m7993n();
                obj9 = obj;
            } else {
                obj9 = obj;
                i7 = c2209c.f6910d;
            }
            if (obj5 != null) {
                c2209c2 = c2209c;
                iArr2[i6] = (int) (((long) (c2175k.m7993n() * 1000)) / j5);
            } else {
                c2209c2 = c2209c;
                iArr2[i6] = 0;
            }
            jArr[i6] = C2186s.m8057b(j3, 1000, j5) - j2;
            iArr[i6] = t;
            boolean z = ((i7 >> 16) & 1) == 0 && (obj7 == null || i6 == 0);
            zArr[i6] = z;
            j3 += (long) t2;
            i6++;
            obj2 = obj8;
            obj = obj9;
            c2209c = c2209c2;
        }
        c2221l.f6992s = j3;
        return i4;
    }

    /* renamed from: a */
    private static void m19817a(C2175k c2175k, C2221l c2221l, byte[] bArr) {
        c2175k.m7979c(8);
        c2175k.m7975a(bArr, 0, 16);
        if (Arrays.equals(bArr, f15869c) != null) {
            C3975e.m19814a(c2175k, 16, c2221l);
        }
    }

    /* renamed from: b */
    private static void m19826b(C2175k c2175k, C2221l c2221l) {
        C3975e.m19814a(c2175k, 0, c2221l);
    }

    /* renamed from: a */
    private static void m19814a(C2175k c2175k, int i, C2221l c2221l) {
        c2175k.m7979c(i + 8);
        i = C2203a.m8130b(c2175k.m7993n());
        if ((i & 1) == 0) {
            i = (i & 2) != 0 ? 1 : 0;
            int t = c2175k.m7999t();
            if (t == c2221l.f6979f) {
                Arrays.fill(c2221l.f6987n, 0, t, i);
                c2221l.m8181a(c2175k.m7976b());
                c2221l.m8183a(c2175k);
                return;
            }
            i = new StringBuilder();
            i.append("Length mismatch: ");
            i.append(t);
            i.append(", ");
            i.append(c2221l.f6979f);
            throw new ParserException(i.toString());
        }
        throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: a */
    private static void m19815a(C2175k c2175k, C2175k c2175k2, C2221l c2221l) {
        c2175k.m7979c(8);
        int n = c2175k.m7993n();
        if (c2175k.m7993n() == f15868b) {
            if (C2203a.m8129a(n) == 1) {
                c2175k.m7981d(4);
            }
            if (c2175k.m7993n() == 1) {
                c2175k2.m7979c(8);
                c2175k = c2175k2.m7993n();
                if (c2175k2.m7993n() == f15868b) {
                    c2175k = C2203a.m8129a(c2175k);
                    if (c2175k == 1) {
                        if (c2175k2.m7991l() == 0) {
                            throw new ParserException("Variable length decription in sgpd found (unsupported)");
                        }
                    } else if (c2175k >= 2) {
                        c2175k2.m7981d(4);
                    }
                    if (c2175k2.m7991l() == 1) {
                        c2175k2.m7981d(2);
                        c2175k = c2175k2.m7986g() == 1 ? true : null;
                        if (c2175k != null) {
                            n = c2175k2.m7986g();
                            byte[] bArr = new byte[16];
                            c2175k2.m7975a(bArr, 0, bArr.length);
                            c2221l.f6986m = true;
                            c2221l.f6988o = new C2220k(c2175k, n, bArr);
                            return;
                        }
                        return;
                    }
                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: a */
    private static Pair<Long, C3965a> m19807a(C2175k c2175k, long j) {
        long l;
        long l2;
        C2175k c2175k2 = c2175k;
        c2175k2.m7979c(8);
        int a = C2203a.m8129a(c2175k.m7993n());
        c2175k2.m7981d(4);
        long l3 = c2175k.m7991l();
        if (a == 0) {
            l = c2175k.m7991l();
            l2 = j + c2175k.m7991l();
        } else {
            l = c2175k.m8001v();
            l2 = j + c2175k.m8001v();
        }
        long j2 = l2;
        l2 = l;
        long b = C2186s.m8057b(l2, 1000000, l3);
        c2175k2.m7981d(2);
        a = c2175k.m7987h();
        int[] iArr = new int[a];
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        long[] jArr3 = new long[a];
        long j3 = l2;
        l = b;
        int i = 0;
        while (i < a) {
            int n = c2175k.m7993n();
            if ((n & Integer.MIN_VALUE) == 0) {
                long l4 = c2175k.m7991l();
                iArr[i] = n & BaseClientBuilder.API_PRIORITY_OTHER;
                jArr[i] = j2;
                jArr3[i] = l;
                j3 += l4;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = a;
                int[] iArr2 = iArr;
                long[] jArr6 = jArr;
                l = C2186s.m8057b(j3, 1000000, l3);
                jArr4[i] = l - jArr5[i];
                c2175k2.m7981d(4);
                j2 += (long) iArr2[i];
                i++;
                jArr2 = jArr4;
                iArr = iArr2;
                jArr3 = jArr5;
                a = i2;
                jArr = jArr6;
            } else {
                throw new ParserException("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(b), new C3965a(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: d */
    private void m19835d(C2260g c2260g) {
        int size = this.f15879f.size();
        C2214b c2214b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2221l c2221l = ((C2214b) this.f15879f.valueAt(i)).f6918a;
            if (c2221l.f6991r && c2221l.f6977d < j) {
                long j2 = c2221l.f6977d;
                c2214b = (C2214b) this.f15879f.valueAt(i);
                j = j2;
            }
        }
        if (c2214b == null) {
            this.f15889p = 3;
            return;
        }
        size = (int) (j - c2260g.mo1589c());
        if (size >= 0) {
            c2260g.mo1586b(size);
            c2214b.f6918a.m8184a(c2260g);
            return;
        }
        throw new ParserException("Offset to encryption data was negative.");
    }

    /* renamed from: e */
    private boolean m19836e(C2260g c2260g) {
        byte[] bArr;
        C2260g c2260g2 = c2260g;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.f15889p == 3) {
            if (r0.f15898y == null) {
                C2214b a = C3975e.m19809a(r0.f15879f);
                if (a == null) {
                    int c = (int) (r0.f15894u - c2260g.mo1589c());
                    if (c >= 0) {
                        c2260g2.mo1586b(c);
                        m19811a();
                        return false;
                    }
                    throw new ParserException("Offset to end of mdat was negative.");
                }
                int c2 = (int) (a.f6918a.f6980g[a.f6924g] - c2260g.mo1589c());
                if (c2 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    c2 = 0;
                }
                c2260g2.mo1586b(c2);
                r0.f15898y = a;
            }
            r0.f15899z = r0.f15898y.f6918a.f6982i[r0.f15898y.f6922e];
            if (r0.f15898y.f6918a.f6986m) {
                r0.f15870A = m19805a(r0.f15898y);
                r0.f15899z += r0.f15870A;
            } else {
                r0.f15870A = 0;
            }
            if (r0.f15898y.f6920c.f6966g == 1) {
                r0.f15899z -= 8;
                c2260g2.mo1586b(8);
            }
            r0.f15889p = 4;
            r0.f15871B = 0;
        }
        C2221l c2221l = r0.f15898y.f6918a;
        C2219j c2219j = r0.f15898y.f6920c;
        C2267n c2267n = r0.f15898y.f6919b;
        int i4 = r0.f15898y.f6922e;
        if (c2219j.f6970k != 0) {
            byte[] bArr2 = r0.f15881h.f6735a;
            bArr2[0] = (byte) 0;
            bArr2[1] = (byte) 0;
            bArr2[2] = (byte) 0;
            int i5 = c2219j.f6970k + 1;
            int i6 = 4 - c2219j.f6970k;
            while (r0.f15870A < r0.f15899z) {
                if (r0.f15871B == 0) {
                    c2260g2.mo1587b(bArr2, i6, i5);
                    r0.f15881h.m7979c(i3);
                    r0.f15871B = r0.f15881h.m7999t() - i2;
                    r0.f15880g.m7979c(i3);
                    c2267n.mo1607a(r0.f15880g, i);
                    c2267n.mo1607a(r0.f15881h, i2);
                    boolean z = r0.f15875F != null && C2173i.m7953a(c2219j.f6965f.f6489f, bArr2[i]);
                    r0.f15872C = z;
                    r0.f15870A += 5;
                    r0.f15899z += i6;
                } else {
                    int i7;
                    if (r0.f15872C) {
                        r0.f15882i.m7972a(r0.f15871B);
                        c2260g2.mo1587b(r0.f15882i.f6735a, i3, r0.f15871B);
                        c2267n.mo1607a(r0.f15882i, r0.f15871B);
                        i7 = r0.f15871B;
                        i = C2173i.m7947a(r0.f15882i.f6735a, r0.f15882i.m7978c());
                        r0.f15882i.m7979c("video/hevc".equals(c2219j.f6965f.f6489f));
                        r0.f15882i.m7977b(i);
                        C2332g.m8524a(c2221l.m8185b(i4) * 1000, r0.f15882i, r0.f15875F);
                    } else {
                        i7 = c2267n.mo1604a(c2260g2, r0.f15871B, false);
                    }
                    r0.f15870A += i7;
                    r0.f15871B -= i7;
                    i = 4;
                    i2 = 1;
                    i3 = 0;
                }
            }
        } else {
            while (r0.f15870A < r0.f15899z) {
                r0.f15870A += c2267n.mo1604a(c2260g2, r0.f15899z - r0.f15870A, false);
            }
        }
        long b = c2221l.m8185b(i4) * 1000;
        int i8 = (c2221l.f6986m ? 1073741824 : 0) | c2221l.f6985l[i4];
        int i9 = c2221l.f6974a.f6907a;
        if (c2221l.f6986m) {
            bArr = (c2221l.f6988o != null ? c2221l.f6988o : c2219j.f6967h[i9]).f6973c;
        } else {
            bArr = null;
        }
        if (r0.f15884k != null) {
            b = r0.f15884k.m8033c(b);
        }
        c2267n.mo1605a(b, i8, r0.f15899z, 0, bArr);
        while (!r0.f15888o.isEmpty()) {
            C2213a c2213a = (C2213a) r0.f15888o.removeFirst();
            r0.f15895v -= c2213a.f6917b;
            r0.f15874E.mo1605a(c2213a.f6916a + b, 1, c2213a.f6917b, r0.f15895v, null);
        }
        C2214b c2214b = r0.f15898y;
        c2214b.f6922e++;
        c2214b = r0.f15898y;
        c2214b.f6923f++;
        if (r0.f15898y.f6923f == c2221l.f6981h[r0.f15898y.f6924g]) {
            c2214b = r0.f15898y;
            c2214b.f6924g++;
            r0.f15898y.f6923f = 0;
            r0.f15898y = null;
        }
        r0.f15889p = 3;
        return true;
    }

    /* renamed from: a */
    private static C2214b m19809a(SparseArray<C2214b> sparseArray) {
        int size = sparseArray.size();
        C2214b c2214b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C2214b c2214b2 = (C2214b) sparseArray.valueAt(i);
            if (c2214b2.f6924g != c2214b2.f6918a.f6978e) {
                long j2 = c2214b2.f6918a.f6980g[c2214b2.f6924g];
                if (j2 < j) {
                    c2214b = c2214b2;
                    j = j2;
                }
            }
        }
        return c2214b;
    }

    /* renamed from: a */
    private int m19805a(C2214b c2214b) {
        C2221l c2221l = c2214b.f6918a;
        C2175k c2175k = c2221l.f6990q;
        int i = (c2221l.f6988o != null ? c2221l.f6988o : c2214b.f6920c.f6967h[c2221l.f6974a.f6907a]).f6972b;
        boolean z = c2221l.f6987n[c2214b.f6922e];
        this.f15883j.f6735a[0] = (byte) ((z ? 128 : 0) | i);
        this.f15883j.m7979c(0);
        c2214b = c2214b.f6919b;
        c2214b.mo1607a(this.f15883j, 1);
        c2214b.mo1607a(c2175k, i);
        if (!z) {
            return i + 1;
        }
        int h = c2175k.m7987h();
        c2175k.m7981d(-2);
        h = (h * 6) + 2;
        c2214b.mo1607a(c2175k, h);
        return (i + 1) + h;
    }

    /* renamed from: a */
    private static DrmInitData m19808a(List<C3971b> list) {
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            C3971b c3971b = (C3971b) list.get(i);
            if (c3971b.aP == C2203a.f6851U) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                byte[] bArr = c3971b.aQ.f6735a;
                UUID a = C2217h.m8174a(bArr);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    list2.add(new SchemeData(a, "video/mp4", bArr));
                }
            }
        }
        if (list2 == null) {
            return null;
        }
        return new DrmInitData(list2);
    }

    /* renamed from: a */
    private static boolean m19823a(int i) {
        if (!(i == C2203a.f6849S || i == C2203a.f6848R || i == C2203a.f6833C || i == C2203a.f6831A || i == C2203a.f6850T || i == C2203a.f6879w || i == C2203a.f6880x || i == C2203a.f6845O || i == C2203a.f6881y || i == C2203a.f6882z || i == C2203a.f6851U || i == C2203a.ac || i == C2203a.ad || i == C2203a.ah || i == C2203a.ag || i == C2203a.ae || i == C2203a.af || i == C2203a.f6847Q || i == C2203a.f6844N)) {
            if (i != C2203a.aG) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m19829b(int i) {
        if (!(i == C2203a.f6832B || i == C2203a.f6834D || i == C2203a.f6835E || i == C2203a.f6836F || i == C2203a.f6837G || i == C2203a.f6841K || i == C2203a.f6842L || i == C2203a.f6843M)) {
            if (i != C2203a.f6846P) {
                return false;
            }
        }
        return true;
    }
}
