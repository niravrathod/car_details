package com.google.android.gms.internal.ads;

public final class zzbe extends zzbgt<zzbe> {
    /* renamed from: a */
    private Long f20055a;
    /* renamed from: b */
    private Integer f20056b;
    /* renamed from: c */
    private Boolean f20057c;
    /* renamed from: d */
    private int[] f20058d;
    /* renamed from: e */
    private Long f20059e;

    public zzbe() {
        this.f20055a = null;
        this.f20056b = null;
        this.f20057c = null;
        this.f20058d = zzbhc.f9260a;
        this.f20059e = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20055a != null) {
            zzbgr.m10434b(1, this.f20055a.longValue());
        }
        if (this.f20056b != null) {
            zzbgr.m10427a(2, this.f20056b.intValue());
        }
        if (this.f20057c != null) {
            zzbgr.m10432a(3, this.f20057c.booleanValue());
        }
        if (this.f20058d != null && this.f20058d.length > 0) {
            for (int a : this.f20058d) {
                zzbgr.m10427a(4, a);
            }
        }
        if (this.f20059e != null) {
            zzbgr.m10428a(5, this.f20059e.longValue());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20055a != null) {
            a += zzbgr.m10424d(1, this.f20055a.longValue());
        }
        if (this.f20056b != null) {
            a += zzbgr.m10416b(2, this.f20056b.intValue());
        }
        if (this.f20057c != null) {
            this.f20057c.booleanValue();
            a += zzbgr.m10415b(3) + 1;
        }
        if (this.f20058d != null && this.f20058d.length > 0) {
            int i = 0;
            for (int a2 : this.f20058d) {
                i += zzbgr.m10408a(a2);
            }
            a = (a + i) + (this.f20058d.length * 1);
        }
        return this.f20059e != null ? a + zzbgr.m10422c(5, this.f20059e.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        while (true) {
            int a = zzbgq.m10389a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20055a = Long.valueOf(zzbgq.m10405h());
            } else if (a == 16) {
                this.f20056b = Integer.valueOf(zzbgq.m10404g());
            } else if (a == 24) {
                this.f20057c = Boolean.valueOf(zzbgq.m10400d());
            } else if (a == 32) {
                a = zzbhc.m10459a(zzbgq, 32);
                r1 = this.f20058d == null ? 0 : this.f20058d.length;
                Object obj = new int[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20058d, 0, obj, 0, r1);
                }
                while (r1 < obj.length - 1) {
                    obj[r1] = zzbgq.m10404g();
                    zzbgq.m10389a();
                    r1++;
                }
                obj[r1] = zzbgq.m10404g();
                this.f20058d = obj;
            } else if (a == 34) {
                a = zzbgq.m10398c(zzbgq.m10404g());
                r1 = zzbgq.m10407j();
                int i = 0;
                while (zzbgq.m10406i() > 0) {
                    zzbgq.m10404g();
                    i++;
                }
                zzbgq.m10402e(r1);
                r1 = this.f20058d == null ? 0 : this.f20058d.length;
                Object obj2 = new int[(i + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20058d, 0, obj2, 0, r1);
                }
                while (r1 < obj2.length) {
                    obj2[r1] = zzbgq.m10404g();
                    r1++;
                }
                this.f20058d = obj2;
                zzbgq.m10399d(a);
            } else if (a == 40) {
                this.f20059e = Long.valueOf(zzbgq.m10405h());
            } else if (!super.m21616a(zzbgq, a)) {
                return this;
            }
        }
    }
}
