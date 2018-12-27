package com.facebook.ads.internal.p095n;

import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.n.i */
public class C1841i {
    /* renamed from: a */
    private final double f5617a;
    /* renamed from: b */
    private final double f5618b;

    public C1841i(double d, double d2) {
        this.f5617a = d;
        this.f5618b = d2;
    }

    /* renamed from: a */
    public static C1841i m7021a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("value", 0.0d);
        double optDouble2 = jSONObject.optDouble("scale", 0.0d);
        if (optDouble != 0.0d) {
            if (optDouble2 != 0.0d) {
                return new C1841i(optDouble, optDouble2);
            }
        }
        return null;
    }
}
