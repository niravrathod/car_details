package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhd.zzb.zze.zzb;

public final class zzbhr extends zzbgt<zzbhr> {
    /* renamed from: a */
    private zzb f20095a;
    /* renamed from: b */
    private zzbhp[] f20096b;
    /* renamed from: c */
    private byte[] f20097c;
    /* renamed from: d */
    private byte[] f20098d;
    /* renamed from: e */
    private Integer f20099e;
    /* renamed from: f */
    private byte[] f20100f;

    public zzbhr() {
        this.f20095a = null;
        this.f20096b = zzbhp.m26536b();
        this.f20097c = null;
        this.f20098d = null;
        this.f20099e = null;
        this.f20100f = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20095a != null) {
            zzbgr.m10429a(1, this.f20095a);
        }
        if (this.f20096b != null && this.f20096b.length > 0) {
            for (zzbgz zzbgz : this.f20096b) {
                if (zzbgz != null) {
                    zzbgr.m10430a(2, zzbgz);
                }
            }
        }
        if (this.f20097c != null) {
            zzbgr.m10433a(3, this.f20097c);
        }
        if (this.f20098d != null) {
            zzbgr.m10433a(4, this.f20098d);
        }
        if (this.f20099e != null) {
            zzbgr.m10427a(5, this.f20099e.intValue());
        }
        if (this.f20100f != null) {
            zzbgr.m10433a(6, this.f20100f);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20095a != null) {
            a += zzbck.m21529c(1, this.f20095a);
        }
        if (this.f20096b != null && this.f20096b.length > 0) {
            for (zzbgz zzbgz : this.f20096b) {
                if (zzbgz != null) {
                    a += zzbgr.m10417b(2, zzbgz);
                }
            }
        }
        if (this.f20097c != null) {
            a += zzbgr.m10419b(3, this.f20097c);
        }
        if (this.f20098d != null) {
            a += zzbgr.m10419b(4, this.f20098d);
        }
        if (this.f20099e != null) {
            a += zzbgr.m10416b(5, this.f20099e.intValue());
        }
        return this.f20100f != null ? a + zzbgr.m10419b(6, this.f20100f) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20095a = (zzb) zzbgq.m10390a(zzb.m29291a());
            } else if (a == 18) {
                a = zzbhc.m10459a(zzbgq, 18);
                int length = this.f20096b == null ? 0 : this.f20096b.length;
                Object obj = new zzbhp[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20096b, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzbhp();
                    zzbgq.m10392a(obj[length]);
                    zzbgq.m10389a();
                    length++;
                }
                obj[length] = new zzbhp();
                zzbgq.m10392a(obj[length]);
                this.f20096b = obj;
            } else if (a == 26) {
                this.f20097c = zzbgq.m10403f();
            } else if (a == 34) {
                this.f20098d = zzbgq.m10403f();
            } else if (a == 40) {
                this.f20099e = Integer.valueOf(zzbgq.m10397c());
            } else if (a == 50) {
                this.f20100f = zzbgq.m10403f();
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
