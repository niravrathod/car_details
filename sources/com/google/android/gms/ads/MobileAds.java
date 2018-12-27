package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzml;
import com.google.android.gms.internal.ads.zzmo;

public class MobileAds {

    public static final class Settings {
        /* renamed from: a */
        private final zzmo f7603a = new zzmo();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        /* renamed from: a */
        final zzmo m8746a() {
            return this.f7603a;
        }
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzml a = zzml.m10857a();
        if (settings == null) {
            settings = null;
        } else {
            settings = settings.m8746a();
        }
        a.m10861a(context, str, settings);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzml.m10857a().m10858a(context);
    }

    public static void setAppVolume(float f) {
        zzml.m10857a().m10859a(f);
    }

    public static void setAppMuted(boolean z) {
        zzml.m10857a().m10863a(z);
    }

    public static void openDebugMenu(Context context, String str) {
        zzml.m10857a().m10860a(context, str);
    }

    @KeepForSdk
    public static void getVersionString() {
        zzml.m10857a().m10866d();
    }

    @KeepForSdk
    public static void registerRtbAdapter(Class<? extends zzaut> cls) {
        zzml.m10857a().m10862a((Class) cls);
    }

    private MobileAds() {
    }
}
