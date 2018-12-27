package com.crashlytics.android.core;

import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

final class CodedOutputStream implements Flushable {
    /* renamed from: a */
    private final byte[] f4218a;
    /* renamed from: b */
    private final int f4219b;
    /* renamed from: c */
    private int f4220c = null;
    /* renamed from: d */
    private final OutputStream f4221d;

    static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    /* renamed from: b */
    public static int m5394b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m5401b(boolean z) {
        return 1;
    }

    /* renamed from: d */
    public static int m5403d(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: l */
    public static int m5411l(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: n */
    public static int m5412n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f4221d = outputStream;
        this.f4218a = bArr;
        this.f4219b = bArr.length;
    }

    /* renamed from: a */
    public static CodedOutputStream m5391a(OutputStream outputStream) {
        return m5392a(outputStream, 4096);
    }

    /* renamed from: a */
    public static CodedOutputStream m5392a(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public void m5416a(int i, float f) {
        m5434g(i, 5);
        m5414a(f);
    }

    /* renamed from: a */
    public void m5418a(int i, long j) {
        m5434g(i, 0);
        m5421a(j);
    }

    /* renamed from: a */
    public void m5420a(int i, boolean z) {
        m5434g(i, 0);
        m5424a(z);
    }

    /* renamed from: a */
    public void m5419a(int i, C1357d c1357d) {
        m5434g(i, 2);
        m5422a(c1357d);
    }

    /* renamed from: a */
    public void m5417a(int i, int i2) {
        m5434g(i, 0);
        m5427b(i2);
    }

    /* renamed from: b */
    public void m5428b(int i, int i2) {
        m5434g(i, 0);
        m5429c(i2);
    }

    /* renamed from: c */
    public void m5430c(int i, int i2) {
        m5434g(i, 0);
        m5433d(i2);
    }

    /* renamed from: a */
    public void m5414a(float f) {
        m5437m(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public void m5421a(long j) {
        m5431c(j);
    }

    /* renamed from: a */
    public void m5415a(int i) {
        if (i >= 0) {
            m5436k(i);
        } else {
            m5431c((long) i);
        }
    }

    /* renamed from: a */
    public void m5424a(boolean z) {
        m5435i(z);
    }

    /* renamed from: a */
    public void m5422a(C1357d c1357d) {
        m5436k(c1357d.m5535a());
        m5432c(c1357d);
    }

    /* renamed from: b */
    public void m5427b(int i) {
        m5436k(i);
    }

    /* renamed from: c */
    public void m5429c(int i) {
        m5415a(i);
    }

    /* renamed from: d */
    public void m5433d(int i) {
        m5436k(m5412n(i));
    }

    /* renamed from: b */
    public static int m5395b(int i, float f) {
        return m5410j(i) + m5394b(f);
    }

    /* renamed from: b */
    public static int m5396b(int i, long j) {
        return m5410j(i) + m5399b(j);
    }

    /* renamed from: b */
    public static int m5398b(int i, boolean z) {
        return m5410j(i) + m5401b(z);
    }

    /* renamed from: b */
    public static int m5397b(int i, C1357d c1357d) {
        return m5410j(i) + m5400b(c1357d);
    }

    /* renamed from: d */
    public static int m5402d(int i, int i2) {
        return m5410j(i) + m5406f(i2);
    }

    /* renamed from: e */
    public static int m5405e(int i, int i2) {
        return m5410j(i) + m5408g(i2);
    }

    /* renamed from: f */
    public static int m5407f(int i, int i2) {
        return m5410j(i) + m5409h(i2);
    }

    /* renamed from: b */
    public static int m5399b(long j) {
        return m5403d(j);
    }

    /* renamed from: e */
    public static int m5404e(int i) {
        return i >= 0 ? m5411l(i) : 10;
    }

    /* renamed from: b */
    public static int m5400b(C1357d c1357d) {
        return m5411l(c1357d.m5535a()) + c1357d.m5535a();
    }

    /* renamed from: f */
    public static int m5406f(int i) {
        return m5411l(i);
    }

    /* renamed from: g */
    public static int m5408g(int i) {
        return m5404e(i);
    }

    /* renamed from: h */
    public static int m5409h(int i) {
        return m5411l(m5412n(i));
    }

    /* renamed from: a */
    private void m5393a() {
        if (this.f4221d != null) {
            this.f4221d.write(this.f4218a, 0, this.f4220c);
            this.f4220c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    public void flush() {
        if (this.f4221d != null) {
            m5393a();
        }
    }

    /* renamed from: a */
    public void m5413a(byte b) {
        if (this.f4220c == this.f4219b) {
            m5393a();
        }
        byte[] bArr = this.f4218a;
        int i = this.f4220c;
        this.f4220c = i + 1;
        bArr[i] = b;
    }

    /* renamed from: i */
    public void m5435i(int i) {
        m5413a((byte) i);
    }

    /* renamed from: c */
    public void m5432c(C1357d c1357d) {
        m5423a(c1357d, 0, c1357d.m5535a());
    }

    /* renamed from: a */
    public void m5425a(byte[] bArr) {
        m5426a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m5426a(byte[] bArr, int i, int i2) {
        if (this.f4219b - this.f4220c >= i2) {
            System.arraycopy(bArr, i, this.f4218a, this.f4220c, i2);
            this.f4220c += i2;
            return;
        }
        int i3 = this.f4219b - this.f4220c;
        System.arraycopy(bArr, i, this.f4218a, this.f4220c, i3);
        i += i3;
        i2 -= i3;
        this.f4220c = this.f4219b;
        m5393a();
        if (i2 <= this.f4219b) {
            System.arraycopy(bArr, i, this.f4218a, 0, i2);
            this.f4220c = i2;
            return;
        }
        this.f4221d.write(bArr, i, i2);
    }

    /* renamed from: a */
    public void m5423a(C1357d c1357d, int i, int i2) {
        if (this.f4219b - this.f4220c >= i2) {
            c1357d.m5536a(this.f4218a, i, this.f4220c, i2);
            this.f4220c += i2;
            return;
        }
        int i3 = this.f4219b - this.f4220c;
        c1357d.m5536a(this.f4218a, i, this.f4220c, i3);
        i += i3;
        i2 -= i3;
        this.f4220c = this.f4219b;
        m5393a();
        if (i2 <= this.f4219b) {
            c1357d.m5536a(this.f4218a, i, 0, i2);
            this.f4220c = i2;
            return;
        }
        c1357d = c1357d.m5537b();
        long j = (long) i;
        if (j == c1357d.skip(j)) {
            while (i2 > 0) {
                i = Math.min(i2, this.f4219b);
                i3 = c1357d.read(this.f4218a, 0, i);
                if (i3 == i) {
                    this.f4221d.write(this.f4218a, 0, i3);
                    i2 -= i3;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: g */
    public void m5434g(int i, int i2) {
        m5436k(ap.m5519a(i, i2));
    }

    /* renamed from: j */
    public static int m5410j(int i) {
        return m5411l(ap.m5519a(i, 0));
    }

    /* renamed from: k */
    public void m5436k(int i) {
        while ((i & -128) != 0) {
            m5435i((i & 127) | 128);
            i >>>= 7;
        }
        m5435i(i);
    }

    /* renamed from: c */
    public void m5431c(long j) {
        while ((-128 & j) != 0) {
            m5435i((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m5435i((int) j);
    }

    /* renamed from: m */
    public void m5437m(int i) {
        m5435i(i & 255);
        m5435i((i >> 8) & 255);
        m5435i((i >> 16) & 255);
        m5435i((i >> 24) & 255);
    }
}
