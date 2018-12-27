package com.google.android.exoplayer2.extractor.p129d;

import com.google.android.exoplayer2.p126c.C2163a;

/* renamed from: com.google.android.exoplayer2.extractor.d.i */
final class C2234i {
    /* renamed from: a */
    public final byte[] f7053a;
    /* renamed from: b */
    private final int f7054b;
    /* renamed from: c */
    private int f7055c;
    /* renamed from: d */
    private int f7056d;

    public C2234i(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C2234i(byte[] bArr, int i) {
        this.f7053a = bArr;
        this.f7054b = i * 8;
    }

    /* renamed from: a */
    public boolean m8226a() {
        return m8225a(1) == 1;
    }

    /* renamed from: a */
    public int m8225a(int i) {
        int i2 = 0;
        C2163a.m7918b(m8227b() + i <= this.f7054b);
        if (i == 0) {
            return 0;
        }
        int min;
        int i3;
        if (this.f7056d != 0) {
            min = Math.min(i, 8 - this.f7056d);
            i3 = (255 >>> (8 - min)) & (this.f7053a[this.f7055c] >>> this.f7056d);
            this.f7056d += min;
            if (this.f7056d == 8) {
                this.f7055c++;
                this.f7056d = 0;
            }
        } else {
            min = 0;
            i3 = 0;
        }
        int i4 = i - min;
        if (i4 > 7) {
            i4 /= 8;
            while (i2 < i4) {
                long j = (long) i3;
                byte[] bArr = this.f7053a;
                int i5 = this.f7055c;
                this.f7055c = i5 + 1;
                i3 = (int) (j | ((((long) bArr[i5]) & 255) << min));
                min += 8;
                i2++;
            }
        }
        if (i > min) {
            i -= min;
            i3 |= ((255 >>> (8 - i)) & this.f7053a[this.f7055c]) << min;
            this.f7056d += i;
        }
        return i3;
    }

    /* renamed from: b */
    public void m8228b(int i) {
        C2163a.m7918b(m8227b() + i <= this.f7054b);
        this.f7055c += i / 8;
        this.f7056d += i % 8;
        if (this.f7056d > 7) {
            this.f7055c++;
            this.f7056d -= 8;
        }
    }

    /* renamed from: b */
    public int m8227b() {
        return (this.f7055c * 8) + this.f7056d;
    }
}
