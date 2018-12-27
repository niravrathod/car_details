package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.settings.C1964b;

public class AdSettings {
    /* renamed from: a */
    private static boolean f5064a;
    /* renamed from: b */
    private static TestAdType f5065b = TestAdType.DEFAULT;

    public enum TestAdType {
        DEFAULT("DEFAULT", "Default"),
        IMG_16_9_APP_INSTALL("IMG_16_9_APP_INSTALL", "Image App install"),
        IMG_16_9_LINK("IMG_16_9_LINK", "Image link"),
        VIDEO_HD_16_9_46S_APP_INSTALL("VID_HD_16_9_46S_APP_INSTALL", "Video 46 sec App install"),
        VIDEO_HD_16_9_46S_LINK("VID_HD_16_9_46S_LINK", "Video 46 sec link"),
        VIDEO_HD_16_9_15S_APP_INSTALL("VID_HD_16_9_15S_APP_INSTALL", "Video 15 sec App install"),
        VIDEO_HD_16_9_15S_LINK("VID_HD_16_9_15S_LINK", "Video 15 sec link"),
        VIDEO_HD_9_16_39S_APP_INSTALL("VID_HD_9_16_39S_APP_INSTALL", "Video 39 sec App install"),
        VIDEO_HD_9_16_39S_LINK("VID_HD_9_16_39S_LINK", "Video 39 sec link"),
        CAROUSEL_IMG_SQUARE_APP_INSTALL("CAROUSEL_IMG_SQUARE_APP_INSTALL", "Carousel App install"),
        CAROUSEL_IMG_SQUARE_LINK("CAROUSEL_IMG_SQUARE_LINK", "Carousel link");
        
        /* renamed from: a */
        private final String f5062a;
        /* renamed from: b */
        private final String f5063b;

        private TestAdType(String str, String str2) {
            this.f5062a = str;
            this.f5063b = str2;
        }

        /* renamed from: a */
        public String m6373a() {
            return this.f5062a;
        }
    }

    /* renamed from: a */
    public static String m6374a() {
        return C1964b.m7436b();
    }

    /* renamed from: a */
    public static void m6375a(String str) {
        C1964b.m7433a(str);
    }

    /* renamed from: a */
    public static void m6376a(boolean z) {
        f5064a = z;
    }

    /* renamed from: a */
    public static boolean m6377a(Context context) {
        return C1964b.m7435a(context);
    }

    /* renamed from: b */
    public static boolean m6378b() {
        return f5064a;
    }

    /* renamed from: c */
    public static TestAdType m6379c() {
        return f5065b;
    }
}
