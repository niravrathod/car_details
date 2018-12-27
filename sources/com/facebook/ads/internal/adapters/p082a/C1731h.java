package com.facebook.ads.internal.adapters.p082a;

import com.facebook.ads.internal.adapters.p082a.C1723b.C1722a;
import com.facebook.ads.internal.adapters.p082a.C1726c.C1725a;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.h */
public class C1731h implements Serializable {
    private static final long serialVersionUID = 85021702336014823L;
    /* renamed from: a */
    private final C1726c f5226a;
    /* renamed from: b */
    private final C1728e f5227b;
    /* renamed from: c */
    private final C1723b f5228c;

    private C1731h(C1726c c1726c, C1728e c1728e, C1723b c1723b) {
        this.f5226a = c1726c;
        this.f5227b = c1728e;
        this.f5228c = c1723b;
    }

    /* renamed from: a */
    static C1731h m6550a(JSONObject jSONObject) {
        C1726c a = new C1725a().m6516a(jSONObject.optString("title")).m6518b(jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET)).m6519c(jSONObject.optString("body")).m6517a();
        C1728e c1728e = new C1728e(jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"));
        boolean optBoolean = jSONObject.optBoolean("video_autoplay_enabled");
        C1722a b = new C1722a().m6494a(jSONObject.optString("video_url")).m6495a(optBoolean).m6499b(jSONObject.optBoolean("video_autoplay_with_sound"));
        int i = 0;
        if (optBoolean) {
            i = jSONObject.optInt("unskippable_seconds", 0);
        }
        C1722a a2 = b.m6492a(i);
        jSONObject = jSONObject.optJSONObject("image");
        if (jSONObject != null) {
            a2.m6498b(jSONObject.optString(ImagesContract.URL)).m6500c(jSONObject.optInt("width")).m6501d(jSONObject.optInt("height"));
        }
        return new C1731h(a, c1728e, a2.m6496a());
    }

    /* renamed from: a */
    public C1726c m6551a() {
        return this.f5226a;
    }

    /* renamed from: b */
    public C1728e m6552b() {
        return this.f5227b;
    }

    /* renamed from: c */
    public C1723b m6553c() {
        return this.f5228c;
    }
}
