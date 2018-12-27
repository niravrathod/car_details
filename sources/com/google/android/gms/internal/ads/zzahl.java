package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONObject;

@zzaer
public final class zzahl extends zzahn {
    /* renamed from: a */
    private final Object f16802a = new Object();
    /* renamed from: b */
    private final Context f16803b;
    /* renamed from: c */
    private SharedPreferences f16804c;
    /* renamed from: d */
    private final zzxc<JSONObject, JSONObject> f16805d;

    public zzahl(Context context, zzxc<JSONObject, JSONObject> zzxc) {
        this.f16803b = context.getApplicationContext();
        this.f16805d = zzxc;
    }

    /* renamed from: a */
    public final zzapi<Void> mo2237a() {
        synchronized (this.f16802a) {
            if (this.f16804c != null) {
            } else {
                this.f16804c = this.f16803b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzbv.zzer().currentTimeMillis() - this.f16804c.getLong("js_last_update", 0) < ((Long) zzkd.m10713e().m10897a(zznw.bt)).longValue()) {
            return zzaox.m10019a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzaop.m26280a().f19893a);
            jSONObject.put("mf", zzkd.m10713e().m10897a(zznw.bu));
            jSONObject.put("cl", "215809645");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", DynamiteModule.m8890b(this.f16803b, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
            return zzaox.m10022a(this.f16805d.mo4302b(jSONObject), new ca(this), zzapn.f8962b);
        } catch (Throwable e) {
            zzaok.m10002b("Unable to populate SDK Core Constants parameters.", e);
            return zzaox.m10019a(null);
        }
    }

    /* renamed from: a */
    final /* synthetic */ Void m21127a(JSONObject jSONObject) {
        zznw.m10902a(this.f16803b, 1, jSONObject);
        this.f16804c.edit().putLong("js_last_update", zzbv.zzer().currentTimeMillis()).apply();
        return null;
    }
}
