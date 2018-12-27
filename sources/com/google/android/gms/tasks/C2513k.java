package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.k */
final class C2513k implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Task f10831a;
    /* renamed from: b */
    private final /* synthetic */ C4148j f10832b;

    C2513k(C4148j c4148j, Task task) {
        this.f10832b = c4148j;
        this.f10831a = task;
    }

    public final void run() {
        synchronized (this.f10832b.f17646b) {
            if (this.f10832b.f17647c != null) {
                this.f10832b.f17647c.mo3204a(this.f10831a.mo3219e());
            }
        }
    }
}
