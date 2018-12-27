package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzava extends zzen implements zzauz {
    /* renamed from: a */
    public static zzauz m21466a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        if (queryLocalInterface instanceof zzauz) {
            return (zzauz) queryLocalInterface;
        }
        return new zzavb(iBinder);
    }
}
