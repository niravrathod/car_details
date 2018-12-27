package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzse extends zzem implements zzsc {
    zzse(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: a */
    public final void mo2690a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(1, t_);
    }

    /* renamed from: a */
    public final void mo2689a() {
        m10546b(2, t_());
    }
}
