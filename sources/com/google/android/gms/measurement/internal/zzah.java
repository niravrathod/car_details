package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzs;

public abstract class zzah extends zzr implements zzag {
    public zzah() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    protected final boolean mo3112a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo3183a((zzad) zzs.m11950a(parcel, zzad.CREATOR), (zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo3185a((zzfh) zzs.m11950a(parcel, zzfh.CREATOR), (zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo3186a((zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo3184a((zzad) zzs.m11950a(parcel, zzad.CREATOR), (String) parcel.readString(), (String) parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo3190b((zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                i = mo3177a((zzh) zzs.m11950a(parcel, zzh.CREATOR), (boolean) zzs.m11954a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(i);
                break;
            case 9:
                i = mo3189a((zzad) zzs.m11950a(parcel, zzad.CREATOR), (String) parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(i);
                break;
            case 10:
                mo3182a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                i = mo3191c((zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 12:
                mo3188a((zzl) zzs.m11950a(parcel, zzl.CREATOR), (zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo3187a((zzl) zzs.m11950a(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                i = mo3181a((String) parcel.readString(), (String) parcel.readString(), zzs.m11954a(parcel), (zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(i);
                break;
            case 15:
                i = mo3180a((String) parcel.readString(), (String) parcel.readString(), parcel.readString(), (boolean) zzs.m11954a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(i);
                break;
            case 16:
                i = mo3178a((String) parcel.readString(), (String) parcel.readString(), (zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(i);
                break;
            case 17:
                i = mo3179a((String) parcel.readString(), (String) parcel.readString(), (String) parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(i);
                break;
            case 18:
                mo3192d((zzh) zzs.m11950a(parcel, zzh.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
