package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzj extends zza implements zzi {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final IObjectWrapper mo1927a(IObjectWrapper iObjectWrapper, String str, int i) {
        Parcel zza = zza();
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        iObjectWrapper = zza(2, zza);
        str = Stub.m20401a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return str;
    }

    /* renamed from: a */
    public final int mo1926a(IObjectWrapper iObjectWrapper, String str, boolean z) {
        Parcel zza = zza();
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zza.writeString(str);
        zzc.m11326a(zza, z);
        iObjectWrapper = zza(3, zza);
        str = iObjectWrapper.readInt();
        iObjectWrapper.recycle();
        return str;
    }

    /* renamed from: b */
    public final IObjectWrapper mo1929b(IObjectWrapper iObjectWrapper, String str, int i) {
        Parcel zza = zza();
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        iObjectWrapper = zza(4, zza);
        str = Stub.m20401a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return str;
    }

    /* renamed from: b */
    public final int mo1928b(IObjectWrapper iObjectWrapper, String str, boolean z) {
        Parcel zza = zza();
        zzc.m11324a(zza, (IInterface) iObjectWrapper);
        zza.writeString(str);
        zzc.m11326a(zza, z);
        iObjectWrapper = zza(5, zza);
        str = iObjectWrapper.readInt();
        iObjectWrapper.recycle();
        return str;
    }

    /* renamed from: a */
    public final int mo1925a() {
        Parcel zza = zza(6, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
