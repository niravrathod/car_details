package com.facebook.ads.internal.p093l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.l.a */
public final class C1820a {
    /* renamed from: a */
    private static C1820a f5507a;
    /* renamed from: b */
    private final SharedPreferences f5508b;

    private C1820a(Context context) {
        this.f5508b = context.getApplicationContext().getSharedPreferences("com.facebook.ads.FEATURE_CONFIG", 0);
    }

    /* renamed from: a */
    private static int m6844a(Context context, String str, int i) {
        int a = C1820a.m6869x(context).m6870a(str, i);
        return (a < 0 || a >= 101) ? i : a;
    }

    /* renamed from: a */
    public static boolean m6845a(Context context) {
        return VERSION.SDK_INT >= 14 && C1820a.m6847b("com.google.android.exoplayer2", "ExoPlayer") && C1820a.m6869x(context).m6874a("adnw_enable_exoplayer", false);
    }

    /* renamed from: b */
    public static boolean m6846b(Context context) {
        return VERSION.SDK_INT >= 18 && C1820a.m6869x(context).m6874a("adnw_enable_debug_overlay", false);
    }

    /* renamed from: b */
    private static boolean m6847b(java.lang.String r1, java.lang.String r2) {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.<init>();	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.append(r1);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r1 = ".";	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.append(r1);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r0.append(r2);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r1 = r0.toString();	 Catch:{ ClassNotFoundException -> 0x0019 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0019 }
        r1 = 1;
        return r1;
    L_0x0019:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.l.a.b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static boolean m6848c(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_block_lockscreen", false);
    }

    /* renamed from: d */
    public static boolean m6849d(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_android_memory_opt", false);
    }

    /* renamed from: e */
    public static boolean m6850e(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_android_disable_blur", false);
    }

    /* renamed from: f */
    public static boolean m6851f(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_android_disable_playable_precache", false);
    }

    /* renamed from: g */
    public static boolean m6852g(Context context) {
        return VERSION.SDK_INT >= 19 && C1820a.m6869x(context).m6874a("adnw_enable_iab", false);
    }

    /* renamed from: h */
    public static boolean m6853h(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_debug_logging", false);
    }

    /* renamed from: i */
    public static java.util.Set<java.lang.String> m6854i(android.content.Context r3) {
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
        r3 = com.facebook.ads.internal.p093l.C1820a.m6869x(r3);
        r0 = "additional_debug_logging_black_list";
        r1 = "";
        r3 = r3.m6872a(r0, r1);
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0027 }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x0027 }
        r3 = 0;	 Catch:{ JSONException -> 0x0027 }
    L_0x0017:
        r2 = r1.length();	 Catch:{ JSONException -> 0x0027 }
        if (r3 >= r2) goto L_0x0027;	 Catch:{ JSONException -> 0x0027 }
    L_0x001d:
        r2 = r1.getString(r3);	 Catch:{ JSONException -> 0x0027 }
        r0.add(r2);	 Catch:{ JSONException -> 0x0027 }
        r3 = r3 + 1;
        goto L_0x0017;
    L_0x0027:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.l.a.i(android.content.Context):java.util.Set<java.lang.String>");
    }

    /* renamed from: j */
    public static int m6855j(Context context) {
        return C1820a.m6844a(context, "additional_debug_logging_black_list_percentage", 0);
    }

    /* renamed from: k */
    public static int m6856k(Context context) {
        return C1820a.m6844a(context, "additional_debug_logging_sampling_percentage", 100);
    }

    /* renamed from: l */
    public static boolean m6857l(Context context) {
        return C1820a.m6869x(context).m6874a("device_id_based_routing", false);
    }

    /* renamed from: m */
    public static long m6858m(Context context) {
        return C1820a.m6869x(context).m6871a("unified_logging_immediate_delay_ms", 500);
    }

    /* renamed from: n */
    public static long m6859n(Context context) {
        return ((long) C1820a.m6869x(context).m6870a("unified_logging_dispatch_interval_seconds", 300)) * 1000;
    }

    /* renamed from: o */
    public static int m6860o(Context context) {
        return C1820a.m6869x(context).m6870a("unified_logging_event_limit", -1);
    }

    /* renamed from: p */
    public static boolean m6861p(Context context) {
        return C1820a.m6869x(context).m6872a("video_and_endcard_autorotate", "autorotate_disabled").equals("autorotate_enabled");
    }

    /* renamed from: q */
    public static int m6862q(Context context) {
        return C1820a.m6869x(context).m6870a("minimum_elapsed_time_after_impression", -1);
    }

    /* renamed from: r */
    public static int m6863r(Context context) {
        return C1820a.m6869x(context).m6870a("stack_trace_sample_rate", 0);
    }

    /* renamed from: s */
    public static boolean m6864s(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_top_activity_viewability", false);
    }

    /* renamed from: t */
    public static boolean m6865t(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_enhanced_viewability_area_check", false);
    }

    /* renamed from: u */
    public static boolean m6866u(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_viewability_check_area_based", false);
    }

    /* renamed from: v */
    public static String m6867v(Context context) {
        return C1820a.m6869x(context).m6872a("adnw_logging_endpoint_prefix", "www");
    }

    /* renamed from: w */
    public static boolean m6868w(Context context) {
        return C1820a.m6869x(context).m6874a("adnw_mapp_markup_impression_after_image_load", false);
    }

    /* renamed from: x */
    public static C1820a m6869x(Context context) {
        if (f5507a == null) {
            synchronized (C1820a.class) {
                if (f5507a == null) {
                    f5507a = new C1820a(context);
                }
            }
        }
        return f5507a;
    }

    /* renamed from: a */
    public int m6870a(java.lang.String r3, int r4) {
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
        r0 = r2.f5508b;
        r1 = java.lang.String.valueOf(r4);
        r3 = r0.getString(r3, r1);
        r0 = "null";	 Catch:{ NumberFormatException -> 0x001d }
        r0 = r3.equals(r0);	 Catch:{ NumberFormatException -> 0x001d }
        if (r0 == 0) goto L_0x0014;	 Catch:{ NumberFormatException -> 0x001d }
    L_0x0012:
        r3 = r4;	 Catch:{ NumberFormatException -> 0x001d }
        goto L_0x001c;	 Catch:{ NumberFormatException -> 0x001d }
    L_0x0014:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x001d }
        r3 = r3.intValue();	 Catch:{ NumberFormatException -> 0x001d }
    L_0x001c:
        return r3;
    L_0x001d:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.l.a.a(java.lang.String, int):int");
    }

    /* renamed from: a */
    public long m6871a(java.lang.String r3, long r4) {
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
        r0 = r2.f5508b;
        r1 = java.lang.String.valueOf(r4);
        r3 = r0.getString(r3, r1);
        r0 = "null";	 Catch:{ NumberFormatException -> 0x001c }
        r0 = r3.equals(r0);	 Catch:{ NumberFormatException -> 0x001c }
        if (r0 == 0) goto L_0x0013;	 Catch:{ NumberFormatException -> 0x001c }
    L_0x0012:
        goto L_0x001c;	 Catch:{ NumberFormatException -> 0x001c }
    L_0x0013:
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ NumberFormatException -> 0x001c }
        r0 = r3.longValue();	 Catch:{ NumberFormatException -> 0x001c }
        r4 = r0;
    L_0x001c:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.l.a.a(java.lang.String, long):long");
    }

    /* renamed from: a */
    public String m6872a(String str, String str2) {
        str = this.f5508b.getString(str, str2);
        return (str == null || str.equals("null")) ? str2 : str;
    }

    /* renamed from: a */
    public void m6873a(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.equals("[]")) {
                Editor edit = this.f5508b.edit();
                JSONObject jSONObject = new JSONObject(str);
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    edit.putString(str2, jSONObject.getString(str2));
                }
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public boolean m6874a(String str, boolean z) {
        str = this.f5508b.getString(str, String.valueOf(z));
        return str.equals("null") ? z : Boolean.valueOf(str).booleanValue();
    }
}
