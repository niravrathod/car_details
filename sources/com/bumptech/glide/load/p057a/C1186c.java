package com.bumptech.glide.load.p057a;

import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.a.c */
public final class C1186c extends OutputStream {
    /* renamed from: a */
    private final OutputStream f3859a;
    /* renamed from: b */
    private byte[] f3860b;
    /* renamed from: c */
    private C1230b f3861c;
    /* renamed from: d */
    private int f3862d;

    public C1186c(OutputStream outputStream, C1230b c1230b) {
        this(outputStream, c1230b, 65536);
    }

    C1186c(OutputStream outputStream, C1230b c1230b, int i) {
        this.f3859a = outputStream;
        this.f3861c = c1230b;
        this.f3860b = (byte[]) c1230b.mo1011a(i, byte[].class);
    }

    public void write(int i) {
        byte[] bArr = this.f3860b;
        int i2 = this.f3862d;
        this.f3862d = i2 + 1;
        bArr[i2] = (byte) i;
        m4924b();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f3862d != 0 || i4 < this.f3860b.length) {
                i4 = Math.min(i4, this.f3860b.length - this.f3862d);
                System.arraycopy(bArr, i5, this.f3860b, this.f3862d, i4);
                this.f3862d += i4;
                i3 += i4;
                m4924b();
            } else {
                this.f3859a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }

    public void flush() {
        m4923a();
        this.f3859a.flush();
    }

    /* renamed from: a */
    private void m4923a() {
        if (this.f3862d > 0) {
            this.f3859a.write(this.f3860b, 0, this.f3862d);
            this.f3862d = 0;
        }
    }

    /* renamed from: b */
    private void m4924b() {
        if (this.f3862d == this.f3860b.length) {
            m4923a();
        }
    }

    public void close() {
        try {
            flush();
            m4925c();
        } finally {
            this.f3859a.close();
        }
    }

    /* renamed from: c */
    private void m4925c() {
        if (this.f3860b != null) {
            this.f3861c.mo1014a(this.f3860b);
            this.f3860b = null;
        }
    }
}
