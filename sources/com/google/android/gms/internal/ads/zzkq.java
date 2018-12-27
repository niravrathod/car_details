package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class zzkq extends zzen implements zzkp {
    public zzkq() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        i2 = 0;
        switch (i) {
            case 1:
                IInterface zzdi = zzdi();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, zzdi);
                break;
            case 2:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if ((parcel instanceof zzkj) != 0) {
                        i2 = (zzkj) parcel;
                    } else {
                        i2 = new zzkl(i);
                    }
                }
                zzb((zzkj) i2);
                parcel2.writeNoException();
                break;
            case 3:
                zza((zzrk) zzrl.m21916a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                zza((zzrn) zzro.m21918a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 5:
                zza(parcel.readString(), zzru.m21922a(parcel.readStrongBinder()), zzrr.m21920a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 6:
                zza((zzpy) zzeo.m10548a(parcel, zzpy.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if ((parcel instanceof zzli) != 0) {
                        i2 = (zzli) parcel;
                    } else {
                        i2 = new zzlk(i);
                    }
                }
                zzb((zzli) i2);
                parcel2.writeNoException();
                break;
            case 8:
                zza(zzrx.m21924a(parcel.readStrongBinder()), (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                zza((PublisherAdViewOptions) zzeo.m10548a(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                break;
            case 10:
                zza((zzrz) zzsa.m21926a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                zza((zzti) zzeo.m10548a(parcel, zzti.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                zza((zzto) zztp.m21968a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
