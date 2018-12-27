package com.google.android.gms.internal.common;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class zzc {
    /* renamed from: a */
    private static final ClassLoader f9910a = zzc.class.getClassLoader();

    private zzc() {
    }

    /* renamed from: a */
    public static boolean m11327a(Parcel parcel) {
        return parcel.readInt() != null ? true : null;
    }

    /* renamed from: a */
    public static void m11326a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m11323a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m11325a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m11328b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(null);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: a */
    public static void m11324a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
