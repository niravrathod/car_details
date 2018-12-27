package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzkh extends zzen implements zzkg {
    public zzkh() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo2461a();
        parcel2.writeNoException();
        return true;
    }
}
