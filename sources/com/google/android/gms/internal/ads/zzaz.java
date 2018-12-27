package com.google.android.gms.internal.ads;

public final class zzaz extends zzbgt<zzaz> {
    /* renamed from: a */
    public String f19953a;
    /* renamed from: b */
    public String f19954b;
    /* renamed from: c */
    private String f19955c;
    /* renamed from: d */
    private String f19956d;
    /* renamed from: e */
    private String f19957e;
    /* renamed from: f */
    private String f19958f;

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f19953a != null) {
            zzbgr.m10431a(1, this.f19953a);
        }
        if (this.f19955c != null) {
            zzbgr.m10431a(2, this.f19955c);
        }
        if (this.f19956d != null) {
            zzbgr.m10431a(3, this.f19956d);
        }
        if (this.f19957e != null) {
            zzbgr.m10431a(4, this.f19957e);
        }
        if (this.f19958f != null) {
            zzbgr.m10431a(5, this.f19958f);
        }
        if (this.f19954b != null) {
            zzbgr.m10431a(6, this.f19954b);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f19953a != null) {
            a += zzbgr.m10418b(1, this.f19953a);
        }
        if (this.f19955c != null) {
            a += zzbgr.m10418b(2, this.f19955c);
        }
        if (this.f19956d != null) {
            a += zzbgr.m10418b(3, this.f19956d);
        }
        if (this.f19957e != null) {
            a += zzbgr.m10418b(4, this.f19957e);
        }
        if (this.f19958f != null) {
            a += zzbgr.m10418b(5, this.f19958f);
        }
        return this.f19954b != null ? a + zzbgr.m10418b(6, this.f19954b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f19953a = zzbgq.m10401e();
            } else if (a == 18) {
                this.f19955c = zzbgq.m10401e();
            } else if (a == 26) {
                this.f19956d = zzbgq.m10401e();
            } else if (a == 34) {
                this.f19957e = zzbgq.m10401e();
            } else if (a == 42) {
                this.f19958f = zzbgq.m10401e();
            } else if (a == 50) {
                this.f19954b = zzbgq.m10401e();
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
