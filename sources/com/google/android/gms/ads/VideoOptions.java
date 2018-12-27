package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zznf;

@zzaer
public final class VideoOptions {
    /* renamed from: a */
    private final boolean f7611a;
    /* renamed from: b */
    private final boolean f7612b;
    /* renamed from: c */
    private final boolean f7613c;

    public static final class Builder {
        /* renamed from: a */
        private boolean f7608a = true;
        /* renamed from: b */
        private boolean f7609b = false;
        /* renamed from: c */
        private boolean f7610c = false;

        public final Builder setStartMuted(boolean z) {
            this.f7608a = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.f7609b = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.f7610c = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions();
        }
    }

    public VideoOptions(zznf zznf) {
        this.f7611a = zznf.f20248a;
        this.f7612b = zznf.f20249b;
        this.f7613c = zznf.f20250c;
    }

    private VideoOptions(Builder builder) {
        this.f7611a = builder.f7608a;
        this.f7612b = builder.f7609b;
        this.f7613c = builder.f7610c;
    }

    public final boolean getStartMuted() {
        return this.f7611a;
    }

    public final boolean getCustomControlsRequested() {
        return this.f7612b;
    }

    public final boolean getClickToExpandRequested() {
        return this.f7613c;
    }
}
