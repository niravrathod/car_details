package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class rl implements Executor {
    /* renamed from: a */
    private final /* synthetic */ Handler f8363a;

    rl(zzi zzi, Handler handler) {
        this.f8363a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f8363a.post(runnable);
    }
}
