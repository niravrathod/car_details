package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.SSLSocketFactory;

public final class zzas extends zzai {
    /* renamed from: a */
    private final zzau f19922a;
    /* renamed from: b */
    private final SSLSocketFactory f19923b;

    public zzas() {
        this(null);
    }

    private zzas(zzau zzau) {
        this(null, null);
    }

    private zzas(zzau zzau, SSLSocketFactory sSLSocketFactory) {
        this.f19922a = null;
        this.f19923b = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final com.google.android.gms.internal.ads.zzaq mo4152a(com.google.android.gms.internal.ads.zzr<?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        r6 = this;
        r0 = r7.m11034e();
        r1 = new java.util.HashMap;
        r1.<init>();
        r1.putAll(r8);
        r8 = r7.mo4155b();
        r1.putAll(r8);
        r8 = r6.f19922a;
        if (r8 == 0) goto L_0x003c;
    L_0x0017:
        r8 = r6.f19922a;
        r8 = r8.m10139a(r0);
        if (r8 != 0) goto L_0x003d;
    L_0x001f:
        r7 = new java.io.IOException;
        r8 = "URL blocked by rewriter: ";
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        if (r1 == 0) goto L_0x0032;
    L_0x002d:
        r8 = r8.concat(r0);
        goto L_0x0038;
    L_0x0032:
        r0 = new java.lang.String;
        r0.<init>(r8);
        r8 = r0;
    L_0x0038:
        r7.<init>(r8);
        throw r7;
    L_0x003c:
        r8 = r0;
    L_0x003d:
        r0 = new java.net.URL;
        r0.<init>(r8);
        r8 = r0.openConnection();
        r8 = (java.net.HttpURLConnection) r8;
        r2 = java.net.HttpURLConnection.getFollowRedirects();
        r8.setInstanceFollowRedirects(r2);
        r2 = r7.m11039j();
        r8.setConnectTimeout(r2);
        r8.setReadTimeout(r2);
        r2 = 0;
        r8.setUseCaches(r2);
        r3 = 1;
        r8.setDoInput(r3);
        r4 = "https";
        r0 = r0.getProtocol();
        r4.equals(r0);
        r0 = r1.keySet();	 Catch:{ all -> 0x0127 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0127 }
    L_0x0072:
        r4 = r0.hasNext();	 Catch:{ all -> 0x0127 }
        if (r4 == 0) goto L_0x0088;
    L_0x0078:
        r4 = r0.next();	 Catch:{ all -> 0x0127 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0127 }
        r5 = r1.get(r4);	 Catch:{ all -> 0x0127 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x0127 }
        r8.setRequestProperty(r4, r5);	 Catch:{ all -> 0x0127 }
        goto L_0x0072;
    L_0x0088:
        r0 = r7.m11031c();	 Catch:{ all -> 0x0127 }
        switch(r0) {
            case -1: goto L_0x00cb;
            case 0: goto L_0x00c6;
            case 1: goto L_0x00bd;
            case 2: goto L_0x00b4;
            case 3: goto L_0x00ae;
            case 4: goto L_0x00a8;
            case 5: goto L_0x00a2;
            case 6: goto L_0x009c;
            case 7: goto L_0x0093;
            default: goto L_0x008f;
        };	 Catch:{ all -> 0x0127 }
    L_0x008f:
        r7 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0127 }
        goto L_0x0121;
    L_0x0093:
        r0 = "PATCH";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        m26305a(r8, r7);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x009c:
        r0 = "TRACE";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x00a2:
        r0 = "OPTIONS";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x00a8:
        r0 = "HEAD";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x00ae:
        r0 = "DELETE";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x00b4:
        r0 = "PUT";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        m26305a(r8, r7);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x00bd:
        r0 = "POST";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
        m26305a(r8, r7);	 Catch:{ all -> 0x0127 }
        goto L_0x00cb;
    L_0x00c6:
        r0 = "GET";
        r8.setRequestMethod(r0);	 Catch:{ all -> 0x0127 }
    L_0x00cb:
        r0 = r8.getResponseCode();	 Catch:{ all -> 0x0127 }
        r1 = -1;
        if (r0 == r1) goto L_0x0119;
    L_0x00d2:
        r7 = r7.m11031c();	 Catch:{ all -> 0x0127 }
        r1 = 4;
        if (r7 == r1) goto L_0x00eb;
    L_0x00d9:
        r7 = 100;
        if (r7 > r0) goto L_0x00e1;
    L_0x00dd:
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 < r7) goto L_0x00eb;
    L_0x00e1:
        r7 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r0 == r7) goto L_0x00eb;
    L_0x00e5:
        r7 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r0 == r7) goto L_0x00eb;
    L_0x00e9:
        r7 = 1;
        goto L_0x00ec;
    L_0x00eb:
        r7 = 0;
    L_0x00ec:
        if (r7 != 0) goto L_0x00ff;
    L_0x00ee:
        r7 = new com.google.android.gms.internal.ads.zzaq;	 Catch:{ all -> 0x0127 }
        r1 = r8.getHeaderFields();	 Catch:{ all -> 0x0127 }
        r1 = m26304a(r1);	 Catch:{ all -> 0x0127 }
        r7.<init>(r0, r1);	 Catch:{ all -> 0x0127 }
        r8.disconnect();
        return r7;
    L_0x00ff:
        r7 = new com.google.android.gms.internal.ads.zzaq;	 Catch:{ all -> 0x0116 }
        r1 = r8.getHeaderFields();	 Catch:{ all -> 0x0116 }
        r1 = m26304a(r1);	 Catch:{ all -> 0x0116 }
        r2 = r8.getContentLength();	 Catch:{ all -> 0x0116 }
        r4 = new com.google.android.gms.internal.ads.hb;	 Catch:{ all -> 0x0116 }
        r4.<init>(r8);	 Catch:{ all -> 0x0116 }
        r7.<init>(r0, r1, r2, r4);	 Catch:{ all -> 0x0116 }
        return r7;
    L_0x0116:
        r7 = move-exception;
        r2 = 1;
        goto L_0x0128;
    L_0x0119:
        r7 = new java.io.IOException;	 Catch:{ all -> 0x0127 }
        r0 = "Could not retrieve response code from HttpUrlConnection.";
        r7.<init>(r0);	 Catch:{ all -> 0x0127 }
        throw r7;	 Catch:{ all -> 0x0127 }
    L_0x0121:
        r0 = "Unknown method type.";
        r7.<init>(r0);	 Catch:{ all -> 0x0127 }
        throw r7;	 Catch:{ all -> 0x0127 }
    L_0x0127:
        r7 = move-exception;
    L_0x0128:
        if (r2 != 0) goto L_0x012d;
    L_0x012a:
        r8.disconnect();
    L_0x012d:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzas.a(com.google.android.gms.internal.ads.zzr, java.util.Map):com.google.android.gms.internal.ads.zzaq");
    }

    /* renamed from: a */
    private static List<zzl> m26304a(Map<String, List<String>> map) {
        List<zzl> arrayList = new ArrayList(map.size());
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            if (entry.getKey() != null) {
                for (String zzl : (List) entry.getValue()) {
                    arrayList.add(new zzl((String) entry.getKey(), zzl));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static java.io.InputStream m26306b(java.net.HttpURLConnection r1) {
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
        r0 = r1.getInputStream();	 Catch:{ IOException -> 0x0005 }
        goto L_0x0009;
    L_0x0005:
        r0 = r1.getErrorStream();
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzas.b(java.net.HttpURLConnection):java.io.InputStream");
    }

    /* renamed from: a */
    private static void m26305a(HttpURLConnection httpURLConnection, zzr<?> zzr) {
        zzr = zzr.mo4154a();
        if (zzr != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                String str = "Content-Type";
                String str2 = "application/x-www-form-urlencoded; charset=";
                String valueOf = String.valueOf("UTF-8");
                httpURLConnection.setRequestProperty(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(zzr);
            dataOutputStream.close();
        }
    }
}
