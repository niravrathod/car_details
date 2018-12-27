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
public final class zzady implements zzadl<zzpd> {
    /* renamed from: a */
    private final boolean f16779a;
    /* renamed from: b */
    private final boolean f16780b;
    /* renamed from: c */
    private final boolean f16781c;

    public zzady(boolean z, boolean z2, boolean z3) {
        this.f16779a = z;
        this.f16780b = z2;
        this.f16781c = z3;
    }

    /* renamed from: a */
    public final /* synthetic */ zzpo mo2220a(zzadd zzadd, JSONObject jSONObject) {
        String string;
        zzadd zzadd2 = zzadd;
        JSONObject jSONObject2 = jSONObject;
        List<zzapi> a = zzadd.m9480a(jSONObject, "images", false, this.f16779a, this.f16780b);
        Future a2 = zzadd2.m9479a(jSONObject2, "secondary_image", false, this.f16779a);
        Future a3 = zzadd.m9477a(jSONObject);
        zzapi a4 = zzadd2.m9478a(jSONObject2, "video");
        List arrayList = new ArrayList();
        for (zzapi zzapi : a) {
            arrayList.add((zzpa) zzapi.get());
        }
        zzasg a5 = zzadd.m9466a(a4);
        String string2 = jSONObject2.getString("headline");
        if (r0.f16781c) {
            Resources g = zzbv.zzeo().m9722g();
            string = g != null ? g.getString(C2397R.string.s7) : "Test Ad";
            if (string2 != null) {
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 3) + String.valueOf(string2).length());
                stringBuilder.append(string);
                stringBuilder.append(" : ");
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
            return new zzpd(string, arrayList, jSONObject2.getString("body"), (zzqk) a2.get(), jSONObject2.getString("call_to_action"), jSONObject2.getString("advertiser"), (zzov) a3.get(), new Bundle(), a5 == null ? a5.mo4198b() : null, a5 == null ? a5.getView() : null, null, null);
        }
        string = string2;
        if (a5 == null) {
        }
        if (a5 == null) {
        }
        return new zzpd(string, arrayList, jSONObject2.getString("body"), (zzqk) a2.get(), jSONObject2.getString("call_to_action"), jSONObject2.getString("advertiser"), (zzov) a3.get(), new Bundle(), a5 == null ? a5.mo4198b() : null, a5 == null ? a5.getView() : null, null, null);
    }
}
