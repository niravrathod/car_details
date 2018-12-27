package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzkk extends zzen implements zzkj {
    public zzkk() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2462a();
                break;
            case 2:
                mo2463a(parcel.readInt());
                break;
            case 3:
                mo2464b();
                break;
            case 4:
                mo2465c();
                break;
            case 5:
                mo2466d();
                break;
            case 6:
                mo2467e();
                break;
            case 7:
                mo2468f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
