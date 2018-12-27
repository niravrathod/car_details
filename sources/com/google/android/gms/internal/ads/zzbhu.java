package com.google.android.gms.internal.ads;

public final class zzbhu extends zzbgt<zzbhu> {
    /* renamed from: a */
    public String f20114a;
    /* renamed from: b */
    public Long f20115b;
    /* renamed from: c */
    public Boolean f20116c;

    public zzbhu() {
        this.f20114a = null;
        this.f20115b = null;
        this.f20116c = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20114a != null) {
            zzbgr.m10431a(1, this.f20114a);
        }
        if (this.f20115b != null) {
            zzbgr.m10434b(2, this.f20115b.longValue());
        }
        if (this.f20116c != null) {
            zzbgr.m10432a(3, this.f20116c.booleanValue());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20114a != null) {
            a += zzbgr.m10418b(1, this.f20114a);
        }
        if (this.f20115b != null) {
            a += zzbgr.m10424d(2, this.f20115b.longValue());
        }
        if (this.f20116c == null) {
            return a;
        }
        this.f20116c.booleanValue();
        return a + (zzbgr.m10415b(3) + 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20114a = zzbgq.m10401e();
            } else if (a == 16) {
                this.f20115b = Long.valueOf(zzbgq.m10394b());
            } else if (a == 24) {
                this.f20116c = Boolean.valueOf(zzbgq.m10400d());
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
