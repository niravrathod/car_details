package okhttp3.internal;

/* renamed from: okhttp3.internal.b */
public abstract class C2929b implements Runnable {
    /* renamed from: b */
    protected final String f12349b;

    /* renamed from: c */
    protected abstract void mo3659c();

    public C2929b(String str, Object... objArr) {
        this.f12349b = C2933c.m14186a(str, objArr);
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f12349b);
        try {
            mo3659c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
