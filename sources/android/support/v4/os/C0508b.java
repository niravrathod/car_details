package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.os.b */
public interface C0508b extends IInterface {

    /* renamed from: android.support.v4.os.b$a */
    public static abstract class C3155a extends Binder implements C0508b {

        /* renamed from: android.support.v4.os.b$a$a */
        private static class C3154a implements C0508b {
            /* renamed from: a */
            private IBinder f13292a;

            C3154a(IBinder iBinder) {
                this.f13292a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13292a;
            }

            /* renamed from: a */
            public void mo435a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13292a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C3155a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C0508b m15754a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0508b)) {
                return new C3154a(iBinder);
            }
            return (C0508b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo435a(parcel.readInt(), parcel.readInt() != null ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo435a(int i, Bundle bundle);
}
