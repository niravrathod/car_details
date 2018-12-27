package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzlr extends zzen implements zzlq {
    public zzlr() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    /* renamed from: a */
    public static zzlq m21761a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        if (queryLocalInterface instanceof zzlq) {
            return (zzlq) queryLocalInterface;
        }
        return new zzls(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo2549a();
        parcel2.writeNoException();
        return true;
    }
}
