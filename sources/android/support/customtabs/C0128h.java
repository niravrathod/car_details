package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.customtabs.C0127g.C3031a;
import java.util.List;

/* renamed from: android.support.customtabs.h */
public interface C0128h extends IInterface {

    /* renamed from: android.support.customtabs.h$a */
    public static abstract class C3033a extends Binder implements C0128h {

        /* renamed from: android.support.customtabs.h$a$a */
        private static class C3032a implements C0128h {
            /* renamed from: a */
            private IBinder f12778a;

            C3032a(IBinder iBinder) {
                this.f12778a = iBinder;
            }

            public IBinder asBinder() {
                return this.f12778a;
            }

            /* renamed from: a */
            public boolean mo65a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f12778a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo66a(C0127g c0127g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(c0127g != null ? c0127g.asBinder() : null);
                    boolean z = false;
                    this.f12778a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo69a(C0127g c0127g, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(c0127g != null ? c0127g.asBinder() : null);
                    c0127g = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f12778a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == null) {
                        c0127g = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return c0127g;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo64a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12778a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    str = obtain2.readInt() != null ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return str;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo70a(C0127g c0127g, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(c0127g != null ? c0127g.asBinder() : null);
                    c0127g = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12778a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == null) {
                        c0127g = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return c0127g;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo68a(C0127g c0127g, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(c0127g != null ? c0127g.asBinder() : null);
                    c0127g = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12778a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == null) {
                        c0127g = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return c0127g;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public int mo63a(C0127g c0127g, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(c0127g != null ? c0127g.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12778a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    c0127g = obtain2.readInt();
                    return c0127g;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo67a(C0127g c0127g, int i, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(c0127g != null ? c0127g.asBinder() : null);
                    obtain.writeInt(i);
                    c0127g = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f12778a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == null) {
                        c0127g = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return c0127g;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C3033a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* renamed from: a */
        public static C0128h m14845a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0128h)) {
                return new C3032a(iBinder);
            }
            return (C0128h) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = mo65a((long) parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = mo66a((C0127g) C3031a.m14836a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        i2 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : 0;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo69a((C0127g) i, (Uri) i2, bundle, (List) parcel.createTypedArrayList(Bundle.CREATOR));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo64a((String) i, bundle);
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo70a((C0127g) i, bundle);
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 7:
                        Uri uri;
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        i = mo68a((C0127g) i, uri);
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        i2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo63a(i, i2, bundle);
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        i2 = parcel.readInt();
                        Uri uri2 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo67a((C0127g) i, i2, uri2, bundle);
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
    }

    /* renamed from: a */
    int mo63a(C0127g c0127g, String str, Bundle bundle);

    /* renamed from: a */
    Bundle mo64a(String str, Bundle bundle);

    /* renamed from: a */
    boolean mo65a(long j);

    /* renamed from: a */
    boolean mo66a(C0127g c0127g);

    /* renamed from: a */
    boolean mo67a(C0127g c0127g, int i, Uri uri, Bundle bundle);

    /* renamed from: a */
    boolean mo68a(C0127g c0127g, Uri uri);

    /* renamed from: a */
    boolean mo69a(C0127g c0127g, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: a */
    boolean mo70a(C0127g c0127g, Bundle bundle);
}
