package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzazw implements zzavm {
    /* renamed from: a */
    private final SecretKey f17056a;

    public zzazw(byte[] bArr) {
        zzbbd.m10251a(bArr.length);
        this.f17056a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo1966a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            Object obj = new byte[((bArr.length + 12) + 16)];
            Object a = zzbay.m10249a(12);
            System.arraycopy(a, 0, obj, 0, 12);
            Cipher cipher = (Cipher) zzbal.f9073a.m10243a("AES/GCM/NoPadding");
            cipher.init(1, this.f17056a, m21495a(a, 0, a.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                cipher.updateAAD(bArr2);
            }
            bArr2 = cipher.doFinal(bArr, 0, bArr.length, obj, 12);
            if (bArr2 == bArr.length + 16) {
                return obj;
            }
            bArr2 -= bArr.length;
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{Integer.valueOf(16), Integer.valueOf(bArr2)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    private static java.security.spec.AlgorithmParameterSpec m21495a(byte[] r2, int r3, int r4) {
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
        r3 = 0;
        r0 = "javax.crypto.spec.GCMParameterSpec";	 Catch:{ ClassNotFoundException -> 0x000e }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000e }
        r0 = new javax.crypto.spec.GCMParameterSpec;	 Catch:{ ClassNotFoundException -> 0x000e }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ ClassNotFoundException -> 0x000e }
        r0.<init>(r1, r2, r3, r4);	 Catch:{ ClassNotFoundException -> 0x000e }
        return r0;
        r0 = com.google.android.gms.internal.ads.jz.m8953a();
        if (r0 == 0) goto L_0x001b;
    L_0x0015:
        r0 = new javax.crypto.spec.IvParameterSpec;
        r0.<init>(r2, r3, r4);
        return r0;
    L_0x001b:
        r2 = new java.security.GeneralSecurityException;
        r3 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found";
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazw.a(byte[], int, int):java.security.spec.AlgorithmParameterSpec");
    }
}
