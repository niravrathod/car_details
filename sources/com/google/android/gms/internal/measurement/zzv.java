package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzv extends zzr implements zzu {
    /* renamed from: a */
    public static zzu m22630a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof zzu) {
            return (zzu) queryLocalInterface;
        }
        return new zzw(iBinder);
    }
}
