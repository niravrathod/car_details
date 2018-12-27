package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class zzne extends zzmc {
    /* renamed from: a */
    private final VideoLifecycleCallbacks f20247a;

    public zzne(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f20247a = videoLifecycleCallbacks;
    }

    /* renamed from: a */
    public final void mo2564a() {
        this.f20247a.onVideoStart();
    }

    /* renamed from: b */
    public final void mo2566b() {
        this.f20247a.onVideoPlay();
    }

    /* renamed from: c */
    public final void mo2567c() {
        this.f20247a.onVideoPause();
    }

    /* renamed from: d */
    public final void mo2568d() {
        this.f20247a.onVideoEnd();
    }

    /* renamed from: a */
    public final void mo2565a(boolean z) {
        this.f20247a.onVideoMute(z);
    }
}
