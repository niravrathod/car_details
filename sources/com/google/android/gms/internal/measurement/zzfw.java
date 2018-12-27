package com.google.android.gms.internal.measurement;

public final class zzfw extends zzza<zzfw> {
    /* renamed from: e */
    private static volatile zzfw[] f20543e;
    /* renamed from: a */
    public zzfz f20544a;
    /* renamed from: b */
    public zzfx f20545b;
    /* renamed from: c */
    public Boolean f20546c;
    /* renamed from: d */
    public String f20547d;

    /* renamed from: a */
    public static zzfw[] m27108a() {
        if (f20543e == null) {
            synchronized (zzze.f10362b) {
                if (f20543e == null) {
                    f20543e = new zzfw[0];
                }
            }
        }
        return f20543e;
    }

    public zzfw() {
        this.f20544a = null;
        this.f20545b = null;
        this.f20546c = null;
        this.f20547d = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfw)) {
            return false;
        }
        zzfw zzfw = (zzfw) obj;
        if (this.f20544a == null) {
            if (zzfw.f20544a != null) {
                return false;
            }
        } else if (!this.f20544a.equals(zzfw.f20544a)) {
            return false;
        }
        if (this.f20545b == null) {
            if (zzfw.f20545b != null) {
                return false;
            }
        } else if (!this.f20545b.equals(zzfw.f20545b)) {
            return false;
        }
        if (this.f20546c == null) {
            if (zzfw.f20546c != null) {
                return false;
            }
        } else if (!this.f20546c.equals(zzfw.f20546c)) {
            return false;
        }
        if (this.f20547d == null) {
            if (zzfw.f20547d != null) {
                return false;
            }
        } else if (!this.f20547d.equals(zzfw.f20547d)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzfw.J);
            }
        }
        if (zzfw.J != null) {
            if (zzfw.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = getClass().getName().hashCode() + 527;
        zzfz zzfz = this.f20544a;
        hashCode *= 31;
        int i2 = 0;
        if (zzfz == null) {
            i = 0;
        } else {
            i = zzfz.hashCode();
        }
        hashCode += i;
        zzfx zzfx = this.f20545b;
        hashCode *= 31;
        if (zzfx == null) {
            i = 0;
        } else {
            i = zzfx.hashCode();
        }
        hashCode = (((((hashCode + i) * 31) + (this.f20546c == null ? 0 : this.f20546c.hashCode())) * 31) + (this.f20547d == null ? 0 : this.f20547d.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i2 = this.J.hashCode();
            }
        }
        return hashCode + i2;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20544a != null) {
            zzyy.m12170a(1, this.f20544a);
        }
        if (this.f20545b != null) {
            zzyy.m12170a(2, this.f20545b);
        }
        if (this.f20546c != null) {
            zzyy.m12172a(3, this.f20546c.booleanValue());
        }
        if (this.f20547d != null) {
            zzyy.m12171a(4, this.f20547d);
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20544a != null) {
            b += zzyy.m12157b(1, this.f20544a);
        }
        if (this.f20545b != null) {
            b += zzyy.m12157b(2, this.f20545b);
        }
        if (this.f20546c != null) {
            this.f20546c.booleanValue();
            b += zzyy.m12155b(3) + 1;
        }
        return this.f20547d != null ? b + zzyy.m12158b(4, this.f20547d) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f20544a == null) {
                    this.f20544a = new zzfz();
                }
                zzyx.m12132a(this.f20544a);
            } else if (a == 18) {
                if (this.f20545b == null) {
                    this.f20545b = new zzfx();
                }
                zzyx.m12132a(this.f20545b);
            } else if (a == 24) {
                this.f20546c = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 34) {
                this.f20547d = zzyx.m12139c();
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
