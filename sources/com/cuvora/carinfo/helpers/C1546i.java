package com.cuvora.carinfo.helpers;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.helpers.i */
public class C1546i {
    /* renamed from: a */
    public static String m5899a(JSONObject jSONObject, String str) {
        return C1546i.m5900a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static String m5900a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject = (!jSONObject.has(str) || jSONObject.isNull(str)) ? null : jSONObject.getString(str);
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            jSONObject2.printStackTrace();
            return str2;
        }
    }

    /* renamed from: b */
    public static Long m5903b(JSONObject jSONObject, String str) {
        return C1546i.m5898a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static Long m5898a(JSONObject jSONObject, String str, Long l) {
        try {
            jSONObject = (!jSONObject.has(str) || jSONObject.isNull(str)) ? null : Long.valueOf(jSONObject.getLong(str));
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            jSONObject2.printStackTrace();
            return l;
        }
    }

    /* renamed from: c */
    public static Integer m5904c(JSONObject jSONObject, String str) {
        return C1546i.m5897a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static Integer m5897a(JSONObject jSONObject, String str, Integer num) {
        try {
            jSONObject = (!jSONObject.has(str) || jSONObject.isNull(str)) ? null : Integer.valueOf(jSONObject.getInt(str));
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            jSONObject2.printStackTrace();
            return num;
        }
    }

    /* renamed from: d */
    public static Double m5905d(JSONObject jSONObject, String str) {
        return C1546i.m5896a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static Double m5896a(JSONObject jSONObject, String str, Double d) {
        try {
            jSONObject = (!jSONObject.has(str) || jSONObject.isNull(str)) ? null : Double.valueOf(jSONObject.getDouble(str));
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            jSONObject2.printStackTrace();
            return d;
        }
    }

    /* renamed from: e */
    public static Boolean m5906e(JSONObject jSONObject, String str) {
        return C1546i.m5895a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static Boolean m5895a(JSONObject jSONObject, String str, Boolean bool) {
        try {
            jSONObject = (!jSONObject.has(str) || jSONObject.isNull(str)) ? null : Boolean.valueOf(jSONObject.getBoolean(str));
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            jSONObject2.printStackTrace();
            return bool;
        }
    }

    /* renamed from: f */
    public static JSONObject m5907f(JSONObject jSONObject, String str) {
        return C1546i.m5902a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static org.json.JSONObject m5902a(org.json.JSONObject r1, java.lang.String r2, org.json.JSONObject r3) {
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
        r0 = r1.has(r2);	 Catch:{ JSONException -> 0x0013 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ JSONException -> 0x0013 }
    L_0x0006:
        r0 = r1.isNull(r2);	 Catch:{ JSONException -> 0x0013 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ JSONException -> 0x0013 }
    L_0x000c:
        r1 = r1.getJSONObject(r2);	 Catch:{ JSONException -> 0x0013 }
        goto L_0x0012;
    L_0x0011:
        r1 = 0;
    L_0x0012:
        return r1;
    L_0x0013:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.i.a(org.json.JSONObject, java.lang.String, org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: g */
    public static JSONArray m5908g(JSONObject jSONObject, String str) {
        return C1546i.m5901a(jSONObject, str, null);
    }

    /* renamed from: a */
    public static org.json.JSONArray m5901a(org.json.JSONObject r1, java.lang.String r2, org.json.JSONArray r3) {
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
        r0 = r1.has(r2);	 Catch:{ JSONException -> 0x0013 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ JSONException -> 0x0013 }
    L_0x0006:
        r0 = r1.isNull(r2);	 Catch:{ JSONException -> 0x0013 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ JSONException -> 0x0013 }
    L_0x000c:
        r1 = r1.getJSONArray(r2);	 Catch:{ JSONException -> 0x0013 }
        goto L_0x0012;
    L_0x0011:
        r1 = 0;
    L_0x0012:
        return r1;
    L_0x0013:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.i.a(org.json.JSONObject, java.lang.String, org.json.JSONArray):org.json.JSONArray");
    }

    /* renamed from: h */
    public static boolean m5909h(JSONObject jSONObject, String str) {
        return (jSONObject != null && jSONObject.has(str) && jSONObject.isNull(str) == null) ? true : null;
    }
}
