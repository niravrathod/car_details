package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

public final class av implements au {
    /* renamed from: a */
    private final IBinder f17740a;

    av(IBinder iBinder) {
        this.f17740a = iBinder;
    }

    /* renamed from: a */
    public final void mo3326a(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f17740a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f17740a;
    }
}
