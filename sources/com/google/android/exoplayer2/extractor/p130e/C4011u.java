package com.google.android.exoplayer2.extractor.p130e;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2251a;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2252b;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2253c;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.u */
public final class C4011u implements C2259f {
    /* renamed from: a */
    public static final C2262i f16127a = new C40081();
    /* renamed from: b */
    private static final long f16128b = ((long) C2186s.m8062e("AC-3"));
    /* renamed from: c */
    private static final long f16129c = ((long) C2186s.m8062e("EAC3"));
    /* renamed from: d */
    private static final long f16130d = ((long) C2186s.m8062e("HEVC"));
    /* renamed from: e */
    private final int f16131e;
    /* renamed from: f */
    private final List<C2183q> f16132f;
    /* renamed from: g */
    private final C2175k f16133g;
    /* renamed from: h */
    private final C2174j f16134h;
    /* renamed from: i */
    private final SparseIntArray f16135i;
    /* renamed from: j */
    private final C2253c f16136j;
    /* renamed from: k */
    private final SparseArray<C2255v> f16137k;
    /* renamed from: l */
    private final SparseBooleanArray f16138l;
    /* renamed from: m */
    private C2261h f16139m;
    /* renamed from: n */
    private int f16140n;
    /* renamed from: o */
    private boolean f16141o;
    /* renamed from: p */
    private C2255v f16142p;

    /* renamed from: com.google.android.exoplayer2.extractor.e.u$1 */
    static class C40081 implements C2262i {
        C40081() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C4011u()};
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.u$a */
    private class C4009a implements C2249q {
        /* renamed from: a */
        final /* synthetic */ C4011u f16120a;
        /* renamed from: b */
        private final C2174j f16121b = new C2174j(new byte[4]);

        /* renamed from: a */
        public void mo1619a(C2183q c2183q, C2261h c2261h, C2254d c2254d) {
        }

        public C4009a(C4011u c4011u) {
            this.f16120a = c4011u;
        }

        /* renamed from: a */
        public void mo1618a(C2175k c2175k) {
            if (c2175k.m7986g() == 0) {
                c2175k.m7981d(7);
                int b = c2175k.m7976b() / 4;
                for (int i = 0; i < b; i++) {
                    c2175k.m7973a(this.f16121b, 4);
                    int c = this.f16121b.m7966c(16);
                    this.f16121b.m7964b(3);
                    if (c == 0) {
                        this.f16121b.m7964b(13);
                    } else {
                        c = this.f16121b.m7966c(13);
                        this.f16120a.f16137k.put(c, new C4006r(new C4010b(this.f16120a, c)));
                        this.f16120a.f16140n = this.f16120a.f16140n + 1;
                    }
                }
                if (this.f16120a.f16131e != 2) {
                    this.f16120a.f16137k.remove(0);
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.u$b */
    private class C4010b implements C2249q {
        /* renamed from: a */
        final /* synthetic */ C4011u f16122a;
        /* renamed from: b */
        private final C2174j f16123b = new C2174j(new byte[5]);
        /* renamed from: c */
        private final SparseArray<C2255v> f16124c = new SparseArray();
        /* renamed from: d */
        private final SparseIntArray f16125d = new SparseIntArray();
        /* renamed from: e */
        private final int f16126e;

        /* renamed from: a */
        public void mo1619a(C2183q c2183q, C2261h c2261h, C2254d c2254d) {
        }

        public C4010b(C4011u c4011u, int i) {
            this.f16122a = c4011u;
            this.f16126e = i;
        }

        /* renamed from: a */
        public void mo1618a(C2175k c2175k) {
            C4010b c4010b = this;
            C2175k c2175k2 = c2175k;
            if (c2175k.m7986g() == 2) {
                C2183q c2183q;
                int h;
                int i;
                int i2;
                int b;
                int c;
                int c2;
                int c3;
                C2252b a;
                Object a2;
                int size;
                C2255v c2255v;
                C4011u c4011u;
                int i3 = 0;
                if (!(c4010b.f16122a.f16131e == 1 || c4010b.f16122a.f16131e == 2)) {
                    if (c4010b.f16122a.f16140n != 1) {
                        c2183q = new C2183q(((C2183q) c4010b.f16122a.f16132f.get(0)).m8028a());
                        c4010b.f16122a.f16132f.add(c2183q);
                        c2175k2.m7981d(2);
                        h = c2175k.m7987h();
                        i = 5;
                        c2175k2.m7981d(5);
                        c2175k2.m7973a(c4010b.f16123b, 2);
                        i2 = 4;
                        c4010b.f16123b.m7964b(4);
                        c2175k2.m7981d(c4010b.f16123b.m7966c(12));
                        if (c4010b.f16122a.f16131e == 2 && c4010b.f16122a.f16142p == null) {
                            c4010b.f16122a.f16142p = c4010b.f16122a.f16136j.mo1614a(21, new C2252b(21, null, null, new byte[0]));
                            c4010b.f16122a.f16142p.mo1617a(c2183q, c4010b.f16122a.f16139m, new C2254d(h, 21, 8192));
                        }
                        c4010b.f16124c.clear();
                        c4010b.f16125d.clear();
                        b = c2175k.m7976b();
                        while (b > 0) {
                            c2175k2.m7973a(c4010b.f16123b, i);
                            c = c4010b.f16123b.m7966c(8);
                            c4010b.f16123b.m7964b(3);
                            c2 = c4010b.f16123b.m7966c(13);
                            c4010b.f16123b.m7964b(i2);
                            c3 = c4010b.f16123b.m7966c(12);
                            a = m20055a(c2175k2, c3);
                            if (c == 6) {
                                c = a.f7153a;
                            }
                            b -= c3 + 5;
                            i2 = c4010b.f16122a.f16131e != 2 ? c : c2;
                            if (c4010b.f16122a.f16138l.get(i2)) {
                                if (c4010b.f16122a.f16131e == 2 || c != 21) {
                                    a2 = c4010b.f16122a.f16136j.mo1614a(c, a);
                                } else {
                                    a2 = c4010b.f16122a.f16142p;
                                }
                                if (c4010b.f16122a.f16131e == 2 || c2 < c4010b.f16125d.get(i2, 8192)) {
                                    c4010b.f16125d.put(i2, c2);
                                    c4010b.f16124c.put(i2, a2);
                                }
                            }
                            i = 5;
                            i2 = 4;
                        }
                        size = c4010b.f16125d.size();
                        for (i = 0; i < size; i++) {
                            b = c4010b.f16125d.keyAt(i);
                            c4010b.f16122a.f16138l.put(b, true);
                            c2255v = (C2255v) c4010b.f16124c.valueAt(i);
                            if (c2255v == null) {
                                if (c2255v != c4010b.f16122a.f16142p) {
                                    c2255v.mo1617a(c2183q, c4010b.f16122a.f16139m, new C2254d(h, b, 8192));
                                }
                                c4010b.f16122a.f16137k.put(c4010b.f16125d.valueAt(i), c2255v);
                            }
                        }
                        if (c4010b.f16122a.f16131e == 2) {
                            c4010b.f16122a.f16137k.remove(c4010b.f16126e);
                            c4011u = c4010b.f16122a;
                            if (c4010b.f16122a.f16131e == 1) {
                                i3 = c4010b.f16122a.f16140n - 1;
                            }
                            c4011u.f16140n = i3;
                            if (c4010b.f16122a.f16140n == 0) {
                                c4010b.f16122a.f16139m.mo4054a();
                                c4010b.f16122a.f16141o = true;
                            }
                        } else if (!c4010b.f16122a.f16141o) {
                            c4010b.f16122a.f16139m.mo4054a();
                            c4010b.f16122a.f16140n = 0;
                            c4010b.f16122a.f16141o = true;
                        }
                    }
                }
                c2183q = (C2183q) c4010b.f16122a.f16132f.get(0);
                c2175k2.m7981d(2);
                h = c2175k.m7987h();
                i = 5;
                c2175k2.m7981d(5);
                c2175k2.m7973a(c4010b.f16123b, 2);
                i2 = 4;
                c4010b.f16123b.m7964b(4);
                c2175k2.m7981d(c4010b.f16123b.m7966c(12));
                c4010b.f16122a.f16142p = c4010b.f16122a.f16136j.mo1614a(21, new C2252b(21, null, null, new byte[0]));
                c4010b.f16122a.f16142p.mo1617a(c2183q, c4010b.f16122a.f16139m, new C2254d(h, 21, 8192));
                c4010b.f16124c.clear();
                c4010b.f16125d.clear();
                b = c2175k.m7976b();
                while (b > 0) {
                    c2175k2.m7973a(c4010b.f16123b, i);
                    c = c4010b.f16123b.m7966c(8);
                    c4010b.f16123b.m7964b(3);
                    c2 = c4010b.f16123b.m7966c(13);
                    c4010b.f16123b.m7964b(i2);
                    c3 = c4010b.f16123b.m7966c(12);
                    a = m20055a(c2175k2, c3);
                    if (c == 6) {
                        c = a.f7153a;
                    }
                    b -= c3 + 5;
                    if (c4010b.f16122a.f16131e != 2) {
                    }
                    if (c4010b.f16122a.f16138l.get(i2)) {
                        if (c4010b.f16122a.f16131e == 2) {
                        }
                        a2 = c4010b.f16122a.f16136j.mo1614a(c, a);
                        if (c4010b.f16122a.f16131e == 2) {
                        }
                        c4010b.f16125d.put(i2, c2);
                        c4010b.f16124c.put(i2, a2);
                    }
                    i = 5;
                    i2 = 4;
                }
                size = c4010b.f16125d.size();
                for (i = 0; i < size; i++) {
                    b = c4010b.f16125d.keyAt(i);
                    c4010b.f16122a.f16138l.put(b, true);
                    c2255v = (C2255v) c4010b.f16124c.valueAt(i);
                    if (c2255v == null) {
                        if (c2255v != c4010b.f16122a.f16142p) {
                            c2255v.mo1617a(c2183q, c4010b.f16122a.f16139m, new C2254d(h, b, 8192));
                        }
                        c4010b.f16122a.f16137k.put(c4010b.f16125d.valueAt(i), c2255v);
                    }
                }
                if (c4010b.f16122a.f16131e == 2) {
                    c4010b.f16122a.f16137k.remove(c4010b.f16126e);
                    c4011u = c4010b.f16122a;
                    if (c4010b.f16122a.f16131e == 1) {
                        i3 = c4010b.f16122a.f16140n - 1;
                    }
                    c4011u.f16140n = i3;
                    if (c4010b.f16122a.f16140n == 0) {
                        c4010b.f16122a.f16139m.mo4054a();
                        c4010b.f16122a.f16141o = true;
                    }
                } else if (c4010b.f16122a.f16141o) {
                    c4010b.f16122a.f16139m.mo4054a();
                    c4010b.f16122a.f16140n = 0;
                    c4010b.f16122a.f16141o = true;
                }
            }
        }

        /* renamed from: a */
        private C2252b m20055a(C2175k c2175k, int i) {
            int d = c2175k.m7980d();
            i += d;
            String str = null;
            int i2 = -1;
            List list = null;
            while (c2175k.m7980d() < i) {
                int g = c2175k.m7986g();
                int d2 = c2175k.m7980d() + c2175k.m7986g();
                if (g == 5) {
                    long l = c2175k.m7991l();
                    if (l != C4011u.f16128b) {
                        if (l == C4011u.f16129c) {
                            i2 = 135;
                            c2175k.m7981d(d2 - c2175k.m7980d());
                        } else {
                            if (l == C4011u.f16130d) {
                                i2 = 36;
                            }
                            c2175k.m7981d(d2 - c2175k.m7980d());
                        }
                    }
                } else if (g != 106) {
                    if (g != 122) {
                        if (g == 123) {
                            i2 = 138;
                        } else if (g == 10) {
                            str = c2175k.m7983e(3).trim();
                        } else if (g == 89) {
                            List arrayList = new ArrayList();
                            while (c2175k.m7980d() < d2) {
                                String trim = c2175k.m7983e(3).trim();
                                g = c2175k.m7986g();
                                byte[] bArr = new byte[4];
                                c2175k.m7975a(bArr, 0, 4);
                                arrayList.add(new C2251a(trim, g, bArr));
                            }
                            list = arrayList;
                            i2 = 89;
                        }
                        c2175k.m7981d(d2 - c2175k.m7980d());
                    }
                    i2 = 135;
                    c2175k.m7981d(d2 - c2175k.m7980d());
                }
                i2 = 129;
                c2175k.m7981d(d2 - c2175k.m7980d());
            }
            c2175k.m7979c(i);
            return new C2252b(i2, str, list, Arrays.copyOfRange(c2175k.f6735a, d, i));
        }
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C4011u() {
        this(0);
    }

    public C4011u(int i) {
        this(1, i);
    }

    public C4011u(int i, int i2) {
        this(i, new C2183q(0), new C3995e(i2));
    }

    public C4011u(int i, C2183q c2183q, C2253c c2253c) {
        this.f16136j = (C2253c) C2163a.m7914a((Object) c2253c);
        this.f16131e = i;
        if (i != 1) {
            if (i != 2) {
                this.f16132f = new ArrayList();
                this.f16132f.add(c2183q);
                this.f16133g = new C2175k(940);
                this.f16134h = new C2174j(new byte[3]);
                this.f16138l = new SparseBooleanArray();
                this.f16137k = new SparseArray();
                this.f16135i = new SparseIntArray();
                m20069e();
            }
        }
        this.f16132f = Collections.singletonList(c2183q);
        this.f16133g = new C2175k(940);
        this.f16134h = new C2174j(new byte[3]);
        this.f16138l = new SparseBooleanArray();
        this.f16137k = new SparseArray();
        this.f16135i = new SparseIntArray();
        m20069e();
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        byte[] bArr = this.f16133g.f6735a;
        c2260g.mo1591c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] != (byte) 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            c2260g.mo1586b(i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f16139m = c2261h;
        c2261h.mo4057a(new C4021a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        j = this.f16132f.size();
        for (int i = 0; i < j; i++) {
            ((C2183q) this.f16132f.get(i)).m8034d();
        }
        this.f16133g.m7971a();
        this.f16135i.clear();
        m20069e();
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        int b;
        byte[] bArr = this.f16133g.f6735a;
        if (940 - this.f16133g.m7980d() < 188) {
            b = this.f16133g.m7976b();
            if (b > 0) {
                System.arraycopy(bArr, this.f16133g.m7980d(), bArr, 0, b);
            }
            this.f16133g.m7974a(bArr, b);
        }
        while (this.f16133g.m7976b() < 188) {
            b = this.f16133g.m7978c();
            int a = c2260g.mo1582a(bArr, b, 940 - b);
            if (a == -1) {
                return -1;
            }
            this.f16133g.m7977b(b + a);
        }
        c2260g = this.f16133g.m7978c();
        b = this.f16133g.m7980d();
        while (b < c2260g && bArr[b] != (byte) 71) {
            b++;
        }
        this.f16133g.m7979c(b);
        b += 188;
        if (b > c2260g) {
            return 0;
        }
        boolean z = true;
        this.f16133g.m7981d(1);
        this.f16133g.m7973a(this.f16134h, 3);
        if (this.f16134h.m7968d() != null) {
            this.f16133g.m7979c(b);
            return 0;
        }
        Object obj;
        C2255v c2255v;
        c2265l = this.f16134h.m7968d();
        this.f16134h.m7964b(1);
        a = this.f16134h.m7966c(13);
        this.f16134h.m7964b(2);
        boolean d = this.f16134h.m7968d();
        boolean d2 = this.f16134h.m7968d();
        int c = this.f16134h.m7966c(4);
        if (this.f16131e != 2) {
            int i = this.f16135i.get(a, c - 1);
            this.f16135i.put(a, c);
            if (i == c) {
                if (d2) {
                    this.f16133g.m7979c(b);
                    return 0;
                }
            } else if (c != (i + 1) % 16) {
                obj = 1;
                if (d) {
                    this.f16133g.m7981d(this.f16133g.m7986g());
                }
                if (d2) {
                    c2255v = (C2255v) this.f16137k.get(a);
                    if (c2255v != null) {
                        if (obj != null) {
                            c2255v.mo1615a();
                        }
                        this.f16133g.m7977b(b);
                        c2255v.mo1616a(this.f16133g, c2265l);
                        if (this.f16133g.m7980d() <= b) {
                            z = false;
                        }
                        C2163a.m7918b(z);
                        this.f16133g.m7977b(c2260g);
                    }
                }
                this.f16133g.m7979c(b);
                return 0;
            }
        }
        obj = null;
        if (d) {
            this.f16133g.m7981d(this.f16133g.m7986g());
        }
        if (d2) {
            c2255v = (C2255v) this.f16137k.get(a);
            if (c2255v != null) {
                if (obj != null) {
                    c2255v.mo1615a();
                }
                this.f16133g.m7977b(b);
                c2255v.mo1616a(this.f16133g, c2265l);
                if (this.f16133g.m7980d() <= b) {
                    z = false;
                }
                C2163a.m7918b(z);
                this.f16133g.m7977b(c2260g);
            }
        }
        this.f16133g.m7979c(b);
        return 0;
    }

    /* renamed from: e */
    private void m20069e() {
        this.f16138l.clear();
        this.f16137k.clear();
        SparseArray a = this.f16136j.mo1613a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f16137k.put(a.keyAt(i), a.valueAt(i));
        }
        this.f16137k.put(0, new C4006r(new C4009a(this)));
        this.f16142p = null;
    }
}
