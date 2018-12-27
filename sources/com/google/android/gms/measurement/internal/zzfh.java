package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "UserAttributeParcelCreator")
public final class zzfh extends AbstractSafeParcelable {
    public static final Creator<zzfh> CREATOR = new zzfi();
    @Field(id = 2)
    /* renamed from: a */
    public final String f20681a;
    @Field(id = 3)
    /* renamed from: b */
    public final long f20682b;
    @Field(id = 7)
    /* renamed from: c */
    public final String f20683c;
    @Field(id = 1)
    /* renamed from: d */
    private final int f20684d;
    @Field(id = 4)
    /* renamed from: e */
    private final Long f20685e;
    @Field(id = 5)
    /* renamed from: f */
    private final Float f20686f;
    @Field(id = 6)
    /* renamed from: g */
    private final String f20687g;
    @Field(id = 8)
    /* renamed from: h */
    private final Double f20688h;

    zzfh(cm cmVar) {
        this(cmVar.f10571c, cmVar.f10572d, cmVar.f10573e, cmVar.f10570b);
    }

    zzfh(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f20684d = 2;
        this.f20681a = str;
        this.f20682b = j;
        this.f20683c = str2;
        if (obj == null) {
            this.f20685e = null;
            this.f20686f = null;
            this.f20688h = null;
            this.f20687g = null;
        } else if ((obj instanceof Long) != null) {
            this.f20685e = (Long) obj;
            this.f20686f = null;
            this.f20688h = null;
            this.f20687g = null;
        } else if ((obj instanceof String) != null) {
            this.f20685e = null;
            this.f20686f = null;
            this.f20688h = null;
            this.f20687g = (String) obj;
        } else if ((obj instanceof Double) != null) {
            this.f20685e = null;
            this.f20686f = null;
            this.f20688h = (Double) obj;
            this.f20687g = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @Constructor
    zzfh(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) Long l, @Param(id = 5) Float f, @Param(id = 6) String str2, @Param(id = 7) String str3, @Param(id = 8) Double d) {
        this.f20684d = i;
        this.f20681a = str;
        this.f20682b = j;
        this.f20685e = l;
        str = null;
        this.f20686f = null;
        if (i == 1) {
            if (f != null) {
                str = Double.valueOf(f.doubleValue());
            }
            this.f20688h = str;
        } else {
            this.f20688h = d;
        }
        this.f20687g = str2;
        this.f20683c = str3;
    }

    /* renamed from: a */
    public final Object m27328a() {
        if (this.f20685e != null) {
            return this.f20685e;
        }
        if (this.f20688h != null) {
            return this.f20688h;
        }
        return this.f20687g != null ? this.f20687g : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20684d);
        SafeParcelWriter.writeString(parcel, 2, this.f20681a, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f20682b);
        SafeParcelWriter.writeLongObject(parcel, 4, this.f20685e, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.f20687g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f20683c, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.f20688h, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
