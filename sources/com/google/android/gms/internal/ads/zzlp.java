package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzlp extends zzem implements zzlo {
    zzlp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo2548a(IObjectWrapper iObjectWrapper, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeInt(13000000);
        iObjectWrapper = m10545a(1, t_);
        i = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return i;
    }
}
