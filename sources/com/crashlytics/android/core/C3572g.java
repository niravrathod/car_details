package com.crashlytics.android.core;

/* renamed from: com.crashlytics.android.core.g */
class C3572g implements C1392o {
    /* renamed from: a */
    private final C3583q f14690a;
    /* renamed from: b */
    private final aa f14691b;

    public C3572g(C3583q c3583q, aa aaVar) {
        this.f14690a = c3583q;
        this.f14691b = aaVar;
    }

    /* renamed from: a */
    public boolean mo1128a(C1391n c1391n) {
        switch (c1391n.f4357b.mo1135g()) {
            case JAVA:
                this.f14690a.mo1128a(c1391n);
                return true;
            case NATIVE:
                this.f14691b.mo1128a(c1391n);
                return true;
            default:
                return null;
        }
    }
}
