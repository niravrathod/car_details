package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@zzaer
@Class(creator = "IconAdOptionsParcelCreator")
@Reserved({1})
public final class zzme extends AbstractSafeParcelable {
    public static final Creator<zzme> CREATOR = new zzmf();
    @Field(id = 2)
    /* renamed from: a */
    public final int f20242a;

    @Constructor
    public zzme(@Param(id = 2) int i) {
        this.f20242a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f20242a);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
