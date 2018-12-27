package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzzh extends zzem implements zzzf {
    zzzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: a */
    public final String mo2842a() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo2845b() {
        Parcel a = m10545a(3, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo2847c() {
        Parcel a = m10545a(4, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final zzqk mo2848d() {
        Parcel a = m10545a(5, t_());
        zzqk a2 = zzql.m21851a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo2849e() {
        Parcel a = m10545a(6, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo2850f() {
        Parcel a = m10545a(7, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final double mo2851g() {
        Parcel a = m10545a(8, t_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: h */
    public final String mo2852h() {
        Parcel a = m10545a(9, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final String mo2853i() {
        Parcel a = m10545a(10, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final zzly mo2854j() {
        Parcel a = m10545a(11, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final zzqg mo2855k() {
        Parcel a = m10545a(12, t_());
        zzqg a2 = zzqh.m21848a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final IObjectWrapper mo2856l() {
        Parcel a = m10545a(13, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final IObjectWrapper mo2857m() {
        Parcel a = m10545a(14, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2858n() {
        Parcel a = m10545a(15, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final Bundle mo2859o() {
        Parcel a = m10545a(16, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: p */
    public final boolean mo2860p() {
        Parcel a = m10545a(17, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final boolean mo2861q() {
        Parcel a = m10545a(18, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final void mo2862r() {
        m10546b(19, t_());
    }

    /* renamed from: a */
    public final void mo2843a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(20, t_);
    }

    /* renamed from: a */
    public final void mo2844a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper3);
        m10546b(21, t_);
    }

    /* renamed from: b */
    public final void mo2846b(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(22, t_);
    }
}
