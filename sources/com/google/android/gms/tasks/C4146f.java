package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.f */
final class C4146f<TResult> implements C2515n<TResult> {
    /* renamed from: a */
    private final Executor f17639a;
    /* renamed from: b */
    private final Object f17640b = new Object();
    @GuardedBy("mLock")
    /* renamed from: c */
    private OnCanceledListener f17641c;

    public C4146f(Executor executor, OnCanceledListener onCanceledListener) {
        this.f17639a = executor;
        this.f17641c = onCanceledListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo3202a(com.google.android.gms.tasks.Task r2) {
        /*
        r1 = this;
        r2 = r2.mo3217c();
        if (r2 == 0) goto L_0x001e;
    L_0x0006:
        r2 = r1.f17640b;
        monitor-enter(r2);
        r0 = r1.f17641c;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        return;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        r2 = r1.f17639a;
        r0 = new com.google.android.gms.tasks.g;
        r0.<init>(r1);
        r2.execute(r0);
        goto L_0x001e;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.f.a(com.google.android.gms.tasks.Task):void");
    }
}
