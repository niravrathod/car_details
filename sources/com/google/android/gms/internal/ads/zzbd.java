package com.google.android.gms.internal.ads;

public final class zzbd extends zzbgt<zzbd> {
    /* renamed from: a */
    public Long f20046a;
    /* renamed from: b */
    public Long f20047b;
    /* renamed from: c */
    public Long f20048c;
    /* renamed from: d */
    private Long f20049d;
    /* renamed from: e */
    private Long f20050e;

    public zzbd() {
        this.f20049d = null;
        this.f20050e = null;
        this.f20046a = null;
        this.f20047b = null;
        this.f20048c = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20049d != null) {
            zzbgr.m10434b(1, this.f20049d.longValue());
        }
        if (this.f20050e != null) {
            zzbgr.m10434b(2, this.f20050e.longValue());
        }
        if (this.f20046a != null) {
            zzbgr.m10434b(3, this.f20046a.longValue());
        }
        if (this.f20047b != null) {
            zzbgr.m10434b(4, this.f20047b.longValue());
        }
        if (this.f20048c != null) {
            zzbgr.m10434b(5, this.f20048c.longValue());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20049d != null) {
            a += zzbgr.m10424d(1, this.f20049d.longValue());
        }
        if (this.f20050e != null) {
            a += zzbgr.m10424d(2, this.f20050e.longValue());
        }
        if (this.f20046a != null) {
            a += zzbgr.m10424d(3, this.f20046a.longValue());
        }
        if (this.f20047b != null) {
            a += zzbgr.m10424d(4, this.f20047b.longValue());
        }
        return this.f20048c != null ? a + zzbgr.m10424d(5, this.f20048c.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20049d = Long.valueOf(zzbgq.m10405h());
            } else if (a == 16) {
                this.f20050e = Long.valueOf(zzbgq.m10405h());
            } else if (a == 24) {
                this.f20046a = Long.valueOf(zzbgq.m10405h());
            } else if (a == 32) {
                this.f20047b = Long.valueOf(zzbgq.m10405h());
            } else if (a == 40) {
                this.f20048c = Long.valueOf(zzbgq.m10405h());
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
