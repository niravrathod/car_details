package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzla extends zzen implements zzkz {
    public zzla() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* renamed from: a */
    public static zzkz m21755a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (queryLocalInterface instanceof zzkz) {
            return (zzkz) queryLocalInterface;
        }
        return new zzlb(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo2522a();
        parcel2.writeNoException();
        return true;
    }
}
