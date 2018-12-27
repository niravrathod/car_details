package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.j */
final class C4148j<TResult> implements C2515n<TResult> {
    /* renamed from: a */
    private final Executor f17645a;
    /* renamed from: b */
    private final Object f17646b = new Object();
    @GuardedBy("mLock")
    /* renamed from: c */
    private OnFailureListener f17647c;

    public C4148j(Executor executor, OnFailureListener onFailureListener) {
        this.f17645a = executor;
        this.f17647c = onFailureListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo3202a(com.google.android.gms.tasks.Task<TResult> r3) {
        /*
        r2 = this;
        r0 = r3.mo3216b();
        if (r0 != 0) goto L_0x0024;
    L_0x0006:
        r0 = r3.mo3217c();
        if (r0 != 0) goto L_0x0024;
    L_0x000c:
        r0 = r2.f17646b;
        monitor-enter(r0);
        r1 = r2.f17647c;	 Catch:{ all -> 0x0021 }
        if (r1 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        return;
    L_0x0015:
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        r0 = r2.f17645a;
        r1 = new com.google.android.gms.tasks.k;
        r1.<init>(r2, r3);
        r0.execute(r1);
        goto L_0x0024;
    L_0x0021:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        throw r3;
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.j.a(com.google.android.gms.tasks.Task):void");
    }
}
