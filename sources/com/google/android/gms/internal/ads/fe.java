package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class fe extends zzaor {
    /* renamed from: a */
    private final Executor f19635a;

    private fe(Executor executor) {
        this.f19635a = executor;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void execute(Runnable runnable) {
        this.f19635a.execute(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }
}
