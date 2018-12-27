package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final /* synthetic */ class fa implements Runnable {
    /* renamed from: a */
    private final Executor f8048a;
    /* renamed from: b */
    private final Runnable f8049b;

    fa(Executor executor, Runnable runnable) {
        this.f8048a = executor;
        this.f8049b = runnable;
    }

    public final void run() {
        this.f8048a.execute(this.f8049b);
    }
}
