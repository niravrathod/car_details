package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.internal.ads.zzaer;
import java.util.List;
import java.util.Map;

@zzaer
public class UnifiedNativeAdMapper {
    /* renamed from: a */
    private String f7833a;
    /* renamed from: b */
    private List<Image> f7834b;
    /* renamed from: c */
    private String f7835c;
    /* renamed from: d */
    private Image f7836d;
    /* renamed from: e */
    private String f7837e;
    /* renamed from: f */
    private String f7838f;
    /* renamed from: g */
    private Double f7839g;
    /* renamed from: h */
    private String f7840h;
    /* renamed from: i */
    private String f7841i;
    /* renamed from: j */
    private VideoController f7842j;
    /* renamed from: k */
    private boolean f7843k;
    /* renamed from: l */
    private View f7844l;
    /* renamed from: m */
    private View f7845m;
    /* renamed from: n */
    private Object f7846n;
    /* renamed from: o */
    private Bundle f7847o = new Bundle();
    /* renamed from: p */
    private boolean f7848p;
    /* renamed from: q */
    private boolean f7849q;

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void setHeadline(String str) {
        this.f7833a = str;
    }

    public final void setImages(List<Image> list) {
        this.f7834b = list;
    }

    public final void setBody(String str) {
        this.f7835c = str;
    }

    public final void setIcon(Image image) {
        this.f7836d = image;
    }

    public final void setCallToAction(String str) {
        this.f7837e = str;
    }

    public final void setAdvertiser(String str) {
        this.f7838f = str;
    }

    public final void setStarRating(Double d) {
        this.f7839g = d;
    }

    public final void setStore(String str) {
        this.f7840h = str;
    }

    public final void setPrice(String str) {
        this.f7841i = str;
    }

    public final void zza(VideoController videoController) {
        this.f7842j = videoController;
    }

    public void setHasVideoContent(boolean z) {
        this.f7843k = z;
    }

    public void setAdChoicesContent(View view) {
        this.f7844l = view;
    }

    public void setMediaView(View view) {
        this.f7845m = view;
    }

    public final void zzm(Object obj) {
        this.f7846n = obj;
    }

    public final void setExtras(Bundle bundle) {
        this.f7847o = bundle;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f7848p = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f7849q = z;
    }

    public final String getHeadline() {
        return this.f7833a;
    }

    public final List<Image> getImages() {
        return this.f7834b;
    }

    public final String getBody() {
        return this.f7835c;
    }

    public final Image getIcon() {
        return this.f7836d;
    }

    public final String getCallToAction() {
        return this.f7837e;
    }

    public final String getAdvertiser() {
        return this.f7838f;
    }

    public final Double getStarRating() {
        return this.f7839g;
    }

    public final String getStore() {
        return this.f7840h;
    }

    public final String getPrice() {
        return this.f7841i;
    }

    public final VideoController getVideoController() {
        return this.f7842j;
    }

    public boolean hasVideoContent() {
        return this.f7843k;
    }

    public View getAdChoicesContent() {
        return this.f7844l;
    }

    public final View zzxr() {
        return this.f7845m;
    }

    public final Object zzbh() {
        return this.f7846n;
    }

    public final Bundle getExtras() {
        return this.f7847o;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f7848p;
    }

    public final boolean getOverrideClickHandling() {
        return this.f7849q;
    }
}
