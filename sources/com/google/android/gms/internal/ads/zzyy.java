package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzyy extends zzem implements zzyw {
    zzyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: a */
    public final int mo2801a() {
        Parcel a = m10545a(1, t_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
