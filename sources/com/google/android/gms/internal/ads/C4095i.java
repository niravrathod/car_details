package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;

/* renamed from: com.google.android.gms.internal.ads.i */
final class C4095i implements zzn {
    /* renamed from: a */
    private final /* synthetic */ zzabb f16505a;

    C4095i(zzabb zzabb) {
        this.f16505a = zzabb;
    }

    public final void zzca() {
        zzaok.m10001b("AdMobCustomTabsAdapter overlay is closed.");
        this.f16505a.f19670b.onAdClosed(this.f16505a);
    }

    public final void onPause() {
        zzaok.m10001b("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        zzaok.m10001b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzcb() {
        zzaok.m10001b("Opening AdMobCustomTabsAdapter overlay.");
        this.f16505a.f19670b.onAdOpened(this.f16505a);
    }
}
