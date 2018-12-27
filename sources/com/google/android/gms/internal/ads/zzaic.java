package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzaic extends zzem implements zzaib {
    zzaic(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo2245a(zzahy zzahy, String str) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzahy);
        t_.writeString(str);
        m10546b(1, t_);
    }
}
