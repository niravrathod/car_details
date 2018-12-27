package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public class zzaps<T> implements zzapi<T> {
    /* renamed from: a */
    private final Object f16880a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private T f16881b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private Throwable f16882c;
    @GuardedBy("mLock")
    /* renamed from: d */
    private boolean f16883d;
    @GuardedBy("mLock")
    /* renamed from: e */
    private boolean f16884e;
    /* renamed from: f */
    private final ez f16885f = new ez();

    /* renamed from: a */
    public final void mo1947a(Runnable runnable, Executor executor) {
        this.f16885f.m8923a(runnable, executor);
    }

    /* renamed from: b */
    public final void m21290b(T t) {
        synchronized (this.f16880a) {
            if (this.f16884e) {
            } else if (mo4182a()) {
                zzbv.zzeo().m9717b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
            } else {
                this.f16883d = true;
                this.f16881b = t;
                this.f16880a.notifyAll();
                this.f16885f.m8922a();
            }
        }
    }

    /* renamed from: a */
    public final void m21289a(Throwable th) {
        synchronized (this.f16880a) {
            if (this.f16884e) {
            } else if (mo4182a()) {
                zzbv.zzeo().m9717b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
            } else {
                this.f16882c = th;
                this.f16880a.notifyAll();
                this.f16885f.m8922a();
            }
        }
    }

    public T get() {
        T t;
        synchronized (this.f16880a) {
            if (!mo4182a()) {
                try {
                    this.f16880a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f16882c != null) {
                throw new ExecutionException(this.f16882c);
            } else if (this.f16884e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f16881b;
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        synchronized (this.f16880a) {
            if (!mo4182a()) {
                try {
                    j = timeUnit.toMillis(j);
                    if (j != 0) {
                        this.f16880a.wait(j);
                    }
                } catch (long j2) {
                    throw j2;
                }
            }
            if (this.f16882c != null) {
                throw new ExecutionException(this.f16882c);
            } else if (this.f16883d == null) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (this.f16884e == null) {
                j2 = this.f16881b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return j2;
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f16880a) {
            if (mo4182a()) {
                return false;
            }
            this.f16884e = true;
            this.f16883d = true;
            this.f16880a.notifyAll();
            this.f16885f.m8922a();
            return true;
        }
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f16880a) {
            z = this.f16884e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f16880a) {
            a = mo4182a();
        }
        return a;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final boolean mo4182a() {
        if (this.f16882c == null) {
            if (!this.f16883d) {
                return false;
            }
        }
        return true;
    }
}
