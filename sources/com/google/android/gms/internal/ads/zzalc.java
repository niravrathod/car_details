package com.google.android.gms.internal.ads;

@zzaer
public abstract class zzalc implements zzami<zzapi> {
    /* renamed from: a */
    private final Runnable f16847a = new cx(this);
    /* renamed from: b */
    private volatile Thread f16848b;
    /* renamed from: c */
    private boolean f16849c = false;

    /* renamed from: a */
    public abstract void mo4075a();

    public abstract void m_();

    public zzalc(boolean z) {
    }

    /* renamed from: h */
    public final zzapi m21224h() {
        if (!this.f16849c) {
            return zzalm.m9772a(this.f16847a);
        }
        return zzalm.f8870b.mo2371a(this.f16847a);
    }

    /* renamed from: b */
    public final void mo2218b() {
        m_();
        if (this.f16848b != null) {
            this.f16848b.interrupt();
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo2219c() {
        if (!this.f16849c) {
            return zzalm.m9772a(this.f16847a);
        }
        return zzalm.f8870b.mo2371a(this.f16847a);
    }
}
