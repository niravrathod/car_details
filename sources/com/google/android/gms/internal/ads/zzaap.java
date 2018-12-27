package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaap extends zzem implements zzaan {
    zzaap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public final void mo2193a(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzjo zzjo, zzaaq zzaaq) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str);
        zzeo.m10550a(t_, (Parcelable) bundle);
        zzeo.m10550a(t_, (Parcelable) bundle2);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        zzeo.m10549a(t_, (IInterface) zzaaq);
        m10546b(1, t_);
    }

    /* renamed from: a */
    public final zzaaz mo2191a() {
        Parcel a = m10545a(2, t_());
        zzaaz zzaaz = (zzaaz) zzeo.m10548a(a, zzaaz.CREATOR);
        a.recycle();
        return zzaaz;
    }

    /* renamed from: b */
    public final zzaaz mo2199b() {
        Parcel a = m10545a(3, t_());
        zzaaz zzaaz = (zzaaz) zzeo.m10548a(a, zzaaz.CREATOR);
        a.recycle();
        return zzaaz;
    }

    /* renamed from: a */
    public final void mo2194a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaaf zzaaf, zzyt zzyt, zzjo zzjo) {
        Parcel t_ = t_();
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10550a(t_, (Parcelable) bundle);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzaaf);
        zzeo.m10549a(t_, (IInterface) zzyt);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        m10546b(4, t_);
    }

    /* renamed from: c */
    public final zzly mo2200c() {
        Parcel a = m10545a(5, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2195a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaah zzaah, zzyt zzyt) {
        Parcel t_ = t_();
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10550a(t_, (Parcelable) bundle);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzaah);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(6, t_);
    }

    /* renamed from: d */
    public final void mo2201d() {
        m10546b(7, t_());
    }

    /* renamed from: a */
    public final void mo2197a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaal zzaal, zzyt zzyt) {
        Parcel t_ = t_();
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10550a(t_, (Parcelable) bundle);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzaal);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(8, t_);
    }

    /* renamed from: e */
    public final void mo2202e() {
        m10546b(9, t_());
    }

    /* renamed from: a */
    public final void mo2192a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(10, t_);
    }

    /* renamed from: a */
    public final void mo2198a(String[] strArr, Bundle[] bundleArr) {
        Parcel t_ = t_();
        t_.writeStringArray(strArr);
        t_.writeTypedArray(bundleArr, null);
        m10546b(11, t_);
    }

    /* renamed from: a */
    public final void mo2196a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaaj zzaaj, zzyt zzyt) {
        Parcel t_ = t_();
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10550a(t_, (Parcelable) bundle);
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzaaj);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(12, t_);
    }
}
