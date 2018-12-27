package com.google.android.gms.internal.measurement;

public final class zzgl extends zzza<zzgl> {
    /* renamed from: f */
    private static volatile zzgl[] f20646f;
    /* renamed from: a */
    public Long f20647a;
    /* renamed from: b */
    public String f20648b;
    /* renamed from: c */
    public String f20649c;
    /* renamed from: d */
    public Long f20650d;
    /* renamed from: e */
    public Double f20651e;
    /* renamed from: g */
    private Float f20652g;

    /* renamed from: a */
    public static zzgl[] m27165a() {
        if (f20646f == null) {
            synchronized (zzze.f10362b) {
                if (f20646f == null) {
                    f20646f = new zzgl[0];
                }
            }
        }
        return f20646f;
    }

    public zzgl() {
        this.f20647a = null;
        this.f20648b = null;
        this.f20649c = null;
        this.f20650d = null;
        this.f20652g = null;
        this.f20651e = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgl)) {
            return false;
        }
        zzgl zzgl = (zzgl) obj;
        if (this.f20647a == null) {
            if (zzgl.f20647a != null) {
                return false;
            }
        } else if (!this.f20647a.equals(zzgl.f20647a)) {
            return false;
        }
        if (this.f20648b == null) {
            if (zzgl.f20648b != null) {
                return false;
            }
        } else if (!this.f20648b.equals(zzgl.f20648b)) {
            return false;
        }
        if (this.f20649c == null) {
            if (zzgl.f20649c != null) {
                return false;
            }
        } else if (!this.f20649c.equals(zzgl.f20649c)) {
            return false;
        }
        if (this.f20650d == null) {
            if (zzgl.f20650d != null) {
                return false;
            }
        } else if (!this.f20650d.equals(zzgl.f20650d)) {
            return false;
        }
        if (this.f20652g == null) {
            if (zzgl.f20652g != null) {
                return false;
            }
        } else if (!this.f20652g.equals(zzgl.f20652g)) {
            return false;
        }
        if (this.f20651e == null) {
            if (zzgl.f20651e != null) {
                return false;
            }
        } else if (!this.f20651e.equals(zzgl.f20651e)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgl.J);
            }
        }
        if (zzgl.J != null) {
            if (zzgl.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20647a == null ? 0 : this.f20647a.hashCode())) * 31) + (this.f20648b == null ? 0 : this.f20648b.hashCode())) * 31) + (this.f20649c == null ? 0 : this.f20649c.hashCode())) * 31) + (this.f20650d == null ? 0 : this.f20650d.hashCode())) * 31) + (this.f20652g == null ? 0 : this.f20652g.hashCode())) * 31) + (this.f20651e == null ? 0 : this.f20651e.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20647a != null) {
            zzyy.m12174b(1, this.f20647a.longValue());
        }
        if (this.f20648b != null) {
            zzyy.m12171a(2, this.f20648b);
        }
        if (this.f20649c != null) {
            zzyy.m12171a(3, this.f20649c);
        }
        if (this.f20650d != null) {
            zzyy.m12174b(4, this.f20650d.longValue());
        }
        if (this.f20652g != null) {
            zzyy.m12166a(5, this.f20652g.floatValue());
        }
        if (this.f20651e != null) {
            zzyy.m12165a(6, this.f20651e.doubleValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20647a != null) {
            b += zzyy.m12161c(1, this.f20647a.longValue());
        }
        if (this.f20648b != null) {
            b += zzyy.m12158b(2, this.f20648b);
        }
        if (this.f20649c != null) {
            b += zzyy.m12158b(3, this.f20649c);
        }
        if (this.f20650d != null) {
            b += zzyy.m12161c(4, this.f20650d.longValue());
        }
        if (this.f20652g != null) {
            this.f20652g.floatValue();
            b += zzyy.m12155b(5) + 4;
        }
        if (this.f20651e == null) {
            return b;
        }
        this.f20651e.doubleValue();
        return b + (zzyy.m12155b(6) + 8);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20647a = Long.valueOf(zzyx.m12142e());
            } else if (a == 18) {
                this.f20648b = zzyx.m12139c();
            } else if (a == 26) {
                this.f20649c = zzyx.m12139c();
            } else if (a == 32) {
                this.f20650d = Long.valueOf(zzyx.m12142e());
            } else if (a == 45) {
                this.f20652g = Float.valueOf(Float.intBitsToFloat(zzyx.m12144f()));
            } else if (a == 49) {
                this.f20651e = Double.valueOf(Double.longBitsToDouble(zzyx.m12145g()));
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
