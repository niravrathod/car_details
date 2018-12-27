package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

@KeepForSdk
@Class(creator = "ConfigurationCreator")
@Reserved({1})
public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    @KeepForSdk
    public static final Creator<Configuration> CREATOR = new zzc();
    @Field(id = 2)
    /* renamed from: a */
    private final int f20721a;
    @Field(id = 3)
    /* renamed from: b */
    private final zzi[] f20722b;
    @Field(id = 4)
    /* renamed from: c */
    private final String[] f20723c;
    /* renamed from: d */
    private final Map<String, zzi> f20724d = new TreeMap();

    @Constructor
    public Configuration(@Param(id = 2) int i, @Param(id = 3) zzi[] zziArr, @Param(id = 4) String[] strArr) {
        this.f20721a = i;
        this.f20722b = zziArr;
        for (zzi zzi : zziArr) {
            this.f20724d.put(zzi.f20740a, zzi);
        }
        this.f20723c = strArr;
        if (this.f20723c != null) {
            Arrays.sort(this.f20723c);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.f20721a - ((Configuration) obj).f20721a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.f20721a == configuration.f20721a && zzn.m12396a(this.f20724d, configuration.f20724d) && Arrays.equals(this.f20723c, configuration.f20723c)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.f20721a);
        stringBuilder.append(", ");
        stringBuilder.append("(");
        for (zzi append : this.f20724d.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        stringBuilder.append(", ");
        stringBuilder.append("(");
        if (this.f20723c != null) {
            for (String append2 : this.f20723c) {
                stringBuilder.append(append2);
                stringBuilder.append(", ");
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(")");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f20721a);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.f20722b, i, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f20723c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
