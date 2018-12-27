package com.google.android.gms.internal.measurement;

public final class zzgg extends zzza<zzgg> {
    /* renamed from: e */
    private static volatile zzgg[] f20592e;
    /* renamed from: a */
    public String f20593a;
    /* renamed from: b */
    public String f20594b;
    /* renamed from: c */
    public Long f20595c;
    /* renamed from: d */
    public Double f20596d;
    /* renamed from: f */
    private Float f20597f;

    /* renamed from: a */
    public static zzgg[] m27147a() {
        if (f20592e == null) {
            synchronized (zzze.f10362b) {
                if (f20592e == null) {
                    f20592e = new zzgg[0];
                }
            }
        }
        return f20592e;
    }

    public zzgg() {
        this.f20593a = null;
        this.f20594b = null;
        this.f20595c = null;
        this.f20597f = null;
        this.f20596d = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgg)) {
            return false;
        }
        zzgg zzgg = (zzgg) obj;
        if (this.f20593a == null) {
            if (zzgg.f20593a != null) {
                return false;
            }
        } else if (!this.f20593a.equals(zzgg.f20593a)) {
            return false;
        }
        if (this.f20594b == null) {
            if (zzgg.f20594b != null) {
                return false;
            }
        } else if (!this.f20594b.equals(zzgg.f20594b)) {
            return false;
        }
        if (this.f20595c == null) {
            if (zzgg.f20595c != null) {
                return false;
            }
        } else if (!this.f20595c.equals(zzgg.f20595c)) {
            return false;
        }
        if (this.f20597f == null) {
            if (zzgg.f20597f != null) {
                return false;
            }
        } else if (!this.f20597f.equals(zzgg.f20597f)) {
            return false;
        }
        if (this.f20596d == null) {
            if (zzgg.f20596d != null) {
                return false;
            }
        } else if (!this.f20596d.equals(zzgg.f20596d)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgg.J);
            }
        }
        if (zzgg.J != null) {
            if (zzgg.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20593a == null ? 0 : this.f20593a.hashCode())) * 31) + (this.f20594b == null ? 0 : this.f20594b.hashCode())) * 31) + (this.f20595c == null ? 0 : this.f20595c.hashCode())) * 31) + (this.f20597f == null ? 0 : this.f20597f.hashCode())) * 31) + (this.f20596d == null ? 0 : this.f20596d.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20593a != null) {
            zzyy.m12171a(1, this.f20593a);
        }
        if (this.f20594b != null) {
            zzyy.m12171a(2, this.f20594b);
        }
        if (this.f20595c != null) {
            zzyy.m12174b(3, this.f20595c.longValue());
        }
        if (this.f20597f != null) {
            zzyy.m12166a(4, this.f20597f.floatValue());
        }
        if (this.f20596d != null) {
            zzyy.m12165a(5, this.f20596d.doubleValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20593a != null) {
            b += zzyy.m12158b(1, this.f20593a);
        }
        if (this.f20594b != null) {
            b += zzyy.m12158b(2, this.f20594b);
        }
        if (this.f20595c != null) {
            b += zzyy.m12161c(3, this.f20595c.longValue());
        }
        if (this.f20597f != null) {
            this.f20597f.floatValue();
            b += zzyy.m12155b(4) + 4;
        }
        if (this.f20596d == null) {
            return b;
        }
        this.f20596d.doubleValue();
        return b + (zzyy.m12155b(5) + 8);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20593a = zzyx.m12139c();
            } else if (a == 18) {
                this.f20594b = zzyx.m12139c();
            } else if (a == 24) {
                this.f20595c = Long.valueOf(zzyx.m12142e());
            } else if (a == 37) {
                this.f20597f = Float.valueOf(Float.intBitsToFloat(zzyx.m12144f()));
            } else if (a == 41) {
                this.f20596d = Double.valueOf(Double.longBitsToDouble(zzyx.m12145g()));
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
