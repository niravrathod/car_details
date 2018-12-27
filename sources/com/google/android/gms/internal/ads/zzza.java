package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzza extends zzen implements zzyz {
    public zzza() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface d;
        boolean j;
        switch (i) {
            case 2:
                i = mo2802a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                i = mo2805b();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 4:
                i = mo2807c();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 5:
                d = mo2809d();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 6:
                i = mo2810e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 7:
                i = mo2811f();
                parcel2.writeNoException();
                parcel2.writeDouble(i);
                break;
            case 8:
                i = mo2812g();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 9:
                i = mo2813h();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 10:
                mo2814i();
                parcel2.writeNoException();
                break;
            case 11:
                mo2803a(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                mo2806b(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                j = mo2815j();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, j);
                break;
            case 14:
                j = mo2816k();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, j);
                break;
            case 15:
                i = mo2817l();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 16:
                mo2808c(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 17:
                d = mo2818m();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 18:
                d = mo2819n();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 19:
                d = mo2820o();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 20:
                d = mo2821p();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 21:
                d = mo2822q();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 22:
                mo2804a(Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
