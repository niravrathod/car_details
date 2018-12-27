package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzxx {
    /* renamed from: a */
    public final String f9836a;
    /* renamed from: b */
    public final String f9837b;
    /* renamed from: c */
    public final List<String> f9838c;
    /* renamed from: d */
    public final String f9839d;
    /* renamed from: e */
    public final String f9840e;
    /* renamed from: f */
    public final List<String> f9841f;
    /* renamed from: g */
    public final List<String> f9842g;
    /* renamed from: h */
    public final List<String> f9843h;
    /* renamed from: i */
    public final List<String> f9844i;
    /* renamed from: j */
    public final List<String> f9845j;
    /* renamed from: k */
    public final String f9846k;
    /* renamed from: l */
    public final List<String> f9847l;
    /* renamed from: m */
    public final List<String> f9848m;
    /* renamed from: n */
    public final List<String> f9849n;
    /* renamed from: o */
    public final String f9850o;
    /* renamed from: p */
    public final String f9851p;
    /* renamed from: q */
    public final String f9852q;
    /* renamed from: r */
    public final List<String> f9853r;
    /* renamed from: s */
    public final String f9854s;
    /* renamed from: t */
    public final long f9855t;
    /* renamed from: u */
    private final String f9856u;

    public zzxx(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j) {
        this.f9836a = str;
        this.f9837b = null;
        this.f9838c = list;
        this.f9839d = null;
        this.f9840e = null;
        this.f9841f = list2;
        this.f9842g = list3;
        this.f9843h = list4;
        this.f9844i = list5;
        this.f9846k = str5;
        this.f9847l = list6;
        this.f9848m = list7;
        this.f9849n = list8;
        this.f9850o = null;
        this.f9851p = null;
        this.f9852q = null;
        this.f9853r = null;
        this.f9854s = null;
        this.f9845j = list10;
        this.f9856u = null;
        this.f9855t = -1;
    }

    public zzxx(JSONObject jSONObject) {
        List a;
        this.f9837b = jSONObject.optString(FacebookAdapter.KEY_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f9838c = Collections.unmodifiableList(arrayList);
        this.f9839d = jSONObject.optString("allocation_id", null);
        zzbv.zzfe();
        this.f9841f = zzyg.m11194a(jSONObject, "clickurl");
        zzbv.zzfe();
        this.f9842g = zzyg.m11194a(jSONObject, "imp_urls");
        zzbv.zzfe();
        this.f9843h = zzyg.m11194a(jSONObject, "downloaded_imp_urls");
        zzbv.zzfe();
        this.f9845j = zzyg.m11194a(jSONObject, "fill_urls");
        zzbv.zzfe();
        this.f9847l = zzyg.m11194a(jSONObject, "video_start_urls");
        zzbv.zzfe();
        this.f9849n = zzyg.m11194a(jSONObject, "video_complete_urls");
        zzbv.zzfe();
        this.f9848m = zzyg.m11194a(jSONObject, "video_reward_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzbv.zzfe();
            a = zzyg.m11194a(optJSONObject, "manual_impression_urls");
        } else {
            a = null;
        }
        this.f9844i = a;
        this.f9836a = optJSONObject != null ? optJSONObject.toString() : null;
        optJSONObject = jSONObject.optJSONObject("data");
        this.f9846k = optJSONObject != null ? optJSONObject.toString() : null;
        this.f9840e = optJSONObject != null ? optJSONObject.optString("class_name") : null;
        this.f9850o = jSONObject.optString("html_template", null);
        this.f9851p = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject("assets");
        this.f9852q = optJSONObject != null ? optJSONObject.toString() : null;
        zzbv.zzfe();
        this.f9853r = zzyg.m11194a(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        this.f9854s = optJSONObject != null ? optJSONObject.toString() : null;
        this.f9856u = jSONObject.optString("response_type", null);
        this.f9855t = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean m11187a() {
        return "banner".equalsIgnoreCase(this.f9856u);
    }

    /* renamed from: b */
    public final boolean m11188b() {
        return "native".equalsIgnoreCase(this.f9856u);
    }
}
