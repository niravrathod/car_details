package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.youtube.player.internal.C2542m.C4173a.C4172a;
import com.google.android.youtube.player.internal.C2544o.C4175a;

/* renamed from: com.google.android.youtube.player.internal.p */
public interface C2545p extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.p$a */
    public static abstract class C4177a extends Binder implements C2545p {

        /* renamed from: com.google.android.youtube.player.internal.p$a$a */
        private static class C4176a implements C2545p {
            /* renamed from: a */
            private IBinder f17685a;

            C4176a(IBinder iBinder) {
                this.f17685a = iBinder;
            }

            /* renamed from: a */
            public final IBinder mo3294a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f17685a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C2544o mo3295a(C2542m c2542m) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeStrongBinder(c2542m != null ? c2542m.asBinder() : null);
                    this.f17685a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    C2544o a = C4175a.m22970a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3296a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z);
                    this.f17685a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17685a;
            }
        }

        /* renamed from: a */
        public static C2545p m22974a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2545p)) ? new C4176a(iBinder) : (C2545p) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder a;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                        a = mo3294a();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(a);
                        return true;
                    case 2:
                        C2542m c2542m;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                        a = parcel.readStrongBinder();
                        IBinder iBinder = null;
                        if (a == null) {
                            c2542m = null;
                        } else {
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                            c2542m = (queryLocalInterface == null || !(queryLocalInterface instanceof C2542m)) ? new C4172a(a) : (C2542m) queryLocalInterface;
                        }
                        C2544o a2 = mo3295a(c2542m);
                        parcel2.writeNoException();
                        if (a2 != null) {
                            iBinder = a2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                        mo3296a(parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IYouTubeService");
            return true;
        }
    }

    /* renamed from: a */
    IBinder mo3294a();

    /* renamed from: a */
    C2544o mo3295a(C2542m c2542m);

    /* renamed from: a */
    void mo3296a(boolean z);
}
