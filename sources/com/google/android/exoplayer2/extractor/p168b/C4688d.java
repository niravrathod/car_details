package com.google.android.exoplayer2.extractor.p168b;

import com.google.android.exoplayer2.extractor.C2264k;
import com.google.android.exoplayer2.extractor.p168b.C3968b.C3967a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.b.d */
final class C4688d implements C3967a {
    /* renamed from: a */
    private final long f19349a;
    /* renamed from: b */
    private final long f19350b;
    /* renamed from: c */
    private final long f19351c;
    /* renamed from: d */
    private final long[] f19352d;
    /* renamed from: e */
    private final long f19353e;
    /* renamed from: f */
    private final int f19354f;

    /* renamed from: a */
    public static C4688d m25778a(C2264k c2264k, C2175k c2175k, long j, long j2) {
        C2264k c2264k2 = c2264k;
        int i = c2264k2.f7190g;
        int i2 = c2264k2.f7187d;
        long j3 = j + ((long) c2264k2.f7186c);
        int n = c2175k.m7993n();
        if ((n & 1) == 1) {
            int t = c2175k.m7999t();
            if (t != 0) {
                long b = C2186s.m8057b((long) t, ((long) i) * 1000000, (long) i2);
                if ((n & 6) != 6) {
                    return new C4688d(j3, b, j2);
                }
                long t2 = (long) c2175k.m7999t();
                c2175k.m7981d(1);
                long[] jArr = new long[99];
                for (n = 0; n < 99; n++) {
                    jArr[n] = (long) c2175k.m7986g();
                }
                return new C4688d(j3, b, j2, jArr, t2, c2264k2.f7186c);
            }
        }
        return null;
    }

    private C4688d(long j, long j2, long j3) {
        this(j, j2, j3, null, 0, 0);
    }

    private C4688d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f19349a = j;
        this.f19350b = j2;
        this.f19351c = j3;
        this.f19352d = jArr;
        this.f19353e = j4;
        this.f19354f = i;
    }

    /* renamed from: a */
    public boolean mo1578a() {
        return this.f19352d != null;
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        if (!mo1578a()) {
            return this.f19349a;
        }
        j = (((float) j) * 1120403456) / ((float) this.f19350b);
        float f = 256.0f;
        float f2 = 0.0f;
        if (j <= 0) {
            f = 0.0f;
        } else if (j < 1120403456) {
            int i = (int) j;
            if (i != 0) {
                f2 = (float) this.f19352d[i - 1];
            }
            if (i < 99) {
                f = (float) this.f19352d[i];
            }
            f = ((f - f2) * (j - ((float) i))) + f2;
        }
        double d = (double) f;
        Double.isNaN(d);
        d *= 4571153621781053440L;
        j = (double) this.f19353e;
        Double.isNaN(j);
        return Math.min(Math.round(d * j) + this.f19349a, (this.f19351c != -1 ? this.f19351c : (this.f19349a - ((long) this.f19354f)) + this.f19353e) - 1);
    }

    /* renamed from: a */
    public long mo4047a(long j) {
        long j2 = 0;
        if (mo1578a()) {
            if (j >= this.f19349a) {
                long j3;
                long j4;
                j = (double) (j - this.f19349a);
                Double.isNaN(j);
                j *= 4643211215818981376L;
                double d = (double) this.f19353e;
                Double.isNaN(d);
                j /= d;
                int a = C2186s.m8043a(this.f19352d, (long) j, true, false) + 1;
                long a2 = m25777a(a);
                if (a == 0) {
                    j3 = 0;
                } else {
                    j3 = this.f19352d[a - 1];
                }
                if (a == 99) {
                    j4 = 256;
                } else {
                    j4 = this.f19352d[a];
                }
                long a3 = m25777a(a + 1);
                if (j4 != j3) {
                    double d2 = (double) (a3 - a2);
                    double d3 = (double) j3;
                    Double.isNaN(d3);
                    j -= d3;
                    Double.isNaN(d2);
                    d2 *= j;
                    j = (double) (j4 - j3);
                    Double.isNaN(j);
                    j2 = (long) (d2 / j);
                }
                return a2 + j2;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f19350b;
    }

    /* renamed from: a */
    private long m25777a(int i) {
        return (this.f19350b * ((long) i)) / 100;
    }
}
