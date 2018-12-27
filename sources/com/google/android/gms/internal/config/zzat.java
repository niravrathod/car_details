package com.google.android.gms.internal.config;

import java.util.Arrays;

public final class zzat extends zzbb<zzat> {
    /* renamed from: c */
    private static volatile zzat[] f20460c;
    /* renamed from: a */
    public String f20461a;
    /* renamed from: b */
    public byte[] f20462b;

    public zzat() {
        this.f20461a = "";
        this.f20462b = zzbk.f9961b;
        this.f = null;
        this.g = -1;
    }

    /* renamed from: b */
    public static zzat[] m27037b() {
        if (f20460c == null) {
            synchronized (zzbf.f9957b) {
                if (f20460c == null) {
                    f20460c = new zzat[0];
                }
            }
        }
        return f20460c;
    }

    /* renamed from: a */
    protected final int mo2911a() {
        int a = super.mo2911a();
        if (!(this.f20461a == null || this.f20461a.equals(""))) {
            a += zzaz.m11386b(1, this.f20461a);
        }
        if (Arrays.equals(this.f20462b, zzbk.f9961b)) {
            return a;
        }
        return a + (zzaz.m11383b(2) + zzaz.m11387b(this.f20462b));
    }

    /* renamed from: a */
    public final /* synthetic */ zzbh mo4333a(zzay zzay) {
        while (true) {
            int a = zzay.m11368a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20461a = zzay.m11372b();
            } else if (a == 18) {
                this.f20462b = zzay.m11374c();
            } else if (!super.m22142a(zzay, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo2912a(zzaz zzaz) {
        if (!(this.f20461a == null || this.f20461a.equals(""))) {
            zzaz.m11395a(1, this.f20461a);
        }
        if (!Arrays.equals(this.f20462b, zzbk.f9961b)) {
            zzaz.m11396a(2, this.f20462b);
        }
        super.mo2912a(zzaz);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzat = (zzat) obj;
        if (this.f20461a == null) {
            if (zzat.f20461a != null) {
                return false;
            }
        } else if (!this.f20461a.equals(zzat.f20461a)) {
            return false;
        }
        if (!Arrays.equals(this.f20462b, zzat.f20462b)) {
            return false;
        }
        if (this.f != null) {
            if (!this.f.m11407b()) {
                return this.f.equals(zzat.f);
            }
        }
        if (zzat.f != null) {
            if (!zzat.f.m11407b()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f20461a == null ? 0 : this.f20461a.hashCode())) * 31) + Arrays.hashCode(this.f20462b)) * 31;
        if (this.f != null) {
            if (!this.f.m11407b()) {
                i = this.f.hashCode();
            }
        }
        return hashCode + i;
    }
}
