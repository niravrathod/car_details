package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzyp extends zzem implements zzyn {
    zzyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public final zzyq mo2756a(String str) {
        zzyq zzyq;
        Parcel t_ = t_();
        t_.writeString(str);
        str = m10545a(1, t_);
        IBinder readStrongBinder = str.readStrongBinder();
        if (readStrongBinder == null) {
            zzyq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzyq) {
                zzyq = (zzyq) queryLocalInterface;
            } else {
                zzyq = new zzys(readStrongBinder);
            }
        }
        str.recycle();
        return zzyq;
    }

    /* renamed from: b */
    public final boolean mo2757b(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        str = m10545a(2, t_);
        boolean a = zzeo.m10552a(str);
        str.recycle();
        return a;
    }

    /* renamed from: c */
    public final zzaan mo2758c(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        str = m10545a(3, t_);
        zzaan a = zzaao.m21047a(str.readStrongBinder());
        str.recycle();
        return a;
    }
}
