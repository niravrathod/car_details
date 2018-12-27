package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzld extends zzen implements zzlc {
    public zzld() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public static zzlc m21757a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (queryLocalInterface instanceof zzlc) {
            return (zzlc) queryLocalInterface;
        }
        return new zzle(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo2523a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
