package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C2137a;
import com.google.android.exoplayer2.audio.C2137a.C2136a;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.e.b */
public final class C3991b implements C2241h {
    /* renamed from: a */
    private final C2174j f15976a;
    /* renamed from: b */
    private final C2175k f15977b;
    /* renamed from: c */
    private final String f15978c;
    /* renamed from: d */
    private String f15979d;
    /* renamed from: e */
    private C2267n f15980e;
    /* renamed from: f */
    private int f15981f;
    /* renamed from: g */
    private int f15982g;
    /* renamed from: h */
    private boolean f15983h;
    /* renamed from: i */
    private long f15984i;
    /* renamed from: j */
    private Format f15985j;
    /* renamed from: k */
    private int f15986k;
    /* renamed from: l */
    private long f15987l;

    /* renamed from: b */
    public void mo1612b() {
    }

    public C3991b() {
        this(null);
    }

    public C3991b(String str) {
        this.f15976a = new C2174j(new byte[8]);
        this.f15977b = new C2175k(this.f15976a.f6731a);
        this.f15981f = 0;
        this.f15978c = str;
    }

    /* renamed from: a */
    public void mo1608a() {
        this.f15981f = 0;
        this.f15982g = 0;
        this.f15983h = false;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f15979d = c2254d.m8285c();
        this.f15980e = c2261h.mo4053a(c2254d.m8284b(), 1);
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        this.f15987l = j;
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        while (c2175k.m7976b() > 0) {
            switch (this.f15981f) {
                case 0:
                    if (!m19951b(c2175k)) {
                        break;
                    }
                    this.f15981f = 1;
                    this.f15977b.f6735a[0] = (byte) 11;
                    this.f15977b.f6735a[1] = (byte) 119;
                    this.f15982g = 2;
                    break;
                case 1:
                    if (!m19950a(c2175k, this.f15977b.f6735a, 8)) {
                        break;
                    }
                    m19952c();
                    this.f15977b.m7979c(0);
                    this.f15980e.mo1607a(this.f15977b, 8);
                    this.f15981f = 2;
                    break;
                case 2:
                    int min = Math.min(c2175k.m7976b(), this.f15986k - this.f15982g);
                    this.f15980e.mo1607a(c2175k, min);
                    this.f15982g += min;
                    if (this.f15982g != this.f15986k) {
                        break;
                    }
                    this.f15980e.mo1605a(this.f15987l, 1, this.f15986k, 0, null);
                    this.f15987l += this.f15984i;
                    this.f15981f = 0;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private boolean m19950a(C2175k c2175k, byte[] bArr, int i) {
        int min = Math.min(c2175k.m7976b(), i - this.f15982g);
        c2175k.m7975a(bArr, this.f15982g, min);
        this.f15982g += min;
        return this.f15982g == i ? true : null;
    }

    /* renamed from: b */
    private boolean m19951b(C2175k c2175k) {
        while (true) {
            boolean z = false;
            if (c2175k.m7976b() <= 0) {
                return false;
            }
            if (this.f15983h) {
                int g = c2175k.m7986g();
                if (g == 119) {
                    this.f15983h = false;
                    return true;
                }
                if (g == 11) {
                    z = true;
                }
                this.f15983h = z;
            } else {
                if (c2175k.m7986g() == 11) {
                    z = true;
                }
                this.f15983h = z;
            }
        }
    }

    /* renamed from: c */
    private void m19952c() {
        this.f15976a.m7960a(0);
        C2136a a = C2137a.m7851a(this.f15976a);
        if (!(this.f15985j != null && a.f6602c == this.f15985j.f6501r && a.f6601b == this.f15985j.f6502s && a.f6600a == this.f15985j.f6489f)) {
            this.f15985j = Format.m7741a(this.f15979d, a.f6600a, null, -1, -1, a.f6602c, a.f6601b, null, null, 0, this.f15978c);
            this.f15980e.mo1606a(this.f15985j);
        }
        this.f15986k = a.f6603d;
        this.f15984i = (((long) a.f6604e) * 1000000) / ((long) this.f15985j.f6502s);
    }
}
