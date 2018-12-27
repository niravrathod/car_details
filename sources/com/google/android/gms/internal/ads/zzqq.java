package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzqq extends zzem implements zzqo {
    zzqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final void mo2622a(String str, IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(1, t_);
    }

    /* renamed from: a */
    public final IObjectWrapper mo2618a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        str = m10545a(2, t_);
        IObjectWrapper a = Stub.m20401a(str.readStrongBinder());
        str.recycle();
        return a;
    }

    /* renamed from: a */
    public final void mo2620a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(3, t_);
    }

    /* renamed from: a */
    public final void mo2619a() {
        m10546b(4, t_());
    }

    /* renamed from: a */
    public final void mo2621a(IObjectWrapper iObjectWrapper, int i) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeInt(i);
        m10546b(5, t_);
    }

    /* renamed from: b */
    public final void mo2623b(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(6, t_);
    }
}
