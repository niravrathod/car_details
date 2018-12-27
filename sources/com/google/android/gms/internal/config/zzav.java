package com.google.android.gms.internal.config;

public final class zzav extends zzbb<zzav> {
    /* renamed from: c */
    private static volatile zzav[] f20466c;
    /* renamed from: a */
    public String f20467a;
    /* renamed from: b */
    public zzat[] f20468b;

    public zzav() {
        this.f20467a = "";
        this.f20468b = zzat.m27037b();
        this.f = null;
        this.g = -1;
    }

    /* renamed from: b */
    public static zzav[] m27044b() {
        if (f20466c == null) {
            synchronized (zzbf.f9957b) {
                if (f20466c == null) {
                    f20466c = new zzav[0];
                }
            }
        }
        return f20466c;
    }

    /* renamed from: a */
    protected final int mo2911a() {
        int a = super.mo2911a();
        if (!(this.f20467a == null || this.f20467a.equals(""))) {
            a += zzaz.m11386b(1, this.f20467a);
        }
        if (this.f20468b != null && this.f20468b.length > 0) {
            for (zzbh zzbh : this.f20468b) {
                if (zzbh != null) {
                    a += zzaz.m11385b(2, zzbh);
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
            if (a == 10) {
                this.f20467a = zzay.m11372b();
            } else if (a == 18) {
                a = zzbk.m11423a(zzay, 18);
                int length = this.f20468b == null ? 0 : this.f20468b.length;
                Object obj = new zzat[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20468b, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzat();
                    zzay.m11369a(obj[length]);
                    zzay.m11368a();
                    length++;
                }
                obj[length] = new zzat();
                zzay.m11369a(obj[length]);
                this.f20468b = obj;
            } else if (!super.m22142a(zzay, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo2912a(zzaz zzaz) {
        if (!(this.f20467a == null || this.f20467a.equals(""))) {
            zzaz.m11395a(1, this.f20467a);
        }
        if (this.f20468b != null && this.f20468b.length > 0) {
            for (zzbh zzbh : this.f20468b) {
                if (zzbh != null) {
                    zzaz.m11394a(2, zzbh);
                }
            }
        }
        super.mo2912a(zzaz);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzav = (zzav) obj;
        if (this.f20467a == null) {
            if (zzav.f20467a != null) {
                return false;
            }
        } else if (!this.f20467a.equals(zzav.f20467a)) {
            return false;
        }
        if (!zzbf.m11411a(this.f20468b, zzav.f20468b)) {
            return false;
        }
        if (this.f != null) {
            if (!this.f.m11407b()) {
                return this.f.equals(zzav.f);
            }
        }
        if (zzav.f != null) {
            if (!zzav.f.m11407b()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f20467a == null ? 0 : this.f20467a.hashCode())) * 31) + zzbf.m11408a(this.f20468b)) * 31;
        if (this.f != null) {
            if (!this.f.m11407b()) {
                i = this.f.hashCode();
            }
        }
        return hashCode + i;
    }
}
