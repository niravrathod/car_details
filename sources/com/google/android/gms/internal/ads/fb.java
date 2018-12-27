package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

@zzaer
final class fb<V> extends FutureTask<V> implements zzapi<V> {
    /* renamed from: a */
    private final ez f16482a = new ez();

    fb(Callable<V> callable) {
        super(callable);
    }

    fb(Runnable runnable, @Nullable V v) {
        super(runnable, v);
    }

    /* renamed from: a */
    public final void mo1947a(Runnable runnable, Executor executor) {
        this.f16482a.m8923a(runnable, executor);
    }

    protected final void done() {
        this.f16482a.m8922a();
    }
}
