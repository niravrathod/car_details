package com.google.android.exoplayer2.extractor.p130e;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2173i.C2171a;
import com.google.android.exoplayer2.p126c.C2173i.C2172b;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2176l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.j */
public final class C3999j implements C2241h {
    /* renamed from: a */
    private final C2250s f16045a;
    /* renamed from: b */
    private final boolean f16046b;
    /* renamed from: c */
    private final boolean f16047c;
    /* renamed from: d */
    private final C2247n f16048d = new C2247n(true, 128);
    /* renamed from: e */
    private final C2247n f16049e = new C2247n(true, 128);
    /* renamed from: f */
    private final C2247n f16050f = new C2247n(true, 128);
    /* renamed from: g */
    private long f16051g;
    /* renamed from: h */
    private final boolean[] f16052h = new boolean[3];
    /* renamed from: i */
    private String f16053i;
    /* renamed from: j */
    private C2267n f16054j;
    /* renamed from: k */
    private C2245a f16055k;
    /* renamed from: l */
    private boolean f16056l;
    /* renamed from: m */
    private long f16057m;
    /* renamed from: n */
    private final C2175k f16058n = new C2175k();

    /* renamed from: com.google.android.exoplayer2.extractor.e.j$a */
    private static final class C2245a {
        /* renamed from: a */
        private final C2267n f7104a;
        /* renamed from: b */
        private final boolean f7105b;
        /* renamed from: c */
        private final boolean f7106c;
        /* renamed from: d */
        private final SparseArray<C2172b> f7107d = new SparseArray();
        /* renamed from: e */
        private final SparseArray<C2171a> f7108e = new SparseArray();
        /* renamed from: f */
        private final C2176l f7109f = new C2176l(this.f7110g, 0, 0);
        /* renamed from: g */
        private byte[] f7110g = new byte[128];
        /* renamed from: h */
        private int f7111h;
        /* renamed from: i */
        private int f7112i;
        /* renamed from: j */
        private long f7113j;
        /* renamed from: k */
        private boolean f7114k;
        /* renamed from: l */
        private long f7115l;
        /* renamed from: m */
        private C2244a f7116m = new C2244a();
        /* renamed from: n */
        private C2244a f7117n = new C2244a();
        /* renamed from: o */
        private boolean f7118o;
        /* renamed from: p */
        private long f7119p;
        /* renamed from: q */
        private long f7120q;
        /* renamed from: r */
        private boolean f7121r;

        /* renamed from: com.google.android.exoplayer2.extractor.e.j$a$a */
        private static final class C2244a {
            /* renamed from: a */
            private boolean f7088a;
            /* renamed from: b */
            private boolean f7089b;
            /* renamed from: c */
            private C2172b f7090c;
            /* renamed from: d */
            private int f7091d;
            /* renamed from: e */
            private int f7092e;
            /* renamed from: f */
            private int f7093f;
            /* renamed from: g */
            private int f7094g;
            /* renamed from: h */
            private boolean f7095h;
            /* renamed from: i */
            private boolean f7096i;
            /* renamed from: j */
            private boolean f7097j;
            /* renamed from: k */
            private boolean f7098k;
            /* renamed from: l */
            private int f7099l;
            /* renamed from: m */
            private int f7100m;
            /* renamed from: n */
            private int f7101n;
            /* renamed from: o */
            private int f7102o;
            /* renamed from: p */
            private int f7103p;

            private C2244a() {
            }

            /* renamed from: a */
            public void m8250a() {
                this.f7089b = false;
                this.f7088a = false;
            }

            /* renamed from: a */
            public void m8251a(int i) {
                this.f7092e = i;
                this.f7089b = true;
            }

            /* renamed from: a */
            public void m8252a(C2172b c2172b, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f7090c = c2172b;
                this.f7091d = i;
                this.f7092e = i2;
                this.f7093f = i3;
                this.f7094g = i4;
                this.f7095h = z;
                this.f7096i = z2;
                this.f7097j = z3;
                this.f7098k = z4;
                this.f7099l = i5;
                this.f7100m = i6;
                this.f7101n = i7;
                this.f7102o = i8;
                this.f7103p = i9;
                this.f7088a = true;
                this.f7089b = true;
            }

            /* renamed from: b */
            public boolean m8253b() {
                return this.f7089b && (this.f7092e == 7 || this.f7092e == 2);
            }

            /* renamed from: a */
            private boolean m8248a(C2244a c2244a) {
                if (this.f7088a) {
                    if (!c2244a.f7088a || this.f7093f != c2244a.f7093f || this.f7094g != c2244a.f7094g || this.f7095h != c2244a.f7095h) {
                        return true;
                    }
                    if (this.f7096i && c2244a.f7096i && this.f7097j != c2244a.f7097j) {
                        return true;
                    }
                    if (this.f7091d != c2244a.f7091d && (this.f7091d == 0 || c2244a.f7091d == 0)) {
                        return true;
                    }
                    if (this.f7090c.f6724h == 0 && c2244a.f7090c.f6724h == 0 && (this.f7100m != c2244a.f7100m || this.f7101n != c2244a.f7101n)) {
                        return true;
                    }
                    if ((this.f7090c.f6724h == 1 && c2244a.f7090c.f6724h == 1 && (this.f7102o != c2244a.f7102o || this.f7103p != c2244a.f7103p)) || this.f7098k != c2244a.f7098k) {
                        return true;
                    }
                    if (this.f7098k && c2244a.f7098k && this.f7099l != c2244a.f7099l) {
                        return true;
                    }
                }
                return false;
            }
        }

        public C2245a(C2267n c2267n, boolean z, boolean z2) {
            this.f7104a = c2267n;
            this.f7105b = z;
            this.f7106c = z2;
            m8261b();
        }

        /* renamed from: a */
        public boolean m8260a() {
            return this.f7106c;
        }

        /* renamed from: a */
        public void m8258a(C2172b c2172b) {
            this.f7107d.append(c2172b.f6717a, c2172b);
        }

        /* renamed from: a */
        public void m8257a(C2171a c2171a) {
            this.f7108e.append(c2171a.f6714a, c2171a);
        }

        /* renamed from: b */
        public void m8261b() {
            this.f7114k = false;
            this.f7118o = false;
            this.f7117n.m8250a();
        }

        /* renamed from: a */
        public void m8256a(long j, int i, long j2) {
            this.f7112i = i;
            this.f7115l = j2;
            this.f7113j = j;
            if (this.f7105b == null || this.f7112i != 1) {
                if (this.f7106c == null) {
                    return;
                }
                if (!(this.f7112i == 5 || this.f7112i == 1 || this.f7112i == 2)) {
                    return;
                }
            }
            j = this.f7116m;
            this.f7116m = this.f7117n;
            this.f7117n = j;
            this.f7117n.m8250a();
            this.f7111h = 0;
            this.f7114k = true;
        }

        /* renamed from: a */
        public void m8259a(byte[] bArr, int i, int i2) {
            int i3 = i;
            if (this.f7114k) {
                int i4 = i2 - i3;
                if (r0.f7110g.length < r0.f7111h + i4) {
                    r0.f7110g = Arrays.copyOf(r0.f7110g, (r0.f7111h + i4) * 2);
                }
                System.arraycopy(bArr, i3, r0.f7110g, r0.f7111h, i4);
                r0.f7111h += i4;
                r0.f7109f.m8010a(r0.f7110g, 0, r0.f7111h);
                if (r0.f7109f.m8013b(8)) {
                    r0.f7109f.m8009a(1);
                    int c = r0.f7109f.m8015c(2);
                    r0.f7109f.m8009a(5);
                    if (r0.f7109f.m8012b()) {
                        r0.f7109f.m8014c();
                        if (r0.f7109f.m8012b()) {
                            int c2 = r0.f7109f.m8014c();
                            if (!r0.f7106c) {
                                r0.f7114k = false;
                                r0.f7117n.m8251a(c2);
                            } else if (r0.f7109f.m8012b()) {
                                int c3 = r0.f7109f.m8014c();
                                if (r0.f7108e.indexOfKey(c3) < 0) {
                                    r0.f7114k = false;
                                    return;
                                }
                                C2171a c2171a = (C2171a) r0.f7108e.get(c3);
                                C2172b c2172b = (C2172b) r0.f7107d.get(c2171a.f6715b);
                                if (c2172b.f6721e) {
                                    if (r0.f7109f.m8013b(2)) {
                                        r0.f7109f.m8009a(2);
                                    } else {
                                        return;
                                    }
                                }
                                if (r0.f7109f.m8013b(c2172b.f6723g)) {
                                    boolean z;
                                    boolean a;
                                    boolean z2;
                                    boolean z3;
                                    int i5;
                                    int i6;
                                    int d;
                                    int i7;
                                    int i8;
                                    int c4 = r0.f7109f.m8015c(c2172b.f6723g);
                                    if (c2172b.f6722f) {
                                        z = false;
                                    } else if (r0.f7109f.m8013b(1)) {
                                        boolean a2 = r0.f7109f.m8011a();
                                        if (!a2) {
                                            z = a2;
                                        } else if (r0.f7109f.m8013b(1)) {
                                            z = a2;
                                            a = r0.f7109f.m8011a();
                                            z2 = true;
                                            z3 = r0.f7112i != 5;
                                            if (z3) {
                                                i5 = 0;
                                            } else if (!r0.f7109f.m8012b()) {
                                                i5 = r0.f7109f.m8014c();
                                            } else {
                                                return;
                                            }
                                            if (c2172b.f6724h != 0) {
                                                if (!r0.f7109f.m8013b(c2172b.f6725i)) {
                                                    i4 = r0.f7109f.m8015c(c2172b.f6725i);
                                                    if (c2171a.f6716c || z) {
                                                        i6 = i4;
                                                    } else if (r0.f7109f.m8012b()) {
                                                        d = r0.f7109f.m8016d();
                                                        i6 = i4;
                                                        i7 = 0;
                                                        i8 = 0;
                                                        r0.f7117n.m8252a(c2172b, c, c2, c4, c3, z, z2, a, z3, i5, i6, d, i7, i8);
                                                        r0.f7114k = false;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                return;
                                            } else if (c2172b.f6724h == 1 || c2172b.f6726j) {
                                                i6 = 0;
                                            } else if (r0.f7109f.m8012b()) {
                                                i4 = r0.f7109f.m8016d();
                                                if (!c2171a.f6716c || z) {
                                                    i7 = i4;
                                                    i6 = 0;
                                                    d = 0;
                                                    i8 = 0;
                                                    r0.f7117n.m8252a(c2172b, c, c2, c4, c3, z, z2, a, z3, i5, i6, d, i7, i8);
                                                    r0.f7114k = false;
                                                } else if (r0.f7109f.m8012b()) {
                                                    i8 = r0.f7109f.m8016d();
                                                    i7 = i4;
                                                    i6 = 0;
                                                    d = 0;
                                                    r0.f7117n.m8252a(c2172b, c, c2, c4, c3, z, z2, a, z3, i5, i6, d, i7, i8);
                                                    r0.f7114k = false;
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                            d = 0;
                                            i7 = 0;
                                            i8 = 0;
                                            r0.f7117n.m8252a(c2172b, c, c2, c4, c3, z, z2, a, z3, i5, i6, d, i7, i8);
                                            r0.f7114k = false;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                    z2 = false;
                                    a = false;
                                    if (r0.f7112i != 5) {
                                    }
                                    if (z3) {
                                        i5 = 0;
                                    } else if (!r0.f7109f.m8012b()) {
                                        i5 = r0.f7109f.m8014c();
                                    } else {
                                        return;
                                    }
                                    if (c2172b.f6724h != 0) {
                                        if (c2172b.f6724h == 1) {
                                        }
                                        i6 = 0;
                                    } else if (!r0.f7109f.m8013b(c2172b.f6725i)) {
                                        i4 = r0.f7109f.m8015c(c2172b.f6725i);
                                        if (c2171a.f6716c) {
                                        }
                                        i6 = i4;
                                    } else {
                                        return;
                                    }
                                    d = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    r0.f7117n.m8252a(c2172b, c, c2, c4, c3, z, z2, a, z3, i5, i6, d, i7, i8);
                                    r0.f7114k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void m8255a(long j, int i) {
            int i2 = 0;
            if (this.f7112i == 9 || (this.f7106c && this.f7117n.m8248a(this.f7116m))) {
                if (this.f7118o) {
                    m8254a(i + ((int) (j - this.f7113j)));
                }
                this.f7119p = this.f7113j;
                this.f7120q = this.f7115l;
                this.f7121r = false;
                this.f7118o = true;
            }
            j = this.f7121r;
            if (this.f7112i == 5 || (this.f7105b && this.f7112i == 1 && this.f7117n.m8253b())) {
                i2 = 1;
            }
            this.f7121r = j | i2;
        }

        /* renamed from: a */
        private void m8254a(int i) {
            this.f7104a.mo1605a(this.f7120q, this.f7121r, (int) (this.f7113j - this.f7119p), i, null);
        }
    }

    /* renamed from: b */
    public void mo1612b() {
    }

    public C3999j(C2250s c2250s, boolean z, boolean z2) {
        this.f16045a = c2250s;
        this.f16046b = z;
        this.f16047c = z2;
    }

    /* renamed from: a */
    public void mo1608a() {
        C2173i.m7952a(this.f16052h);
        this.f16048d.m8267a();
        this.f16049e.m8267a();
        this.f16050f.m8267a();
        this.f16055k.m8261b();
        this.f16051g = 0;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f16053i = c2254d.m8285c();
        this.f16054j = c2261h.mo4053a(c2254d.m8284b(), 2);
        this.f16055k = new C2245a(this.f16054j, this.f16046b, this.f16047c);
        this.f16045a.m8279a(c2261h, c2254d);
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f16057m = j;
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        int d = c2175k.m7980d();
        int c = c2175k.m7978c();
        byte[] bArr = c2175k.f6735a;
        this.f16051g += (long) c2175k.m7976b();
        this.f16054j.mo1607a(c2175k, c2175k.m7976b());
        while (true) {
            int a = C2173i.m7948a(bArr, d, c, this.f16052h);
            if (a == c) {
                m20004a(bArr, d, c);
                return;
            }
            int b = C2173i.m7954b(bArr, a);
            int i = a - d;
            if (i > 0) {
                m20004a(bArr, d, a);
            }
            int i2 = c - a;
            long j = this.f16051g - ((long) i2);
            m20002a(j, i2, i < 0 ? -i : 0, this.f16057m);
            m20003a(j, b, this.f16057m);
            d = a + 3;
        }
    }

    /* renamed from: a */
    private void m20003a(long j, int i, long j2) {
        if (!this.f16056l || this.f16055k.m8260a()) {
            this.f16048d.m8268a(i);
            this.f16049e.m8268a(i);
        }
        this.f16050f.m8268a(i);
        this.f16055k.m8256a(j, i, j2);
    }

    /* renamed from: a */
    private void m20004a(byte[] bArr, int i, int i2) {
        if (!this.f16056l || this.f16055k.m8260a()) {
            this.f16048d.m8269a(bArr, i, i2);
            this.f16049e.m8269a(bArr, i, i2);
        }
        this.f16050f.m8269a(bArr, i, i2);
        this.f16055k.m8259a(bArr, i, i2);
    }

    /* renamed from: a */
    private void m20002a(long j, int i, int i2, long j2) {
        int i3 = i2;
        if (!this.f16056l || r0.f16055k.m8260a()) {
            r0.f16048d.m8271b(i3);
            r0.f16049e.m8271b(i3);
            if (r0.f16056l) {
                if (r0.f16048d.m8270b()) {
                    r0.f16055k.m8258a(C2173i.m7949a(r0.f16048d.f7135a, 3, r0.f16048d.f7136b));
                    r0.f16048d.m8267a();
                } else if (r0.f16049e.m8270b()) {
                    r0.f16055k.m8257a(C2173i.m7955b(r0.f16049e.f7135a, 3, r0.f16049e.f7136b));
                    r0.f16049e.m8267a();
                }
            } else if (r0.f16048d.m8270b() && r0.f16049e.m8270b()) {
                List arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(r0.f16048d.f7135a, r0.f16048d.f7136b));
                arrayList.add(Arrays.copyOf(r0.f16049e.f7135a, r0.f16049e.f7136b));
                C2172b a = C2173i.m7949a(r0.f16048d.f7135a, 3, r0.f16048d.f7136b);
                C2171a b = C2173i.m7955b(r0.f16049e.f7135a, 3, r0.f16049e.f7136b);
                r0.f16054j.mo1606a(Format.m7737a(r0.f16053i, "video/avc", null, -1, -1, a.f6718b, a.f6719c, -1.0f, arrayList, -1, a.f6720d, null));
                r0.f16056l = true;
                r0.f16055k.m8258a(a);
                r0.f16055k.m8257a(b);
                r0.f16048d.m8267a();
                r0.f16049e.m8267a();
            }
        }
        if (r0.f16050f.m8271b(i2)) {
            r0.f16058n.m7974a(r0.f16050f.f7135a, C2173i.m7947a(r0.f16050f.f7135a, r0.f16050f.f7136b));
            r0.f16058n.m7979c(4);
            r0.f16045a.m8278a(j2, r0.f16058n);
        }
        r0.f16055k.m8255a(j, i);
    }
}
