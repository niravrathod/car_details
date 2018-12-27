package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzed extends zzr implements zzec {
    public zzed() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: a */
    protected final boolean mo3112a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo3150a((Bundle) zzs.m11950a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
