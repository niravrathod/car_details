package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2251a;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.g */
public final class C3997g implements C2241h {
    /* renamed from: a */
    private final List<C2251a> f16025a;
    /* renamed from: b */
    private final C2267n[] f16026b;
    /* renamed from: c */
    private boolean f16027c;
    /* renamed from: d */
    private int f16028d;
    /* renamed from: e */
    private int f16029e;
    /* renamed from: f */
    private long f16030f;

    public C3997g(List<C2251a> list) {
        this.f16025a = list;
        this.f16026b = new C2267n[list.size()];
    }

    /* renamed from: a */
    public void mo1608a() {
        this.f16027c = false;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        for (int i = 0; i < this.f16026b.length; i++) {
            C2251a c2251a = (C2251a) this.f16025a.get(i);
            c2254d.m8283a();
            C2267n a = c2261h.mo4053a(c2254d.m8284b(), 3);
            a.mo1606a(Format.m7746a(c2254d.m8285c(), "application/dvbsubs", null, -1, Collections.singletonList(c2251a.f7152c), c2251a.f7150a, null));
            this.f16026b[i] = a;
        }
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        if (z) {
            this.f16027c = true;
            this.f16030f = j;
            this.f16029e = 0;
            this.f16028d = 2;
        }
    }

    /* renamed from: b */
    public void mo1612b() {
        if (this.f16027c) {
            for (C2267n a : this.f16026b) {
                a.mo1605a(this.f16030f, 1, this.f16029e, 0, null);
            }
            this.f16027c = false;
        }
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        if (this.f16027c && (this.f16028d != 2 || m19990a(c2175k, 32))) {
            int i = 0;
            if (this.f16028d != 1 || m19990a(c2175k, 0)) {
                int d = c2175k.m7980d();
                int b = c2175k.m7976b();
                C2267n[] c2267nArr = this.f16026b;
                int length = c2267nArr.length;
                while (i < length) {
                    C2267n c2267n = c2267nArr[i];
                    c2175k.m7979c(d);
                    c2267n.mo1607a(c2175k, b);
                    i++;
                }
                this.f16029e += b;
            }
        }
    }

    /* renamed from: a */
    private boolean m19990a(C2175k c2175k, int i) {
        if (c2175k.m7976b() == 0) {
            return false;
        }
        if (c2175k.m7986g() != i) {
            this.f16027c = false;
        }
        this.f16028d--;
        return this.f16027c;
    }
}
