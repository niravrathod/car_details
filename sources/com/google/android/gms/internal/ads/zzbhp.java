package com.google.android.gms.internal.ads;

public final class zzbhp extends zzbgt<zzbhp> {
    /* renamed from: c */
    private static volatile zzbhp[] f20087c;
    /* renamed from: a */
    public byte[] f20088a;
    /* renamed from: b */
    public byte[] f20089b;

    /* renamed from: b */
    public static zzbhp[] m26536b() {
        if (f20087c == null) {
            synchronized (zzbgx.f9258b) {
                if (f20087c == null) {
                    f20087c = new zzbhp[0];
                }
            }
        }
        return f20087c;
    }

    public zzbhp() {
        this.f20088a = null;
        this.f20089b = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        zzbgr.m10433a(1, this.f20088a);
        if (this.f20089b != null) {
            zzbgr.m10433a(2, this.f20089b);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a() + zzbgr.m10419b(1, this.f20088a);
        return this.f20089b != null ? a + zzbgr.m10419b(2, this.f20089b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20088a = zzbgq.m10403f();
            } else if (a == 18) {
                this.f20089b = zzbgq.m10403f();
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
