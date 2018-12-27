package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@zzaer
public final class zzzq<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* renamed from: a */
    private final zzyt f17398a;

    public zzzq(zzyt zzyt) {
        this.f17398a = zzyt;
    }

    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaok.m10001b("Adapter called onClick.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new wq(this));
            return;
        }
        try {
            this.f17398a.mo2786a();
        } catch (MediationBannerAdapter<?, ?> mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaok.m10001b("Adapter called onDismissScreen.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10007e("#008 Must be called on the main UI thread.");
            zzaoa.f8948a.post(new wt(this));
            return;
        }
        try {
            this.f17398a.mo2793b();
        } catch (MediationBannerAdapter<?, ?> mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        mediationBannerAdapter = String.valueOf(errorCode);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(mediationBannerAdapter).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
        stringBuilder.append(mediationBannerAdapter);
        zzaok.m10001b(stringBuilder.toString());
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new wu(this, errorCode));
            return;
        }
        try {
            this.f17398a.mo2787a(zzaac.m9409a(errorCode));
        } catch (MediationBannerAdapter<?, ?> mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaok.m10001b("Adapter called onLeaveApplication.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new wv(this));
            return;
        }
        try {
            this.f17398a.mo2794c();
        } catch (MediationBannerAdapter<?, ?> mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaok.m10001b("Adapter called onPresentScreen.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new ww(this));
            return;
        }
        try {
            this.f17398a.mo2795d();
        } catch (MediationBannerAdapter<?, ?> mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaok.m10001b("Adapter called onReceivedAd.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new wx(this));
            return;
        }
        try {
            this.f17398a.mo2796e();
        } catch (MediationBannerAdapter<?, ?> mediationBannerAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationBannerAdapter2);
        }
    }

    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaok.m10001b("Adapter called onDismissScreen.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new wy(this));
            return;
        }
        try {
            this.f17398a.mo2793b();
        } catch (MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        mediationInterstitialAdapter = String.valueOf(errorCode);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(mediationInterstitialAdapter).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error ");
        stringBuilder.append(mediationInterstitialAdapter);
        stringBuilder.append(".");
        zzaok.m10001b(stringBuilder.toString());
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new C2433a(this, errorCode));
            return;
        }
        try {
            this.f17398a.mo2787a(zzaac.m9409a(errorCode));
        } catch (MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaok.m10001b("Adapter called onLeaveApplication.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new C2434b(this));
            return;
        }
        try {
            this.f17398a.mo2794c();
        } catch (MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaok.m10001b("Adapter called onPresentScreen.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new wr(this));
            return;
        }
        try {
            this.f17398a.mo2795d();
        } catch (MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }

    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaok.m10001b("Adapter called onReceivedAd.");
        zzkd.m10709a();
        if (zzaoa.m9965b() == null) {
            zzaok.m10006d("#008 Must be called on the main UI thread.", null);
            zzaoa.f8948a.post(new ws(this));
            return;
        }
        try {
            this.f17398a.mo2796e();
        } catch (MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter2) {
            zzaok.m10006d("#007 Could not call remote method.", mediationInterstitialAdapter2);
        }
    }
}
