package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;

public final class zzss extends zzsd {
    /* renamed from: a */
    private final UnconfirmedClickListener f20386a;

    public zzss(UnconfirmedClickListener unconfirmedClickListener) {
        this.f20386a = unconfirmedClickListener;
    }

    /* renamed from: a */
    public final void mo2690a(String str) {
        this.f20386a.onUnconfirmedClickReceived(str);
    }

    /* renamed from: a */
    public final void mo2689a() {
        this.f20386a.onUnconfirmedClickCancelled();
    }
}
