package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzko extends zzem implements zzkm {
    zzko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void zzd(zzjk zzjk) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzjk);
        m10546b(1, t_);
    }

    public final String getMediationAdapterClassName() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoading() {
        Parcel a = m10545a(3, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    public final String zzcj() {
        Parcel a = m10545a(4, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zza(zzjk zzjk, int i) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeInt(i);
        m10546b(5, t_);
    }
}
