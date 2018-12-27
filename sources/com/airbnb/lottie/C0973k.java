package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.k */
public class C0973k<T> {
    /* renamed from: a */
    public Executor f3239a;
    /* renamed from: b */
    private Thread f3240b;
    /* renamed from: c */
    private final Set<C0968h<T>> f3241c;
    /* renamed from: d */
    private final Set<C0968h<Throwable>> f3242d;
    /* renamed from: e */
    private final Handler f3243e;
    /* renamed from: f */
    private final FutureTask<C0970j<T>> f3244f;
    /* renamed from: g */
    private C0970j<T> f3245g;

    /* renamed from: com.airbnb.lottie.k$1 */
    class C09711 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C0973k f3237a;

        C09711(C0973k c0973k) {
            this.f3237a = c0973k;
        }

        public void run() {
            if (this.f3237a.f3245g != null) {
                if (!this.f3237a.f3244f.isCancelled()) {
                    C0970j a = this.f3237a.f3245g;
                    if (a.m4210a() != null) {
                        this.f3237a.m4218a(a.m4210a());
                    } else {
                        this.f3237a.m4219a(a.m4211b());
                    }
                }
            }
        }
    }

    public C0973k(Callable<C0970j<T>> callable) {
        this(callable, false);
    }

    C0973k(Callable<C0970j<T>> callable, boolean z) {
        this.f3239a = Executors.newCachedThreadPool();
        this.f3241c = new LinkedHashSet(1);
        this.f3242d = new LinkedHashSet(1);
        this.f3243e = new Handler(Looper.getMainLooper());
        this.f3245g = null;
        this.f3244f = new FutureTask(callable);
        if (z) {
            try {
                m4214a((C0970j) callable.call());
                return;
            } catch (Throwable th) {
                m4214a(new C0970j(th));
                return;
            }
        }
        this.f3239a.execute(this.f3244f);
        m4221b();
    }

    /* renamed from: a */
    private void m4214a(C0970j<T> c0970j) {
        if (this.f3245g == null) {
            this.f3245g = c0970j;
            m4213a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public C0973k<T> m4225a(C0968h<T> c0968h) {
        if (!(this.f3245g == null || this.f3245g.m4210a() == null)) {
            c0968h.mo865a(this.f3245g.m4210a());
        }
        synchronized (this.f3241c) {
            this.f3241c.add(c0968h);
        }
        m4221b();
        return this;
    }

    /* renamed from: b */
    public C0973k<T> m4226b(C0968h<T> c0968h) {
        synchronized (this.f3241c) {
            this.f3241c.remove(c0968h);
        }
        m4222c();
        return this;
    }

    /* renamed from: c */
    public C0973k<T> m4227c(C0968h<Throwable> c0968h) {
        if (!(this.f3245g == null || this.f3245g.m4211b() == null)) {
            c0968h.mo865a(this.f3245g.m4211b());
        }
        synchronized (this.f3242d) {
            this.f3242d.add(c0968h);
        }
        m4221b();
        return this;
    }

    /* renamed from: d */
    public C0973k<T> m4228d(C0968h<T> c0968h) {
        synchronized (this.f3242d) {
            this.f3242d.remove(c0968h);
        }
        m4222c();
        return this;
    }

    /* renamed from: a */
    private void m4213a() {
        this.f3243e.post(new C09711(this));
    }

    /* renamed from: a */
    private void m4218a(T t) {
        for (C0968h a : new ArrayList(this.f3241c)) {
            a.mo865a(t);
        }
    }

    /* renamed from: a */
    private void m4219a(Throwable th) {
        List<C0968h> arrayList = new ArrayList(this.f3242d);
        if (arrayList.isEmpty()) {
            Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added.", th);
            return;
        }
        for (C0968h a : arrayList) {
            a.mo865a(th);
        }
    }

    /* renamed from: b */
    private void m4221b() {
        if (!m4224d()) {
            if (this.f3245g == null) {
                this.f3240b = new Thread(this, "LottieTaskObserver") {
                    /* renamed from: a */
                    final /* synthetic */ C0973k f3238a;

                    public void run() {
                        while (!isInterrupted()) {
                            if (this.f3238a.f3244f.isDone()) {
                                try {
                                    this.f3238a.m4214a((C0970j) this.f3238a.f3244f.get());
                                } catch (Throwable e) {
                                    this.f3238a.m4214a(new C0970j(e));
                                }
                                this.f3238a.m4222c();
                            }
                        }
                    }
                };
                this.f3240b.start();
                C0949c.m4076a("Starting TaskObserver thread");
            }
        }
    }

    /* renamed from: c */
    private void m4222c() {
        if (m4224d()) {
            if (this.f3241c.isEmpty() || this.f3245g != null) {
                this.f3240b.interrupt();
                this.f3240b = null;
                C0949c.m4076a("Stopping TaskObserver thread");
            }
        }
    }

    /* renamed from: d */
    private boolean m4224d() {
        return this.f3240b != null && this.f3240b.isAlive();
    }
}
