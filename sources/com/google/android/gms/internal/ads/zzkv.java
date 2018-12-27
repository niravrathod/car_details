package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzkv extends zzen implements zzku {
    public zzkv() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzku zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzku) {
            return (zzku) queryLocalInterface;
        }
        return new zzkw(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        i2 = 0;
        IInterface zzbj;
        boolean isReady;
        switch (i) {
            case 1:
                zzbj = zzbj();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, zzbj);
                break;
            case 2:
                destroy();
                parcel2.writeNoException();
                break;
            case 3:
                isReady = isReady();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, isReady);
                break;
            case 4:
                isReady = zzb((zzjk) zzeo.m10548a(parcel, zzjk.CREATOR));
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, isReady);
                break;
            case 5:
                pause();
                parcel2.writeNoException();
                break;
            case 6:
                resume();
                parcel2.writeNoException();
                break;
            case 7:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if ((parcel instanceof zzkj) != 0) {
                        i2 = (zzkj) parcel;
                    } else {
                        i2 = new zzkl(i);
                    }
                }
                zza((zzkj) i2);
                parcel2.writeNoException();
                break;
            case 8:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if ((parcel instanceof zzlc) != 0) {
                        i2 = (zzlc) parcel;
                    } else {
                        i2 = new zzle(i);
                    }
                }
                zza((zzlc) i2);
                parcel2.writeNoException();
                break;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                break;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                break;
            case 11:
                zzbm();
                parcel2.writeNoException();
                break;
            case 12:
                i = zzbk();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 13:
                zza((zzjo) zzeo.m10548a(parcel, zzjo.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                zza((zzacd) zzace.m21078a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                zza(zzack.m21080a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 18:
                i = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 19:
                zza((zzop) zzoq.m21791a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 20:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if ((parcel instanceof zzkg) != 0) {
                        i2 = (zzkg) parcel;
                    } else {
                        i2 = new zzki(i);
                    }
                }
                zza((zzkg) i2);
                parcel2.writeNoException();
                break;
            case 21:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if ((parcel instanceof zzli) != 0) {
                        i2 = (zzli) parcel;
                    } else {
                        i2 = new zzlk(i);
                    }
                }
                zza((zzli) i2);
                parcel2.writeNoException();
                break;
            case 22:
                setManualImpressionsEnabled(zzeo.m10552a(parcel));
                parcel2.writeNoException();
                break;
            case 23:
                isReady = isLoading();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, isReady);
                break;
            case 24:
                zza((zzaii) zzaij.m21158a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                break;
            case 26:
                zzbj = getVideoController();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, zzbj);
                break;
            case 29:
                zza((zznf) zzeo.m10548a(parcel, zznf.CREATOR));
                parcel2.writeNoException();
                break;
            case 30:
                zza((zzme) zzeo.m10548a(parcel, zzme.CREATOR));
                parcel2.writeNoException();
                break;
            case 31:
                i = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 32:
                zzbj = zzbw();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, zzbj);
                break;
            case 33:
                zzbj = zzbx();
                parcel2.writeNoException();
                zzeo.m10549a(parcel2, zzbj);
                break;
            case 34:
                setImmersiveMode(zzeo.m10552a(parcel));
                parcel2.writeNoException();
                break;
            case 35:
                i = zzcj();
                parcel2.writeNoException();
                parcel2.writeString(i);
                break;
            case 36:
                i = parcel.readStrongBinder();
                if (i != 0) {
                    parcel = i.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if ((parcel instanceof zzkz) != 0) {
                        i2 = (zzkz) parcel;
                    } else {
                        i2 = new zzlb(i);
                    }
                }
                zza((zzkz) i2);
                parcel2.writeNoException();
                break;
            case 37:
                i = getAdMetadata();
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, i);
                break;
            case 38:
                zzr(parcel.readString());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
