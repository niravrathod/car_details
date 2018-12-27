package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzrh extends zzen implements zzrg {
    public zzrh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public static zzrg m21902a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzrg) {
            return (zzrg) queryLocalInterface;
        }
        return new zzri(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface b;
        switch (i) {
            case 1:
                i = mo2663a((String) parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 2:
                b = mo2665b(parcel.readString());
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, b);
                break;
            case 3:
                i = mo2668e();
                parcel2.writeNoException();
                parcel2.writeStringList(i);
                break;
            case 4:
                i = mo2666b();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 5:
                mo2667c(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo2671h();
                parcel2.writeNoException();
                break;
            case 7:
                b = mo2670g();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, b);
                break;
            case 8:
                mo2673j();
                parcel2.writeNoException();
                break;
            case 9:
                b = mo2672i();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, b);
                break;
            case 10:
                boolean a = mo2664a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, a);
                break;
            case 11:
                b = mo2669f();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, b);
                break;
            default:
                return false;
        }
        return true;
    }
}
