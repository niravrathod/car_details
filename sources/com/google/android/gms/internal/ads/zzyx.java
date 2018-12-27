package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzyx extends zzen implements zzyw {
    public zzyx() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        i = mo2801a();
        parcel2.writeNoException();
        parcel2.writeInt(i);
        return true;
    }
}
