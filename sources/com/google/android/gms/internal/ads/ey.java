package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzaer
final class ey<T> implements zzapi<T> {
    /* renamed from: a */
    private final T f16477a;
    /* renamed from: b */
    private final ez f16478b = new ez();

    ey(T t) {
        this.f16477a = t;
        this.f16478b.m8922a();
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
        return this.f16477a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f16477a;
    }

    /* renamed from: a */
    public final void mo1947a(Runnable runnable, Executor executor) {
        this.f16478b.m8923a(runnable, executor);
    }
}
