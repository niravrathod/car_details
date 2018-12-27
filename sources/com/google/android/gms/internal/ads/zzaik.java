package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzaik extends zzem implements zzaii {
    zzaik(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo2266a() {
        m10546b(1, t_());
    }

    /* renamed from: b */
    public final void mo2269b() {
        m10546b(2, t_());
    }

    /* renamed from: c */
    public final void mo2270c() {
        m10546b(3, t_());
    }

    /* renamed from: d */
    public final void mo2271d() {
        m10546b(4, t_());
    }

    /* renamed from: a */
    public final void mo2268a(zzahy zzahy) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzahy);
        m10546b(5, t_);
    }

    /* renamed from: e */
    public final void mo2272e() {
        m10546b(6, t_());
    }

    /* renamed from: a */
    public final void mo2267a(int i) {
        Parcel t_ = t_();
        t_.writeInt(i);
        m10546b(7, t_);
    }

    /* renamed from: f */
    public final void mo2273f() {
        m10546b(8, t_());
    }
}
