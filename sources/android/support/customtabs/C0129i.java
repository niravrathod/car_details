package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.customtabs.C0127g.C3031a;

/* renamed from: android.support.customtabs.i */
public interface C0129i extends IInterface {

    /* renamed from: android.support.customtabs.i$a */
    public static abstract class C3034a extends Binder implements C0129i {
        public IBinder asBinder() {
            return this;
        }

        public C3034a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo3721a(i, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                        i = C3031a.m14836a(parcel.readStrongBinder());
                        i2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo3722a(i, i2, bundle);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.customtabs.IPostMessageService");
            return true;
        }
    }

    /* renamed from: a */
    void mo3721a(C0127g c0127g, Bundle bundle);

    /* renamed from: a */
    void mo3722a(C0127g c0127g, String str, Bundle bundle);
}
