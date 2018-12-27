package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.f */
public interface C2535f extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.f$a */
    public static abstract class C4159a extends Binder implements C2535f {

        /* renamed from: com.google.android.youtube.player.internal.f$a$a */
        private static class C4158a implements C2535f {
            /* renamed from: a */
            private IBinder f17676a;

            C4158a(IBinder iBinder) {
                this.f17676a = iBinder;
            }

            /* renamed from: a */
            public final void mo3226a(String str, IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IConnectionCallbacks");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    this.f17676a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17676a;
            }
        }

        public C4159a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                mo3226a(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IConnectionCallbacks");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo3226a(String str, IBinder iBinder);
}
