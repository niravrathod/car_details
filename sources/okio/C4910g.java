package okio;

/* renamed from: okio.g */
public abstract class C4910g implements C2994r {
    /* renamed from: a */
    private final C2994r f21967a;

    public C4910g(C2994r c2994r) {
        if (c2994r != null) {
            this.f21967a = c2994r;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void a_(C4755c c4755c, long j) {
        this.f21967a.a_(c4755c, j);
    }

    public void flush() {
        this.f21967a.flush();
    }

    /* renamed from: a */
    public C2996t m30308a() {
        return this.f21967a.a();
    }

    public void close() {
        this.f21967a.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.f21967a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
