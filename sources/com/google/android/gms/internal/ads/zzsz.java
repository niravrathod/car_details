package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public abstract class zzsz extends zzen implements zzsy {
    public zzsz() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo4167a((ParcelFileDescriptor) zzeo.m10548a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
