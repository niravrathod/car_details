package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhd.zza.zzc;

public final class zzbhn extends zzbgt<zzbhn> {
    /* renamed from: a */
    public Integer f20068a;
    /* renamed from: b */
    public String f20069b;
    /* renamed from: c */
    public String f20070c;
    /* renamed from: d */
    public zzbho f20071d;
    /* renamed from: e */
    public zzbht[] f20072e;
    /* renamed from: f */
    public String f20073f;
    /* renamed from: g */
    public zzbhs f20074g;
    /* renamed from: h */
    public zzbhu f20075h;
    /* renamed from: i */
    public String[] f20076i;
    /* renamed from: j */
    public String[] f20077j;
    /* renamed from: k */
    private zzc f20078k;
    /* renamed from: l */
    private String f20079l;
    /* renamed from: m */
    private Boolean f20080m;
    /* renamed from: n */
    private String[] f20081n;
    /* renamed from: o */
    private String f20082o;
    /* renamed from: p */
    private Boolean f20083p;
    /* renamed from: q */
    private Boolean f20084q;
    /* renamed from: r */
    private byte[] f20085r;

    public zzbhn() {
        this.f20068a = null;
        this.f20078k = null;
        this.f20069b = null;
        this.f20070c = null;
        this.f20079l = null;
        this.f20071d = null;
        this.f20072e = zzbht.m26551b();
        this.f20073f = null;
        this.f20074g = null;
        this.f20080m = null;
        this.f20081n = zzbhc.f9262c;
        this.f20082o = null;
        this.f20083p = null;
        this.f20084q = null;
        this.f20085r = null;
        this.f20075h = null;
        this.f20076i = zzbhc.f9262c;
        this.f20077j = zzbhc.f9262c;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20069b != null) {
            zzbgr.m10431a(1, this.f20069b);
        }
        if (this.f20070c != null) {
            zzbgr.m10431a(2, this.f20070c);
        }
        if (this.f20079l != null) {
            zzbgr.m10431a(3, this.f20079l);
        }
        if (this.f20072e != null && this.f20072e.length > 0) {
            for (zzbgz zzbgz : this.f20072e) {
                if (zzbgz != null) {
                    zzbgr.m10430a(4, zzbgz);
                }
            }
        }
        if (this.f20080m != null) {
            zzbgr.m10432a(5, this.f20080m.booleanValue());
        }
        if (this.f20081n != null && this.f20081n.length > 0) {
            for (String str : this.f20081n) {
                if (str != null) {
                    zzbgr.m10431a(6, str);
                }
            }
        }
        if (this.f20082o != null) {
            zzbgr.m10431a(7, this.f20082o);
        }
        if (this.f20083p != null) {
            zzbgr.m10432a(8, this.f20083p.booleanValue());
        }
        if (this.f20084q != null) {
            zzbgr.m10432a(9, this.f20084q.booleanValue());
        }
        if (this.f20068a != null) {
            zzbgr.m10427a(10, this.f20068a.intValue());
        }
        if (!(this.f20078k == null || this.f20078k == null)) {
            zzbgr.m10427a(11, this.f20078k.mo2419a());
        }
        if (this.f20071d != null) {
            zzbgr.m10430a(12, this.f20071d);
        }
        if (this.f20073f != null) {
            zzbgr.m10431a(13, this.f20073f);
        }
        if (this.f20074g != null) {
            zzbgr.m10430a(14, this.f20074g);
        }
        if (this.f20085r != null) {
            zzbgr.m10433a(15, this.f20085r);
        }
        if (this.f20075h != null) {
            zzbgr.m10430a(17, this.f20075h);
        }
        if (this.f20076i != null && this.f20076i.length > 0) {
            for (String str2 : this.f20076i) {
                if (str2 != null) {
                    zzbgr.m10431a(20, str2);
                }
            }
        }
        if (this.f20077j != null && this.f20077j.length > 0) {
            for (String str3 : this.f20077j) {
                if (str3 != null) {
                    zzbgr.m10431a(21, str3);
                }
            }
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int i;
        int i2;
        int i3;
        int a = super.mo2428a();
        if (this.f20069b != null) {
            a += zzbgr.m10418b(1, this.f20069b);
        }
        if (this.f20070c != null) {
            a += zzbgr.m10418b(2, this.f20070c);
        }
        if (this.f20079l != null) {
            a += zzbgr.m10418b(3, this.f20079l);
        }
        if (this.f20072e != null && this.f20072e.length > 0) {
            i = a;
            for (zzbgz zzbgz : this.f20072e) {
                if (zzbgz != null) {
                    i += zzbgr.m10417b(4, zzbgz);
                }
            }
            a = i;
        }
        if (this.f20080m != null) {
            this.f20080m.booleanValue();
            a += zzbgr.m10415b(5) + 1;
        }
        if (this.f20081n != null && this.f20081n.length > 0) {
            i2 = 0;
            int i4 = 0;
            for (String str : this.f20081n) {
                if (str != null) {
                    i4++;
                    i2 += zzbgr.m10411a(str);
                }
            }
            a = (a + i2) + (i4 * 1);
        }
        if (this.f20082o != null) {
            a += zzbgr.m10418b(7, this.f20082o);
        }
        if (this.f20083p != null) {
            this.f20083p.booleanValue();
            a += zzbgr.m10415b(8) + 1;
        }
        if (this.f20084q != null) {
            this.f20084q.booleanValue();
            a += zzbgr.m10415b(9) + 1;
        }
        if (this.f20068a != null) {
            a += zzbgr.m10416b(10, this.f20068a.intValue());
        }
        if (!(this.f20078k == null || this.f20078k == null)) {
            a += zzbgr.m10416b(11, this.f20078k.mo2419a());
        }
        if (this.f20071d != null) {
            a += zzbgr.m10417b(12, this.f20071d);
        }
        if (this.f20073f != null) {
            a += zzbgr.m10418b(13, this.f20073f);
        }
        if (this.f20074g != null) {
            a += zzbgr.m10417b(14, this.f20074g);
        }
        if (this.f20085r != null) {
            a += zzbgr.m10419b(15, this.f20085r);
        }
        if (this.f20075h != null) {
            a += zzbgr.m10417b(17, this.f20075h);
        }
        if (this.f20076i != null && this.f20076i.length > 0) {
            i3 = 0;
            i2 = 0;
            for (String str2 : this.f20076i) {
                if (str2 != null) {
                    i2++;
                    i3 += zzbgr.m10411a(str2);
                }
            }
            a = (a + i3) + (i2 * 2);
        }
        if (this.f20077j == null || this.f20077j.length <= 0) {
            return a;
        }
        i = 0;
        i3 = 0;
        for (String str3 : this.f20077j) {
            if (str3 != null) {
                i3++;
                i += zzbgr.m10411a(str3);
            }
        }
        return (a + i) + (i3 * 2);
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zzbhn m26529b(com.google.android.gms.internal.ads.zzbgq r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m10389a();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x01c5;
            case 10: goto L_0x01bd;
            case 18: goto L_0x01b5;
            case 26: goto L_0x01ad;
            case 34: goto L_0x016d;
            case 40: goto L_0x0161;
            case 50: goto L_0x012d;
            case 58: goto L_0x0125;
            case 64: goto L_0x0119;
            case 72: goto L_0x010d;
            case 80: goto L_0x00d6;
            case 88: goto L_0x00bb;
            case 98: goto L_0x00a9;
            case 106: goto L_0x00a1;
            case 114: goto L_0x008f;
            case 122: goto L_0x0087;
            case 138: goto L_0x0075;
            case 162: goto L_0x0042;
            case 170: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m21616a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20077j;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r2 = 0;
        goto L_0x001e;
    L_0x001b:
        r2 = r6.f20077j;
        r2 = r2.length;
    L_0x001e:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r6.f20077j;
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
        r6.f20077j = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20076i;
        if (r2 != 0) goto L_0x004e;
    L_0x004c:
        r2 = 0;
        goto L_0x0051;
    L_0x004e:
        r2 = r6.f20076i;
        r2 = r2.length;
    L_0x0051:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x005b;
    L_0x0056:
        r3 = r6.f20076i;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x005b:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x006c;
    L_0x0060:
        r1 = r7.m10401e();
        r0[r2] = r1;
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x005b;
    L_0x006c:
        r1 = r7.m10401e();
        r0[r2] = r1;
        r6.f20076i = r0;
        goto L_0x0000;
    L_0x0075:
        r0 = r6.f20075h;
        if (r0 != 0) goto L_0x0080;
    L_0x0079:
        r0 = new com.google.android.gms.internal.ads.zzbhu;
        r0.<init>();
        r6.f20075h = r0;
    L_0x0080:
        r0 = r6.f20075h;
        r7.m10392a(r0);
        goto L_0x0000;
    L_0x0087:
        r0 = r7.m10403f();
        r6.f20085r = r0;
        goto L_0x0000;
    L_0x008f:
        r0 = r6.f20074g;
        if (r0 != 0) goto L_0x009a;
    L_0x0093:
        r0 = new com.google.android.gms.internal.ads.zzbhs;
        r0.<init>();
        r6.f20074g = r0;
    L_0x009a:
        r0 = r6.f20074g;
        r7.m10392a(r0);
        goto L_0x0000;
    L_0x00a1:
        r0 = r7.m10401e();
        r6.f20073f = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r6.f20071d;
        if (r0 != 0) goto L_0x00b4;
    L_0x00ad:
        r0 = new com.google.android.gms.internal.ads.zzbho;
        r0.<init>();
        r6.f20071d = r0;
    L_0x00b4:
        r0 = r6.f20071d;
        r7.m10392a(r0);
        goto L_0x0000;
    L_0x00bb:
        r1 = r7.m10407j();
        r2 = r7.m10397c();
        switch(r2) {
            case 0: goto L_0x00ce;
            case 1: goto L_0x00ce;
            case 2: goto L_0x00ce;
            case 3: goto L_0x00ce;
            case 4: goto L_0x00ce;
            default: goto L_0x00c6;
        };
    L_0x00c6:
        r7.m10402e(r1);
        r6.m21616a(r7, r0);
        goto L_0x0000;
    L_0x00ce:
        r0 = com.google.android.gms.internal.ads.zzbhd.zza.zzc.m21618a(r2);
        r6.f20078k = r0;
        goto L_0x0000;
    L_0x00d6:
        r1 = r7.m10407j();
        r2 = r7.m10397c();	 Catch:{ IllegalArgumentException -> 0x0105 }
        if (r2 < 0) goto L_0x00ec;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x00e0:
        r3 = 9;	 Catch:{ IllegalArgumentException -> 0x0105 }
        if (r2 > r3) goto L_0x00ec;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x00e4:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r6.f20068a = r2;	 Catch:{ IllegalArgumentException -> 0x0105 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x00ec:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r4 = 42;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = " is not a valid enum ReportType";	 Catch:{ IllegalArgumentException -> 0x0105 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x0105:
        r7.m10402e(r1);
        r6.m21616a(r7, r0);
        goto L_0x0000;
    L_0x010d:
        r0 = r7.m10400d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f20084q = r0;
        goto L_0x0000;
    L_0x0119:
        r0 = r7.m10400d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f20083p = r0;
        goto L_0x0000;
    L_0x0125:
        r0 = r7.m10401e();
        r6.f20082o = r0;
        goto L_0x0000;
    L_0x012d:
        r0 = 50;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20081n;
        if (r2 != 0) goto L_0x0139;
    L_0x0137:
        r2 = 0;
        goto L_0x013c;
    L_0x0139:
        r2 = r6.f20081n;
        r2 = r2.length;
    L_0x013c:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x0146;
    L_0x0141:
        r3 = r6.f20081n;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0146:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0157;
    L_0x014b:
        r1 = r7.m10401e();
        r0[r2] = r1;
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x0146;
    L_0x0157:
        r1 = r7.m10401e();
        r0[r2] = r1;
        r6.f20081n = r0;
        goto L_0x0000;
    L_0x0161:
        r0 = r7.m10400d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f20080m = r0;
        goto L_0x0000;
    L_0x016d:
        r0 = 34;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20072e;
        if (r2 != 0) goto L_0x0179;
    L_0x0177:
        r2 = 0;
        goto L_0x017c;
    L_0x0179:
        r2 = r6.f20072e;
        r2 = r2.length;
    L_0x017c:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.ads.zzbht[r0];
        if (r2 == 0) goto L_0x0186;
    L_0x0181:
        r3 = r6.f20072e;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0186:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x019d;
    L_0x018b:
        r1 = new com.google.android.gms.internal.ads.zzbht;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m10392a(r1);
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x0186;
    L_0x019d:
        r1 = new com.google.android.gms.internal.ads.zzbht;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m10392a(r1);
        r6.f20072e = r0;
        goto L_0x0000;
    L_0x01ad:
        r0 = r7.m10401e();
        r6.f20079l = r0;
        goto L_0x0000;
    L_0x01b5:
        r0 = r7.m10401e();
        r6.f20070c = r0;
        goto L_0x0000;
    L_0x01bd:
        r0 = r7.m10401e();
        r6.f20069b = r0;
        goto L_0x0000;
    L_0x01c5:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhn.b(com.google.android.gms.internal.ads.zzbgq):com.google.android.gms.internal.ads.zzbhn");
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        return m26529b(zzbgq);
    }
}
