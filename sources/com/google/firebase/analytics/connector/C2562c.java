package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class C2562c implements Executor {
    /* renamed from: a */
    static final Executor f10910a = new C2562c();

    private C2562c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
