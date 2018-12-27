package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@zzaer
@Class(creator = "AdDataParcelCreator")
public final class zzje extends AbstractSafeParcelable {
    public static final Creator<zzje> CREATOR = new zzjf();
    @Field(id = 1)
    /* renamed from: a */
    private final String f20202a;
    @Field(id = 2)
    /* renamed from: b */
    private final String f20203b;

    @Constructor
    public zzje(@Param(id = 1) String str, @Param(id = 2) String str2) {
        this.f20202a = str;
        this.f20203b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f20202a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f20203b, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
