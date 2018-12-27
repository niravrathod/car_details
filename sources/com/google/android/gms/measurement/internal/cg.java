package com.google.android.gms.measurement.internal;

abstract class cg extends cf {
    /* renamed from: b */
    private boolean f21379b;

    cg(zzfa zzfa) {
        super(zzfa);
        this.a.m22784a(this);
    }

    /* renamed from: e */
    protected abstract boolean mo4961e();

    /* renamed from: j */
    final boolean m28437j() {
        return this.f21379b;
    }

    /* renamed from: k */
    protected final void m28438k() {
        if (!m28437j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: v */
    public final void m28439v() {
        if (this.f21379b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo4961e();
        this.a.m22811l();
        this.f21379b = true;
    }
}
