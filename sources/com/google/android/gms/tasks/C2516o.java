package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.o */
final class C2516o<TResult> {
    /* renamed from: a */
    private final Object f10835a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private Queue<C2515n<TResult>> f10836b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private boolean f10837c;

    C2516o() {
    }

    /* renamed from: a */
    public final void m12429a(C2515n<TResult> c2515n) {
        synchronized (this.f10835a) {
            if (this.f10836b == null) {
                this.f10836b = new ArrayDeque();
            }
            this.f10836b.add(c2515n);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m12428a(com.google.android.gms.tasks.Task<TResult> r3) {
        /*
        r2 = this;
        r0 = r2.f10835a;
        monitor-enter(r0);
        r1 = r2.f10836b;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x002a;
    L_0x0007:
        r1 = r2.f10837c;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002a;
    L_0x000c:
        r1 = 1;
        r2.f10837c = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
    L_0x0010:
        r1 = r2.f10835a;
        monitor-enter(r1);
        r0 = r2.f10836b;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (com.google.android.gms.tasks.C2515n) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r3 = 0;
        r2.f10837c = r3;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        return;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.mo3202a(r3);
        goto L_0x0010;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r3;
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.o.a(com.google.android.gms.tasks.Task):void");
    }
}
