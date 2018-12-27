package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.youtube.player.internal.C2535f.C4159a.C4158a;

/* renamed from: com.google.android.youtube.player.internal.l */
public interface C2541l extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.l$a */
    public static abstract class C4171a extends Binder implements C2541l {

        /* renamed from: com.google.android.youtube.player.internal.l$a$a */
        private static class C4170a implements C2541l {
            /* renamed from: a */
            private IBinder f17682a;

            C4170a(IBinder iBinder) {
                this.f17682a = iBinder;
            }

            /* renamed from: a */
            public final void mo3285a(C2535f c2535f, int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(c2535f != null ? c2535f.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17682a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17682a;
            }
        }

        /* renamed from: a */
        public static C2541l m22961a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2541l)) ? new C4170a(iBinder) : (C2541l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                C2535f c2535f;
                parcel.enforceInterface("com.google.android.youtube.player.internal.IServiceBroker");
                IBinder readStrongBinder = parcel.readStrongBinder();
                Bundle bundle = null;
                if (readStrongBinder == null) {
                    c2535f = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
                    c2535f = (queryLocalInterface == null || !(queryLocalInterface instanceof C2535f)) ? new C4158a(readStrongBinder) : (C2535f) queryLocalInterface;
                }
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo3285a(c2535f, readInt, readString, readString2, readString3, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.youtube.player.internal.IServiceBroker");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo3285a(C2535f c2535f, int i, String str, String str2, String str3, Bundle bundle);
}
