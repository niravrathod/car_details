package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "GassRequestParcelCreator")
public final class zzavg extends AbstractSafeParcelable {
    public static final Creator<zzavg> CREATOR = new zzavh();
    @VersionField(id = 1)
    /* renamed from: a */
    private final int f19937a;
    @Field(id = 2)
    /* renamed from: b */
    private final String f19938b;
    @Field(id = 3)
    /* renamed from: c */
    private final String f19939c;

    @Constructor
    zzavg(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) String str2) {
        this.f19937a = i;
        this.f19938b = str;
        this.f19939c = str2;
    }

    public zzavg(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19937a);
        SafeParcelWriter.writeString(parcel, 2, this.f19938b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f19939c, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
