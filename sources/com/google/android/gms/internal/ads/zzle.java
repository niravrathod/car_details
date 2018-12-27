package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzle extends zzem implements zzlc {
    zzle(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo2523a(String str, String str2) {
        Parcel t_ = t_();
        t_.writeString(str);
        t_.writeString(str2);
        m10546b(1, t_);
    }
}
