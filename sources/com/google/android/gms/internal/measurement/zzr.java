package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzr extends Binder implements IInterface {
    /* renamed from: a */
    private static zzt f10151a;

    protected zzr(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    protected boolean mo3112a(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
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
        return mo3112a(i, parcel, parcel2, i2);
    }
}
