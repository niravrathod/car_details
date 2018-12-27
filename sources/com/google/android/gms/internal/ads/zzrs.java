package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzrs extends zzem implements zzrq {
    zzrs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: a */
    public final void mo2685a(zzrg zzrg, String str) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzrg);
        t_.writeString(str);
        m10546b(1, t_);
    }
}
