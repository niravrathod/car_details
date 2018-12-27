package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.video.C2375a;

/* renamed from: com.google.android.exoplayer2.extractor.flv.d */
final class C4019d extends TagPayloadReader {
    /* renamed from: b */
    private final C2175k f16169b = new C2175k(C2173i.f6727a);
    /* renamed from: c */
    private final C2175k f16170c = new C2175k(4);
    /* renamed from: d */
    private int f16171d;
    /* renamed from: e */
    private boolean f16172e;
    /* renamed from: f */
    private int f16173f;

    public C4019d(C2267n c2267n) {
        super(c2267n);
    }

    /* renamed from: a */
    protected boolean mo1621a(C2175k c2175k) {
        c2175k = c2175k.m7986g();
        int i = (c2175k >> 4) & 15;
        c2175k &= 15;
        if (c2175k == 7) {
            this.f16173f = i;
            return i != 5 ? true : null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Video format not supported: ");
            stringBuilder.append(c2175k);
            throw new UnsupportedFormatException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    protected void mo1620a(C2175k c2175k, long j) {
        int g = c2175k.m7986g();
        long k = j + (((long) c2175k.m7990k()) * 1000);
        if (g == 0 && !this.f16172e) {
            C2175k c2175k2 = new C2175k(new byte[c2175k.m7976b()]);
            c2175k.m7975a(c2175k2.f6735a, 0, c2175k.m7976b());
            c2175k = C2375a.m8712a(c2175k2);
            this.f16171d = c2175k.f7540b;
            this.a.mo1606a(Format.m7737a(null, "video/avc", null, -1, -1, c2175k.f7541c, c2175k.f7542d, -1.0f, c2175k.f7539a, -1, c2175k.f7543e, null));
            this.f16172e = true;
        } else if (g == 1 && this.f16172e) {
            byte[] bArr = this.f16170c.f6735a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            g = 4 - this.f16171d;
            int i = 0;
            while (c2175k.m7976b() > 0) {
                c2175k.m7975a(this.f16170c.f6735a, g, this.f16171d);
                this.f16170c.m7979c(0);
                int t = this.f16170c.m7999t();
                this.f16169b.m7979c(0);
                this.a.mo1607a(this.f16169b, 4);
                i += 4;
                this.a.mo1607a(c2175k, t);
                i += t;
            }
            this.a.mo1605a(k, this.f16173f == 1 ? 1 : 0, i, 0, null);
        }
    }
}
