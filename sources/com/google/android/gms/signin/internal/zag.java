package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zag extends zaa implements zaf {
    zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo3199a(int i) {
        Parcel zaa = zaa();
        zaa.writeInt(i);
        zab(7, zaa);
    }

    /* renamed from: a */
    public final void mo3200a(IAccountAccessor iAccountAccessor, int i, boolean z) {
        Parcel zaa = zaa();
        zac.m11314a(zaa, (IInterface) iAccountAccessor);
        zaa.writeInt(i);
        zac.m11316a(zaa, z);
        zab(9, zaa);
    }

    /* renamed from: a */
    public final void mo3201a(zah zah, zad zad) {
        Parcel zaa = zaa();
        zac.m11315a(zaa, (Parcelable) zah);
        zac.m11314a(zaa, (IInterface) zad);
        zab(12, zaa);
    }
}
