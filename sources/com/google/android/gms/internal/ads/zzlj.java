package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzlj extends zzen implements zzli {
    public zzlj() {
        super("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        long b = mo2536b();
        parcel2.writeNoException();
        parcel2.writeLong(b);
        return true;
    }
}
