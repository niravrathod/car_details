package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zztn extends zzem implements zztm {
    zztn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: a */
    public final void mo2744a() {
        m10546b(1, t_());
    }

    /* renamed from: a */
    public final void mo2745a(int i) {
        Parcel t_ = t_();
        t_.writeInt(i);
        m10546b(2, t_);
    }
}
