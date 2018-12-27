package com.bumptech.glide.p055g;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.g.g */
public class C1176g extends FilterInputStream {
    /* renamed from: a */
    private int f3831a = Integer.MIN_VALUE;

    public C1176g(InputStream inputStream) {
        super(inputStream);
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f3831a = i;
    }

    public int read() {
        if (m4876a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m4877b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        i2 = (int) m4876a((long) i2);
        if (i2 == -1) {
            return -1;
        }
        bArr = super.read(bArr, i, i2);
        m4877b((long) bArr);
        return bArr;
    }

    public synchronized void reset() {
        super.reset();
        this.f3831a = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        j = m4876a(j);
        if (j == -1) {
            return 0;
        }
        j = super.skip(j);
        m4877b(j);
        return j;
    }

    public int available() {
        if (this.f3831a == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(this.f3831a, super.available());
    }

    /* renamed from: a */
    private long m4876a(long j) {
        if (this.f3831a == 0) {
            return -1;
        }
        return (this.f3831a == Integer.MIN_VALUE || j <= ((long) this.f3831a)) ? j : (long) this.f3831a;
    }

    /* renamed from: b */
    private void m4877b(long j) {
        if (this.f3831a != Integer.MIN_VALUE && j != -1) {
            this.f3831a = (int) (((long) this.f3831a) - j);
        }
    }
}
