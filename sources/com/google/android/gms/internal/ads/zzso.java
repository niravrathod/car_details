package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

@zzaer
public final class zzso extends zzru {
    /* renamed from: a */
    private final OnCustomTemplateAdLoadedListener f20383a;

    public zzso(OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.f20383a = onCustomTemplateAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo2686a(zzrg zzrg) {
        this.f20383a.onCustomTemplateAdLoaded(zzrj.m21914a(zzrg));
    }
}
