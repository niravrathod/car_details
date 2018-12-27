package com.google.android.gms.measurement.internal;

abstract class ch extends bl {
    /* renamed from: a */
    private boolean f21380a;

    ch(zzbt zzbt) {
        super(zzbt);
        this.r.m22718a(this);
    }

    /* renamed from: v */
    protected abstract boolean mo4962v();

    /* renamed from: w */
    protected void mo4963w() {
    }

    /* renamed from: D */
    final boolean m28440D() {
        return this.f21380a;
    }

    /* renamed from: E */
    protected final void m28441E() {
        if (!m28440D()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: F */
    public final void m28442F() {
        if (this.f21380a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo4962v()) {
            this.r.m22714G();
            this.f21380a = true;
        }
    }

    /* renamed from: G */
    public final void m28443G() {
        if (this.f21380a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo4963w();
        this.r.m22714G();
        this.f21380a = true;
    }
}
