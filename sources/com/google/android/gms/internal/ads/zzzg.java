package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzzg extends zzen implements zzzf {
    public zzzg() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface d;
        boolean p;
        switch (i) {
            case 2:
                i = mo2842a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                i = mo2845b();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 4:
                i = mo2847c();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 5:
                d = mo2848d();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 6:
                i = mo2849e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 7:
                i = mo2850f();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 8:
                i = mo2851g();
                parcel2.writeNoException();
                parcel2.writeDouble(i);
                break;
            case 9:
                i = mo2852h();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 10:
                i = mo2853i();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 11:
                d = mo2854j();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 12:
                d = mo2855k();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 13:
                d = mo2856l();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 14:
                d = mo2857m();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 15:
                d = mo2858n();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 16:
                i = mo2859o();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 17:
                p = mo2860p();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, p);
                break;
            case 18:
                p = mo2861q();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, p);
                break;
            case 19:
                mo2862r();
                parcel2.writeNoException();
                break;
            case 20:
                mo2843a(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 21:
                mo2844a(Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                mo2846b(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
