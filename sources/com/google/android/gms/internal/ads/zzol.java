package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzaer
public final class zzol implements CustomRenderedAd {
    /* renamed from: a */
    private final zzom f17293a;

    public zzol(zzom zzom) {
        this.f17293a = zzom;
    }

    public final String getBaseUrl() {
        try {
            return this.f17293a.mo2575a();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f17293a.mo2577b();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f17293a.mo2576a(view != null ? ObjectWrapper.m26019a((Object) view) : null);
        } catch (View view2) {
            zzaok.m10006d("#007 Could not call remote method.", view2);
        }
    }

    public final void recordClick() {
        try {
            this.f17293a.mo2578c();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f17293a.mo2579d();
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }
}
