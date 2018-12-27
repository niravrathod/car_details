package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzlv extends zzen implements zzlu {
    /* renamed from: a */
    public static zzlu m21763a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzlu) {
            return (zzlu) queryLocalInterface;
        }
        return new zzlw(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
