package com.google.android.gms.internal.ads;

public final class zzbg extends zzbgt<zzbg> {
    /* renamed from: a */
    public Long f20064a;
    /* renamed from: b */
    private String f20065b;
    /* renamed from: c */
    private byte[] f20066c;

    public zzbg() {
        this.f20064a = null;
        this.f20065b = null;
        this.f20066c = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20064a != null) {
            zzbgr.m10434b(1, this.f20064a.longValue());
        }
        if (this.f20065b != null) {
            zzbgr.m10431a(3, this.f20065b);
        }
        if (this.f20066c != null) {
            zzbgr.m10433a(4, this.f20066c);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20064a != null) {
            a += zzbgr.m10424d(1, this.f20064a.longValue());
        }
        if (this.f20065b != null) {
            a += zzbgr.m10418b(3, this.f20065b);
        }
        return this.f20066c != null ? a + zzbgr.m10419b(4, this.f20066c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20064a = Long.valueOf(zzbgq.m10405h());
            } else if (a == 26) {
                this.f20065b = zzbgq.m10401e();
            } else if (a == 34) {
                this.f20066c = zzbgq.m10403f();
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
