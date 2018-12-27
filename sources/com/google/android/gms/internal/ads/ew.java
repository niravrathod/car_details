package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class ew implements Runnable {
    /* renamed from: a */
    private final zzapi f8043a;
    /* renamed from: b */
    private final Future f8044b;

    ew(zzapi zzapi, Future future) {
        this.f8043a = zzapi;
        this.f8044b = future;
    }

    public final void run() {
        zzapi zzapi = this.f8043a;
        Future future = this.f8044b;
        if (zzapi.isCancelled()) {
            future.cancel(true);
        }
    }
}
