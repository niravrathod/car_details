package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class zzbaw implements zzavx {
    /* renamed from: a */
    private Mac f17073a;
    /* renamed from: b */
    private final int f17074b;
    /* renamed from: c */
    private final String f17075c;
    /* renamed from: d */
    private final Key f17076d;

    public zzbaw(String str, Key key, int i) {
        if (i >= 10) {
            Object obj = -1;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873) {
                        if (str.equals("HMACSHA512")) {
                            obj = 2;
                        }
                    }
                } else if (str.equals("HMACSHA256")) {
                    obj = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                obj = null;
            }
            switch (obj) {
                case null:
                    if (i > 20) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 1:
                    if (i <= 32) {
                        break;
                    }
                    throw new InvalidAlgorithmParameterException("tag size too big");
                case 2:
                    if (i <= 64) {
                        break;
                    }
                    throw new InvalidAlgorithmParameterException("tag size too big");
                default:
                    i = "unknown Hmac algorithm: ";
                    str = String.valueOf(str);
                    if (str.length() != 0) {
                        str = i.concat(str);
                    } else {
                        str = new String(i);
                    }
                    throw new NoSuchAlgorithmException(str);
            }
            this.f17075c = str;
            this.f17074b = i;
            this.f17076d = key;
            this.f17073a = (Mac) zzbal.f9074b.m10243a(str);
            this.f17073a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo2421a(byte[] r4) {
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
        r3 = this;
        r0 = r3.f17073a;	 Catch:{ CloneNotSupportedException -> 0x0009 }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x0009 }
        r0 = (javax.crypto.Mac) r0;	 Catch:{ CloneNotSupportedException -> 0x0009 }
        goto L_0x0018;
    L_0x0009:
        r0 = com.google.android.gms.internal.ads.zzbal.f9074b;
        r1 = r3.f17075c;
        r0 = r0.m10243a(r1);
        r0 = (javax.crypto.Mac) r0;
        r1 = r3.f17076d;
        r0.init(r1);
    L_0x0018:
        r0.update(r4);
        r4 = r3.f17074b;
        r4 = new byte[r4];
        r0 = r0.doFinal();
        r1 = r3.f17074b;
        r2 = 0;
        java.lang.System.arraycopy(r0, r2, r4, r2, r1);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbaw.a(byte[]):byte[]");
    }
}
