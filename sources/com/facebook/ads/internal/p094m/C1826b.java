package com.facebook.ads.internal.p094m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.p093l.C1820a;
import com.facebook.ads.internal.p097p.p098a.C1856a;
import com.facebook.ads.internal.p101q.p104c.C1948d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.m.b */
public class C1826b {
    /* renamed from: a */
    private static final String f5526a = "b";
    /* renamed from: b */
    private final C1825a f5527b;
    /* renamed from: c */
    private final Context f5528c;
    /* renamed from: d */
    private final ThreadPoolExecutor f5529d;
    /* renamed from: e */
    private final ConnectivityManager f5530e;
    /* renamed from: f */
    private final C1856a f5531f;
    /* renamed from: g */
    private final Handler f5532g;
    /* renamed from: h */
    private final long f5533h;
    /* renamed from: i */
    private final long f5534i;
    /* renamed from: j */
    private final Runnable f5535j = new C18231(this);
    /* renamed from: k */
    private final Runnable f5536k = new C18242(this);
    /* renamed from: l */
    private volatile boolean f5537l;
    /* renamed from: m */
    private int f5538m;
    /* renamed from: n */
    private long f5539n;

    /* renamed from: com.facebook.ads.internal.m.b$1 */
    class C18231 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1826b f5524a;

        C18231(C1826b c1826b) {
            this.f5524a = c1826b;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.f5524a;
            com.facebook.ads.internal.p094m.C1826b.m6898a(r0);
            r0 = r5.f5524a;
            r0 = r0.f5539n;
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x001a;
        L_0x0011:
            r0 = r5.f5524a;	 Catch:{ InterruptedException -> 0x001a }
            r0 = r0.f5539n;	 Catch:{ InterruptedException -> 0x001a }
            java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x001a }
        L_0x001a:
            r0 = r5.f5524a;
            r0.m6905d();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.m.b.1.run():void");
        }
    }

    /* renamed from: com.facebook.ads.internal.m.b$2 */
    class C18242 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1826b f5525a;

        C18242(C1826b c1826b) {
            this.f5525a = c1826b;
        }

        public void run() {
            this.f5525a.f5537l = false;
            if (this.f5525a.f5529d.getQueue().isEmpty()) {
                this.f5525a.f5529d.execute(this.f5525a.f5535j);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.m.b$a */
    interface C1825a {
        /* renamed from: a */
        JSONObject mo1366a();

        /* renamed from: a */
        boolean mo1367a(JSONArray jSONArray);

        /* renamed from: b */
        void mo1368b();

        /* renamed from: b */
        void mo1369b(JSONArray jSONArray);

        /* renamed from: c */
        boolean mo1370c();
    }

    C1826b(Context context, C1825a c1825a) {
        this.f5527b = c1825a;
        this.f5528c = context;
        this.f5529d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f5530e = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5531f = C1948d.m7359b(context);
        this.f5532g = new Handler(Looper.getMainLooper());
        this.f5533h = C1820a.m6858m(context);
        this.f5534i = C1820a.m6859n(context);
    }

    /* renamed from: a */
    static /* synthetic */ int m6898a(C1826b c1826b) {
        int i = c1826b.f5538m + 1;
        c1826b.f5538m = i;
        return i;
    }

    /* renamed from: a */
    private void m6899a(long j) {
        this.f5532g.postDelayed(this.f5536k, j);
    }

    /* renamed from: c */
    private void m6902c() {
        if (this.f5538m >= 5) {
            m6907e();
            m6909b();
            return;
        }
        this.f5539n = this.f5538m == 1 ? 2000 : this.f5539n * 2;
        m6908a();
    }

    /* renamed from: d */
    private void m6905d() {
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
        r4 = this;
        r0 = r4.f5530e;	 Catch:{ Exception -> 0x00aa }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ Exception -> 0x00aa }
        if (r0 == 0) goto L_0x00a4;	 Catch:{ Exception -> 0x00aa }
    L_0x0008:
        r0 = r0.isConnectedOrConnecting();	 Catch:{ Exception -> 0x00aa }
        if (r0 != 0) goto L_0x0010;	 Catch:{ Exception -> 0x00aa }
    L_0x000e:
        goto L_0x00a4;	 Catch:{ Exception -> 0x00aa }
    L_0x0010:
        r0 = r4.f5527b;	 Catch:{ Exception -> 0x00aa }
        r0 = r0.mo1366a();	 Catch:{ Exception -> 0x00aa }
        if (r0 != 0) goto L_0x001c;	 Catch:{ Exception -> 0x00aa }
    L_0x0018:
        r4.m6907e();	 Catch:{ Exception -> 0x00aa }
        return;	 Catch:{ Exception -> 0x00aa }
    L_0x001c:
        r1 = new org.json.JSONObject;	 Catch:{ Exception -> 0x00aa }
        r1.<init>();	 Catch:{ Exception -> 0x00aa }
        r2 = "attempt";	 Catch:{ Exception -> 0x00aa }
        r3 = r4.f5538m;	 Catch:{ Exception -> 0x00aa }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x00aa }
        r1.put(r2, r3);	 Catch:{ Exception -> 0x00aa }
        r2 = "data";	 Catch:{ Exception -> 0x00aa }
        r0.put(r2, r1);	 Catch:{ Exception -> 0x00aa }
        r1 = new com.facebook.ads.internal.p.a.p;	 Catch:{ Exception -> 0x00aa }
        r1.<init>();	 Catch:{ Exception -> 0x00aa }
        r2 = "payload";	 Catch:{ Exception -> 0x00aa }
        r3 = r0.toString();	 Catch:{ Exception -> 0x00aa }
        r1.m7124a(r2, r3);	 Catch:{ Exception -> 0x00aa }
        r2 = r4.f5531f;	 Catch:{ Exception -> 0x00aa }
        r3 = r4.f5528c;	 Catch:{ Exception -> 0x00aa }
        r3 = com.facebook.ads.internal.p096o.C1852d.m7068a(r3);	 Catch:{ Exception -> 0x00aa }
        r1 = r2.m7096b(r3, r1);	 Catch:{ Exception -> 0x00aa }
        if (r1 == 0) goto L_0x0052;	 Catch:{ Exception -> 0x00aa }
    L_0x004d:
        r2 = r1.m7118e();	 Catch:{ Exception -> 0x00aa }
        goto L_0x0053;	 Catch:{ Exception -> 0x00aa }
    L_0x0052:
        r2 = 0;	 Catch:{ Exception -> 0x00aa }
    L_0x0053:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x00aa }
        if (r3 == 0) goto L_0x0070;	 Catch:{ Exception -> 0x00aa }
    L_0x0059:
        r1 = "events";	 Catch:{ Exception -> 0x00aa }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00aa }
        if (r1 == 0) goto L_0x006c;	 Catch:{ Exception -> 0x00aa }
    L_0x0061:
        r1 = r4.f5527b;	 Catch:{ Exception -> 0x00aa }
        r2 = "events";	 Catch:{ Exception -> 0x00aa }
        r0 = r0.getJSONArray(r2);	 Catch:{ Exception -> 0x00aa }
    L_0x0069:
        r1.mo1369b(r0);	 Catch:{ Exception -> 0x00aa }
    L_0x006c:
        r4.m6902c();	 Catch:{ Exception -> 0x00aa }
        goto L_0x00ad;	 Catch:{ Exception -> 0x00aa }
    L_0x0070:
        r1 = r1.m7114a();	 Catch:{ Exception -> 0x00aa }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ Exception -> 0x00aa }
        if (r1 == r3) goto L_0x0089;	 Catch:{ Exception -> 0x00aa }
    L_0x0078:
        r1 = "events";	 Catch:{ Exception -> 0x00aa }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00aa }
        if (r1 == 0) goto L_0x006c;	 Catch:{ Exception -> 0x00aa }
    L_0x0080:
        r1 = r4.f5527b;	 Catch:{ Exception -> 0x00aa }
        r2 = "events";	 Catch:{ Exception -> 0x00aa }
        r0 = r0.getJSONArray(r2);	 Catch:{ Exception -> 0x00aa }
        goto L_0x0069;	 Catch:{ Exception -> 0x00aa }
    L_0x0089:
        r0 = r4.f5527b;	 Catch:{ Exception -> 0x00aa }
        r1 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00aa }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00aa }
        r0 = r0.mo1367a(r1);	 Catch:{ Exception -> 0x00aa }
        if (r0 != 0) goto L_0x0097;	 Catch:{ Exception -> 0x00aa }
    L_0x0096:
        goto L_0x006c;	 Catch:{ Exception -> 0x00aa }
    L_0x0097:
        r0 = r4.f5527b;	 Catch:{ Exception -> 0x00aa }
        r0 = r0.mo1370c();	 Catch:{ Exception -> 0x00aa }
        if (r0 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x00aa }
    L_0x009f:
        goto L_0x006c;	 Catch:{ Exception -> 0x00aa }
    L_0x00a0:
        r4.m6907e();	 Catch:{ Exception -> 0x00aa }
        goto L_0x00ad;	 Catch:{ Exception -> 0x00aa }
    L_0x00a4:
        r0 = r4.f5534i;	 Catch:{ Exception -> 0x00aa }
        r4.m6899a(r0);	 Catch:{ Exception -> 0x00aa }
        return;
    L_0x00aa:
        r4.m6902c();
    L_0x00ad:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.m.b.d():void");
    }

    /* renamed from: e */
    private void m6907e() {
        this.f5538m = 0;
        this.f5539n = 0;
        if (this.f5529d.getQueue().size() == 0) {
            this.f5527b.mo1368b();
        }
    }

    /* renamed from: a */
    void m6908a() {
        this.f5537l = true;
        this.f5532g.removeCallbacks(this.f5536k);
        m6899a(this.f5533h);
    }

    /* renamed from: b */
    void m6909b() {
        if (!this.f5537l) {
            this.f5537l = true;
            this.f5532g.removeCallbacks(this.f5536k);
            m6899a(this.f5534i);
        }
    }
}
