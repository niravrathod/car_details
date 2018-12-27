package com.bumptech.glide.load.p057a;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.g */
public final class C1192g extends FilterInputStream {
    /* renamed from: a */
    private static final byte[] f3865a = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    /* renamed from: b */
    private static final int f3866b = f3865a.length;
    /* renamed from: c */
    private static final int f3867c = (f3866b + 2);
    /* renamed from: d */
    private final byte f3868d;
    /* renamed from: e */
    private int f3869e;

    public boolean markSupported() {
        return false;
    }

    public C1192g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot add invalid orientation: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f3868d = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public int read() {
        int i;
        if (this.f3869e >= 2) {
            if (this.f3869e <= f3867c) {
                if (this.f3869e == f3867c) {
                    i = this.f3868d;
                } else {
                    i = f3865a[this.f3869e - 2] & 255;
                }
                if (i != -1) {
                    this.f3869e++;
                }
                return i;
            }
        }
        i = super.read();
        if (i != -1) {
            this.f3869e++;
        }
        return i;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f3869e > f3867c) {
            bArr = super.read(bArr, i, i2);
        } else if (this.f3869e == f3867c) {
            bArr[i] = this.f3868d;
            bArr = 1;
        } else if (this.f3869e < 2) {
            bArr = super.read(bArr, i, 2 - this.f3869e);
        } else {
            i2 = Math.min(f3867c - this.f3869e, i2);
            System.arraycopy(f3865a, this.f3869e - 2, bArr, i, i2);
            bArr = i2;
        }
        if (bArr > null) {
            this.f3869e += bArr;
        }
        return bArr;
    }

    public long skip(long j) {
        j = super.skip(j);
        if (j > 0) {
            this.f3869e = (int) (((long) this.f3869e) + j);
        }
        return j;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
