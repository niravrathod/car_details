package com.google.android.exoplayer2.p126c;

/* renamed from: com.google.android.exoplayer2.c.j */
public final class C2174j {
    /* renamed from: a */
    public byte[] f6731a;
    /* renamed from: b */
    private int f6732b;
    /* renamed from: c */
    private int f6733c;
    /* renamed from: d */
    private int f6734d;

    public C2174j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C2174j(byte[] bArr, int i) {
        this.f6731a = bArr;
        this.f6734d = i;
    }

    /* renamed from: a */
    public void m7961a(byte[] bArr, int i) {
        this.f6731a = bArr;
        this.f6732b = 0;
        this.f6733c = 0;
        this.f6734d = i;
    }

    /* renamed from: a */
    public int m7959a() {
        return ((this.f6734d - this.f6732b) * 8) - this.f6733c;
    }

    /* renamed from: b */
    public int m7963b() {
        return (this.f6732b * 8) + this.f6733c;
    }

    /* renamed from: c */
    public int m7965c() {
        C2163a.m7918b(this.f6733c == 0);
        return this.f6732b;
    }

    /* renamed from: a */
    public void m7960a(int i) {
        this.f6732b = i / 8;
        this.f6733c = i - (this.f6732b * 8);
        m7958f();
    }

    /* renamed from: b */
    public void m7964b(int i) {
        this.f6732b += i / 8;
        this.f6733c += i % 8;
        if (this.f6733c > 7) {
            this.f6732b++;
            this.f6733c -= 8;
        }
        m7958f();
    }

    /* renamed from: d */
    public boolean m7968d() {
        return m7966c(1) == 1;
    }

    /* renamed from: c */
    public int m7966c(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i / 8;
        int i4 = 0;
        while (i2 < i3) {
            int i5;
            if (this.f6733c != 0) {
                i5 = ((this.f6731a[this.f6732b + 1] & 255) >>> (8 - this.f6733c)) | ((this.f6731a[this.f6732b] & 255) << this.f6733c);
            } else {
                i5 = this.f6731a[this.f6732b];
            }
            i -= 8;
            i4 |= (255 & i5) << i;
            this.f6732b++;
            i2++;
        }
        if (i > 0) {
            i2 = this.f6733c + i;
            i = (byte) (255 >> (8 - i));
            if (i2 > 8) {
                i = (i & (((this.f6731a[this.f6732b] & 255) << (i2 - 8)) | ((255 & this.f6731a[this.f6732b + 1]) >> (16 - i2)))) | i4;
                this.f6732b++;
            } else {
                i = (i & ((this.f6731a[this.f6732b] & 255) >> (8 - i2))) | i4;
                if (i2 == 8) {
                    this.f6732b++;
                }
            }
            i4 = i;
            this.f6733c = i2 % 8;
        }
        m7958f();
        return i4;
    }

    /* renamed from: e */
    public void m7969e() {
        if (this.f6733c != 0) {
            this.f6733c = 0;
            this.f6732b++;
            m7958f();
        }
    }

    /* renamed from: a */
    public void m7962a(byte[] bArr, int i, int i2) {
        C2163a.m7918b(this.f6733c == 0);
        System.arraycopy(this.f6731a, this.f6732b, bArr, i, i2);
        this.f6732b += i2;
        m7958f();
    }

    /* renamed from: d */
    public void m7967d(int i) {
        C2163a.m7918b(this.f6733c == 0);
        this.f6732b += i;
        m7958f();
    }

    /* renamed from: f */
    private void m7958f() {
        boolean z = this.f6732b >= 0 && this.f6733c >= 0 && this.f6733c < 8 && (this.f6732b < this.f6734d || (this.f6732b == this.f6734d && this.f6733c == 0));
        C2163a.m7918b(z);
    }
}
