package com.google.android.gms.internal.config;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

public class zzc {
    /* renamed from: a */
    private static final ClassLoader f9972a = zzc.class.getClassLoader();

    private zzc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m11424a(Parcel parcel, Creator<T> creator) {
        return parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static HashMap m11425a(Parcel parcel) {
        return parcel.readHashMap(f9972a);
    }

    /* renamed from: a */
    public static void m11426a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m11427a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
