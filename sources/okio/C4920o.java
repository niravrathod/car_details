package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: okio.o */
final class C4920o implements C4394e {
    /* renamed from: a */
    public final C4755c f21991a = new C4755c();
    /* renamed from: b */
    public final C2995s f21992b;
    /* renamed from: c */
    boolean f21993c;

    /* renamed from: okio.o$1 */
    class C49061 extends InputStream {
        /* renamed from: a */
        final /* synthetic */ C4920o f21955a;

        C49061(C4920o c4920o) {
            this.f21955a = c4920o;
        }

        public int read() {
            if (this.f21955a.f21993c) {
                throw new IOException("closed");
            } else if (this.f21955a.f21991a.f20813b == 0 && this.f21955a.f21992b.a(this.f21955a.f21991a, 8192) == -1) {
                return -1;
            } else {
                return this.f21955a.f21991a.h() & 255;
            }
        }

        public int read(byte[] bArr, int i, int i2) {
            if (this.f21955a.f21993c) {
                throw new IOException("closed");
            }
            C4907u.m30281a((long) bArr.length, (long) i, (long) i2);
            if (this.f21955a.f21991a.f20813b == 0 && this.f21955a.f21992b.a(this.f21955a.f21991a, 8192) == -1) {
                return -1;
            }
            return this.f21955a.f21991a.a(bArr, i, i2);
        }

        public int available() {
            if (!this.f21955a.f21993c) {
                return (int) Math.min(this.f21955a.f21991a.f20813b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f21955a.close();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f21955a);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    C4920o(C2995s c2995s) {
        if (c2995s != null) {
            this.f21992b = c2995s;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: c */
    public C4755c m30364c() {
        return this.f21991a;
    }

    /* renamed from: a */
    public long m30356a(C4755c c4755c, long j) {
        if (c4755c == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f21993c) {
            throw new IllegalStateException("closed");
        } else if (this.f21991a.f20813b == 0 && this.f21992b.a(this.f21991a, 8192) == -1) {
            return -1;
        } else {
            return this.f21991a.a(c4755c, Math.min(j, this.f21991a.f20813b));
        }
    }

    /* renamed from: e */
    public boolean m30366e() {
        if (!this.f21993c) {
            return this.f21991a.e() && this.f21992b.a(this.f21991a, 8192) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: a */
    public void m30359a(long j) {
        if (m30363b(j) == null) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public boolean m30363b(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f21993c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f21991a.f20813b < j) {
                if (this.f21992b.a(this.f21991a, 8192) == -1) {
                    return 0;
                }
            }
            return 1;
        }
    }

    /* renamed from: h */
    public byte m30369h() {
        m30359a(1);
        return this.f21991a.h();
    }

    /* renamed from: d */
    public ByteString m30365d(long j) {
        m30359a(j);
        return this.f21991a.d(j);
    }

    /* renamed from: s */
    public byte[] m30380s() {
        this.f21991a.a(this.f21992b);
        return this.f21991a.s();
    }

    /* renamed from: h */
    public byte[] m30370h(long j) {
        m30359a(j);
        return this.f21991a.h(j);
    }

    /* renamed from: a */
    public void m30360a(byte[] bArr) {
        try {
            m30359a((long) bArr.length);
            this.f21991a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f21991a.f20813b > 0) {
                int a = this.f21991a.a(bArr, i, (int) this.f21991a.f20813b);
                if (a != -1) {
                    i += a;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int read(ByteBuffer byteBuffer) {
        if (this.f21991a.f20813b == 0 && this.f21992b.a(this.f21991a, 8192) == -1) {
            return -1;
        }
        return this.f21991a.read(byteBuffer);
    }

    /* renamed from: p */
    public String m30378p() {
        this.f21991a.a(this.f21992b);
        return this.f21991a.p();
    }

    /* renamed from: a */
    public String m30357a(Charset charset) {
        if (charset != null) {
            this.f21991a.a(this.f21992b);
            return this.f21991a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: q */
    public String m30379q() {
        return m30368f(Long.MAX_VALUE);
    }

    /* renamed from: f */
    public String m30368f(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = m30355a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f21991a.g(a);
            }
            if (j2 < Long.MAX_VALUE && m30363b(j2) && this.f21991a.c(j2 - 1) == (byte) 13 && m30363b(1 + j2) && this.f21991a.c(j2) == (byte) 10) {
                return this.f21991a.g(j2);
            }
            C4755c c4755c = new C4755c();
            this.f21991a.a(c4755c, 0, Math.min(32, this.f21991a.b()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min(this.f21991a.b(), j));
            stringBuilder.append(" content=");
            stringBuilder.append(c4755c.o().f());
            stringBuilder.append(8230);
            throw new EOFException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: i */
    public short m30371i() {
        m30359a(2);
        return this.f21991a.i();
    }

    /* renamed from: k */
    public short m30374k() {
        m30359a(2);
        return this.f21991a.k();
    }

    /* renamed from: j */
    public int m30373j() {
        m30359a(4);
        return this.f21991a.j();
    }

    /* renamed from: l */
    public int m30375l() {
        m30359a(4);
        return this.f21991a.l();
    }

    /* renamed from: m */
    public long m30376m() {
        m30359a(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m30363b((long) i2)) {
                break;
            }
            byte c = this.f21991a.c((long) i);
            if (c < (byte) 48 || c > (byte) 57) {
                if (i != 0) {
                    break;
                } else if (c != (byte) 45) {
                    break;
                }
            }
            i = i2;
        }
        if (i != 0) {
            return this.f21991a.m();
        }
        throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(c)}));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: n */
    public long m30377n() {
        /*
        r6 = this;
        r0 = 1;
        r6.m30359a(r0);
        r0 = 0;
        r1 = 0;
    L_0x0007:
        r2 = r1 + 1;
        r3 = (long) r2;
        r3 = r6.m30363b(r3);
        if (r3 == 0) goto L_0x004a;
    L_0x0010:
        r3 = r6.f21991a;
        r4 = (long) r1;
        r3 = r3.c(r4);
        r4 = 48;
        if (r3 < r4) goto L_0x001f;
    L_0x001b:
        r4 = 57;
        if (r3 <= r4) goto L_0x0030;
    L_0x001f:
        r4 = 97;
        if (r3 < r4) goto L_0x0027;
    L_0x0023:
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r3 <= r4) goto L_0x0030;
    L_0x0027:
        r4 = 65;
        if (r3 < r4) goto L_0x0032;
    L_0x002b:
        r4 = 70;
        if (r3 <= r4) goto L_0x0030;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r1 = r2;
        goto L_0x0007;
    L_0x0032:
        if (r1 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x004a;
    L_0x0035:
        r1 = new java.lang.NumberFormatException;
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = java.lang.Byte.valueOf(r3);
        r2[r0] = r3;
        r0 = "Expected leading [0-9a-fA-F] character but was %#x";
        r0 = java.lang.String.format(r0, r2);
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        r0 = r6.f21991a;
        r0 = r0.n();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.o.n():long");
    }

    /* renamed from: i */
    public void m30372i(long j) {
        if (this.f21993c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f21991a.f20813b == 0) {
                if (this.f21992b.a(this.f21991a, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long min = Math.min(j, this.f21991a.b());
            this.f21991a.i(min);
            j -= min;
        }
    }

    /* renamed from: a */
    public long m30354a(byte b) {
        return m30355a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long m30355a(byte b, long j, long j2) {
        if (this.f21993c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a = this.f21991a.a(b, j, j2);
                if (a != -1) {
                    return a;
                }
                a = this.f21991a.f20813b;
                if (a < j2) {
                    if (this.f21992b.a(this.f21991a, 8192) != -1) {
                        j = Math.max(j, a);
                    }
                }
                return -1;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public boolean m30361a(long j, ByteString byteString) {
        return m30362a(j, byteString, 0, byteString.h());
    }

    /* renamed from: a */
    public boolean m30362a(long j, ByteString byteString, int i, int i2) {
        if (this.f21993c) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0 && i >= 0 && i2 >= 0) {
            if (byteString.h() - i >= i2) {
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = ((long) i3) + j;
                    if (!m30363b(1 + j2) || this.f21991a.c(j2) != byteString.a(i + i3)) {
                        return false;
                    }
                    i3++;
                }
                return 1;
            }
        }
        return false;
    }

    /* renamed from: f */
    public InputStream m30367f() {
        return new C49061(this);
    }

    public boolean isOpen() {
        return this.f21993c ^ 1;
    }

    public void close() {
        if (!this.f21993c) {
            this.f21993c = true;
            this.f21992b.close();
            this.f21991a.t();
        }
    }

    /* renamed from: a */
    public C2996t m30358a() {
        return this.f21992b.a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.f21992b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
