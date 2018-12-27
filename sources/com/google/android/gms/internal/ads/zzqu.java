package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzqu extends zzen implements zzqt {
    public zzqu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: a */
    public static zzqt m21863a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof zzqt) {
            return (zzqt) queryLocalInterface;
        }
        return new zzqv(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2626a(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 2:
                mo2625a();
                break;
            case 3:
                mo2627b(Stub.m20401a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
