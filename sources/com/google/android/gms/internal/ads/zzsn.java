package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@zzaer
public final class zzsn extends zzrr {
    /* renamed from: a */
    private final OnCustomClickListener f20382a;

    public zzsn(OnCustomClickListener onCustomClickListener) {
        this.f20382a = onCustomClickListener;
    }

    /* renamed from: a */
    public final void mo2685a(zzrg zzrg, String str) {
        this.f20382a.onCustomClick(zzrj.m21914a(zzrg), str);
    }
}
