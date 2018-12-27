package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzaul extends zzen implements zzauk {
    public zzaul() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo4307a((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                i = mo4311b((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 3:
                mo4309a((String) parcel.readString(), (String) parcel.readString(), (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo4310a((String) parcel.readString(), (String) parcel.readString(), (IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 5:
                i = mo4306a((String) parcel.readString(), (String) parcel.readString(), (boolean) zzeo.m10552a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(i);
                break;
            case 6:
                i = mo4303a((String) parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 7:
                mo4316c((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                mo4314b(parcel.readString(), parcel.readString(), (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                i = mo4305a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 10:
                i = mo4304a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 11:
                i = mo4312b();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 12:
                i = mo4315c();
                parcel2.writeNoException();
                parcel2.writeLong(i);
                break;
            case 13:
                mo4313b((String) parcel.readString());
                parcel2.writeNoException();
                break;
            case 14:
                mo4317c((String) parcel.readString());
                parcel2.writeNoException();
                break;
            case 15:
                mo4308a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()), (String) parcel.readString(), (String) parcel.readString());
                parcel2.writeNoException();
                break;
            case 16:
                i = mo4318d();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 17:
                i = mo4319e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 18:
                i = mo4320f();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            default:
                return false;
        }
        return true;
    }
}
