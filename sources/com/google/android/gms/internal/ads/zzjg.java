package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzaer
public final class zzjg extends zzkk {
    /* renamed from: a */
    private final AdListener f20204a;

    public zzjg(AdListener adListener) {
        this.f20204a = adListener;
    }

    /* renamed from: a */
    public final void mo2462a() {
        this.f20204a.onAdClosed();
    }

    /* renamed from: a */
    public final void mo2463a(int i) {
        this.f20204a.onAdFailedToLoad(i);
    }

    /* renamed from: b */
    public final void mo2464b() {
        this.f20204a.onAdLeftApplication();
    }

    /* renamed from: c */
    public final void mo2465c() {
        this.f20204a.onAdLoaded();
    }

    /* renamed from: d */
    public final void mo2466d() {
        this.f20204a.onAdOpened();
    }

    /* renamed from: e */
    public final void mo2467e() {
        this.f20204a.onAdClicked();
    }

    /* renamed from: f */
    public final void mo2468f() {
        this.f20204a.onAdImpression();
    }

    /* renamed from: g */
    public final AdListener m26611g() {
        return this.f20204a;
    }
}
