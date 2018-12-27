package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zztp extends zzen implements zzto {
    /* renamed from: a */
    public static zzto m21968a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof zzto) {
            return (zzto) queryLocalInterface;
        }
        return new zztq(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
