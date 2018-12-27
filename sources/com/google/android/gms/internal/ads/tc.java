package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;
import org.json.JSONObject;

final class tc implements zzu<Object> {
    /* renamed from: a */
    private final /* synthetic */ zzadw f16673a;
    /* renamed from: b */
    private final /* synthetic */ sx f16674b;

    tc(sx sxVar, zzadw zzadw) {
        this.f16674b = sxVar;
        this.f16673a = zzadw;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put(FacebookAdapter.KEY_ID, this.f16674b.f8384b);
            this.f16673a.mo2224a("sendMessageToNativeJs", jSONObject);
        } catch (Object obj2) {
            zzaok.m10002b("Unable to dispatch sendMessageToNativeJs event", obj2);
        }
    }
}
