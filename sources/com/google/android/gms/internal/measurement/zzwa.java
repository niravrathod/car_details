package com.google.android.gms.internal.measurement;

public class zzwa {
    /* renamed from: a */
    private static final zzuz f10297a = zzuz.m12052a();
    /* renamed from: b */
    private zzud f10298b;
    /* renamed from: c */
    private volatile zzwt f10299c;
    /* renamed from: d */
    private volatile zzud f10300d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwa)) {
            return null;
        }
        zzwa zzwa = (zzwa) obj;
        zzwt zzwt = this.f10299c;
        zzwt zzwt2 = zzwa.f10299c;
        if (zzwt == null && zzwt2 == null) {
            return m12094c().equals(zzwa.m12094c());
        }
        if (zzwt != null && zzwt2 != null) {
            return zzwt.equals(zzwt2);
        }
        if (zzwt != null) {
            return zzwt.equals(zzwa.m12091b(zzwt.mo4832j()));
        }
        return m12091b(zzwt2.mo4832j()).equals(zzwt2);
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.measurement.zzwt m12091b(com.google.android.gms.internal.measurement.zzwt r2) {
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
        r0 = r1.f10299c;
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.f10299c;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x000b;	 Catch:{ all -> 0x001a }
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x000b:
        r1.f10299c = r2;	 Catch:{ zzvt -> 0x0012 }
        r0 = com.google.android.gms.internal.measurement.zzud.f10195a;	 Catch:{ zzvt -> 0x0012 }
        r1.f10300d = r0;	 Catch:{ zzvt -> 0x0012 }
        goto L_0x0018;
    L_0x0012:
        r1.f10299c = r2;	 Catch:{ all -> 0x001a }
        r2 = com.google.android.gms.internal.measurement.zzud.f10195a;	 Catch:{ all -> 0x001a }
        r1.f10300d = r2;	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r2 = move-exception;	 Catch:{ all -> 0x001a }
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r2;
    L_0x001d:
        r2 = r1.f10299c;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzwa.b(com.google.android.gms.internal.measurement.zzwt):com.google.android.gms.internal.measurement.zzwt");
    }

    /* renamed from: a */
    public final zzwt m12092a(zzwt zzwt) {
        zzwt zzwt2 = this.f10299c;
        this.f10298b = null;
        this.f10300d = null;
        this.f10299c = zzwt;
        return zzwt2;
    }

    /* renamed from: b */
    public final int m12093b() {
        if (this.f10300d != null) {
            return this.f10300d.mo4351a();
        }
        return this.f10299c != null ? this.f10299c.mo4836f() : 0;
    }

    /* renamed from: c */
    public final zzud m12094c() {
        if (this.f10300d != null) {
            return this.f10300d;
        }
        synchronized (this) {
            if (this.f10300d != null) {
                zzud zzud = this.f10300d;
                return zzud;
            }
            if (this.f10299c == null) {
                this.f10300d = zzud.f10195a;
            } else {
                this.f10300d = this.f10299c.mo4348c();
            }
            zzud = this.f10300d;
            return zzud;
        }
    }
}
