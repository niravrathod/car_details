package com.google.android.gms.internal.measurement;

public final class zzfy extends zzza<zzfy> {
    /* renamed from: f */
    private static volatile zzfy[] f20553f;
    /* renamed from: a */
    public Integer f20554a;
    /* renamed from: b */
    public String f20555b;
    /* renamed from: c */
    public zzfw f20556c;
    /* renamed from: d */
    public Boolean f20557d;
    /* renamed from: e */
    public Boolean f20558e;

    /* renamed from: a */
    public static zzfy[] m27116a() {
        if (f20553f == null) {
            synchronized (zzze.f10362b) {
                if (f20553f == null) {
                    f20553f = new zzfy[0];
                }
            }
        }
        return f20553f;
    }

    public zzfy() {
        this.f20554a = null;
        this.f20555b = null;
        this.f20556c = null;
        this.f20557d = null;
        this.f20558e = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfy)) {
            return false;
        }
        zzfy zzfy = (zzfy) obj;
        if (this.f20554a == null) {
            if (zzfy.f20554a != null) {
                return false;
            }
        } else if (!this.f20554a.equals(zzfy.f20554a)) {
            return false;
        }
        if (this.f20555b == null) {
            if (zzfy.f20555b != null) {
                return false;
            }
        } else if (!this.f20555b.equals(zzfy.f20555b)) {
            return false;
        }
        if (this.f20556c == null) {
            if (zzfy.f20556c != null) {
                return false;
            }
        } else if (!this.f20556c.equals(zzfy.f20556c)) {
            return false;
        }
        if (this.f20557d == null) {
            if (zzfy.f20557d != null) {
                return false;
            }
        } else if (!this.f20557d.equals(zzfy.f20557d)) {
            return false;
        }
        if (this.f20558e == null) {
            if (zzfy.f20558e != null) {
                return false;
            }
        } else if (!this.f20558e.equals(zzfy.f20558e)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzfy.J);
            }
        }
        if (zzfy.J != null) {
            if (zzfy.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + (this.f20554a == null ? 0 : this.f20554a.hashCode())) * 31) + (this.f20555b == null ? 0 : this.f20555b.hashCode());
        zzfw zzfw = this.f20556c;
        hashCode *= 31;
        if (zzfw == null) {
            i = 0;
        } else {
            i = zzfw.hashCode();
        }
        hashCode = (((((hashCode + i) * 31) + (this.f20557d == null ? 0 : this.f20557d.hashCode())) * 31) + (this.f20558e == null ? 0 : this.f20558e.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i2 = this.J.hashCode();
            }
        }
        return hashCode + i2;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20554a != null) {
            zzyy.m12167a(1, this.f20554a.intValue());
        }
        if (this.f20555b != null) {
            zzyy.m12171a(2, this.f20555b);
        }
        if (this.f20556c != null) {
            zzyy.m12170a(3, this.f20556c);
        }
        if (this.f20557d != null) {
            zzyy.m12172a(4, this.f20557d.booleanValue());
        }
        if (this.f20558e != null) {
            zzyy.m12172a(5, this.f20558e.booleanValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20554a != null) {
            b += zzyy.m12156b(1, this.f20554a.intValue());
        }
        if (this.f20555b != null) {
            b += zzyy.m12158b(2, this.f20555b);
        }
        if (this.f20556c != null) {
            b += zzyy.m12157b(3, this.f20556c);
        }
        if (this.f20557d != null) {
            this.f20557d.booleanValue();
            b += zzyy.m12155b(4) + 1;
        }
        if (this.f20558e == null) {
            return b;
        }
        this.f20558e.booleanValue();
        return b + (zzyy.m12155b(5) + 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20554a = Integer.valueOf(zzyx.m12140d());
            } else if (a == 18) {
                this.f20555b = zzyx.m12139c();
            } else if (a == 26) {
                if (this.f20556c == null) {
                    this.f20556c = new zzfw();
                }
                zzyx.m12132a(this.f20556c);
            } else if (a == 32) {
                this.f20557d = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 40) {
                this.f20558e = Boolean.valueOf(zzyx.m12136b());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
