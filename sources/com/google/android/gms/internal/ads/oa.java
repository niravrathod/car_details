package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

final class oa {
    /* renamed from: a */
    static CountDownLatch f8308a = new CountDownLatch(1);
    /* renamed from: b */
    private static boolean f8309b = false;
    /* renamed from: c */
    private static MessageDigest f8310c;
    /* renamed from: d */
    private static final Object f8311d = new Object();
    /* renamed from: e */
    private static final Object f8312e = new Object();

    /* renamed from: a */
    static void m9349a() {
        synchronized (f8312e) {
            if (!f8309b) {
                f8309b = true;
                new Thread(new oc()).start();
            }
        }
    }

    /* renamed from: b */
    private static java.security.MessageDigest m9352b() {
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
        m9349a();
        r0 = f8308a;	 Catch:{ InterruptedException -> 0x000e }
        r1 = 2;	 Catch:{ InterruptedException -> 0x000e }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x000e }
        r0 = r0.await(r1, r3);	 Catch:{ InterruptedException -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r1 = 0;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = f8310c;
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        return r1;
    L_0x0018:
        r0 = f8310c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oa.b():java.security.MessageDigest");
    }

    /* renamed from: a */
    static String m9346a(zzbb zzbb, String str) {
        byte[] a = zzbgz.m10450a((zzbgz) zzbb);
        if (((Boolean) zzkd.m10713e().m10897a(zznw.bm)).booleanValue()) {
            Vector a2 = m9348a(a, 255);
            if (a2 != null) {
                if (a2.size() != 0) {
                    zzbgz zzbi = new zzbi();
                    zzbi.f20117a = new byte[a2.size()][];
                    Iterator it = a2.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        int i2 = i + 1;
                        zzbi.f20117a[i] = m9351a((byte[]) it.next(), str, false);
                        i = i2;
                    }
                    zzbi.f20118b = m9350a(a);
                    a = zzbgz.m10450a(zzbi);
                }
            }
            a = m9351a(zzbgz.m10450a(m9345a(4096)), str, true);
        } else if (pe.f8323a != null) {
            zzbb = pe.f8323a.mo1962a(a, str != null ? str.getBytes() : new byte[0]);
            zzbgz zzbi2 = new zzbi();
            zzbi2.f20117a = new byte[][]{zzbb};
            zzbi2.f20119c = Integer.valueOf(2);
            a = zzbgz.m10450a(zzbi2);
        } else {
            throw new GeneralSecurityException();
        }
        return zzbk.m10467a(a, true);
    }

    /* renamed from: a */
    private static java.util.Vector<byte[]> m9348a(byte[] r6, int r7) {
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
        r7 = 0;
        if (r6 == 0) goto L_0x002c;
    L_0x0003:
        r0 = r6.length;
        if (r0 > 0) goto L_0x0007;
    L_0x0006:
        goto L_0x002c;
    L_0x0007:
        r0 = r6.length;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0 = r0 + r1;
        r0 = r0 + -1;
        r0 = r0 / r1;
        r2 = new java.util.Vector;
        r2.<init>();
        r3 = 0;
    L_0x0014:
        if (r3 >= r0) goto L_0x002b;
    L_0x0016:
        r4 = r3 * 255;
        r5 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r5 = r5 - r4;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        if (r5 <= r1) goto L_0x001f;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x001c:
        r5 = r4 + 255;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        goto L_0x0020;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x001f:
        r5 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x002a }
    L_0x0020:
        r4 = java.util.Arrays.copyOfRange(r6, r4, r5);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r2.add(r4);	 Catch:{ IndexOutOfBoundsException -> 0x002a }
        r3 = r3 + 1;
        goto L_0x0014;
    L_0x002a:
        return r7;
    L_0x002b:
        return r2;
    L_0x002c:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oa.a(byte[], int):java.util.Vector<byte[]>");
    }

    /* renamed from: a */
    private static zzbb m9345a(long j) {
        j = new zzbb();
        j.f19994k = Long.valueOf(4096);
        return j;
    }

    /* renamed from: a */
    private static byte[] m9351a(byte[] bArr, String str, boolean z) {
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zzbgz.m10450a(m9345a(4096));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            bArr = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArr = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr = ByteBuffer.allocate(256).put(m9350a(bArr)).put(bArr).array();
        }
        z = new byte[256];
        for (oe a : new zzbp().cN) {
            a.mo2159a(bArr, z);
        }
        if (str != null && str.length() > null) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzbbk(str.getBytes("UTF-8")).m10256a(z);
        }
        return z;
    }

    /* renamed from: a */
    public static byte[] m9350a(byte[] bArr) {
        synchronized (f8311d) {
            MessageDigest b = m9352b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                bArr = f8310c.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return bArr;
    }
}
