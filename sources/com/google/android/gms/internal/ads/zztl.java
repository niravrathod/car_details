package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zztl extends zzen implements zztk {
    public zztl() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                IInterface e = mo4268e();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, e);
                break;
            case 4:
                mo4269f();
                parcel2.writeNoException();
                break;
            case 5:
                i = Stub.m20401a(parcel.readStrongBinder());
                parcel = parcel.readStrongBinder();
                if (parcel == null) {
                    parcel = null;
                } else {
                    i2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (i2 instanceof zztm) {
                        parcel = (zztm) i2;
                    } else {
                        parcel = new zztn(parcel);
                    }
                }
                mo4263a(i, parcel);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
