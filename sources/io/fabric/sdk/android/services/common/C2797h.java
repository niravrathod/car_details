package io.fabric.sdk.android.services.common;

import android.os.Process;

/* renamed from: io.fabric.sdk.android.services.common.h */
public abstract class C2797h implements Runnable {
    /* renamed from: a */
    protected abstract void mo1138a();

    public final void run() {
        Process.setThreadPriority(10);
        mo1138a();
    }
}
