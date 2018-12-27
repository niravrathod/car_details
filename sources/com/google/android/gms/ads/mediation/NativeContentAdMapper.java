package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

@Deprecated
public class NativeContentAdMapper extends NativeAdMapper {
    /* renamed from: a */
    private String f16381a;
    /* renamed from: f */
    private List<Image> f16382f;
    /* renamed from: g */
    private String f16383g;
    /* renamed from: h */
    private Image f16384h;
    /* renamed from: i */
    private String f16385i;
    /* renamed from: j */
    private String f16386j;

    public final void setHeadline(String str) {
        this.f16381a = str;
    }

    public final void setImages(List<Image> list) {
        this.f16382f = list;
    }

    public final void setBody(String str) {
        this.f16383g = str;
    }

    public final void setLogo(Image image) {
        this.f16384h = image;
    }

    public final void setCallToAction(String str) {
        this.f16385i = str;
    }

    public final void setAdvertiser(String str) {
        this.f16386j = str;
    }

    public final String getHeadline() {
        return this.f16381a;
    }

    public final List<Image> getImages() {
        return this.f16382f;
    }

    public final String getBody() {
        return this.f16383g;
    }

    public final Image getLogo() {
        return this.f16384h;
    }

    public final String getCallToAction() {
        return this.f16385i;
    }

    public final String getAdvertiser() {
        return this.f16386j;
    }
}
