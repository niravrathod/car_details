package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.i */
final class C2512i implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Task f10829a;
    /* renamed from: b */
    private final /* synthetic */ C4147h f10830b;

    C2512i(C4147h c4147h, Task task) {
        this.f10830b = c4147h;
        this.f10829a = task;
    }

    public final void run() {
        synchronized (this.f10830b.f17643b) {
            if (this.f10830b.f17644c != null) {
                this.f10830b.f17644c.onComplete(this.f10829a);
            }
        }
    }
}
