package com.google.android.gms.internal.ads;

public final class zzbi extends zzbgt<zzbi> {
    /* renamed from: a */
    public byte[][] f20117a;
    /* renamed from: b */
    public byte[] f20118b;
    /* renamed from: c */
    public Integer f20119c;
    /* renamed from: d */
    private Integer f20120d;

    public zzbi() {
        this.f20117a = zzbhc.f9263d;
        this.f20118b = null;
        this.aa = -1;
    }

    /* renamed from: a */
    public final void mo2429a(zzbgr zzbgr) {
        if (this.f20117a != null && this.f20117a.length > 0) {
            for (byte[] bArr : this.f20117a) {
                if (bArr != null) {
                    zzbgr.m10433a(1, bArr);
                }
            }
        }
        if (this.f20118b != null) {
            zzbgr.m10433a(2, this.f20118b);
        }
        if (this.f20120d != null) {
            zzbgr.m10427a(3, this.f20120d.intValue());
        }
        if (this.f20119c != null) {
            zzbgr.m10427a(4, this.f20119c.intValue());
        }
        super.mo2429a(zzbgr);
    }

    /* renamed from: a */
    protected final int mo2428a() {
        int a = super.mo2428a();
        if (this.f20117a != null && this.f20117a.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.f20117a) {
                if (bArr != null) {
                    i2++;
                    i += zzbgr.m10420b(bArr);
                }
            }
            a = (a + i) + (i2 * 1);
        }
        if (this.f20118b != null) {
            a += zzbgr.m10419b(2, this.f20118b);
        }
        if (this.f20120d != null) {
            a += zzbgr.m10416b(3, this.f20120d.intValue());
        }
        return this.f20119c != null ? a + zzbgr.m10416b(4, this.f20119c.intValue()) : a;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zzbi m26558b(com.google.android.gms.internal.ads.zzbgq r5) {
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
        r4 = this;
    L_0x0000:
        r0 = r5.m10389a();
        if (r0 == 0) goto L_0x008b;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x0058;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x0051;
    L_0x000e:
        r1 = 24;
        if (r0 == r1) goto L_0x0037;
    L_0x0012:
        r1 = 32;
        if (r0 == r1) goto L_0x001d;
    L_0x0016:
        r0 = super.m21616a(r5, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x001c:
        return r4;
    L_0x001d:
        r1 = r5.m10407j();
        r2 = r5.m10404g();	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2 = com.google.android.gms.internal.ads.zzba.m10228c(r2);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r4.f20119c = r2;	 Catch:{ IllegalArgumentException -> 0x0030 }
        goto L_0x0000;
    L_0x0030:
        r5.m10402e(r1);
        r4.m21616a(r5, r0);
        goto L_0x0000;
    L_0x0037:
        r1 = r5.m10407j();
        r2 = r5.m10404g();	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = com.google.android.gms.internal.ads.zzba.m10227b(r2);	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x004a }
        r4.f20120d = r2;	 Catch:{ IllegalArgumentException -> 0x004a }
        goto L_0x0000;
    L_0x004a:
        r5.m10402e(r1);
        r4.m21616a(r5, r0);
        goto L_0x0000;
    L_0x0051:
        r0 = r5.m10403f();
        r4.f20118b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = com.google.android.gms.internal.ads.zzbhc.m10459a(r5, r1);
        r1 = r4.f20117a;
        r2 = 0;
        if (r1 != 0) goto L_0x0063;
    L_0x0061:
        r1 = 0;
        goto L_0x0066;
    L_0x0063:
        r1 = r4.f20117a;
        r1 = r1.length;
    L_0x0066:
        r0 = r0 + r1;
        r0 = new byte[r0][];
        if (r1 == 0) goto L_0x0070;
    L_0x006b:
        r3 = r4.f20117a;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x0070:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x0081;
    L_0x0075:
        r2 = r5.m10403f();
        r0[r1] = r2;
        r5.m10389a();
        r1 = r1 + 1;
        goto L_0x0070;
    L_0x0081:
        r2 = r5.m10403f();
        r0[r1] = r2;
        r4.f20117a = r0;
        goto L_0x0000;
    L_0x008b:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbi.b(com.google.android.gms.internal.ads.zzbgq):com.google.android.gms.internal.ads.zzbi");
    }

    /* renamed from: a */
    public final /* synthetic */ zzbgz mo4209a(zzbgq zzbgq) {
        return m26558b(zzbgq);
    }
}
