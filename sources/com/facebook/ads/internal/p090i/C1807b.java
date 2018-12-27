package com.facebook.ads.internal.p090i;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.i.b */
class C1807b {
    /* renamed from: a */
    private static final String f5472a = "b";

    C1807b() {
    }

    /* renamed from: a */
    static String m6807a() {
        JSONObject jSONObject = new JSONObject();
        C1807b.m6808a(jSONObject, "is_emu", String.valueOf(C1807b.m6809b()));
        return jSONObject.toString();
    }

    /* renamed from: a */
    private static void m6808a(org.json.JSONObject r0, java.lang.String r1, java.lang.String r2) {
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
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.i.b.a(org.json.JSONObject, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private static boolean m6809b() {
        if (!(Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")))) {
            if (!"google_sdk".equals(Build.PRODUCT)) {
                return false;
            }
        }
        return true;
    }
}
