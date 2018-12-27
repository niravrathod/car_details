package com.google.android.gms.internal.ads;

public final class zzwp extends zzapy<zzwy> {
    /* renamed from: a */
    private final Object f20404a = new Object();
    /* renamed from: b */
    private final zzwt f20405b;
    /* renamed from: c */
    private boolean f20406c;

    public zzwp(zzwt zzwt) {
        this.f20405b = zzwt;
    }

    /* renamed from: c */
    public final void m26858c() {
        synchronized (this.f20404a) {
            if (this.f20406c) {
                return;
            }
            this.f20406c = true;
            mo2373a(new vv(this), new zzapw());
            mo2373a(new vw(this), new vx(this));
        }
    }
}
