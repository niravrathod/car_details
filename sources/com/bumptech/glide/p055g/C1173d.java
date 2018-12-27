package com.bumptech.glide.p055g;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.g.d */
public class C1173d extends InputStream {
    /* renamed from: a */
    private static final Queue<C1173d> f3823a = C1180j.m4895a(0);
    /* renamed from: b */
    private InputStream f3824b;
    /* renamed from: c */
    private IOException f3825c;

    /* renamed from: a */
    public static C1173d m4861a(InputStream inputStream) {
        C1173d c1173d;
        synchronized (f3823a) {
            c1173d = (C1173d) f3823a.poll();
        }
        if (c1173d == null) {
            c1173d = new C1173d();
        }
        c1173d.m4864b(inputStream);
        return c1173d;
    }

    C1173d() {
    }

    /* renamed from: b */
    void m4864b(InputStream inputStream) {
        this.f3824b = inputStream;
    }

    public int available() {
        return this.f3824b.available();
    }

    public void close() {
        this.f3824b.close();
    }

    public void mark(int i) {
        this.f3824b.mark(i);
    }

    public boolean markSupported() {
        return this.f3824b.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f3824b.read(bArr);
        } catch (byte[] bArr2) {
            this.f3825c = bArr2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f3824b.read(bArr, i, i2);
        } catch (byte[] bArr2) {
            this.f3825c = bArr2;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f3824b.reset();
    }

    public long skip(long j) {
        try {
            return this.f3824b.skip(j);
        } catch (long j2) {
            this.f3825c = j2;
            return 0;
        }
    }

    public int read() {
        try {
            return this.f3824b.read();
        } catch (IOException e) {
            this.f3825c = e;
            return -1;
        }
    }

    /* renamed from: a */
    public IOException m4862a() {
        return this.f3825c;
    }

    /* renamed from: b */
    public void m4863b() {
        this.f3825c = null;
        this.f3824b = null;
        synchronized (f3823a) {
            f3823a.offer(this);
        }
    }
}
