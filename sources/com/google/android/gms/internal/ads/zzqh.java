package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzqh extends zzen implements zzqg {
    public zzqh() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public static zzqg m21848a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzqg) {
            return (zzqg) queryLocalInterface;
        }
        return new zzqi(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                i = mo2611a();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 3:
                i = mo2612b();
                parcel2.writeNoException();
                parcel2.writeList(i);
                break;
            default:
                return false;
        }
        return true;
    }
}
