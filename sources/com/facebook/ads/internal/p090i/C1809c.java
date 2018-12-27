package com.facebook.ads.internal.p090i;

import android.content.Context;
import com.facebook.ads.internal.p084c.C1770b;
import com.facebook.ads.internal.p087f.C1795e;
import com.facebook.ads.internal.p088g.C1799a;
import com.facebook.ads.internal.p088g.C1800b;
import com.facebook.ads.internal.p101q.p102a.C1908c;
import com.facebook.ads.internal.p101q.p102a.C1917g;
import com.facebook.ads.internal.p101q.p102a.C1917g.C1916a;
import com.facebook.ads.internal.p101q.p102a.C1918h;
import com.facebook.ads.internal.p101q.p102a.C1919i;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1924n;
import com.facebook.ads.internal.p101q.p102a.C1932s;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p104c.C1948d;
import com.facebook.ads.internal.settings.C1964b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.i.c */
public class C1809c {
    /* renamed from: a */
    public static int f5476a = 1303;
    /* renamed from: b */
    private static final AtomicInteger f5477b = new AtomicInteger(0);
    /* renamed from: c */
    private static String f5478c = null;
    /* renamed from: d */
    private static final C1916a f5479d = C1917g.m7277a();
    /* renamed from: e */
    private final Context f5480e;
    /* renamed from: f */
    private final C1800b f5481f;

    public C1809c(Context context, boolean z) {
        this.f5480e = context;
        this.f5481f = new C1800b(context);
        C1809c.m6813a(context, z);
    }

    /* renamed from: a */
    private static void m6813a(final android.content.Context r5, boolean r6) {
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
        r0 = f5477b;
        r1 = 0;
        r2 = 1;
        r0 = r0.compareAndSet(r1, r2);
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        com.facebook.ads.internal.p101q.p102a.C1924n.m7299a();	 Catch:{ Exception -> 0x004c }
        r0 = "FBAdPrefs";	 Catch:{ Exception -> 0x004c }
        r0 = r5.getSharedPreferences(r0, r1);	 Catch:{ Exception -> 0x004c }
        r2 = new com.facebook.ads.internal.g.b;	 Catch:{ Exception -> 0x004c }
        r2.<init>(r5);	 Catch:{ Exception -> 0x004c }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x004c }
        r3.<init>();	 Catch:{ Exception -> 0x004c }
        r4 = "AFP;";	 Catch:{ Exception -> 0x004c }
        r3.append(r4);	 Catch:{ Exception -> 0x004c }
        r2 = r2.m6779g();	 Catch:{ Exception -> 0x004c }
        r3.append(r2);	 Catch:{ Exception -> 0x004c }
        r2 = r3.toString();	 Catch:{ Exception -> 0x004c }
        r3 = 0;	 Catch:{ Exception -> 0x004c }
        r3 = r0.getString(r2, r3);	 Catch:{ Exception -> 0x004c }
        f5478c = r3;	 Catch:{ Exception -> 0x004c }
        r3 = new java.util.concurrent.FutureTask;	 Catch:{ Exception -> 0x004c }
        r4 = new com.facebook.ads.internal.i.c$1;	 Catch:{ Exception -> 0x004c }
        r4.<init>(r5, r0, r2);	 Catch:{ Exception -> 0x004c }
        r3.<init>(r4);	 Catch:{ Exception -> 0x004c }
        r5 = java.util.concurrent.Executors.newSingleThreadExecutor();	 Catch:{ Exception -> 0x004c }
        r5.submit(r3);	 Catch:{ Exception -> 0x004c }
        if (r6 == 0) goto L_0x0051;	 Catch:{ Exception -> 0x004c }
    L_0x0048:
        r3.get();	 Catch:{ Exception -> 0x004c }
        goto L_0x0051;
    L_0x004c:
        r5 = f5477b;
        r5.set(r1);
    L_0x0051:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.i.c.a(android.content.Context, boolean):void");
    }

    /* renamed from: b */
    private static String m6815b(Context context, String str) {
        try {
            return C1919i.m7288a(context.getPackageManager().getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            Map a = new C1809c(context, false).m6817a();
            a.put("subtype", "generic");
            a.put("subtype_code", String.valueOf(f5476a));
            C1795e.m6748a(e, context, a);
            return null;
        }
    }

    /* renamed from: a */
    public Map<String, String> m6817a() {
        C1809c.m6813a(this.f5480e, false);
        C1799a.m6762a(this.f5480e);
        Map<String, String> hashMap = new HashMap();
        hashMap.put("SDK", "android");
        hashMap.put("SDK_VERSION", "4.99.0");
        hashMap.put("LOCALE", Locale.getDefault().toString());
        float f = C1936w.f5934b;
        int i = this.f5480e.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.f5480e.getResources().getDisplayMetrics().heightPixels;
        hashMap.put("DENSITY", String.valueOf(f));
        hashMap.put("SCREEN_WIDTH", String.valueOf((int) (((float) i) / f)));
        hashMap.put("SCREEN_HEIGHT", String.valueOf((int) (((float) i2) / f)));
        hashMap.put("ATTRIBUTION_ID", C1770b.f5344a);
        hashMap.put("ID_SOURCE", C1770b.f5347d);
        hashMap.put("OS", "Android");
        hashMap.put("OSVERS", C1800b.f5433a);
        hashMap.put("BUNDLE", this.f5481f.m6778f());
        hashMap.put("APPNAME", this.f5481f.m6776d());
        hashMap.put("APPVERS", this.f5481f.m6779g());
        hashMap.put("APPBUILD", String.valueOf(this.f5481f.m6780h()));
        hashMap.put("CARRIER", this.f5481f.m6775c());
        hashMap.put("MAKE", this.f5481f.m6773a());
        hashMap.put("MODEL", this.f5481f.m6774b());
        hashMap.put("ROOTED", String.valueOf(f5479d.f5877d));
        hashMap.put("INSTALLER", this.f5481f.m6777e());
        hashMap.put("SDK_CAPABILITY", C1908c.m7254b());
        hashMap.put("NETWORK_TYPE", String.valueOf(C1948d.m7361c(this.f5480e).f5975g));
        hashMap.put("SESSION_TIME", C1932s.m7313a(C1924n.m7300b()));
        hashMap.put("SESSION_ID", C1924n.m7301c());
        if (f5478c != null) {
            hashMap.put("AFP", f5478c);
        }
        String a = C1917g.m7278a(this.f5480e);
        if (a != null) {
            hashMap.put("ASHAS", a);
        }
        hashMap.put("UNITY", String.valueOf(C1918h.m7285a(this.f5480e)));
        a = C1964b.m7438c();
        if (a != null) {
            hashMap.put("MEDIATION_SERVICE", a);
        }
        hashMap.put("ACCESSIBILITY_ENABLED", String.valueOf(this.f5481f.m6781i()));
        if (this.f5481f.m6782j() != -1) {
            hashMap.put("APP_MIN_SDK_VERSION", String.valueOf(this.f5481f.m6782j()));
        }
        hashMap.put("VALPARAMS", C1807b.m6807a());
        hashMap.put("ANALOG", C1921k.m7293a(C1799a.m6761a()));
        return hashMap;
    }
}
