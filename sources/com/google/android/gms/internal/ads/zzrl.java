package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzrl extends zzen implements zzrk {
    public zzrl() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: a */
    public static zzrk m21916a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (queryLocalInterface instanceof zzrk) {
            return (zzrk) queryLocalInterface;
        }
        return new zzrm(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = parcel.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            if (parcel instanceof zzqy) {
                i = (zzqy) parcel;
            } else {
                i = new zzra(i);
            }
        }
        mo2683a(i);
        parcel2.writeNoException();
        return true;
    }
}
