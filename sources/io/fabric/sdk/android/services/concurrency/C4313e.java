package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: io.fabric.sdk.android.services.concurrency.e */
public class C4313e<V> extends FutureTask<V> implements C2822a<C2828i>, C2825f, C2828i {
    /* renamed from: b */
    final Object f18044b;

    /* renamed from: c */
    public /* synthetic */ void mo3585c(Object obj) {
        m23642a((C2828i) obj);
    }

    public C4313e(Callable<V> callable) {
        super(callable);
        this.f18044b = m23641a((Object) callable);
    }

    public C4313e(Runnable runnable, V v) {
        super(runnable, v);
        this.f18044b = m23641a((Object) runnable);
    }

    public int compareTo(Object obj) {
        return ((C2825f) mo4536a()).compareTo(obj);
    }

    /* renamed from: a */
    public void m23642a(C2828i c2828i) {
        ((C2822a) ((C2825f) mo4536a())).mo3585c(c2828i);
    }

    /* renamed from: c */
    public Collection<C2828i> mo3584c() {
        return ((C2822a) ((C2825f) mo4536a())).mo3584c();
    }

    /* renamed from: d */
    public boolean mo3586d() {
        return ((C2822a) ((C2825f) mo4536a())).mo3586d();
    }

    /* renamed from: b */
    public Priority mo3582b() {
        return ((C2825f) mo4536a()).mo3582b();
    }

    /* renamed from: b */
    public void mo3583b(boolean z) {
        ((C2828i) ((C2825f) mo4536a())).mo3583b(z);
    }

    /* renamed from: f */
    public boolean mo3587f() {
        return ((C2828i) ((C2825f) mo4536a())).mo3587f();
    }

    /* renamed from: a */
    public void mo3581a(Throwable th) {
        ((C2828i) ((C2825f) mo4536a())).mo3581a(th);
    }

    /* renamed from: a */
    public <T extends C2822a<C2828i> & C2825f & C2828i> T mo4536a() {
        return (C2822a) this.f18044b;
    }

    /* renamed from: a */
    protected <T extends C2822a<C2828i> & C2825f & C2828i> T m23641a(Object obj) {
        if (C4314g.m23650a(obj)) {
            return (C2822a) obj;
        }
        return new C4314g();
    }
}
