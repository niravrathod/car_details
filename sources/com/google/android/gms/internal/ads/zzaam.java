package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzaam extends zzem implements zzaal {
    zzaam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* renamed from: a */
    public final void mo2189a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(3, t_);
    }
}
