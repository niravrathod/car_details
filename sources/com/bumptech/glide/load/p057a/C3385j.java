package com.bumptech.glide.load.p057a;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C3421g;
import com.bumptech.glide.p055g.C1172c;
import com.bumptech.glide.p055g.C1174e;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.a.j */
public class C3385j implements C1188d<InputStream> {
    /* renamed from: a */
    static final C1193b f14270a = new C3384a();
    /* renamed from: b */
    private final C3421g f14271b;
    /* renamed from: c */
    private final int f14272c;
    /* renamed from: d */
    private final C1193b f14273d;
    /* renamed from: e */
    private HttpURLConnection f14274e;
    /* renamed from: f */
    private InputStream f14275f;
    /* renamed from: g */
    private volatile boolean f14276g;

    /* renamed from: com.bumptech.glide.load.a.j$b */
    interface C1193b {
        /* renamed from: a */
        HttpURLConnection mo968a(URL url);
    }

    /* renamed from: com.bumptech.glide.load.a.j$a */
    private static class C3384a implements C1193b {
        C3384a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo968a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public C3385j(C3421g c3421g, int i) {
        this(c3421g, i, f14270a);
    }

    C3385j(C3421g c3421g, int i, C1193b c1193b) {
        this.f14271b = c3421g;
        this.f14272c = i;
        this.f14273d = c1193b;
    }

    /* renamed from: a */
    public void mo960a(Priority priority, C1187a<? super InputStream> c1187a) {
        long a = C1174e.m4866a();
        try {
            c1187a.mo986a(m17323a(this.f14271b.m17442a(), 0, null, this.f14271b.m17444b()));
            if (Log.isLoggable("HttpUrlFetcher", 2) != null) {
                priority = "HttpUrlFetcher";
                c1187a = new StringBuilder();
                c1187a.append("Finished http url fetcher fetch in ");
                c1187a.append(C1174e.m4865a(a));
                Log.v(priority, c1187a.toString());
            }
        } catch (Exception e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            c1187a.mo985a(e);
            if (Log.isLoggable("HttpUrlFetcher", 2) != null) {
                priority = "HttpUrlFetcher";
                c1187a = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2) != null) {
                priority = new StringBuilder();
                priority.append("Finished http url fetcher fetch in ");
                priority.append(C1174e.m4865a(a));
                Log.v("HttpUrlFetcher", priority.toString());
            }
        }
    }

    /* renamed from: a */
    private java.io.InputStream m17323a(java.net.URL r4, int r5, java.net.URL r6, java.util.Map<java.lang.String, java.lang.String> r7) {
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
        r3 = this;
        r0 = 5;
        if (r5 >= r0) goto L_0x00ce;
    L_0x0003:
        if (r6 == 0) goto L_0x001c;
    L_0x0005:
        r0 = r4.toURI();	 Catch:{ URISyntaxException -> 0x001c }
        r6 = r6.toURI();	 Catch:{ URISyntaxException -> 0x001c }
        r6 = r0.equals(r6);	 Catch:{ URISyntaxException -> 0x001c }
        if (r6 != 0) goto L_0x0014;	 Catch:{ URISyntaxException -> 0x001c }
    L_0x0013:
        goto L_0x001c;	 Catch:{ URISyntaxException -> 0x001c }
    L_0x0014:
        r6 = new com.bumptech.glide.load.HttpException;	 Catch:{ URISyntaxException -> 0x001c }
        r0 = "In re-direct loop";	 Catch:{ URISyntaxException -> 0x001c }
        r6.<init>(r0);	 Catch:{ URISyntaxException -> 0x001c }
        throw r6;	 Catch:{ URISyntaxException -> 0x001c }
    L_0x001c:
        r6 = r3.f14273d;
        r6 = r6.mo968a(r4);
        r3.f14274e = r6;
        r6 = r7.entrySet();
        r6 = r6.iterator();
    L_0x002c:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0032:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r3.f14274e;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r1.addRequestProperty(r2, r0);
        goto L_0x002c;
    L_0x004a:
        r6 = r3.f14274e;
        r0 = r3.f14272c;
        r6.setConnectTimeout(r0);
        r6 = r3.f14274e;
        r0 = r3.f14272c;
        r6.setReadTimeout(r0);
        r6 = r3.f14274e;
        r0 = 0;
        r6.setUseCaches(r0);
        r6 = r3.f14274e;
        r1 = 1;
        r6.setDoInput(r1);
        r6 = r3.f14274e;
        r6.setInstanceFollowRedirects(r0);
        r6 = r3.f14274e;
        r6.connect();
        r6 = r3.f14274e;
        r6 = r6.getInputStream();
        r3.f14275f = r6;
        r6 = r3.f14276g;
        if (r6 == 0) goto L_0x007c;
    L_0x007a:
        r4 = 0;
        return r4;
    L_0x007c:
        r6 = r3.f14274e;
        r6 = r6.getResponseCode();
        r0 = com.bumptech.glide.load.p057a.C3385j.m17324a(r6);
        if (r0 == 0) goto L_0x008f;
    L_0x0088:
        r4 = r3.f14274e;
        r4 = r3.m17322a(r4);
        return r4;
    L_0x008f:
        r0 = com.bumptech.glide.load.p057a.C3385j.m17325b(r6);
        if (r0 == 0) goto L_0x00b9;
    L_0x0095:
        r6 = r3.f14274e;
        r0 = "Location";
        r6 = r6.getHeaderField(r0);
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x00b1;
    L_0x00a3:
        r0 = new java.net.URL;
        r0.<init>(r4, r6);
        r3.mo961b();
        r5 = r5 + r1;
        r4 = r3.m17323a(r0, r5, r4, r7);
        return r4;
    L_0x00b1:
        r4 = new com.bumptech.glide.load.HttpException;
        r5 = "Received empty or null redirect url";
        r4.<init>(r5);
        throw r4;
    L_0x00b9:
        r4 = -1;
        if (r6 != r4) goto L_0x00c2;
    L_0x00bc:
        r4 = new com.bumptech.glide.load.HttpException;
        r4.<init>(r6);
        throw r4;
    L_0x00c2:
        r4 = new com.bumptech.glide.load.HttpException;
        r5 = r3.f14274e;
        r5 = r5.getResponseMessage();
        r4.<init>(r5, r6);
        throw r4;
    L_0x00ce:
        r4 = new com.bumptech.glide.load.HttpException;
        r5 = "Too many (> 5) redirects!";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.j.a(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }

    /* renamed from: a */
    private static boolean m17324a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: b */
    private static boolean m17325b(int i) {
        return i / 100 == 3;
    }

    /* renamed from: a */
    private InputStream m17322a(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f14275f = C1172c.m4860a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got non empty content encoding: ");
                stringBuilder.append(httpURLConnection.getContentEncoding());
                Log.d("HttpUrlFetcher", stringBuilder.toString());
            }
            this.f14275f = httpURLConnection.getInputStream();
        }
        return this.f14275f;
    }

    /* renamed from: b */
    public void mo961b() {
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
        r1 = this;
        r0 = r1.f14275f;
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = r1.f14275f;	 Catch:{ IOException -> 0x000a }
        r0.close();	 Catch:{ IOException -> 0x000a }
        goto L_0x000b;
    L_0x000b:
        r0 = r1.f14274e;
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        r0 = r1.f14274e;
        r0.disconnect();
    L_0x0014:
        r0 = 0;
        r1.f14274e = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.j.b():void");
    }

    /* renamed from: c */
    public void mo962c() {
        this.f14276g = true;
    }

    /* renamed from: a */
    public Class<InputStream> mo959a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public DataSource mo963d() {
        return DataSource.REMOTE;
    }
}
