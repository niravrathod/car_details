package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

final class th implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ PublisherAdView f8392a;
    /* renamed from: b */
    private final /* synthetic */ zzku f8393b;
    /* renamed from: c */
    private final /* synthetic */ zzsp f8394c;

    th(zzsp zzsp, PublisherAdView publisherAdView, zzku zzku) {
        this.f8394c = zzsp;
        this.f8392a = publisherAdView;
        this.f8393b = zzku;
    }

    public final void run() {
        if (this.f8392a.zza(this.f8393b)) {
            this.f8394c.f20384a.onPublisherAdViewLoaded(this.f8392a);
        } else {
            zzaok.m10007e("Could not bind.");
        }
    }
}
