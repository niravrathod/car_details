package com.facebook.ads.internal.p081a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.g */
public class C1717g {
    /* renamed from: a */
    private final String f5158a;
    /* renamed from: b */
    private final String f5159b;
    /* renamed from: c */
    private final String f5160c;
    /* renamed from: d */
    private final List<String> f5161d;
    /* renamed from: e */
    private final String f5162e;
    /* renamed from: f */
    private final String f5163f;

    private C1717g(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.f5158a = str;
        this.f5159b = str2;
        this.f5160c = str3;
        this.f5161d = list;
        this.f5162e = str4;
        this.f5163f = str5;
    }

    /* renamed from: a */
    public static C1717g m6471a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("package");
        String optString2 = jSONObject.optString("appsite");
        String optString3 = jSONObject.optString("appsite_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("key_hashes");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        return new C1717g(optString, optString2, optString3, arrayList, jSONObject.optString("market_uri"), jSONObject.optString("fallback_url"));
    }

    /* renamed from: a */
    public String m6472a() {
        return this.f5158a;
    }

    /* renamed from: b */
    public String m6473b() {
        return this.f5159b;
    }

    /* renamed from: c */
    public String m6474c() {
        return this.f5160c;
    }
}
