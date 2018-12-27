package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzkt extends zzem implements zzks {
    zzkt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: a */
    public final IBinder mo2486a(IObjectWrapper iObjectWrapper, String str, zzyn zzyn, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(13000000);
        iObjectWrapper = m10545a(1, t_);
        str = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return str;
    }
}
