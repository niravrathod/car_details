package io.fabric.sdk.android.services.concurrency.p149a;

/* renamed from: io.fabric.sdk.android.services.concurrency.a.e */
public class C2821e {
    /* renamed from: a */
    private final int f11952a;
    /* renamed from: b */
    private final C2819a f11953b;
    /* renamed from: c */
    private final C2820d f11954c;

    public C2821e(C2819a c2819a, C2820d c2820d) {
        this(0, c2819a, c2820d);
    }

    public C2821e(int i, C2819a c2819a, C2820d c2820d) {
        this.f11952a = i;
        this.f11953b = c2819a;
        this.f11954c = c2820d;
    }

    /* renamed from: a */
    public long m13757a() {
        return this.f11953b.mo1111a(this.f11952a);
    }

    /* renamed from: b */
    public C2821e m13758b() {
        return new C2821e(this.f11952a + 1, this.f11953b, this.f11954c);
    }

    /* renamed from: c */
    public C2821e m13759c() {
        return new C2821e(this.f11953b, this.f11954c);
    }
}
