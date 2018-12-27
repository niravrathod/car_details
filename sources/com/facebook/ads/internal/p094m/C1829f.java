package com.facebook.ads.internal.p094m;

/* renamed from: com.facebook.ads.internal.m.f */
public enum C1829f {
    TEST("test"),
    BROWSER_SESSION("browser_session"),
    CLOSE("close"),
    IMPRESSION("impression"),
    INVALIDATION("invalidation"),
    STORE("store"),
    OFF_TARGET_CLICK("off_target_click"),
    OPEN_LINK("open_link"),
    NATIVE_VIEW("native_view"),
    VIDEO("video"),
    USER_RETURN("user_return");
    
    /* renamed from: l */
    private String f5556l;

    private C1829f(String str) {
        this.f5556l = str;
    }

    /* renamed from: a */
    public static C1829f m6922a(String str) {
        for (C1829f c1829f : C1829f.values()) {
            if (c1829f.f5556l.equalsIgnoreCase(str)) {
                return c1829f;
            }
        }
        return null;
    }

    public String toString() {
        return this.f5556l;
    }
}
