package com.google.android.exoplayer2.extractor.p128c;

import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.c.m */
final class C2222m {
    /* renamed from: a */
    public final int f6993a;
    /* renamed from: b */
    public final long[] f6994b;
    /* renamed from: c */
    public final int[] f6995c;
    /* renamed from: d */
    public final int f6996d;
    /* renamed from: e */
    public final long[] f6997e;
    /* renamed from: f */
    public final int[] f6998f;

    public C2222m(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = false;
        C2163a.m7916a(iArr.length == jArr2.length);
        C2163a.m7916a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        C2163a.m7916a(z);
        this.f6994b = jArr;
        this.f6995c = iArr;
        this.f6996d = i;
        this.f6997e = jArr2;
        this.f6998f = iArr2;
        this.f6993a = jArr.length;
    }

    /* renamed from: a */
    public int m8186a(long j) {
        for (j = C2186s.m8043a(this.f6997e, j, true, false); j >= null; j--) {
            if ((this.f6998f[j] & 1) != 0) {
                return j;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m8187b(long j) {
        for (j = C2186s.m8056b(this.f6997e, j, true, false); j < this.f6997e.length; j++) {
            if ((this.f6998f[j] & 1) != 0) {
                return j;
            }
        }
        return -1;
    }
}
