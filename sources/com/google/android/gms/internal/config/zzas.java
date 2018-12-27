package com.google.android.gms.internal.config;

public final class zzas extends zzbb<zzas> {
    /* renamed from: a */
    public zzav[] f20457a;
    /* renamed from: b */
    public long f20458b;
    /* renamed from: c */
    public byte[][] f20459c;

    public zzas() {
        this.f20457a = zzav.m27044b();
        this.f20458b = 0;
        this.f20459c = zzbk.f9960a;
        this.f = null;
        this.g = -1;
    }

    /* renamed from: a */
    protected final int mo2911a() {
        int i;
        int a = super.mo2911a();
        if (this.f20457a != null && this.f20457a.length > 0) {
            i = a;
            for (zzbh zzbh : this.f20457a) {
                if (zzbh != null) {
                    i += zzaz.m11385b(1, zzbh);
                }
            }
            a = i;
        }
        if (this.f20458b != 0) {
            a += zzaz.m11383b(2) + 8;
        }
        if (this.f20459c == null || this.f20459c.length <= 0) {
            return a;
        }
        i = 0;
        int i2 = 0;
        for (byte[] bArr : this.f20459c) {
            if (bArr != null) {
                i2++;
                i += zzaz.m11387b(bArr);
            }
        }
        return (a + i) + (i2 * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzbh mo4333a(zzay zzay) {
        while (true) {
            int a = zzay.m11368a();
            if (a == 0) {
                return this;
            }
            int length;
            Object obj;
            if (a == 10) {
                a = zzbk.m11423a(zzay, 10);
                length = this.f20457a == null ? 0 : this.f20457a.length;
                obj = new zzav[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20457a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzav();
                    zzay.m11369a(obj[length]);
                    zzay.m11368a();
                    length++;
                }
                obj[length] = new zzav();
                zzay.m11369a(obj[length]);
                this.f20457a = obj;
            } else if (a == 17) {
                this.f20458b = zzay.m11376e();
            } else if (a == 26) {
                a = zzbk.m11423a(zzay, 26);
                length = this.f20459c == null ? 0 : this.f20459c.length;
                obj = new byte[(a + length)][];
                if (length != 0) {
                    System.arraycopy(this.f20459c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = zzay.m11374c();
                    zzay.m11368a();
                    length++;
                }
                obj[length] = zzay.m11374c();
                this.f20459c = obj;
            } else if (!super.m22142a(zzay, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo2912a(zzaz zzaz) {
        if (this.f20457a != null && this.f20457a.length > 0) {
            for (zzbh zzbh : this.f20457a) {
                if (zzbh != null) {
                    zzaz.m11394a(1, zzbh);
                }
            }
        }
        if (this.f20458b != 0) {
            zzaz.m11393a(2, this.f20458b);
        }
        if (this.f20459c != null && this.f20459c.length > 0) {
            for (byte[] bArr : this.f20459c) {
                if (bArr != null) {
                    zzaz.m11396a(3, bArr);
                }
            }
        }
        super.mo2912a(zzaz);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzas = (zzas) obj;
        if (!zzbf.m11411a(this.f20457a, zzas.f20457a) || this.f20458b != zzas.f20458b || !zzbf.m11412a(this.f20459c, zzas.f20459c)) {
            return false;
        }
        if (this.f != null) {
            if (!this.f.m11407b()) {
                return this.f.equals(zzas.f);
            }
        }
        if (zzas.f != null) {
            if (!zzas.f.m11407b()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((getClass().getName().hashCode() + 527) * 31) + zzbf.m11408a(this.f20457a)) * 31) + ((int) (this.f20458b ^ (this.f20458b >>> 32)))) * 31) + zzbf.m11409a(this.f20459c)) * 31;
        if (this.f != null) {
            if (!this.f.m11407b()) {
                hashCode = this.f.hashCode();
                return hashCode2 + hashCode;
            }
        }
        hashCode = 0;
        return hashCode2 + hashCode;
    }
}
