package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzeg extends zzr implements zzef {
    public zzeg() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    protected final boolean mo3112a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo3151a(parcel.readString(), parcel.readString(), (Bundle) zzs.m11950a(parcel, Bundle.CREATOR), parcel.readLong());
        parcel2.writeNoException();
        return true;
    }
}
