package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@zzaer
public final class zzsm extends zzro {
    /* renamed from: a */
    private final OnContentAdLoadedListener f20381a;

    public zzsm(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f20381a = onContentAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo2684a(zzrc zzrc) {
        this.f20381a.onContentAdLoaded(new zzrf(zzrc));
    }
}
