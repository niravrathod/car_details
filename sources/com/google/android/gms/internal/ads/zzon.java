package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzon extends zzen implements zzom {
    public zzon() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                i = mo2575a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 2:
                i = mo2577b();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                mo2576a(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo2578c();
                parcel2.writeNoException();
                break;
            case 5:
                mo2579d();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
