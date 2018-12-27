package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.e.r */
public final class C4006r implements C2255v {
    /* renamed from: a */
    private final C2249q f16111a;
    /* renamed from: b */
    private final C2175k f16112b = new C2175k(32);
    /* renamed from: c */
    private int f16113c;
    /* renamed from: d */
    private int f16114d;
    /* renamed from: e */
    private boolean f16115e;
    /* renamed from: f */
    private boolean f16116f;

    public C4006r(C2249q c2249q) {
        this.f16111a = c2249q;
    }

    /* renamed from: a */
    public void mo1617a(C2183q c2183q, C2261h c2261h, C2254d c2254d) {
        this.f16111a.mo1619a(c2183q, c2261h, c2254d);
        this.f16116f = true;
    }

    /* renamed from: a */
    public void mo1615a() {
        this.f16116f = true;
    }

    /* renamed from: a */
    public void mo1616a(C2175k c2175k, boolean z) {
        int g = z ? c2175k.m7986g() + c2175k.m7980d() : -1;
        if (this.f16116f) {
            if (z) {
                this.f16116f = false;
                c2175k.m7979c(g);
                this.f16114d = 0;
            } else {
                return;
            }
        }
        while (c2175k.m7976b() <= false) {
            boolean z2 = true;
            if (this.f16114d < true) {
                if (!this.f16114d) {
                    z = c2175k.m7986g();
                    c2175k.m7979c(c2175k.m7980d() - 1);
                    if (z) {
                        this.f16116f = true;
                        return;
                    }
                }
                z = Math.min(c2175k.m7976b(), 3 - this.f16114d);
                c2175k.m7975a(this.f16112b.f6735a, this.f16114d, z);
                this.f16114d += z;
                if (this.f16114d) {
                    this.f16112b.m7972a(3);
                    this.f16112b.m7981d(1);
                    z = this.f16112b.m7986g();
                    int g2 = this.f16112b.m7986g();
                    if ((z & 128) == 0) {
                        z2 = false;
                    }
                    this.f16115e = z2;
                    this.f16113c = (((z & 15) << 8) | g2) + true;
                    if (this.f16112b.m7982e() < this.f16113c) {
                        z = this.f16112b.f6735a;
                        this.f16112b.m7972a(Math.min(4098, Math.max(this.f16113c, z.length * 2)));
                        System.arraycopy(z, 0, this.f16112b.f6735a, 0, 3);
                    }
                }
            } else {
                z = Math.min(c2175k.m7976b(), this.f16113c - this.f16114d);
                c2175k.m7975a(this.f16112b.f6735a, this.f16114d, z);
                this.f16114d += z;
                if (this.f16114d != this.f16113c) {
                    continue;
                } else {
                    if (!this.f16115e) {
                        this.f16112b.m7972a(this.f16113c);
                    } else if (C2186s.m8042a(this.f16112b.f6735a, 0, this.f16113c, -1)) {
                        this.f16116f = true;
                        return;
                    } else {
                        this.f16112b.m7972a(this.f16113c - 4);
                    }
                    this.f16111a.mo1618a(this.f16112b);
                    this.f16114d = 0;
                }
            }
        }
    }
}
