package com.google.android.exoplayer2.extractor.p130e;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.extractor.e.l */
public final class C4001l implements C2241h {
    /* renamed from: a */
    private final C2175k f16073a = new C2175k(10);
    /* renamed from: b */
    private C2267n f16074b;
    /* renamed from: c */
    private boolean f16075c;
    /* renamed from: d */
    private long f16076d;
    /* renamed from: e */
    private int f16077e;
    /* renamed from: f */
    private int f16078f;

    /* renamed from: a */
    public void mo1608a() {
        this.f16075c = false;
    }

    /* renamed from: a */
    public void mo1611a(C2261h c2261h, C2254d c2254d) {
        c2254d.m8283a();
        this.f16074b = c2261h.mo4053a(c2254d.m8284b(), 4);
        this.f16074b.mo1606a(Format.m7745a(c2254d.m8285c(), "application/id3", null, -1, null));
    }

    /* renamed from: a */
    public void mo1609a(long j, boolean z) {
        if (z) {
            this.f16075c = true;
            this.f16076d = j;
            this.f16077e = 0;
            this.f16078f = 0;
        }
    }

    /* renamed from: a */
    public void mo1610a(C2175k c2175k) {
        if (this.f16075c) {
            int b = c2175k.m7976b();
            if (this.f16078f < 10) {
                int min = Math.min(b, 10 - this.f16078f);
                System.arraycopy(c2175k.f6735a, c2175k.m7980d(), this.f16073a.f6735a, this.f16078f, min);
                if (this.f16078f + min == 10) {
                    this.f16073a.m7979c(0);
                    if (73 == this.f16073a.m7986g() && 68 == this.f16073a.m7986g()) {
                        if (51 == this.f16073a.m7986g()) {
                            this.f16073a.m7981d(3);
                            this.f16077e = this.f16073a.m7998s() + 10;
                        }
                    }
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f16075c = false;
                    return;
                }
            }
            b = Math.min(b, this.f16077e - this.f16078f);
            this.f16074b.mo1607a(c2175k, b);
            this.f16078f += b;
        }
    }

    /* renamed from: b */
    public void mo1612b() {
        if (this.f16075c && this.f16077e != 0) {
            if (this.f16078f == this.f16077e) {
                this.f16074b.mo1605a(this.f16076d, 1, this.f16077e, 0, null);
                this.f16075c = false;
            }
        }
    }
}
