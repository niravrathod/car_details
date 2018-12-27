package com.facebook.ads.internal.p096o;

import android.text.TextUtils;
import com.facebook.ads.internal.p089h.C1801a;
import com.facebook.ads.internal.p089h.C1803c;
import com.facebook.ads.internal.p089h.C1804d;
import com.facebook.ads.internal.p096o.C1855f.C1854a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.o.e */
public class C1853e {
    /* renamed from: a */
    private static C1853e f5671a = new C1853e();

    /* renamed from: a */
    public static synchronized C1853e m7069a() {
        C1853e c1853e;
        synchronized (C1853e.class) {
            c1853e = f5671a;
        }
        return c1853e;
    }

    /* renamed from: a */
    private C3812g m7070a(JSONObject jSONObject) {
        int i = 0;
        JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
        C1803c c1803c = new C1803c(C1804d.m6793a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config"));
        if (jSONObject2.has("ads")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ads");
            while (i < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                c1803c.m6790a(new C1801a(jSONObject3.optString("adapter"), jSONObject3.optJSONObject("data"), jSONObject3.optJSONArray("trackers")));
                i++;
            }
        }
        return new C3812g(c1803c, jSONObject.optString("server_request_id"), jSONObject.optString("server_response"), jSONObject.optString("an_validation_uuid"));
    }

    /* renamed from: b */
    private com.facebook.ads.internal.p096o.C3813h m7071b(org.json.JSONObject r7) {
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
        r6 = this;
        r0 = "placements";	 Catch:{ JSONException -> 0x0034 }
        r0 = r7.getJSONArray(r0);	 Catch:{ JSONException -> 0x0034 }
        r1 = 0;	 Catch:{ JSONException -> 0x0034 }
        r0 = r0.getJSONObject(r1);	 Catch:{ JSONException -> 0x0034 }
        r2 = "definition";	 Catch:{ JSONException -> 0x0034 }
        r2 = r0.getJSONObject(r2);	 Catch:{ JSONException -> 0x0034 }
        r2 = com.facebook.ads.internal.p089h.C1804d.m6793a(r2);	 Catch:{ JSONException -> 0x0034 }
        r3 = "feature_config";	 Catch:{ JSONException -> 0x0034 }
        r0 = r0.optString(r3);	 Catch:{ JSONException -> 0x0034 }
        r3 = new com.facebook.ads.internal.o.h;	 Catch:{ JSONException -> 0x0034 }
        r4 = "message";	 Catch:{ JSONException -> 0x0034 }
        r5 = "";	 Catch:{ JSONException -> 0x0034 }
        r4 = r7.optString(r4, r5);	 Catch:{ JSONException -> 0x0034 }
        r5 = "code";	 Catch:{ JSONException -> 0x0034 }
        r1 = r7.optInt(r5, r1);	 Catch:{ JSONException -> 0x0034 }
        r5 = new com.facebook.ads.internal.h.c;	 Catch:{ JSONException -> 0x0034 }
        r5.<init>(r2, r0);	 Catch:{ JSONException -> 0x0034 }
        r3.<init>(r4, r1, r5);	 Catch:{ JSONException -> 0x0034 }
        return r3;
    L_0x0034:
        r7 = r6.m7072c(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.o.e.b(org.json.JSONObject):com.facebook.ads.internal.o.h");
    }

    /* renamed from: c */
    private C3813h m7072c(JSONObject jSONObject) {
        return new C3813h(jSONObject.optString("message", ""), jSONObject.optInt("code", 0), null);
    }

    /* renamed from: a */
    public C1855f m7073a(String str) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            str = jSONObject.optString("type");
            Object obj = -1;
            int hashCode = str.hashCode();
            if (hashCode != 96432) {
                if (hashCode == 96784904) {
                    if (str.equals("error")) {
                        obj = 1;
                    }
                }
            } else if (str.equals("ads")) {
                obj = null;
            }
            switch (obj) {
                case null:
                    return m7070a(jSONObject);
                case 1:
                    return m7071b(jSONObject);
                default:
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        return m7072c(optJSONObject);
                    }
                    break;
            }
        }
        return new C1855f(C1854a.UNKNOWN);
    }
}
