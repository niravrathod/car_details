package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

@zzaer
public final class zzzp<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzyr {
    /* renamed from: a */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f20439a;
    /* renamed from: b */
    private final NETWORK_EXTRAS f20440b;

    public zzzp(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f20439a = mediationAdapter;
        this.f20440b = network_extras;
    }

    /* renamed from: a */
    public final void mo2760a(IObjectWrapper iObjectWrapper) {
    }

    /* renamed from: a */
    public final void mo2761a(IObjectWrapper iObjectWrapper, zzajg zzajg, List<String> list) {
    }

    /* renamed from: a */
    public final void mo2762a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, zzajg zzajg, String str2) {
    }

    /* renamed from: a */
    public final void mo2765a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, String str2, zzyt zzyt, zzpy zzpy, List<String> list) {
    }

    /* renamed from: a */
    public final void mo2768a(zzjk zzjk, String str) {
    }

    /* renamed from: a */
    public final void mo2769a(zzjk zzjk, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo2770a(boolean z) {
    }

    /* renamed from: f */
    public final void mo2775f() {
    }

    /* renamed from: g */
    public final boolean mo2776g() {
        return true;
    }

    /* renamed from: h */
    public final zzyz mo2777h() {
        return null;
    }

    /* renamed from: i */
    public final zzzc mo2778i() {
        return null;
    }

    /* renamed from: m */
    public final boolean mo2782m() {
        return false;
    }

    /* renamed from: n */
    public final zzrg mo2783n() {
        return null;
    }

    /* renamed from: o */
    public final zzly mo2784o() {
        return null;
    }

    /* renamed from: p */
    public final zzzf mo2785p() {
        return null;
    }

    /* renamed from: a */
    public final IObjectWrapper mo2759a() {
        if (this.f20439a instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.m26019a(((MediationBannerAdapter) this.f20439a).getBannerView());
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f20439a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2766a(IObjectWrapper iObjectWrapper, zzjo zzjo, zzjk zzjk, String str, zzyt zzyt) {
        mo2767a(iObjectWrapper, zzjo, zzjk, str, null, zzyt);
    }

    /* renamed from: a */
    public final void mo2767a(IObjectWrapper iObjectWrapper, zzjo zzjo, zzjk zzjk, String str, String str2, zzyt zzyt) {
        if (this.f20439a instanceof MediationBannerAdapter) {
            zzaok.m10001b("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f20439a;
                MediationBannerListener zzzq = new zzzq(zzyt);
                Activity activity = (Activity) ObjectWrapper.m26020a(iObjectWrapper);
                MediationServerParameters a = m26994a(str, zzjk.f20212g, str2);
                str = new AdSize[6];
                zzyt = null;
                str[0] = AdSize.SMART_BANNER;
                str[1] = AdSize.BANNER;
                str[2] = AdSize.IAB_MRECT;
                str[3] = AdSize.IAB_BANNER;
                str[4] = AdSize.IAB_LEADERBOARD;
                str[5] = AdSize.IAB_WIDE_SKYSCRAPER;
                while (zzyt < 6) {
                    if (str[zzyt].getWidth() == zzjo.f20231e && str[zzyt].getHeight() == zzjo.f20228b) {
                        iObjectWrapper = str[zzyt];
                        break;
                    }
                    zzyt++;
                }
                iObjectWrapper = new AdSize(zzc.zza(zzjo.f20231e, zzjo.f20228b, zzjo.f20227a));
                mediationBannerAdapter.requestBannerAd(zzzq, activity, a, iObjectWrapper, zzaac.m9410a(zzjk, m26995a(zzjk)), this.f20440b);
            } catch (IObjectWrapper iObjectWrapper2) {
                zzaok.m10002b("", iObjectWrapper2);
                iObjectWrapper2 = new RemoteException();
            }
        } else {
            iObjectWrapper2 = "Not a MediationBannerAdapter: ";
            zzjo = String.valueOf(this.f20439a.getClass().getCanonicalName());
            zzaok.m10007e(zzjo.length() != null ? iObjectWrapper2.concat(zzjo) : new String(iObjectWrapper2));
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo2779j() {
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo2763a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, zzyt zzyt) {
        mo2764a(iObjectWrapper, zzjk, str, null, zzyt);
    }

    /* renamed from: a */
    public final void mo2764a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, String str2, zzyt zzyt) {
        if (this.f20439a instanceof MediationInterstitialAdapter) {
            zzaok.m10001b("Requesting interstitial ad from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f20439a).requestInterstitialAd(new zzzq(zzyt), (Activity) ObjectWrapper.m26020a(iObjectWrapper), m26994a(str, zzjk.f20212g, str2), zzaac.m9410a(zzjk, m26995a(zzjk)), this.f20440b);
            } catch (IObjectWrapper iObjectWrapper2) {
                zzaok.m10002b("", iObjectWrapper2);
                iObjectWrapper2 = new RemoteException();
            }
        } else {
            iObjectWrapper2 = "Not a MediationInterstitialAdapter: ";
            zzjk = String.valueOf(this.f20439a.getClass().getCanonicalName());
            zzaok.m10007e(zzjk.length() != null ? iObjectWrapper2.concat(zzjk) : new String(iObjectWrapper2));
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo2780k() {
        return new Bundle();
    }

    /* renamed from: b */
    public final void mo2771b() {
        if (this.f20439a instanceof MediationInterstitialAdapter) {
            zzaok.m10001b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f20439a).showInterstitial();
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f20439a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo2781l() {
        return new Bundle();
    }

    /* renamed from: c */
    public final void mo2772c() {
        try {
            this.f20439a.destroy();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo2773d() {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final void mo2774e() {
        throw new RemoteException();
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m26994a(String str, int i, String str2) {
        if (str != null) {
            try {
                i = new JSONObject(str);
                str = new HashMap(i.length());
                str2 = i.keys();
                while (str2.hasNext()) {
                    String str3 = (String) str2.next();
                    str.put(str3, i.getString(str3));
                }
            } catch (String str4) {
                zzaok.m10002b("", str4);
                str4 = new RemoteException();
            }
        } else {
            str4 = new HashMap(0);
        }
        i = this.f20439a.getServerParametersType();
        if (i == 0) {
            return null;
        }
        MediationServerParameters mediationServerParameters = (MediationServerParameters) i.newInstance();
        mediationServerParameters.load(str4);
        return mediationServerParameters;
    }

    /* renamed from: a */
    private static boolean m26995a(zzjk zzjk) {
        if (zzjk.f20211f == null) {
            zzkd.m10709a();
            if (zzaoa.m9961a() == null) {
                return null;
            }
        }
        return true;
    }
}
