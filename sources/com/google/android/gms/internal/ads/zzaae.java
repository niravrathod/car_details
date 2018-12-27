package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzaer
public final class zzaae extends zzzg {
    /* renamed from: a */
    private final UnifiedNativeAdMapper f19664a;

    public zzaae(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f19664a = unifiedNativeAdMapper;
    }

    /* renamed from: k */
    public final zzqg mo2855k() {
        return null;
    }

    /* renamed from: a */
    public final String mo2842a() {
        return this.f19664a.getHeadline();
    }

    /* renamed from: b */
    public final List mo2845b() {
        List<Image> images = this.f19664a.getImages();
        List arrayList = new ArrayList();
        if (images != null) {
            for (Image image : images) {
                arrayList.add(new zzpa(image.getDrawable(), image.getUri(), image.getScale()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo2847c() {
        return this.f19664a.getBody();
    }

    /* renamed from: d */
    public final zzqk mo2848d() {
        Image icon = this.f19664a.getIcon();
        return icon != null ? new zzpa(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    /* renamed from: e */
    public final String mo2849e() {
        return this.f19664a.getCallToAction();
    }

    /* renamed from: f */
    public final String mo2850f() {
        return this.f19664a.getAdvertiser();
    }

    /* renamed from: g */
    public final double mo2851g() {
        return this.f19664a.getStarRating() != null ? this.f19664a.getStarRating().doubleValue() : -1.0d;
    }

    /* renamed from: h */
    public final String mo2852h() {
        return this.f19664a.getStore();
    }

    /* renamed from: i */
    public final String mo2853i() {
        return this.f19664a.getPrice();
    }

    /* renamed from: j */
    public final zzly mo2854j() {
        return this.f19664a.getVideoController() != null ? this.f19664a.getVideoController().zzbb() : null;
    }

    /* renamed from: l */
    public final IObjectWrapper mo2856l() {
        Object adChoicesContent = this.f19664a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m26019a(adChoicesContent);
    }

    /* renamed from: m */
    public final IObjectWrapper mo2857m() {
        Object zzxr = this.f19664a.zzxr();
        if (zzxr == null) {
            return null;
        }
        return ObjectWrapper.m26019a(zzxr);
    }

    /* renamed from: n */
    public final IObjectWrapper mo2858n() {
        Object zzbh = this.f19664a.zzbh();
        if (zzbh == null) {
            return null;
        }
        return ObjectWrapper.m26019a(zzbh);
    }

    /* renamed from: o */
    public final Bundle mo2859o() {
        return this.f19664a.getExtras();
    }

    /* renamed from: p */
    public final boolean mo2860p() {
        return this.f19664a.getOverrideImpressionRecording();
    }

    /* renamed from: q */
    public final boolean mo2861q() {
        return this.f19664a.getOverrideClickHandling();
    }

    /* renamed from: r */
    public final void mo2862r() {
        this.f19664a.recordImpression();
    }

    /* renamed from: a */
    public final void mo2843a(IObjectWrapper iObjectWrapper) {
        this.f19664a.handleClick((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo2844a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f19664a.trackViews((View) ObjectWrapper.m26020a(iObjectWrapper), (HashMap) ObjectWrapper.m26020a(iObjectWrapper2), (HashMap) ObjectWrapper.m26020a(iObjectWrapper3));
    }

    /* renamed from: b */
    public final void mo2846b(IObjectWrapper iObjectWrapper) {
        this.f19664a.untrackView((View) ObjectWrapper.m26020a(iObjectWrapper));
    }
}
