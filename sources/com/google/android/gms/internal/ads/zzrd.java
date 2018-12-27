package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzrd extends zzen implements zzrc {
    public zzrd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface n;
        switch (i) {
            case 2:
                n = mo2659n();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 3:
                i = mo2650e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 4:
                i = mo2651f();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 5:
                i = mo2654i();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 6:
                n = mo2655j();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 7:
                i = mo2656k();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 8:
                i = mo2657l();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 9:
                i = mo2660o();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 10:
                mo2662q();
                parcel2.writeNoException();
                break;
            case 11:
                n = mo2658m();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 12:
                mo2647a((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                boolean b = mo2648b((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, b);
                break;
            case 14:
                mo2649c((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                n = mo2661p();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 16:
                n = mo2652g();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 17:
                i = mo2653h();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            default:
                return false;
        }
        return true;
    }
}
