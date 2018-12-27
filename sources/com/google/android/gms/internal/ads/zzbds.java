package com.google.android.gms.internal.ads;

public class zzbds {
    /* renamed from: a */
    private static final zzbcq f9196a = zzbcq.m10311a();
    /* renamed from: b */
    private zzbbu f9197b;
    /* renamed from: c */
    private volatile zzbel f9198c;
    /* renamed from: d */
    private volatile zzbbu f9199d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbds)) {
            return null;
        }
        zzbds zzbds = (zzbds) obj;
        zzbel zzbel = this.f9198c;
        zzbel zzbel2 = zzbds.f9198c;
        if (zzbel == null && zzbel2 == null) {
            return m10354c().equals(zzbds.m10354c());
        }
        if (zzbel != null && zzbel2 != null) {
            return zzbel.equals(zzbel2);
        }
        if (zzbel != null) {
            return zzbel.equals(zzbds.m10351b(zzbel.mo4806q()));
        }
        return m10351b(zzbel2.mo4806q()).equals(zzbel2);
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.ads.zzbel m10351b(com.google.android.gms.internal.ads.zzbel r2) {
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
        r1 = this;
        r0 = r1.f9198c;
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.f9198c;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x000b;	 Catch:{ all -> 0x001a }
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x000b:
        r1.f9198c = r2;	 Catch:{ zzbdl -> 0x0012 }
        r0 = com.google.android.gms.internal.ads.zzbbu.f9094a;	 Catch:{ zzbdl -> 0x0012 }
        r1.f9199d = r0;	 Catch:{ zzbdl -> 0x0012 }
        goto L_0x0018;
    L_0x0012:
        r1.f9198c = r2;	 Catch:{ all -> 0x001a }
        r2 = com.google.android.gms.internal.ads.zzbbu.f9094a;	 Catch:{ all -> 0x001a }
        r1.f9199d = r2;	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r2 = move-exception;	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r2;
    L_0x001d:
        r2 = r1.f9198c;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbds.b(com.google.android.gms.internal.ads.zzbel):com.google.android.gms.internal.ads.zzbel");
    }

    /* renamed from: a */
    public final zzbel m10352a(zzbel zzbel) {
        zzbel zzbel2 = this.f9198c;
        this.f9197b = null;
        this.f9199d = null;
        this.f9198c = zzbel;
        return zzbel2;
    }

    /* renamed from: b */
    public final int m10353b() {
        if (this.f9199d != null) {
            return this.f9199d.mo4215a();
        }
        return this.f9198c != null ? this.f9198c.mo4810l() : 0;
    }

    /* renamed from: c */
    public final zzbbu m10354c() {
        if (this.f9199d != null) {
            return this.f9199d;
        }
        synchronized (this) {
            if (this.f9199d != null) {
                zzbbu zzbbu = this.f9199d;
                return zzbbu;
            }
            if (this.f9198c == null) {
                this.f9199d = zzbbu.f9094a;
            } else {
                this.f9199d = this.f9198c.mo4211h();
            }
            zzbbu = this.f9199d;
            return zzbbu;
        }
    }
}
