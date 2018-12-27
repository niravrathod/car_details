package com.google.android.gms.internal.config;

public final class zzaw extends zzbb<zzaw> {
    /* renamed from: a */
    public zzas f20469a;
    /* renamed from: b */
    public zzas f20470b;
    /* renamed from: c */
    public zzas f20471c;
    /* renamed from: d */
    public zzau f20472d;
    /* renamed from: e */
    public zzax[] f20473e;

    public zzaw() {
        this.f20469a = null;
        this.f20470b = null;
        this.f20471c = null;
        this.f20472d = null;
        this.f20473e = zzax.m27051b();
        this.f = null;
        this.g = -1;
    }

    /* renamed from: a */
    protected final int mo2911a() {
        int a = super.mo2911a();
        if (this.f20469a != null) {
            a += zzaz.m11385b(1, this.f20469a);
        }
        if (this.f20470b != null) {
            a += zzaz.m11385b(2, this.f20470b);
        }
        if (this.f20471c != null) {
            a += zzaz.m11385b(3, this.f20471c);
        }
        if (this.f20472d != null) {
            a += zzaz.m11385b(4, this.f20472d);
        }
        if (this.f20473e != null && this.f20473e.length > 0) {
            for (zzbh zzbh : this.f20473e) {
                if (zzbh != null) {
                    a += zzaz.m11385b(5, zzbh);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbh mo4333a(zzay zzay) {
        while (true) {
            int a = zzay.m11368a();
            if (a == 0) {
                return this;
            }
            zzbh zzbh;
            if (a == 10) {
                if (this.f20469a == null) {
                    this.f20469a = new zzas();
                }
                zzbh = this.f20469a;
            } else if (a == 18) {
                if (this.f20470b == null) {
                    this.f20470b = new zzas();
                }
                zzbh = this.f20470b;
            } else if (a == 26) {
                if (this.f20471c == null) {
                    this.f20471c = new zzas();
                }
                zzbh = this.f20471c;
            } else if (a == 34) {
                if (this.f20472d == null) {
                    this.f20472d = new zzau();
                }
                zzbh = this.f20472d;
            } else if (a == 42) {
                a = zzbk.m11423a(zzay, 42);
                int length = this.f20473e == null ? 0 : this.f20473e.length;
                Object obj = new zzax[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20473e, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzax();
                    zzay.m11369a(obj[length]);
                    zzay.m11368a();
                    length++;
                }
                obj[length] = new zzax();
                zzay.m11369a(obj[length]);
                this.f20473e = obj;
            } else if (!super.m22142a(zzay, a)) {
                return this;
            }
            zzay.m11369a(zzbh);
        }
    }

    /* renamed from: a */
    public final void mo2912a(zzaz zzaz) {
        if (this.f20469a != null) {
            zzaz.m11394a(1, this.f20469a);
        }
        if (this.f20470b != null) {
            zzaz.m11394a(2, this.f20470b);
        }
        if (this.f20471c != null) {
            zzaz.m11394a(3, this.f20471c);
        }
        if (this.f20472d != null) {
            zzaz.m11394a(4, this.f20472d);
        }
        if (this.f20473e != null && this.f20473e.length > 0) {
            for (zzbh zzbh : this.f20473e) {
                if (zzbh != null) {
                    zzaz.m11394a(5, zzbh);
                }
            }
        }
        super.mo2912a(zzaz);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzaw = (zzaw) obj;
        if (this.f20469a == null) {
            if (zzaw.f20469a != null) {
                return false;
            }
        } else if (!this.f20469a.equals(zzaw.f20469a)) {
            return false;
        }
        if (this.f20470b == null) {
            if (zzaw.f20470b != null) {
                return false;
            }
        } else if (!this.f20470b.equals(zzaw.f20470b)) {
            return false;
        }
        if (this.f20471c == null) {
            if (zzaw.f20471c != null) {
                return false;
            }
        } else if (!this.f20471c.equals(zzaw.f20471c)) {
            return false;
        }
        if (this.f20472d == null) {
            if (zzaw.f20472d != null) {
                return false;
            }
        } else if (!this.f20472d.equals(zzaw.f20472d)) {
            return false;
        }
        if (!zzbf.m11411a(this.f20473e, zzaw.f20473e)) {
            return false;
        }
        if (this.f != null) {
            if (!this.f.m11407b()) {
                return this.f.equals(zzaw.f);
            }
        }
        if (zzaw.f != null) {
            if (!zzaw.f.m11407b()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        zzas zzas = this.f20469a;
        int i = 0;
        hashCode = (hashCode * 31) + (zzas == null ? 0 : zzas.hashCode());
        zzas = this.f20470b;
        hashCode = (hashCode * 31) + (zzas == null ? 0 : zzas.hashCode());
        zzas = this.f20471c;
        hashCode = (hashCode * 31) + (zzas == null ? 0 : zzas.hashCode());
        zzau zzau = this.f20472d;
        hashCode = ((((hashCode * 31) + (zzau == null ? 0 : zzau.hashCode())) * 31) + zzbf.m11408a(this.f20473e)) * 31;
        if (this.f != null) {
            if (!this.f.m11407b()) {
                i = this.f.hashCode();
            }
        }
        return hashCode + i;
    }
}
