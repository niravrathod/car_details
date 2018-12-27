package com.google.android.exoplayer2.p126c;

import java.nio.charset.Charset;

/* renamed from: com.google.android.exoplayer2.c.k */
public final class C2175k {
    /* renamed from: a */
    public byte[] f6735a;
    /* renamed from: b */
    private int f6736b;
    /* renamed from: c */
    private int f6737c;

    public C2175k(int i) {
        this.f6735a = new byte[i];
        this.f6737c = i;
    }

    public C2175k(byte[] bArr) {
        this.f6735a = bArr;
        this.f6737c = bArr.length;
    }

    public C2175k(byte[] bArr, int i) {
        this.f6735a = bArr;
        this.f6737c = i;
    }

    /* renamed from: a */
    public void m7972a(int i) {
        m7974a(m7982e() < i ? new byte[i] : this.f6735a, i);
    }

    /* renamed from: a */
    public void m7974a(byte[] bArr, int i) {
        this.f6735a = bArr;
        this.f6737c = i;
        this.f6736b = null;
    }

    /* renamed from: a */
    public void m7971a() {
        this.f6736b = 0;
        this.f6737c = 0;
    }

    /* renamed from: b */
    public int m7976b() {
        return this.f6737c - this.f6736b;
    }

    /* renamed from: c */
    public int m7978c() {
        return this.f6737c;
    }

    /* renamed from: b */
    public void m7977b(int i) {
        boolean z = i >= 0 && i <= this.f6735a.length;
        C2163a.m7916a(z);
        this.f6737c = i;
    }

    /* renamed from: d */
    public int m7980d() {
        return this.f6736b;
    }

    /* renamed from: e */
    public int m7982e() {
        return this.f6735a == null ? 0 : this.f6735a.length;
    }

    /* renamed from: c */
    public void m7979c(int i) {
        boolean z = i >= 0 && i <= this.f6737c;
        C2163a.m7916a(z);
        this.f6736b = i;
    }

    /* renamed from: d */
    public void m7981d(int i) {
        m7979c(this.f6736b + i);
    }

    /* renamed from: a */
    public void m7973a(C2174j c2174j, int i) {
        m7975a(c2174j.f6731a, 0, i);
        c2174j.m7960a(0);
    }

    /* renamed from: a */
    public void m7975a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f6735a, this.f6736b, bArr, i, i2);
        this.f6736b += i2;
    }

    /* renamed from: f */
    public char m7984f() {
        return (char) (((this.f6735a[this.f6736b] & 255) << 8) | (this.f6735a[this.f6736b + 1] & 255));
    }

    /* renamed from: g */
    public int m7986g() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public int m7987h() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: i */
    public int m7988i() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    /* renamed from: j */
    public short m7989j() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    /* renamed from: k */
    public int m7990k() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6735a;
        i3 = this.f6736b;
        this.f6736b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: l */
    public long m7991l() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f6735a;
        int i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 16;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 8;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        return j | (255 & ((long) bArr2[i2]));
    }

    /* renamed from: m */
    public long m7992m() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.f6735a;
        int i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 8;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 16;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        return j | ((255 & ((long) bArr2[i2])) << 24);
    }

    /* renamed from: n */
    public int m7993n() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 16;
        bArr2 = this.f6735a;
        i3 = this.f6736b;
        this.f6736b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6735a;
        i3 = this.f6736b;
        this.f6736b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: o */
    public int m7994o() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6735a;
        i3 = this.f6736b;
        this.f6736b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 16;
        bArr2 = this.f6735a;
        i3 = this.f6736b;
        this.f6736b = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 24);
    }

    /* renamed from: p */
    public long m7995p() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f6735a;
        int i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 48;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 40;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 32;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 24;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 16;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 8;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        return j | (255 & ((long) bArr2[i2]));
    }

    /* renamed from: q */
    public long m7996q() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.f6735a;
        int i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 8;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 16;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 24;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 32;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 40;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 48;
        bArr2 = this.f6735a;
        i2 = this.f6736b;
        this.f6736b = i2 + 1;
        return j | ((255 & ((long) bArr2[i2])) << 56);
    }

    /* renamed from: r */
    public int m7997r() {
        byte[] bArr = this.f6735a;
        int i = this.f6736b;
        this.f6736b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6735a;
        int i3 = this.f6736b;
        this.f6736b = i3 + 1;
        i2 |= bArr2[i3] & 255;
        this.f6736b += 2;
        return i2;
    }

    /* renamed from: s */
    public int m7998s() {
        return (((m7986g() << 21) | (m7986g() << 14)) | (m7986g() << 7)) | m7986g();
    }

    /* renamed from: t */
    public int m7999t() {
        int n = m7993n();
        if (n >= 0) {
            return n;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(n);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: u */
    public int m8000u() {
        int o = m7994o();
        if (o >= 0) {
            return o;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(o);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: v */
    public long m8001v() {
        long p = m7995p();
        if (p >= 0) {
            return p;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(p);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: w */
    public double m8002w() {
        return Double.longBitsToDouble(m7995p());
    }

    /* renamed from: e */
    public String m7983e(int i) {
        return m7970a(i, Charset.defaultCharset());
    }

    /* renamed from: a */
    public String m7970a(int i, Charset charset) {
        String str = new String(this.f6735a, this.f6736b, i, charset);
        this.f6736b += i;
        return str;
    }

    /* renamed from: f */
    public String m7985f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f6736b + i) - 1;
        i2 = (i2 >= this.f6737c || this.f6735a[i2] != (byte) 0) ? i : i - 1;
        String str = new String(this.f6735a, this.f6736b, i2);
        this.f6736b += i;
        return str;
    }

    /* renamed from: x */
    public String m8003x() {
        if (m7976b() == 0) {
            return null;
        }
        int i = this.f6736b;
        while (i < this.f6737c && this.f6735a[i] != (byte) 0) {
            i++;
        }
        String str = new String(this.f6735a, this.f6736b, i - this.f6736b);
        this.f6736b = i;
        if (this.f6736b < this.f6737c) {
            this.f6736b++;
        }
        return str;
    }

    /* renamed from: y */
    public String m8004y() {
        if (m7976b() == 0) {
            return null;
        }
        int i = this.f6736b;
        while (i < this.f6737c && !C2186s.m8050a(this.f6735a[i])) {
            i++;
        }
        if (i - this.f6736b >= 3 && this.f6735a[this.f6736b] == (byte) -17 && this.f6735a[this.f6736b + 1] == (byte) -69 && this.f6735a[this.f6736b + 2] == (byte) -65) {
            this.f6736b += 3;
        }
        String str = new String(this.f6735a, this.f6736b, i - this.f6736b);
        this.f6736b = i;
        if (this.f6736b == this.f6737c) {
            return str;
        }
        if (this.f6735a[this.f6736b] == (byte) 13) {
            this.f6736b++;
            if (this.f6736b == this.f6737c) {
                return str;
            }
        }
        if (this.f6735a[this.f6736b] == (byte) 10) {
            this.f6736b++;
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: z */
    public long m8005z() {
        /*
        r12 = this;
        r0 = r12.f6735a;
        r1 = r12.f6736b;
        r0 = r0[r1];
        r0 = (long) r0;
        r2 = 7;
        r3 = 7;
    L_0x0009:
        r4 = 6;
        r5 = 1;
        if (r3 < 0) goto L_0x0025;
    L_0x000d:
        r6 = r5 << r3;
        r7 = (long) r6;
        r7 = r7 & r0;
        r9 = 0;
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 != 0) goto L_0x0022;
    L_0x0017:
        if (r3 >= r4) goto L_0x001e;
    L_0x0019:
        r6 = r6 - r5;
        r6 = (long) r6;
        r0 = r0 & r6;
        r2 = r2 - r3;
        goto L_0x0026;
    L_0x001e:
        if (r3 != r2) goto L_0x0025;
    L_0x0020:
        r2 = 1;
        goto L_0x0026;
    L_0x0022:
        r3 = r3 + -1;
        goto L_0x0009;
    L_0x0025:
        r2 = 0;
    L_0x0026:
        if (r2 == 0) goto L_0x005c;
    L_0x0028:
        if (r5 >= r2) goto L_0x0056;
    L_0x002a:
        r3 = r12.f6735a;
        r6 = r12.f6736b;
        r6 = r6 + r5;
        r3 = r3[r6];
        r6 = r3 & 192;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r6 != r7) goto L_0x003f;
    L_0x0037:
        r0 = r0 << r4;
        r3 = r3 & 63;
        r6 = (long) r3;
        r0 = r0 | r6;
        r5 = r5 + 1;
        goto L_0x0028;
    L_0x003f:
        r2 = new java.lang.NumberFormatException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Invalid UTF-8 sequence continuation byte: ";
        r3.append(r4);
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
    L_0x0056:
        r3 = r12.f6736b;
        r3 = r3 + r2;
        r12.f6736b = r3;
        return r0;
    L_0x005c:
        r2 = new java.lang.NumberFormatException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Invalid UTF-8 sequence first byte: ";
        r3.append(r4);
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.c.k.z():long");
    }
}
