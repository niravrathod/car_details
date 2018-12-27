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
@Class(creator = "StringParcelCreator")
@Reserved({1})
public final class zzagt extends AbstractSafeParcelable {
    public static final Creator<zzagt> CREATOR = new zzagu();
    @Field(id = 2)
    /* renamed from: a */
    String f19839a;

    @Constructor
    public zzagt(@Param(id = 2) String str) {
        this.f19839a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f19839a, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
