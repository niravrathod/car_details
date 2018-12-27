package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzru extends zzen implements zzrt {
    public zzru() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* renamed from: a */
    public static zzrt m21922a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        if (queryLocalInterface instanceof zzrt) {
            return (zzrt) queryLocalInterface;
        }
        return new zzrv(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = parcel.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            if (parcel instanceof zzrg) {
                i = (zzrg) parcel;
            } else {
                i = new zzri(i);
            }
        }
        mo2686a(i);
        parcel2.writeNoException();
        return true;
    }
}
