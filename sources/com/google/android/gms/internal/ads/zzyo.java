package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzyo extends zzen implements zzyn {
    public zzyo() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static zzyn m22016a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzyn) {
            return (zzyn) queryLocalInterface;
        }
        return new zzyp(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface a;
        switch (i) {
            case 1:
                a = mo2756a(parcel.readString());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a);
                break;
            case 2:
                boolean b = mo2757b(parcel.readString());
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, b);
                break;
            case 3:
                a = mo2758c(parcel.readString());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a);
                break;
            default:
                return false;
        }
        return true;
    }
}
