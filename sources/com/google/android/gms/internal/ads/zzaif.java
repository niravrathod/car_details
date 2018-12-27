package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaif extends zzem implements zzaid {
    zzaif(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public final void mo2250a(zzaio zzaio) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzaio);
        m10546b(1, t_);
    }

    /* renamed from: a */
    public final void mo2246a() {
        m10546b(2, t_());
    }

    /* renamed from: a */
    public final void mo2249a(zzaii zzaii) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzaii);
        m10546b(3, t_);
    }

    /* renamed from: c */
    public final boolean mo2259c() {
        Parcel a = m10545a(5, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final void mo2260d() {
        m10546b(6, t_());
    }

    /* renamed from: e */
    public final void mo2262e() {
        m10546b(7, t_());
    }

    /* renamed from: f */
    public final void mo2263f() {
        m10546b(8, t_());
    }

    /* renamed from: b */
    public final void mo2255b(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(9, t_);
    }

    /* renamed from: c */
    public final void mo2257c(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(10, t_);
    }

    /* renamed from: d */
    public final void mo2261d(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(11, t_);
    }

    /* renamed from: g */
    public final String mo2264g() {
        Parcel a = m10545a(12, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo2256b(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(13, t_);
    }

    /* renamed from: a */
    public final void mo2251a(zzkz zzkz) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzkz);
        m10546b(14, t_);
    }

    /* renamed from: b */
    public final Bundle mo2254b() {
        Parcel a = m10545a(15, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo2248a(zzaib zzaib) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzaib);
        m10546b(16, t_);
    }

    /* renamed from: a */
    public final void mo2252a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(17, t_);
    }

    /* renamed from: a */
    public final void mo2247a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(18, t_);
    }

    /* renamed from: c */
    public final void mo2258c(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(19, t_);
    }

    /* renamed from: a */
    public final void mo2253a(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }
}
