package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzze extends zzem implements zzzc {
    zzze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: a */
    public final String mo2823a() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List mo2826b() {
        Parcel a = m10545a(3, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }

    /* renamed from: c */
    public final String mo2828c() {
        Parcel a = m10545a(4, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final zzqk mo2830d() {
        Parcel a = m10545a(5, t_());
        zzqk a2 = zzql.m21851a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo2831e() {
        Parcel a = m10545a(6, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo2832f() {
        Parcel a = m10545a(7, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: g */
    public final void mo2833g() {
        m10546b(8, t_());
    }

    /* renamed from: a */
    public final void mo2824a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(9, t_);
    }

    /* renamed from: b */
    public final void mo2827b(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(10, t_);
    }

    /* renamed from: h */
    public final boolean mo2834h() {
        Parcel a = m10545a(11, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo2835i() {
        Parcel a = m10545a(12, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final Bundle mo2836j() {
        Parcel a = m10545a(13, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final void mo2829c(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(14, t_);
    }

    /* renamed from: k */
    public final IObjectWrapper mo2837k() {
        Parcel a = m10545a(15, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final zzly mo2838l() {
        Parcel a = m10545a(16, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final zzqg mo2839m() {
        Parcel a = m10545a(19, t_());
        zzqg a2 = zzqh.m21848a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: n */
    public final IObjectWrapper mo2840n() {
        Parcel a = m10545a(20, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: o */
    public final IObjectWrapper mo2841o() {
        Parcel a = m10545a(21, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2825a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper2);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper3);
        m10546b(22, t_);
    }
}
