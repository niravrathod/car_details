package com.google.android.gms.internal.config;

public final class zzau extends zzbb<zzau> {
    /* renamed from: a */
    public int f20463a;
    /* renamed from: b */
    public boolean f20464b;
    /* renamed from: c */
    private long f20465c;

    public zzau() {
        this.f20463a = 0;
        this.f20464b = false;
        this.f20465c = 0;
        this.f = null;
        this.g = -1;
    }

    /* renamed from: a */
    protected final int mo2911a() {
        int a = super.mo2911a();
        if (this.f20463a != 0) {
            a += zzaz.m11384b(1, this.f20463a);
        }
        if (this.f20464b) {
            a += zzaz.m11383b(2) + 1;
        }
        return this.f20465c != 0 ? a + (zzaz.m11383b(3) + 8) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbh mo4333a(zzay zzay) {
        while (true) {
            int a = zzay.m11368a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20463a = zzay.m11375d();
            } else if (a == 16) {
                this.f20464b = zzay.m11375d() != 0;
            } else if (a == 25) {
                this.f20465c = zzay.m11376e();
            } else if (!super.m22142a(zzay, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo2912a(zzaz zzaz) {
        if (this.f20463a != 0) {
            zzaz.m11392a(1, this.f20463a);
        }
        if (this.f20464b) {
            boolean z = this.f20464b;
            zzaz.m11398c(2, 0);
            zzaz.m11391a((byte) z);
        }
        if (this.f20465c != 0) {
            zzaz.m11393a(3, this.f20465c);
        }
        super.mo2912a(zzaz);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzau)) {
            return false;
        }
        zzau zzau = (zzau) obj;
        if (this.f20463a != zzau.f20463a || this.f20464b != zzau.f20464b || this.f20465c != zzau.f20465c) {
            return false;
        }
        if (this.f != null) {
            if (!this.f.m11407b()) {
                return this.f.equals(zzau.f);
            }
        }
        if (zzau.f != null) {
            if (!zzau.f.m11407b()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((getClass().getName().hashCode() + 527) * 31) + this.f20463a) * 31) + (this.f20464b ? 1231 : 1237)) * 31) + ((int) (this.f20465c ^ (this.f20465c >>> 32)))) * 31;
        if (this.f != null) {
            if (!this.f.m11407b()) {
                hashCode = this.f.hashCode();
                return hashCode2 + hashCode;
            }
        }
        hashCode = 0;
        return hashCode2 + hashCode;
    }
}
