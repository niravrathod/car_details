package com.google.android.gms.internal.config;

public final class zzax extends zzbb<zzax> {
    /* renamed from: d */
    private static volatile zzax[] f20474d;
    /* renamed from: a */
    public int f20475a;
    /* renamed from: b */
    public long f20476b;
    /* renamed from: c */
    public String f20477c;

    public zzax() {
        this.f20475a = 0;
        this.f20476b = 0;
        this.f20477c = "";
        this.f = null;
        this.g = -1;
    }

    /* renamed from: b */
    public static zzax[] m27051b() {
        if (f20474d == null) {
            synchronized (zzbf.f9957b) {
                if (f20474d == null) {
                    f20474d = new zzax[0];
                }
            }
        }
        return f20474d;
    }

    /* renamed from: a */
    protected final int mo2911a() {
        int a = super.mo2911a();
        if (this.f20475a != 0) {
            a += zzaz.m11384b(1, this.f20475a);
        }
        if (this.f20476b != 0) {
            a += zzaz.m11383b(2) + 8;
        }
        return (this.f20477c == null || this.f20477c.equals("")) ? a : a + zzaz.m11386b(3, this.f20477c);
    }

    /* renamed from: a */
    public final /* synthetic */ zzbh mo4333a(zzay zzay) {
        while (true) {
            int a = zzay.m11368a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20475a = zzay.m11375d();
            } else if (a == 17) {
                this.f20476b = zzay.m11376e();
            } else if (a == 26) {
                this.f20477c = zzay.m11372b();
            } else if (!super.m22142a(zzay, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo2912a(zzaz zzaz) {
        if (this.f20475a != 0) {
            zzaz.m11392a(1, this.f20475a);
        }
        if (this.f20476b != 0) {
            zzaz.m11393a(2, this.f20476b);
        }
        if (!(this.f20477c == null || this.f20477c.equals(""))) {
            zzaz.m11395a(3, this.f20477c);
        }
        super.mo2912a(zzaz);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzax = (zzax) obj;
        if (this.f20475a != zzax.f20475a || this.f20476b != zzax.f20476b) {
            return false;
        }
        if (this.f20477c == null) {
            if (zzax.f20477c != null) {
                return false;
            }
        } else if (!this.f20477c.equals(zzax.f20477c)) {
            return false;
        }
        if (this.f != null) {
            if (!this.f.m11407b()) {
                return this.f.equals(zzax.f);
            }
        }
        if (zzax.f != null) {
            if (!zzax.f.m11407b()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f20475a) * 31) + ((int) (this.f20476b ^ (this.f20476b >>> 32)))) * 31) + (this.f20477c == null ? 0 : this.f20477c.hashCode())) * 31;
        if (this.f != null) {
            if (!this.f.m11407b()) {
                i = this.f.hashCode();
            }
        }
        return hashCode + i;
    }
}
