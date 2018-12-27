package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class eg extends FilterInputStream {
    /* renamed from: a */
    private final long f8023a;
    /* renamed from: b */
    private long f8024b;

    eg(InputStream inputStream, long j) {
        super(inputStream);
        this.f8023a = j;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f8024b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr = super.read(bArr, i, i2);
        if (bArr != -1) {
            this.f8024b += (long) bArr;
        }
        return bArr;
    }

    /* renamed from: a */
    final long m8920a() {
        return this.f8023a - this.f8024b;
    }
}
