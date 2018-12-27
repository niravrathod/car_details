package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zztq extends zzem implements zzto {
    zztq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    /* renamed from: a */
    public final void mo2747a(zztk zztk) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zztk);
        m10546b(1, t_);
    }

    /* renamed from: a */
    public final void mo2746a(int i) {
        Parcel t_ = t_();
        t_.writeInt(i);
        m10546b(2, t_);
    }
}
