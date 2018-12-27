package com.google.android.exoplayer2.extractor.p128c;

import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.c.d */
final class C2212d {

    /* renamed from: com.google.android.exoplayer2.extractor.c.d$a */
    public static final class C2211a {
        /* renamed from: a */
        public final long[] f6911a;
        /* renamed from: b */
        public final int[] f6912b;
        /* renamed from: c */
        public final int f6913c;
        /* renamed from: d */
        public final long[] f6914d;
        /* renamed from: e */
        public final int[] f6915e;

        private C2211a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
            this.f6911a = jArr;
            this.f6912b = iArr;
            this.f6913c = i;
            this.f6914d = jArr2;
            this.f6915e = iArr2;
        }
    }

    /* renamed from: a */
    public static C2211a m8161a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        int i4 = 0;
        for (int a : iArr2) {
            i4 += C2186s.m8040a(a, i2);
        }
        long[] jArr2 = new long[i4];
        int[] iArr3 = new int[i4];
        long[] jArr3 = new long[i4];
        int[] iArr4 = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < iArr2.length) {
            i4 = iArr2[i3];
            long j2 = jArr[i3];
            while (i4 > 0) {
                int min = Math.min(i2, i4);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i7 = Math.max(i7, iArr3[i5]);
                jArr3[i5] = ((long) i6) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i6 += min;
                i4 -= min;
                i5++;
                iArr2 = iArr;
            }
            i3++;
            iArr2 = iArr;
        }
        return new C2211a(jArr2, iArr3, i7, jArr3, iArr4);
    }
}
