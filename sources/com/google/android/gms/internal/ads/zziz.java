package com.google.android.gms.internal.ads;

public final class zziz extends zzbgt<zziz> {
    /* renamed from: a */
    public Integer f20177a;
    /* renamed from: b */
    public Integer f20178b;
    /* renamed from: c */
    public Integer f20179c;

    public zziz() {
        this.f20177a = null;
        this.f20178b = null;
        this.f20179c = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20177a != null) {
            zzbgr.m10427a(1, this.f20177a.intValue());
        }
        if (this.f20178b != null) {
            zzbgr.m10427a(2, this.f20178b.intValue());
        }
        if (this.f20179c != null) {
            zzbgr.m10427a(3, this.f20179c.intValue());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20177a != null) {
            a += zzbgr.m10416b(1, this.f20177a.intValue());
        }
        if (this.f20178b != null) {
            a += zzbgr.m10416b(2, this.f20178b.intValue());
        }
        return this.f20179c != null ? a + zzbgr.m10416b(3, this.f20179c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20177a = Integer.valueOf(zzbgq.m10404g());
            } else if (a == 16) {
                this.f20178b = Integer.valueOf(zzbgq.m10404g());
            } else if (a == 24) {
                this.f20179c = Integer.valueOf(zzbgq.m10404g());
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
