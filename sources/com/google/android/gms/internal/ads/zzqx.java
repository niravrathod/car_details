package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzqx extends zzem implements zzqw {
    zzqx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo2628a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper3);
        iObjectWrapper = m10545a(1, t_);
        iObjectWrapper2 = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return iObjectWrapper2;
    }
}
