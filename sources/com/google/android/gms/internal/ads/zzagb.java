package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzagb extends zzen implements zzaga {
    public zzagb() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo2236a((zzaft) zzeo.m10548a(parcel, zzaft.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
