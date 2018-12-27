package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.customtabs.g */
public interface C0127g extends IInterface {

    /* renamed from: android.support.customtabs.g$a */
    public static abstract class C3031a extends Binder implements C0127g {

        /* renamed from: android.support.customtabs.g$a$a */
        private static class C3030a implements C0127g {
            /* renamed from: a */
            private IBinder f12777a;

            C3030a(IBinder iBinder) {
                this.f12777a = iBinder;
            }

            public IBinder asBinder() {
                return this.f12777a;
            }

            /* renamed from: a */
            public void mo59a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12777a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo61a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12777a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo60a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12777a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo62b(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12777a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo58a(int i, Uri uri, boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12777a.transact(6, obtain, obtain2, 0);
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

        public C3031a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: a */
        public static C0127g m14836a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0127g)) {
                return new C3030a(iBinder);
            }
            return (C0127g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        i = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo59a(i, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        i = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo61a((String) i, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo60a(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        i = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo62b(i, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                        i = parcel.readInt();
                        i2 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : 0;
                        boolean z = parcel.readInt() != 0;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo58a(i, i2, z, bundle);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
    }

    /* renamed from: a */
    void mo58a(int i, Uri uri, boolean z, Bundle bundle);

    /* renamed from: a */
    void mo59a(int i, Bundle bundle);

    /* renamed from: a */
    void mo60a(Bundle bundle);

    /* renamed from: a */
    void mo61a(String str, Bundle bundle);

    /* renamed from: b */
    void mo62b(String str, Bundle bundle);
}
