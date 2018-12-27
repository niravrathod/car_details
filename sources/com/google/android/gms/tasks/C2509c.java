package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.c */
final class C2509c implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Task f10824a;
    /* renamed from: b */
    private final /* synthetic */ C4144b f10825b;

    C2509c(C4144b c4144b, Task task) {
        this.f10825b = c4144b;
        this.f10824a = task;
    }

    public final void run() {
        if (this.f10824a.mo3217c()) {
            this.f10825b.f17635c.m22864f();
            return;
        }
        try {
            this.f10825b.f17635c.m22855a(this.f10825b.f17634b.then(this.f10824a));
        } catch (Exception e) {
            if (e.getCause() instanceof Exception) {
                this.f10825b.f17635c.m22854a((Exception) e.getCause());
            } else {
                this.f10825b.f17635c.m22854a(e);
            }
        } catch (Exception e2) {
            this.f10825b.f17635c.m22854a(e2);
        }
    }
}
