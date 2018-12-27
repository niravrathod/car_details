package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzjg;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzkm;
import com.google.android.gms.internal.ads.zzkp;
import com.google.android.gms.internal.ads.zzmg;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzrt;
import com.google.android.gms.internal.ads.zzsl;
import com.google.android.gms.internal.ads.zzsm;
import com.google.android.gms.internal.ads.zzsn;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsr;
import com.google.android.gms.internal.ads.zzym;

public class AdLoader {
    /* renamed from: a */
    private final zzjn f7592a;
    /* renamed from: b */
    private final Context f7593b;
    /* renamed from: c */
    private final zzkm f7594c;

    public static class Builder {
        /* renamed from: a */
        private final Context f7590a;
        /* renamed from: b */
        private final zzkp f7591b;

        public Builder(Context context, String str) {
            this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzkd.m10710b().m10706a(context, str, new zzym()));
        }

        private Builder(Context context, zzkp zzkp) {
            this.f7590a = context;
            this.f7591b = zzkp;
        }

        @Deprecated
        public Builder forContentAd(OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.f7591b.zza(new zzsm(onContentAdLoadedListener));
            } catch (OnContentAdLoadedListener onContentAdLoadedListener2) {
                zzaok.m10004c("Failed to add content ad listener", onContentAdLoadedListener2);
            }
            return this;
        }

        @Deprecated
        public Builder forAppInstallAd(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.f7591b.zza(new zzsl(onAppInstallAdLoadedListener));
            } catch (OnAppInstallAdLoadedListener onAppInstallAdLoadedListener2) {
                zzaok.m10004c("Failed to add app install ad listener", onAppInstallAdLoadedListener2);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.f7591b.zza(new zzsr(onUnifiedNativeAdLoadedListener));
            } catch (OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener2) {
                zzaok.m10004c("Failed to add google native ad listener", onUnifiedNativeAdLoadedListener2);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, OnCustomClickListener onCustomClickListener) {
            try {
                zzkp zzkp = this.f7591b;
                zzrt zzso = new zzso(onCustomTemplateAdLoadedListener);
                if (onCustomClickListener == null) {
                    onCustomTemplateAdLoadedListener = null;
                } else {
                    onCustomTemplateAdLoadedListener = new zzsn(onCustomClickListener);
                }
                zzkp.zza(str, zzso, onCustomTemplateAdLoadedListener);
            } catch (String str2) {
                zzaok.m10004c("Failed to add custom template ad listener", str2);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f7591b.zza(new zzsp(onPublisherAdViewLoadedListener), new zzjo(this.f7590a, adSizeArr));
            } catch (OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener2) {
                zzaok.m10004c("Failed to add publisher banner ad listener", onPublisherAdViewLoadedListener2);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f7591b.zzb(new zzjg(adListener));
            } catch (AdListener adListener2) {
                zzaok.m10004c("Failed to set AdListener.", adListener2);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f7591b.zza(new zzpy(nativeAdOptions));
            } catch (NativeAdOptions nativeAdOptions2) {
                zzaok.m10004c("Failed to specify native ad options", nativeAdOptions2);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.f7591b.zza(publisherAdViewOptions);
            } catch (PublisherAdViewOptions publisherAdViewOptions2) {
                zzaok.m10004c("Failed to specify DFP banner ad options", publisherAdViewOptions2);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            Preconditions.checkNotNull(correlator);
            try {
                this.f7591b.zzb(correlator.f7601a);
            } catch (Correlator correlator2) {
                zzaok.m10004c("Failed to set correlator.", correlator2);
            }
            return this;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.f7590a, this.f7591b.zzdi());
            } catch (Throwable e) {
                zzaok.m10002b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    AdLoader(Context context, zzkm zzkm) {
        this(context, zzkm, zzjn.f9565a);
    }

    private AdLoader(Context context, zzkm zzkm, zzjn zzjn) {
        this.f7593b = context;
        this.f7594c = zzkm;
        this.f7592a = zzjn;
    }

    /* renamed from: a */
    private final void m8744a(zzmg zzmg) {
        try {
            this.f7594c.zzd(zzjn.m10692a(this.f7593b, zzmg));
        } catch (zzmg zzmg2) {
            zzaok.m10002b("Failed to load ad.", zzmg2);
        }
    }

    public void loadAd(AdRequest adRequest) {
        m8744a(adRequest.zzay());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.f7594c.zza(zzjn.m10692a(this.f7593b, adRequest.zzay()), i);
        } catch (AdRequest adRequest2) {
            zzaok.m10002b("Failed to load ads.", adRequest2);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        m8744a(publisherAdRequest.zzay());
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.f7594c.zzcj();
        } catch (Throwable e) {
            zzaok.m10004c("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.f7594c.isLoading();
        } catch (Throwable e) {
            zzaok.m10004c("Failed to check if ad is loading.", e);
            return false;
        }
    }
}
