package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zztb extends zzem implements zzta {
    zztb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final void mo2743a(zzsu zzsu, zzsy zzsy) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzsu);
        zzeo.m10549a(t_, (IInterface) zzsy);
        m10547c(2, t_);
    }
}
