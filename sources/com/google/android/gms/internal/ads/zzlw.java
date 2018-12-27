package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzlw extends zzem implements zzlu {
    zzlw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: a */
    public final String mo2550a() {
        Parcel a = m10545a(1, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
