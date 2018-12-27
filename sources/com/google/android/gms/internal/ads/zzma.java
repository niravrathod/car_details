package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzma extends zzem implements zzly {
    zzma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo2552a() {
        m10546b(1, t_());
    }

    /* renamed from: b */
    public final void mo2555b() {
        m10546b(2, t_());
    }

    /* renamed from: a */
    public final void mo2554a(boolean z) {
        Parcel t_ = t_();
        zzeo.m10551a(t_, z);
        m10546b(true, t_);
    }

    /* renamed from: c */
    public final boolean mo2556c() {
        Parcel a = m10545a(4, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final int mo2557d() {
        Parcel a = m10545a(5, t_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final float mo2559f() {
        Parcel a = m10545a(6, t_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: g */
    public final float mo2560g() {
        Parcel a = m10545a(7, t_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo2553a(zzmb zzmb) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) zzmb);
        m10546b(8, t_);
    }

    /* renamed from: e */
    public final float mo2558e() {
        Parcel a = m10545a(9, t_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: i */
    public final boolean mo2562i() {
        Parcel a = m10545a(10, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final zzmb mo2561h() {
        zzmb zzmb;
        Parcel a = m10545a(11, t_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzmb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof zzmb) {
                zzmb = (zzmb) queryLocalInterface;
            } else {
                zzmb = new zzmd(readStrongBinder);
            }
        }
        a.recycle();
        return zzmb;
    }

    /* renamed from: j */
    public final boolean mo2563j() {
        Parcel a = m10545a(12, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }
}
