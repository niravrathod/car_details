package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzif.zza;
import com.google.android.gms.internal.ads.zzif.zzb;
import com.google.android.gms.internal.ads.zzif.zzc;
import com.google.android.gms.internal.ads.zzif.zzf;
import com.google.android.gms.internal.ads.zzif.zzg;
import com.google.android.gms.internal.ads.zzif.zzi;
import com.google.android.gms.internal.ads.zzif.zzj;

public final class zziu extends zzbgt<zziu> {
    /* renamed from: a */
    public Integer f20139a;
    /* renamed from: b */
    public zziv f20140b;
    /* renamed from: c */
    private zzil f20141c;
    /* renamed from: d */
    private zzb f20142d;
    /* renamed from: e */
    private zza[] f20143e;
    /* renamed from: f */
    private zzc f20144f;
    /* renamed from: g */
    private zzj f20145g;
    /* renamed from: h */
    private zzi f20146h;
    /* renamed from: i */
    private zzf f20147i;
    /* renamed from: j */
    private zzg f20148j;
    /* renamed from: k */
    private zzja[] f20149k;

    public zziu() {
        this.f20139a = null;
        this.f20141c = null;
        this.f20142d = null;
        this.f20140b = null;
        this.f20143e = new zza[0];
        this.f20144f = null;
        this.f20145g = null;
        this.f20146h = null;
        this.f20147i = null;
        this.f20148j = null;
        this.f20149k = zzja.m26596b();
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20139a != null) {
            zzbgr.m10427a(7, this.f20139a.intValue());
        }
        if (!(this.f20141c == null || this.f20141c == null)) {
            zzbgr.m10427a(8, this.f20141c.mo2419a());
        }
        if (this.f20142d != null) {
            zzbgr.m10429a(9, this.f20142d);
        }
        if (this.f20140b != null) {
            zzbgr.m10430a(10, this.f20140b);
        }
        if (this.f20143e != null && this.f20143e.length > 0) {
            for (zzbel zzbel : this.f20143e) {
                if (zzbel != null) {
                    zzbgr.m10429a(11, zzbel);
                }
            }
        }
        if (this.f20144f != null) {
            zzbgr.m10429a(12, this.f20144f);
        }
        if (this.f20145g != null) {
            zzbgr.m10429a(13, this.f20145g);
        }
        if (this.f20146h != null) {
            zzbgr.m10429a(14, this.f20146h);
        }
        if (this.f20147i != null) {
            zzbgr.m10429a(15, this.f20147i);
        }
        if (this.f20148j != null) {
            zzbgr.m10429a(16, this.f20148j);
        }
        if (this.f20149k != null && this.f20149k.length > 0) {
            for (zzbgz zzbgz : this.f20149k) {
                if (zzbgz != null) {
                    zzbgr.m10430a(17, zzbgz);
                }
            }
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20139a != null) {
            a += zzbgr.m10416b(7, this.f20139a.intValue());
        }
        if (!(this.f20141c == null || this.f20141c == null)) {
            a += zzbgr.m10416b(8, this.f20141c.mo2419a());
        }
        if (this.f20142d != null) {
            a += zzbck.m21529c(9, this.f20142d);
        }
        if (this.f20140b != null) {
            a += zzbgr.m10417b(10, this.f20140b);
        }
        if (this.f20143e != null && this.f20143e.length > 0) {
            int i = a;
            for (zzbel zzbel : this.f20143e) {
                if (zzbel != null) {
                    i += zzbck.m21529c(11, zzbel);
                }
            }
            a = i;
        }
        if (this.f20144f != null) {
            a += zzbck.m21529c(12, this.f20144f);
        }
        if (this.f20145g != null) {
            a += zzbck.m21529c(13, this.f20145g);
        }
        if (this.f20146h != null) {
            a += zzbck.m21529c(14, this.f20146h);
        }
        if (this.f20147i != null) {
            a += zzbck.m21529c(15, this.f20147i);
        }
        if (this.f20148j != null) {
            a += zzbck.m21529c(16, this.f20148j);
        }
        if (this.f20149k != null && this.f20149k.length > 0) {
            for (zzbgz zzbgz : this.f20149k) {
                if (zzbgz != null) {
                    a += zzbgr.m10417b(17, zzbgz);
                }
            }
        }
        return a;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zziu m26577b(com.google.android.gms.internal.ads.zzbgq r7) {
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
            case 0: goto L_0x0147;
            case 56: goto L_0x0110;
            case 64: goto L_0x00f1;
            case 74: goto L_0x00e3;
            case 82: goto L_0x00d1;
            case 90: goto L_0x0091;
            case 98: goto L_0x0083;
            case 106: goto L_0x0075;
            case 114: goto L_0x0068;
            case 122: goto L_0x005b;
            case 130: goto L_0x004e;
            case 138: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m21616a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20149k;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r2 = 0;
        goto L_0x001e;
    L_0x001b:
        r2 = r6.f20149k;
        r2 = r2.length;
    L_0x001e:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.ads.zzja[r0];
        if (r2 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r6.f20149k;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0028:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x003f;
    L_0x002d:
        r1 = new com.google.android.gms.internal.ads.zzja;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m10392a(r1);
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x0028;
    L_0x003f:
        r1 = new com.google.android.gms.internal.ads.zzja;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m10392a(r1);
        r6.f20149k = r0;
        goto L_0x0000;
    L_0x004e:
        r0 = com.google.android.gms.internal.ads.zzif.zzg.m29322a();
        r0 = r7.m10390a(r0);
        r0 = (com.google.android.gms.internal.ads.zzif.zzg) r0;
        r6.f20148j = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = com.google.android.gms.internal.ads.zzif.zzf.m29319a();
        r0 = r7.m10390a(r0);
        r0 = (com.google.android.gms.internal.ads.zzif.zzf) r0;
        r6.f20147i = r0;
        goto L_0x0000;
    L_0x0068:
        r0 = com.google.android.gms.internal.ads.zzif.zzi.m29328a();
        r0 = r7.m10390a(r0);
        r0 = (com.google.android.gms.internal.ads.zzif.zzi) r0;
        r6.f20146h = r0;
        goto L_0x0000;
    L_0x0075:
        r0 = com.google.android.gms.internal.ads.zzif.zzj.m29331a();
        r0 = r7.m10390a(r0);
        r0 = (com.google.android.gms.internal.ads.zzif.zzj) r0;
        r6.f20145g = r0;
        goto L_0x0000;
    L_0x0083:
        r0 = com.google.android.gms.internal.ads.zzif.zzc.m29312a();
        r0 = r7.m10390a(r0);
        r0 = (com.google.android.gms.internal.ads.zzif.zzc) r0;
        r6.f20144f = r0;
        goto L_0x0000;
    L_0x0091:
        r0 = 90;
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r7, r0);
        r2 = r6.f20143e;
        if (r2 != 0) goto L_0x009d;
    L_0x009b:
        r2 = 0;
        goto L_0x00a0;
    L_0x009d:
        r2 = r6.f20143e;
        r2 = r2.length;
    L_0x00a0:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.ads.zzif.zza[r0];
        if (r2 == 0) goto L_0x00aa;
    L_0x00a5:
        r3 = r6.f20143e;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00aa:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00c1;
    L_0x00af:
        r1 = com.google.android.gms.internal.ads.zzif.zza.m29306a();
        r1 = r7.m10390a(r1);
        r1 = (com.google.android.gms.internal.ads.zzif.zza) r1;
        r0[r2] = r1;
        r7.m10389a();
        r2 = r2 + 1;
        goto L_0x00aa;
    L_0x00c1:
        r1 = com.google.android.gms.internal.ads.zzif.zza.m29306a();
        r1 = r7.m10390a(r1);
        r1 = (com.google.android.gms.internal.ads.zzif.zza) r1;
        r0[r2] = r1;
        r6.f20143e = r0;
        goto L_0x0000;
    L_0x00d1:
        r0 = r6.f20140b;
        if (r0 != 0) goto L_0x00dc;
    L_0x00d5:
        r0 = new com.google.android.gms.internal.ads.zziv;
        r0.<init>();
        r6.f20140b = r0;
    L_0x00dc:
        r0 = r6.f20140b;
        r7.m10392a(r0);
        goto L_0x0000;
    L_0x00e3:
        r0 = com.google.android.gms.internal.ads.zzif.zzb.m29309a();
        r0 = r7.m10390a(r0);
        r0 = (com.google.android.gms.internal.ads.zzif.zzb) r0;
        r6.f20142d = r0;
        goto L_0x0000;
    L_0x00f1:
        r1 = r7.m10407j();
        r2 = r7.m10404g();
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r2 == r3) goto L_0x0108;
    L_0x00fd:
        switch(r2) {
            case 0: goto L_0x0108;
            case 1: goto L_0x0108;
            default: goto L_0x0100;
        };
    L_0x0100:
        r7.m10402e(r1);
        r6.m21616a(r7, r0);
        goto L_0x0000;
    L_0x0108:
        r0 = com.google.android.gms.internal.ads.zzil.m21739a(r2);
        r6.f20141c = r0;
        goto L_0x0000;
    L_0x0110:
        r1 = r7.m10407j();
        r2 = r7.m10404g();	 Catch:{ IllegalArgumentException -> 0x013f }
        if (r2 < 0) goto L_0x0126;	 Catch:{ IllegalArgumentException -> 0x013f }
    L_0x011a:
        r3 = 9;	 Catch:{ IllegalArgumentException -> 0x013f }
        if (r2 > r3) goto L_0x0126;	 Catch:{ IllegalArgumentException -> 0x013f }
    L_0x011e:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x013f }
        r6.f20139a = r2;	 Catch:{ IllegalArgumentException -> 0x013f }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x013f }
    L_0x0126:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x013f }
        r4 = 43;	 Catch:{ IllegalArgumentException -> 0x013f }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x013f }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x013f }
        r2 = " is not a valid enum AdInitiater";	 Catch:{ IllegalArgumentException -> 0x013f }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x013f }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x013f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x013f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x013f }
    L_0x013f:
        r7.m10402e(r1);
        r6.m21616a(r7, r0);
        goto L_0x0000;
    L_0x0147:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziu.b(com.google.android.gms.internal.ads.zzbgq):com.google.android.gms.internal.ads.zziu");
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        return m26577b(zzbgq);
    }
}
