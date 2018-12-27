package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@zzaer
public final class zzahf {
    /* renamed from: a */
    private final List<String> f8655a;
    /* renamed from: b */
    private final String f8656b;
    /* renamed from: c */
    private final String f8657c;
    /* renamed from: d */
    private final String f8658d;
    /* renamed from: e */
    private final boolean f8659e;
    /* renamed from: f */
    private final String f8660f;
    /* renamed from: g */
    private final String f8661g;
    /* renamed from: h */
    private String f8662h;
    /* renamed from: i */
    private final int f8663i;
    /* renamed from: j */
    private final boolean f8664j;
    /* renamed from: k */
    private final JSONObject f8665k;
    /* renamed from: l */
    private final String f8666l;
    /* renamed from: m */
    private final boolean f8667m;

    public zzahf(JSONObject jSONObject) {
        List list;
        this.f8662h = jSONObject.optString(ImagesContract.URL);
        this.f8656b = jSONObject.optString("base_uri");
        this.f8657c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        boolean z = optString != null && (optString.equals("1") || optString.equals("true"));
        this.f8659e = z;
        this.f8660f = jSONObject.optString("request_id");
        this.f8658d = jSONObject.optString("type");
        optString = jSONObject.optString("errors");
        if (optString == null) {
            list = null;
        } else {
            list = Arrays.asList(optString.split(","));
        }
        this.f8655a = list;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.f8663i = i;
        this.f8661g = jSONObject.optString("fetched_ad");
        this.f8664j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f8665k = optJSONObject;
        this.f8666l = jSONObject.optString("analytics_query_ad_event_id");
        this.f8667m = jSONObject.optBoolean("is_analytics_logging_enabled");
    }

    /* renamed from: a */
    public final int m9539a() {
        return this.f8663i;
    }

    /* renamed from: b */
    public final String m9540b() {
        return this.f8656b;
    }

    /* renamed from: c */
    public final String m9541c() {
        return this.f8657c;
    }

    /* renamed from: d */
    public final String m9542d() {
        return this.f8662h;
    }

    /* renamed from: e */
    public final boolean m9543e() {
        return this.f8659e;
    }

    /* renamed from: f */
    public final String m9544f() {
        return this.f8661g;
    }

    /* renamed from: g */
    public final boolean m9545g() {
        return this.f8664j;
    }

    /* renamed from: h */
    public final String m9546h() {
        return this.f8666l;
    }

    /* renamed from: i */
    public final boolean m9547i() {
        return this.f8667m;
    }
}
