package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzafz extends zzem implements zzafx {
    zzafz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzaft mo2232a(zzafp zzafp) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzafp);
        Parcel a = m10545a(1, t_);
        zzaft zzaft = (zzaft) zzeo.m10548a(a, zzaft.CREATOR);
        a.recycle();
        return zzaft;
    }

    /* renamed from: a */
    public final void mo2233a(zzafp zzafp, zzaga zzaga) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzafp);
        zzeo.m10549a(t_, (IInterface) zzaga);
        m10546b(2, t_);
    }

    /* renamed from: a */
    public final void mo2234a(zzagi zzagi, zzagd zzagd) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzagi);
        zzeo.m10549a(t_, (IInterface) zzagd);
        m10546b(4, t_);
    }

    /* renamed from: b */
    public final void mo2235b(zzagi zzagi, zzagd zzagd) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzagi);
        zzeo.m10549a(t_, (IInterface) zzagd);
        m10546b(5, t_);
    }
}
