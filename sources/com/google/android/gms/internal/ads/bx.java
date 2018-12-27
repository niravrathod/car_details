package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final class bx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Future f7937a;

    bx(zzagx zzagx, Future future) {
        this.f7937a = future;
    }

    public final void run() {
        if (!this.f7937a.isDone()) {
            this.f7937a.cancel(true);
        }
    }
}
