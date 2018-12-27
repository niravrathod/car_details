package com.facebook.ads.internal.p101q.p102a;

import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.q.a.c */
public enum C1908c {
    APP_AD(0),
    LINK_AD(1),
    APP_AD_V2(2),
    LINK_AD_V2(3),
    APP_ENGAGEMENT_AD(4),
    AD_CHOICES(5),
    JS_TRIGGER(6),
    JS_TRIGGER_NO_AUTO_IMP_LOGGING(7),
    VIDEO_AD(8),
    INLINE_VIDEO_AD(9),
    BANNER_TO_INTERSTITIAL(10),
    NATIVE_CLOSE_BUTTON(11),
    UNIFIED_LOGGING(16),
    HTTP_LINKS(17);
    
    /* renamed from: o */
    public static final C1908c[] f5857o = null;
    /* renamed from: q */
    private static final String f5858q = null;
    /* renamed from: p */
    private final int f5860p;

    static {
        f5857o = new C1908c[]{LINK_AD_V2, APP_ENGAGEMENT_AD, AD_CHOICES, JS_TRIGGER_NO_AUTO_IMP_LOGGING, NATIVE_CLOSE_BUTTON, UNIFIED_LOGGING, HTTP_LINKS};
        JSONArray jSONArray = new JSONArray();
        C1908c[] c1908cArr = f5857o;
        int length = c1908cArr.length;
        int i;
        while (i < length) {
            jSONArray.put(c1908cArr[i].m7255a());
            i++;
        }
        f5858q = jSONArray.toString();
    }

    private C1908c(int i) {
        this.f5860p = i;
    }

    /* renamed from: b */
    public static String m7254b() {
        return f5858q;
    }

    /* renamed from: a */
    public int m7255a() {
        return this.f5860p;
    }

    public String toString() {
        return String.valueOf(this.f5860p);
    }
}
