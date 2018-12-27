package okio;

/* renamed from: okio.h */
public abstract class C4911h implements C2995s {
    /* renamed from: a */
    private final C2995s f21968a;

    public C4911h(C2995s c2995s) {
        if (c2995s != null) {
            this.f21968a = c2995s;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: b */
    public final C2995s m30311b() {
        return this.f21968a;
    }

    /* renamed from: a */
    public long m30309a(C4755c c4755c, long j) {
        return this.f21968a.a(c4755c, j);
    }

    /* renamed from: a */
    public C2996t m30310a() {
        return this.f21968a.a();
    }

    public void close() {
        this.f21968a.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("(");
        stringBuilder.append(this.f21968a.toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
