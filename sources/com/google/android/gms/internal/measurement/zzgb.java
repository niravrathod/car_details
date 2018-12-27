package com.google.android.gms.internal.measurement;

public final class zzgb extends zzza<zzgb> {
    /* renamed from: a */
    public Long f20568a;
    /* renamed from: b */
    public String f20569b;
    /* renamed from: c */
    public zzgc[] f20570c;
    /* renamed from: d */
    public zzga[] f20571d;
    /* renamed from: e */
    public zzfu[] f20572e;
    /* renamed from: f */
    private Integer f20573f;
    /* renamed from: g */
    private String f20574g;

    public zzgb() {
        this.f20568a = null;
        this.f20569b = null;
        this.f20573f = null;
        this.f20570c = zzgc.m27131a();
        this.f20571d = zzga.m27124a();
        this.f20572e = zzfu.m27100a();
        this.f20574g = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgb)) {
            return false;
        }
        zzgb zzgb = (zzgb) obj;
        if (this.f20568a == null) {
            if (zzgb.f20568a != null) {
                return false;
            }
        } else if (!this.f20568a.equals(zzgb.f20568a)) {
            return false;
        }
        if (this.f20569b == null) {
            if (zzgb.f20569b != null) {
                return false;
            }
        } else if (!this.f20569b.equals(zzgb.f20569b)) {
            return false;
        }
        if (this.f20573f == null) {
            if (zzgb.f20573f != null) {
                return false;
            }
        } else if (!this.f20573f.equals(zzgb.f20573f)) {
            return false;
        }
        if (!zzze.m12193a(this.f20570c, zzgb.f20570c) || !zzze.m12193a(this.f20571d, zzgb.f20571d) || !zzze.m12193a(this.f20572e, zzgb.f20572e)) {
            return false;
        }
        if (this.f20574g == null) {
            if (zzgb.f20574g != null) {
                return false;
            }
        } else if (!this.f20574g.equals(zzgb.f20574g)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgb.J);
            }
        }
        if (zzgb.J != null) {
            if (zzgb.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20568a == null ? 0 : this.f20568a.hashCode())) * 31) + (this.f20569b == null ? 0 : this.f20569b.hashCode())) * 31) + (this.f20573f == null ? 0 : this.f20573f.hashCode())) * 31) + zzze.m12190a(this.f20570c)) * 31) + zzze.m12190a(this.f20571d)) * 31) + zzze.m12190a(this.f20572e)) * 31) + (this.f20574g == null ? 0 : this.f20574g.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20568a != null) {
            zzyy.m12174b(1, this.f20568a.longValue());
        }
        if (this.f20569b != null) {
            zzyy.m12171a(2, this.f20569b);
        }
        if (this.f20573f != null) {
            zzyy.m12167a(3, this.f20573f.intValue());
        }
        if (this.f20570c != null && this.f20570c.length > 0) {
            for (zzzg zzzg : this.f20570c) {
                if (zzzg != null) {
                    zzyy.m12170a(4, zzzg);
                }
            }
        }
        if (this.f20571d != null && this.f20571d.length > 0) {
            for (zzzg zzzg2 : this.f20571d) {
                if (zzzg2 != null) {
                    zzyy.m12170a(5, zzzg2);
                }
            }
        }
        if (this.f20572e != null && this.f20572e.length > 0) {
            for (zzzg zzzg3 : this.f20572e) {
                if (zzzg3 != null) {
                    zzyy.m12170a(6, zzzg3);
                }
            }
        }
        if (this.f20574g != null) {
            zzyy.m12171a(7, this.f20574g);
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int i;
        int b = super.mo3161b();
        if (this.f20568a != null) {
            b += zzyy.m12161c(1, this.f20568a.longValue());
        }
        if (this.f20569b != null) {
            b += zzyy.m12158b(2, this.f20569b);
        }
        if (this.f20573f != null) {
            b += zzyy.m12156b(3, this.f20573f.intValue());
        }
        if (this.f20570c != null && this.f20570c.length > 0) {
            i = b;
            for (zzzg zzzg : this.f20570c) {
                if (zzzg != null) {
                    i += zzyy.m12157b(4, zzzg);
                }
            }
            b = i;
        }
        if (this.f20571d != null && this.f20571d.length > 0) {
            i = b;
            for (zzzg zzzg2 : this.f20571d) {
                if (zzzg2 != null) {
                    i += zzyy.m12157b(5, zzzg2);
                }
            }
            b = i;
        }
        if (this.f20572e != null && this.f20572e.length > 0) {
            for (zzzg zzzg3 : this.f20572e) {
                if (zzzg3 != null) {
                    b += zzyy.m12157b(6, zzzg3);
                }
            }
        }
        return this.f20574g != null ? b + zzyy.m12158b(7, this.f20574g) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20568a = Long.valueOf(zzyx.m12142e());
            } else if (a == 18) {
                this.f20569b = zzyx.m12139c();
            } else if (a == 24) {
                this.f20573f = Integer.valueOf(zzyx.m12140d());
            } else if (a == 34) {
                a = zzzj.m12207a(zzyx, 34);
                r1 = this.f20570c == null ? 0 : this.f20570c.length;
                r0 = new zzgc[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20570c, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new zzgc();
                    zzyx.m12132a(r0[r1]);
                    zzyx.m12129a();
                    r1++;
                }
                r0[r1] = new zzgc();
                zzyx.m12132a(r0[r1]);
                this.f20570c = r0;
            } else if (a == 42) {
                a = zzzj.m12207a(zzyx, 42);
                r1 = this.f20571d == null ? 0 : this.f20571d.length;
                r0 = new zzga[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20571d, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new zzga();
                    zzyx.m12132a(r0[r1]);
                    zzyx.m12129a();
                    r1++;
                }
                r0[r1] = new zzga();
                zzyx.m12132a(r0[r1]);
                this.f20571d = r0;
            } else if (a == 50) {
                a = zzzj.m12207a(zzyx, 50);
                r1 = this.f20572e == null ? 0 : this.f20572e.length;
                r0 = new zzfu[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20572e, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new zzfu();
                    zzyx.m12132a(r0[r1]);
                    zzyx.m12129a();
                    r1++;
                }
                r0[r1] = new zzfu();
                zzyx.m12132a(r0[r1]);
                this.f20572e = r0;
            } else if (a == 58) {
                this.f20574g = zzyx.m12139c();
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
