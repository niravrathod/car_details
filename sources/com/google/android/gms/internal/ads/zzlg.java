package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzlg extends zzen implements zzlf {
    public zzlg() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static zzlf asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        if (queryLocalInterface instanceof zzlf) {
            return (zzlf) queryLocalInterface;
        }
        return new zzlh(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface createBannerAdManager;
        switch (i) {
            case 1:
                createBannerAdManager = createBannerAdManager(Stub.m20401a(parcel.readStrongBinder()), (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR), parcel.readString(), zzyo.m22016a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 2:
                createBannerAdManager = createInterstitialAdManager(Stub.m20401a(parcel.readStrongBinder()), (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR), parcel.readString(), zzyo.m22016a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 3:
                createBannerAdManager = createAdLoaderBuilder(Stub.m20401a(parcel.readStrongBinder()), parcel.readString(), zzyo.m22016a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 4:
                createBannerAdManager = getMobileAdsSettingsManager(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 5:
                createBannerAdManager = createNativeAdViewDelegate(Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 6:
                createBannerAdManager = createRewardedVideoAd(Stub.m20401a(parcel.readStrongBinder()), zzyo.m22016a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 7:
                createBannerAdManager = createInAppPurchaseManager(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 8:
                createBannerAdManager = createAdOverlay(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 9:
                createBannerAdManager = getMobileAdsSettingsManagerWithClientJarVersion(Stub.m20401a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 10:
                createBannerAdManager = createSearchAdManager(Stub.m20401a(parcel.readStrongBinder()), (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 11:
                createBannerAdManager = createNativeAdViewHolderDelegate(Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            case 12:
                createBannerAdManager = createRewardedVideoAdSku(Stub.m20401a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, createBannerAdManager);
                break;
            default:
                return false;
        }
        return true;
    }
}
