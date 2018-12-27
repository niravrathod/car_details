package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzkn extends zzen implements zzkm {
    public zzkn() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzd((zzjk) zzeo.m10548a(parcel, zzjk.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                i = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, isLoading);
                break;
            case 4:
                i = zzcj();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 5:
                zza((zzjk) zzeo.m10548a(parcel, zzjk.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
