package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2264k;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.e.m */
public final class C4002m implements C2241h {
    /* renamed from: a */
    private final C2175k f16079a;
    /* renamed from: b */
    private final C2264k f16080b;
    /* renamed from: c */
    private final String f16081c;
    /* renamed from: d */
    private String f16082d;
    /* renamed from: e */
    private C2267n f16083e;
    /* renamed from: f */
    private int f16084f;
    /* renamed from: g */
    private int f16085g;
    /* renamed from: h */
    private boolean f16086h;
    /* renamed from: i */
    private boolean f16087i;
    /* renamed from: j */
    private long f16088j;
    /* renamed from: k */
    private int f16089k;
    /* renamed from: l */
    private long f16090l;

    /* renamed from: b */
    public void mo1612b() {
    }

    public C4002m() {
        this(null);
    }

    public C4002m(String str) {
        this.f16084f = 0;
        this.f16079a = new C2175k(4);
        this.f16079a.f6735a[0] = (byte) -1;
        this.f16080b = new C2264k();
        this.f16081c = str;
    }

    /* renamed from: a */
    public void mo1608a() {
        this.f16084f = 0;
        this.f16085g = 0;
        this.f16087i = false;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f16082d = c2254d.m8285c();
        this.f16083e = c2261h.mo4053a(c2254d.m8284b(), 1);
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f16090l = j;
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        while (c2175k.m7976b() > 0) {
            switch (this.f16084f) {
                case 0:
                    m20026b(c2175k);
                    break;
                case 1:
                    m20027c(c2175k);
                    break;
                case 2:
                    m20028d(c2175k);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m20026b(C2175k c2175k) {
        byte[] bArr = c2175k.f6735a;
        int c = c2175k.m7978c();
        for (int d = c2175k.m7980d(); d < c; d++) {
            boolean z = (bArr[d] & 255) == 255;
            Object obj = (this.f16087i && (bArr[d] & 224) == 224) ? 1 : null;
            this.f16087i = z;
            if (obj != null) {
                c2175k.m7979c(d + 1);
                this.f16087i = false;
                this.f16079a.f6735a[1] = bArr[d];
                this.f16085g = 2;
                this.f16084f = 1;
                return;
            }
        }
        c2175k.m7979c(c);
    }

    /* renamed from: c */
    private void m20027c(C2175k c2175k) {
        int min = Math.min(c2175k.m7976b(), 4 - this.f16085g);
        c2175k.m7975a(this.f16079a.f6735a, this.f16085g, min);
        this.f16085g += min;
        if (this.f16085g >= 4) {
            r0.f16079a.m7979c(0);
            if (C2264k.m8332a(r0.f16079a.m7993n(), r0.f16080b)) {
                r0.f16089k = r0.f16080b.f7186c;
                if (!r0.f16086h) {
                    r0.f16088j = (((long) r0.f16080b.f7190g) * 1000000) / ((long) r0.f16080b.f7187d);
                    r0.f16083e.mo1606a(Format.m7741a(r0.f16082d, r0.f16080b.f7185b, null, -1, 4096, r0.f16080b.f7188e, r0.f16080b.f7187d, null, null, 0, r0.f16081c));
                    r0.f16086h = true;
                }
                r0.f16079a.m7979c(0);
                r0.f16083e.mo1607a(r0.f16079a, 4);
                r0.f16084f = 2;
                return;
            }
            r0.f16085g = 0;
            r0.f16084f = 1;
        }
    }

    /* renamed from: d */
    private void m20028d(C2175k c2175k) {
        int min = Math.min(c2175k.m7976b(), this.f16089k - this.f16085g);
        this.f16083e.mo1607a(c2175k, min);
        this.f16085g += min;
        if (this.f16085g >= this.f16089k) {
            this.f16083e.mo1605a(this.f16090l, 1, this.f16089k, 0, null);
            this.f16090l += this.f16088j;
            this.f16085g = 0;
            this.f16084f = 0;
        }
    }
}
