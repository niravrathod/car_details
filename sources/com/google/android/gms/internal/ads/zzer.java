package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzer extends zzen implements zzeq {
    /* renamed from: a */
    public static zzeq m21671a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof zzeq) {
            return (zzeq) queryLocalInterface;
        }
        return new zzes(iBinder);
    }
}
