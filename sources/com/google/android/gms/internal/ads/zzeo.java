package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class zzeo {
    /* renamed from: a */
    private static final ClassLoader f9411a = zzeo.class.getClassLoader();

    private zzeo() {
    }

    /* renamed from: a */
    public static boolean m10552a(Parcel parcel) {
        return parcel.readInt() != null ? true : null;
    }

    /* renamed from: a */
    public static void m10551a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m10548a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m10550a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: b */
    public static void m10554b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(null);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: a */
    public static void m10549a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: b */
    public static ArrayList m10553b(Parcel parcel) {
        return parcel.readArrayList(f9411a);
    }
}
