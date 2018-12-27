package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements zzk {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final IObjectWrapper mo1930a(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.m11324a(zza, (IInterface) iObjectWrapper2);
        iObjectWrapper = zza(2, zza);
        str = Stub.m20401a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return str;
    }

    /* renamed from: b */
    public final IObjectWrapper mo1931b(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.m11324a(zza, (IInterface) iObjectWrapper2);
        iObjectWrapper = zza(3, zza);
        str = Stub.m20401a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return str;
    }
}
