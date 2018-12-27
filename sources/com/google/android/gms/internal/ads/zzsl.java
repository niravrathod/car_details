package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@zzaer
public final class zzsl extends zzrl {
    /* renamed from: a */
    private final OnAppInstallAdLoadedListener f20380a;

    public zzsl(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f20380a = onAppInstallAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo2683a(zzqy zzqy) {
        this.f20380a.onAppInstallAdLoaded(new zzrb(zzqy));
    }
}
