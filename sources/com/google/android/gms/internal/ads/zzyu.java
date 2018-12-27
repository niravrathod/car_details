package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzyu extends zzen implements zzyt {
    public zzyu() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static zzyt m22047a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzyt) {
            return (zzyt) queryLocalInterface;
        }
        return new zzyv(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2786a();
                break;
            case 2:
                mo2793b();
                break;
            case 3:
                mo2787a(parcel.readInt());
                break;
            case 4:
                mo2794c();
                break;
            case 5:
                mo2795d();
                break;
            case 6:
                mo2796e();
                break;
            case 7:
                i = parcel.readStrongBinder();
                if (i == 0) {
                    i = 0;
                } else {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if ((parcel instanceof zzyw) != 0) {
                        i = (zzyw) parcel;
                    } else {
                        i = new zzyy(i);
                    }
                }
                mo2790a((zzyw) i);
                break;
            case 8:
                mo2797f();
                break;
            case 9:
                mo2792a((String) parcel.readString(), (String) parcel.readString());
                break;
            case 10:
                mo2789a((zzrg) zzrh.m21902a(parcel.readStrongBinder()), (String) parcel.readString());
                break;
            case 11:
                mo2798g();
                break;
            case 12:
                mo2791a((String) parcel.readString());
                break;
            case 13:
                mo2799h();
                break;
            case 14:
                mo2788a((zzajk) zzeo.m10548a(parcel, zzajk.CREATOR));
                break;
            case 15:
                mo2800i();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
