package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzsg extends zzen implements zzsf {
    public zzsg() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface j;
        boolean b;
        switch (i) {
            case 2:
                i = mo2697e();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                i = mo2698f();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 4:
                i = mo2701i();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 5:
                j = mo2702j();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, j);
                break;
            case 6:
                i = mo2703k();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 7:
                i = mo2704l();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 8:
                i = mo2705m();
                parcel2.writeNoException();
                parcel2.writeDouble(i);
                break;
            case 9:
                i = mo2706n();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 10:
                i = mo2707o();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 11:
                j = mo2708p();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, j);
                break;
            case 12:
                i = mo2711s();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 13:
                mo2714v();
                parcel2.writeNoException();
                break;
            case 14:
                j = mo2713u();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, j);
                break;
            case 15:
                mo2691a((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 16:
                b = mo2695b((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, b);
                break;
            case 17:
                mo2696c((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 18:
                j = mo2709q();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, j);
                break;
            case 19:
                j = mo2710r();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, j);
                break;
            case 20:
                i = mo2712t();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 21:
                i = parcel.readStrongBinder();
                if (i == 0) {
                    i = 0;
                } else {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if ((parcel instanceof zzsc) != 0) {
                        i = (zzsc) parcel;
                    } else {
                        i = new zzse(i);
                    }
                }
                mo2694a((zzsc) i);
                parcel2.writeNoException();
                break;
            case 22:
                mo2717y();
                parcel2.writeNoException();
                break;
            case 23:
                i = mo2699g();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            case 24:
                b = mo2700h();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, b);
                break;
            case 25:
                mo2693a((zzlu) zzlv.m21763a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 26:
                mo2692a((zzlq) zzlr.m21761a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 27:
                mo2715w();
                parcel2.writeNoException();
                break;
            case 28:
                mo2716x();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
