package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzahz extends zzen implements zzahy {
    public zzahz() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                i = mo2243a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 2:
                i = mo2244b();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            default:
                return false;
        }
        return true;
    }
}
