package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzsa extends zzen implements zzrz {
    public zzsa() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public static zzrz m21926a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        if (queryLocalInterface instanceof zzrz) {
            return (zzrz) queryLocalInterface;
        }
        return new zzsb(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = parcel.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            if (parcel instanceof zzsf) {
                i = (zzsf) parcel;
            } else {
                i = new zzsh(i);
            }
        }
        mo2688a(i);
        parcel2.writeNoException();
        return true;
    }
}
