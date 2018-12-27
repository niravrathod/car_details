package com.google.android.gms.internal.ads;

public final class zzax extends zzbgt<zzax> {
    /* renamed from: a */
    public String f19943a;
    /* renamed from: b */
    public Long f19944b;
    /* renamed from: c */
    private String f19945c;
    /* renamed from: d */
    private String f19946d;
    /* renamed from: e */
    private String f19947e;
    /* renamed from: f */
    private Long f19948f;
    /* renamed from: g */
    private Long f19949g;
    /* renamed from: h */
    private String f19950h;
    /* renamed from: i */
    private Long f19951i;
    /* renamed from: j */
    private String f19952j;

    public zzax() {
        this.f19943a = null;
        this.f19944b = null;
        this.f19945c = null;
        this.f19946d = null;
        this.f19947e = null;
        this.f19948f = null;
        this.f19949g = null;
        this.f19950h = null;
        this.f19951i = null;
        this.f19952j = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f19943a != null) {
            zzbgr.m10431a(1, this.f19943a);
        }
        if (this.f19944b != null) {
            zzbgr.m10434b(2, this.f19944b.longValue());
        }
        if (this.f19945c != null) {
            zzbgr.m10431a(3, this.f19945c);
        }
        if (this.f19946d != null) {
            zzbgr.m10431a(4, this.f19946d);
        }
        if (this.f19947e != null) {
            zzbgr.m10431a(5, this.f19947e);
        }
        if (this.f19948f != null) {
            zzbgr.m10434b(6, this.f19948f.longValue());
        }
        if (this.f19949g != null) {
            zzbgr.m10434b(7, this.f19949g.longValue());
        }
        if (this.f19950h != null) {
            zzbgr.m10431a(8, this.f19950h);
        }
        if (this.f19951i != null) {
            zzbgr.m10434b(9, this.f19951i.longValue());
        }
        if (this.f19952j != null) {
            zzbgr.m10431a(10, this.f19952j);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f19943a != null) {
            a += zzbgr.m10418b(1, this.f19943a);
        }
        if (this.f19944b != null) {
            a += zzbgr.m10424d(2, this.f19944b.longValue());
        }
        if (this.f19945c != null) {
            a += zzbgr.m10418b(3, this.f19945c);
        }
        if (this.f19946d != null) {
            a += zzbgr.m10418b(4, this.f19946d);
        }
        if (this.f19947e != null) {
            a += zzbgr.m10418b(5, this.f19947e);
        }
        if (this.f19948f != null) {
            a += zzbgr.m10424d(6, this.f19948f.longValue());
        }
        if (this.f19949g != null) {
            a += zzbgr.m10424d(7, this.f19949g.longValue());
        }
        if (this.f19950h != null) {
            a += zzbgr.m10418b(8, this.f19950h);
        }
        if (this.f19951i != null) {
            a += zzbgr.m10424d(9, this.f19951i.longValue());
        }
        return this.f19952j != null ? a + zzbgr.m10418b(10, this.f19952j) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.f19943a = zzbgq.m10401e();
                    break;
                case 16:
                    this.f19944b = Long.valueOf(zzbgq.m10405h());
                    break;
                case 26:
                    this.f19945c = zzbgq.m10401e();
                    break;
                case 34:
                    this.f19946d = zzbgq.m10401e();
                    break;
                case 42:
                    this.f19947e = zzbgq.m10401e();
                    break;
                case 48:
                    this.f19948f = Long.valueOf(zzbgq.m10405h());
                    break;
                case 56:
                    this.f19949g = Long.valueOf(zzbgq.m10405h());
                    break;
                case 66:
                    this.f19950h = zzbgq.m10401e();
                    break;
                case 72:
                    this.f19951i = Long.valueOf(zzbgq.m10405h());
                    break;
                case 82:
                    this.f19952j = zzbgq.m10401e();
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
