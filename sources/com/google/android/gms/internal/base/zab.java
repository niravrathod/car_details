package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zab extends Binder implements IInterface {
    private static zad zac;

    protected zab(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean onTransact;
        if (i > 16777215) {
            onTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            onTransact = false;
        }
        if (onTransact) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }
}
