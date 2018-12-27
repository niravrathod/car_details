package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaca extends zzem implements zzabz {
    zzaca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    /* renamed from: a */
    public final IBinder mo2216a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        iObjectWrapper = m10545a(1, t_);
        IBinder readStrongBinder = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return readStrongBinder;
    }
}
