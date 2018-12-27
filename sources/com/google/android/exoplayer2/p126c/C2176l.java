package com.google.android.exoplayer2.p126c;

/* renamed from: com.google.android.exoplayer2.c.l */
public final class C2176l {
    /* renamed from: a */
    private byte[] f6738a;
    /* renamed from: b */
    private int f6739b;
    /* renamed from: c */
    private int f6740c;
    /* renamed from: d */
    private int f6741d;

    public C2176l(byte[] bArr, int i, int i2) {
        m8010a(bArr, i, i2);
    }

    /* renamed from: a */
    public void m8010a(byte[] bArr, int i, int i2) {
        this.f6738a = bArr;
        this.f6740c = i;
        this.f6739b = i2;
        this.f6741d = null;
        m8008f();
    }

    /* renamed from: a */
    public void m8009a(int i) {
        int i2 = this.f6740c;
        this.f6740c += i / 8;
        this.f6741d += i % 8;
        if (this.f6741d > 7) {
            this.f6740c++;
            this.f6741d -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f6740c) {
                m8008f();
                return;
            } else if (m8006d(i2) != 0) {
                this.f6740c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: b */
    public boolean m8013b(int i) {
        int i2 = this.f6740c;
        int i3 = this.f6740c + (i / 8);
        int i4 = this.f6741d + (i % 8);
        if (i4 > 7) {
            i3++;
            i4 -= 8;
        }
        while (true) {
            i2++;
            if (i2 <= i3 && i3 < this.f6739b) {
                if (m8006d(i2)) {
                    i3++;
                    i2 += 2;
                }
            }
        }
        if (i3 < this.f6739b) {
            return true;
        }
        if (i3 == this.f6739b && r2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m8011a() {
        return m8015c(1) == 1;
    }

    /* renamed from: c */
    public int m8015c(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i / 8;
        int i4 = 0;
        while (i2 < i3) {
            int i5;
            int i6 = m8006d(this.f6740c + 1) ? this.f6740c + 2 : this.f6740c + 1;
            if (this.f6741d != 0) {
                i5 = ((this.f6738a[i6] & 255) >>> (8 - this.f6741d)) | ((this.f6738a[this.f6740c] & 255) << this.f6741d);
            } else {
                i5 = this.f6738a[this.f6740c];
            }
            i -= 8;
            i4 |= (255 & i5) << i;
            this.f6740c = i6;
            i2++;
        }
        if (i > 0) {
            i2 = this.f6741d + i;
            i = (byte) (255 >> (8 - i));
            i3 = m8006d(this.f6740c + 1) ? this.f6740c + 2 : this.f6740c + 1;
            if (i2 > 8) {
                i = (i & (((255 & this.f6738a[i3]) >> (16 - i2)) | ((this.f6738a[this.f6740c] & 255) << (i2 - 8)))) | i4;
                this.f6740c = i3;
            } else {
                i = (i & ((255 & this.f6738a[this.f6740c]) >> (8 - i2))) | i4;
                if (i2 == 8) {
                    this.f6740c = i3;
                }
            }
            i4 = i;
            this.f6741d = i2 % 8;
        }
        m8008f();
        return i4;
    }

    /* renamed from: b */
    public boolean m8012b() {
        int i = this.f6740c;
        int i2 = this.f6741d;
        int i3 = 0;
        while (this.f6740c < this.f6739b && !m8011a()) {
            i3++;
        }
        Object obj = this.f6740c == this.f6739b ? 1 : null;
        this.f6740c = i;
        this.f6741d = i2;
        if (obj == null && m8013b((i3 * 2) + 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m8014c() {
        return m8007e();
    }

    /* renamed from: d */
    public int m8016d() {
        int e = m8007e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }

    /* renamed from: e */
    private int m8007e() {
        int i = 0;
        int i2 = 0;
        while (!m8011a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m8015c(i2);
        }
        return i3 + i;
    }

    /* renamed from: d */
    private boolean m8006d(int i) {
        return 2 <= i && i < this.f6739b && this.f6738a[i] == (byte) 3 && this.f6738a[i - 2] == (byte) 0 && this.f6738a[i - 1] == 0;
    }

    /* renamed from: f */
    private void m8008f() {
        boolean z = this.f6740c >= 0 && this.f6741d >= 0 && this.f6741d < 8 && (this.f6740c < this.f6739b || (this.f6740c == this.f6739b && this.f6741d == 0));
        C2163a.m7918b(z);
    }
}
