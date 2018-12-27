package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzyv extends zzem implements zzyt {
    zzyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public final void mo2786a() {
        m10546b(1, t_());
    }

    /* renamed from: b */
    public final void mo2793b() {
        m10546b(2, t_());
    }

    /* renamed from: a */
    public final void mo2787a(int i) {
        Parcel t_ = t_();
        t_.writeInt(i);
        m10546b(3, t_);
    }

    /* renamed from: c */
    public final void mo2794c() {
        m10546b(4, t_());
    }

    /* renamed from: d */
    public final void mo2795d() {
        m10546b(5, t_());
    }

    /* renamed from: e */
    public final void mo2796e() {
        m10546b(6, t_());
    }

    /* renamed from: a */
    public final void mo2790a(zzyw zzyw) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzyw);
        m10546b(7, t_);
    }

    /* renamed from: f */
    public final void mo2797f() {
        m10546b(8, t_());
    }

    /* renamed from: a */
    public final void mo2792a(String str, String str2) {
        Parcel t_ = t_();
        t_.writeString(str);
        t_.writeString(str2);
        m10546b(9, t_);
    }

    /* renamed from: a */
    public final void mo2789a(zzrg zzrg, String str) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzrg);
        t_.writeString(str);
        m10546b(10, t_);
    }

    /* renamed from: g */
    public final void mo2798g() {
        m10546b(11, t_());
    }

    /* renamed from: a */
    public final void mo2791a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(12, t_);
    }

    /* renamed from: h */
    public final void mo2799h() {
        m10546b(13, t_());
    }

    /* renamed from: a */
    public final void mo2788a(zzajk zzajk) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) zzajk);
        m10546b(14, t_);
    }

    /* renamed from: i */
    public final void mo2800i() {
        m10546b(15, t_());
    }
}
