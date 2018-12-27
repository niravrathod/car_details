package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaih extends zzem implements zzaig {
    zzaih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    /* renamed from: a */
    public final IBinder mo2265a(IObjectWrapper iObjectWrapper, zzyn zzyn, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(13000000);
        iObjectWrapper = m10545a(1, t_);
        zzyn = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return zzyn;
    }
}
