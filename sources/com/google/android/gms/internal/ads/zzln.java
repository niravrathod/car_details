package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzln extends zzem implements zzll {
    zzln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void zza() {
        m10546b(1, t_());
    }

    public final void setAppVolume(float f) {
        Parcel t_ = t_();
        t_.writeFloat(f);
        m10546b(2.8E-45f, t_);
    }

    public final void zzv(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(3, t_);
    }

    public final void setAppMuted(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str);
        m10546b(5, t_);
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(6, t_);
    }

    public final float zzdo() {
        Parcel a = m10545a(7, t_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean zzdp() {
        Parcel a = m10545a(8, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    public final String zzdq() {
        Parcel a = m10545a(9, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zzw(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(10, t_);
    }

    public final void zza(zzyn zzyn) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzyn);
        m10546b(11, t_);
    }
}
