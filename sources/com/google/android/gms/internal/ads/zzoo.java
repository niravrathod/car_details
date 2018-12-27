package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzoo extends zzem implements zzom {
    zzoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: a */
    public final String mo2575a() {
        Parcel a = m10545a(1, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo2577b() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo2576a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(3, t_);
    }

    /* renamed from: c */
    public final void mo2578c() {
        m10546b(4, t_());
    }

    /* renamed from: d */
    public final void mo2579d() {
        m10546b(5, t_());
    }
}
