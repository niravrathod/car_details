package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

final class WorkerThread implements Thread {
    private final Handler handler;

    WorkerThread() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.handler = new Handler();
    }

    public void execute(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void loop() {
        Looper.loop();
    }
}
