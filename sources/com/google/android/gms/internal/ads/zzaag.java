package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzaag extends zzem implements zzaaf {
    zzaag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* renamed from: a */
    public final void mo2186a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(2, t_);
    }
}
