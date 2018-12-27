package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzaer
public final class zzzn extends zzzd {
    /* renamed from: a */
    private final NativeContentAdMapper f20428a;

    public zzzn(NativeContentAdMapper nativeContentAdMapper) {
        this.f20428a = nativeContentAdMapper;
    }

    /* renamed from: m */
    public final zzqg mo2839m() {
        return null;
    }

    /* renamed from: o */
    public final IObjectWrapper mo2841o() {
        return null;
    }

    /* renamed from: a */
    public final String mo2823a() {
        return this.f20428a.getHeadline();
    }

    /* renamed from: b */
    public final List mo2826b() {
        List<Image> images = this.f20428a.getImages();
        if (images == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new zzpa(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo2828c() {
        return this.f20428a.getBody();
    }

    /* renamed from: d */
    public final zzqk mo2830d() {
        Image logo = this.f20428a.getLogo();
        return logo != null ? new zzpa(logo.getDrawable(), logo.getUri(), logo.getScale()) : null;
    }

    /* renamed from: e */
    public final String mo2831e() {
        return this.f20428a.getCallToAction();
    }

    /* renamed from: f */
    public final String mo2832f() {
        return this.f20428a.getAdvertiser();
    }

    /* renamed from: g */
    public final void mo2833g() {
        this.f20428a.recordImpression();
    }

    /* renamed from: a */
    public final void mo2824a(IObjectWrapper iObjectWrapper) {
        this.f20428a.handleClick((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: b */
    public final void mo2827b(IObjectWrapper iObjectWrapper) {
        this.f20428a.trackView((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo2825a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f20428a.trackViews((View) ObjectWrapper.m26020a(iObjectWrapper), (HashMap) ObjectWrapper.m26020a(iObjectWrapper2), (HashMap) ObjectWrapper.m26020a(iObjectWrapper3));
    }

    /* renamed from: c */
    public final void mo2829c(IObjectWrapper iObjectWrapper) {
        this.f20428a.untrackView((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: h */
    public final boolean mo2834h() {
        return this.f20428a.getOverrideImpressionRecording();
    }

    /* renamed from: i */
    public final boolean mo2835i() {
        return this.f20428a.getOverrideClickHandling();
    }

    /* renamed from: j */
    public final Bundle mo2836j() {
        return this.f20428a.getExtras();
    }

    /* renamed from: k */
    public final IObjectWrapper mo2837k() {
        Object adChoicesContent = this.f20428a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m26019a(adChoicesContent);
    }

    /* renamed from: l */
    public final zzly mo2838l() {
        return this.f20428a.getVideoController() != null ? this.f20428a.getVideoController().zzbb() : null;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2840n() {
        Object zzxr = this.f20428a.zzxr();
        if (zzxr == null) {
            return null;
        }
        return ObjectWrapper.m26019a(zzxr);
    }
}
