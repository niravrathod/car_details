package com.facebook.ads.internal.p081a;

/* renamed from: com.facebook.ads.internal.a.a */
public enum C1711a {
    CANNOT_OPEN,
    CANNOT_TRACK;

    /* renamed from: a */
    public static boolean m6459a(C1711a c1711a) {
        if (!CANNOT_OPEN.equals(c1711a)) {
            if (!CANNOT_TRACK.equals(c1711a)) {
                return false;
            }
        }
        return true;
    }
}
