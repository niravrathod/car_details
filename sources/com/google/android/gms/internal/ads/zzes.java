package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzes extends zzem implements zzeq {
    zzes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo2440a(IObjectWrapper iObjectWrapper, String str) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str);
        m10546b(2, t_);
    }

    /* renamed from: a */
    public final void mo2438a() {
        m10546b(3, t_());
    }

    /* renamed from: a */
    public final void mo2443a(int[] iArr) {
        iArr = t_();
        iArr.writeIntArray(null);
        m10546b(4, iArr);
    }

    /* renamed from: a */
    public final void mo2442a(byte[] bArr) {
        Parcel t_ = t_();
        t_.writeByteArray(bArr);
        m10546b(5, t_);
    }

    /* renamed from: a */
    public final void mo2439a(int i) {
        Parcel t_ = t_();
        t_.writeInt(i);
        m10546b(6, t_);
    }

    /* renamed from: b */
    public final void mo2444b(int i) {
        Parcel t_ = t_();
        t_.writeInt(i);
        m10546b(7, t_);
    }

    /* renamed from: a */
    public final void mo2441a(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        t_.writeString(str);
        t_.writeString(null);
        m10546b(8, t_);
    }
}
