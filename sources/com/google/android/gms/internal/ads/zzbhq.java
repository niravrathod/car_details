package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhd.zzb.zzd.zzb;

public final class zzbhq extends zzbgt<zzbhq> {
    /* renamed from: a */
    public zzbhp[] f20090a;
    /* renamed from: b */
    private zzb f20091b;
    /* renamed from: c */
    private byte[] f20092c;
    /* renamed from: d */
    private byte[] f20093d;
    /* renamed from: e */
    private Integer f20094e;

    public zzbhq() {
        this.f20091b = null;
        this.f20090a = zzbhp.m26536b();
        this.f20092c = null;
        this.f20093d = null;
        this.f20094e = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20091b != null) {
            zzbgr.m10429a(1, this.f20091b);
        }
        if (this.f20090a != null && this.f20090a.length > 0) {
            for (zzbgz zzbgz : this.f20090a) {
                if (zzbgz != null) {
                    zzbgr.m10430a(2, zzbgz);
                }
            }
        }
        if (this.f20092c != null) {
            zzbgr.m10433a(3, this.f20092c);
        }
        if (this.f20093d != null) {
            zzbgr.m10433a(4, this.f20093d);
        }
        if (this.f20094e != null) {
            zzbgr.m10427a(5, this.f20094e.intValue());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20091b != null) {
            a += zzbck.m21529c(1, this.f20091b);
        }
        if (this.f20090a != null && this.f20090a.length > 0) {
            for (zzbgz zzbgz : this.f20090a) {
                if (zzbgz != null) {
                    a += zzbgr.m10417b(2, zzbgz);
                }
            }
        }
        if (this.f20092c != null) {
            a += zzbgr.m10419b(3, this.f20092c);
        }
        if (this.f20093d != null) {
            a += zzbgr.m10419b(4, this.f20093d);
        }
        return this.f20094e != null ? a + zzbgr.m10416b(5, this.f20094e.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20091b = (zzb) zzbgq.m10390a(zzb.m29286a());
            } else if (a == 18) {
                a = zzbhc.m10459a(zzbgq, 18);
                int length = this.f20090a == null ? 0 : this.f20090a.length;
                Object obj = new zzbhp[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20090a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzbhp();
                    zzbgq.m10392a(obj[length]);
                    zzbgq.m10389a();
                    length++;
                }
                obj[length] = new zzbhp();
                zzbgq.m10392a(obj[length]);
                this.f20090a = obj;
            } else if (a == 26) {
                this.f20092c = zzbgq.m10403f();
            } else if (a == 34) {
                this.f20093d = zzbgq.m10403f();
            } else if (a == 40) {
                this.f20094e = Integer.valueOf(zzbgq.m10397c());
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
