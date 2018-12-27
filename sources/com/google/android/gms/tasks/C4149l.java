package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.l */
final class C4149l<TResult> implements C2515n<TResult> {
    /* renamed from: a */
    private final Executor f17648a;
    /* renamed from: b */
    private final Object f17649b = new Object();
    @GuardedBy("mLock")
    /* renamed from: c */
    private OnSuccessListener<? super TResult> f17650c;

    public C4149l(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f17648a = executor;
        this.f17650c = onSuccessListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo3202a(com.google.android.gms.tasks.Task<TResult> r3) {
        /*
        r2 = this;
        r0 = r3.mo3216b();
        if (r0 == 0) goto L_0x001e;
    L_0x0006:
        r0 = r2.f17649b;
        monitor-enter(r0);
        r1 = r2.f17650c;	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        r0 = r2.f17648a;
        r1 = new com.google.android.gms.tasks.m;
        r1.<init>(r2, r3);
        r0.execute(r1);
        goto L_0x001e;
    L_0x001b:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r3;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.l.a(com.google.android.gms.tasks.Task):void");
    }
}
