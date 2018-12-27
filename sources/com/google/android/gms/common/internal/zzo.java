package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzo extends zza implements zzm {
    zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zza(zzk zzk, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzc.m11325a(zza, (Parcelable) zzk);
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zzk = zza(5, zza);
        iObjectWrapper = zzc.m11327a(zzk);
        zzk.recycle();
        return iObjectWrapper;
    }
}
