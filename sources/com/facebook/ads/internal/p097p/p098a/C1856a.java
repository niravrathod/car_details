package com.facebook.ads.internal.p097p.p098a;

import android.os.Build.VERSION;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.facebook.ads.internal.p.a.a */
public class C1856a {
    /* renamed from: f */
    private static int[] f5681f = new int[20];
    /* renamed from: g */
    private static final String f5682g = C1856a.class.getSimpleName();
    /* renamed from: a */
    protected final C1866q f5683a = new C46011(this);
    /* renamed from: b */
    protected final C1859d f5684b = new C3814e();
    /* renamed from: c */
    protected C1867r f5685c = new C3816g();
    /* renamed from: d */
    protected int f5686d = 2000;
    /* renamed from: e */
    protected int f5687e = 8000;
    /* renamed from: h */
    private int f5688h = 3;
    /* renamed from: i */
    private Map<String, String> f5689i = new TreeMap();
    /* renamed from: j */
    private boolean f5690j;
    /* renamed from: k */
    private Set<String> f5691k;
    /* renamed from: l */
    private Set<String> f5692l;

    /* renamed from: com.facebook.ads.internal.p.a.a$1 */
    class C46011 extends C3815f {
        /* renamed from: a */
        final /* synthetic */ C1856a f19128a;

        C46011(C1856a c1856a) {
            this.f19128a = c1856a;
        }
    }

    static {
        C1856a.m7080c();
        if (VERSION.SDK_INT > 8) {
            C1856a.m7079a();
        }
    }

    /* renamed from: a */
    public static void m7079a() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    /* renamed from: c */
    private static void m7080c() {
        if (VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    /* renamed from: c */
    private void m7081c(HttpURLConnection httpURLConnection) {
        for (String str : this.f5689i.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) this.f5689i.get(str));
        }
    }

    /* renamed from: a */
    protected int m7082a(int i) {
        return f5681f[i + 2] * 1000;
    }

    /* renamed from: a */
    protected int m7083a(java.net.HttpURLConnection r3, byte[] r4) {
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
        r2 = this;
        r0 = 0;
        r1 = r2.f5683a;	 Catch:{ all -> 0x001b }
        r1 = r1.mo1380a(r3);	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x0011;
    L_0x0009:
        r0 = r2.f5683a;	 Catch:{ all -> 0x000f }
        r0.mo1382a(r1, r4);	 Catch:{ all -> 0x000f }
        goto L_0x0011;	 Catch:{ all -> 0x000f }
    L_0x000f:
        r3 = move-exception;	 Catch:{ all -> 0x000f }
        goto L_0x001d;	 Catch:{ all -> 0x000f }
    L_0x0011:
        r3 = r3.getResponseCode();	 Catch:{ all -> 0x000f }
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        r1.close();	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return r3;
    L_0x001b:
        r3 = move-exception;
        r1 = r0;
    L_0x001d:
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();	 Catch:{ Exception -> 0x0022 }
    L_0x0022:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.a.a.a(java.net.HttpURLConnection, byte[]):int");
    }

    /* renamed from: a */
    public C1856a m7084a(String str, String str2) {
        this.f5689i.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public com.facebook.ads.internal.p097p.p098a.C1863n m7085a(com.facebook.ads.internal.p097p.p098a.C1861l r10) {
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
        r9 = this;
        r0 = java.lang.System.currentTimeMillis();
        r2 = 0;
    L_0x0005:
        r3 = r9.f5688h;
        if (r2 >= r3) goto L_0x008b;
    L_0x0009:
        r3 = r9.m7082a(r2);	 Catch:{ m -> 0x0063 }
        r9.m7101c(r3);	 Catch:{ m -> 0x0063 }
        r3 = r9.f5685c;	 Catch:{ m -> 0x0063 }
        r3 = r3.mo1390a();	 Catch:{ m -> 0x0063 }
        if (r3 == 0) goto L_0x0041;	 Catch:{ m -> 0x0063 }
    L_0x0018:
        r3 = r9.f5685c;	 Catch:{ m -> 0x0063 }
        r4 = new java.lang.StringBuilder;	 Catch:{ m -> 0x0063 }
        r4.<init>();	 Catch:{ m -> 0x0063 }
        r5 = r2 + 1;	 Catch:{ m -> 0x0063 }
        r4.append(r5);	 Catch:{ m -> 0x0063 }
        r5 = "of";	 Catch:{ m -> 0x0063 }
        r4.append(r5);	 Catch:{ m -> 0x0063 }
        r5 = r9.f5688h;	 Catch:{ m -> 0x0063 }
        r4.append(r5);	 Catch:{ m -> 0x0063 }
        r5 = ", trying ";	 Catch:{ m -> 0x0063 }
        r4.append(r5);	 Catch:{ m -> 0x0063 }
        r5 = r10.m7109a();	 Catch:{ m -> 0x0063 }
        r4.append(r5);	 Catch:{ m -> 0x0063 }
        r4 = r4.toString();	 Catch:{ m -> 0x0063 }
        r3.mo1388a(r4);	 Catch:{ m -> 0x0063 }
    L_0x0041:
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ m -> 0x0063 }
        r0 = r10.m7109a();	 Catch:{ m -> 0x005e }
        r1 = r10.m7110b();	 Catch:{ m -> 0x005e }
        r5 = r10.m7111c();	 Catch:{ m -> 0x005e }
        r6 = r10.m7112d();	 Catch:{ m -> 0x005e }
        r0 = r9.m7086a(r0, r1, r5, r6);	 Catch:{ m -> 0x005e }
        if (r0 == 0) goto L_0x005c;
    L_0x005b:
        return r0;
    L_0x005c:
        r0 = r3;
        goto L_0x0085;
    L_0x005e:
        r0 = move-exception;
        r7 = r3;
        r3 = r0;
        r0 = r7;
        goto L_0x0064;
    L_0x0063:
        r3 = move-exception;
    L_0x0064:
        r4 = r9.m7094a(r3, r0);
        if (r4 == 0) goto L_0x0071;
    L_0x006a:
        r4 = r9.f5688h;
        r4 = r4 + -1;
        if (r2 >= r4) goto L_0x0071;
    L_0x0070:
        goto L_0x0085;
    L_0x0071:
        r4 = r9.f5683a;
        r4 = r4.mo1384a(r3);
        if (r4 == 0) goto L_0x008a;
    L_0x0079:
        r4 = r9.f5688h;
        r4 = r4 + -1;
        if (r2 >= r4) goto L_0x008a;
    L_0x007f:
        r4 = r9.f5686d;	 Catch:{ InterruptedException -> 0x0089 }
        r4 = (long) r4;	 Catch:{ InterruptedException -> 0x0089 }
        java.lang.Thread.sleep(r4);	 Catch:{ InterruptedException -> 0x0089 }
    L_0x0085:
        r2 = r2 + 1;
        goto L_0x0005;
    L_0x0089:
        throw r3;
    L_0x008a:
        throw r3;
    L_0x008b:
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.a.a.a(com.facebook.ads.internal.p.a.l):com.facebook.ads.internal.p.a.n");
    }

    /* renamed from: a */
    protected com.facebook.ads.internal.p097p.p098a.C1863n m7086a(java.lang.String r4, com.facebook.ads.internal.p097p.p098a.C1860j r5, java.lang.String r6, byte[] r7) {
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
        r0 = 0;
        r1 = 0;
        r3.f5690j = r0;	 Catch:{ Exception -> 0x008e, all -> 0x008b }
        r4 = r3.m7089a(r4);	 Catch:{ Exception -> 0x008e, all -> 0x008b }
        r3.m7092a(r4, r5, r6);	 Catch:{ Exception -> 0x0089 }
        r3.m7081c(r4);	 Catch:{ Exception -> 0x0089 }
        r5 = r3.f5685c;	 Catch:{ Exception -> 0x0089 }
        r5 = r5.mo1390a();	 Catch:{ Exception -> 0x0089 }
        if (r5 == 0) goto L_0x001b;	 Catch:{ Exception -> 0x0089 }
    L_0x0016:
        r5 = r3.f5685c;	 Catch:{ Exception -> 0x0089 }
        r5.mo1389a(r4, r7);	 Catch:{ Exception -> 0x0089 }
    L_0x001b:
        r4.connect();	 Catch:{ Exception -> 0x0089 }
        r5 = 1;	 Catch:{ Exception -> 0x0089 }
        r3.f5690j = r5;	 Catch:{ Exception -> 0x0089 }
        r6 = r3.f5692l;	 Catch:{ Exception -> 0x0089 }
        if (r6 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0089 }
    L_0x0025:
        r6 = r3.f5692l;	 Catch:{ Exception -> 0x0089 }
        r6 = r6.isEmpty();	 Catch:{ Exception -> 0x0089 }
        if (r6 != 0) goto L_0x002f;	 Catch:{ Exception -> 0x0089 }
    L_0x002d:
        r6 = 1;	 Catch:{ Exception -> 0x0089 }
        goto L_0x0030;	 Catch:{ Exception -> 0x0089 }
    L_0x002f:
        r6 = 0;	 Catch:{ Exception -> 0x0089 }
    L_0x0030:
        r2 = r3.f5691k;	 Catch:{ Exception -> 0x0089 }
        if (r2 == 0) goto L_0x003d;	 Catch:{ Exception -> 0x0089 }
    L_0x0034:
        r2 = r3.f5691k;	 Catch:{ Exception -> 0x0089 }
        r2 = r2.isEmpty();	 Catch:{ Exception -> 0x0089 }
        if (r2 != 0) goto L_0x003d;	 Catch:{ Exception -> 0x0089 }
    L_0x003c:
        goto L_0x003e;	 Catch:{ Exception -> 0x0089 }
    L_0x003d:
        r5 = 0;	 Catch:{ Exception -> 0x0089 }
    L_0x003e:
        r0 = r4 instanceof javax.net.ssl.HttpsURLConnection;	 Catch:{ Exception -> 0x0089 }
        if (r0 == 0) goto L_0x0059;
    L_0x0042:
        if (r6 != 0) goto L_0x0046;
    L_0x0044:
        if (r5 == 0) goto L_0x0059;
    L_0x0046:
        r5 = r4;	 Catch:{ Exception -> 0x0051 }
        r5 = (javax.net.ssl.HttpsURLConnection) r5;	 Catch:{ Exception -> 0x0051 }
        r6 = r3.f5692l;	 Catch:{ Exception -> 0x0051 }
        r0 = r3.f5691k;	 Catch:{ Exception -> 0x0051 }
        com.facebook.ads.internal.p097p.p098a.C1864o.m7120a(r5, r6, r0);	 Catch:{ Exception -> 0x0051 }
        goto L_0x0059;
    L_0x0051:
        r5 = move-exception;
        r6 = f5682g;	 Catch:{ Exception -> 0x0089 }
        r0 = "Unable to validate SSL certificates.";	 Catch:{ Exception -> 0x0089 }
        android.util.Log.e(r6, r0, r5);	 Catch:{ Exception -> 0x0089 }
    L_0x0059:
        r5 = r4.getDoOutput();	 Catch:{ Exception -> 0x0089 }
        if (r5 == 0) goto L_0x0064;	 Catch:{ Exception -> 0x0089 }
    L_0x005f:
        if (r7 == 0) goto L_0x0064;	 Catch:{ Exception -> 0x0089 }
    L_0x0061:
        r3.m7083a(r4, r7);	 Catch:{ Exception -> 0x0089 }
    L_0x0064:
        r5 = r4.getDoInput();	 Catch:{ Exception -> 0x0089 }
        if (r5 == 0) goto L_0x006f;	 Catch:{ Exception -> 0x0089 }
    L_0x006a:
        r5 = r3.m7088a(r4);	 Catch:{ Exception -> 0x0089 }
        goto L_0x0074;	 Catch:{ Exception -> 0x0089 }
    L_0x006f:
        r5 = new com.facebook.ads.internal.p.a.n;	 Catch:{ Exception -> 0x0089 }
        r5.<init>(r4, r1);	 Catch:{ Exception -> 0x0089 }
    L_0x0074:
        r6 = r3.f5685c;
        r6 = r6.mo1390a();
        if (r6 == 0) goto L_0x0081;
    L_0x007c:
        r6 = r3.f5685c;
        r6.mo1387a(r5);
    L_0x0081:
        if (r4 == 0) goto L_0x0086;
    L_0x0083:
        r4.disconnect();
    L_0x0086:
        return r5;
    L_0x0087:
        r5 = move-exception;
        goto L_0x00c7;
    L_0x0089:
        r5 = move-exception;
        goto L_0x0090;
    L_0x008b:
        r5 = move-exception;
        r4 = r1;
        goto L_0x00c7;
    L_0x008e:
        r5 = move-exception;
        r4 = r1;
    L_0x0090:
        r6 = r3.m7097b(r4);	 Catch:{ Exception -> 0x00b8 }
        if (r6 == 0) goto L_0x00b2;
    L_0x0096:
        r7 = r6.m7114a();	 Catch:{ all -> 0x00af }
        if (r7 <= 0) goto L_0x00b2;
    L_0x009c:
        r5 = r3.f5685c;
        r5 = r5.mo1390a();
        if (r5 == 0) goto L_0x00a9;
    L_0x00a4:
        r5 = r3.f5685c;
        r5.mo1387a(r6);
    L_0x00a9:
        if (r4 == 0) goto L_0x00ae;
    L_0x00ab:
        r4.disconnect();
    L_0x00ae:
        return r6;
    L_0x00af:
        r5 = move-exception;
        r1 = r6;
        goto L_0x00c7;
    L_0x00b2:
        r7 = new com.facebook.ads.internal.p.a.m;	 Catch:{ all -> 0x00af }
        r7.<init>(r5, r6);	 Catch:{ all -> 0x00af }
        throw r7;	 Catch:{ all -> 0x00af }
    L_0x00b8:
        r5.printStackTrace();	 Catch:{ all -> 0x00c1 }
        r6 = new com.facebook.ads.internal.p.a.m;	 Catch:{ all -> 0x0087 }
        r6.<init>(r5, r1);	 Catch:{ all -> 0x0087 }
        throw r6;	 Catch:{ all -> 0x0087 }
    L_0x00c1:
        r6 = new com.facebook.ads.internal.p.a.m;	 Catch:{ all -> 0x0087 }
        r6.<init>(r5, r1);	 Catch:{ all -> 0x0087 }
        throw r6;	 Catch:{ all -> 0x0087 }
    L_0x00c7:
        r6 = r3.f5685c;
        r6 = r6.mo1390a();
        if (r6 == 0) goto L_0x00d4;
    L_0x00cf:
        r6 = r3.f5685c;
        r6.mo1387a(r1);
    L_0x00d4:
        if (r4 == 0) goto L_0x00d9;
    L_0x00d6:
        r4.disconnect();
    L_0x00d9:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.a.a.a(java.lang.String, com.facebook.ads.internal.p.a.j, java.lang.String, byte[]):com.facebook.ads.internal.p.a.n");
    }

    /* renamed from: a */
    public C1863n m7087a(String str, C1865p c1865p) {
        return m7095b(new C3818i(str, c1865p));
    }

    /* renamed from: a */
    protected com.facebook.ads.internal.p097p.p098a.C1863n m7088a(java.net.HttpURLConnection r4) {
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
        r0 = 0;
        r1 = r3.f5683a;	 Catch:{ all -> 0x001d }
        r1 = r1.mo1386b(r4);	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0009:
        r0 = r3.f5683a;	 Catch:{ all -> 0x0010 }
        r0 = r0.mo1385a(r1);	 Catch:{ all -> 0x0010 }
        goto L_0x0012;	 Catch:{ all -> 0x0010 }
    L_0x0010:
        r4 = move-exception;	 Catch:{ all -> 0x0010 }
        goto L_0x001f;	 Catch:{ all -> 0x0010 }
    L_0x0012:
        r2 = new com.facebook.ads.internal.p.a.n;	 Catch:{ all -> 0x0010 }
        r2.<init>(r4, r0);	 Catch:{ all -> 0x0010 }
        if (r1 == 0) goto L_0x001c;
    L_0x0019:
        r1.close();	 Catch:{ Exception -> 0x001c }
    L_0x001c:
        return r2;
    L_0x001d:
        r4 = move-exception;
        r1 = r0;
    L_0x001f:
        if (r1 == 0) goto L_0x0024;
    L_0x0021:
        r1.close();	 Catch:{ Exception -> 0x0024 }
    L_0x0024:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.a.a.a(java.net.HttpURLConnection):com.facebook.ads.internal.p.a.n");
    }

    /* renamed from: a */
    protected HttpURLConnection m7089a(String str) {
        try {
            URL url = new URL(str);
            return this.f5683a.mo1381a(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" is not a valid URL");
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: a */
    protected void m7090a(C1861l c1861l, C1857b c1857b) {
        this.f5684b.mo1379a(this, c1857b).mo1391a(c1861l);
    }

    /* renamed from: a */
    public void m7091a(String str, C1865p c1865p, C1857b c1857b) {
        m7090a(new C3819k(str, c1865p), c1857b);
    }

    /* renamed from: a */
    protected void m7092a(HttpURLConnection httpURLConnection, C1860j c1860j, String str) {
        httpURLConnection.setConnectTimeout(this.f5686d);
        httpURLConnection.setReadTimeout(this.f5687e);
        this.f5683a.mo1383a(httpURLConnection, c1860j, str);
    }

    /* renamed from: a */
    public void m7093a(Set<String> set) {
        this.f5692l = set;
    }

    /* renamed from: a */
    protected boolean m7094a(Throwable th, long j) {
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.f5685c.mo1390a()) {
            C1867r c1867r = this.f5685c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ELAPSED TIME = ");
            stringBuilder.append(currentTimeMillis);
            stringBuilder.append(", CT = ");
            stringBuilder.append(this.f5686d);
            stringBuilder.append(", RT = ");
            stringBuilder.append(this.f5687e);
            c1867r.mo1388a(stringBuilder.toString());
        }
        boolean z = false;
        if (this.f5690j) {
            if (currentTimeMillis >= ((long) this.f5687e)) {
                z = true;
            }
            return z;
        }
        if (currentTimeMillis >= ((long) this.f5686d)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public C1863n m7095b(C1861l c1861l) {
        try {
            return m7086a(c1861l.m7109a(), c1861l.m7110b(), c1861l.m7111c(), c1861l.m7112d());
        } catch (C1862m e) {
            this.f5683a.mo1384a(e);
            return null;
        } catch (Exception e2) {
            this.f5683a.mo1384a(new C1862m(e2, null));
            return null;
        }
    }

    /* renamed from: b */
    public C1863n m7096b(String str, C1865p c1865p) {
        return m7095b(new C3819k(str, c1865p));
    }

    /* renamed from: b */
    protected com.facebook.ads.internal.p097p.p098a.C1863n m7097b(java.net.HttpURLConnection r4) {
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
        r0 = 0;
        r1 = r4.getErrorStream();	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x0010;
    L_0x0007:
        r0 = r3.f5683a;	 Catch:{ all -> 0x000e }
        r0 = r0.mo1385a(r1);	 Catch:{ all -> 0x000e }
        goto L_0x0010;	 Catch:{ all -> 0x000e }
    L_0x000e:
        r4 = move-exception;	 Catch:{ all -> 0x000e }
        goto L_0x001d;	 Catch:{ all -> 0x000e }
    L_0x0010:
        r2 = new com.facebook.ads.internal.p.a.n;	 Catch:{ all -> 0x000e }
        r2.<init>(r4, r0);	 Catch:{ all -> 0x000e }
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        r1.close();	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        return r2;
    L_0x001b:
        r4 = move-exception;
        r1 = r0;
    L_0x001d:
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();	 Catch:{ Exception -> 0x0022 }
    L_0x0022:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.a.a.b(java.net.HttpURLConnection):com.facebook.ads.internal.p.a.n");
    }

    /* renamed from: b */
    public C1865p m7098b() {
        return new C1865p();
    }

    /* renamed from: b */
    public void m7099b(int i) {
        if (i < 1 || i > 18) {
            throw new IllegalArgumentException("Maximum retries must be between 1 and 18");
        }
        this.f5688h = i;
    }

    /* renamed from: b */
    public void m7100b(Set<String> set) {
        this.f5691k = set;
    }

    /* renamed from: c */
    public void m7101c(int i) {
        this.f5686d = i;
    }
}
