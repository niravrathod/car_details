package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzaer
public final class zzakq {
    /* renamed from: a */
    private final long f8829a;
    /* renamed from: b */
    private final List<String> f8830b = new ArrayList();
    /* renamed from: c */
    private final List<String> f8831c = new ArrayList();
    /* renamed from: d */
    private final Map<String, zzxy> f8832d = new HashMap();
    /* renamed from: e */
    private String f8833e;
    /* renamed from: f */
    private String f8834f;
    /* renamed from: g */
    private JSONObject f8835g;
    /* renamed from: h */
    private boolean f8836h;

    public zzakq(String str, long j) {
        int i = 0;
        this.f8836h = false;
        this.f8834f = str;
        this.f8829a = j;
        if (TextUtils.isEmpty(str) == null) {
            try {
                this.f8835g = new JSONObject(str);
                if (this.f8835g.optInt("status", -1) != 1) {
                    this.f8836h = false;
                    zzaok.m10007e("App settings could not be fetched successfully.");
                    return;
                }
                this.f8836h = true;
                this.f8833e = this.f8835g.optString("app_id");
                str = this.f8835g.optJSONArray("ad_unit_id_settings");
                if (str != null) {
                    for (j = null; j < str.length(); j++) {
                        JSONObject jSONObject = str.getJSONObject(j);
                        String optString = jSONObject.optString("format");
                        CharSequence optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f8831c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    jSONObject = jSONObject.optJSONObject("mediation_config");
                                    if (jSONObject != null) {
                                        this.f8832d.put(optString2, new zzxy(jSONObject));
                                    }
                                }
                            }
                        }
                    }
                }
                str = this.f8835g.optJSONArray("persistable_banner_ad_unit_ids");
                if (str != null) {
                    while (i < str.length()) {
                        this.f8830b.add(str.optString(i));
                        i++;
                    }
                }
            } catch (Throwable e) {
                zzaok.m10004c("Exception occurred while processing app setting json", e);
                zzbv.zzeo().m9714a(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long m9701a() {
        return this.f8829a;
    }

    /* renamed from: b */
    public final boolean m9702b() {
        return this.f8836h;
    }

    /* renamed from: c */
    public final String m9703c() {
        return this.f8834f;
    }

    /* renamed from: d */
    public final String m9704d() {
        return this.f8833e;
    }

    /* renamed from: e */
    public final Map<String, zzxy> m9705e() {
        return this.f8832d;
    }
}
