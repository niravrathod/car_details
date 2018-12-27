package io.fabric.sdk.android.services.concurrency;

import io.fabric.sdk.android.services.concurrency.AsyncTask.Status;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: io.fabric.sdk.android.services.concurrency.c */
public abstract class C4312c<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements C2822a<C2828i>, C2825f, C2828i {
    /* renamed from: a */
    private final C4314g f18043a = new C4314g();

    /* renamed from: io.fabric.sdk.android.services.concurrency.c$a */
    private static class C2824a<Result> implements Executor {
        /* renamed from: a */
        private final Executor f11955a;
        /* renamed from: b */
        private final C4312c f11956b;

        public C2824a(Executor executor, C4312c c4312c) {
            this.f11955a = executor;
            this.f11956b = c4312c;
        }

        public void execute(Runnable runnable) {
            this.f11955a.execute(new C4313e<Result>(this, runnable, null) {
                /* renamed from: a */
                final /* synthetic */ C2824a f20787a;

                /* renamed from: a */
                public <T extends C2822a<C2828i> & C2825f & C2828i> T mo4536a() {
                    return this.f20787a.f11956b;
                }
            });
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo3585c(Object obj) {
        m23630a((C2828i) obj);
    }

    /* renamed from: a */
    public final void m23632a(ExecutorService executorService, Params... paramsArr) {
        super.m13737a(new C2824a(executorService, this), (Object[]) paramsArr);
    }

    public int compareTo(Object obj) {
        return Priority.m13755a(this, obj);
    }

    /* renamed from: a */
    public void m23630a(C2828i c2828i) {
        if (w_() == Status.PENDING) {
            ((C2822a) ((C2825f) m23639g())).mo3585c(c2828i);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    /* renamed from: c */
    public Collection<C2828i> mo3584c() {
        return ((C2822a) ((C2825f) m23639g())).mo3584c();
    }

    /* renamed from: d */
    public boolean mo3586d() {
        return ((C2822a) ((C2825f) m23639g())).mo3586d();
    }

    /* renamed from: b */
    public Priority mo3582b() {
        return ((C2825f) m23639g()).mo3582b();
    }

    /* renamed from: b */
    public void mo3583b(boolean z) {
        ((C2828i) ((C2825f) m23639g())).mo3583b(z);
    }

    /* renamed from: f */
    public boolean mo3587f() {
        return ((C2828i) ((C2825f) m23639g())).mo3587f();
    }

    /* renamed from: a */
    public void mo3581a(Throwable th) {
        ((C2828i) ((C2825f) m23639g())).mo3581a(th);
    }

    /* renamed from: g */
    public <T extends C2822a<C2828i> & C2825f & C2828i> T m23639g() {
        return this.f18043a;
    }
}
