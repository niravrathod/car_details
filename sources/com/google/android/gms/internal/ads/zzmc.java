package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class zzmc extends zzen implements zzmb {
    public zzmc() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo2564a();
                break;
            case 2:
                mo2566b();
                break;
            case 3:
                mo2567c();
                break;
            case 4:
                mo2568d();
                break;
            case 5:
                mo2565a(zzeo.m10552a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
