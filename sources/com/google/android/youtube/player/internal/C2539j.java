package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.j */
public interface C2539j extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.j$a */
    public static abstract class C4167a extends Binder implements C2539j {

        /* renamed from: com.google.android.youtube.player.internal.j$a$a */
        private static class C4166a implements C2539j {
            /* renamed from: a */
            private IBinder f17680a;

            C4166a(IBinder iBinder) {
                this.f17680a = iBinder;
            }

            /* renamed from: a */
            public final void mo3276a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f17680a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3277a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    obtain.writeString(str);
                    this.f17680a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17680a;
            }

            /* renamed from: b */
            public final void mo3278b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f17680a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3279b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    obtain.writeString(str);
                    this.f17680a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3280c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f17680a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo3281d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    this.f17680a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C4167a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo3276a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo3277a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo3278b();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo3280c();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo3281d();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                        mo3279b(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo3276a();

    /* renamed from: a */
    void mo3277a(String str);

    /* renamed from: b */
    void mo3278b();

    /* renamed from: b */
    void mo3279b(String str);

    /* renamed from: c */
    void mo3280c();

    /* renamed from: d */
    void mo3281d();
}
