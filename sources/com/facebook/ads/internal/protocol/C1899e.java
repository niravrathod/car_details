package com.facebook.ads.internal.protocol;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.protocol.e */
public enum C1899e implements Serializable {
    BANNER_320_50(320, 50),
    INTERSTITIAL(0, 0),
    BANNER_HEIGHT_50(-1, 50),
    BANNER_HEIGHT_90(-1, 90),
    RECTANGLE_HEIGHT_250(-1, 250);
    
    /* renamed from: f */
    private final int f5813f;
    /* renamed from: g */
    private final int f5814g;

    private C1899e(int i, int i2) {
        this.f5813f = i;
        this.f5814g = i2;
    }

    /* renamed from: a */
    public static C1899e m7237a(int i, int i2) {
        return (INTERSTITIAL.f5814g == i2 && INTERSTITIAL.f5813f == i) ? INTERSTITIAL : (BANNER_320_50.f5814g == i2 && BANNER_320_50.f5813f == i) ? BANNER_320_50 : (BANNER_HEIGHT_50.f5814g == i2 && BANNER_HEIGHT_50.f5813f == i) ? BANNER_HEIGHT_50 : (BANNER_HEIGHT_90.f5814g == i2 && BANNER_HEIGHT_90.f5813f == i) ? BANNER_HEIGHT_90 : (RECTANGLE_HEIGHT_250.f5814g == i2 && RECTANGLE_HEIGHT_250.f5813f == i) ? RECTANGLE_HEIGHT_250 : null;
    }

    /* renamed from: a */
    public int m7238a() {
        return this.f5813f;
    }

    /* renamed from: b */
    public int m7239b() {
        return this.f5814g;
    }
}
