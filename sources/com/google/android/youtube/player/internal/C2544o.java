package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.o */
public interface C2544o extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.o$a */
    public static abstract class C4175a extends Binder implements C2544o {

        /* renamed from: com.google.android.youtube.player.internal.o$a$a */
        private static class C4174a implements C2544o {
            /* renamed from: a */
            private IBinder f17684a;

            C4174a(IBinder iBinder) {
                this.f17684a = iBinder;
            }

            /* renamed from: a */
            public final void mo3288a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f17684a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3289a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    obtain.writeString(str);
                    this.f17684a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3290a(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f17684a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17684a;
            }

            /* renamed from: b */
            public final void mo3291b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f17684a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3292c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f17684a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo3293d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                    this.f17684a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C2544o m22970a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2544o)) ? new C4174a(iBinder) : (C2544o) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                        mo3289a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                        mo3290a(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                        mo3288a();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                        mo3291b();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                        mo3292c();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                        mo3293d();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderService");
            return true;
        }
    }

    /* renamed from: a */
    void mo3288a();

    /* renamed from: a */
    void mo3289a(String str);

    /* renamed from: a */
    void mo3290a(String str, int i);

    /* renamed from: b */
    void mo3291b();

    /* renamed from: c */
    void mo3292c();

    /* renamed from: d */
    void mo3293d();
}
