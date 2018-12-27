package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzavl extends zzem implements zzavk {
    zzavl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzavi mo2418a(zzavg zzavg) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzavg);
        Parcel a = m10545a(1, t_);
        zzavi zzavi = (zzavi) zzeo.m10548a(a, zzavi.CREATOR);
        a.recycle();
        return zzavi;
    }
}
