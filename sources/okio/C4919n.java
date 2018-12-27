package okio;

import java.nio.ByteBuffer;

/* renamed from: okio.n */
final class C4919n implements C4393d {
    /* renamed from: a */
    public final C4755c f21988a = new C4755c();
    /* renamed from: b */
    public final C2994r f21989b;
    /* renamed from: c */
    boolean f21990c;

    C4919n(C2994r c2994r) {
        if (c2994r != null) {
            this.f21989b = c2994r;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: c */
    public C4755c m30344c() {
        return this.f21988a;
    }

    public void a_(C4755c c4755c, long j) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.a_(c4755c, j);
        m30353w();
    }

    /* renamed from: b */
    public C4393d m30343b(ByteString byteString) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.a(byteString);
        return m30353w();
    }

    /* renamed from: b */
    public C4393d m30342b(String str) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.a(str);
        return m30353w();
    }

    /* renamed from: c */
    public C4393d m30345c(byte[] bArr) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.b(bArr);
        return m30353w();
    }

    /* renamed from: c */
    public C4393d m30346c(byte[] bArr, int i, int i2) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.b(bArr, i, i2);
        return m30353w();
    }

    public int write(ByteBuffer byteBuffer) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        byteBuffer = this.f21988a.write(byteBuffer);
        m30353w();
        return byteBuffer;
    }

    /* renamed from: a */
    public long m30340a(C2995s c2995s) {
        if (c2995s != null) {
            long j = 0;
            while (true) {
                long a = c2995s.a(this.f21988a, 8192);
                if (a == -1) {
                    return j;
                }
                j += a;
                m30353w();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: k */
    public C4393d m30350k(int i) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.b(i);
        return m30353w();
    }

    /* renamed from: j */
    public C4393d m30349j(int i) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.c(i);
        return m30353w();
    }

    /* renamed from: i */
    public C4393d m30348i(int i) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.d(i);
        return m30353w();
    }

    /* renamed from: h */
    public C4393d m30347h(int i) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.e(i);
        return m30353w();
    }

    /* renamed from: m */
    public C4393d m30352m(long j) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.j(j);
        return m30353w();
    }

    /* renamed from: l */
    public C4393d m30351l(long j) {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        this.f21988a.k(j);
        return m30353w();
    }

    /* renamed from: w */
    public C4393d m30353w() {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        long g = this.f21988a.g();
        if (g > 0) {
            this.f21989b.a_(this.f21988a, g);
        }
        return this;
    }

    public void flush() {
        if (this.f21990c) {
            throw new IllegalStateException("closed");
        }
        if (this.f21988a.f20813b > 0) {
            this.f21989b.a_(this.f21988a, this.f21988a.f20813b);
        }
        this.f21989b.flush();
    }

    public boolean isOpen() {
        return this.f21990c ^ 1;
    }

    public void close() {
        if (!this.f21990c) {
            Throwable th = null;
            try {
                if (this.f21988a.f20813b > 0) {
                    this.f21989b.a_(this.f21988a, this.f21988a.f20813b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f21989b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f21990c = true;
            if (th != null) {
                C4907u.m30282a(th);
            }
        }
    }

    /* renamed from: a */
    public C2996t m30341a() {
        return this.f21989b.a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.f21989b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
