package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzmd extends zzem implements zzmb {
    zzmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: a */
    public final void mo2564a() {
        m10546b(1, t_());
    }

    /* renamed from: b */
    public final void mo2566b() {
        m10546b(2, t_());
    }

    /* renamed from: c */
    public final void mo2567c() {
        m10546b(3, t_());
    }

    /* renamed from: d */
    public final void mo2568d() {
        m10546b(4, t_());
    }

    /* renamed from: a */
    public final void mo2565a(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }
}
