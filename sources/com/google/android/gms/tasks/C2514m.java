package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.m */
final class C2514m implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Task f10833a;
    /* renamed from: b */
    private final /* synthetic */ C4149l f10834b;

    C2514m(C4149l c4149l, Task task) {
        this.f10834b = c4149l;
        this.f10833a = task;
    }

    public final void run() {
        synchronized (this.f10834b.f17649b) {
            if (this.f10834b.f17650c != null) {
                this.f10834b.f17650c.mo3205a(this.f10833a.mo3218d());
            }
        }
    }
}
