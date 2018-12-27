package com.google.android.exoplayer2.extractor.p130e;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m.C4021a;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;

/* renamed from: com.google.android.exoplayer2.extractor.e.p */
public final class C4005p implements C2259f {
    /* renamed from: a */
    public static final C2262i f16103a = new C40041();
    /* renamed from: b */
    private final C2183q f16104b;
    /* renamed from: c */
    private final SparseArray<C2248a> f16105c;
    /* renamed from: d */
    private final C2175k f16106d;
    /* renamed from: e */
    private boolean f16107e;
    /* renamed from: f */
    private boolean f16108f;
    /* renamed from: g */
    private boolean f16109g;
    /* renamed from: h */
    private C2261h f16110h;

    /* renamed from: com.google.android.exoplayer2.extractor.e.p$a */
    private static final class C2248a {
        /* renamed from: a */
        private final C2241h f7140a;
        /* renamed from: b */
        private final C2183q f7141b;
        /* renamed from: c */
        private final C2174j f7142c = new C2174j(new byte[64]);
        /* renamed from: d */
        private boolean f7143d;
        /* renamed from: e */
        private boolean f7144e;
        /* renamed from: f */
        private boolean f7145f;
        /* renamed from: g */
        private int f7146g;
        /* renamed from: h */
        private long f7147h;

        public C2248a(C2241h c2241h, C2183q c2183q) {
            this.f7140a = c2241h;
            this.f7141b = c2183q;
        }

        /* renamed from: a */
        public void m8274a() {
            this.f7145f = false;
            this.f7140a.mo1608a();
        }

        /* renamed from: a */
        public void m8275a(C2175k c2175k) {
            c2175k.m7975a(this.f7142c.f6731a, 0, 3);
            this.f7142c.m7960a(0);
            m8272b();
            c2175k.m7975a(this.f7142c.f6731a, 0, this.f7146g);
            this.f7142c.m7960a(0);
            m8273c();
            this.f7140a.mo1609a(this.f7147h, true);
            this.f7140a.mo1610a(c2175k);
            this.f7140a.mo1612b();
        }

        /* renamed from: b */
        private void m8272b() {
            this.f7142c.m7964b(8);
            this.f7143d = this.f7142c.m7968d();
            this.f7144e = this.f7142c.m7968d();
            this.f7142c.m7964b(6);
            this.f7146g = this.f7142c.m7966c(8);
        }

        /* renamed from: c */
        private void m8273c() {
            this.f7147h = 0;
            if (this.f7143d) {
                this.f7142c.m7964b(4);
                long c = ((long) this.f7142c.m7966c(3)) << 30;
                this.f7142c.m7964b(1);
                c |= (long) (this.f7142c.m7966c(15) << 15);
                this.f7142c.m7964b(1);
                c |= (long) this.f7142c.m7966c(15);
                this.f7142c.m7964b(1);
                if (!this.f7145f && this.f7144e) {
                    this.f7142c.m7964b(4);
                    long c2 = ((long) this.f7142c.m7966c(3)) << 30;
                    this.f7142c.m7964b(1);
                    c2 |= (long) (this.f7142c.m7966c(15) << 15);
                    this.f7142c.m7964b(1);
                    c2 |= (long) this.f7142c.m7966c(15);
                    this.f7142c.m7964b(1);
                    this.f7141b.m8031b(c2);
                    this.f7145f = true;
                }
                this.f7147h = this.f7141b.m8031b(c);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.p$1 */
    static class C40041 implements C2262i {
        C40041() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C4005p()};
        }
    }

    /* renamed from: c */
    public void mo1577c() {
    }

    public C4005p() {
        this(new C2183q(0));
    }

    public C4005p(C2183q c2183q) {
        this.f16104b = c2183q;
        this.f16106d = new C2175k(4096);
        this.f16105c = new SparseArray();
    }

    /* renamed from: a */
    public boolean mo1576a(C2260g c2260g) {
        byte[] bArr = new byte[14];
        boolean z = false;
        c2260g.mo1591c(bArr, 0, 14);
        if (442 != (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c2260g.mo1590c(bArr[13] & 7);
        c2260g.mo1591c(bArr, 0, 3);
        if (1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255))) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f16110h = c2261h;
        c2261h.mo4057a(new C4021a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f16104b.m8034d();
        for (j = null; j < this.f16105c.size(); j++) {
            ((C2248a) this.f16105c.valueAt(j)).m8274a();
        }
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        if (c2260g.mo1588b(this.f16106d.f6735a, 0, 4, true) == null) {
            return -1;
        }
        this.f16106d.m7979c(0);
        c2265l = this.f16106d.m7993n();
        if (c2265l == 441) {
            return -1;
        }
        if (c2265l == 442) {
            c2260g.mo1591c(this.f16106d.f6735a, 0, 10);
            this.f16106d.m7979c(9);
            c2260g.mo1586b((this.f16106d.m7986g() & 7) + 14);
            return 0;
        } else if (c2265l == 443) {
            c2260g.mo1591c(this.f16106d.f6735a, 0, 2);
            this.f16106d.m7979c(0);
            c2260g.mo1586b(this.f16106d.m7987h() + 6);
            return 0;
        } else if (((c2265l & -256) >> 8) != 1) {
            c2260g.mo1586b(1);
            return 0;
        } else {
            c2265l &= 255;
            C2248a c2248a = (C2248a) this.f16105c.get(c2265l);
            if (!this.f16107e) {
                if (c2248a == null) {
                    C2241h c2241h = null;
                    if (!this.f16108f && c2265l == 189) {
                        c2241h = new C3991b();
                        this.f16108f = true;
                    } else if (!this.f16108f && (c2265l & 224) == 192) {
                        c2241h = new C4002m();
                        this.f16108f = true;
                    } else if (!this.f16109g && (c2265l & 240) == 224) {
                        c2241h = new C3998i();
                        this.f16109g = true;
                    }
                    if (c2241h != null) {
                        c2241h.mo1611a(this.f16110h, new C2254d(c2265l, 256));
                        c2248a = new C2248a(c2241h, this.f16104b);
                        this.f16105c.put(c2265l, c2248a);
                    }
                }
                if (!(this.f16108f == null || this.f16109g == null) || c2260g.mo1589c() > 1048576) {
                    this.f16107e = true;
                    this.f16110h.mo4054a();
                }
            }
            c2260g.mo1591c(this.f16106d.f6735a, 0, 2);
            this.f16106d.m7979c(0);
            c2265l = this.f16106d.m7987h() + 6;
            if (c2248a == null) {
                c2260g.mo1586b(c2265l);
            } else {
                this.f16106d.m7972a(c2265l);
                c2260g.mo1587b(this.f16106d.f6735a, 0, c2265l);
                this.f16106d.m7979c(6);
                c2248a.m8275a(this.f16106d);
                this.f16106d.m7977b(this.f16106d.m7982e());
            }
            return 0;
        }
    }
}
