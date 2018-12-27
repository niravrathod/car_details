package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.k */
public interface C2540k extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.k$a */
    public static abstract class C4169a extends Binder implements C2540k {

        /* renamed from: com.google.android.youtube.player.internal.k$a$a */
        private static class C4168a implements C2540k {
            /* renamed from: a */
            private IBinder f17681a;

            C4168a(IBinder iBinder) {
                this.f17681a = iBinder;
            }

            /* renamed from: a */
            public final void mo3282a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaylistEventListener");
                    this.f17681a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17681a;
            }

            /* renamed from: b */
            public final void mo3283b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaylistEventListener");
                    this.f17681a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3284c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaylistEventListener");
                    this.f17681a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C4169a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlaylistEventListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                        mo3282a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                        mo3283b();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                        mo3284c();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IPlaylistEventListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo3282a();

    /* renamed from: b */
    void mo3283b();

    /* renamed from: c */
    void mo3284c();
}
