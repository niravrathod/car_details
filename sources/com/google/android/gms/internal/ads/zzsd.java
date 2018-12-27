package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzsd extends zzen implements zzsc {
    public zzsd() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2690a(parcel.readString());
                break;
            case 2:
                mo2689a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
