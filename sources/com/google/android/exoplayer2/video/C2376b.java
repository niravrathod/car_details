package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.b */
public final class C2376b {
    /* renamed from: a */
    public final List<byte[]> f7544a;
    /* renamed from: b */
    public final int f7545b;

    /* renamed from: a */
    public static C2376b m8714a(C2175k c2175k) {
        try {
            int i;
            int h;
            c2175k.m7981d(21);
            int g = c2175k.m7986g() & 3;
            int g2 = c2175k.m7986g();
            int d = c2175k.m7980d();
            int i2 = 0;
            int i3 = 0;
            while (i2 < g2) {
                c2175k.m7981d(1);
                int h2 = c2175k.m7987h();
                i = i3;
                for (i3 = 0; i3 < h2; i3++) {
                    h = c2175k.m7987h();
                    i += h + 4;
                    c2175k.m7981d(h);
                }
                i2++;
                i3 = i;
            }
            c2175k.m7979c(d);
            Object obj = new byte[i3];
            i2 = 0;
            i = 0;
            while (i2 < g2) {
                c2175k.m7981d(1);
                h = c2175k.m7987h();
                int i4 = i;
                for (i = 0; i < h; i++) {
                    int h3 = c2175k.m7987h();
                    System.arraycopy(C2173i.f6727a, 0, obj, i4, C2173i.f6727a.length);
                    i4 += C2173i.f6727a.length;
                    System.arraycopy(c2175k.f6735a, c2175k.m7980d(), obj, i4, h3);
                    i4 += h3;
                    c2175k.m7981d(h3);
                }
                i2++;
                i = i4;
            }
            if (i3 == 0) {
                c2175k = null;
            } else {
                c2175k = Collections.singletonList(obj);
            }
            return new C2376b(c2175k, g + 1);
        } catch (C2175k c2175k2) {
            throw new ParserException("Error parsing HEVC config", c2175k2);
        }
    }

    private C2376b(List<byte[]> list, int i) {
        this.f7544a = list;
        this.f7545b = i;
    }
}
