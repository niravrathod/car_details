package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.impl.C2397R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzaer
public final class zzadx implements zzadl<zzpb> {
    /* renamed from: a */
    private final boolean f16776a;
    /* renamed from: b */
    private final boolean f16777b;
    /* renamed from: c */
    private final boolean f16778c;

    public zzadx(boolean z, boolean z2, boolean z3) {
        this.f16776a = z;
        this.f16777b = z2;
        this.f16778c = z3;
    }

    /* renamed from: a */
    public final /* synthetic */ zzpo mo2220a(zzadd zzadd, JSONObject jSONObject) {
        String string;
        zzadd zzadd2 = zzadd;
        JSONObject jSONObject2 = jSONObject;
        List<zzapi> a = zzadd.m9480a(jSONObject, "images", false, this.f16776a, this.f16777b);
        Future a2 = zzadd2.m9479a(jSONObject2, "app_icon", true, this.f16776a);
        zzapi a3 = zzadd2.m9478a(jSONObject2, "video");
        Future a4 = zzadd.m9477a(jSONObject);
        List arrayList = new ArrayList();
        for (zzapi zzapi : a) {
            arrayList.add((zzpa) zzapi.get());
        }
        zzasg a5 = zzadd.m9466a(a3);
        String string2 = jSONObject2.getString("headline");
        if (r0.f16778c) {
            Resources g = zzbv.zzeo().m9722g();
            string = g != null ? g.getString(C2397R.string.s7) : "Test Ad";
            if (string2 != null) {
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 3) + String.valueOf(string2).length());
                stringBuilder.append(string);
                stringBuilder.append(" : ");
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
            return new zzpb(string, arrayList, jSONObject2.getString("body"), (zzqk) a2.get(), jSONObject2.getString("call_to_action"), jSONObject2.optDouble("rating", -1.0d), jSONObject2.optString("store"), jSONObject2.optString("price"), (zzov) a4.get(), new Bundle(), a5 == null ? a5.mo4198b() : null, a5 == null ? a5.getView() : null, null, null);
        }
        string = string2;
        if (a5 == null) {
        }
        if (a5 == null) {
        }
        return new zzpb(string, arrayList, jSONObject2.getString("body"), (zzqk) a2.get(), jSONObject2.getString("call_to_action"), jSONObject2.optDouble("rating", -1.0d), jSONObject2.optString("store"), jSONObject2.optString("price"), (zzov) a4.get(), new Bundle(), a5 == null ? a5.mo4198b() : null, a5 == null ? a5.getView() : null, null, null);
    }
}
