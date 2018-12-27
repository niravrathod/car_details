package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzsi extends UnifiedNativeAd {
    /* renamed from: a */
    private final zzsf f17329a;
    /* renamed from: b */
    private final List<Image> f17330b = new ArrayList();
    /* renamed from: c */
    private final zzqn f17331c;
    /* renamed from: d */
    private final VideoController f17332d = new VideoController();
    /* renamed from: e */
    private final AdChoicesInfo f17333e;
    /* renamed from: f */
    private final List<MuteThisAdReason> f17334f = new ArrayList();

    public zzsi(zzsf zzsf) {
        List f;
        zzqn zzqn;
        this.f17329a = zzsf;
        zzsf = null;
        try {
            f = this.f17329a.mo2698f();
            if (f != null) {
                for (Object next : f) {
                    zzqk zzqm;
                    if (next instanceof IBinder) {
                        IBinder iBinder = (IBinder) next;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            zzqm = queryLocalInterface instanceof zzqk ? (zzqk) queryLocalInterface : new zzqm(iBinder);
                            if (zzqm != null) {
                                this.f17330b.add(new zzqn(zzqm));
                            }
                        }
                    }
                    zzqm = null;
                    if (zzqm != null) {
                        this.f17330b.add(new zzqn(zzqm));
                    }
                }
            }
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
        try {
            f = this.f17329a.mo2699g();
            if (f != null) {
                for (Object next2 : f) {
                    zzlu a = next2 instanceof IBinder ? zzlv.m21763a((IBinder) next2) : null;
                    if (a != null) {
                        this.f17334f.add(new zzlx(a));
                    }
                }
            }
        } catch (Throwable e2) {
            zzaok.m10002b("", e2);
        }
        try {
            zzqk j = this.f17329a.mo2702j();
            if (j != null) {
                zzqn = new zzqn(j);
                this.f17331c = zzqn;
                if (this.f17329a.mo2713u() != null) {
                    zzsf = new zzqj(this.f17329a.mo2713u());
                }
                this.f17333e = zzsf;
            }
        } catch (Throwable e22) {
            zzaok.m10002b("", e22);
        }
        zzqn = null;
        this.f17331c = zzqn;
        try {
            if (this.f17329a.mo2713u() != null) {
                zzsf = new zzqj(this.f17329a.mo2713u());
            }
        } catch (Throwable e222) {
            zzaok.m10002b("", e222);
        }
        this.f17333e = zzsf;
    }

    /* renamed from: b */
    private final IObjectWrapper m21957b() {
        try {
            return this.f17329a.mo2709q();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Object zzbh() {
        try {
            IObjectWrapper r = this.f17329a.mo2710r();
            if (r != null) {
                return ObjectWrapper.m26020a(r);
            }
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
        return null;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f17329a.mo2691a(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f17329a.mo2695b(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
            return null;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f17329a.mo2696c(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10002b("", bundle2);
        }
    }

    public final String getHeadline() {
        try {
            return this.f17329a.mo2697e();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final List<Image> getImages() {
        return this.f17330b;
    }

    public final String getBody() {
        try {
            return this.f17329a.mo2701i();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Image getIcon() {
        return this.f17331c;
    }

    public final String getCallToAction() {
        try {
            return this.f17329a.mo2703k();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double m = this.f17329a.mo2705m();
            if (m == -1.0d) {
                return null;
            }
            return Double.valueOf(m);
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.f17329a.mo2706n();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final String getPrice() {
        try {
            return this.f17329a.mo2707o();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f17329a.mo2708p() != null) {
                this.f17332d.zza(this.f17329a.mo2708p());
            }
        } catch (Throwable e) {
            zzaok.m10002b("Exception occurred while getting video controller", e);
        }
        return this.f17332d;
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f17333e;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.f17329a.mo2711s();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle t = this.f17329a.mo2712t();
            if (t != null) {
                return t;
            }
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
        return new Bundle();
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f17334f;
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f17329a.mo2700h();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return false;
        }
    }

    public final void destroy() {
        try {
            this.f17329a.mo2714v();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
        }
    }

    public final void setUnconfirmedClickListener(UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f17329a.mo2694a(new zzss(unconfirmedClickListener));
        } catch (UnconfirmedClickListener unconfirmedClickListener2) {
            zzaok.m10002b("Failed to setUnconfirmedClickListener", unconfirmedClickListener2);
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzaok.m10003c("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.f17329a.mo2693a(null);
            } else if (muteThisAdReason instanceof zzlx) {
                this.f17329a.mo2693a(((zzlx) muteThisAdReason).m21765a());
            } else {
                zzaok.m10003c("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (MuteThisAdReason muteThisAdReason2) {
            zzaok.m10002b("", muteThisAdReason2);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f17329a.mo2692a(new zzlt(muteThisAdListener));
        } catch (MuteThisAdListener muteThisAdListener2) {
            zzaok.m10002b("", muteThisAdListener2);
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.f17329a.mo2717y();
        } catch (Throwable e) {
            zzaok.m10002b("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final String getAdvertiser() {
        try {
            return this.f17329a.mo2704l();
        } catch (Throwable e) {
            zzaok.m10002b("", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2718a() {
        return m21957b();
    }
}
