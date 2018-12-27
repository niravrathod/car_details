package com.karumi.dexter;

import android.os.Looper;

final class ThreadFactory {
    ThreadFactory() {
    }

    public static Thread makeMainThread() {
        return new MainThread();
    }

    public static Thread makeSameThread() {
        if (runningMainThread()) {
            return new MainThread();
        }
        return new WorkerThread();
    }

    private static boolean runningMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
