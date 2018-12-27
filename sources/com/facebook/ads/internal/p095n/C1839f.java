package com.facebook.ads.internal.p095n;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.n.f */
public class C1839f {
    /* renamed from: a */
    private final String f5614a;
    /* renamed from: b */
    private final int f5615b;
    /* renamed from: c */
    private final int f5616c;

    public C1839f(String str, int i, int i2) {
        this.f5614a = str;
        this.f5615b = i;
        this.f5616c = i2;
    }

    /* renamed from: a */
    public static C1839f m7017a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(ImagesContract.URL);
        return optString == null ? null : new C1839f(optString, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    /* renamed from: a */
    public String m7018a() {
        return this.f5614a;
    }

    /* renamed from: b */
    public int m7019b() {
        return this.f5615b;
    }

    /* renamed from: c */
    public int m7020c() {
        return this.f5616c;
    }
}
