package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzqm extends zzem implements zzqk {
    zzqm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final IObjectWrapper mo2615a() {
        Parcel a = m10545a(1, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final Uri mo2616b() {
        Parcel a = m10545a(2, t_());
        Uri uri = (Uri) zzeo.m10548a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: c */
    public final double mo2617c() {
        Parcel a = m10545a(3, t_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
