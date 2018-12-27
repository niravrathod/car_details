package com.google.android.gms.internal.measurement;

public final class zzgd extends zzza<zzgd> {
    /* renamed from: e */
    private static volatile zzgd[] f20578e;
    /* renamed from: a */
    public Integer f20579a;
    /* renamed from: b */
    public zzgj f20580b;
    /* renamed from: c */
    public zzgj f20581c;
    /* renamed from: d */
    public Boolean f20582d;

    /* renamed from: a */
    public static zzgd[] m27135a() {
        if (f20578e == null) {
            synchronized (zzze.f10362b) {
                if (f20578e == null) {
                    f20578e = new zzgd[0];
                }
            }
        }
        return f20578e;
    }

    public zzgd() {
        this.f20579a = null;
        this.f20580b = null;
        this.f20581c = null;
        this.f20582d = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgd = (zzgd) obj;
        if (this.f20579a == null) {
            if (zzgd.f20579a != null) {
                return false;
            }
        } else if (!this.f20579a.equals(zzgd.f20579a)) {
            return false;
        }
        if (this.f20580b == null) {
            if (zzgd.f20580b != null) {
                return false;
            }
        } else if (!this.f20580b.equals(zzgd.f20580b)) {
            return false;
        }
        if (this.f20581c == null) {
            if (zzgd.f20581c != null) {
                return false;
            }
        } else if (!this.f20581c.equals(zzgd.f20581c)) {
            return false;
        }
        if (this.f20582d == null) {
            if (zzgd.f20582d != null) {
                return false;
            }
        } else if (!this.f20582d.equals(zzgd.f20582d)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgd.J);
            }
        }
        if (zzgd.J != null) {
            if (zzgd.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + (this.f20579a == null ? 0 : this.f20579a.hashCode());
        zzgj zzgj = this.f20580b;
        hashCode *= 31;
        if (zzgj == null) {
            i = 0;
        } else {
            i = zzgj.hashCode();
        }
        hashCode += i;
        zzgj = this.f20581c;
        hashCode *= 31;
        if (zzgj == null) {
            i = 0;
        } else {
            i = zzgj.hashCode();
        }
        hashCode = (((hashCode + i) * 31) + (this.f20582d == null ? 0 : this.f20582d.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i2 = this.J.hashCode();
            }
        }
        return hashCode + i2;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20579a != null) {
            zzyy.m12167a(1, this.f20579a.intValue());
        }
        if (this.f20580b != null) {
            zzyy.m12170a(2, this.f20580b);
        }
        if (this.f20581c != null) {
            zzyy.m12170a(3, this.f20581c);
        }
        if (this.f20582d != null) {
            zzyy.m12172a(4, this.f20582d.booleanValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20579a != null) {
            b += zzyy.m12156b(1, this.f20579a.intValue());
        }
        if (this.f20580b != null) {
            b += zzyy.m12157b(2, this.f20580b);
        }
        if (this.f20581c != null) {
            b += zzyy.m12157b(3, this.f20581c);
        }
        if (this.f20582d == null) {
            return b;
        }
        this.f20582d.booleanValue();
        return b + (zzyy.m12155b(4) + 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20579a = Integer.valueOf(zzyx.m12140d());
            } else if (a == 18) {
                if (this.f20580b == null) {
                    this.f20580b = new zzgj();
                }
                zzyx.m12132a(this.f20580b);
            } else if (a == 26) {
                if (this.f20581c == null) {
                    this.f20581c = new zzgj();
                }
                zzyx.m12132a(this.f20581c);
            } else if (a == 32) {
                this.f20582d = Boolean.valueOf(zzyx.m12136b());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
