package com.facebook.ads.internal.protocol;

/* renamed from: com.facebook.ads.internal.protocol.f */
public enum C1900f {
    UNKNOWN(0),
    WEBVIEW_BANNER_LEGACY(4),
    WEBVIEW_BANNER_50(5),
    WEBVIEW_BANNER_90(6),
    WEBVIEW_BANNER_250(7),
    WEBVIEW_INTERSTITIAL_UNKNOWN(100),
    WEBVIEW_INTERSTITIAL_HORIZONTAL(101),
    WEBVIEW_INTERSTITIAL_VERTICAL(102),
    WEBVIEW_INTERSTITIAL_TABLET(103),
    NATIVE_UNKNOWN(200),
    NATIVE_BANNER(500),
    NATIVE_250(201),
    REWARDED_VIDEO(400),
    INSTREAM_VIDEO(300);
    
    /* renamed from: o */
    private final int f5830o;

    private C1900f(int i) {
        this.f5830o = i;
    }

    /* renamed from: a */
    public int m7240a() {
        return this.f5830o;
    }
}
