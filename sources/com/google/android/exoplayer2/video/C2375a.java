package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.p126c.C2164b;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.a */
public final class C2375a {
    /* renamed from: a */
    public final List<byte[]> f7539a;
    /* renamed from: b */
    public final int f7540b;
    /* renamed from: c */
    public final int f7541c;
    /* renamed from: d */
    public final int f7542d;
    /* renamed from: e */
    public final float f7543e;

    /* renamed from: a */
    public static C2375a m8712a(C2175k c2175k) {
        try {
            c2175k.m7981d(4);
            int g = (c2175k.m7986g() & 3) + 1;
            if (g != 3) {
                int i;
                int i2;
                float f;
                int i3;
                List arrayList = new ArrayList();
                int g2 = c2175k.m7986g() & 31;
                for (i = 0; i < g2; i++) {
                    arrayList.add(C2375a.m8713b(c2175k));
                }
                i = c2175k.m7986g();
                for (i2 = 0; i2 < i; i2++) {
                    arrayList.add(C2375a.m8713b(c2175k));
                }
                if (g2 > 0) {
                    c2175k = C2173i.m7949a((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                    g2 = c2175k.f6718b;
                    int i4 = c2175k.f6719c;
                    f = c2175k.f6720d;
                    i2 = g2;
                    i3 = i4;
                } else {
                    i2 = -1;
                    i3 = -1;
                    f = 1.0f;
                }
                return new C2375a(arrayList, g, i2, i3, f);
            }
            throw new IllegalStateException();
        } catch (C2175k c2175k2) {
            throw new ParserException("Error parsing AVC config", c2175k2);
        }
    }

    private C2375a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f7539a = list;
        this.f7540b = i;
        this.f7541c = i2;
        this.f7542d = i3;
        this.f7543e = f;
    }

    /* renamed from: b */
    private static byte[] m8713b(C2175k c2175k) {
        int h = c2175k.m7987h();
        int d = c2175k.m7980d();
        c2175k.m7981d(h);
        return C2164b.m7923a(c2175k.f6735a, d, h);
    }
}
