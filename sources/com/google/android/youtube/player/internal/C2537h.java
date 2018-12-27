package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.h */
public interface C2537h extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.h$a */
    public static abstract class C4163a extends Binder implements C2537h {

        /* renamed from: com.google.android.youtube.player.internal.h$a$a */
        private static class C4162a implements C2537h {
            /* renamed from: a */
            private IBinder f17678a;

            C4162a(IBinder iBinder) {
                this.f17678a = iBinder;
            }

            /* renamed from: a */
            public final void mo3270a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    obtain.writeInt(z);
                    this.f17678a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17678a;
            }
        }

        public C4163a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IOnFullscreenListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                mo3270a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IOnFullscreenListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo3270a(boolean z);
}
