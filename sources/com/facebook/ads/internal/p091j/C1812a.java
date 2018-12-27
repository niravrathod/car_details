package com.facebook.ads.internal.p091j;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.j.a */
public class C1812a {
    /* renamed from: a */
    public static String f5492a;
    /* renamed from: b */
    private String f5493b;
    /* renamed from: c */
    private Map<String, Object> f5494c;
    /* renamed from: d */
    private int f5495d;
    /* renamed from: e */
    private String f5496e;

    /* renamed from: com.facebook.ads.internal.j.a$a */
    public enum C1810a {
        OPEN_STORE(0),
        OPEN_LINK(1),
        XOUT(2),
        OPEN_URL(3),
        SHOW_INTERSTITIAL(4);
        
        /* renamed from: f */
        int f5488f;

        private C1810a(int i) {
            this.f5488f = i;
        }
    }

    /* renamed from: com.facebook.ads.internal.j.a$b */
    public enum C1811b {
        LOADING_AD(0);
        
        /* renamed from: b */
        int f5491b;

        private C1811b(int i) {
            this.f5491b = i;
        }
    }

    public C1812a(String str, Map<String, Object> map, int i, String str2) {
        this.f5493b = str;
        this.f5494c = map;
        this.f5495d = i;
        this.f5496e = str2;
    }

    /* renamed from: a */
    public static C1812a m6818a(long j, C1810a c1810a, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Map hashMap = new HashMap();
        hashMap.put("Time", String.valueOf(currentTimeMillis - j));
        hashMap.put("AdAction", String.valueOf(c1810a.f5488f));
        return new C1812a("bounceback", hashMap, (int) (currentTimeMillis / 1000), str);
    }

    /* renamed from: a */
    public static C1812a m6819a(C1811b c1811b, String str, long j, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("LatencyType", String.valueOf(c1811b.f5491b));
        hashMap.put("AdPlacementType", str);
        hashMap.put("Time", String.valueOf(j));
        str = "latency";
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (str2 == null) {
            str2 = f5492a;
        }
        return new C1812a(str, hashMap, currentTimeMillis, str2);
    }

    /* renamed from: a */
    public static C1812a m6820a(Throwable th, String str) {
        Map hashMap = new HashMap();
        if (th != null) {
            hashMap.put("ex", th.getClass().getSimpleName());
            hashMap.put("ex_msg", th.getMessage());
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String str2 = "error";
        if (str == null) {
            str = f5492a;
        }
        return new C1812a(str2, hashMap, currentTimeMillis, str);
    }

    /* renamed from: a */
    public JSONObject m6821a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f5493b);
            jSONObject.put("data", new JSONObject(this.f5494c));
            jSONObject.put("time", this.f5495d);
            jSONObject.put("request_id", this.f5496e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
