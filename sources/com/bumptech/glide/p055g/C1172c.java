package com.bumptech.glide.p055g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.g.c */
public final class C1172c extends FilterInputStream {
    /* renamed from: a */
    private final long f3821a;
    /* renamed from: b */
    private int f3822b;

    /* renamed from: a */
    public static InputStream m4860a(InputStream inputStream, long j) {
        return new C1172c(inputStream, j);
    }

    private C1172c(InputStream inputStream, long j) {
        super(inputStream);
        this.f3821a = j;
    }

    public synchronized int available() {
        return (int) Math.max(this.f3821a - ((long) this.f3822b), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        m4859a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return m4859a(super.read(bArr, i, i2));
    }

    /* renamed from: a */
    private int m4859a(int i) {
        if (i >= 0) {
            this.f3822b += i;
        } else if (this.f3821a - ((long) this.f3822b) > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to read all expected data, expected: ");
            stringBuilder.append(this.f3821a);
            stringBuilder.append(", but read: ");
            stringBuilder.append(this.f3822b);
            throw new IOException(stringBuilder.toString());
        }
        return i;
    }
}
