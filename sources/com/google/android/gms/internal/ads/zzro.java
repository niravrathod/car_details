package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzro extends zzen implements zzrn {
    public zzro() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public static zzrn m21918a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (queryLocalInterface instanceof zzrn) {
            return (zzrn) queryLocalInterface;
        }
        return new zzrp(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = parcel.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            if (parcel instanceof zzrc) {
                i = (zzrc) parcel;
            } else {
                i = new zzre(i);
            }
        }
        mo2684a(i);
        parcel2.writeNoException();
        return true;
    }
}
