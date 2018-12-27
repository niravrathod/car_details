package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.p126c.C2163a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.h */
final class C2149h {
    /* renamed from: a */
    private final int f6635a;
    /* renamed from: b */
    private final int f6636b;
    /* renamed from: c */
    private final int f6637c;
    /* renamed from: d */
    private final int f6638d;
    /* renamed from: e */
    private final int f6639e = (this.f6638d * 2);
    /* renamed from: f */
    private final short[] f6640f = new short[this.f6639e];
    /* renamed from: g */
    private int f6641g = this.f6639e;
    /* renamed from: h */
    private short[] f6642h;
    /* renamed from: i */
    private int f6643i;
    /* renamed from: j */
    private short[] f6644j;
    /* renamed from: k */
    private int f6645k;
    /* renamed from: l */
    private short[] f6646l;
    /* renamed from: m */
    private int f6647m;
    /* renamed from: n */
    private int f6648n;
    /* renamed from: o */
    private float f6649o;
    /* renamed from: p */
    private float f6650p;
    /* renamed from: q */
    private int f6651q;
    /* renamed from: r */
    private int f6652r;
    /* renamed from: s */
    private int f6653s;
    /* renamed from: t */
    private int f6654t;
    /* renamed from: u */
    private int f6655u;
    /* renamed from: v */
    private int f6656v;
    /* renamed from: w */
    private int f6657w;
    /* renamed from: x */
    private int f6658x;

    public C2149h(int i, int i2) {
        this.f6635a = i;
        this.f6636b = i2;
        this.f6637c = i / 400;
        this.f6638d = i / 65;
        this.f6642h = new short[(this.f6639e * i2)];
        this.f6643i = this.f6639e;
        this.f6644j = new short[(this.f6639e * i2)];
        this.f6645k = this.f6639e;
        this.f6646l = new short[(this.f6639e * i2)];
        this.f6647m = 0;
        this.f6648n = 0;
        this.f6655u = 0;
        this.f6649o = 1.0f;
        this.f6650p = 1.0f;
    }

    /* renamed from: a */
    public void m7892a(float f) {
        this.f6649o = f;
    }

    /* renamed from: b */
    public void m7895b(float f) {
        this.f6650p = f;
    }

    /* renamed from: a */
    public void m7893a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.f6636b;
        int i = (this.f6636b * remaining) * 2;
        m7883b(remaining);
        shortBuffer.get(this.f6642h, this.f6651q * this.f6636b, i / 2);
        this.f6651q += remaining;
        m7885c();
    }

    /* renamed from: b */
    public void m7896b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f6636b, this.f6652r);
        shortBuffer.put(this.f6644j, 0, this.f6636b * min);
        this.f6652r -= min;
        System.arraycopy(this.f6644j, min * this.f6636b, this.f6644j, 0, this.f6652r * this.f6636b);
    }

    /* renamed from: a */
    public void m7891a() {
        int i = this.f6651q;
        int i2 = this.f6652r + ((int) ((((((float) i) / (this.f6649o / this.f6650p)) + ((float) this.f6653s)) / this.f6650p) + 0.5f));
        m7883b((this.f6639e * 2) + i);
        for (int i3 = 0; i3 < (this.f6639e * 2) * this.f6636b; i3++) {
            this.f6642h[(this.f6636b * i) + i3] = (short) 0;
        }
        this.f6651q += this.f6639e * 2;
        m7885c();
        if (this.f6652r > i2) {
            this.f6652r = i2;
        }
        this.f6651q = 0;
        this.f6654t = 0;
        this.f6653s = 0;
    }

    /* renamed from: b */
    public int m7894b() {
        return this.f6652r;
    }

    /* renamed from: a */
    private void m7877a(int i) {
        if (this.f6652r + i > this.f6643i) {
            this.f6643i += (this.f6643i / 2) + i;
            this.f6644j = Arrays.copyOf(this.f6644j, this.f6643i * this.f6636b);
        }
    }

    /* renamed from: b */
    private void m7883b(int i) {
        if (this.f6651q + i > this.f6641g) {
            this.f6641g += (this.f6641g / 2) + i;
            this.f6642h = Arrays.copyOf(this.f6642h, this.f6641g * this.f6636b);
        }
    }

    /* renamed from: c */
    private void m7887c(int i) {
        int i2 = this.f6651q - i;
        System.arraycopy(this.f6642h, i * this.f6636b, this.f6642h, 0, this.f6636b * i2);
        this.f6651q = i2;
    }

    /* renamed from: a */
    private void m7879a(short[] sArr, int i, int i2) {
        m7877a(i2);
        System.arraycopy(sArr, i * this.f6636b, this.f6644j, this.f6652r * this.f6636b, this.f6636b * i2);
        this.f6652r += i2;
    }

    /* renamed from: d */
    private int m7888d(int i) {
        int min = Math.min(this.f6639e, this.f6654t);
        m7879a(this.f6642h, i, min);
        this.f6654t -= min;
        return min;
    }

    /* renamed from: b */
    private void m7884b(short[] sArr, int i, int i2) {
        int i3 = this.f6639e / i2;
        int i4 = this.f6636b * i2;
        i *= this.f6636b;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                i6 += sArr[((i5 * i4) + i) + i7];
            }
            this.f6640f[i5] = (short) (i6 / i4);
        }
    }

    /* renamed from: a */
    private int m7874a(short[] sArr, int i, int i2, int i3) {
        i *= this.f6636b;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 255;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                short s = sArr[i + i9];
                short s2 = sArr[(i + i2) + i9];
                i8 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i8 * i5 < i4 * i2) {
                i5 = i2;
                i4 = i8;
            }
            if (i8 * i7 > i6 * i2) {
                i7 = i2;
                i6 = i8;
            }
            i2++;
        }
        this.f6657w = i4 / i5;
        this.f6658x = i6 / i7;
        return i5;
    }

    /* renamed from: a */
    private boolean m7880a(int i, int i2, boolean z) {
        if (i != 0) {
            if (this.f6655u != 0) {
                if (z) {
                    if (i2 > i * 3 || i * 2 <= this.f6656v * 3) {
                        return false;
                    }
                } else if (i <= this.f6656v) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m7875a(short[] sArr, int i, boolean z) {
        int i2 = this.f6635a > 4000 ? this.f6635a / 4000 : 1;
        if (this.f6636b == 1 && i2 == 1) {
            sArr = m7874a(sArr, i, this.f6637c, this.f6638d);
        } else {
            m7884b(sArr, i, i2);
            int a = m7874a(this.f6640f, 0, this.f6637c / i2, this.f6638d / i2);
            if (i2 != 1) {
                a *= i2;
                i2 *= 4;
                int i3 = a - i2;
                a += i2;
                if (i3 < this.f6637c) {
                    i3 = this.f6637c;
                }
                if (a > this.f6638d) {
                    a = this.f6638d;
                }
                if (this.f6636b == 1) {
                    sArr = m7874a(sArr, i, i3, a);
                } else {
                    m7884b(sArr, i, 1);
                    sArr = m7874a(this.f6640f, 0, i3, a);
                }
            } else {
                sArr = a;
            }
        }
        i = m7880a(this.f6657w, this.f6658x, z) != 0 ? this.f6655u : sArr;
        this.f6656v = this.f6657w;
        this.f6655u = sArr;
        return i;
    }

    /* renamed from: e */
    private void m7889e(int i) {
        int i2 = this.f6652r - i;
        if (this.f6653s + i2 > this.f6645k) {
            this.f6645k += (this.f6645k / 2) + i2;
            this.f6646l = Arrays.copyOf(this.f6646l, this.f6645k * this.f6636b);
        }
        System.arraycopy(this.f6644j, this.f6636b * i, this.f6646l, this.f6653s * this.f6636b, this.f6636b * i2);
        this.f6652r = i;
        this.f6653s += i2;
    }

    /* renamed from: f */
    private void m7890f(int i) {
        if (i != 0) {
            System.arraycopy(this.f6646l, this.f6636b * i, this.f6646l, 0, (this.f6653s - i) * this.f6636b);
            this.f6653s -= i;
        }
    }

    /* renamed from: b */
    private short m7882b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        sArr = sArr[i + this.f6636b];
        i = this.f6648n * i2;
        int i4 = (this.f6647m + 1) * i3;
        i = i4 - i;
        i4 -= this.f6647m * i3;
        return (short) (((s * i) + ((i4 - i) * sArr)) / i4);
    }

    /* renamed from: a */
    private void m7876a(float f, int i) {
        if (this.f6652r != i) {
            int i2 = (int) (((float) this.f6635a) / f);
            int i3 = this.f6635a;
            while (true) {
                if (i2 <= 16384) {
                    if (i3 <= 16384) {
                        break;
                    }
                }
                i2 /= 2;
                i3 /= 2;
            }
            m7889e(i);
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 < this.f6653s - 1) {
                    while ((this.f6647m + 1) * i2 > this.f6648n * i3) {
                        m7877a(1);
                        for (int i5 = 0; i5 < this.f6636b; i5++) {
                            this.f6644j[(this.f6652r * this.f6636b) + i5] = m7882b(this.f6646l, (this.f6636b * i4) + i5, i3, i2);
                        }
                        this.f6648n++;
                        this.f6652r++;
                    }
                    this.f6647m++;
                    if (this.f6647m == i3) {
                        this.f6647m = 0;
                        if (this.f6648n != i2) {
                            z = false;
                        }
                        C2163a.m7918b(z);
                        this.f6648n = 0;
                    }
                    i4++;
                } else {
                    m7890f(this.f6653s - Float.MIN_VALUE);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private int m7873a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f6654t = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        m7877a(i3);
        C2149h.m7878a(i3, this.f6636b, this.f6644j, this.f6652r, sArr, i, sArr, i + i2);
        this.f6652r += i3;
        return i3;
    }

    /* renamed from: b */
    private int m7881b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f6654t = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        m7877a(i4);
        System.arraycopy(sArr, this.f6636b * i, this.f6644j, this.f6652r * this.f6636b, this.f6636b * i2);
        C2149h.m7878a(i3, this.f6636b, this.f6644j, this.f6652r + i2, sArr, i + i2, sArr, i);
        this.f6652r += i4;
        return i3;
    }

    /* renamed from: c */
    private void m7886c(float f) {
        if (this.f6651q >= this.f6639e) {
            int i = this.f6651q;
            int i2 = 0;
            do {
                if (this.f6654t > 0) {
                    i2 += m7888d(i2);
                } else {
                    int a = m7875a(this.f6642h, i2, true);
                    if (((double) f) > 1.0d) {
                        i2 += a + m7873a(this.f6642h, i2, f, a);
                    } else {
                        i2 += m7881b(this.f6642h, i2, f, a);
                    }
                }
            } while (this.f6639e + i2 <= i);
            m7887c(i2);
        }
    }

    /* renamed from: c */
    private void m7885c() {
        int i = this.f6652r;
        float f = this.f6649o / this.f6650p;
        double d = (double) f;
        if (d <= 1.00001d) {
            if (d >= 0.99999d) {
                m7879a(this.f6642h, 0, this.f6651q);
                this.f6651q = 0;
                if (this.f6650p != 1.0f) {
                    m7876a(this.f6650p, i);
                }
            }
        }
        m7886c(f);
        if (this.f6650p != 1.0f) {
            m7876a(this.f6650p, i);
        }
    }

    /* renamed from: a */
    private static void m7878a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
