package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzee extends zzq implements zzec {
    zzee(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: a */
    public final void mo3150a(Bundle bundle) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) bundle);
        m11948b(1, a);
    }
}
