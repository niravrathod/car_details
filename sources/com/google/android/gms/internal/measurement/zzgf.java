package com.google.android.gms.internal.measurement;

public final class zzgf extends zzza<zzgf> {
    /* renamed from: f */
    private static volatile zzgf[] f20586f;
    /* renamed from: a */
    public zzgg[] f20587a;
    /* renamed from: b */
    public String f20588b;
    /* renamed from: c */
    public Long f20589c;
    /* renamed from: d */
    public Long f20590d;
    /* renamed from: e */
    public Integer f20591e;

    /* renamed from: a */
    public static zzgf[] m27143a() {
        if (f20586f == null) {
            synchronized (zzze.f10362b) {
                if (f20586f == null) {
                    f20586f = new zzgf[0];
                }
            }
        }
        return f20586f;
    }

    public zzgf() {
        this.f20587a = zzgg.m27147a();
        this.f20588b = null;
        this.f20589c = null;
        this.f20590d = null;
        this.f20591e = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgf)) {
            return false;
        }
        zzgf zzgf = (zzgf) obj;
        if (!zzze.m12193a(this.f20587a, zzgf.f20587a)) {
            return false;
        }
        if (this.f20588b == null) {
            if (zzgf.f20588b != null) {
                return false;
            }
        } else if (!this.f20588b.equals(zzgf.f20588b)) {
            return false;
        }
        if (this.f20589c == null) {
            if (zzgf.f20589c != null) {
                return false;
            }
        } else if (!this.f20589c.equals(zzgf.f20589c)) {
            return false;
        }
        if (this.f20590d == null) {
            if (zzgf.f20590d != null) {
                return false;
            }
        } else if (!this.f20590d.equals(zzgf.f20590d)) {
            return false;
        }
        if (this.f20591e == null) {
            if (zzgf.f20591e != null) {
                return false;
            }
        } else if (!this.f20591e.equals(zzgf.f20591e)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgf.J);
            }
        }
        if (zzgf.J != null) {
            if (zzgf.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + zzze.m12190a(this.f20587a)) * 31) + (this.f20588b == null ? 0 : this.f20588b.hashCode())) * 31) + (this.f20589c == null ? 0 : this.f20589c.hashCode())) * 31) + (this.f20590d == null ? 0 : this.f20590d.hashCode())) * 31) + (this.f20591e == null ? 0 : this.f20591e.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20587a != null && this.f20587a.length > 0) {
            for (zzzg zzzg : this.f20587a) {
                if (zzzg != null) {
                    zzyy.m12170a(1, zzzg);
                }
            }
        }
        if (this.f20588b != null) {
            zzyy.m12171a(2, this.f20588b);
        }
        if (this.f20589c != null) {
            zzyy.m12174b(3, this.f20589c.longValue());
        }
        if (this.f20590d != null) {
            zzyy.m12174b(4, this.f20590d.longValue());
        }
        if (this.f20591e != null) {
            zzyy.m12167a(5, this.f20591e.intValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20587a != null && this.f20587a.length > 0) {
            for (zzzg zzzg : this.f20587a) {
                if (zzzg != null) {
                    b += zzyy.m12157b(1, zzzg);
                }
            }
        }
        if (this.f20588b != null) {
            b += zzyy.m12158b(2, this.f20588b);
        }
        if (this.f20589c != null) {
            b += zzyy.m12161c(3, this.f20589c.longValue());
        }
        if (this.f20590d != null) {
            b += zzyy.m12161c(4, this.f20590d.longValue());
        }
        return this.f20591e != null ? b + zzyy.m12156b(5, this.f20591e.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                a = zzzj.m12207a(zzyx, 10);
                int length = this.f20587a == null ? 0 : this.f20587a.length;
                Object obj = new zzgg[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20587a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzgg();
                    zzyx.m12132a(obj[length]);
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = new zzgg();
                zzyx.m12132a(obj[length]);
                this.f20587a = obj;
            } else if (a == 18) {
                this.f20588b = zzyx.m12139c();
            } else if (a == 24) {
                this.f20589c = Long.valueOf(zzyx.m12142e());
            } else if (a == 32) {
                this.f20590d = Long.valueOf(zzyx.m12142e());
            } else if (a == 40) {
                this.f20591e = Integer.valueOf(zzyx.m12140d());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
