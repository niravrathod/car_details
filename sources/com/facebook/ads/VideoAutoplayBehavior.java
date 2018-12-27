package com.facebook.ads;

import com.facebook.ads.internal.p095n.C1844m;

public enum VideoAutoplayBehavior {
    DEFAULT,
    ON,
    OFF;

    /* renamed from: a */
    public static VideoAutoplayBehavior m6427a(C1844m c1844m) {
        if (c1844m == null) {
            return DEFAULT;
        }
        switch (c1844m) {
            case DEFAULT:
                return DEFAULT;
            case ON:
                return ON;
            case OFF:
                return OFF;
            default:
                return DEFAULT;
        }
    }
}
