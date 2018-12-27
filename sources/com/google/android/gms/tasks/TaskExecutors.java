package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    /* renamed from: a */
    public static final Executor f10822a = new C2508a();
    /* renamed from: b */
    static final Executor f10823b = new C2517p();

    /* renamed from: com.google.android.gms.tasks.TaskExecutors$a */
    private static final class C2508a implements Executor {
        /* renamed from: a */
        private final Handler f10821a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f10821a.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}
