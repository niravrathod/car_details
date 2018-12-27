package com.google.android.youtube.player.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.m */
public interface C2542m extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.m$a */
    public static abstract class C4173a extends Binder implements C2542m {

        /* renamed from: com.google.android.youtube.player.internal.m$a$a */
        private static class C4172a implements C2542m {
            /* renamed from: a */
            private IBinder f17683a;

            C4172a(IBinder iBinder) {
                this.f17683a = iBinder;
            }

            /* renamed from: a */
            public final void mo3286a(Bitmap bitmap, String str, boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(z);
                    obtain.writeInt(z2);
                    this.f17683a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3287a(String str, boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    obtain.writeString(str);
                    obtain.writeInt(z);
                    obtain.writeInt(z2);
                    this.f17683a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17683a;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                        Bitmap bitmap = parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null;
                        String readString = parcel.readString();
                        boolean z2 = parcel.readInt() != 0;
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3286a(bitmap, readString, z2, z);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                        String readString2 = parcel.readString();
                        boolean z3 = parcel.readInt() != 0;
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3287a(readString2, z3, z);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
            return true;
        }
    }

    /* renamed from: a */
    void mo3286a(Bitmap bitmap, String str, boolean z, boolean z2);

    /* renamed from: a */
    void mo3287a(String str, boolean z, boolean z2);
}
