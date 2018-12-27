package com.google.android.exoplayer2.extractor.p128c;

import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.c.l */
final class C2221l {
    /* renamed from: a */
    public C2209c f6974a;
    /* renamed from: b */
    public long f6975b;
    /* renamed from: c */
    public long f6976c;
    /* renamed from: d */
    public long f6977d;
    /* renamed from: e */
    public int f6978e;
    /* renamed from: f */
    public int f6979f;
    /* renamed from: g */
    public long[] f6980g;
    /* renamed from: h */
    public int[] f6981h;
    /* renamed from: i */
    public int[] f6982i;
    /* renamed from: j */
    public int[] f6983j;
    /* renamed from: k */
    public long[] f6984k;
    /* renamed from: l */
    public boolean[] f6985l;
    /* renamed from: m */
    public boolean f6986m;
    /* renamed from: n */
    public boolean[] f6987n;
    /* renamed from: o */
    public C2220k f6988o;
    /* renamed from: p */
    public int f6989p;
    /* renamed from: q */
    public C2175k f6990q;
    /* renamed from: r */
    public boolean f6991r;
    /* renamed from: s */
    public long f6992s;

    C2221l() {
    }

    /* renamed from: a */
    public void m8180a() {
        this.f6978e = 0;
        this.f6992s = 0;
        this.f6986m = false;
        this.f6991r = false;
        this.f6988o = null;
    }

    /* renamed from: a */
    public void m8182a(int i, int i2) {
        this.f6978e = i;
        this.f6979f = i2;
        if (this.f6981h == null || this.f6981h.length < i) {
            this.f6980g = new long[i];
            this.f6981h = new int[i];
        }
        if (this.f6982i == 0 || this.f6982i.length < i2) {
            i2 = (i2 * 125) / 100;
            this.f6982i = new int[i2];
            this.f6983j = new int[i2];
            this.f6984k = new long[i2];
            this.f6985l = new boolean[i2];
            this.f6987n = new boolean[i2];
        }
    }

    /* renamed from: a */
    public void m8181a(int i) {
        if (this.f6990q == null || this.f6990q.m7978c() < i) {
            this.f6990q = new C2175k(i);
        }
        this.f6989p = i;
        this.f6986m = true;
        this.f6991r = true;
    }

    /* renamed from: a */
    public void m8184a(C2260g c2260g) {
        c2260g.mo1587b(this.f6990q.f6735a, 0, this.f6989p);
        this.f6990q.m7979c(0);
        this.f6991r = false;
    }

    /* renamed from: a */
    public void m8183a(C2175k c2175k) {
        c2175k.m7975a(this.f6990q.f6735a, 0, this.f6989p);
        this.f6990q.m7979c(0);
        this.f6991r = false;
    }

    /* renamed from: b */
    public long m8185b(int i) {
        return this.f6984k[i] + ((long) this.f6983j[i]);
    }
}
