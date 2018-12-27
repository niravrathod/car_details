package com.google.ads;

import android.content.Context;

@Deprecated
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    public static final int FULL_WIDTH = -1;
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    /* renamed from: a */
    private final com.google.android.gms.ads.AdSize f6473a;

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.f6473a = adSize;
    }

    public final boolean isCustomAdSize() {
        return false;
    }

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    private AdSize(int i, int i2, String str) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdSize)) {
            return null;
        }
        return this.f6473a.equals(((AdSize) obj).f6473a);
    }

    public final int hashCode() {
        return this.f6473a.hashCode();
    }

    public final int getWidth() {
        return this.f6473a.getWidth();
    }

    public final int getHeight() {
        return this.f6473a.getHeight();
    }

    public final boolean isFullWidth() {
        return this.f6473a.isFullWidth();
    }

    public final boolean isAutoHeight() {
        return this.f6473a.isAutoHeight();
    }

    public final String toString() {
        return this.f6473a.toString();
    }

    public final int getWidthInPixels(Context context) {
        return this.f6473a.getWidthInPixels(context);
    }

    public final int getHeightInPixels(Context context) {
        return this.f6473a.getHeightInPixels(context);
    }

    public final boolean isSizeAppropriate(int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        i = (float) i;
        float f = (float) width;
        if (i <= f * 1.25f && i >= f * 0.8f) {
            i = (float) i2;
            i2 = (float) height;
            if (i <= 1.25f * i2 && i >= i2 * 1061997773) {
                return true;
            }
        }
        return false;
    }

    public final AdSize findBestSize(AdSize... adSizeArr) {
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        float f = 0.0f;
        int width = getWidth();
        int height = getHeight();
        for (AdSize adSize2 : adSizeArr) {
            int width2 = adSize2.getWidth();
            int height2 = adSize2.getHeight();
            if (isSizeAppropriate(width2, height2)) {
                float f2 = ((float) (width2 * height2)) / ((float) (width * height));
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }
}
