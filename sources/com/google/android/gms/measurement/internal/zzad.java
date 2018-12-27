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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "EventParcelCreator")
@Reserved({1})
public final class zzad extends AbstractSafeParcelable {
    public static final Creator<zzad> CREATOR = new zzae();
    @Field(id = 2)
    /* renamed from: a */
    public final String f20674a;
    @Field(id = 3)
    /* renamed from: b */
    public final zzaa f20675b;
    @Field(id = 4)
    /* renamed from: c */
    public final String f20676c;
    @Field(id = 5)
    /* renamed from: d */
    public final long f20677d;

    @Constructor
    public zzad(@Param(id = 2) String str, @Param(id = 3) zzaa zzaa, @Param(id = 4) String str2, @Param(id = 5) long j) {
        this.f20674a = str;
        this.f20675b = zzaa;
        this.f20676c = str2;
        this.f20677d = j;
    }

    zzad(zzad zzad, long j) {
        Preconditions.checkNotNull(zzad);
        this.f20674a = zzad.f20674a;
        this.f20675b = zzad.f20675b;
        this.f20676c = zzad.f20676c;
        this.f20677d = j;
    }

    public final String toString() {
        String str = this.f20676c;
        String str2 = this.f20674a;
        String valueOf = String.valueOf(this.f20675b);
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 21) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("origin=");
        stringBuilder.append(str);
        stringBuilder.append(",name=");
        stringBuilder.append(str2);
        stringBuilder.append(",params=");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20674a, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f20675b, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f20676c, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f20677d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
