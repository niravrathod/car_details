package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzayv.zzb;
import java.security.GeneralSecurityException;

final class hu implements zzavt<zzavm> {
    hu() {
    }

    /* renamed from: a */
    public final String mo1957a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: b */
    public final int mo1958b() {
        return 0;
    }

    /* renamed from: d */
    private final com.google.android.gms.internal.ads.zzavm m20516d(com.google.android.gms.internal.ads.zzbbu r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r3 = com.google.android.gms.internal.ads.zzaxr.m29041a(r3);	 Catch:{ zzbdl -> 0x0035 }
        r0 = r3 instanceof com.google.android.gms.internal.ads.zzaxr;	 Catch:{ zzbdl -> 0x0035 }
        if (r0 == 0) goto L_0x002d;	 Catch:{ zzbdl -> 0x0035 }
    L_0x0008:
        r3 = (com.google.android.gms.internal.ads.zzaxr) r3;	 Catch:{ zzbdl -> 0x0035 }
        r0 = r3.m29048a();	 Catch:{ zzbdl -> 0x0035 }
        r1 = 0;	 Catch:{ zzbdl -> 0x0035 }
        com.google.android.gms.internal.ads.zzbbd.m10252a(r0, r1);	 Catch:{ zzbdl -> 0x0035 }
        r0 = r3.m29050b();	 Catch:{ zzbdl -> 0x0035 }
        r0 = r0.mo4215a();	 Catch:{ zzbdl -> 0x0035 }
        com.google.android.gms.internal.ads.zzbbd.m10251a(r0);	 Catch:{ zzbdl -> 0x0035 }
        r0 = new com.google.android.gms.internal.ads.zzazw;	 Catch:{ zzbdl -> 0x0035 }
        r3 = r3.m29050b();	 Catch:{ zzbdl -> 0x0035 }
        r3 = r3.m10273b();	 Catch:{ zzbdl -> 0x0035 }
        r0.<init>(r3);	 Catch:{ zzbdl -> 0x0035 }
        r0 = (com.google.android.gms.internal.ads.zzavm) r0;	 Catch:{ zzbdl -> 0x0035 }
        return r0;	 Catch:{ zzbdl -> 0x0035 }
    L_0x002d:
        r3 = new java.security.GeneralSecurityException;	 Catch:{ zzbdl -> 0x0035 }
        r0 = "expected AesGcmKey proto";	 Catch:{ zzbdl -> 0x0035 }
        r3.<init>(r0);	 Catch:{ zzbdl -> 0x0035 }
        throw r3;	 Catch:{ zzbdl -> 0x0035 }
    L_0x0035:
        r3 = new java.security.GeneralSecurityException;
        r0 = "expected AesGcmKey proto";
        r3.<init>(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hu.d(com.google.android.gms.internal.ads.zzbbu):com.google.android.gms.internal.ads.zzavm");
    }

    /* renamed from: b */
    public final zzbel mo1959b(zzbbu zzbbu) {
        try {
            return mo1960b(zzaxt.m29051a(zzbbu));
        } catch (zzbbu zzbbu2) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", zzbbu2);
        }
    }

    /* renamed from: b */
    public final zzbel mo1960b(zzbel zzbel) {
        if (zzbel instanceof zzaxt) {
            zzaxt zzaxt = (zzaxt) zzbel;
            zzbbd.m10251a(zzaxt.m29053a());
            return (zzbdd) zzaxr.m29046c().m29040a(zzbbu.m10260a(zzbay.m10249a(zzaxt.m29053a()))).m29039a(0).mo4804f();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    /* renamed from: c */
    public final zzayv mo1961c(zzbbu zzbbu) {
        return (zzayv) ((zzbdd) zzayv.m29161d().m29154a("type.googleapis.com/google.crypto.tink.AesGcmKey").m29153a(((zzaxr) mo1959b(zzbbu)).mo4211h()).m29152a(zzb.SYMMETRIC).mo4804f());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1956a(zzbel zzbel) {
        if (zzbel instanceof zzaxr) {
            zzaxr zzaxr = (zzaxr) zzbel;
            zzbbd.m10252a(zzaxr.m29048a(), 0);
            zzbbd.m10251a(zzaxr.m29050b().mo4215a());
            return new zzazw(zzaxr.m29050b().m10273b());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1955a(zzbbu zzbbu) {
        return m20516d(zzbbu);
    }
}
