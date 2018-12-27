package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class cp implements ThreadFactory {
    /* renamed from: a */
    private final AtomicInteger f7966a = new AtomicInteger(1);

    cp(zzakd zzakd) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f7966a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("AdWorker(SCION_TASK_EXECUTOR) #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
