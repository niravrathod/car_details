package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzaun extends zzen implements zzaum {
    /* renamed from: a */
    public static zzaum m21464a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof zzaum) {
            return (zzaum) queryLocalInterface;
        }
        return new zzauo(iBinder);
    }
}
