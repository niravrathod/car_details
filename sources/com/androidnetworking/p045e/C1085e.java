package com.androidnetworking.p045e;

import com.androidnetworking.common.C1053a;
import com.androidnetworking.common.C1054b;
import com.androidnetworking.common.Priority;
import com.androidnetworking.common.ResponseType;
import com.androidnetworking.error.ANError;
import com.androidnetworking.p043b.C1040b;
import com.androidnetworking.p046f.C1088b;
import com.androidnetworking.p046f.C1090c;
import okhttp3.aa;

/* renamed from: com.androidnetworking.e.e */
public class C1085e implements Runnable {
    /* renamed from: a */
    public final int f3585a;
    /* renamed from: b */
    public final C1053a f3586b;
    /* renamed from: c */
    private final Priority f3587c;

    public C1085e(C1053a c1053a) {
        this.f3586b = c1053a;
        this.f3585a = c1053a.m4474e();
        this.f3587c = c1053a.m4472c();
    }

    public void run() {
        this.f3586b.m4471b(true);
        switch (this.f3586b.m4476g()) {
            case 0:
                m4575b();
                break;
            case 1:
                m4576c();
                break;
            case 2:
                m4577d();
                break;
            default:
                break;
        }
        this.f3586b.m4471b(false);
    }

    /* renamed from: b */
    private void m4575b() {
        Throwable e;
        Throwable th;
        aa a;
        try {
            a = C1083d.m4567a(this.f3586b);
            if (a == null) {
                try {
                    m4574a(this.f3586b, C1090c.m4590a(new ANError()));
                    C1088b.m4585a(a, this.f3586b);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        m4574a(this.f3586b, C1090c.m4590a(new ANError(e)));
                        C1088b.m4585a(a, this.f3586b);
                    } catch (Throwable th2) {
                        e = th2;
                        C1088b.m4585a(a, this.f3586b);
                        throw e;
                    }
                }
            } else if (this.f3586b.m4475f() == ResponseType.OK_HTTP_RESPONSE) {
                this.f3586b.m4470b(a);
                C1088b.m4585a(a, this.f3586b);
            } else if (a.m14012c() >= 400) {
                m4574a(this.f3586b, C1090c.m4591a(new ANError(a), this.f3586b, a.m14012c()));
                C1088b.m4585a(a, this.f3586b);
            } else {
                C1054b a2 = this.f3586b.m4456a(a);
                if (a2.m4496b()) {
                    a2.m4495a(a);
                    this.f3586b.m4460a(a2);
                    C1088b.m4585a(a, this.f3586b);
                }
                m4574a(this.f3586b, a2.m4497c());
                C1088b.m4585a(a, this.f3586b);
            }
        } catch (Throwable e3) {
            th = e3;
            a = null;
            e = th;
            m4574a(this.f3586b, C1090c.m4590a(new ANError(e)));
            C1088b.m4585a(a, this.f3586b);
        } catch (Throwable e32) {
            th = e32;
            a = null;
            e = th;
            C1088b.m4585a(a, this.f3586b);
            throw e;
        }
    }

    /* renamed from: c */
    private void m4576c() {
        try {
            aa b = C1083d.m4571b(this.f3586b);
            if (b == null) {
                m4574a(this.f3586b, C1090c.m4590a(new ANError()));
            } else if (b.m14012c() >= 400) {
                m4574a(this.f3586b, C1090c.m4591a(new ANError(b), this.f3586b, b.m14012c()));
            } else {
                this.f3586b.m4480k();
            }
        } catch (Throwable e) {
            m4574a(this.f3586b, C1090c.m4590a(new ANError(e)));
        }
    }

    /* renamed from: d */
    private void m4577d() {
        Throwable e;
        Throwable th;
        aa c;
        try {
            c = C1083d.m4573c(this.f3586b);
            if (c == null) {
                try {
                    m4574a(this.f3586b, C1090c.m4590a(new ANError()));
                    C1088b.m4585a(c, this.f3586b);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        m4574a(this.f3586b, C1090c.m4590a(new ANError(e)));
                        C1088b.m4585a(c, this.f3586b);
                    } catch (Throwable th2) {
                        e = th2;
                        C1088b.m4585a(c, this.f3586b);
                        throw e;
                    }
                }
            } else if (this.f3586b.m4475f() == ResponseType.OK_HTTP_RESPONSE) {
                this.f3586b.m4470b(c);
                C1088b.m4585a(c, this.f3586b);
            } else if (c.m14012c() >= 400) {
                m4574a(this.f3586b, C1090c.m4591a(new ANError(c), this.f3586b, c.m14012c()));
                C1088b.m4585a(c, this.f3586b);
            } else {
                C1054b a = this.f3586b.m4456a(c);
                if (a.m4496b()) {
                    a.m4495a(c);
                    this.f3586b.m4460a(a);
                    C1088b.m4585a(c, this.f3586b);
                }
                m4574a(this.f3586b, a.m4497c());
                C1088b.m4585a(c, this.f3586b);
            }
        } catch (Throwable e3) {
            th = e3;
            c = null;
            e = th;
            m4574a(this.f3586b, C1090c.m4590a(new ANError(e)));
            C1088b.m4585a(c, this.f3586b);
        } catch (Throwable e32) {
            th = e32;
            c = null;
            e = th;
            C1088b.m4585a(c, this.f3586b);
            throw e;
        }
    }

    /* renamed from: a */
    public Priority m4578a() {
        return this.f3587c;
    }

    /* renamed from: a */
    private void m4574a(final C1053a c1053a, final ANError aNError) {
        C1040b.m4416a().m4417b().mo903c().execute(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C1085e f3584c;

            public void run() {
                c1053a.m4468b(aNError);
                c1053a.m4488s();
            }
        });
    }
}
