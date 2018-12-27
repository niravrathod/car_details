package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.Map;
import org.json.JSONObject;

final /* synthetic */ class sz implements zzato {
    /* renamed from: a */
    private final sy f16666a;
    /* renamed from: b */
    private final Map f16667b;
    /* renamed from: c */
    private final zzadw f16668c;

    sz(sy syVar, Map map, zzadw zzadw) {
        this.f16666a = syVar;
        this.f16667b = map;
        this.f16668c = zzadw;
    }

    /* renamed from: a */
    public final void mo1722a(boolean z) {
        z = this.f16666a;
        Map map = this.f16667b;
        zzadw zzadw = this.f16668c;
        z.f16664a.f8384b = (String) map.get(FacebookAdapter.KEY_ID);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put(FacebookAdapter.KEY_ID, z.f16664a.f8384b);
            zzadw.mo2224a("sendMessageToNativeJs", jSONObject);
        } catch (boolean z2) {
            zzaok.m10002b("Unable to dispatch sendMessageToNativeJs event", z2);
        }
    }
}
