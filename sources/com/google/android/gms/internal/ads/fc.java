package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;

final class fc implements Executor {
    /* renamed from: a */
    private final Handler f8050a = new zzalh(Looper.getMainLooper());

    fc() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbv.zzek();
                zzalo.m9793a(zzbv.zzeo().m9727l(), th);
            }
        } else {
            this.f8050a.post(runnable);
        }
    }
}
