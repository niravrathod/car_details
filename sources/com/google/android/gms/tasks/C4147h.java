package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.h */
final class C4147h<TResult> implements C2515n<TResult> {
    /* renamed from: a */
    private final Executor f17642a;
    /* renamed from: b */
    private final Object f17643b = new Object();
    @GuardedBy("mLock")
    /* renamed from: c */
    private OnCompleteListener<TResult> f17644c;

    public C4147h(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f17642a = executor;
        this.f17644c = onCompleteListener;
    }

    /* renamed from: a */
    public final void mo3202a(Task<TResult> task) {
        synchronized (this.f17643b) {
            if (this.f17644c == null) {
                return;
            }
            this.f17642a.execute(new C2512i(this, task));
        }
    }
}
