package com.facebook.ads.internal.adapters.p082a;

import android.content.Context;
import com.facebook.ads.internal.adapters.p082a.C1734i.C1733a;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.g */
public class C1730g implements Serializable {
    private static final long serialVersionUID = 8751287062553772011L;
    /* renamed from: a */
    private final C1734i f5218a;
    /* renamed from: b */
    private final C1720a f5219b;
    /* renamed from: c */
    private final List<C1731h> f5220c;
    /* renamed from: d */
    private final int f5221d;
    /* renamed from: e */
    private final int f5222e;
    /* renamed from: f */
    private int f5223f = 200;
    /* renamed from: g */
    private final String f5224g;
    /* renamed from: h */
    private final String f5225h;

    private C1730g(C1734i c1734i, C1720a c1720a, List<C1731h> list, String str, String str2, int i, int i2) {
        this.f5218a = c1734i;
        this.f5219b = c1720a;
        this.f5220c = list;
        this.f5224g = str;
        this.f5225h = str2;
        this.f5221d = i;
        this.f5222e = i2;
    }

    /* renamed from: a */
    public static C1730g m6539a(JSONObject jSONObject, Context context) {
        C1734i a = new C1733a().m6558a(jSONObject.optString("title")).m6560b(jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString(ImagesContract.URL) : "").m6561c(jSONObject.optString("ad_choices_link_url")).m6562d(C1730g.m6540a(jSONObject)).m6559a();
        JSONObject optJSONObject = jSONObject.optJSONObject("layout");
        JSONObject jSONObject2 = null;
        C1727d a2 = C1727d.m6523a(optJSONObject != null ? optJSONObject.optJSONObject("portrait") : null);
        if (optJSONObject != null) {
            jSONObject2 = optJSONObject.optJSONObject("landscape");
        }
        C1720a c1720a = new C1720a(a2, C1727d.m6523a(jSONObject2));
        int i = 0;
        int optInt = jSONObject.optInt("viewability_check_initial_delay", 0);
        int optInt2 = jSONObject.optInt("viewability_check_interval", 1000);
        String optString = jSONObject.optString("ct");
        String optString2 = jSONObject.optString("request_id", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("carousel");
        List arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList.add(C1731h.m6550a(jSONObject));
        } else {
            while (i < optJSONArray.length()) {
                try {
                    arrayList.add(C1731h.m6550a(optJSONArray.getJSONObject(i)));
                } catch (Exception e) {
                    C1953a.m7382a(context, "parsing", C1954b.f6007u, e);
                    e.printStackTrace();
                }
                i++;
            }
        }
        return new C1730g(a, c1720a, arrayList, optString, optString2, optInt, optInt2);
    }

    /* renamed from: a */
    private static String m6540a(JSONObject jSONObject) {
        jSONObject = jSONObject.optJSONObject("generic_text");
        return jSONObject == null ? "Sponsored" : jSONObject.optString("sponsored", "Sponsored");
    }

    /* renamed from: a */
    public C1734i m6541a() {
        return this.f5218a;
    }

    /* renamed from: a */
    public void m6542a(int i) {
        this.f5223f = i;
    }

    /* renamed from: b */
    public C1720a m6543b() {
        return this.f5219b;
    }

    /* renamed from: c */
    public String m6544c() {
        return this.f5224g;
    }

    /* renamed from: d */
    public List<C1731h> m6545d() {
        return Collections.unmodifiableList(this.f5220c);
    }

    /* renamed from: e */
    public String m6546e() {
        return this.f5225h;
    }

    /* renamed from: f */
    public int m6547f() {
        return this.f5221d;
    }

    /* renamed from: g */
    public int m6548g() {
        return this.f5222e;
    }

    /* renamed from: h */
    public int m6549h() {
        return this.f5223f;
    }
}
