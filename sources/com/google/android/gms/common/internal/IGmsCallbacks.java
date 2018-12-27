package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IGmsCallbacks extends IInterface {

    public static abstract class zza extends zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.m11323a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    zza(parcel.readInt(), (Bundle) zzc.m11323a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    zza(parcel.readInt(), parcel.readStrongBinder(), (zzb) zzc.m11323a(parcel, zzb.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle);

    void zza(int i, Bundle bundle);

    void zza(int i, IBinder iBinder, zzb zzb);
}
