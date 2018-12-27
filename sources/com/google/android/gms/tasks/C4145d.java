package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.d */
final class C4145d<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, C2515n<TResult> {
    /* renamed from: a */
    private final Executor f17636a;
    /* renamed from: b */
    private final Continuation<TResult, Task<TContinuationResult>> f17637b;
    /* renamed from: c */
    private final C4150q<TContinuationResult> f17638c;

    public C4145d(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, C4150q<TContinuationResult> c4150q) {
        this.f17636a = executor;
        this.f17637b = continuation;
        this.f17638c = c4150q;
    }

    /* renamed from: a */
    public final void mo3202a(Task<TResult> task) {
        this.f17636a.execute(new C2510e(this, task));
    }

    /* renamed from: a */
    public final void mo3205a(TContinuationResult tContinuationResult) {
        this.f17638c.m22855a((Object) tContinuationResult);
    }

    /* renamed from: a */
    public final void mo3204a(Exception exception) {
        this.f17638c.m22854a(exception);
    }

    /* renamed from: a */
    public final void mo3203a() {
        this.f17638c.m22864f();
    }
}
