package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzif.zzn;

public final class zziw extends zzbgt<zziw> {
    /* renamed from: a */
    public String f20155a;
    /* renamed from: b */
    public zziz f20156b;
    /* renamed from: c */
    private zzn f20157c;
    /* renamed from: d */
    private Integer f20158d;
    /* renamed from: e */
    private Integer f20159e;
    /* renamed from: f */
    private zzil f20160f;
    /* renamed from: g */
    private zzil f20161g;
    /* renamed from: h */
    private zzil f20162h;

    public zziw() {
        this.f20155a = null;
        this.f20157c = null;
        this.f20158d = null;
        this.f20156b = null;
        this.f20159e = null;
        this.f20160f = null;
        this.f20161g = null;
        this.f20162h = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20155a != null) {
            zzbgr.m10431a(1, this.f20155a);
        }
        if (this.f20157c != null) {
            zzbgr.m10429a(2, this.f20157c);
        }
        if (this.f20158d != null) {
            zzbgr.m10427a(3, this.f20158d.intValue());
        }
        if (this.f20156b != null) {
            zzbgr.m10430a(4, this.f20156b);
        }
        if (this.f20159e != null) {
            zzbgr.m10427a(5, this.f20159e.intValue());
        }
        if (!(this.f20160f == null || this.f20160f == null)) {
            zzbgr.m10427a(6, this.f20160f.mo2419a());
        }
        if (!(this.f20161g == null || this.f20161g == null)) {
            zzbgr.m10427a(7, this.f20161g.mo2419a());
        }
        if (!(this.f20162h == null || this.f20162h == null)) {
            zzbgr.m10427a(8, this.f20162h.mo2419a());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20155a != null) {
            a += zzbgr.m10418b(1, this.f20155a);
        }
        if (this.f20157c != null) {
            a += zzbck.m21529c(2, this.f20157c);
        }
        if (this.f20158d != null) {
            a += zzbgr.m10416b(3, this.f20158d.intValue());
        }
        if (this.f20156b != null) {
            a += zzbgr.m10417b(4, this.f20156b);
        }
        if (this.f20159e != null) {
            a += zzbgr.m10416b(5, this.f20159e.intValue());
        }
        if (!(this.f20160f == null || this.f20160f == null)) {
            a += zzbgr.m10416b(6, this.f20160f.mo2419a());
        }
        if (!(this.f20161g == null || this.f20161g == null)) {
            a += zzbgr.m10416b(7, this.f20161g.mo2419a());
        }
        return (this.f20162h == null || this.f20162h == null) ? a : a + zzbgr.m10416b(8, this.f20162h.mo2419a());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20155a = zzbgq.m10401e();
            } else if (a == 18) {
                this.f20157c = (zzn) zzbgq.m10390a(zzn.m29340a());
            } else if (a == 24) {
                this.f20158d = Integer.valueOf(zzbgq.m10404g());
            } else if (a == 34) {
                if (this.f20156b == null) {
                    this.f20156b = new zziz();
                }
                zzbgq.m10392a(this.f20156b);
            } else if (a == 40) {
                this.f20159e = Integer.valueOf(zzbgq.m10404g());
            } else if (a == 48) {
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
                this.f20160f = zzil.m21739a(r3);
            } else if (a == 56) {
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
                this.f20161g = zzil.m21739a(r3);
            } else if (a == 64) {
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
                this.f20162h = zzil.m21739a(r3);
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
