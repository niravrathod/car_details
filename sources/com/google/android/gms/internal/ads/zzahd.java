package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzaer
public final class zzahd {
    /* renamed from: A */
    private boolean f8615A = false;
    /* renamed from: B */
    private zzafv f8616B;
    /* renamed from: C */
    private boolean f8617C = false;
    /* renamed from: D */
    private String f8618D;
    /* renamed from: E */
    private List<String> f8619E;
    /* renamed from: F */
    private boolean f8620F;
    /* renamed from: G */
    private String f8621G;
    /* renamed from: H */
    private zzajv f8622H;
    /* renamed from: I */
    private boolean f8623I;
    /* renamed from: J */
    private boolean f8624J;
    /* renamed from: K */
    private boolean f8625K;
    /* renamed from: L */
    private boolean f8626L;
    /* renamed from: M */
    private String f8627M;
    /* renamed from: N */
    private final zzafp f8628N;
    /* renamed from: a */
    private String f8629a;
    /* renamed from: b */
    private String f8630b;
    /* renamed from: c */
    private String f8631c;
    /* renamed from: d */
    private List<String> f8632d;
    /* renamed from: e */
    private String f8633e;
    /* renamed from: f */
    private String f8634f;
    /* renamed from: g */
    private String f8635g;
    /* renamed from: h */
    private List<String> f8636h;
    /* renamed from: i */
    private List<String> f8637i;
    /* renamed from: j */
    private long f8638j = -1;
    /* renamed from: k */
    private boolean f8639k = false;
    /* renamed from: l */
    private final long f8640l = -1;
    /* renamed from: m */
    private List<String> f8641m;
    /* renamed from: n */
    private long f8642n = -1;
    /* renamed from: o */
    private int f8643o = -1;
    /* renamed from: p */
    private boolean f8644p = false;
    /* renamed from: q */
    private boolean f8645q = false;
    /* renamed from: r */
    private boolean f8646r = false;
    /* renamed from: s */
    private boolean f8647s = true;
    /* renamed from: t */
    private boolean f8648t = true;
    /* renamed from: u */
    private String f8649u = "";
    /* renamed from: v */
    private boolean f8650v = false;
    /* renamed from: w */
    private boolean f8651w = false;
    /* renamed from: x */
    private zzajk f8652x;
    /* renamed from: y */
    private List<String> f8653y;
    /* renamed from: z */
    private List<String> f8654z;

    /* renamed from: a */
    private static String m9532a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() != null) ? null : (String) list.get(null);
    }

    /* renamed from: b */
    private static long m9533b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2, java.lang.String r3) {
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
        r2 = r2.get(r3);
        r2 = (java.util.List) r2;
        if (r2 == 0) goto L_0x004e;
    L_0x0008:
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x004e;
    L_0x000e:
        r0 = 0;
        r2 = r2.get(r0);
        r2 = (java.lang.String) r2;
        r0 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x001f }
        r2 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = r0 * r2;
        r2 = (long) r0;
        return r2;
    L_0x001f:
        r0 = java.lang.String.valueOf(r3);
        r0 = r0.length();
        r0 = r0 + 36;
        r1 = java.lang.String.valueOf(r2);
        r1 = r1.length();
        r0 = r0 + r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Could not parse float from ";
        r1.append(r0);
        r1.append(r3);
        r3 = " header: ";
        r1.append(r3);
        r1.append(r2);
        r2 = r1.toString();
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);
    L_0x004e:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahd.b(java.util.Map, java.lang.String):long");
    }

    /* renamed from: c */
    private static List<String> m9534c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && list.isEmpty() == null) {
            String str2 = (String) list.get(null);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m9535d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null) {
            if (!list.isEmpty()) {
                return Boolean.valueOf((String) list.get(0)).booleanValue();
            }
        }
        return false;
    }

    public zzahd(zzafp zzafp, String str) {
        this.f8630b = str;
        this.f8628N = zzafp;
    }

    /* renamed from: a */
    public final zzaft m9536a(long j, zzahf zzahf) {
        String str;
        int i;
        zzafp zzafp = this.f8628N;
        String str2 = this.f8630b;
        String str3 = this.f8631c;
        List list = this.f8632d;
        List list2 = this.f8636h;
        long j2 = this.f8638j;
        boolean z = this.f8639k;
        List list3 = this.f8641m;
        long j3 = this.f8642n;
        int i2 = this.f8643o;
        String str4 = this.f8629a;
        String str5 = this.f8634f;
        String str6 = this.f8635g;
        String str7 = str5;
        boolean z2 = this.f8644p;
        boolean z3 = this.f8645q;
        boolean z4 = this.f8646r;
        boolean z5 = this.f8647s;
        String str8 = this.f8649u;
        boolean z6 = this.f8650v;
        boolean z7 = this.f8651w;
        zzajk zzajk = this.f8652x;
        List list4 = this.f8653y;
        List list5 = this.f8654z;
        boolean z8 = this.f8615A;
        zzafv zzafv = this.f8616B;
        boolean z9 = this.f8617C;
        String str9 = this.f8618D;
        List list6 = this.f8619E;
        boolean z10 = this.f8620F;
        String str10 = this.f8621G;
        zzajv zzajv = this.f8622H;
        String str11 = this.f8633e;
        boolean z11 = this.f8648t;
        boolean z12 = this.f8623I;
        boolean z13 = this.f8624J;
        if (zzahf.m9545g()) {
            str = str4;
            i = 2;
        } else {
            str = str4;
            i = 1;
        }
        boolean z14 = z13;
        return new zzaft(zzafp, str2, str3, list, list2, j2, z, -1, list3, j3, i2, str, j, str7, str6, z2, z3, z4, z5, false, str8, z6, z7, zzajk, list4, list5, z8, zzafv, z9, str9, list6, z10, str10, zzajv, str11, z11, z12, z14, i, r0.f8625K, r0.f8637i, r0.f8626L, r0.f8627M, zzahf.m9546h(), zzahf.m9547i());
    }

    /* renamed from: a */
    public final void m9537a(String str, Map<String, List<String>> map, String str2) {
        this.f8631c = str2;
        m9538a(map);
    }

    /* renamed from: a */
    public final void m9538a(Map<String, List<String>> map) {
        String str;
        this.f8629a = m9532a((Map) map, "X-Afma-Ad-Size");
        this.f8621G = m9532a((Map) map, "X-Afma-Ad-Slot-Size");
        List c = m9534c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f8632d = c;
        }
        this.f8633e = m9532a((Map) map, "X-Afma-Debug-Signals");
        c = (List) map.get("X-Afma-Debug-Dialog");
        if (!(c == null || c.isEmpty())) {
            this.f8634f = (String) c.get(0);
        }
        c = m9534c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f8636h = c;
        }
        c = m9534c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c != null) {
            this.f8637i = c;
        }
        long b = m9533b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f8638j = b;
        }
        this.f8639k |= m9535d(map, "X-Afma-Mediation");
        c = m9534c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f8641m = c;
        }
        b = m9533b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f8642n = b;
        }
        c = (List) map.get("X-Afma-Orientation");
        if (!(c == null || c.isEmpty())) {
            str = (String) c.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f8643o = zzbv.zzem().mo2365b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f8643o = zzbv.zzem().mo2363a();
            }
        }
        this.f8635g = m9532a((Map) map, "X-Afma-ActiveView");
        c = (List) map.get("X-Afma-Use-HTTPS");
        if (!(c == null || c.isEmpty())) {
            this.f8646r = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        this.f8644p |= m9535d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f8645q = "native".equals(m9532a((Map) map, "X-Afma-Ad-Format"));
        c = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f8647s = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f8648t = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        c = (List) map.get("X-Afma-Gws-Query-Id");
        if (!(c == null || c.isEmpty())) {
            this.f8649u = (String) c.get(0);
        }
        str = m9532a((Map) map, "X-Afma-Fluid");
        if (str != null && str.equals("height")) {
            this.f8650v = true;
        }
        this.f8651w = "native_express".equals(m9532a((Map) map, "X-Afma-Ad-Format"));
        this.f8652x = zzajk.m26267a(m9532a((Map) map, "X-Afma-Rewards"));
        if (this.f8653y == null) {
            this.f8653y = m9534c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f8654z == null) {
            this.f8654z = m9534c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f8615A |= m9535d(map, "X-Afma-Use-Displayed-Impression");
        this.f8617C |= m9535d(map, "X-Afma-Auto-Collect-Location");
        this.f8618D = m9532a((Map) map, "Set-Cookie");
        Object a = m9532a((Map) map, "X-Afma-Auto-Protection-Configuration");
        if (a != null) {
            if (!TextUtils.isEmpty(a)) {
                try {
                    this.f8616B = zzafv.m26177a(new JSONObject(a));
                } catch (Throwable e) {
                    zzaok.m10004c("Error parsing configuration JSON", e);
                    this.f8616B = new zzafv();
                }
                c = m9534c(map, "X-Afma-Remote-Ping-Urls");
                if (c != null) {
                    this.f8619E = c;
                }
                a = m9532a((Map) map, "X-Afma-Safe-Browsing");
                if (!TextUtils.isEmpty(a)) {
                    try {
                        this.f8622H = zzajv.m26269a(new JSONObject(a));
                    } catch (Throwable e2) {
                        zzaok.m10004c("Error parsing safe browsing header", e2);
                    }
                }
                this.f8620F |= m9535d(map, "X-Afma-Render-In-Browser");
                a = m9532a((Map) map, "X-Afma-Pool");
                if (!TextUtils.isEmpty(a)) {
                    try {
                        this.f8623I = new JSONObject(a).getBoolean("never_pool");
                    } catch (Throwable e22) {
                        zzaok.m10004c("Error parsing interstitial pool header", e22);
                    }
                }
                this.f8624J = m9535d(map, "X-Afma-Custom-Close-Blocked");
                this.f8625K = m9535d(map, "X-Afma-Enable-Omid");
                this.f8626L = m9535d(map, "X-Afma-Disable-Closable-Area");
                this.f8627M = m9532a((Map) map, "X-Afma-Omid-Settings");
            }
        }
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        buildUpon.appendQueryParameter(FacebookAdapter.KEY_ID, "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(this.f8634f)) {
            buildUpon.appendQueryParameter("debugDialog", this.f8634f);
        }
        String[] strArr = new String[1];
        str = buildUpon.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
        stringBuilder.append(str);
        stringBuilder.append("&navigationURL={NAVIGATION_URL}");
        strArr[0] = stringBuilder.toString();
        this.f8616B = new zzafv(true, Arrays.asList(strArr));
        c = m9534c(map, "X-Afma-Remote-Ping-Urls");
        if (c != null) {
            this.f8619E = c;
        }
        a = m9532a((Map) map, "X-Afma-Safe-Browsing");
        if (TextUtils.isEmpty(a)) {
            this.f8622H = zzajv.m26269a(new JSONObject(a));
        }
        this.f8620F |= m9535d(map, "X-Afma-Render-In-Browser");
        a = m9532a((Map) map, "X-Afma-Pool");
        if (TextUtils.isEmpty(a)) {
            this.f8623I = new JSONObject(a).getBoolean("never_pool");
        }
        this.f8624J = m9535d(map, "X-Afma-Custom-Close-Blocked");
        this.f8625K = m9535d(map, "X-Afma-Enable-Omid");
        this.f8626L = m9535d(map, "X-Afma-Disable-Closable-Area");
        this.f8627M = m9532a((Map) map, "X-Afma-Omid-Settings");
    }
}
