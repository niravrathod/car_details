package com.google.android.exoplayer2.text.p132a;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.p126c.C2175k;

/* renamed from: com.google.android.exoplayer2.text.a.g */
public final class C2332g {
    /* renamed from: a */
    public static void m8524a(long j, C2175k c2175k, C2267n[] c2267nArr) {
        while (c2175k.m7976b() > 1) {
            int a = C2332g.m8523a(c2175k);
            int a2 = C2332g.m8523a(c2175k);
            if (a2 != -1) {
                if (a2 <= c2175k.m7976b()) {
                    if (C2332g.m8525a(a, a2, c2175k)) {
                        c2175k.m7981d(8);
                        a = c2175k.m7986g() & 31;
                        c2175k.m7981d(1);
                        a *= 3;
                        int d = c2175k.m7980d();
                        for (C2267n c2267n : c2267nArr) {
                            c2175k.m7979c(d);
                            c2267n.mo1607a(c2175k, a);
                            c2267n.mo1605a(j, 1, a, 0, null);
                        }
                        c2175k.m7981d(a2 - (a + 10));
                    } else {
                        c2175k.m7981d(a2);
                    }
                }
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            c2175k.m7979c(c2175k.m7978c());
        }
    }

    /* renamed from: a */
    private static int m8523a(C2175k c2175k) {
        int i = 0;
        while (c2175k.m7976b() != 0) {
            int g = c2175k.m7986g();
            i += g;
            if (g != 255) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static boolean m8525a(int i, int i2, C2175k c2175k) {
        boolean z = false;
        if (i == 4) {
            if (i2 >= 8) {
                i = c2175k.m7980d();
                i2 = c2175k.m7986g();
                int h = c2175k.m7987h();
                int n = c2175k.m7993n();
                int g = c2175k.m7986g();
                c2175k.m7979c(i);
                if (i2 == 181 && h == 49 && n == 1195456820 && g == 3) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }
}
