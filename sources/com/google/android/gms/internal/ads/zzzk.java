package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@zzaer
public final class zzzk extends zzyr {
    /* renamed from: a */
    private final MediationAdapter f20425a;
    /* renamed from: b */
    private zzzl f20426b;

    public zzzk(MediationAdapter mediationAdapter) {
        this.f20425a = mediationAdapter;
    }

    /* renamed from: a */
    public final IObjectWrapper mo2759a() {
        if (this.f20425a instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.m26019a(((MediationBannerAdapter) this.f20425a).getBannerView());
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
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
        zzjo zzjo2 = zzjo;
        zzjk zzjk2 = zzjk;
        if (this.f20425a instanceof MediationBannerAdapter) {
            zzaok.m10001b("Requesting banner ad from adapter.");
            try {
                Date date;
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) r1.f20425a;
                Bundle bundle = null;
                Set hashSet = zzjk2.f20210e != null ? new HashSet(zzjk2.f20210e) : null;
                if (zzjk2.f20207b == -1) {
                    date = null;
                } else {
                    date = new Date(zzjk2.f20207b);
                }
                zzzj zzzj = new zzzj(date, zzjk2.f20209d, hashSet, zzjk2.f20216k, m26926a(zzjk), zzjk2.f20212g, zzjk2.f20223r);
                if (zzjk2.f20218m != null) {
                    bundle = zzjk2.f20218m.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.m26020a(iObjectWrapper), new zzzl(zzyt), m26925a(str, zzjk2, str2), zzc.zza(zzjo2.f20231e, zzjo2.f20228b, zzjo2.f20227a), zzzj, bundle);
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(r1.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo2779j() {
        if (this.f20425a instanceof zzaux) {
            return ((zzaux) this.f20425a).zzoa();
        }
        String str = "Not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
        zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo2763a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, zzyt zzyt) {
        mo2764a(iObjectWrapper, zzjk, str, null, zzyt);
    }

    /* renamed from: a */
    public final void mo2764a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, String str2, zzyt zzyt) {
        zzjk zzjk2 = zzjk;
        if (this.f20425a instanceof MediationInterstitialAdapter) {
            zzaok.m10001b("Requesting interstitial ad from adapter.");
            try {
                Date date;
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) r1.f20425a;
                Bundle bundle = null;
                Set hashSet = zzjk2.f20210e != null ? new HashSet(zzjk2.f20210e) : null;
                if (zzjk2.f20207b == -1) {
                    date = null;
                } else {
                    date = new Date(zzjk2.f20207b);
                }
                zzzj zzzj = new zzzj(date, zzjk2.f20209d, hashSet, zzjk2.f20216k, m26926a(zzjk), zzjk2.f20212g, zzjk2.f20223r);
                if (zzjk2.f20218m != null) {
                    bundle = zzjk2.f20218m.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.m26020a(iObjectWrapper), new zzzl(zzyt), m26925a(str, zzjk2, str2), zzzj, bundle);
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(r1.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo2780k() {
        if (this.f20425a instanceof zzauy) {
            return ((zzauy) this.f20425a).getInterstitialAdapterInfo();
        }
        String str = "Not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
        zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo2765a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, String str2, zzyt zzyt, zzpy zzpy, List<String> list) {
        zzjk zzjk2 = zzjk;
        if (this.f20425a instanceof MediationNativeAdapter) {
            try {
                Date date;
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) r1.f20425a;
                Bundle bundle = null;
                Set hashSet = zzjk2.f20210e != null ? new HashSet(zzjk2.f20210e) : null;
                if (zzjk2.f20207b == -1) {
                    date = null;
                } else {
                    date = new Date(zzjk2.f20207b);
                }
                zzzo zzzo = new zzzo(date, zzjk2.f20209d, hashSet, zzjk2.f20216k, m26926a(zzjk), zzjk2.f20212g, zzpy, list, zzjk2.f20223r);
                if (zzjk2.f20218m != null) {
                    bundle = zzjk2.f20218m.getBundle(mediationNativeAdapter.getClass().getName());
                }
                r1.f20426b = new zzzl(zzyt);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.m26020a(iObjectWrapper), r1.f20426b, m26925a(str, zzjk2, str2), zzzo, bundle);
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "Not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(r1.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo2781l() {
        return new Bundle();
    }

    /* renamed from: h */
    public final zzyz mo2777h() {
        NativeAdMapper a = this.f20426b.m22126a();
        return a instanceof NativeAppInstallAdMapper ? new zzzm((NativeAppInstallAdMapper) a) : null;
    }

    /* renamed from: p */
    public final zzzf mo2785p() {
        UnifiedNativeAdMapper b = this.f20426b.m22127b();
        return b != null ? new zzaae(b) : null;
    }

    /* renamed from: i */
    public final zzzc mo2778i() {
        NativeAdMapper a = this.f20426b.m22126a();
        return a instanceof NativeContentAdMapper ? new zzzn((NativeContentAdMapper) a) : null;
    }

    /* renamed from: n */
    public final zzrg mo2783n() {
        NativeCustomTemplateAd c = this.f20426b.m22128c();
        return c instanceof zzrj ? ((zzrj) c).m21915a() : null;
    }

    /* renamed from: m */
    public final boolean mo2782m() {
        return this.f20425a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: a */
    public final void mo2762a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, zzajg zzajg, String str2) {
        zzjk zzjk2 = zzjk;
        if (this.f20425a instanceof MediationRewardedVideoAdAdapter) {
            zzaok.m10001b("Initialize rewarded video adapter.");
            try {
                Bundle bundle;
                MediationAdRequest mediationAdRequest;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) r1.f20425a;
                Bundle a = m26925a(str2, zzjk2, null);
                if (zzjk2 != null) {
                    Date date;
                    Set hashSet = zzjk2.f20210e != null ? new HashSet(zzjk2.f20210e) : null;
                    if (zzjk2.f20207b == -1) {
                        date = null;
                    } else {
                        date = new Date(zzjk2.f20207b);
                    }
                    zzzj zzzj = new zzzj(date, zzjk2.f20209d, hashSet, zzjk2.f20216k, m26926a(zzjk), zzjk2.f20212g, zzjk2.f20223r);
                    bundle = zzjk2.f20218m != null ? zzjk2.f20218m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    mediationAdRequest = zzzj;
                } else {
                    mediationAdRequest = null;
                    bundle = mediationAdRequest;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.m26020a(iObjectWrapper), mediationAdRequest, str, new zzajj(zzajg), a, bundle);
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(r1.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2761a(IObjectWrapper iObjectWrapper, zzajg zzajg, List<String> list) {
        if (this.f20425a instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzaok.m10001b("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f20425a;
                List arrayList = new ArrayList();
                for (String a : list) {
                    arrayList.add(m26925a(a, null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.m26020a(iObjectWrapper), new zzajj(zzajg), arrayList);
            } catch (IObjectWrapper iObjectWrapper2) {
                zzaok.m10004c("Could not initialize rewarded video adapter.", iObjectWrapper2);
                iObjectWrapper2 = new RemoteException();
            }
        } else {
            iObjectWrapper2 = "Not an InitializableMediationRewardedVideoAdAdapter: ";
            zzajg = String.valueOf(this.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(zzajg.length() != null ? iObjectWrapper2.concat(zzajg) : new String(iObjectWrapper2));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2768a(zzjk zzjk, String str) {
        mo2769a(zzjk, str, null);
    }

    /* renamed from: a */
    public final void mo2769a(zzjk zzjk, String str, String str2) {
        if (this.f20425a instanceof MediationRewardedVideoAdAdapter) {
            zzaok.m10001b("Requesting rewarded video ad from adapter.");
            try {
                Date date;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f20425a;
                Bundle bundle = null;
                Set hashSet = zzjk.f20210e != null ? new HashSet(zzjk.f20210e) : null;
                if (zzjk.f20207b == -1) {
                    date = null;
                } else {
                    date = new Date(zzjk.f20207b);
                }
                MediationAdRequest zzzj = new zzzj(date, zzjk.f20209d, hashSet, zzjk.f20216k, m26926a(zzjk), zzjk.f20212g, zzjk.f20223r);
                if (zzjk.f20218m != null) {
                    bundle = zzjk.f20218m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzzj, m26925a(str, zzjk, str2), bundle);
            } catch (zzjk zzjk2) {
                zzaok.m10002b("", zzjk2);
                zzjk2 = new RemoteException();
            }
        } else {
            zzjk2 = "Not a MediationRewardedVideoAdAdapter: ";
            str = String.valueOf(this.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(str.length() != null ? zzjk2.concat(str) : new String(zzjk2));
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo2775f() {
        if (this.f20425a instanceof MediationRewardedVideoAdAdapter) {
            zzaok.m10001b("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f20425a).showVideo();
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final boolean mo2776g() {
        if (this.f20425a instanceof MediationRewardedVideoAdAdapter) {
            zzaok.m10001b("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f20425a).isInitialized();
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2770a(boolean z) {
        if (this.f20425a instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) this.f20425a).onImmersiveModeUpdated(z);
                return;
            } catch (boolean z2) {
                zzaok.m10002b("", z2);
                return;
            }
        }
        z2 = "Not an OnImmersiveModeUpdatedListener: ";
        String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
        zzaok.m10005d(valueOf.length() != 0 ? z2.concat(valueOf) : new String(z2));
    }

    /* renamed from: o */
    public final zzly mo2784o() {
        if (!(this.f20425a instanceof zzb)) {
            return null;
        }
        try {
            return ((zzb) this.f20425a).getVideoController();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo2771b() {
        if (this.f20425a instanceof MediationInterstitialAdapter) {
            zzaok.m10001b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f20425a).showInterstitial();
            } catch (Throwable th) {
                zzaok.m10002b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f20425a.getClass().getCanonicalName());
            zzaok.m10007e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo2772c() {
        try {
            this.f20425a.onDestroy();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo2773d() {
        try {
            this.f20425a.onPause();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: e */
    public final void mo2774e() {
        try {
            this.f20425a.onResume();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2760a(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        if (this.f20425a instanceof OnContextChangedListener) {
            ((OnContextChangedListener) this.f20425a).onContextChanged(context);
        }
    }

    /* renamed from: a */
    private final Bundle m26925a(String str, zzjk zzjk, String str2) {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        zzaok.m10007e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                str = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    str.putString(str4, jSONObject.getString(str4));
                }
            } else {
                str = bundle;
            }
            if (this.f20425a instanceof AdMobAdapter) {
                str.putString("adJson", str2);
                if (zzjk != null) {
                    str.putInt("tagForChildDirectedTreatment", zzjk.f20212g);
                }
            }
            return str;
        } catch (String str5) {
            zzaok.m10002b("", str5);
            str5 = new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m26926a(zzjk zzjk) {
        if (zzjk.f20211f == null) {
            zzkd.m10709a();
            if (zzaoa.m9961a() == null) {
                return null;
            }
        }
        return true;
    }
}
