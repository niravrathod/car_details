package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzzb extends zzem implements zzyz {
    zzzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: a */
    public final String mo2802a() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo2805b() {
        Parcel a = m10545a(3, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo2807c() {
        Parcel a = m10545a(4, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final zzqk mo2809d() {
        Parcel a = m10545a(5, t_());
        zzqk a2 = zzql.m21851a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo2810e() {
        Parcel a = m10545a(6, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final double mo2811f() {
        Parcel a = m10545a(7, t_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: g */
    public final String mo2812g() {
        Parcel a = m10545a(8, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final String mo2813h() {
        Parcel a = m10545a(9, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final void mo2814i() {
        m10546b(10, t_());
    }

    /* renamed from: a */
    public final void mo2803a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(11, t_);
    }

    /* renamed from: b */
    public final void mo2806b(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(12, t_);
    }

    /* renamed from: j */
    public final boolean mo2815j() {
        Parcel a = m10545a(13, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final boolean mo2816k() {
        Parcel a = m10545a(14, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final Bundle mo2817l() {
        Parcel a = m10545a(15, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo2808c(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(16, t_);
    }

    /* renamed from: m */
    public final zzly mo2818m() {
        Parcel a = m10545a(17, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2819n() {
        Parcel a = m10545a(18, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final zzqg mo2820o() {
        Parcel a = m10545a(19, t_());
        zzqg a2 = zzqh.m21848a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final IObjectWrapper mo2821p() {
        Parcel a = m10545a(20, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final IObjectWrapper mo2822q() {
        Parcel a = m10545a(21, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2804a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper3);
        m10546b(22, t_);
    }
}
