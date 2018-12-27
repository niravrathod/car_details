package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@Class(creator = "RtbVersionInfoParcelCreator")
@ParametersAreNonnullByDefault
public final class zzaaz extends AbstractSafeParcelable {
    public static final Creator<zzaaz> CREATOR = new zzaba();
    @Field(id = 1)
    /* renamed from: a */
    private final int f19666a;
    @Field(id = 2)
    /* renamed from: b */
    private final int f19667b;
    @Field(id = 3)
    /* renamed from: c */
    private final int f19668c;

    /* renamed from: a */
    public static zzaaz m26151a(zzauw zzauw) {
        throw new NoSuchMethodError();
    }

    @Constructor
    zzaaz(@Param(id = 1) int i, @Param(id = 2) int i2, @Param(id = 3) int i3) {
        this.f19666a = i;
        this.f19667b = i2;
        this.f19668c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19666a);
        SafeParcelWriter.writeInt(parcel, 2, this.f19667b);
        SafeParcelWriter.writeInt(parcel, 3, this.f19668c);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    public final String toString() {
        int i = this.f19666a;
        int i2 = this.f19667b;
        int i3 = this.f19668c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(i2);
        stringBuilder.append(".");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
