package com.facebook.ads.internal.adapters.p082a;

import android.text.TextUtils;
import com.facebook.ads.internal.adapters.p082a.C1723b.C1722a;
import com.facebook.ads.internal.adapters.p082a.C1726c.C1725a;
import com.facebook.ads.internal.adapters.p082a.C1734i.C1733a;
import com.facebook.ads.internal.p091j.C1814c;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.k */
public class C1736k implements Serializable {
    private static final long serialVersionUID = -5352540727250859603L;
    /* renamed from: a */
    private final C1734i f5240a;
    /* renamed from: b */
    private final C1726c f5241b;
    /* renamed from: c */
    private final C1728e f5242c;
    /* renamed from: d */
    private final C1720a f5243d;
    /* renamed from: e */
    private final C1723b f5244e;
    /* renamed from: f */
    private final C1729f f5245f;
    /* renamed from: g */
    private final String f5246g;
    /* renamed from: h */
    private int f5247h = 200;

    private C1736k(C1734i c1734i, C1726c c1726c, C1728e c1728e, C1720a c1720a, C1723b c1723b, C1729f c1729f, String str) {
        this.f5240a = c1734i;
        this.f5241b = c1726c;
        this.f5242c = c1728e;
        this.f5243d = c1720a;
        this.f5244e = c1723b;
        this.f5245f = c1729f;
        this.f5246g = str;
    }

    /* renamed from: a */
    public static C1736k m6570a(JSONObject jSONObject) {
        C1734i a = new C1733a().m6558a(jSONObject.optString("advertiser_name")).m6560b(jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString(ImagesContract.URL) : "").m6561c(jSONObject.optString("ad_choices_link_url")).m6562d(C1736k.m6572b(jSONObject)).m6559a();
        C1726c a2 = new C1725a().m6516a(jSONObject.optString("title")).m6518b(jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET)).m6519c(jSONObject.optString("body")).m6517a();
        C1728e c1728e = new C1728e(jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"));
        JSONObject optJSONObject = jSONObject.optJSONObject("layout");
        C1735j c1735j = null;
        C1720a c1720a = new C1720a(C1727d.m6523a(optJSONObject != null ? optJSONObject.optJSONObject("portrait") : null), C1727d.m6523a(optJSONObject != null ? optJSONObject.optJSONObject("landscape") : null));
        optJSONObject = jSONObject.optJSONObject("playable_data");
        if (optJSONObject != null) {
            c1735j = new C1735j(optJSONObject.optString("uri"), jSONObject.optInt("skippable_seconds", 0), C1736k.m6573c(optJSONObject));
        }
        return new C1736k(a, a2, c1728e, c1720a, new C1722a().m6494a(jSONObject.optString("video_url")).m6498b(jSONObject.optJSONObject("image") != null ? jSONObject.optJSONObject("image").optString(ImagesContract.URL) : "").m6492a(jSONObject.optInt("skippable_seconds")).m6497b(jSONObject.optInt("video_duration_sec")).m6493a(c1735j).m6496a(), new C1729f(C1814c.m6826a(jSONObject.optString("end_card_markup")), jSONObject.optString("activation_command"), C1736k.m6571a(jSONObject.optJSONArray("end_card_images"))), jSONObject.optString("ct"));
    }

    /* renamed from: a */
    private static List<String> m6571a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        List<String> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            CharSequence optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static String m6572b(JSONObject jSONObject) {
        jSONObject = jSONObject.optJSONObject("generic_text");
        return jSONObject == null ? "Sponsored" : jSONObject.optString("sponsored", "Sponsored");
    }

    /* renamed from: c */
    private static String m6573c(JSONObject jSONObject) {
        jSONObject = jSONObject.optJSONObject("generic_text");
        return jSONObject == null ? "Rewarded Play" : jSONObject.optString("rewarded_play_text", "Rewarded Play");
    }

    /* renamed from: a */
    public C1734i m6574a() {
        return this.f5240a;
    }

    /* renamed from: a */
    public void m6575a(int i) {
        this.f5247h = i;
    }

    /* renamed from: a */
    public void m6576a(String str) {
        this.f5245f.m6535a(str);
    }

    /* renamed from: b */
    public C1726c m6577b() {
        return this.f5241b;
    }

    /* renamed from: b */
    public void m6578b(String str) {
        this.f5244e.m6503a(str);
    }

    /* renamed from: c */
    public C1728e m6579c() {
        return this.f5242c;
    }

    /* renamed from: d */
    public C1720a m6580d() {
        return this.f5243d;
    }

    /* renamed from: e */
    public C1723b m6581e() {
        return this.f5244e;
    }

    /* renamed from: f */
    public C1729f m6582f() {
        return this.f5245f;
    }

    /* renamed from: g */
    public String m6583g() {
        return this.f5246g;
    }

    /* renamed from: h */
    public int m6584h() {
        return this.f5247h;
    }
}
