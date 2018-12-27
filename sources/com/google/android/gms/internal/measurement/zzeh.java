package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzeh extends zzq implements zzef {
    zzeh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final void mo3151a(String str, String str2, Bundle bundle, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11952a(a, (Parcelable) bundle);
        a.writeLong(j);
        m11948b(1, a);
    }
}
