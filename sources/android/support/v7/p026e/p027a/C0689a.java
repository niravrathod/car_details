package android.support.v7.p026e.p027a;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.p029g.C0702c.C0698c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: android.support.v7.e.a.a */
public final class C0689a<T> {
    /* renamed from: a */
    private final Executor f2209a;
    /* renamed from: b */
    private final Executor f2210b;
    /* renamed from: c */
    private final C0698c<T> f2211c;

    /* renamed from: android.support.v7.e.a.a$a */
    public static final class C0688a<T> {
        /* renamed from: d */
        private static final Object f2203d = new Object();
        /* renamed from: e */
        private static Executor f2204e = null;
        /* renamed from: f */
        private static final Executor f2205f = new C0687a();
        /* renamed from: a */
        private Executor f2206a;
        /* renamed from: b */
        private Executor f2207b;
        /* renamed from: c */
        private final C0698c<T> f2208c;

        /* renamed from: android.support.v7.e.a.a$a$a */
        private static class C0687a implements Executor {
            /* renamed from: a */
            final Handler f2202a;

            private C0687a() {
                this.f2202a = new Handler(Looper.getMainLooper());
            }

            public void execute(Runnable runnable) {
                this.f2202a.post(runnable);
            }
        }

        public C0688a(C0698c<T> c0698c) {
            this.f2208c = c0698c;
        }

        /* renamed from: a */
        public C0689a<T> m2719a() {
            if (this.f2206a == null) {
                this.f2206a = f2205f;
            }
            if (this.f2207b == null) {
                synchronized (f2203d) {
                    if (f2204e == null) {
                        f2204e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f2207b = f2204e;
            }
            return new C0689a(this.f2206a, this.f2207b, this.f2208c);
        }
    }

    private C0689a(Executor executor, Executor executor2, C0698c<T> c0698c) {
        this.f2209a = executor;
        this.f2210b = executor2;
        this.f2211c = c0698c;
    }

    /* renamed from: a */
    public Executor m2720a() {
        return this.f2209a;
    }

    /* renamed from: b */
    public Executor m2721b() {
        return this.f2210b;
    }

    /* renamed from: c */
    public C0698c<T> m2722c() {
        return this.f2211c;
    }
}
