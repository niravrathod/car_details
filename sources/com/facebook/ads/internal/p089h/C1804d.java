package com.facebook.ads.internal.p089h;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.d */
public class C1804d {
    /* renamed from: c */
    private static final String f5447c = "d";
    /* renamed from: d */
    private static final AdPlacementType f5448d = AdPlacementType.UNKNOWN;
    /* renamed from: a */
    public int f5449a = -1;
    /* renamed from: b */
    public int f5450b = -1;
    /* renamed from: e */
    private final long f5451e = System.currentTimeMillis();
    /* renamed from: f */
    private AdPlacementType f5452f = f5448d;
    /* renamed from: g */
    private int f5453g = 1;
    /* renamed from: h */
    private int f5454h = 0;
    /* renamed from: i */
    private int f5455i = 0;
    /* renamed from: j */
    private int f5456j = 20;
    /* renamed from: k */
    private int f5457k = 0;
    /* renamed from: l */
    private int f5458l = 1000;
    /* renamed from: m */
    private int f5459m = 10000;
    /* renamed from: n */
    private int f5460n = 200;
    /* renamed from: o */
    private int f5461o = 3600;
    /* renamed from: p */
    private boolean f5462p = false;
    /* renamed from: q */
    private List<C1802b> f5463q = null;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1804d(java.util.Map<java.lang.String, java.lang.String> r11) {
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
        r10 = this;
        r10.<init>();
        r0 = -1;
        r10.f5449a = r0;
        r10.f5450b = r0;
        r1 = f5448d;
        r10.f5452f = r1;
        r1 = 1;
        r10.f5453g = r1;
        r2 = 0;
        r10.f5454h = r2;
        r10.f5455i = r2;
        r3 = 20;
        r10.f5456j = r3;
        r10.f5457k = r2;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10.f5458l = r3;
        r3 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r10.f5459m = r3;
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r10.f5460n = r3;
        r4 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r10.f5461o = r4;
        r10.f5462p = r2;
        r4 = 0;
        r10.f5463q = r4;
        r4 = java.lang.System.currentTimeMillis();
        r10.f5451e = r4;
        r11 = r11.entrySet();
        r11 = r11.iterator();
    L_0x003d:
        r4 = r11.hasNext();
        if (r4 == 0) goto L_0x0236;
    L_0x0043:
        r4 = r11.next();
        r4 = (java.util.Map.Entry) r4;
        r5 = r4.getKey();
        r5 = (java.lang.String) r5;
        r6 = r5.hashCode();
        switch(r6) {
            case -1899431321: goto L_0x00e3;
            case -1561601017: goto L_0x00d9;
            case -856794442: goto L_0x00ce;
            case -726276175: goto L_0x00c3;
            case -634541425: goto L_0x00b9;
            case -553208868: goto L_0x00af;
            case 3575610: goto L_0x00a5;
            case 700812481: goto L_0x009b;
            case 858630459: goto L_0x0091;
            case 986744879: goto L_0x0086;
            case 1085444827: goto L_0x007b;
            case 1183549815: goto L_0x006f;
            case 1503616961: goto L_0x0063;
            case 2002133996: goto L_0x0058;
            default: goto L_0x0056;
        };
    L_0x0056:
        goto L_0x00ee;
    L_0x0058:
        r6 = "placement_width";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x0060:
        r5 = 7;
        goto L_0x00ef;
    L_0x0063:
        r6 = "placement_height";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x006b:
        r5 = 8;
        goto L_0x00ef;
    L_0x006f:
        r6 = "viewability_check_initial_delay";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x0077:
        r5 = 9;
        goto L_0x00ef;
    L_0x007b:
        r6 = "refresh";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x0083:
        r5 = 3;
        goto L_0x00ef;
    L_0x0086:
        r6 = "video_time_polling_interval";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x008e:
        r5 = 13;
        goto L_0x00ef;
    L_0x0091:
        r6 = "viewability_check_ticker";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x0099:
        r5 = 2;
        goto L_0x00ef;
    L_0x009b:
        r6 = "min_viewability_percentage";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00a3:
        r5 = 1;
        goto L_0x00ef;
    L_0x00a5:
        r6 = "type";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00ad:
        r5 = 0;
        goto L_0x00ef;
    L_0x00af:
        r6 = "cacheable";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00b7:
        r5 = 6;
        goto L_0x00ef;
    L_0x00b9:
        r6 = "invalidation_duration_in_seconds";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00c1:
        r5 = 5;
        goto L_0x00ef;
    L_0x00c3:
        r6 = "request_timeout";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00cb:
        r5 = 11;
        goto L_0x00ef;
    L_0x00ce:
        r6 = "viewability_check_interval";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00d6:
        r5 = 10;
        goto L_0x00ef;
    L_0x00d9:
        r6 = "refresh_threshold";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00e1:
        r5 = 4;
        goto L_0x00ef;
    L_0x00e3:
        r6 = "conv_tracking_data";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00ee;
    L_0x00eb:
        r5 = 12;
        goto L_0x00ef;
    L_0x00ee:
        r5 = -1;
    L_0x00ef:
        switch(r5) {
            case 0: goto L_0x0228;
            case 1: goto L_0x021a;
            case 2: goto L_0x020c;
            case 3: goto L_0x01fe;
            case 4: goto L_0x01f0;
            case 5: goto L_0x01e2;
            case 6: goto L_0x01d0;
            case 7: goto L_0x01c2;
            case 8: goto L_0x01b4;
            case 9: goto L_0x01a6;
            case 10: goto L_0x0198;
            case 11: goto L_0x018a;
            case 12: goto L_0x0106;
            case 13: goto L_0x00f4;
            default: goto L_0x00f2;
        };
    L_0x00f2:
        goto L_0x003d;
    L_0x00f4:
        r4 = r4.getValue();	 Catch:{ NumberFormatException -> 0x0102 }
        r4 = (java.lang.String) r4;	 Catch:{ NumberFormatException -> 0x0102 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0102 }
        r10.f5460n = r4;	 Catch:{ NumberFormatException -> 0x0102 }
        goto L_0x003d;
    L_0x0102:
        r10.f5460n = r3;
        goto L_0x003d;
    L_0x0106:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = com.facebook.ads.internal.p089h.C1802b.m6786a(r4);
        r10.f5463q = r4;
        r4 = android.webkit.CookieManager.getInstance();	 Catch:{ Exception -> 0x0180 }
        r5 = r4.acceptCookie();	 Catch:{ Exception -> 0x0180 }
        r4.setAcceptCookie(r1);	 Catch:{ Exception -> 0x0180 }
        r6 = r10.f5463q;	 Catch:{ Exception -> 0x0180 }
        r6 = r6.iterator();	 Catch:{ Exception -> 0x0180 }
    L_0x0123:
        r7 = r6.hasNext();	 Catch:{ Exception -> 0x0180 }
        if (r7 == 0) goto L_0x016e;	 Catch:{ Exception -> 0x0180 }
    L_0x0129:
        r7 = r6.next();	 Catch:{ Exception -> 0x0180 }
        r7 = (com.facebook.ads.internal.p089h.C1802b) r7;	 Catch:{ Exception -> 0x0180 }
        r8 = r7.m6788b();	 Catch:{ Exception -> 0x0180 }
        if (r8 == 0) goto L_0x0123;	 Catch:{ Exception -> 0x0180 }
    L_0x0135:
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0180 }
        r8.<init>();	 Catch:{ Exception -> 0x0180 }
        r9 = r7.f5439b;	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = "=";	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = r7.f5440c;	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = ";Domain=";	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = r7.f5438a;	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = ";Expires=";	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = r7.m6787a();	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r9 = ";path=/";	 Catch:{ Exception -> 0x0180 }
        r8.append(r9);	 Catch:{ Exception -> 0x0180 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x0180 }
        r7 = r7.f5438a;	 Catch:{ Exception -> 0x0180 }
        r4.setCookie(r7, r8);	 Catch:{ Exception -> 0x0180 }
        goto L_0x0123;	 Catch:{ Exception -> 0x0180 }
    L_0x016e:
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0180 }
        r7 = 21;	 Catch:{ Exception -> 0x0180 }
        if (r6 >= r7) goto L_0x017b;	 Catch:{ Exception -> 0x0180 }
    L_0x0174:
        r6 = android.webkit.CookieSyncManager.getInstance();	 Catch:{ Exception -> 0x0180 }
        r6.startSync();	 Catch:{ Exception -> 0x0180 }
    L_0x017b:
        r4.setAcceptCookie(r5);	 Catch:{ Exception -> 0x0180 }
        goto L_0x003d;
    L_0x0180:
        r4 = move-exception;
        r5 = f5447c;
        r6 = "Failed to set cookie.";
        android.util.Log.w(r5, r6, r4);
        goto L_0x003d;
    L_0x018a:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5459m = r4;
        goto L_0x003d;
    L_0x0198:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5458l = r4;
        goto L_0x003d;
    L_0x01a6:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5457k = r4;
        goto L_0x003d;
    L_0x01b4:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5450b = r4;
        goto L_0x003d;
    L_0x01c2:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5449a = r4;
        goto L_0x003d;
    L_0x01d0:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Boolean.valueOf(r4);
        r4 = r4.booleanValue();
        r10.f5462p = r4;
        goto L_0x003d;
    L_0x01e2:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5461o = r4;
        goto L_0x003d;
    L_0x01f0:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5456j = r4;
        goto L_0x003d;
    L_0x01fe:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5455i = r4;
        goto L_0x003d;
    L_0x020c:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5454h = r4;
        goto L_0x003d;
    L_0x021a:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = java.lang.Integer.parseInt(r4);
        r10.f5453g = r4;
        goto L_0x003d;
    L_0x0228:
        r4 = r4.getValue();
        r4 = (java.lang.String) r4;
        r4 = com.facebook.ads.internal.protocol.AdPlacementType.m7227a(r4);
        r10.f5452f = r4;
        goto L_0x003d;
    L_0x0236:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.d.<init>(java.util.Map):void");
    }

    /* renamed from: a */
    public static C1804d m6793a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        Map hashMap = new HashMap();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, String.valueOf(jSONObject.opt(str)));
        }
        return new C1804d(hashMap);
    }

    /* renamed from: a */
    public long m6794a() {
        return this.f5451e;
    }

    /* renamed from: b */
    public AdPlacementType m6795b() {
        return this.f5452f;
    }

    /* renamed from: c */
    public long m6796c() {
        return (long) (this.f5455i * 1000);
    }

    /* renamed from: d */
    public long m6797d() {
        return (long) (this.f5456j * 1000);
    }

    /* renamed from: e */
    public boolean m6798e() {
        return this.f5462p;
    }

    /* renamed from: f */
    public int m6799f() {
        return this.f5453g;
    }

    /* renamed from: g */
    public int m6800g() {
        return this.f5454h;
    }

    /* renamed from: h */
    public int m6801h() {
        return this.f5457k;
    }

    /* renamed from: i */
    public int m6802i() {
        return this.f5458l;
    }

    /* renamed from: j */
    public int m6803j() {
        return this.f5459m;
    }

    /* renamed from: k */
    public int m6804k() {
        return this.f5460n;
    }
}
