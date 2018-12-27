package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.extractor.a */
public final class C3965a implements C2266m {
    /* renamed from: a */
    public final int f15829a;
    /* renamed from: b */
    public final int[] f15830b;
    /* renamed from: c */
    public final long[] f15831c;
    /* renamed from: d */
    public final long[] f15832d;
    /* renamed from: e */
    public final long[] f15833e;
    /* renamed from: f */
    private final long f15834f;

    /* renamed from: a */
    public boolean mo1578a() {
        return true;
    }

    public C3965a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f15830b = iArr;
        this.f15831c = jArr;
        this.f15832d = jArr2;
        this.f15833e = jArr3;
        this.f15829a = iArr.length;
        if (this.f15829a > null) {
            this.f15834f = jArr2[this.f15829a - 1] + jArr3[this.f15829a - 1];
        } else {
            this.f15834f = null;
        }
    }

    /* renamed from: a */
    public int m19756a(long j) {
        return C2186s.m8043a(this.f15833e, j, true, true);
    }

    /* renamed from: b */
    public long mo1579b() {
        return this.f15834f;
    }

    /* renamed from: b */
    public long mo1580b(long j) {
        return this.f15831c[m19756a(j)];
    }
}
