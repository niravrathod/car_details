package com.android.p039a.p040a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.android.a.a.a */
public interface C1002a extends IInterface {

    /* renamed from: com.android.a.a.a$a */
    public static abstract class C3329a extends Binder implements C1002a {

        /* renamed from: com.android.a.a.a$a$a */
        private static class C3328a implements C1002a {
            /* renamed from: a */
            private IBinder f14150a;

            C3328a(IBinder iBinder) {
                this.f14150a = iBinder;
            }

            public IBinder asBinder() {
                return this.f14150a;
            }

            /* renamed from: a */
            public int mo879a(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f14150a.transact(1, obtain, obtain2, null);
                    obtain2.readException();
                    i = obtain2.readInt();
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo880a(int i, String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f14150a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo883a(int i, String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f14150a.transact(3, obtain, obtain2, null);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo881a(int i, String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f14150a.transact(4, obtain, obtain2, null);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public int mo886b(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f14150a.transact(5, obtain, obtain2, null);
                    obtain2.readException();
                    i = obtain2.readInt();
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public int mo888c(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f14150a.transact(6, obtain, obtain2, null);
                    obtain2.readException();
                    i = obtain2.readInt();
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo885a(int i, String str, List<String> list, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeStringList(list);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f14150a.transact(7, obtain, obtain2, null);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo884a(int i, String str, String str2, String str3, String str4, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f14150a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public Bundle mo882a(int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
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
                    this.f14150a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return i;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public int mo887b(int i, String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f14150a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt();
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C1002a m17123a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1002a)) {
                return new C3328a(iBinder);
            }
            return (C1002a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                Bundle bundle = null;
                int readInt;
                String readString;
                String readString2;
                String readString3;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = mo879a(parcel.readInt(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = parcel.readInt();
                        i2 = parcel.readString();
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo880a(i, (String) i2, readString4, bundle);
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = mo883a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = mo881a(parcel.readInt(), (String) parcel.readString(), parcel.readString(), (String) parcel.readString());
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = mo886b(parcel.readInt(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = mo888c(parcel.readInt(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = mo885a(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        readString2 = parcel.readString();
                        readString3 = parcel.readString();
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo884a(readInt, readString, readString2, readString3, readString5, bundle);
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        readInt = parcel.readInt();
                        readString = parcel.readString();
                        readString2 = parcel.readString();
                        readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo882a(readInt, readString, readString2, readString3, bundle);
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 10:
                        parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                        i = parcel.readInt();
                        i2 = parcel.readString();
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i = mo887b(i, i2, readString6, bundle);
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.android.vending.billing.IInAppBillingService");
            return true;
        }
    }

    /* renamed from: a */
    int mo879a(int i, String str, String str2);

    /* renamed from: a */
    Bundle mo880a(int i, String str, String str2, Bundle bundle);

    /* renamed from: a */
    Bundle mo881a(int i, String str, String str2, String str3);

    /* renamed from: a */
    Bundle mo882a(int i, String str, String str2, String str3, Bundle bundle);

    /* renamed from: a */
    Bundle mo883a(int i, String str, String str2, String str3, String str4);

    /* renamed from: a */
    Bundle mo884a(int i, String str, String str2, String str3, String str4, Bundle bundle);

    /* renamed from: a */
    Bundle mo885a(int i, String str, List<String> list, String str2, String str3, String str4);

    /* renamed from: b */
    int mo886b(int i, String str, String str2);

    /* renamed from: b */
    int mo887b(int i, String str, String str2, Bundle bundle);

    /* renamed from: c */
    int mo888c(int i, String str, String str2);
}
