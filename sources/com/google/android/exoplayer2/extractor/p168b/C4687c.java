package com.google.android.exoplayer2.extractor.p168b;

import com.google.android.exoplayer2.extractor.C2264k;
import com.google.android.exoplayer2.extractor.p168b.C3968b.C3967a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.b.c */
final class C4687c implements C3967a {
    /* renamed from: a */
    private final long[] f19346a;
    /* renamed from: b */
    private final long[] f19347b;
    /* renamed from: c */
    private final long f19348c;

    /* renamed from: a */
    public boolean mo1578a() {
        return true;
    }

    /* renamed from: a */
    public static C4687c m25772a(C2264k c2264k, C2175k c2175k, long j, long j2) {
        C2264k c2264k2 = c2264k;
        C2175k c2175k2 = c2175k;
        long j3 = j2;
        c2175k2.m7981d(10);
        int n = c2175k.m7993n();
        C4687c c4687c = null;
        if (n <= 0) {
            return null;
        }
        int i = c2264k2.f7187d;
        long b = C2186s.m8057b((long) n, 1000000 * ((long) (i >= 32000 ? 1152 : 576)), (long) i);
        n = c2175k.m7987h();
        int h = c2175k.m7987h();
        int h2 = c2175k.m7987h();
        c2175k2.m7981d(2);
        long j4 = j + ((long) c2264k2.f7186c);
        int i2 = n + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = 0;
        jArr2[0] = j4;
        int i3 = 1;
        while (i3 < jArr.length) {
            int g;
            long j5;
            switch (h2) {
                case 1:
                    g = c2175k.m7986g();
                    break;
                case 2:
                    g = c2175k.m7987h();
                    break;
                case 3:
                    g = c2175k.m7990k();
                    break;
                case 4:
                    g = c2175k.m7999t();
                    break;
                default:
                    return c4687c;
            }
            j4 += (long) (g * h);
            long j6 = b;
            jArr[i3] = (((long) i3) * b) / ((long) n);
            if (j3 == -1) {
                j5 = j4;
            } else {
                j5 = Math.min(j3, j4);
            }
            jArr2[i3] = j5;
            i3++;
            b = j6;
            c4687c = null;
        }
        return new C4687c(jArr, jArr2, b);
    }

    private C4687c(long[] jArr, long[] jArr2, long j) {
        this.f19346a = jArr;
        this.f19347b = jArr2;
        this.f19348c = j;
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        return this.f19347b[C2186s.m8043a(this.f19346a, j, true, true)];
    }

    /* renamed from: a */
    public long mo4047a(long j) {
        return this.f19346a[C2186s.m8043a(this.f19347b, j, true, true)];
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f19348c;
    }
}
