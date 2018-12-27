package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaos;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapi;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.b */
final /* synthetic */ class C4058b implements zzaos {
    /* renamed from: a */
    static final zzaos f16332a = new C4058b();

    private C4058b() {
    }

    /* renamed from: a */
    public final zzapi mo1714a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzbv.zzeo().m9726k().mo2353f(jSONObject.getString("appSettingsJson"));
        }
        return zzaox.m10019a(null);
    }
}
