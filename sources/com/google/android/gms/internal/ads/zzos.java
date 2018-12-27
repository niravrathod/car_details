package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzaer
public final class zzos extends zzoq {
    /* renamed from: a */
    private final OnCustomRenderedAdLoadedListener f20254a;

    public zzos(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f20254a = onCustomRenderedAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo2580a(zzom zzom) {
        this.f20254a.onCustomRenderedAdLoaded(new zzol(zzom));
    }
}
