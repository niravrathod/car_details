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
@Class(creator = "InstreamAdConfigurationParcelCreator")
@ParametersAreNonnullByDefault
public final class zzti extends AbstractSafeParcelable {
    public static final Creator<zzti> CREATOR = new zztj();
    @Field(id = 1)
    /* renamed from: a */
    public final int f20398a;

    @Constructor
    public zzti(@Param(id = 1) int i) {
        this.f20398a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20398a);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
