package com.google.android.gms.internal.ads;

import android.support.v4.p017f.C0433m;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
public final class zzadz implements zzadl<zzpf> {
    /* renamed from: a */
    private final boolean f16782a;

    public zzadz(boolean z) {
        this.f16782a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ zzpo mo2220a(zzadd zzadd, JSONObject jSONObject) {
        C0433m c0433m = new C0433m();
        C0433m c0433m2 = new C0433m();
        Future a = zzadd.m9477a(jSONObject);
        zzapi a2 = zzadd.m9478a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                c0433m2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                c0433m.put(jSONObject2.getString("name"), zzadd.m9481a(jSONObject2, "image_value", this.f16782a));
            } else {
                String str = "Unknown custom asset type: ";
                string = String.valueOf(string);
                zzaok.m10007e(string.length() != 0 ? str.concat(string) : new String(str));
            }
        }
        zzadd = zzadd.m9466a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        C0433m c0433m3 = new C0433m();
        for (int i2 = 0; i2 < c0433m.size(); i2++) {
            c0433m3.put(c0433m.m1585b(i2), ((Future) c0433m.m1586c(i2)).get());
        }
        return new zzpf(string2, c0433m3, c0433m2, (zzov) a.get(), zzadd != null ? zzadd.mo4198b() : null, zzadd != null ? zzadd.getView() : null);
    }
}
