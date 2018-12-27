package com.google.android.gms.internal.ads;

public abstract class zzbgt<M extends zzbgt<M>> extends zzbgz {
    /* renamed from: Z */
    protected zzbgv f17082Z;

    /* renamed from: a */
    protected int mo2428a() {
        if (this.f17082Z == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f17082Z.m10440a(); i2++) {
            i += this.f17082Z.m10443b(i2).m9342a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo2429a(zzbgr zzbgr) {
        if (this.f17082Z != null) {
            for (int i = 0; i < this.f17082Z.m10440a(); i++) {
                this.f17082Z.m10443b(i).m9344a(zzbgr);
            }
        }
    }

    /* renamed from: a */
    protected final boolean m21616a(zzbgq zzbgq, int i) {
        int j = zzbgq.m10407j();
        if (!zzbgq.m10396b(i)) {
            return null;
        }
        int i2 = i >>> 3;
        nq nqVar = new nq(i, zzbgq.m10393a(j, zzbgq.m10407j() - j));
        zzbgq = null;
        if (this.f17082Z == 0) {
            this.f17082Z = new zzbgv();
        } else {
            zzbgq = this.f17082Z.m10441a(i2);
        }
        if (zzbgq == null) {
            zzbgq = new np();
            this.f17082Z.m10442a(i2, zzbgq);
        }
        zzbgq.m9343a(nqVar);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ zzbgz mo2430c() {
        return (zzbgt) clone();
    }

    public /* synthetic */ Object clone() {
        zzbgt zzbgt = (zzbgt) super.mo2430c();
        zzbgx.m10444a(this, zzbgt);
        return zzbgt;
    }
}
