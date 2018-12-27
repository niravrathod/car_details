package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;

/* renamed from: com.google.android.exoplayer2.extractor.e.t */
public final class C4007t implements C2249q {
    /* renamed from: a */
    private C2183q f16117a;
    /* renamed from: b */
    private C2267n f16118b;
    /* renamed from: c */
    private boolean f16119c;

    /* renamed from: a */
    public void mo1619a(C2183q c2183q, C2261h c2261h, C2254d c2254d) {
        this.f16117a = c2183q;
        c2254d.m8283a();
        this.f16118b = c2261h.mo4053a(c2254d.m8284b(), 4);
        this.f16118b.mo1606a(Format.m7745a(c2254d.m8285c(), "application/x-scte35", null, -1, null));
    }

    /* renamed from: a */
    public void mo1618a(C2175k c2175k) {
        if (!this.f16119c) {
            if (this.f16117a.m8032c() != -9223372036854775807L) {
                this.f16118b.mo1606a(Format.m7736a(null, "application/x-scte35", this.f16117a.m8032c()));
                this.f16119c = true;
            } else {
                return;
            }
        }
        int b = c2175k.m7976b();
        this.f16118b.mo1607a(c2175k, b);
        this.f16118b.mo1605a(this.f16117a.m8030b(), 1, b, 0, null);
    }
}
