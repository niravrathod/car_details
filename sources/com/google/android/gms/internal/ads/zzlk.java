package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzlk extends zzem implements zzli {
    zzlk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* renamed from: b */
    public final long mo2536b() {
        Parcel a = m10545a(1, t_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
