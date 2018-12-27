package com.google.android.gms.internal.config;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzag extends zzb implements zzaf {
    public zzag() {
        super("com.google.android.gms.config.internal.IConfigCallbacks");
    }

    /* renamed from: a */
    protected final boolean mo2908a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo4332a((Status) zzc.m11424a(parcel, Status.CREATOR), parcel.createByteArray());
                break;
            case 2:
                mo4331a((Status) zzc.m11424a(parcel, Status.CREATOR), zzc.m11425a(parcel));
                break;
            case 3:
                mo4329a((Status) zzc.m11424a(parcel, Status.CREATOR));
                break;
            case 4:
                mo4330a((Status) zzc.m11424a(parcel, Status.CREATOR), (zzad) zzc.m11424a(parcel, zzad.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
