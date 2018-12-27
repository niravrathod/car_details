package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.ads.zzaer;

@zzaer
@Class(creator = "InterstitialAdParameterParcelCreator")
@Reserved({1})
public final class zzaq extends AbstractSafeParcelable {
    public static final Creator<zzaq> CREATOR = new zzar();
    @Field(id = 4)
    /* renamed from: a */
    private final String f19580a;
    @Field(id = 2)
    public final boolean zzzr;
    @Field(id = 3)
    public final boolean zzzs;
    @Field(id = 5)
    public final boolean zzzu;
    @Field(id = 6)
    public final float zzzv;
    @Field(id = 7)
    public final int zzzw;
    @Field(id = 8)
    public final boolean zzzx;
    @Field(id = 9)
    public final boolean zzzy;
    @Field(id = 10)
    public final boolean zzzz;

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    @Constructor
    zzaq(@Param(id = 2) boolean z, @Param(id = 3) boolean z2, @Param(id = 4) String str, @Param(id = 5) boolean z3, @Param(id = 6) float f, @Param(id = 7) int i, @Param(id = 8) boolean z4, @Param(id = 9) boolean z5, @Param(id = 10) boolean z6) {
        this.zzzr = z;
        this.zzzs = z2;
        this.f19580a = str;
        this.zzzu = z3;
        this.zzzv = f;
        this.zzzw = i;
        this.zzzx = z4;
        this.zzzy = z5;
        this.zzzz = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzzr);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzzs);
        SafeParcelWriter.writeString(parcel, 4, this.f19580a, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzzu);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzzv);
        SafeParcelWriter.writeInt(parcel, 7, this.zzzw);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzzx);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzzy);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzzz);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
