package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

public class zzs {
    /* renamed from: a */
    private static final ClassLoader f10152a = zzs.class.getClassLoader();

    private zzs() {
    }

    /* renamed from: a */
    public static boolean m11954a(Parcel parcel) {
        return parcel.readInt() != null ? true : null;
    }

    /* renamed from: a */
    public static void m11953a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m11950a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m11952a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m11951a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: b */
    public static HashMap m11955b(Parcel parcel) {
        return parcel.readHashMap(f10152a);
    }
}
