package com.google.android.gms.internal.ads;

public final class zzbf extends zzbgt<zzbf> {
    /* renamed from: a */
    public byte[] f20060a;
    /* renamed from: b */
    public byte[] f20061b;
    /* renamed from: c */
    public byte[] f20062c;
    /* renamed from: d */
    public byte[] f20063d;

    public zzbf() {
        this.f20060a = null;
        this.f20061b = null;
        this.f20062c = null;
        this.f20063d = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20060a != null) {
            zzbgr.m10433a(1, this.f20060a);
        }
        if (this.f20061b != null) {
            zzbgr.m10433a(2, this.f20061b);
        }
        if (this.f20062c != null) {
            zzbgr.m10433a(3, this.f20062c);
        }
        if (this.f20063d != null) {
            zzbgr.m10433a(4, this.f20063d);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20060a != null) {
            a += zzbgr.m10419b(1, this.f20060a);
        }
        if (this.f20061b != null) {
            a += zzbgr.m10419b(2, this.f20061b);
        }
        if (this.f20062c != null) {
            a += zzbgr.m10419b(3, this.f20062c);
        }
        return this.f20063d != null ? a + zzbgr.m10419b(4, this.f20063d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20060a = zzbgq.m10403f();
            } else if (a == 18) {
                this.f20061b = zzbgq.m10403f();
            } else if (a == 26) {
                this.f20062c = zzbgq.m10403f();
            } else if (a == 34) {
                this.f20063d = zzbgq.m10403f();
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
