package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class et implements Runnable {
    /* renamed from: a */
    private final Future f8035a;

    et(Future future) {
        this.f8035a = future;
    }

    public final void run() {
        Future future = this.f8035a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
