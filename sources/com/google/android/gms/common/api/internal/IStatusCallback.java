package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends zab implements IStatusCallback {

        public static class zaa extends com.google.android.gms.internal.base.zaa implements IStatusCallback {
            zaa(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
            }

            public final void onResult(Status status) {
                Parcel zaa = zaa();
                zac.m11315a(zaa, (Parcelable) status);
                zac(1, zaa);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof IStatusCallback) {
                return (IStatusCallback) queryLocalInterface;
            }
            return new zaa(iBinder);
        }

        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onResult((Status) zac.m11313a(parcel, Status.CREATOR));
            return true;
        }
    }

    void onResult(Status status);
}
