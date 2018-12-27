package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class pa implements ThreadFactory {
    /* renamed from: a */
    private final ThreadFactory f8317a = Executors.defaultThreadFactory();

    pa() {
    }

    public final Thread newThread(Runnable runnable) {
        runnable = this.f8317a.newThread(runnable);
        runnable.setName(String.valueOf(runnable.getName()).concat(":"));
        return runnable;
    }
}
