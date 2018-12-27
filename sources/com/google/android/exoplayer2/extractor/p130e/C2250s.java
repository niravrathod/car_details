package com.google.android.exoplayer2.extractor.p130e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2261h;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2254d;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.text.p132a.C2332g;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.s */
final class C2250s {
    /* renamed from: a */
    private final List<Format> f7148a;
    /* renamed from: b */
    private final C2267n[] f7149b;

    public C2250s(List<Format> list) {
        this.f7148a = list;
        this.f7149b = new C2267n[list.size()];
    }

    /* renamed from: a */
    public void m8279a(C2261h c2261h, C2254d c2254d) {
        for (int i = 0; i < this.f7149b.length; i++) {
            boolean z;
            StringBuilder stringBuilder;
            c2254d.m8283a();
            C2267n a = c2261h.mo4053a(c2254d.m8284b(), 3);
            Format format = (Format) this.f7148a.get(i);
            String str = format.f6489f;
            if (!"application/cea-608".equals(str)) {
                if (!"application/cea-708".equals(str)) {
                    z = false;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid closed caption mime type provided: ");
                    stringBuilder.append(str);
                    C2163a.m7917a(z, stringBuilder.toString());
                    a.mo1606a(Format.m7742a(c2254d.m8285c(), str, null, -1, format.f6507x, format.f6508y, format.f6509z, null));
                    this.f7149b[i] = a;
                }
            }
            z = true;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid closed caption mime type provided: ");
            stringBuilder.append(str);
            C2163a.m7917a(z, stringBuilder.toString());
            a.mo1606a(Format.m7742a(c2254d.m8285c(), str, null, -1, format.f6507x, format.f6508y, format.f6509z, null));
            this.f7149b[i] = a;
        }
    }

    /* renamed from: a */
    public void m8278a(long j, C2175k c2175k) {
        C2332g.m8524a(j, c2175k, this.f7149b);
    }
}
