package io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: io.fabric.sdk.android.e */
class C2768e implements Callable<Map<String, C2773j>> {
    /* renamed from: a */
    final String f11822a;

    public /* synthetic */ Object call() {
        return m13541a();
    }

    C2768e(String str) {
        this.f11822a = str;
    }

    /* renamed from: a */
    public Map<String, C2773j> m13541a() {
        Map<String, C2773j> hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m13539c());
        hashMap.putAll(m13540d());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("finish scanning in ");
        stringBuilder.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        C2766c.m13524h().mo3557b("Fabric", stringBuilder.toString());
        return hashMap;
    }

    /* renamed from: c */
    private java.util.Map<java.lang.String, io.fabric.sdk.android.C2773j> m13539c() {
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
        r5 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "com.google.android.gms.ads.AdView";	 Catch:{ Exception -> 0x0027 }
        java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0027 }
        r1 = new io.fabric.sdk.android.j;	 Catch:{ Exception -> 0x0027 }
        r2 = "com.google.firebase.firebase-ads";	 Catch:{ Exception -> 0x0027 }
        r3 = "0.0.0";	 Catch:{ Exception -> 0x0027 }
        r4 = "binary";	 Catch:{ Exception -> 0x0027 }
        r1.<init>(r2, r3, r4);	 Catch:{ Exception -> 0x0027 }
        r2 = r1.m13545a();	 Catch:{ Exception -> 0x0027 }
        r0.put(r2, r1);	 Catch:{ Exception -> 0x0027 }
        r1 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ Exception -> 0x0027 }
        r2 = "Fabric";	 Catch:{ Exception -> 0x0027 }
        r3 = "Found kit: com.google.firebase.firebase-ads";	 Catch:{ Exception -> 0x0027 }
        r1.mo3557b(r2, r3);	 Catch:{ Exception -> 0x0027 }
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.e.c():java.util.Map<java.lang.String, io.fabric.sdk.android.j>");
    }

    /* renamed from: d */
    private java.util.Map<java.lang.String, io.fabric.sdk.android.C2773j> m13540d() {
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
        r10 = this;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r10.m13542b();
        r2 = r1.entries();
    L_0x000d:
        r3 = r2.hasMoreElements();
        if (r3 == 0) goto L_0x0063;
    L_0x0013:
        r3 = r2.nextElement();
        r3 = (java.util.zip.ZipEntry) r3;
        r4 = r3.getName();
        r5 = "fabric/";
        r4 = r4.startsWith(r5);
        if (r4 == 0) goto L_0x000d;
    L_0x0025:
        r4 = r3.getName();
        r4 = r4.length();
        r5 = "fabric/";
        r5 = r5.length();
        if (r4 <= r5) goto L_0x000d;
    L_0x0035:
        r3 = r10.m13538a(r3, r1);
        if (r3 == 0) goto L_0x000d;
    L_0x003b:
        r4 = r3.m13545a();
        r0.put(r4, r3);
        r4 = io.fabric.sdk.android.C2766c.m13524h();
        r5 = "Fabric";
        r6 = "Found kit:[%s] version:[%s]";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = r3.m13545a();
        r7[r8] = r9;
        r8 = 1;
        r3 = r3.m13546b();
        r7[r8] = r3;
        r3 = java.lang.String.format(r6, r7);
        r4.mo3557b(r5, r3);
        goto L_0x000d;
    L_0x0063:
        if (r1 == 0) goto L_0x0068;
    L_0x0065:
        r1.close();	 Catch:{ IOException -> 0x0068 }
    L_0x0068:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.e.d():java.util.Map<java.lang.String, io.fabric.sdk.android.j>");
    }

    /* renamed from: a */
    private C2773j m13538a(ZipEntry zipEntry, ZipFile zipFile) {
        Throwable e;
        StringBuilder stringBuilder;
        Closeable inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                Object property = properties.getProperty("fabric-identifier");
                Object property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Invalid format of fabric file,");
                    stringBuilder2.append(zipEntry.getName());
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                C2773j c2773j = new C2773j(property, property2, property3);
                CommonUtils.m13612a(inputStream);
                return c2773j;
            } catch (IOException e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error when parsing fabric properties ");
                    stringBuilder.append(zipEntry.getName());
                    C2766c.m13524h().mo3562e("Fabric", stringBuilder.toString(), e);
                    CommonUtils.m13612a(inputStream);
                    return null;
                } catch (Throwable th) {
                    zipEntry = th;
                    CommonUtils.m13612a(inputStream);
                    throw zipEntry;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error when parsing fabric properties ");
            stringBuilder.append(zipEntry.getName());
            C2766c.m13524h().mo3562e("Fabric", stringBuilder.toString(), e);
            CommonUtils.m13612a(inputStream);
            return null;
        } catch (Throwable th2) {
            zipEntry = th2;
            inputStream = null;
            CommonUtils.m13612a(inputStream);
            throw zipEntry;
        }
    }

    /* renamed from: b */
    protected ZipFile m13542b() {
        return new ZipFile(this.f11822a);
    }
}
