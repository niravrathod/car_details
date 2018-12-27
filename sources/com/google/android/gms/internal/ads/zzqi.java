package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class zzqi extends zzem implements zzqg {
    zzqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public final String mo2611a() {
        Parcel a = m10545a(2, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List<zzqk> mo2612b() {
        Parcel a = m10545a(3, t_());
        List b = zzeo.m10553b(a);
        a.recycle();
        return b;
    }
}
