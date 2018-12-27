package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* renamed from: com.google.ads.mediation.b */
final class C3939b extends AdMetadataListener {
    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f15675a;

    C3939b(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f15675a = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.f15675a.zzhe != null && this.f15675a.zzhf != null) {
            this.f15675a.zzhf.zzc(this.f15675a.zzhe.getAdMetadata());
        }
    }
}
