package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.b */
final class C4144b<TResult, TContinuationResult> implements C2515n<TResult> {
    /* renamed from: a */
    private final Executor f17633a;
    /* renamed from: b */
    private final Continuation<TResult, TContinuationResult> f17634b;
    /* renamed from: c */
    private final C4150q<TContinuationResult> f17635c;

    public C4144b(Executor executor, Continuation<TResult, TContinuationResult> continuation, C4150q<TContinuationResult> c4150q) {
        this.f17633a = executor;
        this.f17634b = continuation;
        this.f17635c = c4150q;
    }

    /* renamed from: a */
    public final void mo3202a(Task<TResult> task) {
        this.f17633a.execute(new C2509c(this, task));
    }
}
