package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzaai extends zzem implements zzaah {
    zzaai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo2187a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(3, t_);
    }
}
