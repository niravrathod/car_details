package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;

@VisibleForTesting
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize zzva = new AdSize(50, 50, "50x50_mb");
    /* renamed from: a */
    private final int f7597a;
    /* renamed from: b */
    private final int f7598b;
    /* renamed from: c */
    private final String f7599c;

    public AdSize(int i, int i2) {
        String str;
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        if (i2 == -2) {
            str = "AUTO";
        } else {
            str = String.valueOf(i2);
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(str).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("x");
        stringBuilder.append(str);
        stringBuilder.append("_as");
        this(i, i2, stringBuilder.toString());
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1) {
            if (i != -3) {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Invalid width for AdSize: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i2 < 0 && i2 != -2) {
            if (i2 != -4) {
                stringBuilder = new StringBuilder(38);
                stringBuilder.append("Invalid height for AdSize: ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.f7597a = i;
        this.f7598b = i2;
        this.f7599c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f7597a == adSize.f7597a && this.f7598b == adSize.f7598b && this.f7599c.equals(adSize.f7599c) != null;
    }

    public final int getHeight() {
        return this.f7598b;
    }

    public final int getHeightInPixels(Context context) {
        switch (this.f7598b) {
            case -4:
            case -3:
                return -1;
            case -2:
                return zzjo.m26617b(context.getResources().getDisplayMetrics());
            default:
                zzkd.m10709a();
                return zzaoa.m9952a(context, this.f7598b);
        }
    }

    public final int getWidth() {
        return this.f7597a;
    }

    public final int getWidthInPixels(Context context) {
        int i = this.f7597a;
        if (i == -1) {
            return zzjo.m26614a(context.getResources().getDisplayMetrics());
        }
        switch (i) {
            case -4:
            case -3:
                return -1;
            default:
                zzkd.m10709a();
                return zzaoa.m9952a(context, this.f7597a);
        }
    }

    public final int hashCode() {
        return this.f7599c.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.f7598b == -2;
    }

    public final boolean isFullWidth() {
        return this.f7597a == -1;
    }

    public final boolean isFluid() {
        return this.f7597a == -3 && this.f7598b == -4;
    }

    public final String toString() {
        return this.f7599c;
    }
}
