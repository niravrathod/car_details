package okio;

import java.util.concurrent.TimeUnit;

/* renamed from: okio.i */
public class C4912i extends C2996t {
    /* renamed from: a */
    private C2996t f21969a;

    public C4912i(C2996t c2996t) {
        if (c2996t != null) {
            this.f21969a = c2996t;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C2996t m30313a() {
        return this.f21969a;
    }

    /* renamed from: a */
    public final C4912i m30312a(C2996t c2996t) {
        if (c2996t != null) {
            this.f21969a = c2996t;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public C2996t m30315a(long j, TimeUnit timeUnit) {
        return this.f21969a.a(j, timeUnit);
    }

    public long z_() {
        return this.f21969a.z_();
    }

    public boolean A_() {
        return this.f21969a.A_();
    }

    /* renamed from: d */
    public long m30316d() {
        return this.f21969a.d();
    }

    /* renamed from: a */
    public C2996t m30314a(long j) {
        return this.f21969a.a(j);
    }

    public C2996t B_() {
        return this.f21969a.B_();
    }

    /* renamed from: f */
    public C2996t m30317f() {
        return this.f21969a.f();
    }

    /* renamed from: g */
    public void m30318g() {
        this.f21969a.g();
    }
}
