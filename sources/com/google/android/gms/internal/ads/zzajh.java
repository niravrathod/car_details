package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzajh extends zzen implements zzajg {
    public zzajh() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static zzajg m21172a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzajg) {
            return (zzajg) queryLocalInterface;
        }
        return new zzaji(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2296a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 2:
                mo2297a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()), (int) parcel.readInt());
                break;
            case 3:
                mo2299b(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 4:
                mo2301c(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 5:
                mo2302d(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 6:
                mo2303e(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 7:
                mo2298a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()), (zzajk) zzeo.m10548a(parcel, zzajk.CREATOR));
                break;
            case 8:
                mo2304f(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 9:
                mo2300b(Stub.m20401a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo2305g(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 11:
                mo2306h(Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 12:
                mo2295a((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
