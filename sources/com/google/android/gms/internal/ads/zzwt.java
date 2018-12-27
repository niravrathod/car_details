package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

public final class zzwt extends zzapy<zzvr> {
    /* renamed from: a */
    private final Object f20407a = new Object();
    /* renamed from: b */
    private zzamu<zzvr> f20408b;
    /* renamed from: c */
    private boolean f20409c;
    /* renamed from: d */
    private int f20410d;

    public zzwt(zzamu<zzvr> zzamu) {
        this.f20408b = zzamu;
        this.f20409c = false;
        this.f20410d = 0;
    }

    /* renamed from: c */
    public final zzwp m26861c() {
        zzwp zzwp = new zzwp(this);
        synchronized (this.f20407a) {
            mo2373a(new vy(this, zzwp), new vz(this, zzwp));
            Preconditions.checkState(this.f20410d >= 0);
            this.f20410d++;
        }
        return zzwp;
    }

    /* renamed from: d */
    protected final void m26862d() {
        synchronized (this.f20407a) {
            Preconditions.checkState(this.f20410d > 0);
            zzalg.m21225a("Releasing 1 reference for JS Engine");
            this.f20410d--;
            m26860f();
        }
    }

    /* renamed from: e */
    public final void m26863e() {
        synchronized (this.f20407a) {
            Preconditions.checkState(this.f20410d >= 0);
            zzalg.m21225a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f20409c = true;
            m26860f();
        }
    }

    /* renamed from: f */
    private final void m26860f() {
        synchronized (this.f20407a) {
            Preconditions.checkState(this.f20410d >= 0);
            if (this.f20409c && this.f20410d == 0) {
                zzalg.m21225a("No reference is left (including root). Cleaning up engine.");
                mo2373a(new wa(this), new zzapw());
            } else {
                zzalg.m21225a("There are still references to the engine. Not destroying.");
            }
        }
    }
}
