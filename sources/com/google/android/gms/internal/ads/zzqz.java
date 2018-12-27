package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzqz extends zzen implements zzqy {
    public zzqz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface n;
        switch (i) {
            case 2:
                n = mo2641n();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 3:
                i = mo2632e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 4:
                i = mo2633f();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 5:
                i = mo2634g();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 6:
                n = mo2635h();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 7:
                i = mo2636i();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 8:
                i = mo2637j();
                parcel2.writeNoException();
                parcel2.writeDouble(i);
                break;
            case 9:
                i = mo2638k();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 10:
                i = mo2639l();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 11:
                i = mo2642o();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 12:
                mo2646s();
                parcel2.writeNoException();
                break;
            case 13:
                n = mo2640m();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 14:
                mo2629a((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                boolean b = mo2630b((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, b);
                break;
            case 16:
                mo2631c((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                n = mo2645r();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 18:
                n = mo2643p();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, n);
                break;
            case 19:
                i = mo2644q();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            default:
                return false;
        }
        return true;
    }
}
