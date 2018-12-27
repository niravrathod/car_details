package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.i */
public interface C2538i extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.i$a */
    public static abstract class C4165a extends Binder implements C2538i {

        /* renamed from: com.google.android.youtube.player.internal.i$a$a */
        private static class C4164a implements C2538i {
            /* renamed from: a */
            private IBinder f17679a;

            C4164a(IBinder iBinder) {
                this.f17679a = iBinder;
            }

            /* renamed from: a */
            public final void mo3271a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    this.f17679a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3272a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    obtain.writeInt(i);
                    this.f17679a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3273a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    obtain.writeInt(z);
                    this.f17679a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17679a;
            }

            /* renamed from: b */
            public final void mo3274b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    this.f17679a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3275c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    this.f17679a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        mo3271a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        mo3274b();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        mo3275c();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        mo3273a(parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                        mo3272a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IPlaybackEventListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo3271a();

    /* renamed from: a */
    void mo3272a(int i);

    /* renamed from: a */
    void mo3273a(boolean z);

    /* renamed from: b */
    void mo3274b();

    /* renamed from: c */
    void mo3275c();
}
