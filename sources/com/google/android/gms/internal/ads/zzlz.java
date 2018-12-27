package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzlz extends zzen implements zzly {
    public zzlz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public static zzly m21766a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof zzly) {
            return (zzly) queryLocalInterface;
        }
        return new zzma(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean c;
        switch (i) {
            case 1:
                mo2552a();
                parcel2.writeNoException();
                break;
            case 2:
                mo2555b();
                parcel2.writeNoException();
                break;
            case 3:
                mo2554a((boolean) zzeo.m10552a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                c = mo2556c();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, c);
                break;
            case 5:
                i = mo2557d();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 6:
                i = mo2559f();
                parcel2.writeNoException();
                parcel2.writeFloat(i);
                break;
            case 7:
                i = mo2560g();
                parcel2.writeNoException();
                parcel2.writeFloat(i);
                break;
            case 8:
                i = parcel.readStrongBinder();
                if (i == 0) {
                    i = 0;
                } else {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if ((parcel instanceof zzmb) != 0) {
                        i = (zzmb) parcel;
                    } else {
                        i = new zzmd(i);
                    }
                }
                mo2553a((zzmb) i);
                parcel2.writeNoException();
                break;
            case 9:
                i = mo2558e();
                parcel2.writeNoException();
                parcel2.writeFloat(i);
                break;
            case 10:
                c = mo2562i();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, c);
                break;
            case 11:
                IInterface h = mo2561h();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, h);
                break;
            case 12:
                c = mo2563j();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, c);
                break;
            default:
                return false;
        }
        return true;
    }
}
