package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class ai {
    /* renamed from: a */
    private static final Executor f11008a = ak.f11010a;

    /* renamed from: a */
    static Executor m12701a() {
        return f11008a;
    }

    /* renamed from: b */
    static Executor m12702b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), aj.f11009a);
    }
}
