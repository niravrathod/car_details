package com.google.android.exoplayer2.extractor.p127a;

import com.google.android.exoplayer2.extractor.C2260g;

/* renamed from: com.google.android.exoplayer2.extractor.a.f */
final class C2202f {
    /* renamed from: a */
    private static final long[] f6827a = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    /* renamed from: b */
    private final byte[] f6828b = new byte[8];
    /* renamed from: c */
    private int f6829c;
    /* renamed from: d */
    private int f6830d;

    /* renamed from: a */
    public void m8127a() {
        this.f6829c = 0;
        this.f6830d = 0;
    }

    /* renamed from: a */
    public long m8126a(C2260g c2260g, boolean z, boolean z2, int i) {
        if (this.f6829c == 0) {
            if (!c2260g.mo1584a(this.f6828b, 0, 1, z)) {
                return -1;
            }
            this.f6830d = C2202f.m8124a(this.f6828b[0] & 255);
            if (!this.f6830d) {
                this.f6829c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if (this.f6830d > i) {
            this.f6829c = 0;
            return -2;
        }
        if (!this.f6830d) {
            c2260g.mo1587b(this.f6828b, 1, this.f6830d - 1);
        }
        this.f6829c = 0;
        return C2202f.m8125a(this.f6828b, this.f6830d, z2);
    }

    /* renamed from: b */
    public int m8128b() {
        return this.f6830d;
    }

    /* renamed from: a */
    public static int m8124a(int i) {
        for (int i2 = 0; i2 < f6827a.length; i2++) {
            if ((f6827a[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m8125a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f6827a[i - 1] ^ -1;
        }
        for (z = true; z < i; z++) {
            j = (j << 8) | (((long) bArr[z]) & 255);
        }
        return j;
    }
}
