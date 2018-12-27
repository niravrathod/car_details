package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzlm extends zzen implements zzll {
    public zzlm() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zza();
                parcel2.writeNoException();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 3:
                zzv(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                setAppMuted(zzeo.m10552a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                zzb(Stub.m20401a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                zza(parcel.readString(), Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                i = zzdo();
                parcel2.writeNoException();
                parcel2.writeFloat(i);
                break;
            case 8:
                boolean zzdp = zzdp();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, zzdp);
                break;
            case 9:
                i = zzdq();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 10:
                zzw(parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                zza(zzyo.m22016a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
