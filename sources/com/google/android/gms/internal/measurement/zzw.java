package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzw extends zzq implements zzu {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo3155a(Bundle bundle) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) bundle);
        Parcel a2 = m11947a(1, a);
        Bundle bundle2 = (Bundle) zzs.m11950a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}
