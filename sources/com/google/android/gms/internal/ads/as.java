package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;
import org.json.JSONObject;

final class as implements zzu<zzasg> {
    /* renamed from: a */
    private final /* synthetic */ zzasg f16424a;
    /* renamed from: b */
    private final /* synthetic */ zzaps f16425b;
    /* renamed from: c */
    private final /* synthetic */ zzaea f16426c;

    as(zzaea zzaea, zzasg zzasg, zzaps zzaps) {
        this.f16426c = zzaea;
        this.f16424a = zzasg;
        this.f16425b = zzaps;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (TextUtils.isEmpty(str2)) {
                obj = new JSONObject(str);
                map = true;
            } else {
                obj = new JSONObject(str2);
                map = null;
            }
            if (this.f16426c.f16790h.equals(obj.optString("ads_id", ""))) {
                this.f16424a.mo4749b("/nativeAdPreProcess", this);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", map);
                jSONObject.put("json", obj);
                this.f16425b.m21290b(jSONObject);
            }
        } catch (Object obj2) {
            zzaok.m10002b("Error while preprocessing json.", obj2);
            this.f16425b.m21289a(obj2);
        }
    }
}
