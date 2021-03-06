package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zah extends zaa implements ISignInButtonCreator {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper newSignInButton(IObjectWrapper iObjectWrapper, int i, int i2) {
        Parcel zaa = zaa();
        zac.m11314a(zaa, (IInterface) iObjectWrapper);
        zaa.writeInt(i);
        zaa.writeInt(i2);
        iObjectWrapper = zaa(1, zaa);
        i = Stub.m20401a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return i;
    }

    public final IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) {
        Parcel zaa = zaa();
        zac.m11314a(zaa, (IInterface) iObjectWrapper);
        zac.m11315a(zaa, (Parcelable) signInButtonConfig);
        iObjectWrapper = zaa(2, zaa);
        signInButtonConfig = Stub.m20401a(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return signInButtonConfig;
    }
}
