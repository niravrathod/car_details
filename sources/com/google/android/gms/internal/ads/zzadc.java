package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@zzaer
public final class zzadc implements zzadl<zzoz> {
    /* renamed from: a */
    public final /* synthetic */ zzpo mo2220a(zzadd zzadd, JSONObject jSONObject) {
        zzapi a;
        JSONObject a2 = zzanj.m9924a(jSONObject, "html_containers", "instream");
        if (a2 == null) {
            a = zzadd.m9478a(jSONObject, "video");
        } else {
            a = zzadd.m9476a(a2.optString("base_url"), a2.optString("html"), true);
        }
        zzadd = zzadd.m9466a(a);
        if (zzadd != null) {
            return new zzoz(zzadd);
        }
        zzaok.m10007e("Can not get video view for instream ad.");
        return null;
    }
}
