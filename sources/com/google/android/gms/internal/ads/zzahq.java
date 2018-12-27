package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@zzaer
public final class zzahq implements zzahb {
    /* renamed from: a */
    private zzxc<JSONObject, JSONObject> f16806a;
    /* renamed from: b */
    private zzxc<JSONObject, JSONObject> f16807b;

    public zzahq(Context context) {
        this.f16806a = zzbv.zzez().m11178a(context, zzaop.m26280a()).m11182a("google.afma.request.getAdDictionary", zzxh.f9830a, zzxh.f9830a);
        this.f16807b = zzbv.zzez().m11178a(context, zzaop.m26280a()).m11182a("google.afma.sdkConstants.getSdkConstants", zzxh.f9830a, zzxh.f9830a);
    }

    /* renamed from: a */
    public final zzxc<JSONObject, JSONObject> mo2240a() {
        return this.f16806a;
    }

    /* renamed from: b */
    public final zzxc<JSONObject, JSONObject> mo2241b() {
        return this.f16807b;
    }
}
