package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzaia extends zzem implements zzahy {
    zzaia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo2243a() {
        Parcel a = m10545a(1, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo2244b() {
        Parcel a = m10545a(2, t_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
