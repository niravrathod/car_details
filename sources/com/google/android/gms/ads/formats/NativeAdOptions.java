package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.ads.zzaer;

@zzaer
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    /* renamed from: a */
    private final boolean f7624a;
    /* renamed from: b */
    private final int f7625b;
    /* renamed from: c */
    private final boolean f7626c;
    /* renamed from: d */
    private final int f7627d;
    /* renamed from: e */
    private final VideoOptions f7628e;
    /* renamed from: f */
    private final boolean f7629f;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        /* renamed from: a */
        private boolean f7618a = false;
        /* renamed from: b */
        private int f7619b = -1;
        /* renamed from: c */
        private boolean f7620c = false;
        /* renamed from: d */
        private VideoOptions f7621d;
        /* renamed from: e */
        private int f7622e = 1;
        /* renamed from: f */
        private boolean f7623f = false;

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.f7618a = z;
            return this;
        }

        public final Builder setImageOrientation(int i) {
            this.f7619b = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.f7620c = z;
            return this;
        }

        public final Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f7622e = i;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.f7621d = videoOptions;
            return this;
        }

        public final Builder setRequestCustomMuteThisAd(boolean z) {
            this.f7623f = z;
            return this;
        }

        public final NativeAdOptions build() {
            return new NativeAdOptions();
        }
    }

    private NativeAdOptions(Builder builder) {
        this.f7624a = builder.f7618a;
        this.f7625b = builder.f7619b;
        this.f7626c = builder.f7620c;
        this.f7627d = builder.f7622e;
        this.f7628e = builder.f7621d;
        this.f7629f = builder.f7623f;
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.f7624a;
    }

    public final int getImageOrientation() {
        return this.f7625b;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.f7626c;
    }

    public final int getAdChoicesPlacement() {
        return this.f7627d;
    }

    public final VideoOptions getVideoOptions() {
        return this.f7628e;
    }

    public final boolean zzbe() {
        return this.f7629f;
    }
}
