package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

@zzaer
public final class zzjj extends zzla {
    /* renamed from: a */
    private final AdMetadataListener f20205a;

    public zzjj(AdMetadataListener adMetadataListener) {
        this.f20205a = adMetadataListener;
    }

    /* renamed from: a */
    public final void mo2522a() {
        if (this.f20205a != null) {
            this.f20205a.onAdMetadataChanged();
        }
    }
}
