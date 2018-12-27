package okio;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: okio.j */
public final class C4913j implements C2994r {
    /* renamed from: a */
    private final C4393d f21970a;
    /* renamed from: b */
    private final Deflater f21971b;
    /* renamed from: c */
    private final C4909f f21972c;
    /* renamed from: d */
    private boolean f21973d;
    /* renamed from: e */
    private final CRC32 f21974e = new CRC32();

    public C4913j(C2994r c2994r) {
        if (c2994r != null) {
            this.f21971b = new Deflater(-1, true);
            this.f21970a = C4905m.m30265a(c2994r);
            this.f21972c = new C4909f(this.f21970a, this.f21971b);
            m30319b();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public void a_(C4755c c4755c, long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            m30320b(c4755c, j);
            this.f21972c.a_(c4755c, j);
        }
    }

    public void flush() {
        this.f21972c.flush();
    }

    /* renamed from: a */
    public C2996t m30322a() {
        return this.f21970a.a();
    }

    public void close() {
        if (!this.f21973d) {
            Throwable th = null;
            try {
                this.f21972c.m30307b();
                m30321c();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f21971b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f21970a.close();
            } catch (Throwable th32) {
                if (th == null) {
                    th = th32;
                }
            }
            this.f21973d = true;
            if (th != null) {
                C4907u.m30282a(th);
            }
        }
    }

    /* renamed from: b */
    private void m30319b() {
        C4755c c = this.f21970a.c();
        c.c(8075);
        c.b(8);
        c.b(0);
        c.d(0);
        c.b(0);
        c.b(0);
    }

    /* renamed from: c */
    private void m30321c() {
        this.f21970a.h((int) this.f21974e.getValue());
        this.f21970a.h((int) this.f21971b.getBytesRead());
    }

    /* renamed from: b */
    private void m30320b(C4755c c4755c, long j) {
        c4755c = c4755c.f20812a;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (c4755c.f12686c - c4755c.f12685b));
            this.f21974e.update(c4755c.f12684a, c4755c.f12685b, min);
            j -= (long) min;
            c4755c = c4755c.f12689f;
        }
    }
}
