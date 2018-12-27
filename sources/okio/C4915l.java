package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: okio.l */
public final class C4915l implements C2995s {
    /* renamed from: a */
    private final C4394e f21980a;
    /* renamed from: b */
    private final Inflater f21981b;
    /* renamed from: c */
    private int f21982c;
    /* renamed from: d */
    private boolean f21983d;

    C4915l(C4394e c4394e, Inflater inflater) {
        if (c4394e == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f21980a = c4394e;
            this.f21981b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: a */
    public long m30330a(C4755c c4755c, long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f21983d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            C2992p f;
            while (true) {
                boolean b = m30332b();
                try {
                    f = c4755c.f(1);
                    int inflate = this.f21981b.inflate(f.f12684a, f.f12686c, (int) Math.min(j, (long) (8192 - f.f12686c)));
                    if (inflate > 0) {
                        f.f12686c += inflate;
                        long j2 = (long) inflate;
                        c4755c.f20813b += j2;
                        return j2;
                    } else if (this.f21981b.finished()) {
                        break;
                    } else if (this.f21981b.needsDictionary()) {
                        break;
                    } else if (b) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (C4755c c4755c2) {
                    throw new IOException(c4755c2);
                }
            }
            m30329c();
            if (f.f12685b == f.f12686c) {
                c4755c2.f20812a = f.b();
                C2993q.a(f);
            }
            return -1;
        }
    }

    /* renamed from: b */
    public boolean m30332b() {
        if (!this.f21981b.needsInput()) {
            return false;
        }
        m30329c();
        if (this.f21981b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f21980a.e()) {
            return true;
        } else {
            C2992p c2992p = this.f21980a.c().f20812a;
            this.f21982c = c2992p.f12686c - c2992p.f12685b;
            this.f21981b.setInput(c2992p.f12684a, c2992p.f12685b, this.f21982c);
            return false;
        }
    }

    /* renamed from: c */
    private void m30329c() {
        if (this.f21982c != 0) {
            int remaining = this.f21982c - this.f21981b.getRemaining();
            this.f21982c -= remaining;
            this.f21980a.i((long) remaining);
        }
    }

    /* renamed from: a */
    public C2996t m30331a() {
        return this.f21980a.a();
    }

    public void close() {
        if (!this.f21983d) {
            this.f21981b.end();
            this.f21983d = true;
            this.f21980a.close();
        }
    }
}
