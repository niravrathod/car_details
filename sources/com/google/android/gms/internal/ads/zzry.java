package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzry extends zzem implements zzrw {
    zzry(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public final void mo2687a(zzku zzku, IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzku);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(1, t_);
    }
}
