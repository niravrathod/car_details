package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzky extends zzem implements zzkx {
    zzky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo2521a(IObjectWrapper iObjectWrapper, zzjo zzjo, String str, zzyn zzyn, int i, int i2) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyn);
        t_.writeInt(13000000);
        t_.writeInt(i2);
        iObjectWrapper = m10545a(2, t_);
        zzjo = iObjectWrapper.readStrongBinder();
        iObjectWrapper.recycle();
        return zzjo;
    }
}
