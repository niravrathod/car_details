package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzrr extends zzen implements zzrq {
    public zzrr() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public static zzrq m21920a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (queryLocalInterface instanceof zzrq) {
            return (zzrq) queryLocalInterface;
        }
        return new zzrs(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = parcel.readStrongBinder();
        if (i == 0) {
            i = 0;
        } else {
            IInterface queryLocalInterface = i.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            if (queryLocalInterface instanceof zzrg) {
                i = (zzrg) queryLocalInterface;
            } else {
                i = new zzri(i);
            }
        }
        mo2685a(i, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
