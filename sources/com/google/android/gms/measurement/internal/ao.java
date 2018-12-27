package com.google.android.gms.measurement.internal;

abstract class ao extends an {
    /* renamed from: a */
    private boolean f20671a;

    ao(zzbt zzbt) {
        super(zzbt);
        this.r.m22717a(this);
    }

    /* renamed from: e */
    protected abstract boolean mo4839e();

    /* renamed from: f */
    protected void mo4840f() {
    }

    /* renamed from: z */
    final boolean m27285z() {
        return this.f20671a;
    }

    /* renamed from: A */
    protected final void m27280A() {
        if (!m27285z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: B */
    public final void m27281B() {
        if (this.f20671a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo4839e()) {
            this.r.m22714G();
            this.f20671a = true;
        }
    }

    /* renamed from: C */
    public final void m27282C() {
        if (this.f20671a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo4840f();
        this.r.m22714G();
        this.f20671a = true;
    }
}
