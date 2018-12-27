package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzaij extends zzen implements zzaii {
    public zzaij() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static zzaii m21158a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzaii) {
            return (zzaii) queryLocalInterface;
        }
        return new zzaik(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2266a();
                break;
            case 2:
                mo2269b();
                break;
            case 3:
                mo2270c();
                break;
            case 4:
                mo2271d();
                break;
            case 5:
                i = parcel.readStrongBinder();
                if (i == 0) {
                    i = 0;
                } else {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    if ((parcel instanceof zzahy) != 0) {
                        i = (zzahy) parcel;
                    } else {
                        i = new zzaia(i);
                    }
                }
                mo2268a((zzahy) i);
                break;
            case 6:
                mo2272e();
                break;
            case 7:
                mo2267a(parcel.readInt());
                break;
            case 8:
                mo2273f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
