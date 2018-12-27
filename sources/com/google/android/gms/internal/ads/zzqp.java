package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzqp extends zzen implements zzqo {
    public zzqp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public static zzqo m21855a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof zzqo) {
            return (zzqo) queryLocalInterface;
        }
        return new zzqq(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2622a((String) parcel.readString(), (IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 2:
                IInterface a = mo2618a((String) parcel.readString());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a);
                break;
            case 3:
                mo2620a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo2619a();
                parcel2.writeNoException();
                break;
            case 5:
                mo2621a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()), (int) parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                mo2623b(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
