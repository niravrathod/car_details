package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: okio.k */
public final class C4914k implements C2995s {
    /* renamed from: a */
    private int f21975a = 0;
    /* renamed from: b */
    private final C4394e f21976b;
    /* renamed from: c */
    private final Inflater f21977c;
    /* renamed from: d */
    private final C4915l f21978d;
    /* renamed from: e */
    private final CRC32 f21979e = new CRC32();

    public C4914k(C2995s c2995s) {
        if (c2995s != null) {
            this.f21977c = new Inflater(true);
            this.f21976b = C4905m.m30266a(c2995s);
            this.f21978d = new C4915l(this.f21976b, this.f21977c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public long m30327a(C4755c c4755c, long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f21975a == 0) {
                m30325b();
                this.f21975a = 1;
            }
            if (this.f21975a == 1) {
                long j2 = c4755c.f20813b;
                j = this.f21978d.m30330a(c4755c, j);
                if (j != -1) {
                    m30324a(c4755c, j2, j);
                    return j;
                }
                this.f21975a = 2;
            }
            if (this.f21975a == 2) {
                m30326c();
                this.f21975a = 3;
                if (this.f21976b.e() == null) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    private void m30325b() {
        this.f21976b.a(10);
        byte c = this.f21976b.c().c(3);
        Object obj = ((c >> 1) & 1) == 1 ? 1 : null;
        if (obj != null) {
            m30324a(r6.f21976b.c(), 0, 10);
        }
        m30323a("ID1ID2", 8075, r6.f21976b.i());
        r6.f21976b.i(8);
        if (((c >> 2) & 1) == 1) {
            r6.f21976b.a(2);
            if (obj != null) {
                m30324a(r6.f21976b.c(), 0, 2);
            }
            long k = (long) r6.f21976b.c().k();
            r6.f21976b.a(k);
            if (obj != null) {
                m30324a(r6.f21976b.c(), 0, k);
            }
            r6.f21976b.i(k);
        }
        if (((c >> 3) & 1) == 1) {
            long a = r6.f21976b.a((byte) 0);
            if (a != -1) {
                if (obj != null) {
                    m30324a(r6.f21976b.c(), 0, a + 1);
                }
                r6.f21976b.i(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((c >> 4) & 1) == 1) {
            long a2 = r6.f21976b.a((byte) 0);
            if (a2 != -1) {
                if (obj != null) {
                    m30324a(r6.f21976b.c(), 0, a2 + 1);
                }
                r6.f21976b.i(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (obj != null) {
            m30323a("FHCRC", r6.f21976b.k(), (short) ((int) r6.f21979e.getValue()));
            r6.f21979e.reset();
        }
    }

    /* renamed from: c */
    private void m30326c() {
        m30323a("CRC", this.f21976b.l(), (int) this.f21979e.getValue());
        m30323a("ISIZE", this.f21976b.l(), (int) this.f21977c.getBytesWritten());
    }

    /* renamed from: a */
    public C2996t m30328a() {
        return this.f21976b.a();
    }

    public void close() {
        this.f21978d.close();
    }

    /* renamed from: a */
    private void m30324a(C4755c c4755c, long j, long j2) {
        c4755c = c4755c.f20812a;
        while (j >= ((long) (c4755c.f12686c - c4755c.f12685b))) {
            j -= (long) (c4755c.f12686c - c4755c.f12685b);
            c4755c = c4755c.f12689f;
        }
        while (j2 > 0) {
            j = (int) (((long) c4755c.f12685b) + j);
            int min = (int) Math.min((long) (c4755c.f12686c - j), j2);
            this.f21979e.update(c4755c.f12684a, j, min);
            j2 -= (long) min;
            c4755c = c4755c.f12689f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m30323a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
