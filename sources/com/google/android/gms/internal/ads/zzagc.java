package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzagc extends zzem implements zzaga {
    zzagc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* renamed from: a */
    public final void mo2236a(zzaft zzaft) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzaft);
        m10546b(1, t_);
    }
}
