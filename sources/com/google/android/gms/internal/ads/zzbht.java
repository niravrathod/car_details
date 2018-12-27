package com.google.android.gms.internal.ads;

public final class zzbht extends zzbgt<zzbht> {
    /* renamed from: f */
    private static volatile zzbht[] f20104f;
    /* renamed from: a */
    public Integer f20105a;
    /* renamed from: b */
    public String f20106b;
    /* renamed from: c */
    public zzbhq f20107c;
    /* renamed from: d */
    public Integer f20108d;
    /* renamed from: e */
    public String[] f20109e;
    /* renamed from: g */
    private zzbhr f20110g;
    /* renamed from: h */
    private Integer f20111h;
    /* renamed from: i */
    private int[] f20112i;
    /* renamed from: j */
    private String f20113j;

    /* renamed from: b */
    public static zzbht[] m26551b() {
        if (f20104f == null) {
            synchronized (zzbgx.f9258b) {
                if (f20104f == null) {
                    f20104f = new zzbht[0];
                }
            }
        }
        return f20104f;
    }

    public zzbht() {
        this.f20105a = null;
        this.f20106b = null;
        this.f20107c = null;
        this.f20110g = null;
        this.f20111h = null;
        this.f20112i = zzbhc.f9260a;
        this.f20113j = null;
        this.f20108d = null;
        this.f20109e = zzbhc.f9262c;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        zzbgr.m10427a(1, this.f20105a.intValue());
        if (this.f20106b != null) {
            zzbgr.m10431a(2, this.f20106b);
        }
        if (this.f20107c != null) {
            zzbgr.m10430a(3, this.f20107c);
        }
        if (this.f20110g != null) {
            zzbgr.m10430a(4, this.f20110g);
        }
        if (this.f20111h != null) {
            zzbgr.m10427a(5, this.f20111h.intValue());
        }
        if (this.f20112i != null && this.f20112i.length > 0) {
            for (int a : this.f20112i) {
                zzbgr.m10427a(6, a);
            }
        }
        if (this.f20113j != null) {
            zzbgr.m10431a(7, this.f20113j);
        }
        if (this.f20108d != null) {
            zzbgr.m10427a(8, this.f20108d.intValue());
        }
        if (this.f20109e != null && this.f20109e.length > 0) {
            for (String str : this.f20109e) {
                if (str != null) {
                    zzbgr.m10431a(9, str);
                }
            }
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int i;
        int i2;
        int a = super.mo2428a() + zzbgr.m10416b(1, this.f20105a.intValue());
        if (this.f20106b != null) {
            a += zzbgr.m10418b(2, this.f20106b);
        }
        if (this.f20107c != null) {
            a += zzbgr.m10417b(3, this.f20107c);
        }
        if (this.f20110g != null) {
            a += zzbgr.m10417b(4, this.f20110g);
        }
        if (this.f20111h != null) {
            a += zzbgr.m10416b(5, this.f20111h.intValue());
        }
        if (this.f20112i != null && this.f20112i.length > 0) {
            i = 0;
            for (int a2 : this.f20112i) {
                i += zzbgr.m10408a(a2);
            }
            a = (a + i) + (this.f20112i.length * 1);
        }
        if (this.f20113j != null) {
            a += zzbgr.m10418b(7, this.f20113j);
        }
        if (this.f20108d != null) {
            a += zzbgr.m10416b(8, this.f20108d.intValue());
        }
        if (this.f20109e == null || this.f20109e.length <= 0) {
            return a;
        }
        i2 = 0;
        i = 0;
        for (String str : this.f20109e) {
            if (str != null) {
                i++;
                i2 += zzbgr.m10411a(str);
            }
        }
        return (a + i2) + (i * 1);
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zzbht m26550b(com.google.android.gms.internal.ads.zzbgq r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m10389a();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x0137;
            case 8: goto L_0x012b;
            case 18: goto L_0x0123;
            case 26: goto L_0x0111;
            case 34: goto L_0x00ff;
            case 40: goto L_0x00f3;
            case 48: goto L_0x00bf;
            case 50: goto L_0x007d;
            case 58: goto L_0x0076;
            case 64: goto L_0x0042;
            case 74: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m21616a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = 74;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20109e;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r2 = 0;
        goto L_0x001e;
    L_0x001b:
        r2 = r6.f20109e;
        r2 = r2.length;
    L_0x001e:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r6.f20109e;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0028:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0039;
    L_0x002d:
        r1 = r7.m10401e();
        r0[r2] = r1;
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x0028;
    L_0x0039:
        r1 = r7.m10401e();
        r0[r2] = r1;
        r6.f20109e = r0;
        goto L_0x0000;
    L_0x0042:
        r1 = r7.m10407j();
        r2 = r7.m10397c();	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r2 < 0) goto L_0x0056;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x004c:
        r3 = 3;	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r2 > r3) goto L_0x0056;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x004f:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        r6.f20108d = r2;	 Catch:{ IllegalArgumentException -> 0x006f }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0056:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006f }
        r4 = 46;	 Catch:{ IllegalArgumentException -> 0x006f }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x006f }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = " is not a valid enum AdResourceType";	 Catch:{ IllegalArgumentException -> 0x006f }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x006f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r7.m10402e(r1);
        r6.m21616a(r7, r0);
        goto L_0x0000;
    L_0x0076:
        r0 = r7.m10401e();
        r6.f20113j = r0;
        goto L_0x0000;
    L_0x007d:
        r0 = r7.m10404g();
        r0 = r7.m10398c(r0);
        r2 = r7.m10407j();
        r3 = 0;
    L_0x008a:
        r4 = r7.m10406i();
        if (r4 <= 0) goto L_0x0096;
    L_0x0090:
        r7.m10397c();
        r3 = r3 + 1;
        goto L_0x008a;
    L_0x0096:
        r7.m10402e(r2);
        r2 = r6.f20112i;
        if (r2 != 0) goto L_0x009f;
    L_0x009d:
        r2 = 0;
        goto L_0x00a2;
    L_0x009f:
        r2 = r6.f20112i;
        r2 = r2.length;
    L_0x00a2:
        r3 = r3 + r2;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00ac;
    L_0x00a7:
        r4 = r6.f20112i;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00ac:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x00b8;
    L_0x00af:
        r1 = r7.m10397c();
        r3[r2] = r1;
        r2 = r2 + 1;
        goto L_0x00ac;
    L_0x00b8:
        r6.f20112i = r3;
        r7.m10399d(r0);
        goto L_0x0000;
    L_0x00bf:
        r0 = 48;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20112i;
        if (r2 != 0) goto L_0x00cb;
    L_0x00c9:
        r2 = 0;
        goto L_0x00ce;
    L_0x00cb:
        r2 = r6.f20112i;
        r2 = r2.length;
    L_0x00ce:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00d8;
    L_0x00d3:
        r3 = r6.f20112i;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00d8:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00e9;
    L_0x00dd:
        r1 = r7.m10397c();
        r0[r2] = r1;
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x00d8;
    L_0x00e9:
        r1 = r7.m10397c();
        r0[r2] = r1;
        r6.f20112i = r0;
        goto L_0x0000;
    L_0x00f3:
        r0 = r7.m10397c();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f20111h = r0;
        goto L_0x0000;
    L_0x00ff:
        r0 = r6.f20110g;
        if (r0 != 0) goto L_0x010a;
    L_0x0103:
        r0 = new com.google.android.gms.internal.ads.zzbhr;
        r0.<init>();
        r6.f20110g = r0;
    L_0x010a:
        r0 = r6.f20110g;
        r7.m10392a(r0);
        goto L_0x0000;
    L_0x0111:
        r0 = r6.f20107c;
        if (r0 != 0) goto L_0x011c;
    L_0x0115:
        r0 = new com.google.android.gms.internal.ads.zzbhq;
        r0.<init>();
        r6.f20107c = r0;
    L_0x011c:
        r0 = r6.f20107c;
        r7.m10392a(r0);
        goto L_0x0000;
    L_0x0123:
        r0 = r7.m10401e();
        r6.f20106b = r0;
        goto L_0x0000;
    L_0x012b:
        r0 = r7.m10397c();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f20105a = r0;
        goto L_0x0000;
    L_0x0137:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbht.b(com.google.android.gms.internal.ads.zzbgq):com.google.android.gms.internal.ads.zzbht");
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        return m26550b(zzbgq);
    }
}
