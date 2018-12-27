package com.google.android.exoplayer2.extractor.p131f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2259f;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.extractor.C2265l;
import com.google.android.exoplayer2.extractor.C2266m;
import com.google.android.exoplayer2.extractor.C2267n;

/* renamed from: com.google.android.exoplayer2.extractor.f.a */
public final class C4014a implements C2259f, C2266m {
    /* renamed from: a */
    public static final C2262i f16143a = new C40131();
    /* renamed from: b */
    private C2261h f16144b;
    /* renamed from: c */
    private C2267n f16145c;
    /* renamed from: d */
    private C2256b f16146d;
    /* renamed from: e */
    private int f16147e;
    /* renamed from: f */
    private int f16148f;

    /* renamed from: com.google.android.exoplayer2.extractor.f.a$1 */
    static class C40131 implements C2262i {
        C40131() {
        }

        /* renamed from: a */
        public C2259f[] mo1564a() {
            return new C2259f[]{new C4014a()};
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
        return C2258c.m8300a(c2260g) != null ? true : null;
    }

    /* renamed from: a */
    public void mo1575a(C2261h c2261h) {
        this.f16144b = c2261h;
        this.f16145c = c2261h.mo4053a(0, 1);
        this.f16146d = null;
        c2261h.mo4054a();
    }

    /* renamed from: a */
    public void mo1574a(long j, long j2) {
        this.f16148f = 0;
    }

    /* renamed from: a */
    public int mo1573a(C2260g c2260g, C2265l c2265l) {
        if (this.f16146d == null) {
            this.f16146d = C2258c.m8300a(c2260g);
            if (this.f16146d != null) {
                this.f16145c.mo1606a(Format.m7740a(null, "audio/raw", null, this.f16146d.m8294c(), 32768, this.f16146d.m8296e(), this.f16146d.m8295d(), this.f16146d.m8298g(), null, null, 0, null));
                this.f16147e = this.f16146d.m8292b();
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (this.f16146d.m8297f() == null) {
            C2258c.m8301a(c2260g, this.f16146d);
            this.f16144b.mo4057a(this);
        }
        c2265l = this.f16145c.mo1604a(c2260g, 32768 - this.f16148f, true);
        if (c2265l != -1) {
            this.f16148f += c2265l;
        }
        int i = this.f16148f / this.f16147e;
        if (i > 0) {
            long b = this.f16146d.m8293b(c2260g.mo1589c() - ((long) this.f16148f));
            int i2 = i * this.f16147e;
            this.f16148f -= i2;
            this.f16145c.mo1605a(b, 1, i2, this.f16148f, null);
        }
        if (c2265l == -1) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f16146d.m8289a();
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        return this.f16146d.m8290a(j);
    }
}
