package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import javax.annotation.Nullable;

@zzaer
public abstract class zzaor extends AbstractExecutorService implements zzapm {
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new fb(runnable, t);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new fb(callable);
    }

    /* renamed from: a */
    public final zzapi<?> mo2371a(Runnable runnable) {
        return (zzapi) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> zzapi<T> mo2372a(Callable<T> callable) {
        return (zzapi) super.submit(callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return mo2372a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @Nullable Object obj) {
        return (zzapi) super.submit(runnable, obj);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return mo2371a(runnable);
    }
}
