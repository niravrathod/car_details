package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.g */
final class C2511g implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C4146f f10828a;

    C2511g(C4146f c4146f) {
        this.f10828a = c4146f;
    }

    public final void run() {
        synchronized (this.f10828a.f17640b) {
            if (this.f10828a.f17641c != null) {
                this.f10828a.f17641c.mo3203a();
            }
        }
    }
}
