package android.arch.p001a.p002a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
public class C2997a extends C0008c {
    /* renamed from: a */
    private static volatile C2997a f12697a;
    /* renamed from: d */
    private static final Executor f12698d = new C00061();
    /* renamed from: e */
    private static final Executor f12699e = new C00072();
    /* renamed from: b */
    private C0008c f12700b = this.f12701c;
    /* renamed from: c */
    private C0008c f12701c = new C2998b();

    /* renamed from: android.arch.a.a.a$1 */
    static class C00061 implements Executor {
        C00061() {
        }

        public void execute(Runnable runnable) {
            C2997a.m14678a().mo2b(runnable);
        }
    }

    /* renamed from: android.arch.a.a.a$2 */
    static class C00072 implements Executor {
        C00072() {
        }

        public void execute(Runnable runnable) {
            C2997a.m14678a().mo1a(runnable);
        }
    }

    private C2997a() {
    }

    /* renamed from: a */
    public static C2997a m14678a() {
        if (f12697a != null) {
            return f12697a;
        }
        synchronized (C2997a.class) {
            if (f12697a == null) {
                f12697a = new C2997a();
            }
        }
        return f12697a;
    }

    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f12700b.mo1a(runnable);
    }

    /* renamed from: b */
    public void mo2b(Runnable runnable) {
        this.f12700b.mo2b(runnable);
    }

    /* renamed from: b */
    public boolean mo3b() {
        return this.f12700b.mo3b();
    }
}
