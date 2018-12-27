package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class zzbo extends ao {
    /* renamed from: j */
    private static final AtomicLong f21420j = new AtomicLong(Long.MIN_VALUE);
    /* renamed from: a */
    private C2493s f21421a;
    /* renamed from: b */
    private C2493s f21422b;
    /* renamed from: c */
    private final PriorityBlockingQueue<C2492r<?>> f21423c = new PriorityBlockingQueue();
    /* renamed from: d */
    private final BlockingQueue<C2492r<?>> f21424d = new LinkedBlockingQueue();
    /* renamed from: e */
    private final UncaughtExceptionHandler f21425e = new C2491q(this, "Thread death: Uncaught exception on worker thread");
    /* renamed from: f */
    private final UncaughtExceptionHandler f21426f = new C2491q(this, "Thread death: Uncaught exception on network thread");
    /* renamed from: g */
    private final Object f21427g = new Object();
    /* renamed from: h */
    private final Semaphore f21428h = new Semaphore(2);
    /* renamed from: i */
    private volatile boolean f21429i;

    zzbo(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: e */
    protected final boolean mo4839e() {
        return false;
    }

    /* renamed from: d */
    public final void mo4395d() {
        if (Thread.currentThread() != this.f21421a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: c */
    public final void mo4394c() {
        if (Thread.currentThread() != this.f21422b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: g */
    public final boolean m28575g() {
        return Thread.currentThread() == this.f21421a;
    }

    /* renamed from: a */
    public final <V> Future<V> m28566a(Callable<V> callable) {
        m27280A();
        Preconditions.checkNotNull(callable);
        C2492r c2492r = new C2492r(this, (Callable) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f21421a) {
            if (this.f21423c.isEmpty() == null) {
                mo3172r().m28540i().m12354a("Callable skipped the worker queue.");
            }
            c2492r.run();
        } else {
            m28559a(c2492r);
        }
        return c2492r;
    }

    /* renamed from: b */
    public final <V> Future<V> m28569b(Callable<V> callable) {
        m27280A();
        Preconditions.checkNotNull(callable);
        C2492r c2492r = new C2492r(this, (Callable) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f21421a) {
            c2492r.run();
        } else {
            m28559a(c2492r);
        }
        return c2492r;
    }

    /* renamed from: a */
    public final void m28568a(Runnable runnable) {
        m27280A();
        Preconditions.checkNotNull(runnable);
        m28559a(new C2492r(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: a */
    private final void m28559a(C2492r<?> c2492r) {
        synchronized (this.f21427g) {
            this.f21423c.add(c2492r);
            if (this.f21421a == null) {
                this.f21421a = new C2493s(this, "Measurement Worker", this.f21423c);
                this.f21421a.setUncaughtExceptionHandler(this.f21425e);
                this.f21421a.start();
            } else {
                this.f21421a.m12321a();
            }
        }
    }

    /* renamed from: b */
    public final void m28571b(Runnable runnable) {
        m27280A();
        Preconditions.checkNotNull(runnable);
        C2492r c2492r = new C2492r(this, runnable, false, "Task exception on network thread");
        synchronized (this.f21427g) {
            this.f21424d.add(c2492r);
            if (this.f21422b == null) {
                this.f21422b = new C2493s(this, "Measurement Network", this.f21424d);
                this.f21422b.setUncaughtExceptionHandler(this.f21426f);
                this.f21422b.start();
            } else {
                this.f21422b.m12321a();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
