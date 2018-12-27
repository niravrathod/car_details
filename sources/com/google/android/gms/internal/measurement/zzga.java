package com.google.android.gms.internal.measurement;

public final class zzga extends zzza<zzga> {
    /* renamed from: e */
    private static volatile zzga[] f20563e;
    /* renamed from: a */
    public String f20564a;
    /* renamed from: b */
    public Boolean f20565b;
    /* renamed from: c */
    public Boolean f20566c;
    /* renamed from: d */
    public Integer f20567d;

    /* renamed from: a */
    public static zzga[] m27124a() {
        if (f20563e == null) {
            synchronized (zzze.f10362b) {
                if (f20563e == null) {
                    f20563e = new zzga[0];
                }
            }
        }
        return f20563e;
    }

    public zzga() {
        this.f20564a = null;
        this.f20565b = null;
        this.f20566c = null;
        this.f20567d = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzga)) {
            return false;
        }
        zzga zzga = (zzga) obj;
        if (this.f20564a == null) {
            if (zzga.f20564a != null) {
                return false;
            }
        } else if (!this.f20564a.equals(zzga.f20564a)) {
            return false;
        }
        if (this.f20565b == null) {
            if (zzga.f20565b != null) {
                return false;
            }
        } else if (!this.f20565b.equals(zzga.f20565b)) {
            return false;
        }
        if (this.f20566c == null) {
            if (zzga.f20566c != null) {
                return false;
            }
        } else if (!this.f20566c.equals(zzga.f20566c)) {
            return false;
        }
        if (this.f20567d == null) {
            if (zzga.f20567d != null) {
                return false;
            }
        } else if (!this.f20567d.equals(zzga.f20567d)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzga.J);
            }
        }
        if (zzga.J != null) {
            if (zzga.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20564a == null ? 0 : this.f20564a.hashCode())) * 31) + (this.f20565b == null ? 0 : this.f20565b.hashCode())) * 31) + (this.f20566c == null ? 0 : this.f20566c.hashCode())) * 31) + (this.f20567d == null ? 0 : this.f20567d.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20564a != null) {
            zzyy.m12171a(1, this.f20564a);
        }
        if (this.f20565b != null) {
            zzyy.m12172a(2, this.f20565b.booleanValue());
        }
        if (this.f20566c != null) {
            zzyy.m12172a(3, this.f20566c.booleanValue());
        }
        if (this.f20567d != null) {
            zzyy.m12167a(4, this.f20567d.intValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20564a != null) {
            b += zzyy.m12158b(1, this.f20564a);
        }
        if (this.f20565b != null) {
            this.f20565b.booleanValue();
            b += zzyy.m12155b(2) + 1;
        }
        if (this.f20566c != null) {
            this.f20566c.booleanValue();
            b += zzyy.m12155b(3) + 1;
        }
        return this.f20567d != null ? b + zzyy.m12156b(4, this.f20567d.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20564a = zzyx.m12139c();
            } else if (a == 16) {
                this.f20565b = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 24) {
                this.f20566c = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 32) {
                this.f20567d = Integer.valueOf(zzyx.m12140d());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
