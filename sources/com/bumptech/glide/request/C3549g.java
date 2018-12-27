package com.bumptech.glide.request;

/* renamed from: com.bumptech.glide.request.g */
public class C3549g implements C1310b, C1311c {
    /* renamed from: a */
    private final C1311c f14634a;
    /* renamed from: b */
    private C1310b f14635b;
    /* renamed from: c */
    private C1310b f14636c;
    /* renamed from: d */
    private boolean f14637d;

    C3549g() {
        this(null);
    }

    public C3549g(C1311c c1311c) {
        this.f14634a = c1311c;
    }

    /* renamed from: a */
    public void m17998a(C1310b c1310b, C1310b c1310b2) {
        this.f14635b = c1310b;
        this.f14636c = c1310b2;
    }

    /* renamed from: b */
    public boolean mo1085b(C1310b c1310b) {
        return (!m17993j() || (c1310b.equals(this.f14635b) == null && this.f14635b.mo1081e() != null)) ? null : true;
    }

    /* renamed from: j */
    private boolean m17993j() {
        if (this.f14634a != null) {
            if (!this.f14634a.mo1085b(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo1086c(C1310b c1310b) {
        return (m17995l() && c1310b.equals(this.f14635b) != null && mo1090i() == null) ? true : null;
    }

    /* renamed from: d */
    public boolean mo1087d(C1310b c1310b) {
        return (!m17994k() || c1310b.equals(this.f14635b) == null) ? null : true;
    }

    /* renamed from: k */
    private boolean m17994k() {
        if (this.f14634a != null) {
            if (!this.f14634a.mo1087d(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private boolean m17995l() {
        if (this.f14634a != null) {
            if (!this.f14634a.mo1086c(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo1090i() {
        if (!m17996m()) {
            if (!mo1081e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void mo1088e(C1310b c1310b) {
        if (c1310b.equals(this.f14636c) == null) {
            if (this.f14634a != null) {
                this.f14634a.mo1088e(this);
            }
            if (this.f14636c.mo1080d() == null) {
                this.f14636c.mo1078b();
            }
        }
    }

    /* renamed from: f */
    public void mo1089f(C1310b c1310b) {
        if (!(c1310b.equals(this.f14635b) == null || this.f14634a == null)) {
            this.f14634a.mo1089f(this);
        }
    }

    /* renamed from: m */
    private boolean m17996m() {
        return this.f14634a != null && this.f14634a.mo1090i();
    }

    /* renamed from: a */
    public void mo1073a() {
        this.f14637d = true;
        if (!(this.f14635b.mo1080d() || this.f14636c.mo1079c())) {
            this.f14636c.mo1073a();
        }
        if (this.f14637d && !this.f14635b.mo1079c()) {
            this.f14635b.mo1073a();
        }
    }

    /* renamed from: b */
    public void mo1078b() {
        this.f14637d = false;
        this.f14636c.mo1078b();
        this.f14635b.mo1078b();
    }

    /* renamed from: c */
    public boolean mo1079c() {
        return this.f14635b.mo1079c();
    }

    /* renamed from: d */
    public boolean mo1080d() {
        if (!this.f14635b.mo1080d()) {
            if (!this.f14636c.mo1080d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo1081e() {
        if (!this.f14635b.mo1081e()) {
            if (!this.f14636c.mo1081e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo1082f() {
        return this.f14635b.mo1082f();
    }

    /* renamed from: g */
    public boolean mo1083g() {
        return this.f14635b.mo1083g();
    }

    /* renamed from: h */
    public void mo1084h() {
        this.f14635b.mo1084h();
        this.f14636c.mo1084h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean mo1077a(com.bumptech.glide.request.C1310b r4) {
        /*
        r3 = this;
        r0 = r4 instanceof com.bumptech.glide.request.C3549g;
        r1 = 0;
        if (r0 == 0) goto L_0x002f;
    L_0x0005:
        r4 = (com.bumptech.glide.request.C3549g) r4;
        r0 = r3.f14635b;
        if (r0 != 0) goto L_0x0010;
    L_0x000b:
        r0 = r4.f14635b;
        if (r0 != 0) goto L_0x002e;
    L_0x000f:
        goto L_0x001a;
    L_0x0010:
        r0 = r3.f14635b;
        r2 = r4.f14635b;
        r0 = r0.mo1077a(r2);
        if (r0 == 0) goto L_0x002e;
    L_0x001a:
        r0 = r3.f14636c;
        if (r0 != 0) goto L_0x0023;
    L_0x001e:
        r4 = r4.f14636c;
        if (r4 != 0) goto L_0x002e;
    L_0x0022:
        goto L_0x002d;
    L_0x0023:
        r0 = r3.f14636c;
        r4 = r4.f14636c;
        r4 = r0.mo1077a(r4);
        if (r4 == 0) goto L_0x002e;
    L_0x002d:
        r1 = 1;
    L_0x002e:
        return r1;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.g.a(com.bumptech.glide.request.b):boolean");
    }
}
