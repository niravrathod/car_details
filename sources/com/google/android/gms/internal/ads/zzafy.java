package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzafy extends zzen implements zzafx {
    public zzafy() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        i2 = 0;
        zzagi zzagi;
        switch (i) {
            case 1:
                i = mo2232a((zzafp) zzeo.m10548a(parcel, zzafp.CREATOR));
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 2:
                zzafp zzafp = (zzafp) zzeo.m10548a(parcel, zzafp.CREATOR);
                parcel = parcel.readStrongBinder();
                if (parcel != null) {
                    i2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (i2 instanceof zzaga) {
                        i2 = (zzaga) i2;
                    } else {
                        i2 = new zzagc(parcel);
                    }
                }
                mo2233a(zzafp, (zzaga) i2);
                parcel2.writeNoException();
                break;
            case 4:
                zzagi = (zzagi) zzeo.m10548a(parcel, zzagi.CREATOR);
                parcel = parcel.readStrongBinder();
                if (parcel != null) {
                    i2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (i2 instanceof zzagd) {
                        i2 = (zzagd) i2;
                    } else {
                        i2 = new zzage(parcel);
                    }
                }
                mo2234a(zzagi, (zzagd) i2);
                parcel2.writeNoException();
                break;
            case 5:
                zzagi = (zzagi) zzeo.m10548a(parcel, zzagi.CREATOR);
                parcel = parcel.readStrongBinder();
                if (parcel != null) {
                    i2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (i2 instanceof zzagd) {
                        i2 = (zzagd) i2;
                    } else {
                        i2 = new zzage(parcel);
                    }
                }
                mo2235b(zzagi, i2);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
