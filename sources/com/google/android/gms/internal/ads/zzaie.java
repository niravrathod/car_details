package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzaie extends zzen implements zzaid {
    public zzaie() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public static zzaid m21137a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        if (queryLocalInterface instanceof zzaid) {
            return (zzaid) queryLocalInterface;
        }
        return new zzaif(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 34) {
            i2 = 0;
            switch (i) {
                case 1:
                    mo2250a((zzaio) zzeo.m10548a(parcel, zzaio.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 2:
                    mo2246a();
                    parcel2.writeNoException();
                    break;
                case 3:
                    i = parcel.readStrongBinder();
                    if (i != 0) {
                        parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if ((parcel instanceof zzaii) != 0) {
                            i2 = (zzaii) parcel;
                        } else {
                            i2 = new zzaik(i);
                        }
                    }
                    mo2249a((zzaii) i2);
                    parcel2.writeNoException();
                    break;
                default:
                    switch (i) {
                        case 5:
                            boolean c = mo2259c();
                            parcel2.writeNoException();
                            zzeo.m10551a(parcel2, c);
                            break;
                        case 6:
                            mo2260d();
                            parcel2.writeNoException();
                            break;
                        case 7:
                            mo2262e();
                            parcel2.writeNoException();
                            break;
                        case 8:
                            mo2263f();
                            parcel2.writeNoException();
                            break;
                        case 9:
                            mo2255b((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            break;
                        case 10:
                            mo2257c((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            break;
                        case 11:
                            mo2261d(Stub.m20401a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            break;
                        case 12:
                            i = mo2264g();
                            parcel2.writeNoException();
                            parcel2.writeString(i);
                            break;
                        case 13:
                            mo2256b((String) parcel.readString());
                            parcel2.writeNoException();
                            break;
                        case 14:
                            mo2251a((zzkz) zzla.m21755a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            break;
                        case 15:
                            i = mo2254b();
                            parcel2.writeNoException();
                            zzeo.m10554b(parcel2, i);
                            break;
                        case 16:
                            i = parcel.readStrongBinder();
                            if (i != 0) {
                                parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                if ((parcel instanceof zzaib) != 0) {
                                    i2 = (zzaib) parcel;
                                } else {
                                    i2 = new zzaic(i);
                                }
                            }
                            mo2248a((zzaib) i2);
                            parcel2.writeNoException();
                            break;
                        case 17:
                            mo2252a((String) parcel.readString());
                            parcel2.writeNoException();
                            break;
                        case 18:
                            mo2247a((IObjectWrapper) Stub.m20401a(parcel.readStrongBinder()));
                            parcel2.writeNoException();
                            break;
                        case 19:
                            mo2258c((String) parcel.readString());
                            parcel2.writeNoException();
                            break;
                        default:
                            return false;
                    }
            }
        }
        mo2253a((boolean) zzeo.m10552a(parcel));
        parcel2.writeNoException();
        return true;
    }
}
