package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzif.zzn;
import com.google.android.gms.internal.ads.zzif.zzq;

public final class zzjb extends zzbgt<zzjb> {
    /* renamed from: a */
    private zziz f20197a;
    /* renamed from: b */
    private zzil f20198b;
    /* renamed from: c */
    private zzq f20199c;
    /* renamed from: d */
    private zzn f20200d;

    public zzjb() {
        this.f20197a = null;
        this.f20198b = null;
        this.f20199c = null;
        this.f20200d = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20197a != null) {
            zzbgr.m10430a(1, this.f20197a);
        }
        if (!(this.f20198b == null || this.f20198b == null)) {
            zzbgr.m10427a(2, this.f20198b.mo2419a());
        }
        if (this.f20199c != null) {
            zzbgr.m10429a(3, this.f20199c);
        }
        if (this.f20200d != null) {
            zzbgr.m10429a(4, this.f20200d);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20197a != null) {
            a += zzbgr.m10417b(1, this.f20197a);
        }
        if (!(this.f20198b == null || this.f20198b == null)) {
            a += zzbgr.m10416b(2, this.f20198b.mo2419a());
        }
        if (this.f20199c != null) {
            a += zzbck.m21529c(3, this.f20199c);
        }
        return this.f20200d != null ? a + zzbck.m21529c(4, this.f20200d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f20197a == null) {
                    this.f20197a = new zziz();
                }
                zzbgq.m10392a(this.f20197a);
            } else if (a == 16) {
                int j = zzbgq.m10407j();
                int g = zzbgq.m10404g();
                if (g != 1000) {
                    switch (g) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbgq.m10402e(j);
                            m21616a(zzbgq, a);
                            continue;
                    }
                }
                this.f20198b = zzil.m21739a(g);
            } else if (a == 26) {
                this.f20199c = (zzq) zzbgq.m10390a(zzq.m29348a());
            } else if (a == 34) {
                this.f20200d = (zzn) zzbgq.m10390a(zzn.m29340a());
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
