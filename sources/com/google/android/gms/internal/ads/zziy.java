package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzif.zzh;

public final class zziy extends zzbgt<zziy> {
    /* renamed from: a */
    public String f20167a;
    /* renamed from: b */
    public long[] f20168b;
    /* renamed from: c */
    public zziw f20169c;
    /* renamed from: d */
    public zziu f20170d;
    /* renamed from: e */
    private Integer f20171e;
    /* renamed from: f */
    private Integer f20172f;
    /* renamed from: g */
    private zzil f20173g;
    /* renamed from: h */
    private zziz f20174h;
    /* renamed from: i */
    private zzix f20175i;
    /* renamed from: j */
    private zzh f20176j;

    public zziy() {
        this.f20171e = null;
        this.f20167a = null;
        this.f20172f = null;
        this.f20173g = null;
        this.f20174h = null;
        this.f20168b = zzbhc.f9261b;
        this.f20169c = null;
        this.f20175i = null;
        this.f20176j = null;
        this.f20170d = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20171e != null) {
            zzbgr.m10427a(9, this.f20171e.intValue());
        }
        if (this.f20167a != null) {
            zzbgr.m10431a(10, this.f20167a);
        }
        int i = 0;
        if (this.f20172f != null) {
            int intValue = this.f20172f.intValue();
            zzbgr.m10436c(11, 0);
            zzbgr.m10435c(intValue);
        }
        if (!(this.f20173g == null || this.f20173g == null)) {
            zzbgr.m10427a(12, this.f20173g.mo2419a());
        }
        if (this.f20174h != null) {
            zzbgr.m10430a(13, this.f20174h);
        }
        if (this.f20168b != null && this.f20168b.length > 0) {
            while (i < this.f20168b.length) {
                zzbgr.m10428a(14, this.f20168b[i]);
                i++;
            }
        }
        if (this.f20169c != null) {
            zzbgr.m10430a(15, this.f20169c);
        }
        if (this.f20175i != null) {
            zzbgr.m10430a(16, this.f20175i);
        }
        if (this.f20176j != null) {
            zzbgr.m10429a(17, this.f20176j);
        }
        if (this.f20170d != null) {
            zzbgr.m10430a(18, this.f20170d);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20171e != null) {
            a += zzbgr.m10416b(9, this.f20171e.intValue());
        }
        if (this.f20167a != null) {
            a += zzbgr.m10418b(10, this.f20167a);
        }
        if (this.f20172f != null) {
            a += zzbgr.m10415b(11) + zzbgr.m10423d(this.f20172f.intValue());
        }
        if (!(this.f20173g == null || this.f20173g == null)) {
            a += zzbgr.m10416b(12, this.f20173g.mo2419a());
        }
        if (this.f20174h != null) {
            a += zzbgr.m10417b(13, this.f20174h);
        }
        if (this.f20168b != null && this.f20168b.length > 0) {
            int i = 0;
            for (long a2 : this.f20168b) {
                i += zzbgr.m10409a(a2);
            }
            a = (a + i) + (this.f20168b.length * 1);
        }
        if (this.f20169c != null) {
            a += zzbgr.m10417b(15, this.f20169c);
        }
        if (this.f20175i != null) {
            a += zzbgr.m10417b(16, this.f20175i);
        }
        if (this.f20176j != null) {
            a += zzbck.m21529c(17, this.f20176j);
        }
        return this.f20170d != null ? a + zzbgr.m10417b(18, this.f20170d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            int g;
            switch (a) {
                case 0:
                    return this;
                case 72:
                    this.f20171e = Integer.valueOf(zzbgq.m10404g());
                    break;
                case 82:
                    this.f20167a = zzbgq.m10401e();
                    break;
                case 88:
                    this.f20172f = Integer.valueOf(zzbgq.m10404g());
                    break;
                case 96:
                    int j = zzbgq.m10407j();
                    g = zzbgq.m10404g();
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
                    this.f20173g = zzil.m21739a(g);
                    break;
                case 106:
                    if (this.f20174h == null) {
                        this.f20174h = new zziz();
                    }
                    zzbgq.m10392a(this.f20174h);
                    break;
                case 112:
                    a = zzbhc.m10459a(zzbgq, 112);
                    g = this.f20168b == null ? 0 : this.f20168b.length;
                    Object obj = new long[(a + g)];
                    if (g != 0) {
                        System.arraycopy(this.f20168b, 0, obj, 0, g);
                    }
                    while (g < obj.length - 1) {
                        obj[g] = zzbgq.m10405h();
                        zzbgq.m10389a();
                        g++;
                    }
                    obj[g] = zzbgq.m10405h();
                    this.f20168b = obj;
                    break;
                case 114:
                    a = zzbgq.m10398c(zzbgq.m10404g());
                    g = zzbgq.m10407j();
                    int i = 0;
                    while (zzbgq.m10406i() > 0) {
                        zzbgq.m10405h();
                        i++;
                    }
                    zzbgq.m10402e(g);
                    g = this.f20168b == null ? 0 : this.f20168b.length;
                    Object obj2 = new long[(i + g)];
                    if (g != 0) {
                        System.arraycopy(this.f20168b, 0, obj2, 0, g);
                    }
                    while (g < obj2.length) {
                        obj2[g] = zzbgq.m10405h();
                        g++;
                    }
                    this.f20168b = obj2;
                    zzbgq.m10399d(a);
                    break;
                case 122:
                    if (this.f20169c == null) {
                        this.f20169c = new zziw();
                    }
                    zzbgq.m10392a(this.f20169c);
                    break;
                case 130:
                    if (this.f20175i == null) {
                        this.f20175i = new zzix();
                    }
                    zzbgq.m10392a(this.f20175i);
                    break;
                case 138:
                    this.f20176j = (zzh) zzbgq.m10390a(zzh.m29325a());
                    break;
                case 146:
                    if (this.f20170d == null) {
                        this.f20170d = new zziu();
                    }
                    zzbgq.m10392a(this.f20170d);
                    break;
                default:
                    if (super.m21616a(zzbgq, a)) {
                        break;
                    }
                    return this;
            }
        }
    }
}
