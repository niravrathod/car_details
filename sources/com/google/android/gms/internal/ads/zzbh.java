package com.google.android.gms.internal.ads;

public final class zzbh extends zzbgt<zzbh> {
    /* renamed from: a */
    public String f20067a;

    public zzbh() {
        this.f20067a = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20067a != null) {
            zzbgr.m10431a(1, this.f20067a);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        return this.f20067a != null ? a + zzbgr.m10418b(1, this.f20067a) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20067a = zzbgq.m10401e();
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
