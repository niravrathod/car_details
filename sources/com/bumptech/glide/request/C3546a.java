package com.bumptech.glide.request;

/* renamed from: com.bumptech.glide.request.a */
public final class C3546a implements C1310b, C1311c {
    /* renamed from: a */
    private final C1311c f14629a;
    /* renamed from: b */
    private C1310b f14630b;
    /* renamed from: c */
    private C1310b f14631c;

    public C3546a(C1311c c1311c) {
        this.f14629a = c1311c;
    }

    /* renamed from: a */
    public void m17975a(C1310b c1310b, C1310b c1310b2) {
        this.f14630b = c1310b;
        this.f14631c = c1310b2;
    }

    /* renamed from: a */
    public void mo1073a() {
        if (!this.f14630b.mo1079c()) {
            this.f14630b.mo1073a();
        }
    }

    /* renamed from: b */
    public void mo1078b() {
        this.f14630b.mo1078b();
        if (this.f14631c.mo1079c()) {
            this.f14631c.mo1078b();
        }
    }

    /* renamed from: c */
    public boolean mo1079c() {
        return (this.f14630b.mo1083g() ? this.f14631c : this.f14630b).mo1079c();
    }

    /* renamed from: d */
    public boolean mo1080d() {
        return (this.f14630b.mo1083g() ? this.f14631c : this.f14630b).mo1080d();
    }

    /* renamed from: e */
    public boolean mo1081e() {
        return (this.f14630b.mo1083g() ? this.f14631c : this.f14630b).mo1081e();
    }

    /* renamed from: f */
    public boolean mo1082f() {
        return (this.f14630b.mo1083g() ? this.f14631c : this.f14630b).mo1082f();
    }

    /* renamed from: g */
    public boolean mo1083g() {
        return this.f14630b.mo1083g() && this.f14631c.mo1083g();
    }

    /* renamed from: h */
    public void mo1084h() {
        this.f14630b.mo1084h();
        this.f14631c.mo1084h();
    }

    /* renamed from: a */
    public boolean mo1077a(C1310b c1310b) {
        boolean z = false;
        if (!(c1310b instanceof C3546a)) {
            return false;
        }
        C3546a c3546a = (C3546a) c1310b;
        if (this.f14630b.mo1077a(c3546a.f14630b) && this.f14631c.mo1077a(c3546a.f14631c) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo1085b(C1310b c1310b) {
        return (!m17970j() || m17969g(c1310b) == null) ? null : true;
    }

    /* renamed from: j */
    private boolean m17970j() {
        if (this.f14629a != null) {
            if (!this.f14629a.mo1085b(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo1086c(C1310b c1310b) {
        return (!m17972l() || m17969g(c1310b) == null) ? null : true;
    }

    /* renamed from: d */
    public boolean mo1087d(C1310b c1310b) {
        return (!m17971k() || m17969g(c1310b) == null) ? null : true;
    }

    /* renamed from: k */
    private boolean m17971k() {
        if (this.f14629a != null) {
            if (!this.f14629a.mo1087d(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private boolean m17972l() {
        if (this.f14629a != null) {
            if (!this.f14629a.mo1086c(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private boolean m17969g(C1310b c1310b) {
        if (!c1310b.equals(this.f14630b)) {
            if (!this.f14630b.mo1083g() || c1310b.equals(this.f14631c) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo1090i() {
        if (!m17973m()) {
            if (!mo1081e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private boolean m17973m() {
        return this.f14629a != null && this.f14629a.mo1090i();
    }

    /* renamed from: e */
    public void mo1088e(C1310b c1310b) {
        if (this.f14629a != null) {
            this.f14629a.mo1088e(this);
        }
    }

    /* renamed from: f */
    public void mo1089f(C1310b c1310b) {
        if (c1310b.equals(this.f14631c) == null) {
            if (this.f14631c.mo1079c() == null) {
                this.f14631c.mo1073a();
            }
            return;
        }
        if (this.f14629a != null) {
            this.f14629a.mo1089f(this);
        }
    }
}
