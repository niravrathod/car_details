package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzlh extends zzem implements zzlf {
    zzlh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zzku createBannerAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, zzyn zzyn, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(i);
        iObjectWrapper = m10545a(1, t_);
        zzjo = iObjectWrapper.readStrongBinder();
        if (zzjo == null) {
            zzjo = null;
        } else {
            str = zzjo.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if ((str instanceof zzku) != null) {
                zzjo = (zzku) str;
            } else {
                zzjo = new zzkw(zzjo);
            }
        }
        iObjectWrapper.recycle();
        return zzjo;
    }

    public final zzku createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, zzyn zzyn, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(i);
        iObjectWrapper = m10545a(2, t_);
        zzjo = iObjectWrapper.readStrongBinder();
        if (zzjo == null) {
            zzjo = null;
        } else {
            str = zzjo.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if ((str instanceof zzku) != null) {
                zzjo = (zzku) str;
            } else {
                zzjo = new zzkw(zzjo);
            }
        }
        iObjectWrapper.recycle();
        return zzjo;
    }

    public final zzkp createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzyn zzyn, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(i);
        iObjectWrapper = m10545a(3, t_);
        str = iObjectWrapper.readStrongBinder();
        if (str == null) {
            str = null;
        } else {
            zzyn = str.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if ((zzyn instanceof zzkp) != 0) {
                str = (zzkp) zzyn;
            } else {
                str = new zzkr(str);
            }
        }
        iObjectWrapper.recycle();
        return str;
    }

    public final zzll getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        zzll zzll;
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        iObjectWrapper = m10545a(4, t_);
        IBinder readStrongBinder = iObjectWrapper.readStrongBinder();
        if (readStrongBinder == null) {
            zzll = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzll) {
                zzll = (zzll) queryLocalInterface;
            } else {
                zzll = new zzln(readStrongBinder);
            }
        }
        iObjectWrapper.recycle();
        return zzll;
    }

    public final zzqo createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        iObjectWrapper = m10545a(5, t_);
        iObjectWrapper2 = zzqp.m21855a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return iObjectWrapper2;
    }

    public final zzaid createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzyn zzyn, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(i);
        iObjectWrapper = m10545a(6, t_);
        zzyn = zzaie.m21137a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return zzyn;
    }

    public final zzacg createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        iObjectWrapper = m10545a(7, t_);
        zzacg a = zzach.m21079a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return a;
    }

    public final zzabw createAdOverlay(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        iObjectWrapper = m10545a(8, t_);
        zzabw zzx = zzabx.zzx(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return zzx;
    }

    public final zzll getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeInt(i);
        iObjectWrapper = m10545a(9, t_);
        i = iObjectWrapper.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            IInterface queryLocalInterface = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzll) {
                i = (zzll) queryLocalInterface;
            } else {
                i = new zzln(i);
            }
        }
        iObjectWrapper.recycle();
        return i;
    }

    public final zzku createSearchAdManager(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        t_.writeString(str);
        t_.writeInt(i);
        iObjectWrapper = m10545a(10, t_);
        zzjo = iObjectWrapper.readStrongBinder();
        if (zzjo == null) {
            zzjo = null;
        } else {
            str = zzjo.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if ((str instanceof zzku) != 0) {
                zzjo = (zzku) str;
            } else {
                zzjo = new zzkw(zzjo);
            }
        }
        iObjectWrapper.recycle();
        return zzjo;
    }

    public final zzqt createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper3);
        iObjectWrapper = m10545a(11, t_);
        iObjectWrapper2 = zzqu.m21863a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return iObjectWrapper2;
    }

    public final zzaid createRewardedVideoAdSku(IObjectWrapper iObjectWrapper, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeInt(i);
        iObjectWrapper = m10545a(12, t_);
        i = zzaie.m21137a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return i;
    }
}
