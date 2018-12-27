package com.google.android.gms.internal.ads;

public final class zzbhs extends zzbgt<zzbhs> {
    /* renamed from: a */
    public Integer f20101a;
    /* renamed from: b */
    public String f20102b;
    /* renamed from: c */
    public byte[] f20103c;

    public zzbhs() {
        this.f20101a = null;
        this.f20102b = null;
        this.f20103c = null;
        this.Z = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20101a != null) {
            zzbgr.m10427a(1, this.f20101a.intValue());
        }
        if (this.f20102b != null) {
            zzbgr.m10431a(2, this.f20102b);
        }
        if (this.f20103c != null) {
            zzbgr.m10433a(3, this.f20103c);
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20101a != null) {
            a += zzbgr.m10416b(1, this.f20101a.intValue());
        }
        if (this.f20102b != null) {
            a += zzbgr.m10418b(2, this.f20102b);
        }
        return this.f20103c != null ? a + zzbgr.m10419b(3, this.f20103c) : a;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zzbhs m26546b(com.google.android.gms.internal.ads.zzbgq r7) {
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
        if (r0 == 0) goto L_0x005b;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0027;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x0020;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x0019;
    L_0x0012:
        r0 = super.m21616a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0018:
        return r6;
    L_0x0019:
        r0 = r7.m10403f();
        r6.f20103c = r0;
        goto L_0x0000;
    L_0x0020:
        r0 = r7.m10401e();
        r6.f20102b = r0;
        goto L_0x0000;
    L_0x0027:
        r1 = r7.m10407j();
        r2 = r7.m10397c();	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r2 < 0) goto L_0x003b;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0031:
        r3 = 1;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r2 > r3) goto L_0x003b;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0034:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r6.f20101a = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x003b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 36;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = " is not a valid enum Type";	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r7.m10402e(r1);
        r6.m21616a(r7, r0);
        goto L_0x0000;
    L_0x005b:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhs.b(com.google.android.gms.internal.ads.zzbgq):com.google.android.gms.internal.ads.zzbhs");
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        return m26546b(zzbgq);
    }
}
