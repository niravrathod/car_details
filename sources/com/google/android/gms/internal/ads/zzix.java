package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzif.zzd.zzb;

public final class zzix extends zzbgt<zzix> {
    /* renamed from: a */
    private zzb f20163a;
    /* renamed from: b */
    private zziz f20164b;
    /* renamed from: c */
    private String f20165c;
    /* renamed from: d */
    private String f20166d;

    public zzix() {
        this.f20163a = null;
        this.f20164b = null;
        this.f20165c = null;
        this.f20166d = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (!(this.f20163a == null || this.f20163a == null)) {
            zzbgr.m10427a(5, this.f20163a.mo2419a());
        }
        if (this.f20164b != null) {
            zzbgr.m10430a(6, this.f20164b);
        }
        if (this.f20165c != null) {
            zzbgr.m10431a(7, this.f20165c);
        }
        if (this.f20166d != null) {
            zzbgr.m10431a(8, this.f20166d);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (!(this.f20163a == null || this.f20163a == null)) {
            a += zzbgr.m10416b(5, this.f20163a.mo2419a());
        }
        if (this.f20164b != null) {
            a += zzbgr.m10417b(6, this.f20164b);
        }
        if (this.f20165c != null) {
            a += zzbgr.m10418b(7, this.f20165c);
        }
        return this.f20166d != null ? a + zzbgr.m10418b(8, this.f20166d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a != 0) {
                if (a == 40) {
                    int j = zzbgq.m10407j();
                    int g = zzbgq.m10404g();
                    switch (g) {
                        case 0:
                        case 1:
                        case 2:
                            this.f20163a = zzb.m21727a(g);
                            break;
                        default:
                            zzbgq.m10402e(j);
                            m21616a(zzbgq, a);
                            break;
                    }
                } else if (a == 50) {
                    if (this.f20164b == null) {
                        this.f20164b = new zziz();
                    }
                    zzbgq.m10392a(this.f20164b);
                } else if (a == 58) {
                    this.f20165c = zzbgq.m10401e();
                } else if (a == 66) {
                    this.f20166d = zzbgq.m10401e();
                } else if (!super.m21616a(zzbgq, a)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}
