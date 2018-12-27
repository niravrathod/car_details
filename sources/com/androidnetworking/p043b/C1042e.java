package com.androidnetworking.p043b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.androidnetworking.b.e */
public class C1042e implements Executor {
    /* renamed from: a */
    private final Handler f3443a = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.f3443a.post(runnable);
    }
}
