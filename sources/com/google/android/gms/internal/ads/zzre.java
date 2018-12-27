package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzre extends zzem implements zzrc {
    zzre(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* renamed from: n */
    public final IObjectWrapper mo2659n() {
        Parcel a = m10545a(2, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final String mo2650e() {
        Parcel a = m10545a(3, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo2651f() {
        Parcel a = m10545a(4, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }

    /* renamed from: i */
    public final String mo2654i() {
        Parcel a = m10545a(5, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final zzqk mo2655j() {
        zzqk zzqk;
        Parcel a = m10545a(6, t_());
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
    public final String mo2656k() {
        Parcel a = m10545a(7, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo2657l() {
        Parcel a = m10545a(8, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final Bundle mo2660o() {
        Parcel a = m10545a(9, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: q */
    public final void mo2662q() {
        m10546b(10, t_());
    }

    /* renamed from: m */
    public final zzly mo2658m() {
        Parcel a = m10545a(11, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2647a(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        m10546b(12, t_);
    }

    /* renamed from: b */
    public final boolean mo2648b(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        bundle = m10545a(13, t_);
        boolean a = zzeo.m10552a(bundle);
        bundle.recycle();
        return a;
    }

    /* renamed from: c */
    public final void mo2649c(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        m10546b(14, t_);
    }

    /* renamed from: p */
    public final zzqg mo2661p() {
        zzqg zzqg;
        Parcel a = m10545a(15, t_());
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

    /* renamed from: g */
    public final IObjectWrapper mo2652g() {
        Parcel a = m10545a(16, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final String mo2653h() {
        Parcel a = m10545a(17, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
