package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzaer
public final class zzaiq implements RewardedVideoAd {
    /* renamed from: a */
    private final zzaid f16809a;
    /* renamed from: b */
    private final Context f16810b;
    /* renamed from: c */
    private final Object f16811c = new Object();
    /* renamed from: d */
    private final zzain f16812d = new zzain(null);
    /* renamed from: e */
    private String f16813e;
    /* renamed from: f */
    private String f16814f;

    public zzaiq(Context context, zzaid zzaid) {
        if (zzaid == null) {
            zzaid = new zzmz();
        }
        this.f16809a = zzaid;
        this.f16810b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final void m21168a(String str, zzmg zzmg) {
        synchronized (this.f16811c) {
            if (this.f16809a == null) {
                return;
            }
            try {
                this.f16809a.mo2250a(new zzaio(zzjn.m10692a(this.f16810b, zzmg), str));
            } catch (String str2) {
                zzaok.m10006d("#007 Could not call remote method.", str2);
            }
        }
    }

    public final void loadAd(String str, AdRequest adRequest) {
        m21168a(str, adRequest.zzay());
    }

    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        m21168a(str, publisherAdRequest.zzay());
    }

    public final void show() {
        synchronized (this.f16811c) {
            if (this.f16809a == null) {
                return;
            }
            try {
                this.f16809a.mo2246a();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.f16811c) {
            this.f16812d.m26223a(rewardedVideoAdListener);
            if (this.f16809a != null) {
                try {
                    this.f16809a.mo2249a(this.f16812d);
                } catch (RewardedVideoAdListener rewardedVideoAdListener2) {
                    zzaok.m10006d("#007 Could not call remote method.", rewardedVideoAdListener2);
                }
            }
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.f16811c) {
            if (this.f16809a != null) {
                try {
                    this.f16809a.mo2251a(new zzjj(adMetadataListener));
                } catch (AdMetadataListener adMetadataListener2) {
                    zzaok.m10006d("#007 Could not call remote method.", adMetadataListener2);
                }
            }
        }
    }

    public final Bundle getAdMetadata() {
        synchronized (this.f16811c) {
            Bundle b;
            if (this.f16809a != null) {
                try {
                    b = this.f16809a.mo2254b();
                    return b;
                } catch (Throwable e) {
                    zzaok.m10006d("#007 Could not call remote method.", e);
                }
            }
            b = new Bundle();
            return b;
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f16811c) {
            this.f16813e = str;
            if (this.f16809a != null) {
                try {
                    this.f16809a.mo2256b(str);
                } catch (String str2) {
                    zzaok.m10006d("#007 Could not call remote method.", str2);
                }
            }
        }
    }

    public final boolean isLoaded() {
        synchronized (this.f16811c) {
            if (this.f16809a == null) {
                return false;
            }
            try {
                boolean c = this.f16809a.mo2259c();
                return c;
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    public final void pause() {
        pause(null);
    }

    public final void pause(Context context) {
        synchronized (this.f16811c) {
            if (this.f16809a == null) {
                return;
            }
            try {
                this.f16809a.mo2255b(ObjectWrapper.m26019a((Object) context));
            } catch (Context context2) {
                zzaok.m10006d("#007 Could not call remote method.", context2);
            }
        }
    }

    public final void resume() {
        resume(null);
    }

    public final void resume(Context context) {
        synchronized (this.f16811c) {
            if (this.f16809a == null) {
                return;
            }
            try {
                this.f16809a.mo2257c(ObjectWrapper.m26019a((Object) context));
            } catch (Context context2) {
                zzaok.m10006d("#007 Could not call remote method.", context2);
            }
        }
    }

    public final void destroy() {
        destroy(null);
    }

    public final void destroy(Context context) {
        synchronized (this.f16811c) {
            this.f16812d.m26223a(null);
            if (this.f16809a == null) {
                return;
            }
            try {
                this.f16809a.mo2261d(ObjectWrapper.m26019a((Object) context));
            } catch (Context context2) {
                zzaok.m10006d("#007 Could not call remote method.", context2);
            }
        }
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener g;
        synchronized (this.f16811c) {
            g = this.f16812d.m26230g();
        }
        return g;
    }

    public final String getUserId() {
        String str;
        synchronized (this.f16811c) {
            str = this.f16813e;
        }
        return str;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.f16809a != null) {
                return this.f16809a.mo2264g();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        return null;
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f16811c) {
            if (this.f16809a != null) {
                try {
                    this.f16809a.mo2253a(z);
                } catch (boolean z2) {
                    zzaok.m10006d("#007 Could not call remote method.", z2);
                }
            }
        }
    }

    public final void setCustomData(String str) {
        synchronized (this.f16811c) {
            if (this.f16809a != null) {
                try {
                    this.f16809a.mo2258c(str);
                    this.f16814f = str;
                } catch (String str2) {
                    zzaok.m10006d("#007 Could not call remote method.", str2);
                }
            }
        }
    }

    public final String getCustomData() {
        String str;
        synchronized (this.f16811c) {
            str = this.f16814f;
        }
        return str;
    }
}
