package com.google.android.gms.internal.config;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzai extends zza implements zzah {
    zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.config.internal.IConfigService");
    }

    /* renamed from: a */
    public final void mo2909a(zzaf zzaf, zzab zzab) {
        Parcel a = m11334a();
        zzc.m11426a(a, (IInterface) zzaf);
        zzc.m11427a(a, (Parcelable) zzab);
        m11335a(8, a);
    }
}
