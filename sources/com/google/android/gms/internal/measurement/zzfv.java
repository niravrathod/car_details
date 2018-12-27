package com.google.android.gms.internal.measurement;

public final class zzfv extends zzza<zzfv> {
    /* renamed from: g */
    private static volatile zzfv[] f20535g;
    /* renamed from: a */
    public Integer f20536a;
    /* renamed from: b */
    public String f20537b;
    /* renamed from: c */
    public zzfw[] f20538c;
    /* renamed from: d */
    public zzfx f20539d;
    /* renamed from: e */
    public Boolean f20540e;
    /* renamed from: f */
    public Boolean f20541f;
    /* renamed from: h */
    private Boolean f20542h;

    /* renamed from: a */
    public static zzfv[] m27104a() {
        if (f20535g == null) {
            synchronized (zzze.f10362b) {
                if (f20535g == null) {
                    f20535g = new zzfv[0];
                }
            }
        }
        return f20535g;
    }

    public zzfv() {
        this.f20536a = null;
        this.f20537b = null;
        this.f20538c = zzfw.m27108a();
        this.f20542h = null;
        this.f20539d = null;
        this.f20540e = null;
        this.f20541f = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfv)) {
            return false;
        }
        zzfv zzfv = (zzfv) obj;
        if (this.f20536a == null) {
            if (zzfv.f20536a != null) {
                return false;
            }
        } else if (!this.f20536a.equals(zzfv.f20536a)) {
            return false;
        }
        if (this.f20537b == null) {
            if (zzfv.f20537b != null) {
                return false;
            }
        } else if (!this.f20537b.equals(zzfv.f20537b)) {
            return false;
        }
        if (!zzze.m12193a(this.f20538c, zzfv.f20538c)) {
            return false;
        }
        if (this.f20542h == null) {
            if (zzfv.f20542h != null) {
                return false;
            }
        } else if (!this.f20542h.equals(zzfv.f20542h)) {
            return false;
        }
        if (this.f20539d == null) {
            if (zzfv.f20539d != null) {
                return false;
            }
        } else if (!this.f20539d.equals(zzfv.f20539d)) {
            return false;
        }
        if (this.f20540e == null) {
            if (zzfv.f20540e != null) {
                return false;
            }
        } else if (!this.f20540e.equals(zzfv.f20540e)) {
            return false;
        }
        if (this.f20541f == null) {
            if (zzfv.f20541f != null) {
                return false;
            }
        } else if (!this.f20541f.equals(zzfv.f20541f)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzfv.J);
            }
        }
        if (zzfv.J != null) {
            if (zzfv.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20536a == null ? 0 : this.f20536a.hashCode())) * 31) + (this.f20537b == null ? 0 : this.f20537b.hashCode())) * 31) + zzze.m12190a(this.f20538c)) * 31) + (this.f20542h == null ? 0 : this.f20542h.hashCode());
        zzfx zzfx = this.f20539d;
        hashCode *= 31;
        if (zzfx == null) {
            i = 0;
        } else {
            i = zzfx.hashCode();
        }
        hashCode = (((((hashCode + i) * 31) + (this.f20540e == null ? 0 : this.f20540e.hashCode())) * 31) + (this.f20541f == null ? 0 : this.f20541f.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i2 = this.J.hashCode();
            }
        }
        return hashCode + i2;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20536a != null) {
            zzyy.m12167a(1, this.f20536a.intValue());
        }
        if (this.f20537b != null) {
            zzyy.m12171a(2, this.f20537b);
        }
        if (this.f20538c != null && this.f20538c.length > 0) {
            for (zzzg zzzg : this.f20538c) {
                if (zzzg != null) {
                    zzyy.m12170a(3, zzzg);
                }
            }
        }
        if (this.f20542h != null) {
            zzyy.m12172a(4, this.f20542h.booleanValue());
        }
        if (this.f20539d != null) {
            zzyy.m12170a(5, this.f20539d);
        }
        if (this.f20540e != null) {
            zzyy.m12172a(6, this.f20540e.booleanValue());
        }
        if (this.f20541f != null) {
            zzyy.m12172a(7, this.f20541f.booleanValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20536a != null) {
            b += zzyy.m12156b(1, this.f20536a.intValue());
        }
        if (this.f20537b != null) {
            b += zzyy.m12158b(2, this.f20537b);
        }
        if (this.f20538c != null && this.f20538c.length > 0) {
            for (zzzg zzzg : this.f20538c) {
                if (zzzg != null) {
                    b += zzyy.m12157b(3, zzzg);
                }
            }
        }
        if (this.f20542h != null) {
            this.f20542h.booleanValue();
            b += zzyy.m12155b(4) + 1;
        }
        if (this.f20539d != null) {
            b += zzyy.m12157b(5, this.f20539d);
        }
        if (this.f20540e != null) {
            this.f20540e.booleanValue();
            b += zzyy.m12155b(6) + 1;
        }
        if (this.f20541f == null) {
            return b;
        }
        this.f20541f.booleanValue();
        return b + (zzyy.m12155b(7) + 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20536a = Integer.valueOf(zzyx.m12140d());
            } else if (a == 18) {
                this.f20537b = zzyx.m12139c();
            } else if (a == 26) {
                a = zzzj.m12207a(zzyx, 26);
                int length = this.f20538c == null ? 0 : this.f20538c.length;
                Object obj = new zzfw[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20538c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzfw();
                    zzyx.m12132a(obj[length]);
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = new zzfw();
                zzyx.m12132a(obj[length]);
                this.f20538c = obj;
            } else if (a == 32) {
                this.f20542h = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 42) {
                if (this.f20539d == null) {
                    this.f20539d = new zzfx();
                }
                zzyx.m12132a(this.f20539d);
            } else if (a == 48) {
                this.f20540e = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 56) {
                this.f20541f = Boolean.valueOf(zzyx.m12136b());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
