package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public abstract class zzyr extends zzen implements zzyq {
    public zzyr() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        i2 = 0;
        IObjectWrapper a;
        zzjo zzjo;
        zzjk zzjk;
        String readString;
        zzyt zzyt;
        IInterface a2;
        zzjk zzjk2;
        String readString2;
        boolean g;
        switch (i) {
            case 1:
                a = Stub.m20401a(parcel.readStrongBinder());
                zzjo = (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR);
                zzjk = (zzjk) zzeo.m10548a(parcel, zzjk.CREATOR);
                readString = parcel.readString();
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if ((parcel instanceof zzyt) != 0) {
                        zzyt = (zzyt) parcel;
                    } else {
                        i2 = new zzyv(i);
                    }
                }
                mo2766a(a, zzjo, zzjk, readString, (zzyt) i2);
                parcel2.writeNoException();
                break;
            case 2:
                a2 = mo2759a();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a2);
                break;
            case 3:
                i = Stub.m20401a(parcel.readStrongBinder());
                zzjk zzjk3 = (zzjk) zzeo.m10548a(parcel, zzjk.CREATOR);
                String readString3 = parcel.readString();
                parcel = parcel.readStrongBinder();
                if (parcel != null) {
                    i2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (i2 instanceof zzyt) {
                        i2 = (zzyt) i2;
                    } else {
                        i2 = new zzyv(parcel);
                    }
                }
                mo2763a(i, zzjk3, readString3, i2);
                parcel2.writeNoException();
                break;
            case 4:
                mo2771b();
                parcel2.writeNoException();
                break;
            case 5:
                mo2772c();
                parcel2.writeNoException();
                break;
            case 6:
                a = Stub.m20401a(parcel.readStrongBinder());
                zzjo = (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR);
                zzjk = (zzjk) zzeo.m10548a(parcel, zzjk.CREATOR);
                readString = parcel.readString();
                String readString4 = parcel.readString();
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if ((parcel instanceof zzyt) != 0) {
                        zzyt = (zzyt) parcel;
                    } else {
                        i2 = new zzyv(i);
                    }
                }
                mo2767a(a, zzjo, zzjk, readString, readString4, i2);
                parcel2.writeNoException();
                break;
            case 7:
                a = Stub.m20401a(parcel.readStrongBinder());
                zzjk2 = (zzjk) zzeo.m10548a(parcel, zzjk.CREATOR);
                readString2 = parcel.readString();
                readString = parcel.readString();
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if ((parcel instanceof zzyt) != 0) {
                        zzyt = (zzyt) parcel;
                    } else {
                        i2 = new zzyv(i);
                    }
                }
                mo2764a(a, zzjk2, readString2, readString, (zzyt) i2);
                parcel2.writeNoException();
                break;
            case 8:
                mo2773d();
                parcel2.writeNoException();
                break;
            case 9:
                mo2774e();
                parcel2.writeNoException();
                break;
            case 10:
                mo2762a(Stub.m20401a(parcel.readStrongBinder()), (zzjk) zzeo.m10548a(parcel, zzjk.CREATOR), parcel.readString(), zzajh.m21172a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                mo2768a((zzjk) zzeo.m10548a(parcel, zzjk.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                mo2775f();
                parcel2.writeNoException();
                break;
            case 13:
                g = mo2776g();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, g);
                break;
            case 14:
                a = Stub.m20401a(parcel.readStrongBinder());
                zzjk2 = (zzjk) zzeo.m10548a(parcel, zzjk.CREATOR);
                readString2 = parcel.readString();
                readString = parcel.readString();
                i = parcel.readStrongBinder();
                if (i != 0) {
                    i2 = i.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (i2 instanceof zzyt) {
                        zzyt = (zzyt) i2;
                    } else {
                        i2 = new zzyv(i);
                    }
                }
                mo2765a(a, zzjk2, readString2, readString, i2, (zzpy) zzeo.m10548a(parcel, zzpy.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
                a2 = mo2777h();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a2);
                break;
            case 16:
                a2 = mo2778i();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a2);
                break;
            case 17:
                i = mo2779j();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 18:
                i = mo2780k();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 19:
                i = mo2781l();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 20:
                mo2769a((zzjk) zzeo.m10548a(parcel, zzjk.CREATOR), (String) parcel.readString(), (String) parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                mo2760a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                g = mo2782m();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, g);
                break;
            case 23:
                mo2761a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()), (zzajg) zzajh.m21172a(parcel.readStrongBinder()), (List) parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                a2 = mo2783n();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a2);
                break;
            case 25:
                mo2770a((boolean) zzeo.m10552a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                a2 = mo2784o();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a2);
                break;
            case 27:
                a2 = mo2785p();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, a2);
                break;
            default:
                return false;
        }
        return true;
    }
}
