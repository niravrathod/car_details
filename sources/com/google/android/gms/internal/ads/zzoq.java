package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzoq extends zzen implements zzop {
    public zzoq() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: a */
    public static zzop m21791a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (queryLocalInterface instanceof zzop) {
            return (zzop) queryLocalInterface;
        }
        return new zzor(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = parcel.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            if (parcel instanceof zzom) {
                i = (zzom) parcel;
            } else {
                i = new zzoo(i);
            }
        }
        mo2580a(i);
        parcel2.writeNoException();
        return true;
    }
}
