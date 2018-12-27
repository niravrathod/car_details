package com.google.android.exoplayer2.extractor.p131f;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.f.c */
final class C2258c {

    /* renamed from: com.google.android.exoplayer2.extractor.f.c$a */
    private static final class C2257a {
        /* renamed from: a */
        public final int f7170a;
        /* renamed from: b */
        public final long f7171b;

        private C2257a(int i, long j) {
            this.f7170a = i;
            this.f7171b = j;
        }

        /* renamed from: a */
        public static C2257a m8299a(C2260g c2260g, C2175k c2175k) {
            c2260g.mo1591c(c2175k.f6735a, 0, 8);
            c2175k.m7979c(0);
            return new C2257a(c2175k.m7993n(), c2175k.m7992m());
        }
    }

    /* renamed from: a */
    public static C2256b m8300a(C2260g c2260g) {
        C2163a.m7914a((Object) c2260g);
        C2175k c2175k = new C2175k(16);
        if (C2257a.m8299a(c2260g, c2175k).f7170a != C2186s.m8062e("RIFF")) {
            return null;
        }
        c2260g.mo1591c(c2175k.f6735a, 0, 4);
        c2175k.m7979c(0);
        int n = c2175k.m7993n();
        if (n != C2186s.m8062e("WAVE")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported RIFF format: ");
            stringBuilder.append(n);
            Log.e("WavHeaderReader", stringBuilder.toString());
            return null;
        }
        C2257a a = C2257a.m8299a(c2260g, c2175k);
        while (a.f7170a != C2186s.m8062e("fmt ")) {
            c2260g.mo1590c((int) a.f7171b);
            a = C2257a.m8299a(c2260g, c2175k);
        }
        C2163a.m7918b(a.f7171b >= 16);
        c2260g.mo1591c(c2175k.f6735a, 0, 16);
        c2175k.m7979c(0);
        int i = c2175k.m7988i();
        int i2 = c2175k.m7988i();
        int u = c2175k.m8000u();
        int u2 = c2175k.m8000u();
        int i3 = c2175k.m7988i();
        int i4 = c2175k.m7988i();
        int i5 = (i2 * i4) / 8;
        if (i3 == i5) {
            int b = C2186s.m8054b(i4);
            if (b == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported WAV bit depth: ");
                stringBuilder.append(i4);
                Log.e("WavHeaderReader", stringBuilder.toString());
                return null;
            } else if (i == 1 || i == 65534) {
                c2260g.mo1590c(((int) a.f7171b) - 16);
                return new C2256b(i2, u, u2, i3, i4, b);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported WAV format type: ");
                stringBuilder.append(i);
                Log.e("WavHeaderReader", stringBuilder.toString());
                return null;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Expected block alignment: ");
        stringBuilder2.append(i5);
        stringBuilder2.append("; got: ");
        stringBuilder2.append(i3);
        throw new ParserException(stringBuilder2.toString());
    }

    /* renamed from: a */
    public static void m8301a(C2260g c2260g, C2256b c2256b) {
        C2163a.m7914a((Object) c2260g);
        C2163a.m7914a((Object) c2256b);
        c2260g.mo1583a();
        C2175k c2175k = new C2175k(8);
        C2257a a = C2257a.m8299a(c2260g, c2175k);
        while (a.f7170a != C2186s.m8062e("data")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring unknown WAV chunk: ");
            stringBuilder.append(a.f7170a);
            Log.w("WavHeaderReader", stringBuilder.toString());
            long j = a.f7171b + 8;
            if (a.f7170a == C2186s.m8062e("RIFF")) {
                j = 12;
            }
            if (j <= 2147483647L) {
                c2260g.mo1586b((int) j);
                a = C2257a.m8299a(c2260g, c2175k);
            } else {
                c2256b = new StringBuilder();
                c2256b.append("Chunk is too large (~2GB+) to skip; id: ");
                c2256b.append(a.f7170a);
                throw new ParserException(c2256b.toString());
            }
        }
        c2260g.mo1586b(8);
        c2256b.m8291a(c2260g.mo1589c(), a.f7171b);
    }
}
