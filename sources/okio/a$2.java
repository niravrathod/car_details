package okio;

import java.io.IOException;

class a$2 implements C2995s {
    /* renamed from: a */
    final /* synthetic */ C2995s f21962a;
    /* renamed from: b */
    final /* synthetic */ C4392a f21963b;

    a$2(C4392a c4392a, C2995s c2995s) {
        this.f21963b = c4392a;
        this.f21962a = c2995s;
    }

    /* renamed from: a */
    public long m30303a(C4755c c4755c, long j) {
        this.f21963b.c();
        try {
            c4755c = this.f21962a.a(c4755c, j);
            this.f21963b.a(true);
            return c4755c;
        } catch (C4755c c4755c2) {
            throw this.f21963b.b(c4755c2);
        } catch (Throwable th) {
            this.f21963b.a(false);
        }
    }

    public void close() {
        try {
            this.f21962a.close();
            this.f21963b.a(true);
        } catch (IOException e) {
            throw this.f21963b.b(e);
        } catch (Throwable th) {
            this.f21963b.a(false);
        }
    }

    /* renamed from: a */
    public C2996t m30304a() {
        return this.f21963b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AsyncTimeout.source(");
        stringBuilder.append(this.f21962a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
