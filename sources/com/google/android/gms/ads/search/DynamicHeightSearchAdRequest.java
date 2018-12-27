package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.zzmg;

public final class DynamicHeightSearchAdRequest {
    /* renamed from: a */
    private final SearchAdRequest f7854a;

    public static final class Builder {
        /* renamed from: a */
        private final com.google.android.gms.ads.search.SearchAdRequest.Builder f7852a = new com.google.android.gms.ads.search.SearchAdRequest.Builder();
        /* renamed from: b */
        private final Bundle f7853b = new Bundle();

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f7852a.addNetworkExtras(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f7852a.addNetworkExtrasBundle(cls, bundle);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f7852a.addCustomEventExtrasBundle(cls, bundle);
            return this;
        }

        public final Builder setPage(int i) {
            this.f7853b.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        public final Builder setNumber(int i) {
            this.f7853b.putString("csa_number", Integer.toString(i));
            return this;
        }

        public final Builder setAdTest(boolean z) {
            this.f7853b.putString("csa_adtest", z ? "on" : "off");
            return this;
        }

        public final Builder setChannel(String str) {
            this.f7853b.putString("csa_channel", str);
            return this;
        }

        public final Builder setHostLanguage(String str) {
            this.f7853b.putString("csa_hl", str);
            return this;
        }

        public final Builder setLocationColor(String str) {
            this.f7853b.putString("csa_colorLocation", str);
            return this;
        }

        public final Builder setLocationFontSize(int i) {
            this.f7853b.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        public final Builder setIsClickToCallEnabled(boolean z) {
            this.f7853b.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        public final Builder setIsLocationEnabled(boolean z) {
            this.f7853b.putString("csa_location", Boolean.toString(z));
            return this;
        }

        public final Builder setIsPlusOnesEnabled(boolean z) {
            this.f7853b.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        public final Builder setIsSellerRatingsEnabled(boolean z) {
            this.f7853b.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        public final Builder setIsSiteLinksEnabled(boolean z) {
            this.f7853b.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        public final Builder setCssWidth(int i) {
            this.f7853b.putString("csa_width", Integer.toString(i));
            return this;
        }

        public final Builder setFontFamily(String str) {
            this.f7853b.putString("csa_fontFamily", str);
            return this;
        }

        public final Builder setFontFamilyAttribution(String str) {
            this.f7853b.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public final Builder setFontSizeAnnotation(int i) {
            this.f7853b.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        public final Builder setFontSizeAttribution(int i) {
            this.f7853b.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        public final Builder setFontSizeDescription(int i) {
            this.f7853b.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        public final Builder setFontSizeDomainLink(int i) {
            this.f7853b.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        public final Builder setFontSizeTitle(int i) {
            this.f7853b.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        public final Builder setColorAdBorder(String str) {
            this.f7853b.putString("csa_colorAdBorder", str);
            return this;
        }

        public final Builder setColorAdSeparator(String str) {
            this.f7853b.putString("csa_colorAdSeparator", str);
            return this;
        }

        public final Builder setColorAnnotation(String str) {
            this.f7853b.putString("csa_colorAnnotation", str);
            return this;
        }

        public final Builder setColorAttribution(String str) {
            this.f7853b.putString("csa_colorAttribution", str);
            return this;
        }

        public final Builder setColorBackground(String str) {
            this.f7853b.putString("csa_colorBackground", str);
            return this;
        }

        public final Builder setColorBorder(String str) {
            this.f7853b.putString("csa_colorBorder", str);
            return this;
        }

        public final Builder setColorDomainLink(String str) {
            this.f7853b.putString("csa_colorDomainLink", str);
            return this;
        }

        public final Builder setColorText(String str) {
            this.f7853b.putString("csa_colorText", str);
            return this;
        }

        public final Builder setColorTitleLink(String str) {
            this.f7853b.putString("csa_colorTitleLink", str);
            return this;
        }

        public final Builder setAdBorderSelectors(String str) {
            this.f7853b.putString("csa_adBorderSelectors", str);
            return this;
        }

        public final Builder setAdjustableLineHeight(int i) {
            this.f7853b.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        public final Builder setAttributionSpacingBelow(int i) {
            this.f7853b.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        public final Builder setBorderSelections(String str) {
            this.f7853b.putString("csa_borderSelections", str);
            return this;
        }

        public final Builder setIsTitleUnderlined(boolean z) {
            this.f7853b.putString("csa_noTitleUnderline", Boolean.toString(z ^ 1));
            return this;
        }

        public final Builder setIsTitleBold(boolean z) {
            this.f7853b.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        public final Builder setVerticalSpacing(int i) {
            this.f7853b.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }

        public final Builder setDetailedAttribution(boolean z) {
            this.f7853b.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        public final Builder setLongerHeadlines(boolean z) {
            this.f7853b.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        public final Builder setAdvancedOptionValue(String str, String str2) {
            this.f7853b.putString(str, str2);
            return this;
        }

        public final DynamicHeightSearchAdRequest build() {
            this.f7852a.addNetworkExtrasBundle(AdMobAdapter.class, this.f7853b);
            return new DynamicHeightSearchAdRequest();
        }

        public final Builder setQuery(String str) {
            this.f7852a.setQuery(str);
            return this;
        }
    }

    private DynamicHeightSearchAdRequest(Builder builder) {
        this.f7854a = builder.f7852a.build();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f7854a.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f7854a.getNetworkExtrasBundle(cls);
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f7854a.getCustomEventExtrasBundle(cls);
    }

    public final String getQuery() {
        return this.f7854a.getQuery();
    }

    public final boolean isTestDevice(Context context) {
        return this.f7854a.isTestDevice(context);
    }

    /* renamed from: a */
    final zzmg m8820a() {
        return this.f7854a.m8823a();
    }
}
