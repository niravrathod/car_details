package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements IGmsCallbacks {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        zzc.m11325a(zza, (Parcelable) bundle);
        zzb(1, zza);
    }

    public final void zza(int i, Bundle bundle) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc.m11325a(zza, (Parcelable) bundle);
        zzb(2, zza);
    }

    public final void zza(int i, IBinder iBinder, zzb zzb) {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        zzc.m11325a(zza, (Parcelable) zzb);
        zzb(3, zza);
    }
}
