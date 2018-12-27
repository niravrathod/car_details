package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzzd extends zzen implements zzzc {
    public zzzd() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface d;
        boolean h;
        switch (i) {
            case 2:
                i = mo2823a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                i = mo2826b();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 4:
                i = mo2828c();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 5:
                d = mo2830d();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 6:
                i = mo2831e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 7:
                i = mo2832f();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 8:
                mo2833g();
                parcel2.writeNoException();
                break;
            case 9:
                mo2824a(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                mo2827b(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                h = mo2834h();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, h);
                break;
            case 12:
                h = mo2835i();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, h);
                break;
            case 13:
                i = mo2836j();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 14:
                mo2829c(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                d = mo2837k();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 16:
                d = mo2838l();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 19:
                d = mo2839m();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 20:
                d = mo2840n();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 21:
                d = mo2841o();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, d);
                break;
            case 22:
                mo2825a(Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
