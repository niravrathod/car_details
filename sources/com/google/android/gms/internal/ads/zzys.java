package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzys extends zzem implements zzyq {
    zzys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: a */
    public final void mo2766a(IObjectWrapper iObjectWrapper, zzjo zzjo, zzjk zzjk, String str, zzyt zzyt) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(1, t_);
    }

    /* renamed from: a */
    public final IObjectWrapper mo2759a() {
        Parcel a = m10545a(2, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2763a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, zzyt zzyt) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(3, t_);
    }

    /* renamed from: b */
    public final void mo2771b() {
        m10546b(4, t_());
    }

    /* renamed from: c */
    public final void mo2772c() {
        m10546b(5, t_());
    }

    /* renamed from: a */
    public final void mo2767a(IObjectWrapper iObjectWrapper, zzjo zzjo, zzjk zzjk, String str, String str2, zzyt zzyt) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjo);
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(6, t_);
    }

    /* renamed from: a */
    public final void mo2764a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, String str2, zzyt zzyt) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10549a(t_, (IInterface) zzyt);
        m10546b(7, t_);
    }

    /* renamed from: d */
    public final void mo2773d() {
        m10546b(8, t_());
    }

    /* renamed from: e */
    public final void mo2774e() {
        m10546b(9, t_());
    }

    /* renamed from: a */
    public final void mo2762a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, zzajg zzajg, String str2) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        zzeo.m10549a(t_, (IInterface) zzajg);
        t_.writeString(str2);
        m10546b(10, t_);
    }

    /* renamed from: a */
    public final void mo2768a(zzjk zzjk, String str) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        m10546b(11, t_);
    }

    /* renamed from: f */
    public final void mo2775f() {
        m10546b(12, t_());
    }

    /* renamed from: g */
    public final boolean mo2776g() {
        Parcel a = m10545a(13, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2765a(IObjectWrapper iObjectWrapper, zzjk zzjk, String str, String str2, zzyt zzyt, zzpy zzpy, List<String> list) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        t_.writeString(str2);
        zzeo.m10549a(t_, (IInterface) zzyt);
        zzeo.m10550a(t_, (Parcelable) zzpy);
        t_.writeStringList(list);
        m10546b(14, t_);
    }

    /* renamed from: h */
    public final zzyz mo2777h() {
        zzyz zzyz;
        Parcel a = m10545a(15, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzyz = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzyz) {
                zzyz = (zzyz) queryLocalInterface;
            } else {
                zzyz = new zzzb(readStrongBinder);
            }
        }
        a.recycle();
        return zzyz;
    }

    /* renamed from: i */
    public final zzzc mo2778i() {
        zzzc zzzc;
        Parcel a = m10545a(16, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzzc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzzc) {
                zzzc = (zzzc) queryLocalInterface;
            } else {
                zzzc = new zzze(readStrongBinder);
            }
        }
        a.recycle();
        return zzzc;
    }

    /* renamed from: j */
    public final Bundle mo2779j() {
        Parcel a = m10545a(17, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: k */
    public final Bundle mo2780k() {
        Parcel a = m10545a(18, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo2781l() {
        Parcel a = m10545a(19, t_());
        Bundle bundle = (Bundle) zzeo.m10548a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo2769a(zzjk zzjk, String str, String str2) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzjk);
        t_.writeString(str);
        t_.writeString(str2);
        m10546b(20, t_);
    }

    /* renamed from: a */
    public final void mo2760a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(21, t_);
    }

    /* renamed from: m */
    public final boolean mo2782m() {
        Parcel a = m10545a(22, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2761a(IObjectWrapper iObjectWrapper, zzajg zzajg, List<String> list) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        zzeo.m10549a(t_, (IInterface) zzajg);
        t_.writeStringList(list);
        m10546b(23, t_);
    }

    /* renamed from: n */
    public final zzrg mo2783n() {
        Parcel a = m10545a(24, t_());
        zzrg a2 = zzrh.m21902a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo2770a(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }

    /* renamed from: o */
    public final zzly mo2784o() {
        Parcel a = m10545a(26, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final zzzf mo2785p() {
        zzzf zzzf;
        Parcel a = m10545a(27, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzzf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzzf) {
                zzzf = (zzzf) queryLocalInterface;
            } else {
                zzzf = new zzzh(readStrongBinder);
            }
        }
        a.recycle();
        return zzzf;
    }
}
