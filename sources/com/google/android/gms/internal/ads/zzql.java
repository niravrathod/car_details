package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzql extends zzen implements zzqk {
    public zzql() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static zzqk m21851a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zzqk) {
            return (zzqk) queryLocalInterface;
        }
        return new zzqm(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                IInterface a = mo2615a();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a);
                break;
            case 2:
                i = mo2616b();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 3:
                i = mo2617c();
                parcel2.writeNoException();
                parcel2.writeDouble(i);
                break;
            default:
                return false;
        }
        return true;
    }
}
