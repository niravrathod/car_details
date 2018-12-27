package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzaao extends zzen implements zzaan {
    public zzaao() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public static zzaan m21047a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzaan) {
            return (zzaan) queryLocalInterface;
        }
        return new zzaap(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzaaq zzaaq = null;
        String readString;
        Bundle bundle;
        IInterface queryLocalInterface;
        Parcelable a;
        String readString2;
        IObjectWrapper a2;
        IBinder readStrongBinder;
        zzaaq zzaaq2;
        switch (i) {
            case 1:
                IObjectWrapper a3 = Stub.m20401a(parcel.readStrongBinder());
                readString = parcel.readString();
                bundle = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                Bundle bundle2 = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                zzjo zzjo = (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    if (queryLocalInterface instanceof zzaaq) {
                        zzaaq = (zzaaq) queryLocalInterface;
                    } else {
                        zzaaq = new zzaar(readStrongBinder2);
                    }
                }
                mo2193a(a3, readString, bundle, bundle2, zzjo, zzaaq);
                parcel2.writeNoException();
                break;
            case 2:
                a = mo2191a();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, a);
                break;
            case 3:
                a = mo2199b();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, a);
                break;
            case 4:
                readString2 = parcel.readString();
                readString = parcel.readString();
                bundle = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                a2 = Stub.m20401a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    if (queryLocalInterface instanceof zzaaf) {
                        zzaaf zzaaf = (zzaaf) queryLocalInterface;
                    } else {
                        zzaaq = new zzaag(readStrongBinder);
                    }
                }
                zzaaq2 = zzaaq;
                mo2194a(readString2, readString, bundle, a2, zzaaq2, zzyu.m22047a(parcel.readStrongBinder()), (zzjo) zzeo.m10548a(parcel, zzjo.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                IInterface c = mo2200c();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, c);
                break;
            case 6:
                readString2 = parcel.readString();
                readString = parcel.readString();
                bundle = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                a2 = Stub.m20401a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (queryLocalInterface instanceof zzaah) {
                        zzaah zzaah = (zzaah) queryLocalInterface;
                    } else {
                        zzaaq = new zzaai(readStrongBinder);
                    }
                }
                zzaaq2 = zzaaq;
                mo2195a(readString2, readString, bundle, a2, (zzaah) zzaaq2, zzyu.m22047a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                mo2201d();
                parcel2.writeNoException();
                break;
            case 8:
                readString2 = parcel.readString();
                readString = parcel.readString();
                bundle = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                a2 = Stub.m20401a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    if (queryLocalInterface instanceof zzaal) {
                        zzaal zzaal = (zzaal) queryLocalInterface;
                    } else {
                        zzaaq = new zzaam(readStrongBinder);
                    }
                }
                zzaaq2 = zzaaq;
                mo2197a(readString2, readString, bundle, a2, (zzaal) zzaaq2, zzyu.m22047a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 9:
                mo2202e();
                parcel2.writeNoException();
                break;
            case 10:
                mo2192a(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                mo2198a(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 12:
                readString2 = parcel.readString();
                readString = parcel.readString();
                bundle = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                a2 = Stub.m20401a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    if (queryLocalInterface instanceof zzaaj) {
                        zzaaj zzaaj = (zzaaj) queryLocalInterface;
                    } else {
                        zzaaq = new zzaak(readStrongBinder);
                    }
                }
                zzaaq2 = zzaaq;
                mo2196a(readString2, readString, bundle, a2, (zzaaj) zzaaq2, zzyu.m22047a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
