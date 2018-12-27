package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzaer
public final class zzzm extends zzza {
    /* renamed from: a */
    private final NativeAppInstallAdMapper f20427a;

    public zzzm(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f20427a = nativeAppInstallAdMapper;
    }

    /* renamed from: o */
    public final zzqg mo2820o() {
        return null;
    }

    /* renamed from: q */
    public final IObjectWrapper mo2822q() {
        return null;
    }

    /* renamed from: a */
    public final String mo2802a() {
        return this.f20427a.getHeadline();
    }

    /* renamed from: b */
    public final List mo2805b() {
        List<Image> images = this.f20427a.getImages();
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
    public final String mo2807c() {
        return this.f20427a.getBody();
    }

    /* renamed from: d */
    public final zzqk mo2809d() {
        Image icon = this.f20427a.getIcon();
        return icon != null ? new zzpa(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    /* renamed from: e */
    public final String mo2810e() {
        return this.f20427a.getCallToAction();
    }

    /* renamed from: f */
    public final double mo2811f() {
        return this.f20427a.getStarRating();
    }

    /* renamed from: g */
    public final String mo2812g() {
        return this.f20427a.getStore();
    }

    /* renamed from: h */
    public final String mo2813h() {
        return this.f20427a.getPrice();
    }

    /* renamed from: i */
    public final void mo2814i() {
        this.f20427a.recordImpression();
    }

    /* renamed from: a */
    public final void mo2803a(IObjectWrapper iObjectWrapper) {
        this.f20427a.handleClick((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: b */
    public final void mo2806b(IObjectWrapper iObjectWrapper) {
        this.f20427a.trackView((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo2804a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f20427a.trackViews((View) ObjectWrapper.m26020a(iObjectWrapper), (HashMap) ObjectWrapper.m26020a(iObjectWrapper2), (HashMap) ObjectWrapper.m26020a(iObjectWrapper3));
    }

    /* renamed from: c */
    public final void mo2808c(IObjectWrapper iObjectWrapper) {
        this.f20427a.untrackView((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: j */
    public final boolean mo2815j() {
        return this.f20427a.getOverrideImpressionRecording();
    }

    /* renamed from: k */
    public final boolean mo2816k() {
        return this.f20427a.getOverrideClickHandling();
    }

    /* renamed from: l */
    public final Bundle mo2817l() {
        return this.f20427a.getExtras();
    }

    /* renamed from: m */
    public final zzly mo2818m() {
        return this.f20427a.getVideoController() != null ? this.f20427a.getVideoController().zzbb() : null;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2819n() {
        Object adChoicesContent = this.f20427a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m26019a(adChoicesContent);
    }

    /* renamed from: p */
    public final IObjectWrapper mo2821p() {
        Object zzxr = this.f20427a.zzxr();
        if (zzxr == null) {
            return null;
        }
        return ObjectWrapper.m26019a(zzxr);
    }
}
