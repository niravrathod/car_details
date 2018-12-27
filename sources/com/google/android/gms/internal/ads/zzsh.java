package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzsh extends zzem implements zzsf {
    zzsh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: e */
    public final String mo2697e() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo2698f() {
        Parcel a = m10545a(3, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }

    /* renamed from: i */
    public final String mo2701i() {
        Parcel a = m10545a(4, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final zzqk mo2702j() {
        zzqk zzqk;
        Parcel a = m10545a(5, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzqk = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzqk) {
                zzqk = (zzqk) queryLocalInterface;
            } else {
                zzqk = new zzqm(readStrongBinder);
            }
        }
        a.recycle();
        return zzqk;
    }

    /* renamed from: k */
    public final String mo2703k() {
        Parcel a = m10545a(6, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo2704l() {
        Parcel a = m10545a(7, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: m */
    public final double mo2705m() {
        Parcel a = m10545a(8, t_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: n */
    public final String mo2706n() {
        Parcel a = m10545a(9, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo2707o() {
        Parcel a = m10545a(10, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: p */
    public final zzly mo2708p() {
        Parcel a = m10545a(11, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: s */
    public final String mo2711s() {
        Parcel a = m10545a(12, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: v */
    public final void mo2714v() {
        m10546b(13, t_());
    }

    /* renamed from: u */
    public final zzqg mo2713u() {
        zzqg zzqg;
        Parcel a = m10545a(14, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzqg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzqg) {
                zzqg = (zzqg) queryLocalInterface;
            } else {
                zzqg = new zzqi(readStrongBinder);
            }
        }
        a.recycle();
        return zzqg;
    }

    /* renamed from: a */
    public final void mo2691a(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        m10546b(15, t_);
    }

    /* renamed from: b */
    public final boolean mo2695b(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        bundle = m10545a(16, t_);
        boolean a = zzeo.m10552a(bundle);
        bundle.recycle();
        return a;
    }

    /* renamed from: c */
    public final void mo2696c(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        m10546b(17, t_);
    }

    /* renamed from: q */
    public final IObjectWrapper mo2709q() {
        Parcel a = m10545a(18, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final IObjectWrapper mo2710r() {
        Parcel a = m10545a(19, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: t */
    public final Bundle mo2712t() {
        Parcel a = m10545a(20, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo2694a(zzsc zzsc) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzsc);
        m10546b(21, t_);
    }

    /* renamed from: y */
    public final void mo2717y() {
        m10546b(22, t_());
    }

    /* renamed from: g */
    public final List mo2699g() {
        Parcel a = m10545a(23, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }

    /* renamed from: h */
    public final boolean mo2700h() {
        Parcel a = m10545a(24, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2693a(zzlu zzlu) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzlu);
        m10546b(25, t_);
    }

    /* renamed from: a */
    public final void mo2692a(zzlq zzlq) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzlq);
        m10546b(26, t_);
    }

    /* renamed from: w */
    public final void mo2715w() {
        m10546b(27, t_());
    }

    /* renamed from: x */
    public final void mo2716x() {
        m10546b(28, t_());
    }
}
