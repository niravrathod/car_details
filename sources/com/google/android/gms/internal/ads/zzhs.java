package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzhs extends zzem implements zzhr {
    zzhs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzhl mo2456a(zzho zzho) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzho);
        Parcel a = m10545a(1, t_);
        zzhl zzhl = (zzhl) zzeo.m10548a(a, zzhl.CREATOR);
        a.recycle();
        return zzhl;
    }
}
