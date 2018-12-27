package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
public final class zzmk {
    /* renamed from: a */
    private final zzym f9639a;
    /* renamed from: b */
    private final Context f9640b;
    /* renamed from: c */
    private final zzjn f9641c;
    /* renamed from: d */
    private AdListener f9642d;
    /* renamed from: e */
    private zzjc f9643e;
    /* renamed from: f */
    private zzku f9644f;
    /* renamed from: g */
    private String f9645g;
    /* renamed from: h */
    private AdMetadataListener f9646h;
    /* renamed from: i */
    private AppEventListener f9647i;
    /* renamed from: j */
    private OnCustomRenderedAdLoadedListener f9648j;
    /* renamed from: k */
    private Correlator f9649k;
    /* renamed from: l */
    private RewardedVideoAdListener f9650l;
    /* renamed from: m */
    private boolean f9651m;
    /* renamed from: n */
    private boolean f9652n;

    public zzmk(Context context) {
        this(context, zzjn.f9565a, null);
    }

    public zzmk(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzjn.f9565a, publisherInterstitialAd);
    }

    @VisibleForTesting
    private zzmk(Context context, zzjn zzjn, PublisherInterstitialAd publisherInterstitialAd) {
        this.f9639a = new zzym();
        this.f9640b = context;
        this.f9641c = zzjn;
    }

    /* renamed from: a */
    public final AdListener m10837a() {
        return this.f9642d;
    }

    /* renamed from: b */
    public final String m10848b() {
        return this.f9645g;
    }

    /* renamed from: c */
    public final AppEventListener m10850c() {
        return this.f9647i;
    }

    /* renamed from: d */
    public final OnCustomRenderedAdLoadedListener m10851d() {
        return this.f9648j;
    }

    /* renamed from: e */
    public final boolean m10852e() {
        try {
            if (this.f9644f == null) {
                return false;
            }
            return this.f9644f.isReady();
        } catch (Throwable e) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean m10853f() {
        try {
            if (this.f9644f == null) {
                return false;
            }
            return this.f9644f.isLoading();
        } catch (Throwable e) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void m10845a(zzmg zzmg) {
        try {
            if (this.f9644f == null) {
                String str = "loadAd";
                if (this.f9645g == null) {
                    m10836b(str);
                }
                zzjo a = this.f9651m ? zzjo.m26615a() : new zzjo();
                zzjs b = zzkd.m10710b();
                Context context = this.f9640b;
                this.f9644f = (zzku) new rp(b, context, a, this.f9645g, this.f9639a).m9372a(context, false);
                if (this.f9642d != null) {
                    this.f9644f.zza(new zzjg(this.f9642d));
                }
                if (this.f9643e != null) {
                    this.f9644f.zza(new zzjd(this.f9643e));
                }
                if (this.f9646h != null) {
                    this.f9644f.zza(new zzjj(this.f9646h));
                }
                if (this.f9647i != null) {
                    this.f9644f.zza(new zzjq(this.f9647i));
                }
                if (this.f9648j != null) {
                    this.f9644f.zza(new zzos(this.f9648j));
                }
                if (this.f9649k != null) {
                    this.f9644f.zza(this.f9649k.zzaz());
                }
                if (this.f9650l != null) {
                    this.f9644f.zza(new zzain(this.f9650l));
                }
                this.f9644f.setImmersiveMode(this.f9652n);
            }
            if (this.f9644f.zzb(zzjn.m10692a(this.f9640b, zzmg))) {
                this.f9639a.m26910a(zzmg.m10766j());
            }
        } catch (zzmg zzmg2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", zzmg2);
        }
    }

    /* renamed from: a */
    public final void m10838a(AdListener adListener) {
        try {
            this.f9642d = adListener;
            if (this.f9644f != null) {
                this.f9644f.zza(adListener != null ? new zzjg(adListener) : null);
            }
        } catch (AdListener adListener2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", adListener2);
        }
    }

    /* renamed from: a */
    public final void m10844a(zzjc zzjc) {
        try {
            this.f9643e = zzjc;
            if (this.f9644f != null) {
                this.f9644f.zza(zzjc != null ? new zzjd(zzjc) : null);
            }
        } catch (zzjc zzjc2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", zzjc2);
        }
    }

    /* renamed from: a */
    public final void m10846a(String str) {
        if (this.f9645g == null) {
            this.f9645g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void m10842a(AdMetadataListener adMetadataListener) {
        try {
            this.f9646h = adMetadataListener;
            if (this.f9644f != null) {
                this.f9644f.zza(adMetadataListener != null ? new zzjj(adMetadataListener) : null);
            }
        } catch (AdMetadataListener adMetadataListener2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", adMetadataListener2);
        }
    }

    /* renamed from: g */
    public final Bundle m10854g() {
        try {
            if (this.f9644f != null) {
                return this.f9644f.getAdMetadata();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: a */
    public final void m10840a(AppEventListener appEventListener) {
        try {
            this.f9647i = appEventListener;
            if (this.f9644f != null) {
                this.f9644f.zza(appEventListener != null ? new zzjq(appEventListener) : null);
            }
        } catch (AppEventListener appEventListener2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", appEventListener2);
        }
    }

    /* renamed from: a */
    public final void m10841a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.f9648j = onCustomRenderedAdLoadedListener;
            if (this.f9644f != null) {
                this.f9644f.zza(onCustomRenderedAdLoadedListener != null ? new zzos(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", onCustomRenderedAdLoadedListener2);
        }
    }

    /* renamed from: a */
    public final void m10839a(Correlator correlator) {
        this.f9649k = correlator;
        try {
            if (this.f9644f != null) {
                this.f9644f.zza(this.f9649k == null ? null : this.f9649k.zzaz());
            }
        } catch (Correlator correlator2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", correlator2);
        }
    }

    /* renamed from: a */
    public final void m10843a(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.f9650l = rewardedVideoAdListener;
            if (this.f9644f != null) {
                this.f9644f.zza(rewardedVideoAdListener != null ? new zzain(rewardedVideoAdListener) : null);
            }
        } catch (RewardedVideoAdListener rewardedVideoAdListener2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", rewardedVideoAdListener2);
        }
    }

    /* renamed from: a */
    public final void m10847a(boolean z) {
        this.f9651m = true;
    }

    /* renamed from: h */
    public final String m10855h() {
        try {
            if (this.f9644f != null) {
                return this.f9644f.zzcj();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", e);
        }
        return null;
    }

    /* renamed from: i */
    public final void m10856i() {
        try {
            m10836b("show");
            this.f9644f.showInterstitial();
        } catch (Throwable e) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    public final void m10849b(boolean z) {
        try {
            this.f9652n = z;
            if (this.f9644f != null) {
                this.f9644f.setImmersiveMode(z);
            }
        } catch (boolean z2) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", z2);
        }
    }

    /* renamed from: b */
    private final void m10836b(String str) {
        if (this.f9644f == null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 63);
            stringBuilder.append("The ad unit ID must be set on InterstitialAd before ");
            stringBuilder.append(str);
            stringBuilder.append(" is called.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
