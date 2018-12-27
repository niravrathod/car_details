package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzqs extends zzem implements zzqr {
    zzqs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    /* renamed from: a */
    public final IBinder mo2624a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper3);
        t_.writeInt(13000000);
        iObjectWrapper = m10545a(1, t_);
        iObjectWrapper2 = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return iObjectWrapper2;
    }
}
