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
@Class(creator = "RewardedVideoAdRequestParcelCreator")
@Reserved({1})
public final class zzaio extends AbstractSafeParcelable {
    public static final Creator<zzaio> CREATOR = new zzaip();
    @Field(id = 2)
    /* renamed from: a */
    public final zzjk f19852a;
    @Field(id = 3)
    /* renamed from: b */
    public final String f19853b;

    @Constructor
    public zzaio(@Param(id = 2) zzjk zzjk, @Param(id = 3) String str) {
        this.f19852a = zzjk;
        this.f19853b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f19852a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f19853b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
