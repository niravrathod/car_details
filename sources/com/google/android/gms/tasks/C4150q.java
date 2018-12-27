package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.q */
final class C4150q<TResult> extends Task<TResult> {
    /* renamed from: a */
    private final Object f17651a = new Object();
    /* renamed from: b */
    private final C2516o<TResult> f17652b = new C2516o();
    @GuardedBy("mLock")
    /* renamed from: c */
    private boolean f17653c;
    /* renamed from: d */
    private volatile boolean f17654d;
    @GuardedBy("mLock")
    /* renamed from: e */
    private TResult f17655e;
    @GuardedBy("mLock")
    /* renamed from: f */
    private Exception f17656f;

    C4150q() {
    }

    /* renamed from: a */
    public final boolean mo3214a() {
        boolean z;
        synchronized (this.f17651a) {
            z = this.f17653c;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo3217c() {
        return this.f17654d;
    }

    /* renamed from: b */
    public final boolean mo3216b() {
        boolean z;
        synchronized (this.f17651a) {
            z = this.f17653c && !this.f17654d && this.f17656f == null;
        }
        return z;
    }

    /* renamed from: d */
    public final TResult mo3218d() {
        TResult tResult;
        synchronized (this.f17651a) {
            m22842g();
            m22844i();
            if (this.f17656f == null) {
                tResult = this.f17655e;
            } else {
                throw new RuntimeExecutionException(this.f17656f);
            }
        }
        return tResult;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo3213a(Class<X> cls) {
        synchronized (this.f17651a) {
            m22842g();
            m22844i();
            if (cls.isInstance(this.f17656f)) {
                throw ((Throwable) cls.cast(this.f17656f));
            } else if (this.f17656f == null) {
                cls = this.f17655e;
            } else {
                throw new RuntimeExecutionException(this.f17656f);
            }
        }
        return cls;
    }

    /* renamed from: e */
    public final Exception mo3219e() {
        Exception exception;
        synchronized (this.f17651a) {
            exception = this.f17656f;
        }
        return exception;
    }

    /* renamed from: a */
    public final Task<TResult> mo3212a(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f17652b.m12429a(new C4149l(executor, onSuccessListener));
        m22845j();
        return this;
    }

    /* renamed from: a */
    public final Task<TResult> mo3211a(Executor executor, OnFailureListener onFailureListener) {
        this.f17652b.m12429a(new C4148j(executor, onFailureListener));
        m22845j();
        return this;
    }

    /* renamed from: a */
    public final Task<TResult> mo3207a(OnCompleteListener<TResult> onCompleteListener) {
        return mo3210a(TaskExecutors.f10822a, (OnCompleteListener) onCompleteListener);
    }

    /* renamed from: a */
    public final Task<TResult> mo3210a(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f17652b.m12429a(new C4147h(executor, onCompleteListener));
        m22845j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> Task<TContinuationResult> mo3206a(Continuation<TResult, TContinuationResult> continuation) {
        return mo3208a(TaskExecutors.f10822a, (Continuation) continuation);
    }

    /* renamed from: a */
    public final <TContinuationResult> Task<TContinuationResult> mo3208a(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        Task c4150q = new C4150q();
        this.f17652b.m12429a(new C4144b(executor, continuation, c4150q));
        m22845j();
        return c4150q;
    }

    /* renamed from: a */
    public final Task<TResult> mo3209a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f17652b.m12429a(new C4146f(executor, onCanceledListener));
        m22845j();
        return this;
    }

    /* renamed from: b */
    public final <TContinuationResult> Task<TContinuationResult> mo3215b(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        Task c4150q = new C4150q();
        this.f17652b.m12429a(new C4145d(executor, continuation, c4150q));
        m22845j();
        return c4150q;
    }

    /* renamed from: a */
    public final void m22855a(TResult tResult) {
        synchronized (this.f17651a) {
            m22843h();
            this.f17653c = true;
            this.f17655e = tResult;
        }
        this.f17652b.m12428a((Task) this);
    }

    /* renamed from: b */
    public final boolean m22860b(TResult tResult) {
        synchronized (this.f17651a) {
            if (this.f17653c) {
                return null;
            }
            this.f17653c = true;
            this.f17655e = tResult;
            this.f17652b.m12428a((Task) this);
            return true;
        }
    }

    /* renamed from: a */
    public final void m22854a(Exception exception) {
        Preconditions.checkNotNull(exception, "Exception must not be null");
        synchronized (this.f17651a) {
            m22843h();
            this.f17653c = true;
            this.f17656f = exception;
        }
        this.f17652b.m12428a((Task) this);
    }

    /* renamed from: b */
    public final boolean m22859b(Exception exception) {
        Preconditions.checkNotNull(exception, "Exception must not be null");
        synchronized (this.f17651a) {
            if (this.f17653c) {
                return null;
            }
            this.f17653c = true;
            this.f17656f = exception;
            this.f17652b.m12428a((Task) this);
            return true;
        }
    }

    /* renamed from: f */
    public final boolean m22864f() {
        synchronized (this.f17651a) {
            if (this.f17653c) {
                return false;
            }
            this.f17653c = true;
            this.f17654d = true;
            this.f17652b.m12428a((Task) this);
            return true;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m22842g() {
        Preconditions.checkState(this.f17653c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    private final void m22843h() {
        Preconditions.checkState(this.f17653c ^ 1, "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m22844i() {
        if (this.f17654d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m22845j() {
        synchronized (this.f17651a) {
            if (this.f17653c) {
                this.f17652b.m12428a((Task) this);
                return;
            }
        }
    }
}
