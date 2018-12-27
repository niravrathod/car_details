package com.google.android.gms.internal.config;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza implements IInterface {
    /* renamed from: a */
    private final IBinder f9916a;
    /* renamed from: b */
    private final String f9917b;

    protected zza(IBinder iBinder, String str) {
        this.f9916a = iBinder;
        this.f9917b = str;
    }

    /* renamed from: a */
    protected final Parcel m11334a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9917b);
        return obtain;
    }

    /* renamed from: a */
    protected final void m11335a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9916a.transact(8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9916a;
    }
}
