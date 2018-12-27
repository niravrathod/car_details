package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo2905a() {
        Parcel a = m11306a(1, u_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo2906a(boolean z) {
        Parcel u_ = u_();
        zzc.m11307a(u_, true);
        u_ = m11306a(2, u_);
        boolean a = zzc.m11308a(u_);
        u_.recycle();
        return a;
    }

    /* renamed from: b */
    public final boolean mo2907b() {
        Parcel a = m11306a(6, u_());
        boolean a2 = zzc.m11308a(a);
        a.recycle();
        return a2;
    }
}
