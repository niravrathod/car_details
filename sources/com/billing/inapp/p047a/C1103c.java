package com.billing.inapp.p047a;

import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.p041a.C1003a;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.billing.inapp.a.c */
public class C1103c {
    /* renamed from: a */
    public static boolean m4605a(String str, String str2, String str3) {
        if (!(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str))) {
            if (!TextUtils.isEmpty(str3)) {
                return C1103c.m4606a(C1103c.m4604a(str), str2, str3);
            }
        }
        C1003a.m4333b("IABUtil/Security", "Purchase verification failed: missing data.");
        return null;
    }

    /* renamed from: a */
    public static PublicKey m4604a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (String str2) {
            throw new RuntimeException(str2);
        } catch (String str22) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid key specification: ");
            stringBuilder.append(str22);
            str22 = stringBuilder.toString();
            C1003a.m4333b("IABUtil/Security", str22);
            throw new IOException(str22);
        }
    }

    /* renamed from: a */
    public static boolean m4606a(java.security.PublicKey r2, java.lang.String r3, java.lang.String r4) {
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
        r0 = 0;
        r4 = android.util.Base64.decode(r4, r0);	 Catch:{ IllegalArgumentException -> 0x003c }
        r1 = "SHA1withRSA";	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        r1 = java.security.Signature.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        r1.initVerify(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        r2 = r3.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        r1.update(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        r2 = r1.verify(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        if (r2 != 0) goto L_0x0023;	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
    L_0x001b:
        r2 = "IABUtil/Security";	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        r3 = "Signature verification failed.";	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        com.android.billingclient.p041a.C1003a.m4333b(r2, r3);	 Catch:{ NoSuchAlgorithmException -> 0x0035, InvalidKeyException -> 0x002d, SignatureException -> 0x0025 }
        return r0;
    L_0x0023:
        r2 = 1;
        return r2;
    L_0x0025:
        r2 = "IABUtil/Security";
        r3 = "Signature exception.";
        com.android.billingclient.p041a.C1003a.m4333b(r2, r3);
        goto L_0x0034;
    L_0x002d:
        r2 = "IABUtil/Security";
        r3 = "Invalid key specification.";
        com.android.billingclient.p041a.C1003a.m4333b(r2, r3);
    L_0x0034:
        return r0;
    L_0x0035:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;
        r3.<init>(r2);
        throw r3;
    L_0x003c:
        r2 = "IABUtil/Security";
        r3 = "Base64 decoding failed.";
        com.android.billingclient.p041a.C1003a.m4333b(r2, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.billing.inapp.a.c.a(java.security.PublicKey, java.lang.String, java.lang.String):boolean");
    }
}
