package okio;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: okio.f */
public final class C4909f implements C2994r {
    /* renamed from: a */
    private final C4393d f21964a;
    /* renamed from: b */
    private final Deflater f21965b;
    /* renamed from: c */
    private boolean f21966c;

    C4909f(C4393d c4393d, Deflater deflater) {
        if (c4393d == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f21964a = c4393d;
            this.f21965b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public void a_(C4755c c4755c, long j) {
        C4907u.m30281a(c4755c.f20813b, 0, j);
        while (j > 0) {
            C2992p c2992p = c4755c.f20812a;
            int min = (int) Math.min(j, (long) (c2992p.f12686c - c2992p.f12685b));
            this.f21965b.setInput(c2992p.f12684a, c2992p.f12685b, min);
            m30305a(false);
            long j2 = (long) min;
            c4755c.f20813b -= j2;
            c2992p.f12685b += min;
            if (c2992p.f12685b == c2992p.f12686c) {
                c4755c.f20812a = c2992p.b();
                C2993q.a(c2992p);
            }
            j -= j2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private void m30305a(boolean z) {
        C4755c c = this.f21964a.c();
        while (true) {
            int deflate;
            C2992p f = c.f(1);
            if (z) {
                deflate = this.f21965b.deflate(f.f12684a, f.f12686c, 8192 - f.f12686c, 2);
            } else {
                deflate = this.f21965b.deflate(f.f12684a, f.f12686c, 8192 - f.f12686c);
            }
            if (deflate > 0) {
                f.f12686c += deflate;
                c.f20813b += (long) deflate;
                this.f21964a.w();
            } else if (this.f21965b.needsInput()) {
                break;
            }
        }
        if (f.f12685b == f.f12686c) {
            c.f20812a = f.b();
            C2993q.a(f);
        }
    }

    public void flush() {
        m30305a(true);
        this.f21964a.flush();
    }

    /* renamed from: b */
    void m30307b() {
        this.f21965b.finish();
        m30305a(false);
    }

    public void close() {
        if (!this.f21966c) {
            Throwable th = null;
            try {
                m30307b();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f21965b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f21964a.close();
            } catch (Throwable th32) {
                if (th == null) {
                    th = th32;
                }
            }
            this.f21966c = true;
            if (th != null) {
                C4907u.m30282a(th);
            }
        }
    }

    /* renamed from: a */
    public C2996t m30306a() {
        return this.f21964a.a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeflaterSink(");
        stringBuilder.append(this.f21964a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
