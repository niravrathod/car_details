package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import com.google.android.exoplayer2.p126c.C2164b;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
final class C4015a extends TagPayloadReader {
    /* renamed from: b */
    private static final int[] f16149b = new int[]{5512, 11025, 22050, 44100};
    /* renamed from: c */
    private boolean f16150c;
    /* renamed from: d */
    private boolean f16151d;
    /* renamed from: e */
    private int f16152e;

    public C4015a(C2267n c2267n) {
        super(c2267n);
    }

    /* renamed from: a */
    protected boolean mo1621a(C2175k c2175k) {
        if (this.f16150c) {
            c2175k.m7981d(1);
        } else {
            int g = c2175k.m7986g();
            r0.f16152e = (g >> 4) & 15;
            if (r0.f16152e == 2) {
                r0.a.mo1606a(Format.m7741a(null, "audio/mpeg", null, -1, -1, 1, f16149b[(g >> 2) & 3], null, null, 0, null));
                r0.f16151d = true;
            } else {
                if (r0.f16152e != 7) {
                    if (r0.f16152e != 8) {
                        if (r0.f16152e != 10) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Audio format not supported: ");
                            stringBuilder.append(r0.f16152e);
                            throw new UnsupportedFormatException(stringBuilder.toString());
                        }
                    }
                }
                r0.a.mo1606a(Format.m7740a(null, r0.f16152e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (g & 1) == 1 ? 2 : 3, null, null, 0, null));
                r0.f16151d = true;
            }
            r0.f16150c = true;
        }
        return true;
    }

    /* renamed from: a */
    protected void mo1620a(C2175k c2175k, long j) {
        C2175k c2175k2 = c2175k;
        if (this.f16152e == 2) {
            int b = c2175k.m7976b();
            r0.a.mo1607a(c2175k2, b);
            r0.a.mo1605a(j, 1, b, 0, null);
            return;
        }
        int g = c2175k.m7986g();
        if (g == 0 && !r0.f16151d) {
            byte[] bArr = new byte[c2175k.m7976b()];
            c2175k2.m7975a(bArr, 0, bArr.length);
            Pair a = C2164b.m7921a(bArr);
            r0.a.mo1606a(Format.m7741a(null, "audio/mp4a-latm", null, -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            r0.f16151d = true;
        } else if (r0.f16152e != 10 || g == 1) {
            int b2 = c2175k.m7976b();
            r0.a.mo1607a(c2175k2, b2);
            r0.a.mo1605a(j, 1, b2, 0, null);
        }
    }
}
