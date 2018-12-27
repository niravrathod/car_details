package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzaer
public class zzkf extends AdListener {
    /* renamed from: a */
    private final Object f17289a = new Object();
    /* renamed from: b */
    private AdListener f17290b;

    /* renamed from: a */
    public final void m21744a(AdListener adListener) {
        synchronized (this.f17289a) {
            this.f17290b = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.f17289a) {
            if (this.f17290b != null) {
                this.f17290b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f17289a) {
            if (this.f17290b != null) {
                this.f17290b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f17289a) {
            if (this.f17290b != null) {
                this.f17290b.onAdLeftApplication();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f17289a) {
            if (this.f17290b != null) {
                this.f17290b.onAdOpened();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f17289a) {
            if (this.f17290b != null) {
                this.f17290b.onAdLoaded();
            }
        }
    }
}
