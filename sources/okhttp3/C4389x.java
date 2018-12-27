package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.C2929b;
import okhttp3.internal.connection.C4352a;
import okhttp3.internal.p155a.C4342a;
import okhttp3.internal.p156b.C4343a;
import okhttp3.internal.p156b.C4344b;
import okhttp3.internal.p156b.C4345g;
import okhttp3.internal.p156b.C4347j;
import okhttp3.internal.p159e.C2945f;

/* renamed from: okhttp3.x */
final class C4389x implements C2903e {
    /* renamed from: a */
    final C2988w f18255a;
    /* renamed from: b */
    final C4347j f18256b;
    /* renamed from: c */
    final C2990y f18257c;
    /* renamed from: d */
    final boolean f18258d;
    /* renamed from: e */
    private C2977p f18259e;
    /* renamed from: f */
    private boolean f18260f;

    /* renamed from: okhttp3.x$a */
    final class C4388a extends C2929b {
        /* renamed from: a */
        final /* synthetic */ C4389x f18253a;
        /* renamed from: c */
        private final C2904f f18254c;

        /* renamed from: a */
        String m23927a() {
            return this.f18253a.f18257c.m14623a().m13967f();
        }

        /* renamed from: b */
        C4389x m23928b() {
            return this.f18253a;
        }

        /* renamed from: c */
        protected void mo3659c() {
            IOException e;
            C2945f c;
            StringBuilder stringBuilder;
            Object obj = 1;
            try {
                aa g = this.f18253a.m23939g();
                if (this.f18253a.f18256b.m23774b()) {
                    try {
                        this.f18254c.m14072a(this.f18253a, new IOException("Canceled"));
                    } catch (IOException e2) {
                        e = e2;
                        if (obj == null) {
                            this.f18253a.f18259e.m14509a(this.f18253a, e);
                            this.f18254c.m14072a(this.f18253a, e);
                        } else {
                            try {
                                c = C2945f.m14270c();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Callback failure for ");
                                stringBuilder.append(this.f18253a.m23937e());
                                c.mo3651a(4, stringBuilder.toString(), (Throwable) e);
                            } catch (Throwable th) {
                                this.f18253a.f18255a.m14601u().m14500a(this);
                            }
                        }
                        this.f18253a.f18255a.m14601u().m14500a(this);
                    }
                }
                this.f18254c.m14073a(this.f18253a, g);
            } catch (Throwable e3) {
                e = e3;
                obj = null;
                if (obj == null) {
                    c = C2945f.m14270c();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Callback failure for ");
                    stringBuilder.append(this.f18253a.m23937e());
                    c.mo3651a(4, stringBuilder.toString(), (Throwable) e);
                } else {
                    this.f18253a.f18259e.m14509a(this.f18253a, e);
                    this.f18254c.m14072a(this.f18253a, e);
                }
                this.f18253a.f18255a.m14601u().m14500a(this);
            }
            this.f18253a.f18255a.m14601u().m14500a(this);
        }
    }

    public /* synthetic */ Object clone() {
        return m23936d();
    }

    private C4389x(C2988w c2988w, C2990y c2990y, boolean z) {
        this.f18255a = c2988w;
        this.f18257c = c2990y;
        this.f18258d = z;
        this.f18256b = new C4347j(c2988w, z);
    }

    /* renamed from: a */
    static C4389x m23931a(C2988w c2988w, C2990y c2990y, boolean z) {
        C4389x c4389x = new C4389x(c2988w, c2990y, z);
        c4389x.f18259e = c2988w.m14606z().mo3678a(c4389x);
        return c4389x;
    }

    /* renamed from: a */
    public aa mo3689a() {
        synchronized (this) {
            if (this.f18260f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f18260f = true;
        }
        m23932h();
        this.f18259e.m14507a((C2903e) this);
        try {
            this.f18255a.m14601u().m14501a(this);
            aa g = m23939g();
            if (g != null) {
                this.f18255a.m14601u().m14503b(this);
                return g;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            this.f18259e.m14509a((C2903e) this, e);
            throw e;
        } catch (Throwable th) {
            this.f18255a.m14601u().m14503b(this);
        }
    }

    /* renamed from: h */
    private void m23932h() {
        this.f18256b.m23773a(C2945f.m14270c().mo3648a("response.body().close()"));
    }

    /* renamed from: b */
    public void mo3690b() {
        this.f18256b.m23772a();
    }

    /* renamed from: c */
    public boolean m23935c() {
        return this.f18256b.m23774b();
    }

    /* renamed from: d */
    public C4389x m23936d() {
        return C4389x.m23931a(this.f18255a, this.f18257c, this.f18258d);
    }

    /* renamed from: e */
    String m23937e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m23935c() ? "canceled " : "");
        stringBuilder.append(this.f18258d ? "web socket" : "call");
        stringBuilder.append(" to ");
        stringBuilder.append(m23938f());
        return stringBuilder.toString();
    }

    /* renamed from: f */
    String m23938f() {
        return this.f18257c.m14623a().m13974m();
    }

    /* renamed from: g */
    aa m23939g() {
        List arrayList = new ArrayList();
        arrayList.addAll(this.f18255a.m14604x());
        arrayList.add(this.f18256b);
        arrayList.add(new C4343a(this.f18255a.m14587g()));
        arrayList.add(new C4342a(this.f18255a.m14589i()));
        arrayList.add(new C4352a(this.f18255a));
        if (!this.f18258d) {
            arrayList.addAll(this.f18255a.m14605y());
        }
        arrayList.add(new C4344b(this.f18258d));
        return new C4345g(arrayList, null, null, null, 0, this.f18257c, this, this.f18259e, this.f18255a.m14580a(), this.f18255a.m14582b(), this.f18255a.m14583c()).mo3618a(this.f18257c);
    }
}
