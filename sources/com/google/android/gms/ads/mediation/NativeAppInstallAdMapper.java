package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

@Deprecated
public class NativeAppInstallAdMapper extends NativeAdMapper {
    /* renamed from: a */
    private String f16373a;
    /* renamed from: f */
    private List<Image> f16374f;
    /* renamed from: g */
    private String f16375g;
    /* renamed from: h */
    private Image f16376h;
    /* renamed from: i */
    private String f16377i;
    /* renamed from: j */
    private double f16378j;
    /* renamed from: k */
    private String f16379k;
    /* renamed from: l */
    private String f16380l;

    public final void setHeadline(String str) {
        this.f16373a = str;
    }

    public final void setImages(List<Image> list) {
        this.f16374f = list;
    }

    public final void setBody(String str) {
        this.f16375g = str;
    }

    public final void setIcon(Image image) {
        this.f16376h = image;
    }

    public final void setCallToAction(String str) {
        this.f16377i = str;
    }

    public final void setStarRating(double d) {
        this.f16378j = d;
    }

    public final void setStore(String str) {
        this.f16379k = str;
    }

    public final void setPrice(String str) {
        this.f16380l = str;
    }

    public final String getHeadline() {
        return this.f16373a;
    }

    public final List<Image> getImages() {
        return this.f16374f;
    }

    public final String getBody() {
        return this.f16375g;
    }

    public final Image getIcon() {
        return this.f16376h;
    }

    public final String getCallToAction() {
        return this.f16377i;
    }

    public final double getStarRating() {
        return this.f16378j;
    }

    public final String getStore() {
        return this.f16379k;
    }

    public final String getPrice() {
        return this.f16380l;
    }
}
