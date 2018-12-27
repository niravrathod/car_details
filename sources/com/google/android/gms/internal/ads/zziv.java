package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzif.zza;

public final class zziv extends zzbgt<zziv> {
    /* renamed from: a */
    public String f20150a;
    /* renamed from: b */
    private zza[] f20151b;
    /* renamed from: c */
    private zzil f20152c;
    /* renamed from: d */
    private zzil f20153d;
    /* renamed from: e */
    private zzil f20154e;

    public zziv() {
        this.f20150a = null;
        this.f20151b = new zza[0];
        this.f20152c = null;
        this.f20153d = null;
        this.f20154e = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20150a != null) {
            zzbgr.m10431a(1, this.f20150a);
        }
        if (this.f20151b != null && this.f20151b.length > 0) {
            for (zzbel zzbel : this.f20151b) {
                if (zzbel != null) {
                    zzbgr.m10429a(2, zzbel);
                }
            }
        }
        if (!(this.f20152c == null || this.f20152c == null)) {
            zzbgr.m10427a(3, this.f20152c.mo2419a());
        }
        if (!(this.f20153d == null || this.f20153d == null)) {
            zzbgr.m10427a(4, this.f20153d.mo2419a());
        }
        if (!(this.f20154e == null || this.f20154e == null)) {
            zzbgr.m10427a(5, this.f20154e.mo2419a());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20150a != null) {
            a += zzbgr.m10418b(1, this.f20150a);
        }
        if (this.f20151b != null && this.f20151b.length > 0) {
            for (zzbel zzbel : this.f20151b) {
                if (zzbel != null) {
                    a += zzbck.m21529c(2, zzbel);
                }
            }
        }
        if (!(this.f20152c == null || this.f20152c == null)) {
            a += zzbgr.m10416b(3, this.f20152c.mo2419a());
        }
        if (!(this.f20153d == null || this.f20153d == null)) {
            a += zzbgr.m10416b(4, this.f20153d.mo2419a());
        }
        return (this.f20154e == null || this.f20154e == null) ? a : a + zzbgr.m10416b(5, this.f20154e.mo2419a());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20150a = zzbgq.m10401e();
            } else if (a == 18) {
                a = zzbhc.m10459a(zzbgq, 18);
                r1 = this.f20151b == null ? 0 : this.f20151b.length;
                Object obj = new zza[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20151b, 0, obj, 0, r1);
                }
                while (r1 < obj.length - 1) {
                    obj[r1] = (zza) zzbgq.m10390a(zza.m29306a());
                    zzbgq.m10389a();
                    r1++;
                }
                obj[r1] = (zza) zzbgq.m10390a(zza.m29306a());
                this.f20151b = obj;
            } else if (a == 24) {
                r1 = zzbgq.m10407j();
                r3 = zzbgq.m10404g();
                if (r3 != 1000) {
                    switch (r3) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbgq.m10402e(r1);
                            m21616a(zzbgq, a);
                            continue;
                    }
                }
                this.f20152c = zzil.m21739a(r3);
            } else if (a == 32) {
                r1 = zzbgq.m10407j();
                r3 = zzbgq.m10404g();
                if (r3 != 1000) {
                    switch (r3) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbgq.m10402e(r1);
                            m21616a(zzbgq, a);
                            continue;
                    }
                }
                this.f20153d = zzil.m21739a(r3);
            } else if (a == 40) {
                r1 = zzbgq.m10407j();
                r3 = zzbgq.m10404g();
                if (r3 != 1000) {
                    switch (r3) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbgq.m10402e(r1);
                            m21616a(zzbgq, a);
                            continue;
                    }
                }
                this.f20154e = zzil.m21739a(r3);
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
