package com.google.android.exoplayer2.extractor.p128c;

import com.google.android.exoplayer2.extractor.C2260g;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.c.i */
final class C2218i {
    /* renamed from: a */
    private static final int[] f6959a = new int[]{C2186s.m8062e("isom"), C2186s.m8062e("iso2"), C2186s.m8062e("iso3"), C2186s.m8062e("iso4"), C2186s.m8062e("iso5"), C2186s.m8062e("iso6"), C2186s.m8062e("avc1"), C2186s.m8062e("hvc1"), C2186s.m8062e("hev1"), C2186s.m8062e("mp41"), C2186s.m8062e("mp42"), C2186s.m8062e("3g2a"), C2186s.m8062e("3g2b"), C2186s.m8062e("3gr6"), C2186s.m8062e("3gs6"), C2186s.m8062e("3ge6"), C2186s.m8062e("3gg6"), C2186s.m8062e("M4V "), C2186s.m8062e("M4A "), C2186s.m8062e("f4v "), C2186s.m8062e("kddi"), C2186s.m8062e("M4VP"), C2186s.m8062e("qt  "), C2186s.m8062e("MSNV")};

    /* renamed from: a */
    public static boolean m8177a(C2260g c2260g) {
        return C2218i.m8178a(c2260g, true);
    }

    /* renamed from: b */
    public static boolean m8179b(C2260g c2260g) {
        return C2218i.m8178a(c2260g, false);
    }

    /* renamed from: a */
    private static boolean m8178a(C2260g c2260g, boolean z) {
        boolean z2;
        C2260g c2260g2 = c2260g;
        long d = c2260g.mo1592d();
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i = (int) d;
        C2175k c2175k = new C2175k(64);
        boolean z3 = false;
        int i2 = 0;
        Object obj = null;
        while (i2 < i) {
            c2175k.m7972a(8);
            c2260g2.mo1591c(c2175k.f6735a, 0, 8);
            long l = c2175k.m7991l();
            int n = c2175k.m7993n();
            int i3 = 16;
            if (l == 1) {
                c2260g2.mo1591c(c2175k.f6735a, 8, 8);
                c2175k.m7977b(16);
                l = c2175k.m8001v();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (l >= j) {
                i2 += i3;
                if (n != C2203a.f6832B) {
                    if (n != C2203a.f6841K) {
                        if (n != C2203a.f6843M) {
                            if ((((long) i2) + l) - j >= ((long) i)) {
                                break;
                            }
                            int i4 = (int) (l - j);
                            i2 += i4;
                            if (n == C2203a.f6857a) {
                                if (i4 < 8) {
                                    return false;
                                }
                                c2175k.m7972a(i4);
                                c2260g2.mo1591c(c2175k.f6735a, 0, i4);
                                i4 /= 4;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if (i5 == 1) {
                                        c2175k.m7981d(4);
                                    } else if (C2218i.m8176a(c2175k.m7993n())) {
                                        obj = 1;
                                        break;
                                    }
                                }
                                if (obj == null) {
                                    return false;
                                }
                            } else if (i4 != 0) {
                                c2260g2.mo1590c(i4);
                            }
                        }
                    }
                    z2 = true;
                    break;
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (obj != null && z == r0) {
            z3 = true;
        }
        return z3;
    }

    /* renamed from: a */
    private static boolean m8176a(int i) {
        if ((i >>> 8) == C2186s.m8062e("3gp")) {
            return true;
        }
        for (int i2 : f6959a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
