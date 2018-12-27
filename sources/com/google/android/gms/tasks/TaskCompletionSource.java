package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult> {
    /* renamed from: a */
    private final C4150q<TResult> f10820a = new C4150q();

    /* renamed from: a */
    public void m12419a(TResult tResult) {
        this.f10820a.m22855a((Object) tResult);
    }

    /* renamed from: b */
    public boolean m12421b(TResult tResult) {
        return this.f10820a.m22860b((Object) tResult);
    }

    /* renamed from: a */
    public void m12418a(Exception exception) {
        this.f10820a.m22854a(exception);
    }

    /* renamed from: b */
    public boolean m12420b(Exception exception) {
        return this.f10820a.m22859b(exception);
    }

    /* renamed from: a */
    public Task<TResult> m12417a() {
        return this.f10820a;
    }
}
