package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.e */
final class C2510e implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Task f10826a;
    /* renamed from: b */
    private final /* synthetic */ C4145d f10827b;

    C2510e(C4145d c4145d, Task task) {
        this.f10827b = c4145d;
        this.f10826a = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f10827b.f17637b.then(this.f10826a);
            if (task == null) {
                this.f10827b.mo3204a(new NullPointerException("Continuation returned null"));
                return;
            }
            task.mo3212a(TaskExecutors.f10823b, this.f10827b);
            task.mo3211a(TaskExecutors.f10823b, this.f10827b);
            task.mo3209a(TaskExecutors.f10823b, this.f10827b);
        } catch (Exception e) {
            if (e.getCause() instanceof Exception) {
                this.f10827b.f17638c.m22854a((Exception) e.getCause());
            } else {
                this.f10827b.f17638c.m22854a(e);
            }
        } catch (Exception e2) {
            this.f10827b.f17638c.m22854a(e2);
        }
    }
}
