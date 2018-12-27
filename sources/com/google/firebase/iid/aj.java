package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class aj implements ThreadFactory {
    /* renamed from: a */
    static final ThreadFactory f11009a = new aj();

    private aj() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
