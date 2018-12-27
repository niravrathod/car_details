package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzabx extends zzen implements zzabw {
    public zzabx() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzabw zzx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof zzabw) {
            return (zzabw) queryLocalInterface;
        }
        return new zzaby(iBinder);
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                onCreate((Bundle) zzeo.m10548a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                onRestart();
                parcel2.writeNoException();
                break;
            case 3:
                onStart();
                parcel2.writeNoException();
                break;
            case 4:
                onResume();
                parcel2.writeNoException();
                break;
            case 5:
                onPause();
                parcel2.writeNoException();
                break;
            case 6:
                Bundle bundle = (Bundle) zzeo.m10548a(parcel, Bundle.CREATOR);
                onSaveInstanceState(bundle);
                parcel2.writeNoException();
                zzeo.m10554b(parcel2, bundle);
                break;
            case 7:
                onStop();
                parcel2.writeNoException();
                break;
            case 8:
                onDestroy();
                parcel2.writeNoException();
                break;
            case 9:
                zzax();
                parcel2.writeNoException();
                break;
            case 10:
                onBackPressed();
                parcel2.writeNoException();
                break;
            case 11:
                boolean zzou = zzou();
                parcel2.writeNoException();
                zzeo.m10551a(parcel2, zzou);
                break;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) zzeo.m10548a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                zzq(Stub.m20401a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
