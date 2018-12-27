package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

public final class zzav extends ByteArrayOutputStream {
    /* renamed from: a */
    private final zzak f9036a;

    public zzav(zzak zzak, int i) {
        this.f9036a = zzak;
        this.buf = this.f9036a.m9653a(Math.max(i, 256));
    }

    public final void close() {
        this.f9036a.m9652a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f9036a.m9652a(this.buf);
    }

    /* renamed from: a */
    private final void m10178a(int i) {
        if (this.count + i > this.buf.length) {
            i = this.f9036a.m9653a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, i, 0, this.count);
            this.f9036a.m9652a(this.buf);
            this.buf = i;
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m10178a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m10178a(1);
        super.write(i);
    }
}
