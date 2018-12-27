package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@zzaer
public final class zzzo implements NativeMediationAdRequest {
    /* renamed from: a */
    private final Date f20429a;
    /* renamed from: b */
    private final int f20430b;
    /* renamed from: c */
    private final Set<String> f20431c;
    /* renamed from: d */
    private final boolean f20432d;
    /* renamed from: e */
    private final Location f20433e;
    /* renamed from: f */
    private final int f20434f;
    /* renamed from: g */
    private final zzpy f20435g;
    /* renamed from: h */
    private final List<String> f20436h = new ArrayList();
    /* renamed from: i */
    private final boolean f20437i;
    /* renamed from: j */
    private final Map<String, Boolean> f20438j = new HashMap();

    public zzzo(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzpy zzpy, List<String> list, boolean z2) {
        this.f20429a = date;
        this.f20430b = i;
        this.f20431c = set;
        this.f20433e = location;
        this.f20432d = z;
        this.f20434f = i2;
        this.f20435g = zzpy;
        this.f20437i = z2;
        date = "custom:";
        if (list != null) {
            for (String str : list) {
                if (str.startsWith(date) != null) {
                    set = str.split(":", 3);
                    if (set.length == 3) {
                        if ("true".equals(set[2]) != null) {
                            this.f20438j.put(set[1], Boolean.valueOf(true));
                        } else if ("false".equals(set[2]) != null) {
                            this.f20438j.put(set[1], Boolean.valueOf(false));
                        }
                    }
                } else {
                    this.f20436h.add(str);
                }
            }
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f20429a;
    }

    @Deprecated
    public final int getGender() {
        return this.f20430b;
    }

    public final Set<String> getKeywords() {
        return this.f20431c;
    }

    public final Location getLocation() {
        return this.f20433e;
    }

    public final boolean isTesting() {
        return this.f20432d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f20434f;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.f20435g == null) {
            return null;
        }
        Builder requestMultipleImages = new Builder().setReturnUrlsForImageAssets(this.f20435g.f20341b).setImageOrientation(this.f20435g.f20342c).setRequestMultipleImages(this.f20435g.f20343d);
        if (this.f20435g.f20340a >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.f20435g.f20344e);
        }
        if (this.f20435g.f20340a >= 3 && this.f20435g.f20345f != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.f20435g.f20345f));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return zzml.m10857a().m10865c();
    }

    public final float getAdVolume() {
        return zzml.m10857a().m10864b();
    }

    public final boolean isAppInstallAdRequested() {
        return this.f20436h != null && (this.f20436h.contains("2") || this.f20436h.contains("6"));
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.f20436h != null && this.f20436h.contains("6");
    }

    public final boolean isContentAdRequested() {
        return this.f20436h != null && (this.f20436h.contains("1") || this.f20436h.contains("6"));
    }

    public final boolean zzok() {
        return this.f20436h != null && this.f20436h.contains("3");
    }

    public final Map<String, Boolean> zzol() {
        return this.f20438j;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f20437i;
    }
}
