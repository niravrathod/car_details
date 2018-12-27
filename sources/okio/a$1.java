package okio;

import java.io.IOException;

class a$1 implements C2994r {
    /* renamed from: a */
    final /* synthetic */ C2994r f21960a;
    /* renamed from: b */
    final /* synthetic */ C4392a f21961b;

    a$1(C4392a c4392a, C2994r c2994r) {
        this.f21961b = c4392a;
        this.f21960a = c2994r;
    }

    public void a_(C4755c c4755c, long j) {
        C4907u.m30281a(c4755c.f20813b, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C2992p c2992p = c4755c.f20812a;
                while (j2 < 65536) {
                    j2 += (long) (c2992p.f12686c - c2992p.f12685b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    c2992p = c2992p.f12689f;
                }
                this.f21961b.c();
                try {
                    this.f21960a.a_(c4755c, j2);
                    j -= j2;
                    this.f21961b.a(true);
                } catch (C4755c c4755c2) {
                    throw this.f21961b.b(c4755c2);
                } catch (Throwable th) {
                    this.f21961b.a(false);
                }
            } else {
                return;
            }
        }
    }

    public void flush() {
        this.f21961b.c();
        try {
            this.f21960a.flush();
            this.f21961b.a(true);
        } catch (IOException e) {
            throw this.f21961b.b(e);
        } catch (Throwable th) {
            this.f21961b.a(false);
        }
    }

    public void close() {
        this.f21961b.c();
        try {
            this.f21960a.close();
            this.f21961b.a(true);
        } catch (IOException e) {
            throw this.f21961b.b(e);
        } catch (Throwable th) {
            this.f21961b.a(false);
        }
    }

    /* renamed from: a */
    public C2996t m30302a() {
        return this.f21961b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AsyncTimeout.sink(");
        stringBuilder.append(this.f21960a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
