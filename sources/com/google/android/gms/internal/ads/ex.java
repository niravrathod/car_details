package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzaer
final class ex<T> implements zzapi<T> {
    /* renamed from: a */
    private final Throwable f16475a;
    /* renamed from: b */
    private final ez f16476b = new ez();

    ex(Throwable th) {
        this.f16475a = th;
        this.f16476b.m8922a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get() {
        throw new ExecutionException(this.f16475a);
    }

    public final T get(long j, TimeUnit timeUnit) {
        throw new ExecutionException(this.f16475a);
    }

    /* renamed from: a */
    public final void mo1947a(Runnable runnable, Executor executor) {
        this.f16476b.m8923a(runnable, executor);
    }
}
