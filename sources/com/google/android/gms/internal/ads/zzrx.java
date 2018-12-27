package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzrx extends zzen implements zzrw {
    public zzrx() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: a */
    public static zzrw m21924a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof zzrw) {
            return (zzrw) queryLocalInterface;
        }
        return new zzry(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo2687a(zzkv.zzb(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
