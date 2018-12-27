package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzavb extends zzem implements zzauz {
    zzavb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final boolean mo2415a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        iObjectWrapper = m10545a(2, t_);
        boolean a = zzeo.m10552a(iObjectWrapper);
        iObjectWrapper.recycle();
        return a;
    }

    /* renamed from: b */
    public final void mo2416b(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(4, t_);
    }

    /* renamed from: a */
    public final void mo2414a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        m10546b(5, t_);
    }

    /* renamed from: a */
    public final String mo2413a() {
        Parcel a = m10545a(6, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo2417c(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(7, t_);
    }

    /* renamed from: a */
    public final IObjectWrapper mo2412a(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) {
        Parcel t_ = t_();
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str2);
        t_.writeString(str3);
        t_.writeString(str4);
        t_.writeString(str5);
        str = m10545a(9, t_);
        iObjectWrapper = Stub.m20401a(str.readStrongBinder());
        str.recycle();
        return iObjectWrapper;
    }
}
